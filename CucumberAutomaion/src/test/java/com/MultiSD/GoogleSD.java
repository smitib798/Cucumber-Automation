package com.MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSD {

WebDriver driver;
	
	@Given("^User need to be on goole search page$")
	public void  User_need_to_be_on_goole_search_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber Details\\CucumberAutomaion\\Browser-Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
	}
	
	@When("^User enters Search String$")
	public void User_enters_Search_String() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		Thread.sleep(1200);
	}
	@Then("^closebrowser$")
	public void closebrowser() {
		driver.quit();
		driver=null;
		
	}
}
