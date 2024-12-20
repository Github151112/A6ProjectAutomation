package com.DemowebShop.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// register link
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;

	// login link
	@FindAll({ @FindBy(className = "ico-login"), @FindBy(linkText = "Log in") })
	private WebElement loginLink;
	
	@FindBy(className = "ico-logout")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

}
