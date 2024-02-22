package appiumUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderr {
	Properties prop;
	public String path1;
	public String path;

	public String pathReaderr() {
		path1=System.getProperty("user.dir"+"\\resorurces\\app-release.apk");
		return path1;
	}
	public String url() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\resorurces\\appium.properties");
		prop=new Properties();
		prop.load(fis);
		path=prop.getProperty("url");
		return path;
	}

}

