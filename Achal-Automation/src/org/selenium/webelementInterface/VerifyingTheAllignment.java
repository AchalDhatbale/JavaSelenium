package org.selenium.webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTheAllignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement EmailTB = driver.findElement(By.id("email"));
		WebElement PwdTB = driver.findElement(By.id("passContainer"));
		
		Dimension EmailTBSize = EmailTB.getSize();
		Dimension PwdTBSize = PwdTB.getSize();
		
		Point EmailTBLoc = EmailTB.getLocation();
		Point PwdTBLoc = PwdTB.getLocation();
		
		//verifying left allignment
		if(EmailTBLoc.getX() == PwdTBLoc.getX())
			System.out.println("Left side perfectly alligned");
		else
			System.out.println("Left side perfectly not alligned");
		
		//verifying right allignment
         if(EmailTBLoc.getX()+EmailTBSize.getWidth() == PwdTBLoc.getX()+PwdTBSize.getWidth())
			System.out.println("Right side perfectly alligned");
		else
			System.out.println("Right side perfectly not alligned");
		
         //Verifying overlapping
		if( PwdTBLoc.getY() - (EmailTBLoc.getY()+EmailTBSize.getHeight()) > 0 )
			System.out.println("Email textbox and password textbox are not overlapped");
		else
			System.out.println("Email textbox and password textbox are overlapped");

		
	}

}
