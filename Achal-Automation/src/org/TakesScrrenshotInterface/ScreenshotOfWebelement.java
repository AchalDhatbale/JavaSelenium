package org.TakesScrrenshotInterface;



import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebelement {
	
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("crictet bat for men" , Keys.ENTER);
	WebElement product = driver.findElement(By.xpath("//span[contains(text(),'Ske Solid')]/../../../../.."));
	File src = product.getScreenshotAs(OutputType.FILE);	
	
	 LocalDate ldt = LocalDate.now();
	 String timestamp = ldt.toString().replace(':','-');
	 
	File dest = new File("./Errorshots/screenshot"+timestamp+".png");
	 FileHandler.copy(src,dest);//FileHandler is from selenium
	 System.out.println("screenshot captured");
}
}
