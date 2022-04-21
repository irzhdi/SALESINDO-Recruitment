package com.juaracoding.SALESINDO.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.SALESINDO.drivers.DriverSingleton;

public class Session {

	private WebDriver driver;
	
	public Session() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul[2]/li[5]/a/span")
	WebElement klikSession;
	
	@FindBy(xpath = "//table[@id='data-table-session']/tbody/tr/td[5]/a/i")
	WebElement klikForce;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='x'])[1]/preceding::span[5]")
	WebElement txtFormLogin;
	
	@FindBy(xpath = "//body")
	WebElement body;
	
	public void goToSession() {
		klikSession.click();
		
	}
	public void goToForceLogout() {
		klikForce.click();
		body.sendKeys(Keys.ENTER);
		
	}
	public String getTxtFormLogin() {
		return txtFormLogin.getText();	
	
}
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
}
