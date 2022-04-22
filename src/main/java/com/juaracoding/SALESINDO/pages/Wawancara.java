package com.juaracoding.SALESINDO.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.SALESINDO.drivers.DriverSingleton;

public class Wawancara {
	
	private WebDriver driver;
	
	public Wawancara() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Bucket")
	WebElement btnBucket;
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul[2]/li[3]/ul/li/a/span")
	WebElement btnWawancara;
	
	@FindBy(css = "#data-table-rto > tbody > tr:nth-child(1) > td:nth-child(1)")
	WebElement btnPlus;
	
	@FindBy(xpath = "//*[@id=\"data-table-rto\"]/tbody/tr[2]/td/ul/li/span[2]/a/i")
	WebElement btnAksi1;
	
	@FindBy(xpath = "//*[@id=\"data-table-rto\"]/tbody/tr[1]/td[8]/a/i")
	WebElement btnAksi2;
	
	@FindBy(id = "select2-Division-container")
	WebElement klikDivisi;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputDivisi;
	
	@FindBy(id = "select2-Position_Code_ID-container")
	WebElement klikPosisi;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputPosisi;
	
	@FindBy(id = "select2-Position_RTO-container")
	WebElement klikRTO;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputRTO;
	
	@FindBy(id = "select2-Recruiter_Source_ID-container")
	WebElement klikRecruiter;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputRecruiter;
	
	@FindBy(id = "select2-Reference_Code-container")
	WebElement klikReference;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputReference;
	
	@FindBy(id = "select2-Reference_Code-container")
	WebElement klikReference2;
	
	@FindBy(id = "select2-Reference_Code-result-qxf9-S3220411003")
	WebElement inputReference2;
	
	@FindBy(id = "FaceBook")
	WebElement Facebook;
	
	@FindBy(id = "Twitter")
	WebElement Twitter;
	
	@FindBy(id = "Instagram")
	WebElement Instagram;
	
	@FindBy(xpath = "//tbody[1]/tr[1]/td[6]/div/input")
	WebElement klikTab1;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[2]/td[6]/div/label")
	WebElement klikTab2;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[3]/td[6]/div/label")
	WebElement klikTab3;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[4]/td[6]/div/label")
	WebElement klikTab4;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[5]/td[6]/div/label")
	WebElement klikTab5;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[6]/td[6]/div/label")
	WebElement klikTab6;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[7]/td[6]/div/label")
	WebElement klikTab7;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[8]/td[6]/div/label")
	WebElement klikTab8;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[9]/td[6]/div")
	WebElement klikTab9;
	
	@FindBy(xpath = "//table[@id=' ']/tbody/tr[9]/td[6]/div/label")
	WebElement klikTab10;
	
	@FindBy(id = "select2-hasil-container")
	WebElement klikHasil;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputHasil;
	
	@FindBy(name = "submit")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement txtVerifikasiData;
	
	public void goToMenuWawancara() {
		btnBucket.click();
		btnWawancara.click();
	}
	
//	public void goToButtonPlus() {
//		btnPlus.click();
//		tunggu();
//	}
	public void goToButtonAksi() {
		tunggu();
		btnPlus.click();
		btnAksi1.click();
//		btnAksi2.click();
		tunggu();
	}
	public void goToFormWawancara() {
		klikDivisi.click();
		inputDivisi.sendKeys("opera");
		inputDivisi.sendKeys(Keys.ENTER);
		klikPosisi.click();
		inputPosisi.sendKeys("opera");

		inputPosisi.sendKeys(Keys.ENTER);
		klikRTO.click();
		inputRTO.sendKeys("team");
		inputRTO.sendKeys(Keys.ENTER);
		klikRecruiter.click();
		inputRecruiter.sendKeys("ins");
	
		inputRecruiter.sendKeys(Keys.ENTER);
		
		klikReference.click();
		inputReference.sendKeys("elva");
		inputReference.sendKeys(Keys.ENTER);
		Facebook.click();
		Facebook.sendKeys("xx");
		Twitter.click();
		Twitter.sendKeys("xx");
		Instagram.click();
		scroll();
		Instagram.sendKeys("x");	
		
		WebElement radioBtn1 = driver.findElement(By.id("txt_id13"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn1);
		
		WebElement radioBtn2 = driver.findElement(By.id("txt_id23"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn2);
		
		WebElement radioBtn3 = driver.findElement(By.id("txt_id33"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn3);
		
		WebElement radioBtn4 = driver.findElement(By.id("txt_id43"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn4);
		
		WebElement radioBtn5 = driver.findElement(By.id("txt_id53"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn5);
		
		WebElement radioBtn6 = driver.findElement(By.id("txt_id62"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn6);
		
		WebElement radioBtn7 = driver.findElement(By.id("txt_id73"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn7);
		
		WebElement radioBtn8 = driver.findElement(By.id("txt_id83"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn8);
		
		WebElement radioBtn9 = driver.findElement(By.id("txt_id93"));
		((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn9);

		klikHasil.click();
		inputHasil.sendKeys("lolos");
		inputHasil.sendKeys(Keys.ENTER);
		tunggu();
		btnSubmit.click();
		tunggu();
	}
	public String getTxtVerifikasiData() {
		return txtVerifikasiData.getText();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scroll() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,600)");
	}
	

}
