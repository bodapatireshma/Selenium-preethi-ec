package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=iphone&rh=n%3A1389401031&ref=nb_sb_noss");
		WebElement img = driver.findElement(By.xpath("//div[@id='search']/div/div/div/div/span[3]/div[2]/div[3]/div/span/span/div/div/div/div/div/div/span/a/div/img"));
		img.click();
}
}