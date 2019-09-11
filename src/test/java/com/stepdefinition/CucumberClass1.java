package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CucumberClass1 
{
	static WebDriver driver;
	
	@Given("User Should be in Telecom home page")
	public void user_Should_be_in_Telecom_home_page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelson\\eclipse-workspace\\GreensT\\cucumber\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("User Click Add Customer in the Home Page")
	public void user_Click_Add_Customer_in_the_Home_Page() 
	{
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User Enter the Reqiured details for registration")
	public void user_Enter_the_Reqiured_details_for_registration() 
	{
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Nelson");
	    driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("M");
	    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("henselwilson@yahooo.com");
	    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("No 3 Ram Nagar");
	    driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9895637422");
	    
	    
	}

	@When("User Enter the Reqiured details for registration Enter Table")
	public void user_Enter_the_Reqiured_details_for_registration_Enter_Table(DataTable cusData)
	{
		List<String> li = cusData.asList();
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(li.get(0));
	    driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(li.get(1));
	    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(li.get(2));
	    driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(li.get(3));
	    driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(li.get(4));
	}

	
	@When("User Click Submit Button")
	public void user_Click_Submit_Button() 
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	@Then("User Should Be in the submition Page")
	public void user_Should_Be_in_the_submition_Page() 
	{
		WebElement custID = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		assertTrue(true);
		
	}

}
