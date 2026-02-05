package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage {

	//declaration
	@FindBy(xpath  ="//input[@value='Continue']") private WebElement ThankYouContinueBtn ;
	@FindBy(xpath = "//Strong[text()='Your order has been successfully processed!']")private WebElement orderPlacedmsg ;
	
	   //Initialization
	    public ThankYouPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

	    //utilization
		public WebElement getThankYouContinueBtn() {
			return ThankYouContinueBtn;
		}
		
		public WebElement getorderPlacedmsg() {
			return orderPlacedmsg;
		}

		
		
}
