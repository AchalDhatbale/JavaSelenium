package org.selenium.webelementInterface;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsSelectedOrNot {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	
	WebElement PenChkBox = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
	WebElement BookChkBox = driver.findElement(By.xpath("//input[@value='Book']"));
	
	System.out.println(PenChkBox.isSelected()?"Pen CheckBox is selected":"Pen CheckBox is not selected");
	System.out.println(BookChkBox.isSelected()?"Book CheckBox is selected":"Book CheckBox is not selected");

}
}
