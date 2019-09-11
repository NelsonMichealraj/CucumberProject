package com.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberMap 
{
	static WebDriver driver;
	
	@Given("User should be in Telecom Home Page")
	public void user_should_be_in_Telecom_Home_Page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelson\\eclipse-workspace\\GreensT\\cucumber\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("User Should click on Add Tarif Plan")
	public void user_Should_click_on_Add_Tarif_Plan() 
	{
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User Should fild the reqiured fields")
	public void user_Should_fild_the_reqiured_fields(io.cucumber.datatable.DataTable intmap) 
	{
		Map<String, String> mp = intmap.asMap(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(mp.get("Rent"));
		driver.findElement(By.id("local_minutes")).sendKeys(mp.get("LocMin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(mp.get("InterMin"));
		driver.findElement(By.id("sms_pack")).sendKeys(mp.get("SMSPack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(mp.get("LocPerMin"));
		driver.findElement(By.id("inter_charges")).sendKeys(mp.get("InterPerMin"));
		driver.findElement(By.id("sms_charges")).sendKeys(mp.get("SMSPerChar"));
	}

	@When("User should click the Submit")
	public void user_should_click_the_Submit() 
	{
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}
	
	@Then("User Should Display the Submition Page")
	public void User_Should_Display_the_Submition_Page()
	{
		boolean b = (driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"))).isDisplayed();
		Assert.assertTrue(b);
	}
	

}
