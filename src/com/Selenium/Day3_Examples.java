package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Examples {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.xpath("//input[@type='text']"));
		Firstname.sendKeys("Rohini");
		Thread.sleep(3000);
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("S");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("No.2, Mugalivakkam,Chennai-6000089");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Rohini.S@gmail.com");
		Thread.sleep(3000);
		WebElement phonenumber = driver.findElement(By.xpath("//input[@type='tel']"));
		phonenumber.sendKeys("1345678797");
		WebElement gender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		gender.click();
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobbies.click();
		Thread.sleep(3000);
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByIndex(48);
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("country"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		Thread.sleep(3000);
				
		WebElement firstpass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		firstpass.sendKeys("Yashu1234$");
		WebElement secpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		secpass.sendKeys("Yashu1234$");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
		

}
}
