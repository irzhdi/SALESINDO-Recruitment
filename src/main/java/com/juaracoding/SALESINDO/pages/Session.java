package com.juaracoding.SALESINDO.pages;

import java.awt.AWTException;
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
	
	@FindBy(xpath = "//*[@id=\"data-table-session\"]/tbody/tr/td[5]/a/i")
	WebElement klikForce;
	
	@FindBy(css = "body > div > div > div > form > span")
	WebElement txtFormLogin;
	
	@FindBy(xpath = "//body")
	WebElement body;
	
	public void goToSession() {
		klikSession.click();
		tunggu();
		
	}
	public void goToForceLogout() {
		klikForce.click();
		tunggu();
		enter();
		tunggu();
		tunggu();
		
		
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
	public void enter() {
		 try
		    {
			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);  
		    }
		    catch (AWTException e)
		    {
		    e.printStackTrace();
		    }
		}
	}

	
	

