package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//single frame
		driver.switchTo().frame("SingleFrame");
		WebElement singleframe = driver.findElement(By.xpath("//input[@type='text']"));
		singleframe.sendKeys("Simple Programming");
		Thread.sleep(2000);
		//from frame to main frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		//multi frame
		WebElement iframeButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframeButton.click();
		//switch to outerframe
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		//switch to innerframe
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		Thread.sleep(2000);
		WebElement innertextbox = driver.findElement(By.xpath("//input[@type='text']"));
		innertextbox.sendKeys("Multiple Programming");
		//inner frame to outer frame
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
	}

}
