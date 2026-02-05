package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	Actions action = new Actions(driver);
	
	WebElement ElectronicsLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
	action.moveToElement(ElectronicsLink).perform();
	action.moveByOffset(430-550,286-286).perform();
}
}
