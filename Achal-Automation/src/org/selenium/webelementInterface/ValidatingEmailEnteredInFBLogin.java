package org.selenium.webelementInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingEmailEnteredInFBLogin{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Email = "riya2001@gmail.com";
		driver.get("https://www.facebook.com/");
		WebElement EmailtxtBox = driver.switchTo().activeElement();
		EmailtxtBox.clear();
		//EmailtxtBox.sendKeys("fghsfsj");
		EmailtxtBox.sendKeys(Email);
		String EnteredEmail = EmailtxtBox.getAttribute("value");
		if(Email.equals(EnteredEmail))
		{System.out.println("Email has been successfully entered");}
		else
		{System.err.println("Email has not been entered");}
		
		
	}

}
