package com.mine.springdemo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SetupMainPage {

		WebDriver driver; 
		String mainURL; 
		String driverPath; 
		
		public SetupMainPage() {
			// get values from properties file 
			mainURL = LoadProperties.getInstance().getMainURL();
			System.out.println("mainURL = "+mainURL);
			mainURL = "https://the-internet.herokuapp.com/";
			
			ChromeOptions options = new ChromeOptions();
                        //options.setCapability("browserVersion", "131.0");
                        options.setCapability("platformName", "linux");

                        try {
                                driver = new RemoteWebDriver(new URL("http://192.168.99.99:4444"), options);
                        } catch (Exception e) {
                                System.out.println(".......... ERROR: caught URL exception");
                        }

			
			System.out.println("driver = "+driver);
			System.out.println("url = "+mainURL);

			// open main page 
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
