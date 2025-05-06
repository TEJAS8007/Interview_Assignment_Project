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
import com.Pages.Test_Case_01;

import com.utilities.Common_Utilities;

public class TC_01_Test {

	WebDriver driver;
	Test_Case_01 t1;
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

		t1=new Test_Case_01(driver);
		login =new Login_Page(driver);
		
		log=LogManager.getLogger(this.getClass());
		log.debug("Started.....");


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void test_login() {
		System.out.println("Test");

		login.login(Common_Utilities.init_Login_prop().getProperty("uname").toString(), 
				Common_Utilities.init_Login_prop().getProperty("pass").toString());
	}

	@Test(priority = 2)
	public void test_01() {

		boolean result= t1.perform_Testcase_01();
		
		if(result==true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@AfterTest
	public void tear_down() {
		driver.quit();
		log.debug("Ended....");
	}
}
