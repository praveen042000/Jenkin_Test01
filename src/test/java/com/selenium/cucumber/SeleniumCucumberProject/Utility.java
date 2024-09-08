package com.selenium.cucumber.SeleniumCucumberProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class Utility {
	public	String url, username, password;
	
	
	public Utility() {
		data();
	}
	public void data() {
		File file = new File("src\\test\\resource\\data.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url =prop.getProperty("url");
		username =prop.getProperty("username");
		password=prop.getProperty("password");


	}
}