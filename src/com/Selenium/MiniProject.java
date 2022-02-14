package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rohikoki.1916@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("12345");
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		WebElement gender = driver.findElement(By.id("uniform-id_gender2"));
				
		gender.click();
		
		WebElement firstnamne = driver.findElement(By.id("customer_firstname"));
		firstnamne.sendKeys("Rohini");
		WebElement lastnamne = driver.findElement(By.id("customer_lastname"));
		lastnamne.sendKeys("S");
		WebElement password1 = driver.findElement(By.id("passwd"));
		password1.sendKeys("12345");
		WebElement date = driver.findElement(By.id("days"));
		Select S = new Select(date);
		S.selectByValue("1");
		WebElement month = driver.findElement(By.id("months"));
		Select S1 = new Select(month);
		S1.selectByValue("9");
		WebElement year = driver.findElement(By.id("years"));
		Select S2 = new Select(year);
		S2.selectByValue("2016");
		WebElement lastnamne1 = driver.findElement(By.id("lastname"));
		lastnamne1.sendKeys("S");
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Greens");
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("DLF Branch");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Ramapuram");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select S3 = new Select(state);
		S3.selectByValue("32");
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00000");
		WebElement info = driver.findElement(By.id("other"));
		info.sendKeys("Testing");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9000000");
		WebElement phone1 = driver.findElement(By.id("phone_mobile"));
		phone1.sendKeys("9000008");
		WebElement alteraddress = driver.findElement(By.id("alias"));
		alteraddress.sendKeys("Chennai");
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		TakesScreenshot register1 = (TakesScreenshot) driver;
		File source= register1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\SUGUMAR\\\\eclipse-workspace\\\\Selenium_Project\\\\Screenshot\\\\screenshots.png");
		FileUtils.copyFile(source, dest);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		

	}
}
