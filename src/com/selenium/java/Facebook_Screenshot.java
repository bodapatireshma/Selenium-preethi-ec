package com.selenium.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Screenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//takes screenshot
		//interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		//output source---method
		File source = ts.getScreenshotAs(OutputType.FILE);
		//destination & filename
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Screenshot\\fb.png");
		FileUtils.copyFile(source, destination);
}
}