package us.kbase.social.prepare;

import java.util.Arrays;
import java.util.Map;

import us.kbase.common.service.Tuple11;
import us.kbase.common.service.UObject;
import us.kbase.workspace.ObjectIdentity;
import us.kbase.workspace.ObjectSaveData;
import us.kbase.workspace.SaveObjectsParams;
import us.kbase.workspace.WorkspaceClient;

public class WsUtils {
	public static <T> T getObject(WorkspaceClient client, String ref, Class<T> type) throws Exception {
		return client.getObjects(Arrays.asList(new ObjectIdentity().withRef(ref))).get(0).getData().asClassInstance(type);
	}
	
	public static void saveObject(WorkspaceClient client, String wsName, String type, String objName, Object data) throws Exception {
		client.saveObjects(new SaveObjectsParams().withWorkspace(wsName)
				.withObjects(Arrays.asList(new ObjectSaveData()
				.withType(type).withName(objName).withData(new UObject(data)))));
	}
	
	@SuppressWarnings("unchecked")
	public static String getRefFromObjectInfo(Object objInfo) {
		Tuple11<Long, String, String, String, Long, String, Long, String, String, Long, Map<String,String>> info =
				(Tuple11<Long, String, String, String, Long, String, Long, String, String, Long, Map<String,String>>)objInfo;
		return info.getE7() + "/" + info.getE1() + "/" + info.getE5();
	}
}
