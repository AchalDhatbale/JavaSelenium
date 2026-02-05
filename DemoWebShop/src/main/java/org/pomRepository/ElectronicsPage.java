package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	//Declaration
	@FindBy(xpath = "h1[text()='Electronics']") private WebElement ElectronicsText;
	@FindBy(partialLinkText = "Camera, photo") private WebElement camera_photolink;
	@FindBy(partialLinkText = "Cell phones") private WebElement cell_phoneslink;

    //Initialization
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	public WebElement getElectronicsText() {
		return ElectronicsText;
	}

	public WebElement getCamera_photolink() {
		return camera_photolink;
	}

	public WebElement getCell_phoneslink() {
		return cell_phoneslink;
	}
	
	
	
	
}
