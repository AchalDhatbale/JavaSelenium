package org.automationmodularFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest{
	
	@Test
	public void add_To_Cart_method()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCell_phoneslink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getSmartPhoneAddToCartBtn().click();
		
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product not added to cart successfully");
		  //if script fails then only it will print this msg in sa.assertEquals() this method
		  
		  sa.assertAll();
	}

}
