package com.baseclass.sel.java;

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

public class Miniproject_Mystore extends Base_Class {
	
	public static WebDriver driver;     //null
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("reshma@gmail.com");
		sendValues(email, "reshma@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
//		password.sendKeys("Reshma@123");
		sendValues(password, "Reshma@123");
		
		WebElement signin = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
//		signin.click();
		clickOnElement(signin);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(women).build().perform();
		ActionMoveToElement(women);
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//		act.click(tshirts).build().perform();
		actionClick(tshirts);
		
		WebElement image = driver.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]"));
//		act.moveToElement(image).build().perform();
		ActionMoveToElement(image);
		
		WebElement quickView = driver.findElement(By.xpath("//a[@class='quick-view']"));
//		act.click(quickView).build().perform();
		actionClick(quickView);

//		driver.switchTo().frame(0);
		frameIndex(0);
		
		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
//		quantity.clear();
		erase(quantity);
		
		WebElement quantity1 = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
//		quantity1.sendKeys("2");
		sendValues(quantity1, "2");
		
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
//		Select s = new Select(size);
//		s.selectByValue("3");
		selectValue(size, "3");
		
		WebElement pinkclr = driver.findElement(By.xpath("//a[@id='color_14']"));
//		pinkclr.click();
		clickOnElement(pinkclr);
		
		WebElement addCart = driver.findElement(By.xpath("//button[@class='exclusive']"));
//		addCart.click();
		clickOnElement(addCart);
		
//		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
		sleep(5000);
//		explicitWait(addCart);
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		proceed.click();
		clickOnElement(proceed);
		
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sleep(5000);
//		explicitWait(proceed);

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart1.png");
//		FileUtils.copyFile(source, destination);
		screenshot("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart1.png");
		
		WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		proceed1.click();
		clickOnElement(proceed1);
		
		WebElement txtBox = driver.findElement(By.xpath("//textarea[@class='form-control']"));
//		txtBox.sendKeys("Hi");
		sendValues(txtBox, "Hi");
		
		WebElement proceed2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		proceed2.click();
		clickOnElement(proceed2);
		
		WebElement tickBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		tickBox.click();
		clickOnElement(tickBox);
		
		WebElement proceed3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		proceed3.click();
		clickOnElement(proceed3);
		
		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		bank.click();
		clickOnElement(bank);
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		confirm.click();
		clickOnElement(confirm);
		
//		TakesScreenshot ts1 = (TakesScreenshot) driver;
//		File source1 = ts1.getScreenshotAs(OutputType.FILE);
//		File destination1 = new File("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart2.png");		
//		FileUtils.copyFile(source1, destination1);
		screenshot("C:\\Users\\user\\eclipse-workspace\\Selenium Tasks\\Screenshot\\MS2cart2.png");
}
}