package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingColorOfErrorMsgInFB {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("bdfhdg",Keys.ENTER);
	WebElement ErrMsg = driver.findElement(By.linkText("Find your account and log in."));
	System.out.println(ErrMsg.getCssValue("color"));
	
}
}
