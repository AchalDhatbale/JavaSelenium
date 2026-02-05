package org.automation.groupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yash {

	@Test(groups = {"Pan India","South"})
	public void Launching_Yash() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
	
	}

}
