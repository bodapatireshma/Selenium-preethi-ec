package com.selenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//simple alert
	WebElement altBtn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	altBtn.click();
		
	Thread.sleep(3000);
		
	Alert simalert = driver.switchTo().alert();
//	simalert.accept();
	simalert.dismiss();
		
//confirm alert
		
	Thread.sleep(2000);
		
	WebElement altcBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));	
	altcBtn.click();	
	
	WebElement conBtn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	conBtn.click();
	
	Thread.sleep(3000);
		
	Alert conalert = driver.switchTo().alert();
//	conalert.accept();
	conalert.dismiss();
	
//prompt alert
	
	WebElement altpBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	altpBtn.click();
	
	WebElement prtBtn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	prtBtn.click();
	
	Thread.sleep(2000);
	
	Alert prtalert = driver.switchTo().alert();
	prtalert.sendKeys("i am a tester");
	System.out.println(prtalert.getText());
	Thread.sleep(2000);
//	prtalert.accept();
	prtalert.dismiss();
}

}
