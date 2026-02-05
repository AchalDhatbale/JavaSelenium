package org.automation.popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//getting parent windowid
		String parentWindowid = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		//fetcting all window ids
		Set<String> allwindowids = driver.getWindowHandles();
		//removing parent window id from all windowids set so only childs window id will remains in allwindowids set
        allwindowids.remove(parentWindowid);
//		ArrayList<String> al = new ArrayList<String>(allwindowids);//you can use for each loop instead
//		String childWindowid = al.get(0);
//		driver.switchTo().window(childWindowid);
//		driver.findElement(By.id("nextStep")).click();
		
		for(String childwindowid : allwindowids)
		{
			driver.switchTo().window(childwindowid);
		}
		driver.findElement(By.id("nextStep")).click();
		
		
		
	}

}
