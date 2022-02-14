package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseEvents {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUGUMAR\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions actions = new Actions (driver);
		actions.click(clickButton).build().perform();
		
		WebElement rightclickButton = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightclickButton).build().perform();
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		actions.doubleClick(doubleclick).build().perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag,drop).build().perform();
		Thread.sleep(2000);
	
		WebElement movetoelement = driver.findElement(By.id("droppableExample-tabpane-simple"));
		actions.moveToElement(movetoelement).build().perform();
	}
	
}
