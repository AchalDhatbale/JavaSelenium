package org.automation.groupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mahesh_Babu {

	@Test(groups = {"Pan India","South"})
	public void Launching_Mahesh_Babu() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
	
	}

}
