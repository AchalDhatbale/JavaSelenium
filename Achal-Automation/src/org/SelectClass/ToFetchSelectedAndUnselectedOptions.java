package org.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class ToFetchSelectedAndUnselectedOptions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/adimn/Downloads/Bikes.html");
	
	WebElement dropdown = driver.findElement(By.id("Bikes"));
	Select select = new Select(dropdown);
	//not completed = use remove method
	if(select.isMultiple())
	{System.out.println("Dropdown is multiselect");}
	else
	{System.out.println("Dropdown is not multiselect");}
	
      select.selectByValue("yrx");
      select.selectByIndex(2);
      select.selectByVisibleText("Harley Davidson 440x");
      
     //to fetch all options
      System.out.println();
      System.out.println("========= All options from dropdown =========");
     List<WebElement> allOps = select.getOptions();
     for(WebElement  option : allOps)
     {
    	 System.out.println(option.getText());
     }
	
	System.out.println();
	System.out.println("====== all selected options ======");
	List<WebElement> allSelOptions = select.getAllSelectedOptions();
	for(WebElement option : allSelOptions)
    {
   	 System.out.println(option.getText());
    }
	
	System.out.println();
	System.out.println("======= deselected options are =======");
	allOps.removeAll(allSelOptions);
	 for(WebElement  option : allOps)
     {
    	 System.out.println(option.getText());
     }
	 
	 System.out.println();
	 System.out.println("first selected options is ");
	 System.out.println(select.getFirstSelectedOption().getText());
	
	
	
}
}
