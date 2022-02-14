package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		Thread.sleep(2000);
		
		WebElement emailid = driver.findElement(By.xpath("//input[@type='text']"));
		emailid.sendKeys("yashu1245");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Ya3445%");
		
			
		WebElement forgotpassword = driver.findElement(By.xpath("//span[@class='KPnG0']"));
		forgotpassword.click();
		
		WebElement element = driver.findElement(By.xpath("//h1[text()='Instagram']"));
		
		element.sendKeys("Instagram");
		
		
		
		
		
	}
}
