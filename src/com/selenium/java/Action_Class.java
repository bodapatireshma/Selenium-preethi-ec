package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	//gmail
		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		
	//actions	
		Actions ac = new Actions(driver);
		ac.contextClick(gmail).build().perform();
		
	//robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		//actions
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(women).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		ac1.click(casual).build().perform();
}
}