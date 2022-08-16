package com.OrangeHRM_Automation1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
	 private Properties prop;
	public PropertyHandling(String filePath) {
		prop = new Properties();
		try {
			//get the read access of provided file
		FileInputStream input = new FileInputStream(filePath);
		//load the inputStream class object into properties class to access all
		//Properties
		prop.load(input);
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//get the property from config.properties file based on the provided key
	//@param key
	
	public String getProperty(String key) {
		return prop.getProperty(key);
		
	}

}
