package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Common_Utilities;


public class Test_Case_01 {

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


	public Test_Case_01(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	

	public boolean perform_Testcase_01() {
		
		boolean found;
		
		skip.click();
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sales);
		
		Common_Utilities.wait_Second();
		
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Customers);
		
		if(AddRecordButton.isEnabled()==true) {
			found=true;
		} else {
			found=false;
		}

		return found;
	}

}
