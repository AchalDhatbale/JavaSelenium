 package org.automationmodularFramework;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TC_BuyProduct_003_Test extends BaseTest{
	
	@Test
	public void buyProductmethod() throws EncryptedDocumentException, IOException
	{
		//Adding product to cart
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCell_phoneslink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getSmartPhoneAddToCartBtn().click();
		
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true, "Product not added to cart");
		  //if script fails then only it will print this msg in sa.assertEquals() this method
     
		  //going to shopping Cart
	      bp.getShoppingCart().click();
	     ShoppingCartPage sc = new ShoppingCartPage(driver);
	      sc.getSmartphoneCheckBox1().click();
	      sc.getTermsofserviceCheckBox().click();
	      sc.getCheckoutBtn().click();
	      
	      String city = Flib.getWorkbookCellValue("buyproductcreds",1 ,0);
	      String address1 = Flib.getWorkbookCellValue("buyproductcreds",1 ,1);
	      String postalCode = Flib.getNumericCellvalueMethod("buyproductcreds",1 ,2);
	      String contactNo= Flib.getNumericCellvalueMethod("buyproductcreds",1 ,3);
	      
	      int random4No = Flib.generateRandomNo();
		  String PhoneNo = contactNo+random4No;
		     
	        //checkout Page
		    CheckoutPage cp = new CheckoutPage(driver);
	       cp.buyProduct(city, address1, postalCode, PhoneNo);
	      
	       ThankYouPage tp = new ThankYouPage(driver);
	       WebElement msg = tp.getorderPlacedmsg();
	       sa.assertEquals(msg.isDisplayed(),true,"Product not purchased");
	     System.out.println("product purchased successfully");
	       sa.assertAll();
	
	
	
	
	
	}

}
