package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Telecom 
{
	static WebDriver driver;
	
	@Given("User should be in the Telecom Home page")
	public void user_should_be_in_the_Telecom_Home_page() 
	{
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nelson\\eclipse-workspace\\GreensT\\cucumber\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/telecom/");
	}
	
	@Given("User should be in the Telecom Home page G")
	public void User_should_be_in_the_Telecom_Home_page_G() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelson\\eclipse-workspace\\GreensT\\cucumber\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("User should click on the Add Customer")
	public void user_should_click_on_the_Add_Customer() 
	{
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}
	
	@Given("User should click on Add Tarif Plan")
	public void user_should_click_on_Add_Tarif_Plan() 
	{
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User should enter the reqiured Fields")
	public void user_should_enter_the_reqiured_Fields() 
	{
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Charles");
		driver.findElement(By.id("lname")).sendKeys("C");
		driver.findElement(By.id("email")).sendKeys("chalesjameC@yahooo.com");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("No4 Hemsworth Canada");
		driver.findElement(By.id("telephoneno")).sendKeys("86342615");
	}
	
	@When("User should enter the reqiured Fields using list")
	public void user_should_enter_the_reqiured_Fields_using_list(DataTable cusdata) 
	{
		List<String> li = cusdata.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(li.get(0));
		driver.findElement(By.id("lname")).sendKeys(li.get(1));
		driver.findElement(By.id("email")).sendKeys(li.get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(li.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(li.get(4));
	}
	

	@When("User should enter the reqiured Fields using list TwoDimen")
	public void user_should_enter_the_reqiured_Fields_using_list_TwoDimen(io.cucumber.datatable.DataTable cusdata) 
	{
		List<List<String>> li = cusdata.asLists(String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(li.get(1).get(0));
		driver.findElement(By.id("lname")).sendKeys(li.get(2).get(1));
		driver.findElement(By.id("email")).sendKeys(li.get(1).get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(li.get(2).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(li.get(1).get(4));
	}
	
	@When("User should enter the reqiured Fields using MAP OneDimen")
	public void user_should_enter_the_reqiured_Fields_using_MAP_OneDimen(DataTable cusdata)
	{
		Map<String, String> mp = cusdata.asMap(String.class, String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(mp.get("Rent"));
		driver.findElement(By.id("local_minutes")).sendKeys(mp.get("LocMin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(mp.get("InterMin"));
		driver.findElement(By.id("sms_pack")).sendKeys(mp.get("SMSPack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(mp.get("LocPerMin"));
		driver.findElement(By.id("inter_charges")).sendKeys(mp.get("InterPerMin"));
		driver.findElement(By.id("sms_charges")).sendKeys(mp.get("SMSPerChar"));
	}
	
	
	@When("User should enter the reqiured Fields using MAP TwoDimen")
	public void user_should_enter_the_reqiured_Fields_using_MAP_TwoDimen(DataTable cusdata)
	{
		List<Map<String, String>> mp2d = cusdata.asMaps(String.class, String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(mp2d.get(0).get("Rent"));//74646
		driver.findElement(By.id("local_minutes")).sendKeys(mp2d.get(4).get("LocMin"));//42
		driver.findElement(By.id("inter_minutes")).sendKeys(mp2d.get(2).get("InterMin"));//32
		driver.findElement(By.id("sms_pack")).sendKeys(mp2d.get(4).get("SMSPack"));//6
		driver.findElement(By.id("minutes_charges")).sendKeys(mp2d.get(3).get("LocPerMin"));//4
		driver.findElement(By.id("inter_charges")).sendKeys(mp2d.get(1).get("InterPerMin"));//23
		driver.findElement(By.id("sms_charges")).sendKeys(mp2d.get(0).get("SMSPerChar"));//9023
	}

	@When("User should click on the submit button")
	public void user_should_click_on_the_submit_button() 
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	

	@Then("User should be displayed with Successfuly Page")
	public void user_should_be_displayed_with_Successfuly_Page() 
	{
		boolean b = driver.findElement(By.xpath("//h1[text()='Access Details to Guru99 Telecom']")).isDisplayed();
		Assert.assertTrue("Access Details to Guru99 Telecom", b);
	}
	
	@Then("User should be displayed Added Tarif Plans")
	public void user_should_be_displayed_Added_Tarif_Plans() 
	{
		boolean b = (driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"))).isDisplayed();
		Assert.assertTrue("Congratulation you add Tariff Plan", b);
	}

}
