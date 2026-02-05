package org.automationmodularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
	
	//declaration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smartPhoneAddToCartBtn;
	@FindBy(xpath = "//p[text()='The product has been added to your ']") private WebElement productAddedToCartMsg;
	
	
	
	//Initialization
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//Utilization
	public WebElement getSmartPhoneAddToCartBtn() {
		return smartPhoneAddToCartBtn;
	}

	public WebElement getProductAddedToCartMsg() {
		return productAddedToCartMsg;
	}

	
}
