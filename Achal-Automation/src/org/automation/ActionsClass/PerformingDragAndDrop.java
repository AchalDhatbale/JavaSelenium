package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.reliancedigital.in/");
	
     WebElement button = driver.findElement(By.xpath("//button[@class='No thanks']"));
     button.click();
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\") and @aria-label]")).sendKeys("Mobiles",Keys.ENTER);
	Thread.sleep(3000);
  WebElement slider = driver.findElement(By.xpath("(//div[contains(text(),'Price')]/../..//div[@class='vue-slider-dot-handle'])[1]"));
  Thread.sleep(5000);
  action.dragAndDropBy(slider, 60, 0).perform();
  System.out.println("done");
}
}
