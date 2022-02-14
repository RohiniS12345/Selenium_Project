package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&gclid=Cj0KCQiA_JWOBhDRARIsANymNObAAabjPUblSqicPVSaf5ax-rgivnutg0mI-Jif7-ROBu1u8qAXUaoaAiYLEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(2000);

			WebElement flights = driver.findElement(By.xpath("//a[text()='Domestic Flights']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", flights);
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy,(0,-2000);");
			Thread.sleep(4000);
			js.executeScript("window.scrollBy,(0,5000);");
			
			
	}
}
