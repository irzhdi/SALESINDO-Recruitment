package com.juaracoding.SALESINDO.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.SALESINDO.drivers.DriverSingleton;

public class JadwalTraining {
	
private WebDriver driver;
	
	public JadwalTraining() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "select2-Employee_Type-container")
	WebElement klikEmployee;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputEmployee;
	
	@FindBy(id = "select2-Departement-container")
	WebElement klikDepartement;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputDepartement;
	
	@FindBy(id = "select2-Division-container")
	WebElement klikDivision;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputDivision;
	
	@FindBy(id = "select2-Branch-container")
	WebElement klikBranch;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputBranch;
	
	@FindBy(id = "select2-Position-container")
	WebElement klikPosition;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputPosition;
	
	@FindBy(id = "select2-Channel-container")
	WebElement klikChannel;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputChannel;
	
	@FindBy(id = "select2-Group_Type-container")
	WebElement klikGroup;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputGroup;
	
	@FindBy(id = "select2-Level-container")
	WebElement klikLevel;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputLevel;
	
	@FindBy(id = "select2-Product-container")
	WebElement klikProduct;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputProduct;
	
	@FindBy(id = "select2-Sales_Mode-container")
	WebElement klikSales;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputSales;
	
	@FindBy(name = "Training_Date")
	WebElement klikTrainingDate;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[26]")
	WebElement klikTanggal;
	
	@FindBy(name = "submit")
	WebElement klikSubmit;
	
	@FindBy(xpath = "//div[@id='alert']/strong")
	WebElement txtSukses;
	
	
	public void goToMenuJadwalTraining() {
		klikEmployee.click();
		inputEmployee.sendKeys("pkwt");
		inputEmployee.sendKeys(Keys.ENTER);
		klikDepartement.click();
		inputDepartement.sendKeys("finance");
		inputDepartement.sendKeys(Keys.ENTER);
		klikDivision.click();
		inputDivision.sendKeys("operational");
		inputDivision.sendKeys(Keys.ENTER);
		klikBranch.click();
		inputBranch.sendKeys("bandung");
		inputBranch.sendKeys(Keys.ENTER);
		klikPosition.click();
		inputPosition.sendKeys("team leader");
		inputPosition.sendKeys(Keys.ENTER);
		klikChannel.click();
		inputChannel.sendKeys("retail");
		inputChannel.sendKeys(Keys.ENTER);
		klikGroup.click();
		inputGroup.sendKeys("community");
		inputGroup.sendKeys(Keys.ENTER);
		klikLevel.click();
		inputLevel.sendKeys("executive");
		inputLevel.sendKeys(Keys.ENTER);
		klikProduct.click();
		inputProduct.sendKeys("cc");
		inputProduct.sendKeys(Keys.ENTER);
		klikSales.click();
		inputSales.sendKeys("direct sales");
		inputSales.sendKeys(Keys.ENTER);
		klikTrainingDate.click();
		klikTanggal.click();
		tunggu();
		klikSubmit.click();
		tunggu();

	}
	
	public String getTxtSukses() {
		return txtSukses.getText();
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



