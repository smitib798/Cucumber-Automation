package com.ShareData;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;

public class ShareDataSD {
	
	WebDriver driver;
	
	public ShareDataSD(SharedClass Share) {
		driver = Share.Setup();
	}
	
	@Given("^User need to be on Facebook login page$")
	public void  User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver", "E:\\Cucumber Details\\CucumberAutomaion\\Browser-Driver\\chromedriver.exe");
		driver=new ChromeDriver();*/
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		System.out.println("Shared Successfully");
	}
	
	


	
	

}
