package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//Declaration 
	@FindBy(id="gender-male") private WebElement maleGenderRadioBtn;
	@FindBy(id="gender-female") private WebElement femaleGenderRadioBtn;
	@FindBy(id="FirstName") private WebElement firstNameTB;
	@FindBy(id="LastName") private WebElement lastNameTB;
	@FindBy(id="Email") private WebElement RegisterEmailTB;
	@FindBy(id="Password") private WebElement registerPasswordBtn;
	@FindBy(id="ConfirmPassword") private WebElement registerConfirmPasswordBtn;
	@FindBy(id="register-button") private WebElement RegisterRgisterBtn;

	//Initialization
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements (driver,this);
	}

	
    //Utilization
	public WebElement getMaleGenderRadioBtn() {
		return maleGenderRadioBtn;
	}

	public WebElement getFemaleGenderRadioBtn() {
		return femaleGenderRadioBtn;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getEmailTB() {
		return RegisterEmailTB;
	}

	public WebElement getPasswordBtn() {
		return registerPasswordBtn;
	}

	public WebElement getConfirmPasswordBtn() {
		return registerConfirmPasswordBtn;
	}

	public WebElement getRegisterBtn() {
		return RegisterRgisterBtn;
	}
	
	
}