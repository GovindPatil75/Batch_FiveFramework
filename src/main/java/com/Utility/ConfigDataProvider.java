package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws Exception {
		String filepath="C:\\Users\\Dell\\eclipse-workspace\\Framework_BatchFive\\Config\\config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getUrl() {
		return pro.getProperty("Url");
	}
}
