package com.juaracoding.SALESINDO.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.SALESINDO.drivers.DriverSingleton;

public class Dashboard {

private WebDriver driver;
	
	public Dashboard() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[2]/li[2]/a/span")
	WebElement btnDashboard;
	
	@FindBy(linkText = "View Detail")
	WebElement txtViewDetail;
	
	public void goToMenuDashboard() {
		btnDashboard.click();
	}
	
	public String getTxtViewDetail() {
		return txtViewDetail.getText();
	}
	
	
}
