package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		//get
		driver.get("https://www.shine.com/");
		//maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.shine.com/jobs-by-top-company");
		//navigation methods - TO
		driver.navigate().to("https://www.linkedin.com/signup/");
		
		//back
		driver.navigate().back();
		
		//get title
		String title = driver.getTitle();
		System.out.println("Title is :"+ title);
		//forward
		driver.navigate().forward();
			
		//get current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is:"+ currentURL);
		
		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();
		//close
		driver.close();
	}

}
