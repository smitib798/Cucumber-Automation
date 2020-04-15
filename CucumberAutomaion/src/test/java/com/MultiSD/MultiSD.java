package com.MultiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiSD {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void  User_need_to_be_on_Facebook_login_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Cucumber Details\\CucumberAutomaion\\Browser-Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String username) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(username);
		Thread.sleep(1200);
		
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present inside textbox$")
	public void User_checks_user_first_name_is_present_inside_textbox(String username) throws InterruptedException{
    String usernameActualvalue=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	Assert.assertEquals(username,usernameActualvalue );
	Thread.sleep(1000);
		
	}
	
	@When("^User enters user first name$")
	public void User_enters_user_first_name() throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
		Thread.sleep(1200);
	}
	
	@And("^User enters user surname$")
	public void User_enters_user_surname() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rogers");
		Thread.sleep(1000);
	}
	
	@Then("^User checks user first name is present inside textbox$")
	public void User_checks_user_first_name_is_present_inside_textbox() throws InterruptedException{
	    String usernameActualvalue=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	    System.out.println(usernameActualvalue);
		Thread.sleep(1000);
	}
	
	
	@But("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws Throwable {
		String mobileActualvalue=driver.findElement(By.xpath("//input[@name='reg_email__']")).getAttribute("value");
		System.out.println(mobileActualvalue);
		Thread.sleep(1000);
	   
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		driver=null;
		
	}
	



	
	

}
