package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformingRightClick {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/");
	
     WebElement CompressPDF = driver.findElement(By.linkText("COMPRESS PDF"));
	Actions actions = new Actions(driver);
	
	
	//actions.contextClick().perform();//it will right click on (0,0) top left corner currently control is present there 
	
	//1st way to right click
	//actions.moveToElement(CompressPDF).contextClick().perform();

      //2nd way to right click 
	actions.contextClick(CompressPDF).perform();
	System.out.println("done");
}
}
