package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;

	@FindBy(css = "input[id='email']")  
	WebElement emailInput;

	@FindBy(css = "input[id='password']") 
	WebElement passwordInput;

	@FindBy(xpath = "//button[@type='submit']")  
	WebElement loginButton;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String email, String password) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
}
