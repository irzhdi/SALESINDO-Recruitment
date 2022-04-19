package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;	
	
	@FindBy(id = "button")
	WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement txtWelcome;
	
	public void submitLogin(String email, String password) {

		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
}
