package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
//@Listeners(TestNGFramework.MyListener.class)
public class TC_001_AddToCart extends BaseTest{

	@Test
	public void addToCart() 
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
	    driver.findElement(By.xpath("//a[text(='Smartphone']/../..//input")).click();
	    
	
	  // WebElement ProductAddedMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
	   driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	   WebElement smartphn = driver.findElement(By.linkText("Smartphone"));
	   
	   if(smartphn.isDisplayed())
	   {
		   Reporter.log("Product added to cart",true);
	   }
	   else
	   {
		   Reporter.log("Product not added to cart",true);
	   }

}
}