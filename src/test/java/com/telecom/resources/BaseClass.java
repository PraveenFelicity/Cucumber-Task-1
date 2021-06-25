package com.telecom.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	 public static WebDriver driver ;
	 Actions ac = new Actions(driver);
	
	public static void LaunchChrome (String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Class-2\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		public static void enterText (WebElement ele, String input) {
		ele.sendKeys(input);
	}
		public static void clickElement (WebElement ele) {
		ele.click();
	}
	public static void ScreenShot () throws Exception {

	}
		public static String getTextOfElement (WebElement ele) {
		String text = ele.getText();
		return text;
	}
		public static String  getAttribute (WebElement ele, String input) {
	    String att = ele.getAttribute(input);
	    return att;
	}
	
	   public static  void actionContextClick (WebElement ele) {
		   Actions ac = new Actions(driver);
		   ac.doubleClick(ele).contextClick(ele).build().perform();   
		}
	
	   public static void moveEle (WebElement ele) {
		   Actions ac = new Actions(driver);
		   ac.moveToElement(ele).perform();
		   ac.sendKeys("d");
	   }
	
	   public static void actionDoubleClick (WebElement ele) {
		   Actions ac = new Actions(driver);
		   ac.doubleClick(ele).perform();   
	   }
	   
	   public static void Down () throws Exception {
		   Robot r = new Robot ();
		   for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN); 
		}
	   }
	   public static void Enter ()  throws Exception {
		   Robot r = new Robot ();
		   
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	   }
	   public static void Paste ()  throws Exception {
		   Robot r = new Robot ();
		    r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
	   }
	   
	   public static void ScrollDown (WebElement ele, String input) {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("", "");
		   
	   }
}
