package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsEnabledOrNot {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	
	WebElement TB1 = driver.findElement(By.id("textbox1"));
	WebElement TB2 = driver.findElement(By.id("tb2"));
	
	System.out.println(TB1.isEnabled()?"TextBox1 one is enabled":"TextBox1 one is disabled");
	System.out.println(TB2.isEnabled()?"TextBox2 one is enabled":"TextBox2 one is disabled");

	
}
}
