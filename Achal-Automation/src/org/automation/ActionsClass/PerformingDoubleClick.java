package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	     WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double click')]"));
		Actions actions = new Actions(driver);
		
		//1st way to double click
		//actions.doubleClick(button).perform();
		
		//2nd way to double click
		actions.moveToElement(button).doubleClick().perform();
		
		System.out.println("code completed");
	}

}
