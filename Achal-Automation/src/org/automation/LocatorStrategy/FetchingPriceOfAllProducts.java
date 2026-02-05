package org.automation.LocatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPriceOfAllProducts {
  public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Human Brain" , Keys.ENTER);
       List<WebElement> priceElements = driver.findElements(By.className("a-price-whole"));
        
       for(WebElement priceElement:priceElements)
       {
    	   System.out.println(priceElement.getText());
       }
  }
	
}