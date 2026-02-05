package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeychingCssPropertiesInFB {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println("Background color is "+LoginBtn.getCssValue("background-color"));
		System.out.println("Font Size is "+LoginBtn.getCssValue("font-size"));
		
		
	}}
	
