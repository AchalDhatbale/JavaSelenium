package org.genericlib;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {

	//to select value from dropdown
	public void selectByVisibleText(WebElement element,String visibleText)
	{
		
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		
	}
	
	
}
