package org.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLoginPageInNewTab {

	public static void main(String[] args) {
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		//opening login page in new window
		Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).click(loginLink).keyUp(Keys.CONTROL).perform();
	    
	  //opening login page in new tab
	  		Actions actions1 = new Actions(driver);
	  	    actions1.keyDown(Keys.SHIFT).click(loginLink).keyUp(Keys.SHIFT).perform();
	  	    
	    
		

}
}