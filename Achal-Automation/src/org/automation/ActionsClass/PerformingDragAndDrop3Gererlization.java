package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop3Gererlization {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/adimn/Downloads/DragDrop.html");
		 Actions actions = new Actions(driver);
		 dragAndDrop(actions, driver);
		 System.out.println("Done");
	}
	
	public static void dragAndDrop(Actions actions,WebDriver driver) throws InterruptedException 
	{
		for(int i=1;i<=7;i++)
		{
			Thread.sleep(2000);
		    WebElement capital = driver.findElement(By.id("box"+i));
		    WebElement country = driver.findElement(By.id("box10"+i));
		    actions.dragAndDrop(capital, country).perform();
		}
	}

}
