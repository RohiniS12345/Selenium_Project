package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_Adactin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Rohini12345");
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("rohini12345");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Melbourne");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomType);
		s2.selectByVisibleText("Double");
		
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys("12/02/2022");
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys("12/02/2022");
		WebElement adultsroom = driver.findElement(By.id("adult_room"));
		Select s3 = new Select(adultsroom);
		s3.selectByValue("3");
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s4 = new Select(childRoom);		
		s4.selectByValue("1");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Rohini");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("S");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Chennai");
		WebElement creditcard = driver.findElement(By.id("cc_num"));
		creditcard.sendKeys("1234567891234567");
		
		WebElement creditcardtype = driver.findElement(By.id("cc_type"));
		Select s5 = new Select(creditcardtype);
		s5.selectByVisibleText("Master Card");
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(month);
		s6.selectByVisibleText("September");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(year);
		s7.selectByValue("2022");
		WebElement cvvnumber = driver.findElement(By.id("cc_cvv"));
		cvvnumber.sendKeys("123");
		WebElement booking = driver.findElement(By.id("book_now"));
		booking.click();
		WebElement logout = driver.findElement(By.id("logout"));
		
		logout.click();
		
	}
	
	
	
	
}
