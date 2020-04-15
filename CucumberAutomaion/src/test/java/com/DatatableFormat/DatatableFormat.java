package com.DatatableFormat;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatatableFormat {
	
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
	
	@When("^User enters following data$")
	public void user_enters_following_data(DataTable table) {
		
	List<List<String>>data=table.raw();
	
	String value1=data.get(0).get(0);
	String value2=data.get(0).get(1);
	String value3=data.get(0).get(2);
	
	String value4=data.get(1).get(0);
	String value5=data.get(1).get(1);
	String value6=data.get(1).get(2);
	
	String value7=data.get(2).get(0);
	String value8=data.get(2).get(1);
	String value9=data.get(2).get(2);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(value4);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value5);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(value6);
	
	
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(value7);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(value8);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(value9);
	
	
	
	
		
	}
	



	


}
