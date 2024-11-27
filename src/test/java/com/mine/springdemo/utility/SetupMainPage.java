package com.mine.springdemo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupMainPage {

		WebDriver driver; 
		String mainURL; 
		String driverPath; 
		
		public SetupMainPage() {
			// get values from properties file 
			mainURL = LoadProperties.getInstance().getMainURL();
			driverPath = LoadProperties.getInstance().getDriverPath();
			
			// set system property for the chromedriver 
			//System.setProperty("webdriver.chrome.driver",driverPath);
			driver = new ChromeDriver();
			driver.get(mainURL);
			driver.manage().window().maximize();
		}
		
		public WebDriver gotoMainPage() { 
			// make sure driver is setup
			if (driver == null) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
			// always point to main page (mainURL)
			driver.get(mainURL);
			
			return driver; 
		}
		
		public WebDriver getDriver() { 
			return driver; 
		}
}
