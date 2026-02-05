package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformClickAndHold {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/adimn/Downloads/DragDrop.html");
		 Actions actions = new Actions(driver);
		WebElement capital = driver.findElement(By.id("box2"));
		WebElement country = driver.findElement(By.id("box102"));
		
		//actions.clickAndHold(capital).moveByOffset(50,50).pause(2000).moveByOffset(-50,-50).release(country).perform();
		
		actions.moveToElement(capital).clickAndHold().moveToElement(country).release().perform();
	}

}
