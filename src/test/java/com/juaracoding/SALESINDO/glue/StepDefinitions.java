package com.juaracoding.SALESINDO.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.SALESINDO.config.AutomationFrameworkConfig;
import com.juaracoding.SALESINDO.drivers.DriverSingleton;
import com.juaracoding.SALESINDO.pages.Coding;
import com.juaracoding.SALESINDO.pages.Dashboard;
import com.juaracoding.SALESINDO.pages.JadwalTraining;
import com.juaracoding.SALESINDO.pages.LoginPage;
import com.juaracoding.SALESINDO.pages.Session;
import com.juaracoding.SALESINDO.pages.Verifikasi;
import com.juaracoding.SALESINDO.pages.Wawancara;
import com.juaracoding.SALESINDO.utlis.ConfigurationProperties;
import com.juaracoding.SALESINDO.utlis.Constants;
import com.juaracoding.SALESINDO.utlis.TestCases;
import com.juaracoding.SALESINDO.utlis.Utils;
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
	private Verifikasi verifikasi;
	private JadwalTraining jadwalTraining;
	private Coding coding;
	private Session session;
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
		verifikasi = new Verifikasi();
		jadwalTraining = new JadwalTraining();
		coding = new Coding();
		session = new Session();
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
//	@And("User klik tombol plus")
//	public void User_klik_tombol_plus() {
//		wawancara.goToButtonPlus();
//		extentTest.log(LogStatus.PASS, "User klik tombol plus");
//	}
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
	
	//=========================================================================================
	
	@When("User Menginput data pada form Verifikasi data")
	public void User_Menginput_data_pada_form_Verifikasi_data() {
		verifikasi.goToFormVerifikasi();
		extentTest.log(LogStatus.PASS, "User Menginput data pada form Verifikasi data");
	}
	
	@Then("User berhasil menyimpan data Verifikasi")
	public void User_berhasil_menyimpan_data_Verifikasi() {
		assertEquals(configurationProperties.getTxtJadwalTraining(), verifikasi.getTxtJadwalTraining());
		extentTest.log(LogStatus.PASS, "User berhasil menyimpan data Verifikasi");
	}
	//=========================================================================================
	
	@When("User Menginput data pada form Report Jadwal Training")
	public void User_Menginput_data_pada_form_Report_Jadwal_Training() {
		jadwalTraining.goToMenuJadwalTraining();
		extentTest.log(LogStatus.PASS, "User Menginput data pada form Report Jadwal Training");
	}
	
	@Then("User berhasil menyimpan data Report Jadwal Training")
	public void User_berhasil_menyimpan_data_Report_Jadwal_Training() {
		assertEquals(configurationProperties.getTxtSukses(), jadwalTraining.getTxtSukses());
		extentTest.log(LogStatus.PASS, "User berhasil menyimpan data Report Jadwal Training");
	}
	
	//=========================================================================================
	
	@When("User menginput data pada form Coding")
	public void User_menginput_data_pada_form_Coding() {
		coding.goToCoding();
		extentTest.log(LogStatus.PASS, "User menginput data pada form Coding");
	}
	
	@Then("User berhasil menyimpan data pada form Coding")
	public void User_berhasil_menyimpan_data_pada_form_Coding() {
		assertEquals(configurationProperties.getTxtGenerateCoding(), coding.getTxtGenerateCoding());
		extentTest.log(LogStatus.PASS, "User berhasil menyimpan data pada form Coding");
	}
	//=====================================================================================================
	
	@When("User mengakses menu session")
	public void User_mengakses_menu_session() {
		session.goToSession();
		extentTest.log(LogStatus.PASS, "User mengakses menu session");
	}
	@And("User klik tombol force logout")
	public void User_klik_tombol_force_logout() {
		session.goToForceLogout();
		extentTest.log(LogStatus.PASS, "User klik tombol force logout");
	}
	@Then("User berhasil keluar dari session")
	public void User_berhasil_keluar_dari_session() {
		assertEquals(configurationProperties.getTxtFormLogin(), session.getTxtFormLogin());
		extentTest.log(LogStatus.PASS, "User berhasil keluar dari session");
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
