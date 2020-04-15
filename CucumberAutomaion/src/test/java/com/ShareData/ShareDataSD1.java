package com.ShareData;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataSD1 {
	
	WebDriver driver;
	
	public ShareDataSD1(SharedClass Share) {
		driver = Share.Setup();
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
	
	


}
