package org.automation.groupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlluArjun {

	@Test(groups = {"Pan India","South"})
	public void Launching_AlluArjun() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
	
	}

}
