package org.automationmodularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//Declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']") private WebElement smartphoneCheckBox1;
    @FindBy(xpath = "//h1[text()='Shopping cart']/../..//a[text()='Smartphone']/../..//input[@name='removefromcart']") private WebElement smartphoneCheckBox2;
	@FindBy(name = "updatecart") private WebElement updateCartBtn;
	@FindBy(name = "continueshopping") private WebElement continueShoppingBtn ;
	@FindBy(name = "termsofservice") private WebElement termsofserviceCheckBox ;
	@FindBy(name = "checkout") private WebElement checkoutBtn ;
	
	//Initialiozation
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//Utilization
	public WebElement getSmartphoneCheckBox1() {
		return smartphoneCheckBox1;
	}

	public WebElement getSmartphoneCheckBox2() {
		return smartphoneCheckBox2;
	}

	public WebElement getUpdateCartBtn() {
		return updateCartBtn;
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}

	public WebElement getTermsofserviceCheckBox() {
		return termsofserviceCheckBox;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	
	
	
}
