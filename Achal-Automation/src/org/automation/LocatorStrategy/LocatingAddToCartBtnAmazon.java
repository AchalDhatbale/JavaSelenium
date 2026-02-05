package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartBtnAmazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise ear buds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'VS501') and contains(text(),Wine)]/../../../..//button[text()='Add to cart']")).click();
	  driver.findElement(By.xpath("//div[contains(@id,\"cart-text\")]")).click();
	  //completed but not executed
	}

}
