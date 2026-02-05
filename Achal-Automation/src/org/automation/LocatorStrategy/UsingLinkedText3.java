package org.automation.LocatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkedText3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Motorola" , Keys.ENTER);
		driver.findElement(By.linkText("MOTOROLA G96 5G (Pantone Cattleya Orchid, 128 GB)")).click();

	}

}
