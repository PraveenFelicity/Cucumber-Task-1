package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerStepss {
		

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		System.out.println("Background");
	    Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys("praveen");
		Hooks.driver.findElement(By.id("lname")).sendKeys("Sundar");
		Hooks.driver.findElement(By.id("email")).sendKeys("Pr17@gmail.com");
		Hooks.driver.findElement(By.name("addr")).sendKeys("Salem");
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys("8754392139");
				
	}
	
	@When("user need to fill up the fields by oneDim list")
	public void user_need_to_fill_up_the_fields_by_oneDim_list(DataTable dataTable) {
	   List<String> data = dataTable.asList(String.class);
		
	    Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(3));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
	}
	
	@When("user need to fill up the fields by oneDim map")
	public void user_need_to_fill_up_the_fields_by_oneDim_map(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
		
	    Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get("LName"));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get("Mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get("address"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get("PhoneNum"));
	}
	
	@When("user need to fill up the fields by TwoDim list")
	public void user_need_to_fill_up_the_fields_by_TwoDim_List(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
		
	    Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(2).get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get(3));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get(1));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));
	}
	
	@When("user need to fill up the fields by TwoDim map")
	public void user_need_to_fill_up_the_fields_by_TwoDim_map(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
		
	    Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(2).get("Fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get("Lname"));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get("mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get("Addres"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(1).get("Phne"));
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("Scenario");
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   WebElement text = Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	 //Hooks.driver.quit();
	}

}
