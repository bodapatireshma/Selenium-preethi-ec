package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Multiple_Dropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Selenium Projects Preethi\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement multiDropdown = driver.findElement(By.name("States"));
		
		//select
		Select s = new Select(multiDropdown);
		
		//ismultiple
		boolean multiple = s.isMultiple();
		System.out.println("is multiple ?????"+multiple);
		
		//getoptions
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}
		
		//size of the dropdown
		int size = allOptions.size();
		System.out.println("size  ::"+size);
		
		//for loop
		for (int i = 0; i < size; i++) {
			
			if (i==0 || i==2 || i==5) {
				s.selectByIndex(i);
				
			}
		}
	//get allselected options
		System.out.println("***** all selected options *****");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());
		}
		//get first selected option
		System.out.println("*** first selected option ***");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
}
}