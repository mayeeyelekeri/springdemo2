package com.mine.springdemo.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;


public class GoogleTest {

		WebDriver driver; 
		String mainURL; 
		String driverPath; 
		
                @Test
		public void SetupMainPage() {
			// get values from properties file 
			mainURL = "google.com";
			
			
  			System.out.println("inside setupmainpage");
			ChromeOptions options = new ChromeOptions(); 
			//options.setCapability("browserVersion", "131.0");
			options.setCapability("platformName", "linux");

			try { 
				driver = new RemoteWebDriver(new URL("http://192.168.99.99:4444"), options);
			} catch (Exception e) {
				System.out.println("caught URL exception");
			} 

			driver.get("http://google.com");
			driver.manage().window().maximize();

			String actualTitle = driver.getTitle();
       			assertEquals("google", actualTitle);

			driver.close(); 
		}
}
