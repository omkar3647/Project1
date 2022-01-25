package com.esite.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.esite.pageobjects.ProductDisplayObject1;

import junit.framework.Assert;

public class TestCase_ProductDisplayPage extends BaseClass1 {
	//public String prodsearched;
	//public String prodsearchednewWind;
	@Test
	public void ProductResults()
	{
		ProductDisplayObject1 pd1=new ProductDisplayObject1(driver);
		prodsearched=pd1.ProductDisplay();
	    String mainWindowHandle = driver.getWindowHandle();
		pd1.SelectProduct();
	
	
	//Get handles of the windows

    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();
    while (iterator.hasNext()) 
    {
        String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
            {
            driver.switchTo().window(ChildWindow);
            prodsearchednewWind=pd1.ProductDisplayNewWindow();
            System.out.println("Heading of child window is " + 	driver.getTitle());
            pd1.AddToCart();
            
            }
    }
	
}
}
