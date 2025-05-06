package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Common_Utilities;

public class Test_Case_03 {

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
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit_button;
	
	@FindBy(css = "div[type='button'] svg")
	WebElement error_msg;
	
	public Test_Case_03(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean perform_Test_Case_03() {
		
		boolean found;
		
		skip.click();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sales);

		Common_Utilities.wait_Second();


		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Customers);

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AddRecordButton);
		
		Submit_button.click();
		
		
		if(error_msg.isDisplayed()) {
			found=true;
		} else {
			found=false;
		}
		
		return found;
	}
	
}
