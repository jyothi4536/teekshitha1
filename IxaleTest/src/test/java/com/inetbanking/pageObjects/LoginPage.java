package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement txtUserName;

	@FindBy(name = "password")
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	WebElement btnLogin;

	public void setUserName(String uname) {
		try {
			txtUserName.sendKeys(uname);
		} catch (Exception e) {
			System.out.println("username exception");
		}
		
	}

	public void setPassword(String pwd) {
		
		try {
			txtpassword.sendKeys(pwd);
		} catch (Exception e) {
			System.out.println("password exception");
		}
		
	}

	public void clickSubmit() {
		btnLogin.click();
	}

}
