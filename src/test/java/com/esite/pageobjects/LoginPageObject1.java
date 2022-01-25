package com.esite.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageObject1 {
WebDriver ldriver;
	
	public LoginPageObject1(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
WebElement username;

public void Username(String uname) {
	   username.sendKeys(uname);
}

@FindBy(xpath="//input[@type='password']")
WebElement password;

public void Password(String pswd) {
	 password.sendKeys(pswd);
}


@FindBy(css="button[type='submit'] span")
WebElement login;

public void LoginBtn() {
	 login.click();
}



}
