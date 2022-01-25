package com.esite.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchProduct1 {
WebDriver ldriver;
	

	
	public SearchProduct1(WebDriver sdriver) {
		// TODO Auto-generated constructor stub
		this.ldriver=sdriver;
		PageFactory.initElements(sdriver, this);
	}

	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchfield;
	
	public WebElement SearchField() {
		return searchfield;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbuton;
	
	public void SearchButton() {
		searchbuton.click();	
	}
	
	
}

