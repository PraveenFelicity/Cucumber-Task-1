package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddCustomerPage extends Commonactions {

	public AddCustomerPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement Customerbtn ;
	
	@FindBy (id= "fname")
	private WebElement fname;
	
	@FindBy (id= "lname")
	private WebElement lname;
	
	@FindBy (id= "email")
	private WebElement mail;
	
	@FindBy (name= "addr")
	private WebElement adrr;
	
	@FindBy (id= "telephoneno")
	private WebElement phn;
	
		
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement Submitbtn ;
	
	@FindBy (xpath = "//label[@for='done']")
	private WebElement done ;


	public WebElement getDone() {
		return done;
	}


	public WebElement getCustomerbtn() {
		return Customerbtn;
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getAdrr() {
		return adrr;
	}


	public WebElement getPhn() {
		return phn;
	}


	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
	
	
	
	
}
