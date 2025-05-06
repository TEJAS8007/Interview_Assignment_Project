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


public class Test_Case_08 {


	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy(xpath = "//*[@id=\"radix-:r3:\"]/div[2]/div[3]/div/button")
	WebElement skip;

	@FindBy(xpath  = "//span[text()='Sales']")
	WebElement Sales;

	@FindBy(xpath  = "//span[text()='Customers']")
	WebElement Customers;
	
	
	public Test_Case_08(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public void perform_Test_Case_08() {
		
		skip.click();

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Sales);

		Common_Utilities.wait_Second();


		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Customers);

		
		List<WebElement> Names_List= driver.findElements(By.cssSelector("tbody[class='[&_tr:last-child]:border-0'] tr"));
		
		System.out.println(Names_List.size());
		
		for(int a=0;a<Names_List.size();a++) {
			
			System.out.println(Names_List.get(a).getText());
		}
	}

}
