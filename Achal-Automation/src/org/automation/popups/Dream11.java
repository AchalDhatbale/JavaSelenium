package org.automation.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		
		//1.using frame(int index)
		//driver.switchTo().frame(0);
		
		//2.using frame(String Name or Id)
		//driver.switchTo().frame("send-sms-iframe");
		
		//3. using webelement 
		WebElement frame = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("regEmail")).sendKeys("6360811699");
		driver.findElement(By.linkText("GET APP LINK")).click();
	
		//4.to bring control back to main page or default content
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
		System.out.println("done");
		
	}
}
