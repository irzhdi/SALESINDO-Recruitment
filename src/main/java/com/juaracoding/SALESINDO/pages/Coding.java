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
	
	@FindBy(css = "#data-table-hrd > tbody > tr:nth-child(1) > td:nth-child(1)")
	WebElement btnPlus;
	
	@FindBy(xpath = "//*[@id=\"data-table-hrd\"]/tbody/tr[2]/td/ul/li/span[2]/a/i")
	WebElement btnAksi1;
	
	@FindBy(xpath = "//*[@id=\"data-table-hrd\"]/tbody/tr[1]/td[11]/a/i")
	WebElement btnAksi2;
	
	@FindBy(xpath = "//div[@id='content']/div/div/div/div[2]/div/button")
	WebElement btnEdit;
	
	@FindBy(id = "Division")
	WebElement editDivision;
	
	@FindBy(id = "Departement")
	WebElement editDepartement;
	
	@FindBy(id = "Branch")
	WebElement editBranch;
	
	@FindBy(id = "Position")
	WebElement editPosition;
	
	@FindBy(id = "Employee_Type")
	WebElement editEmployee_Type;
	
	@FindBy(id = "Channel")
	WebElement editChannel;
	
	@FindBy(id = "Group_Type")
	WebElement editGroup_Type;
	
	@FindBy(id = "Level")
	WebElement editLevel;
	
	@FindBy(id = "Product")
	WebElement editProduct;
	
	@FindBy(id = "Sales_Mode")
	WebElement editSales_Mode;
	
	@FindBy(id = "SM_Code")
	WebElement editSM_Code;
	
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
		tunggu();
		btnPlus.click();
		btnAksi1.click();
		tunggu();
		btnEdit.click();
		tunggu();
		editDivision.click();
		new Select(editDivision).selectByVisibleText("Operational");
		
		editDepartement.click();
		new Select(editDepartement).selectByVisibleText("Finance");
		
		editBranch.click();
		new Select(editBranch).selectByVisibleText("BANDUNG");
		
		editPosition.click();
		new Select(editPosition).selectByVisibleText("Team Leader");
		
		editEmployee_Type.click();
		new Select(editEmployee_Type).selectByVisibleText("PKWT");
		
		editChannel.click();
		new Select(editChannel).selectByVisibleText("Pemol");
		
		editGroup_Type.click();
		new Select(editGroup_Type).selectByVisibleText("Retail");
		
		editLevel.click();
		new Select(editLevel).selectByVisibleText("Classy");
		
		editProduct.click();
		new Select(editProduct).selectByVisibleText("CC");
		
		editSales_Mode.click();
		new Select(editSales_Mode).selectByVisibleText("Direct Sales");
		
		
		editSM_Code.click();
		new Select(editSM_Code).selectByVisibleText("S1220401002 JULIANSAH");
		
		editBSH.click();
		new Select(editBSH).selectByVisibleText("SANTI WIDYAWATIK");
		tunggu();
		btnUpdate.click();
		tunggu();
		btnCheckId.click();
		btnCheck1.click();
		btnCheck2.click();
		btnCheck3.click();
		btnValid.click();
		btnValid.sendKeys("confirm");
		tunggu();
		btnConfirm.click();
		tunggu();
	
		
	}
		
		public String getTxtGenerateCoding() {
			return txtGenerateCoding.getText();	
		
	}
		public void tunggu() {
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
}