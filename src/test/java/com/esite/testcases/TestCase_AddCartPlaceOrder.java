package com.esite.testcases;

import org.testng.annotations.Test;

import com.esite.pageobjects.CartPaceOrder1;
import com.esite.pageobjects.ProductDisplayObject1;

public class TestCase_AddCartPlaceOrder  extends BaseClass1 {
	
	
	@Test
	public void AddCart()
	{
		
		
		CartPaceOrder1 po1=new CartPaceOrder1(driver);
		String prodsearchednewWind=po1.ProductinCart();
		
		po1.Placeorder();
		po1.Delivery();
		po1.ContinueMail();
		

}
}
