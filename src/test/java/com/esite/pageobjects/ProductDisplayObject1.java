package com.esite.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayObject1 {
WebDriver ldriver;
	

	
	public ProductDisplayObject1(WebDriver pddriver) {
		// TODO Auto-generated constructor stub
		this.ldriver=pddriver;
		PageFactory.initElements(pddriver, this);
	}
	
	@FindBy(xpath="//div[normalize-space()='REDMI 9i Sport (Metallic Blue, 64 GB)']")
	WebElement productdisplay;
	
	public String ProductDisplay()
	{
		String searchedproductresultname=productdisplay.getText();
		return searchedproductresultname;
	}
	
	@FindBy(xpath="//div[normalize-space()='REDMI 9i Sport (Metallic Blue, 64 GB)']")
	WebElement selectedproduct;
	
	public void SelectProduct()
	{
		selectedproduct.click();
	}
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	WebElement selectedproductOpenedNewWindow;
	public String ProductDisplayNewWindow()
	{
		String productdisplaynewWindow=selectedproductOpenedNewWindow.getText();
		return productdisplaynewWindow;
	}
	
	@FindBy(className="_2KpZ6l _2U9uOA _3v1-ww")
	WebElement add2cart;
	public void AddToCart()
	{
		add2cart.click();
	}
	
}
