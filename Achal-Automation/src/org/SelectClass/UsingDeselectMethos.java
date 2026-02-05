package org.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeselectMethos {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	
	WebElement dropdown = driver.findElement(By.id("multiselect1"));
	Select select = new Select(dropdown);
	Thread.sleep(2000);
	
	if(select.isMultiple())
	{System.out.println("Dropdown is multiselect");}
	else
	{System.out.println("Dropdown is not multiselect");}

   List<WebElement> allOpotions = select.getOptions();
   
   for(WebElement option :allOpotions)
   {
	  String text = option.getText();
	  select.selectByVisibleText(text);
	 }
	
   Thread.sleep(2000);
   select.deselectByValue("swiftx");
   Thread.sleep(2000);
   select.deselectByVisibleText("Audi");
   Thread.sleep(2000);
   select.selectByIndex(1);
   Thread.sleep(2000);
   select.deselectAll();
   
   
   
   
	
	
	
	
	
}
}
