package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
//webelement methods
	//send keys
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("password123456");
		
	//click
		WebElement login = driver.findElement(By.name("login"));
		login.click();
}
}