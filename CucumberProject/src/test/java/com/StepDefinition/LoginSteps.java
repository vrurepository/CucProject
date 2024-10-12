package com.StepDefinition;

import static org.junit.Assume.assumeNoException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("step 1: User is on login page");
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/login/");
	}

	
	
	
	/*
	 * @When("User enters \"(.*)\" and \"(.*)\"$") public void
	 * user_enters_user_name_and_password(String uname, String pswd) {
	 * System.out.println("Step2 : User enters Username and Password");
	 * driver.findElement(By.id("email")).sendKeys(uname);
	 * driver.findElement(By.id("pass")).sendKeys(pswd); }
	 */
	 
	  @When("^User enters (.*) and (.*)$") 
	  public void user_enters_user_name_and_password(String uname, String pswd) {
	  System.out.println("Step2 : User enters Username and Password");
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("pass")).sendKeys(pswd); }

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Step3: User is clicking on Login button");
		driver.findElement(By.id("loginbutton")).click();
	    
	}
	
	  @Then("User should land on login page") public void
	  user_should_land_on_login_page() {
	  System.out.println("Step4 : User lands on homepage"); 
	  driver.quit();;
	  
	  }
	 

	  @When("User enters credentials using Data Table")
	  public void user_enters_credentials_using_data_table(DataTable dataTable) {
		  System.out.println("Step2 : User eList<E>s Username and Password");
		  List<List<String>> data = dataTable.cells();
		  driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
		  driver.findElement(By.id("pass")).sendKeys(data.get(0).get(1)); }
	      
	  }






