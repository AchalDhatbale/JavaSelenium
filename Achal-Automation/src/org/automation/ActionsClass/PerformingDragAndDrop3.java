package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/adimn/Downloads/DragDrop.html");
		
	   Actions action = new Actions(driver);
	   
	   WebElement draggable1 = driver.findElement(By.id("box1"));
	   WebElement droppable1 = driver.findElement(By.id("box101"));
	   action.dragAndDrop(draggable1, droppable1).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable2 = driver.findElement(By.id("box2"));
	   WebElement droppable2 = driver.findElement(By.id("box102"));
	   action.dragAndDrop(draggable2, droppable2).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable3 = driver.findElement(By.id("box3"));
	   WebElement droppable3 = driver.findElement(By.id("box103"));
	   action.dragAndDrop(draggable3, droppable3).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable4 = driver.findElement(By.id("box4"));
	   WebElement droppable4 = driver.findElement(By.id("box104"));
	   action.dragAndDrop(draggable4, droppable4).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable5 = driver.findElement(By.id("box5"));
	   WebElement droppable5 = driver.findElement(By.id("box105"));
	   action.dragAndDrop(draggable5, droppable5).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable6 = driver.findElement(By.id("box6"));
	   WebElement droppable6 = driver.findElement(By.id("box106"));
	   action.dragAndDrop(draggable6, droppable6).perform();
	   
	   Thread.sleep(2000);
	   WebElement draggable7 = driver.findElement(By.id("box7"));
	   WebElement droppable7 = driver.findElement(By.id("box107"));
	   action.dragAndDrop(draggable7, droppable7).perform();
	   
	   
       System.out.println("Done");
	}
   
	
		   
	
	
	
	
}
