package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerStepss extends Commonactions {
		
	Commonactions ca = new Commonactions ();
	AddCustomerPage ac = new AddCustomerPage ();
	
	

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() 
	
	{
		System.out.println("Background");
	   ca.button(ac.getCustomerbtn());
	   
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		
		ca.button(ac.getDone());
		ca.enterText(ac.getFname(), "praveen");
		ca.enterText(ac.getLname(), "sundar");
		ca.enterText(ac.getMail(), "cr7@gmail.com");
		ca.enterText(ac.getAdrr(), "potrugal");
		ca.enterText(ac.getPhn(), "8754392139");
				
	}
	
	@When("user need to fill up the fields by oneDim list")
	public void user_need_to_fill_up_the_fields_by_oneDim_list(DataTable dataTable) {
	   List<String> data = dataTable.asList(String.class);
		
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
	}
	
	@When("user need to fill up the fields by oneDim map")
	public void user_need_to_fill_up_the_fields_by_oneDim_map(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
		
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("LName"));
		driver.findElement(By.id("email")).sendKeys(data.get("Mail"));
		driver.findElement(By.name("addr")).sendKeys(data.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("PhoneNum"));
	}
	
	@When("user need to fill up the fields by TwoDim list")
	public void user_need_to_fill_up_the_fields_by_TwoDim_List(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
		
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get(3));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));
	}
	
	@When("user need to fill up the fields by TwoDim map")
	public void user_need_to_fill_up_the_fields_by_TwoDim_map(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
		
	    driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(2).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(data.get(0).get("Addres"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(1).get("Phne"));
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("Scenario");
		ca.button(ac.getSubmitbtn());
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   WebElement text = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	 //driver.quit();
	}

}
