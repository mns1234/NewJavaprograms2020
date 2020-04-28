package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	//private static final String CONFIG_FILE="C:\\Users\\mshah\\eclipse-workspace\\AutomationFramework\\Resources\\config.properties";
	private static final String CONFIG_FILE="C:\\Users\\niles\\git\\NewJavaprograms2020\\AutomationFramework\\Resources\\config.properties";
	public String BROWSER;
	public String URL;
	
	
	public ConfigUtils() {
		Properties prop= new Properties();
		try {
			prop.load(new FileReader(CONFIG_FILE));
			BROWSER=(String) prop.get("browser");
			URL=(String) prop.get("url");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();}
		catch (IOException e) {
			e.printStackTrace();}
	
	}
	
	
	
	
}
