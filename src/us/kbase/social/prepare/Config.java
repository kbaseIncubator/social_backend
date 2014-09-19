package us.kbase.social.prepare;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import us.kbase.auth.AuthService;

public class Config {
	private static final File defaultConfigFile = new File("config.cfg");

	public static String token() throws Exception {
		Properties props = props(defaultConfigFile);
		return AuthService.login(get(props, "user"), get(props, "password")).getToken().toString();
	}

	public static String wsUrl() throws Exception {
		return get(props(defaultConfigFile), "ws.url");
	}

	public static String wsName() throws Exception {
		return get(props(defaultConfigFile), "ws.name");
	}
	
	private static String get(Properties props, String propName) {
		String ret = props.getProperty(propName);
		if (ret == null)
			throw new IllegalStateException("Property is not defined: " + propName);
		return ret;
	}

	private static Properties props(File configFile) throws Exception {
		Properties props = new Properties();
		InputStream is = new FileInputStream(configFile);
		props.load(is);
		is.close();
		return props;
	}

}
