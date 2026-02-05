package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSInAmazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
        driver.findElement(By.linkText("Mobiles")).click();
        driver.findElement(By.cssSelector("img[alt='OnePlus Nord 5']")).click();
        
	}

}
