package com.nykaa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;

public ReadConfig()

{
	 File src = new File("./Configurations/config.properties");
	 
	 try 
	 {	 
		 FileInputStream fis = new FileInputStream(src);
		 pro = new Properties();
		 pro.load(fis);
	 }catch (Exception e) {
		 System.out.println("Exception is "+e.getMessage());
		 
	 }
	 
}

	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;		
	}
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;		
	}
	public String getFirefoxpath()
	{
		String Firefoxpath = pro.getProperty("Firefoxpath");
		return Firefoxpath;		
	}
	public String getedgepath()
	{
		String edgepath = pro.getProperty("edgepath");
		return edgepath;		
	}
	public String getuser()
	{
		String userpath = pro.getProperty("user");
		return userpath;		
	}
	public String getpassword()
	{
		String passwordpath = pro.getProperty("password");
		return passwordpath;		
	}


}
