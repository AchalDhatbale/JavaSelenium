package org.automation.LocatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAllAddToCartButtonsInAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending lighter" , Keys.ENTER);
		List<WebElement> addToCartBtns = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addToCartBtns.size());
		for(WebElement x: addToCartBtns)
		{
			Thread.sleep(500);
			x.click();
		}
	}

}
