package org.automation.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name="credentils")
	public String[][] dataProvider()
	{
		String[][] data = {
				            {"abc123@gmail.com","ABC@123"},
				            {"pqr123@gmail.com","PQR@123"},
				            {"xyz123@gmail.com","XYZ@123"},
		                  };
		return data;
	}
	
	@Test(dataProvider = "credentils")
	//if data provider is not in same class its in different package then use below code
	//@Test(dataProvider = "credentils", dataprovider={packageName}.{ClassName}.class)
	public void login(String email, String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
	}

}
