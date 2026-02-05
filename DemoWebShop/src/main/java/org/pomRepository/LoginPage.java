package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration 
		@FindBy(id="Email") private WebElement loginEmailTB;
		@FindBy(id="Password") private WebElement loginPasswordTB;
		@FindBy(id="RememberMe") private WebElement loginRememberMecheckBox;
		@FindBy(linkText ="Forgot password?") private WebElement loginForgotPwdLink;
		@FindBy(xpath ="//input[@value='Log in']") private WebElement loginLoginBtn;

		
		//Initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

        //Utilization
		public WebElement getLoginEmailTB() {
			return loginEmailTB;
		}


		public WebElement getLoginPasswordTB() {
			return loginPasswordTB;
		}


		public WebElement getLoginRememberMecheckBox() {
			return loginRememberMecheckBox;
		}


		public WebElement getLoginForgotPwdLink() {
			return loginForgotPwdLink;
		}


		public WebElement getloginLoginBtn() {
			return loginLoginBtn;
		}
		
		
}
