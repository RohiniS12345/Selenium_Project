package com.Selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Modelqn {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement downicon = driver.findElement(By.id("sign-in-icon-down"));
	downicon.click();
	WebElement singin = driver.findElement(By.id("hc"));
	singin.click();
	Thread.sleep(2000);
	
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	WebElement mobileno = driver.findElement(By.id("mobileNoInp"));
	mobileno.sendKeys(s);
	Thread.sleep(2000);
	
	WebElement otp = driver.findElement(By.id("otp-container"));
		otp.click();
	
}
}
