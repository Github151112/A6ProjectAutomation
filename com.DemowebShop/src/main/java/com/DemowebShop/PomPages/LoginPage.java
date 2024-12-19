package com.DemowebShop.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "RememberMe")
	private WebElement rememberCheckBox;

	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	// business logic
	public void loginInDemoWebShop(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberCheckBox.click();
		loginButton.click();
	}
	
	public void invalidloginInDemoWebShop(String email, String password) {
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		rememberCheckBox.click();
		loginButton.click();
		emailTextField.clear();
	}

}
