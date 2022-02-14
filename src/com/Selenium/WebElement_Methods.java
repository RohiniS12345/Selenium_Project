package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//send keys
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys("Rohini.S@gmail.com");
		//get attribute
		String attribute = emailId.getAttribute("name");
		System.out.println(attribute);
		
		String attribute2 = emailId.getAttribute("value");
		System.out.println("login ID is:"+attribute2);
		
		boolean displayed = emailId.isDisplayed();
		System.out.println(("Is EmailId displayed:"+displayed));
		
		boolean enabled = emailId.isEnabled();
		System.out.println("Is Email ID Enabled:"+enabled);
		//sendkeys
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Rohi47878$");
	
		boolean enabled1 = password.isEnabled();
		System.out.println("Is Password Enabled:"+enabled1);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		boolean selected = login.isSelected();
		System.out.println("Is Login button Slected:"+selected);
		//clear
		emailId.clear();
		
		
	}	
	
	
	
}
