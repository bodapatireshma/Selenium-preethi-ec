package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Mouse_Scroll {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
	//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", twitter);
		
//		WebElement elect = driver.findElement(By.xpath("(//a[@class='a-link-normal'])[15]"));
//	//scroll up 
//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			js1.executeScript("arguments[0].scrollIntoView();", elect);
		
//	//scroll up and down using pixel
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,1800)");
//		js2.executeScript("window.scrollBy(0,-1500)");
		
	//to scroll down to the bottom of the page
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		
}
}