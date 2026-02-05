package org.automation.groupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salman_Khan {

	@Test(groups = {"Pan India","Bollywood"})
	public void Launching_Salman_Khan() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en.wikipedia.org/wiki/Salman_Khan");
	
	}

}
