package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
	   Actions action = new Actions(driver);
	   WebElement draggable = driver.findElement(By.id("draggable"));
	   WebElement droppable = driver.findElement(By.id("droppable"));
	   
	   Thread.sleep(5000);
	   action.dragAndDrop(draggable, droppable).perform();
       System.out.println("Done");
       //we have to scroll webpage manually then only it works there are so many ad's on page
	}

}
