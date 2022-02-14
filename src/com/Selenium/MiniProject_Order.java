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

public class MiniProject_Order {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("rohikoki.1916@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("12345");
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
	
		WebElement clothes = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		clothes.click();
		
		WebElement clothes1 = driver.findElement(By.xpath("//a[@title='Printed Chiffon Dress']"));
		clothes1.click();
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addtocart.click();
		
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		checkout.click();
		WebElement checkout1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		checkout1.click();
		
		WebElement checkout2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		checkout2.click();
		
		WebElement terms = driver.findElement(By.id("cgv"));
		terms.click();
		WebElement checkout3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		checkout3.click();
		WebElement checkout4 = driver.findElement(By.xpath("//a[@class='bankwire']"));
		checkout4.click();
		WebElement order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		order.click();
		
		TakesScreenshot confirmation = (TakesScreenshot) driver;
		File source= confirmation.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\SUGUMAR\\\\eclipse-workspace\\\\Selenium_Project\\\\Screenshot\\\\orderconfirm.png");
		FileUtils.copyFile(source, dest);
		
		
		
		
		
		
		
	}
	
	
}
