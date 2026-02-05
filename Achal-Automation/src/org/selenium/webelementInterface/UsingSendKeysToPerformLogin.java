package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysToPerformLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.switchTo().activeElement().sendKeys("riya12@gmail.com",Keys.TAB,"Riya@123",Keys.TAB , Keys.TAB,Keys.TAB, Keys.ENTER);
		
		
		

	}

}
