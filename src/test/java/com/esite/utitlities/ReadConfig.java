package com.esite.utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop= new Properties();
	public ReadConfig()
	{
	
	File src=new File("Configurations//config.properties");
	
	try {
		FileInputStream fip=new FileInputStream(src);
		prop.load(fip);
		
		}
	catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
	catch(IOException e)
		{
		e.printStackTrace();
		}
	
	
	}
	public String ApplicationURL()
		{
		// TODO Auto-generated method stub
		String ApplURL=prop.getProperty("url");
		return ApplURL;
		
		}
	public String LoginUserName()
	{
	// TODO Auto-generated method stub
	String LoginUname=prop.getProperty("username");
	return LoginUname;
	
	}
	public String LoginPassword()
	{
	// TODO Auto-generated method stub
	String Loginpassword=prop.getProperty("password");
	return Loginpassword;
	
	}
	public String ChromeBrowser()
	{
	// TODO Auto-generated method stub
	String Chrome=prop.getProperty("chromepath");
	return Chrome;
	
	}
	public String FirefoxBrowser()
	{
	// TODO Auto-generated method stub
	String Firefox=prop.getProperty("firefoxpath");
	return Firefox;
	
	}
	
	public String EdgeBrowser()
	{
	// TODO Auto-generated method stub
	String Edge=prop.getProperty("edgepath");
	return Edge;
	
	}
	
	public String Product()
	{
	String productname=prop.getProperty("product");
	return productname;
	}

}
