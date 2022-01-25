package com.esite.testcases;

import org.testng.annotations.Test;

import com.esite.pageobjects.LoginPageObject1;

public class TestCase_Login1 extends BaseClass1 {

	@Test
	public void logintest() throws InterruptedException
	{
		driver.get(Baseurl);
		LoginPageObject1 lp1= new LoginPageObject1(driver);	
		lp1.Username(Baseusername);
		
		 lp1.Password(Basepassword);
		 Thread.sleep(3000);
		 lp1.LoginBtn();
		 Thread.sleep(5000);
	}
}
