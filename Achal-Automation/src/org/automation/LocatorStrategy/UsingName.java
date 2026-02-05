package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingName {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement SearchTxtBox = driver.findElement(By.name("q"));
	SearchTxtBox.sendKeys("KGF2");
	//SearchTxtBox.click();
}
}
