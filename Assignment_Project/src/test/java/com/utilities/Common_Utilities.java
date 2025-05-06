package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Utilities {

	static WebDriver driver;
	static Properties pro;
	
	public static void wait_Second() {

		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}



	public static Properties init_prop() {
		try {
			FileInputStream file=new FileInputStream("src/test/resources/Data.properties");
			pro=new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
	}


	public static Properties init_Login_prop() {
		try {
			FileInputStream file=new FileInputStream("src/test/resources/Login.properties");
			pro=new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pro;
	}
	
	
}

