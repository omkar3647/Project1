package com.esite.testcases;

import org.testng.annotations.Test;

import com.esite.pageobjects.LoginPageObject1;
import com.esite.pageobjects.SearchProduct1;

public class TestCase_Search1 extends BaseClass1 {
	
	@Test
	public void SearchProduct() throws InterruptedException
	{
		driver.get(Baseurl);
		LoginPageObject1 lp1= new LoginPageObject1(driver);	
		lp1.Username(Baseusername);
		
		 lp1.Password(Basepassword);
		 Thread.sleep(3000);
		 lp1.LoginBtn();
		 Thread.sleep(5000);
		 
		 SearchProduct1 sp1=new SearchProduct1(driver);
		 log.info("Searching product");
		 sp1.SearchField().sendKeys(rdc.Product());
		 
		 sp1.SearchButton();
		 log.debug("Searchedproduct");
		 Thread.sleep(5000);
	}

}
