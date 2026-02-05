package org.automationmodularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	//Declaration
	
	@FindBy(id  ="billing-address-select") private WebElement billinAdressDropDown;
    @FindBy(id  ="BillingNewAddress_CountryId") private WebElement billinAdressCounryDropDown;
	@FindBy(id  ="BillingNewAddress_City") private WebElement CityTB;
	@FindBy(id  ="BillingNewAddress_Address1") private WebElement Address1;
	@FindBy(id  ="BillingNewAddress_ZipPostalCode") private WebElement ZipCode;
	@FindBy(id  ="BillingNewAddress_PhoneNumber") private WebElement PhoneNumber;
	@FindBy(xpath  ="//input[@onclick='Billing.save()']") private WebElement BillingAddressContinueBtn;
	
     @FindBy(id  ="shipping_address_id") private WebElement ShippingAddressDropnDown;
     @FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement ShippingAddressContinueBtn;
     @FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement ShippingMethodContinueBtn;
     @FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement PaymentMethodContinueBtn;
     @FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement PaymentInformationContinueBtn;
     @FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement ConfirmOrderContinueBtn;
 
	
	//Initialization
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getBillinAdressCounryDropDown() {
		return billinAdressCounryDropDown;
	}

	public WebElement getCityTB() {
		return CityTB;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getBillingAddressContinueBtn() {
		return BillingAddressContinueBtn;
	}

	public WebElement getShippingAddressDropnDown() {
		return ShippingAddressDropnDown;
	}

	public WebElement getShippingAddressContinueBtn() {
		return ShippingAddressContinueBtn;
	}

	public WebElement getShippingMethodContinueBtn() {
		return ShippingMethodContinueBtn;
	}

	public WebElement getPaymentMethodContinueBtn() {
		return PaymentMethodContinueBtn;
	}

	public WebElement getPaymentInformationContinueBtn() {
		return PaymentInformationContinueBtn;
	}

	public WebElement getConfirmOrderContinueBtn() {
		return ConfirmOrderContinueBtn;
	}
	
	public WebElement billinAdressCounryDropDown() {
		return billinAdressCounryDropDown;
	}
	

	//bussiness logic
	public void buyProduct(String city,String address1, String PostalCode, String PhoneNo)
	{
		 SelectUtility su = new SelectUtility();
		 try 
		 {
			 if(billinAdressDropDown.isDisplayed())
			 {
				 su.selectByVisibleText(billinAdressDropDown,"New Address");
			 }
		 }
		 catch(Exception e)
		 {
			 su.selectByVisibleText(billinAdressCounryDropDown, "India");
		 }
		 
		 su.selectByVisibleText(billinAdressCounryDropDown, "India");  
		   CityTB.sendKeys(city);
		   Address1.sendKeys(address1);
		   ZipCode.sendKeys(PostalCode);
		   PhoneNumber.sendKeys(PhoneNo);
		   
		  BillingAddressContinueBtn.click();
		     ShippingAddressContinueBtn.click();
		     ShippingMethodContinueBtn.click();
		    PaymentMethodContinueBtn.click();
		   PaymentInformationContinueBtn.click();
		     ConfirmOrderContinueBtn.click();
	}
/*
	public void buyProduct(String city,String address1, String PostalCode, String PhoneNo)
	{
		  String value = billinAdressDropDown.getText();
		   if(value.isBlank())
		   {
			   SelectUtility su = new SelectUtility();
			   su.selectByVisibleText(billinAdressCounryDropDown,"India");
			   
			    CityTB.sendKeys(city);
			   Address1.sendKeys(address1);
			   ZipCode.sendKeys(PostalCode);
			   PhoneNumber.sendKeys(PhoneNo);
			   
			  BillingAddressContinueBtn.click();
			     ShippingAddressContinueBtn.click();
			     ShippingMethodContinueBtn.click();
			    PaymentMethodContinueBtn.click();
			   PaymentInformationContinueBtn.click();
			     ConfirmOrderContinueBtn.click();
			   
		   }
		   else
		   {
			   SelectUtility su = new SelectUtility();
			   su.selectByVisibleText(billinAdressDropDown,"New Address");
			 
			   su.selectByVisibleText(billinAdressCounryDropDown,"India");
			   
			   CityTB.sendKeys(city);
			   Address1.sendKeys(address1);
			   ZipCode.sendKeys(PostalCode);
			   PhoneNumber.sendKeys(PhoneNo);
			   
			  BillingAddressContinueBtn.click();
			     ShippingAddressContinueBtn.click();
			     ShippingMethodContinueBtn.click();
			    PaymentMethodContinueBtn.click();
			     PaymentInformationContinueBtn.click();
			     ConfirmOrderContinueBtn.click();
		   }
	*/	   
		
//		SelectUtility su = new SelectUtility();
//		   su.selectByVisibleText(billinAdressCounryDropDown,"India");
//		   
//		   
//		   
//		   CityTB.sendKeys(city);
//		   Address1.sendKeys(address1);
//		   ZipCode.sendKeys(PostalCode);
//		   PhoneNumber.sendKeys(PhoneNo);
//		   
//		  BillingAddressContinueBtn.click();
//		     ShippingAddressContinueBtn.click();
//		     ShippingMethodContinueBtn.click();
//		    PaymentMethodContinueBtn.click();
//		  //  PaymentMethodContinueBtn.click();
//		     PaymentInformationContinueBtn.click();
//		     ConfirmOrderContinueBtn.click();
//		   
	}

	




	


