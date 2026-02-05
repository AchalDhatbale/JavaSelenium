package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class PerformingClickActions {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.reliancedigital.in/");
	
     WebElement button = driver.findElement(By.xpath("//button[@class='No thanks']"));
	Actions action = new Actions(driver);
	
	//1st way to perform click
	button.click(); // fromm webelement
	
	//2nd way to perform click
	action.click(button).perform(); //from Actions class
	
	//3rd way to perform click
	action.moveToElement(button).click().perform();//from Actions class

}
}
