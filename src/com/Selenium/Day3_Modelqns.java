package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Modelqns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	
	createaccount.click();
	Thread.sleep(2000);
	WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Rohini");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("S");
	
WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
password.sendKeys("Yashu123$");
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByValue("7");
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByIndex(8);
	WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
	s2.selectByVisibleText("2010");
	WebElement gender = driver.findElement(By.xpath("//input[@type='radio'][1]"));
	gender.click();
	
	}

}
