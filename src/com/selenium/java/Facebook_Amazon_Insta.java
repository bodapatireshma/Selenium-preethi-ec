package com.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Amazon_Insta {
	
	//browser launch - internet
	//set property - webdriver.chromeproperty
	//webdriver import
	
	public static void main(String[] args) {
		//key - driver name, value - driverpath (chrome driver)
		//map - key & Value
		
//set property - driver and chrome path
	System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Arun\\Driver\\chromedriver.exe");
//webdriver
	WebDriver driver = new ChromeDriver();
	//interface               //class                  //casting - upcasting
	
//get
	driver.get("https://www.facebook.com/");
	
//maximize
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();         //used rarely
	
//navigate.to	
	driver.navigate().to("https://www.amazon.in/");
	
//navigate.back
	driver.navigate().back();
	
//getTitle
	String title = driver.getTitle();
	System.out.println("title"+title);
	
//navigate.forward	
	driver.navigate().forward();
	
//getCurrentUrl
	String currentUrl = driver.getCurrentUrl();
	System.out.println("currentUrl"+currentUrl);

	driver.navigate().to("https://www.instagram.com/");
	
//navigate.refresh
	driver.navigate().refresh();
	}
}