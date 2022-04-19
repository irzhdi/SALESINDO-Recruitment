package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;


public class Verifikasi {
private WebDriver driver;
	
	public Verifikasi() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//div[@id='sidebar']/div/div/ul[2]/li[3]/ul/li[2]/a/span")
	WebElement btnVerifikasi;
	
	@FindBy(xpath="//table[@id='data-table-rto']/tbody/tr/td")
	WebElement btnPlus;
	
	@FindBy(xpath="//table[@id='data-table-rto']/tbody/tr[2]/td/ul/li/span[2]/a/i")
	WebElement btnAksi;
	
	@FindBy(id = "btnEdit")
	WebElement btnEdit;
	
	@FindBy(id = "Name")
	WebElement editNama;
	
	@FindBy(id = "select2-Division-container")
	WebElement editDivisi;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputDivisi;
	
	@FindBy(id = "select2-Product-container")
	WebElement klikProduct;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputProduct;
	
	@FindBy(id = "select2-Position_RTO-container")
	WebElement klikPosition;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputPosition;
	
	@FindBy(id = "select2-Channel_RTO-container")
	WebElement klikChannel;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputChannel;
	
	@FindBy(id = "select2-Group_Type_RTO-container")
	WebElement klikGrup;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputGrup;
	
	@FindBy(id = "select2-Level_RTO-container")
	WebElement klikLevel;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputLevel;
	
	@FindBy(id = "select2-Sales_Mode_RTO-container")
	WebElement klikSales;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputSales;
	
	@FindBy(id = "select2-Departement-container")
	WebElement klikDepartement;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputDepartement;
	
	@FindBy(id = "select2-Branch-container")
	WebElement klikBranch;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputBranch;
	
	@FindBy(id = "select2-Employee_Type-container")
	WebElement klikEmployee;

	@FindBy(xpath = "//input[@type='search']")
	WebElement inputEmployee;
	
	@FindBy(id = "select2-SM_Code-container")
	WebElement kliksmCode;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement inputsmCode;
	
	@FindBy(id = "btnUpdate")
	WebElement btnUpdate;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[3]/div/table/tbody/tr[1]/td/input")
	WebElement btnTelp;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[3]/div/table/tbody/tr[2]/td/input")
	WebElement btnEcon;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[3]/div/table/tbody/tr[3]/td/input")
	WebElement btnData;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[3]/div/table/tbody/tr[4]/td/input")
	WebElement btnDok;
	
	@FindBy(id="FaceBook")
	WebElement formFb;
	
	@FindBy(id="Twitter")
	WebElement formTwitter;
	
	@FindBy(id="Instagram")
	WebElement formInstagram;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[4]/div/table[2]/tbody/tr[1]/td/input[2]")
	WebElement btnTidak;
	
	@FindBy(id="radio_submit1") 
	WebElement btnNorma;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[4]/div/table[2]/tbody/tr[4]/td/div/input[2]")
	WebElement btnCheck1;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[4]/div/table[2]/tbody/tr[5]/td/div/input[1]")
	WebElement btnCheck2;
	
	@FindBy(xpath="//*[@id=\"form_verification\"]/div[4]/div/table[2]/tbody/tr[6]/td/div/input[1]")
	WebElement btnCheck3;
	
	@FindBy(id="//*[@id=\"form_verification\"]/div[5]/div/select")
	WebElement btnVer;
	
	@FindBy(xpath ="//*[@id=\"form_verification\"]/div[5]/div/select/option[2]")
	WebElement verStat;
	
	@FindBy(xpath ="//*[@id=\"form_verification\"]/div[6]/div/textarea")
	WebElement inputKet;
	
	@FindBy(id = "btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(xpath ="//div[@id='content']/h1")
	WebElement txtJadwalTraining;
	

	
	
//	public void gotoButtonPlus() {
//		btnVerifikasi.click();
//		
//	}
//	
//	public void gotoButtonAksi() { 
//		btnAksi.click();
//	}
	
	public void goToFormVerifikasi() {
		btnEdit.click();
		editNama.click();
		editNama.sendKeys("test");
		klikProduct.click();
		inputProduct.sendKeys("cc");
		inputProduct.sendKeys(Keys.ENTER);
		klikPosition.click();
		inputPosition.sendKeys("team");
		inputPosition.sendKeys(Keys.ENTER);
		klikChannel.click();
		inputChannel.sendKeys("Retail");
		inputChannel.sendKeys(Keys.ENTER);
		klikGrup.click();
		inputGrup.sendKeys("flazz");
		klikLevel.click();
		inputLevel.sendKeys("junior");
		inputLevel.sendKeys(Keys.ENTER);
		klikSales.click();
		inputSales.sendKeys("direct sales");
		inputSales.sendKeys(Keys.ENTER);
		klikDepartement.click();
		inputDepartement.sendKeys("direct sales");
		inputDepartement.sendKeys(Keys.ENTER);
		klikBranch.click();
		inputBranch.sendKeys("balikpapan");
		inputBranch.sendKeys(Keys.ENTER);
		klikEmployee.click();
		inputEmployee.sendKeys("PKWT");
		inputEmployee.sendKeys(Keys.ENTER);
		kliksmCode.click();
		inputsmCode.sendKeys("elva");
		inputsmCode.sendKeys(Keys.ENTER);
		btnUpdate.click();
		tunggu();
		btnTelp.click();
		btnEcon.click();
		btnData.click();
		btnDok.click();
		btnTidak.click();
		btnNorma.click();
		btnCheck1.click();
		btnCheck2.click();
		btnCheck3.click();
		btnVer.click();
		verStat.click();
		inputKet.sendKeys("Test");
		btnSubmit.click();
		
	
	}
	
	public String getTxtJadwalTraining() {
		return txtJadwalTraining.getText();
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
