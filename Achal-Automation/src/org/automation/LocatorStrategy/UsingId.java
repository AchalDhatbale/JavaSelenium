package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingId {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement EmailTxtBox = driver.findElement(By.id("email"));
		EmailTxtBox.sendKeys("riya12@gmail.com");
		
		WebElement PwdTxtBox = driver.findElement(By.id("pass"));
		PwdTxtBox.sendKeys("Abcd@123");
		
		driver.findElement(By.name("login")).click();
		
		
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
