package com.pom.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.sel.java.Base_Class;

public class Miniproject_Mystore extends Base_Class {
	
	public static WebDriver driver;     
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		Miniproject mp = new Miniproject(driver);
		
		sendValues(mp.getEmail(), "reshma@gmail.com");
		sendValues(mp.getPassword(), "Reshma@123");
		clickOnElement(mp.getSignin());
		
		ActionMoveToElement(mp.getWomen());
		actionClick(mp.getTshirts());
		ActionMoveToElement(mp.getImage());
		actionClick(mp.getQuickView());
		
		frameIndex(0);

		erase(mp.getQuantity());
		sendValues(mp.getQuantity1(), "2");
		selectValue(mp.getSize(), "3");
		clickOnElement(mp.getPinkclr());
		clickOnElement(mp.getAddCart());
		
		sleep(5000);
		
		clickOnElement(mp.getProceed());
		
		sleep(5000);

		screenshot("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart1.png");
		
		clickOnElement(mp.getProceed1());
		sendValues(mp.getTxtBox(), "Hi");
		clickOnElement(mp.getProceed2());
		clickOnElement(mp.getTickBox());
		clickOnElement(mp.getProceed3());
		clickOnElement(mp.getBank());
		clickOnElement(mp.getConfirm());
		
		screenshot("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart2.png");
}
}