package com.juaracoding.cucumber4.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber4.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.drivers.DriverSingleton;
import com.juaracoding.cucumber4.pages.Dashboard;
import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.pages.Wawancara;
import com.juaracoding.cucumber4.utlis.ConfigurationProperties;
import com.juaracoding.cucumber4.utlis.Constants;
import com.juaracoding.cucumber4.utlis.TestCases;
import com.juaracoding.cucumber4.utlis.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinitions {

	private static WebDriver driver;
	private LoginPage loginPage;
	private Dashboard dashboard;
	private Wawancara wawancara;
	ExtentTest extentTest;
	static ExtentReports reports = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		dashboard = new Dashboard();
		wawancara = new Wawancara();
		TestCases[] tests = TestCases.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}	
	
	@AfterStep
	public void getResult(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, "Screenshot:\n"+
					extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
	
	@Given("User mengakses url")
	public void User_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to "+Constants.URL);
	}
//============================================================================================	
	@When("User klik login button")
	public void User_klik_login_button() {
//		scroll();
		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User klik login button");
	}
	
	@Then("User berhasil login")
	public void User_berhasil_login() {
		//refresh
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
		extentTest.log(LogStatus.PASS, "User berhasil login");
	}
//================================================================================
	@When("User klik menu Dashboard")
	public void User_klik_menu_Dashboard() {
		dashboard.goToMenuDashboard();
		extentTest.log(LogStatus.PASS, "User klik menu Dashboard");
	}
	
	@Then("User melihat halaman Dashboard")
	public void User_melihat_halaman_Dashboard() {
		assertEquals(configurationProperties.getTxtViewDetail(), dashboard.getTxtViewDetail());
		extentTest.log(LogStatus.PASS, "User melihat halaman Dashboard");
	}	
//=========================================================================================
	@When("User klik menu Wawancara")
	public void User_klik_menu_Wawancara() {
		wawancara.goToMenuWawancara();
		extentTest.log(LogStatus.PASS, "User klik menu Wawancara");
	}
	@And("User klik tombol plus")
	public void User_klik_tombol_plus() {
		wawancara.goToButtonPlus();
		extentTest.log(LogStatus.PASS, "User klik tombol plus");
	}
	@And("User klik tombol Aksi")
	public void User_klik_tombol_Aksi() {
		wawancara.goToButtonAksi();
		extentTest.log(LogStatus.PASS, "User klik tombol Aksi");
	}
	@And("User mengisi form wawancara")
	public void User_mengisi_form_wawancara() {
		wawancara.goToFormWawancara();
		extentTest.log(LogStatus.PASS, "User mengisi form wawancara");
	}
	@Then("User berhasil menyimpan data wawancara")
	public void User_berhasil_menyimpan_data_wawancara() {
		assertEquals(configurationProperties.getTxtVerifikasiData(), wawancara.getTxtVerifikasiData());
		extentTest.log(LogStatus.PASS, "User berhasil menyimpan data wawancara");
	}
	
	
	public void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void scroll() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
	}
}
