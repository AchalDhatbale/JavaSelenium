package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOgProduct {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise earbuds" , Keys.ENTER);
	WebElement PriceElement = driver.findElement(By.xpath("//span[contains(text(),'Noise Buds N1 Truly') and contains(text(),'Carbon Black')]/../../../..//span[@class='a-price-whole']"));
	System.out.println(PriceElement);
}
}
