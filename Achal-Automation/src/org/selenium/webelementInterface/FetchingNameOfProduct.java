package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingNameOfProduct {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending Lighters");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement ProductElement = driver.findElement(By.xpath("//span[contains(text(),'Crocodile Dragon Tiger') and contains(text(),'Pack of 1')]"));
		String ProductName = ProductElement.getText();
		System.out.println(ProductName);
		
	}

}
