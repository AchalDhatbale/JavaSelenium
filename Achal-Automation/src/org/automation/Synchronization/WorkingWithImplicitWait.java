package org.automation.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithImplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userNameTB = driver.findElement(By.name("username"));
		WebElement passwordTB = driver.findElement(By.name("password"));
		
		 Actions actions = new Actions(driver);
		 actions.sendKeys(userNameTB, "Admin").sendKeys(passwordTB,"admin123").keyDown(Keys.ENTER).perform();
	}

}
