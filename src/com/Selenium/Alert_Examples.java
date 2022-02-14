package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Examples {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		//simple Alert
		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simplealert.click();
		Thread.sleep(2000);
		
		Alert simplealert1 = driver.switchTo().alert();
		simplealert1.accept();
		
		
		//confirm Alert
		WebElement confirmalert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmalert.click();
		WebElement confirmalert1 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirmalert1.click();
		Thread.sleep(5000);
		Alert confirmalert2 = driver.switchTo().alert();
		confirmalert2.dismiss();
		WebElement promptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptAlert.click();
		
		WebElement promptAlert1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		promptAlert1.click();
		Thread.sleep(2000);
		
		Alert promptAlert2 = driver.switchTo().alert();
		promptAlert2.sendKeys("Automation Testing");
		String s = promptAlert2.getText();
		System.out.println(s);
		promptAlert2.accept();
		
		
		
		
	}

}
