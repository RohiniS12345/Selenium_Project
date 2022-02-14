package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExamples {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screen = ts.getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Screenshot\\swiggy.png");

		FileUtils.copyFile(screen, path);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get(
				"https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=EAIaIQobChMI47bVuKL59AIVTHRgCh2QLQHYEAAYASAAEgK6NfD_BwE:G:s&gclid=EAIaIQobChMI47bVuKL59AIVTHRgCh2QLQHYEAAYASAAEgK6NfD_BwE");
		driver1.manage().window().maximize();
		Thread.sleep(2000);

		TakesScreenshot ts1 = (TakesScreenshot) driver1;

		File screen1 = ts1.getScreenshotAs(OutputType.FILE);

		File path1 = new File("C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Screenshot\\MAKEMYTRIP.png");

		FileUtils.copyFile(screen1, path1);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://demo.automationtesting.in/Windows.html");
		driver2.manage().window().maximize();
		Thread.sleep(2000);

		TakesScreenshot ts2 = (TakesScreenshot) driver2;

		File screen2 = ts2.getScreenshotAs(OutputType.FILE);

		File path2 = new File("C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Screenshot\\automationdemo.png");

		FileUtils.copyFile(screen2, path2);

		
		
		
		
	}

}
