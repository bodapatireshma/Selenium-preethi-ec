package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table{

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		
//to get all the data from the table
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : allData) {
			System.out.println(data.getText());
		}
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		System.out.println("*** ROW DATA ***");
		for (WebElement data : rowData) {
			System.out.println(data.getText());
		}
		WebElement parData = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		System.out.println("*** PARTICULAR DATA ***");
		System.out.println(parData.getText());
		
		List<WebElement> colData = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		System.out.println("*** COLUMN DATA ***");
		for (WebElement data : colData) {
			System.out.println(data.getText());
		}
}
}