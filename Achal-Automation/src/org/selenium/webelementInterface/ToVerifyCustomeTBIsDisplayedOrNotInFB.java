package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCustomeTBIsDisplayedOrNotInFB {
	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			WebElement customeGenderTB = driver.findElement(By.id("custom_gender"));
			if(!customeGenderTB.isDisplayed())
			{
				driver.findElement(By.xpath("//label[text()='Custom']/input")).click();
			}
			customeGenderTB.sendKeys("LGBTQ+");
			
	}

}
