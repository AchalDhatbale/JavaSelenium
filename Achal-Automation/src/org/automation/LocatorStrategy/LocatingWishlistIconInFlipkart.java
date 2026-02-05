package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishlistIconInFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 1000" ,Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Micromax X413']/../../..//*[name()='svg']")).click();
	
	}

}
