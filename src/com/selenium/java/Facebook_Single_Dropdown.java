package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Single_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement crtBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crtBtn.click();
		
		Thread.sleep(2000);
		
//drop down
	//day
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("30");

	//month
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		
	//year
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2 = new Select(year);
		s2.selectByIndex(25);	
	}
}