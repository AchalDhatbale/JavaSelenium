package org.automationmodularFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProductFromCart_002_Test extends BaseTest {

	@Test
	public void remove_SmartPhone_From_Cart()
	{
		//Utilization
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCell_phoneslink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getSmartPhoneAddToCartBtn().click();
		
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product not added to cart successfully");
		  
		  //removing product from cart
		  //Operational method / Business Logic
		//BasePage bp = new BasePage(driver);
		  
		bp.getShoppingCart().click();
		
	   ShoppingCartPage sc = new ShoppingCartPage(driver);
	  sc.getSmartphoneCheckBox1().click();
	 sc.getUpdateCartBtn().click();
	  
	      
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//	    boolean removed = wait.until(ExpectedConditions.invisibilityOf(sc.getSmartphoneCheckBox1()));
//	    //Assert.assertTrue(removed);
//	    sa.assertAll();
//	    sa.assertAll("Product remove from cart "+removed);
	    
	   
	  
	  
  
	 // SoftAssert sa = new SoftAssert();
	 
	  try {
	       if(sc.getSmartphoneCheckBox1().isDisplayed())
	       {
	    	   Reporter.log("Product is not removed from cart ",true);
	       }
	     }
	   catch(Exception e)
	  {
		  Reporter.log("Product is  removed from cart ",true);
	  }
	   sa.assertAll();
	   
	   
	   
	}
	
	
}
