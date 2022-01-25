package com.esite.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.esite.utitlities.ReadConfig;

public class BaseClass1 {
	public static Logger log= LogManager.getLogger(BaseClass1.class.getName());
	public static WebDriver driver;
	ReadConfig rdc=new ReadConfig();
	public String Baseurl=rdc.ApplicationURL();
	public String Baseusername=rdc.LoginUserName();
	public String Basepassword=rdc.LoginPassword();
	public String prodsearched;
	public String prodsearchednewWind;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String brow)
	{
		if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rdc.ChromeBrowser());
			driver=new ChromeDriver();
			log.info("Chrome Invoked");
		}
		/*
		else if(brow.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",rdc.FirefoxBrowser());
			driver=new FirefoxDriver();
		}
		*/
		else if(brow.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",rdc.EdgeBrowser());
			driver=new EdgeDriver();
			log.info("Edge Invoked");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
