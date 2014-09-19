package us.kbase.social.prepare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import us.kbase.auth.AuthService;
import us.kbase.auth.AuthToken;
import us.kbase.auth.UserDetail;
import us.kbase.common.service.Tuple9;
import us.kbase.userinfo.AppInfo;
import us.kbase.userinfo.AppUsage;
import us.kbase.workspace.GetModuleInfoParams;
import us.kbase.workspace.ListModulesParams;
import us.kbase.workspace.ListObjectsParams;
import us.kbase.workspace.ListWorkspaceInfoParams;
import us.kbase.workspace.WorkspaceClient;

public class NarrativeWidgetHeaderParser {
	private static final String narrativeGitRepoUrl = "https://github.com/kbase/narrative";
	private static final String narrativeRootFilePath = "src/notebook/ipython_profiles/profile_narrative/kbase_templates/static/kbase";
	
	public static void main(String[] args) throws Exception {
		//checkWs();
		//listEmails();
		process();
	}
	
	private static void process() throws Exception {
		WorkspaceClient wc = client();
		Map<String, String> emailToUser = loadEmailToUserMapFromGlobus(wc);
		File root = new File("../narrative/" + narrativeRootFilePath);
		//File serviceJson = new File(root, "service.json");
		processFiles(root, "", wc, Config.wsName(), emailToUser);
	}
	
	private static void processFiles(File f, String relPath, WorkspaceClient wc, String wsName,
			Map<String, String> emailToUser) throws Exception {
		if (f.isDirectory()) {
			for (File sub : f.listFiles())
				processFiles(sub, relPath + "/" + sub.getName(), wc, wsName, emailToUser);
		} else {
			BufferedReader br = new BufferedReader(new FileReader(f));
			StringBuilder header = null;
			Map<String, String> props = new TreeMap<String, String>();
			try {
				while (true) {
					String l = br.readLine();
					if (l == null)
						break;
					l = l.trim();
					if (l.isEmpty())
						continue;
					if (header == null) {
						if (l.trim().startsWith("/**")) {
							header = new StringBuilder();
							l = l.substring(3).trim();
							if (!l.isEmpty())
								appendToHeader(header, l);
						} else {
							//System.err.println("Wrong header format in " + f + ": " + l);
							break;
						}
					} else {
						if (l.endsWith("*/")) {
							break;
						} else {
							if (l.startsWith("*"))
								l = l.substring(1);
							if (l.trim().startsWith("@")) {
								String key = l.trim().substring(1);
								String value = "";
								int pos = key.indexOf(' ');
								if (pos > 0) {
									value = key.substring(pos + 1).trim();
									key = key.substring(0, pos);
									props.put(key, value);
								}
							} else {
								appendToHeader(header, l);
							}
						}
					}
				}
			} catch (Exception ex) {
				br.close();
			}
			if (header != null) {
				String author = props.get("author");
				String widget = props.get("widget");
				String since = props.get("since");
				if (author != null && widget != null && since != null) {
					String[] parts = author.split(",");
					List<String> authorUserIds = new ArrayList<String>();
					for (String part : parts) {
						if (part.contains("<") && part.contains(">"))
							part = part.substring(part.indexOf('<') + 1, part.indexOf('>')).trim();
						String user = emailToUser.get(part);
						if (user == null)
							throw new IllegalStateException("Can't find user for email: " + part);
						authorUserIds.add(user);
					}
					long rank = (long)(100 * Math.random());
					String srcCodeUrl = narrativeGitRepoUrl + "/" + narrativeRootFilePath + relPath;
					AppUsage usage = new AppUsage().withNUsersInstalled((long)(500 * Math.random()))
							.withNTimesRun((long)(100000 * Math.random()));
					AppInfo ai = new AppInfo().withName("Widget " + widget).withDescription(header.toString())
							.withVersion("1.0").withAuthorUserIds(authorUserIds).withReleaseDate(since)
							.withRank(rank).withScreenshots(new ArrayList<String>()).withSrcCodeUrl(srcCodeUrl)
							.withExampleNarratives(new ArrayList<String>()).withUsage(usage);
					System.out.println("File [" + f + "] " + ai);
					WsUtils.saveObject(wc, wsName, "UserInfo.AppInfo", widget, ai);
				}
			}
		}
	}
	
	private static void appendToHeader(StringBuilder header, String line) {
		if (header.length() > 0)
			header.append("<br>");
		header.append(line);
	}
	
	private static void checkWs() throws Exception {
		WorkspaceClient wc = client();
		String wsName = Config.wsName();
		for (Object info : wc.listObjects(new ListObjectsParams().withWorkspaces(Arrays.asList(wsName)))) {
			System.out.println(info);
			String ref = WsUtils.getRefFromObjectInfo(info);
			AppInfo ai = WsUtils.getObject(wc, ref, AppInfo.class);
			System.out.println(ai);
		}
	}
	
	private static void listEmails() throws Exception {
		WorkspaceClient wc = client();
		Map<String, String> data = loadEmailToUserMapFromGlobus(wc);
		for (String email : data.keySet())
			System.out.println(email + "\t->\t" + data.get(email));
	}
	
	private static Map<String, String> loadEmailToUserMapFromGlobus(WorkspaceClient wc) throws Exception {
		Set<String> users = new TreeSet<String>();
		for (Tuple9<Long,String,String,String,Long,String,String,String,Map<String,String>> info : wc.listWorkspaceInfo(new ListWorkspaceInfoParams())) {
			//System.out.println(info);
			users.add(info.getE3());
		}
		for (String module : wc.listModules(new ListModulesParams())) {
			try {
				users.addAll(wc.getModuleInfo(new GetModuleInfoParams().withMod(module)).getOwners());
			} catch (Exception ex) {
				//System.err.println(ex.getMessage());
			}
		}
		users.add("teharrison");
		users.remove("xia");
		Map<String, UserDetail> data = AuthService.fetchUserDetail(new ArrayList<String>(users), wc.getToken());
		Map<String, String> ret = new TreeMap<String, String>();
		for (UserDetail ud : data.values()) {
			if (ret.containsKey(ud.getEmail())) {
				if (ud.getEmail().contains(ud.getUserName())) {
					//System.out.println("Warning! Username [" + ud.getUserName() + "] will overwrite old username " +
					//		"[" + ret.get(ud.getEmail()) + "] for email [" + ud.getEmail() + "]");
					ret.put(ud.getEmail(), ud.getUserName());
				} else {
					//System.err.println("User [" + ud.getUserName() + "] is skipped cause email " +
					//		"[" + ud.getEmail() + "] was already registered for [" + ret.get(ud.getEmail()) + "]");
				}
			} else {
				ret.put(ud.getEmail(), ud.getUserName());
			}
		}
		ret.put("chrisshenry@gmail.com", "chenry");
		return ret;
	}
	
	private static WorkspaceClient client() throws Exception {
		WorkspaceClient ret = new WorkspaceClient(new URL(Config.wsUrl()), new AuthToken(Config.token()));
		ret.setAuthAllowedForHttp(true);
		return ret;
	}
}
