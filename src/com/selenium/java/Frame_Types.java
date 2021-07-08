package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Types {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//frame
		//switch using name:
		driver.switchTo().frame("SingleFrame");
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("TESTER");
		
		//nested frame
		driver.switchTo().defaultContent();
		
		WebElement frameBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frameBtn.click();
		
		WebElement oFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
		driver.switchTo().frame(oFrame);
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(iFrame);
		
		WebElement inner = driver.findElement(By.xpath("//input[@type='text']"));
		inner.sendKeys("DEMO TESTER");
		
		
		
}
}