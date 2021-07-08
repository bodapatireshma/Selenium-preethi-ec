
package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("testqwe@hmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		password.sendKeys("123456qwe");
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();	
	}
}