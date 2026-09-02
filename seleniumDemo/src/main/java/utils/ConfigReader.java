package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		String filePath = "src/test/resources/config.properties";

		try {

			FileInputStream fis = new FileInputStream(filePath);

			prop = new Properties();

			prop.load(fis);

//			System.out.println(prop.getProperty("browser1"));
//			System.out.println(prop.getProperty("url"));
//			System.out.println(prop.getProperty("username"));
//			System.out.println(prop.getProperty("password"));

			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	/*
	 * public String getUserName() { return prop.getProperty("username"); }
	 * 
	 * public String getPassWord() { return prop.getProperty("password"); }
	 */

}
