package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	static WebDriver driver;
	@Before 
	public void BeforeScenario() {
		System.out.println("BeforeScenario");
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Wa\\Libb\\chromedriver.exe");
		   driver = new ChromeDriver ();
		   driver.get("http://www.demo.guru99.com/telecom/");
		   driver.manage().window().maximize();
	}
	
	
	@After
	public void AfterScenario () {
		System.out.println("AfterScenario");
		driver.quit();
	}
}
