package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	@Before 
	public void BeforeScenario() {
		  launch("http://www.demo.guru99.com/telecom/");
	}
	
	
	@After
	public void AfterScenario () {
		System.out.println("AfterScenario");
		
	}
}
