package org.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingOptionsByValue {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg");
     WebElement dropdown = driver.findElement(By.id("day"));
	
	Select select = new Select(dropdown);
	List<WebElement> allopts = select.getOptions();
	
	for(WebElement option :allopts)
	{
		//not completed
	}
	
	
}
}
