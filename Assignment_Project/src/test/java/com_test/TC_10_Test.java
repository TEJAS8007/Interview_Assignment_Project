package com_test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.Login_Page;
import com.Pages.Test_Case_09;
import com.Pages.Test_Case_10;
import com.utilities.Common_Utilities;

public class TC_10_Test {


	WebDriver driver;
	Test_Case_10 t10;
	Login_Page login;
	ChromeOptions options;
	Logger log;

	@BeforeTest
	public  void set_Up() {

		options = new ChromeOptions();

		options.addArguments("--disable-save-password-bubble");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);

		options.addArguments("--disable-notifications");

		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars");



		driver=new ChromeDriver(options);
		driver.get(Common_Utilities.init_Login_prop().getProperty("url"));

		t10=new Test_Case_10(driver);
		login =new Login_Page(driver);
		
		log=LogManager.getLogger(this.getClass());
		log.debug("Started.....");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void test_login() {

		login.login(Common_Utilities.init_Login_prop().getProperty("uname").toString(), 
				Common_Utilities.init_Login_prop().getProperty("pass").toString());
	}

	@Test(dependsOnMethods = "test_login")
	public void test_10() {

		 t10.perform_TestCase_10();
		
	}

	@AfterTest
	public void tear_down() {
		driver.quit();
		log.debug("Ended.....");
	}
}
