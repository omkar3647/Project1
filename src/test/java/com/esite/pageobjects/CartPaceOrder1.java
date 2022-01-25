package com.esite.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPaceOrder1 {
WebDriver ldriver;
	
	public CartPaceOrder1(WebDriver cdriver)
	{
		this.ldriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(className="button[class='_2KpZ6l _2ObVJD _3AWRsL'] span")
	WebElement placeorder;
	
	
	public void Placeorder()
	{
		placeorder.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='REDMI 9i Sport (Metallic Blue, 64 GB)']")
	WebElement productincart;
	public String ProductinCart()
	{
		return productincart.getText();
	}
	
	///for time being Adding deleivery and payment here
	
	@FindBy(xpath="//button[normalize-space()='Deliver Here']")
	WebElement deliverhere;
	
	public void Delivery()
	{deliverhere.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='CONTINUE']")
	WebElement continuemail;
	public void ContinueMail()
	{continuemail.click();
	}
	
		
	

	
}


