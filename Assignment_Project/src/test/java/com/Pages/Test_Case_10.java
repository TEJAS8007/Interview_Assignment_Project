package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Common_Utilities;


public class Test_Case_10 {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy(xpath = "//*[@id=\"radix-:r3:\"]/div[2]/div[3]/div/button")
	WebElement skip;

	@FindBy(xpath  = "//span[text()='Sales']")
	WebElement Sales;

	@FindBy(xpath  = "//span[text()='Customers']")
	WebElement Customers;
	
	@FindBy(css = "div[class='relative flex items-center']")
	WebElement cust_id;
	
	public Test_Case_10(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void perform_TestCase_10() {
		
		skip.click();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sales);

		Common_Utilities.wait_Second();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Customers);
		
		
		List<WebElement>id_list=driver.findElements(By.cssSelector("div[class='relative flex items-center']"));
		
		for(int a=0;a<id_list.size();a++) {
			System.out.println(id_list.get(a).getText());
		}
	}
}
