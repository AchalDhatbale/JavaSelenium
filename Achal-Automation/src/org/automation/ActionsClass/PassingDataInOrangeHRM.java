package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 Thread.sleep(2000);
		WebElement userNameTB = driver.findElement(By.name("username"));
		WebElement passwordTB = driver.findElement(By.name("password"));
		
		 Actions actions = new Actions(driver);
		 actions.sendKeys(userNameTB, "Admin").sendKeys(passwordTB,"admin123").keyDown(Keys.ENTER).perform();
		 
//		 actions.moveToElement(userNameTB).sendKeys("Addmin").moveToElement(passwordTB).click().sendKeys("admin123").
//		 keyDown(Keys.ENTER).perform();
		
		 //run once
	}

}
