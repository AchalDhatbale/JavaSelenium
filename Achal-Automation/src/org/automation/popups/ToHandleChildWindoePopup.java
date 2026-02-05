package org.automation.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindoePopup {

	public static void main(String[] args) {
		//closing child window
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		//String parentWindoeID = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> allWindIds = driver.getWindowHandles();
		String ExpectedTitle = "New Window";
		
		for(String wi : allWindIds)
		{
			driver.switchTo().window(wi);
			
			if(driver.getTitle().equals(ExpectedTitle))
			{
				break;
			}
		}
		driver.close();
		

	}

}
