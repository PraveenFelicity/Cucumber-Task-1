package com.telecom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddTraiffPlan {
    static WebDriver driver;
	@Given("user launch telecom application")
	public void user_launch_telecom_application() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Wa\\Libb\\chromedriver.exe");
	   driver = new ChromeDriver ();
	   driver.get("http://www.demo.guru99.com/telecom/");
	   driver.manage().window().maximize();
	}
	
	@Given("user click on add traiff button")
	public void user_click_on_add_traiff_button() {
		   driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user need to fill the plan details {string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_the_plan_details(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    driver.findElement(By.id("rental1")).sendKeys(string);
	    driver.findElement(By.id("local_minutes")).sendKeys(string2);
	    driver.findElement(By.id("inter_minutes")).sendKeys(string3);
	    driver.findElement(By.id("sms_pack")).sendKeys(string4);
	    driver.findElement(By.id("minutes_charges")).sendKeys(string5);
	    driver.findElement(By.id("inter_charges")).sendKeys(string6);
	    driver.findElement(By.id("sms_charges")).sendKeys(string7);
	}

	@When("and click on the submit button")
	public void and_click_on_the_submit_button() {
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("user verfiy congratulation message")
	public void user_verfiy_congratulation_message() {
	    String text = driver.findElement(By.xpath("//h2[contains(text(),'C')]")).getText();
	    Assert.assertEquals("Congratulation you add Tariff Plan", text); 
	    driver.quit();
	}

	
}
