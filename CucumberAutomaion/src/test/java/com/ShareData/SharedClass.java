package com.ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {

WebDriver driver;
	
	@Before
	public WebDriver Setup() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "E:\\Cucumber Details\\CucumberAutomaion\\Browser-Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	
	@After
	public void Teardown() {
	
		driver.quit();
		driver=null;
	}
}
