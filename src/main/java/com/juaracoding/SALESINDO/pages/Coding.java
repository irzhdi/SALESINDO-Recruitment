package com.juaracoding.SALESINDO.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.SALESINDO.drivers.DriverSingleton;

public class Coding {
	private WebDriver driver;
	
	public Coding() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='sidebar']/div/div/ul[2]/li[3]/ul/li[4]/a/span")
	WebElement btnCoding;
	
	@FindBy(xpath = "//table[@id='data-table-hrd']/tbody/tr/td")
	WebElement btnPlus;
	
	@FindBy(xpath = "xpath=//table[@id='data-table-hrd']/tbody/tr/td[11]/a/i")
	WebElement btnAksi;
	
	@FindBy(xpath = "//div[@id='content']/div/div/div/div[2]/div/button")
	WebElement btnEdit;
	
	@FindBy(id = "Position")
	WebElement editPosition;
	
	@FindBy(id = "Channel")
	WebElement editChannel;
	
	@FindBy(id = "BSH_Code")
	WebElement editBSH;
	
	@FindBy(id = "btnUpdateStructure")
	WebElement btnUpdate;
	
	@FindBy(name = "Checklist_ID[]")
	WebElement btnCheckId;
	
	@FindBy(xpath = "//form[@id='form_submit']/div[6]/div/table/tbody/tr[2]/td/input")
	WebElement btnCheck1;
	
	@FindBy(xpath = "//form[@id='form_submit']/div[6]/div/table/tbody/tr[3]/td/input")
	WebElement btnCheck2;
	
	@FindBy(xpath = "//form[@id='form_submit']/div[6]/div/table/tbody/tr[4]/td/input")
	WebElement btnCheck3;
	
	@FindBy(name = "Validation_Remark")
	WebElement btnValid;
	
	@FindBy(id = "btnConfirm")
	WebElement btnConfirm;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement txtGenerateCoding;
	
	public void goToCoding() {
		tunggu();
		btnCoding.click();
		btnAksi.click();
		tunggu();
		btnEdit.click();
		editPosition.click();
		new Select(editPosition).selectByVisibleText("Team Leader");
		editChannel.click();
		new Select(editChannel).selectByVisibleText("Pemol");
		editBSH.click();
		new Select(editBSH).selectByVisibleText("SANTI WIDYAWATIK");
		btnUpdate.click();
		btnCheckId.click();
		btnCheck1.click();
		btnCheck2.click();
		btnCheck3.click();
		btnValid.click();
		btnValid.sendKeys("confirm");
		btnConfirm.click();
		tunggu();
	
		
	}
		
		public String getTxtGenerateCoding() {
			return txtGenerateCoding.getText();	
		
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