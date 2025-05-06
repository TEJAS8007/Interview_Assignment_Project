package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Common_Utilities;


public class Test_Case_07 {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy(xpath = "//*[@id=\"radix-:r3:\"]/div[2]/div[3]/div/button")
	WebElement skip;

	@FindBy(xpath  = "//span[text()='Sales']")
	WebElement Sales;

	@FindBy(xpath  = "//span[text()='Customers']")
	WebElement Customers;

	@FindBy(xpath = "//label[text()='Add Record']")
	WebElement AddRecordButton ;

	@FindBy(css = "input[id='point_of_contact.0.mobile']")
	WebElement mob;


	public Test_Case_07(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public void perform_Testcase_07() {
	
		skip.click();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sales);

		Common_Utilities.wait_Second();


		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Customers);

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AddRecordButton);
		
		mob.sendKeys(Common_Utilities.init_prop().get("mob").toString());
		
		mob.clear();
		
		mob.sendKeys(Common_Utilities.init_prop().get("mob").toString());
		
	}

}
