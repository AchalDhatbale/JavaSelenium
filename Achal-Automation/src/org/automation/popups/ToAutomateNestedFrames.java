package org.automation.popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateNestedFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
         
		driver.switchTo().frame("frame1");
		String ParentFrameText1 = driver.findElement(By.tagName("body")).getText();
		System.out.println(ParentFrameText1);
		
	// I want to know how many frames are there in parent frame 
		//List<WebElement> childframes = driver.findElements(By.tagName("iframe"));
		//System.out.println("there are " +childframes.size()+ " frame in parent frame");
		
		//driver.switchTo().frame(0);
		WebElement childframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(childframe);
		String ChildWindowText = driver.findElement(By.tagName("p")).getText();
		System.out.println(ChildWindowText);
		
		driver.switchTo().parentFrame();
		String ParentframeText2 = driver.findElement(By.tagName("body")).getText();
		System.out.println(ParentframeText2);
		
		
	}

}
