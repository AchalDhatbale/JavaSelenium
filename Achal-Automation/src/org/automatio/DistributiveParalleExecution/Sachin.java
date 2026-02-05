package org.automatio.DistributiveParalleExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sachin {
	
	@Test
	public void Launching_Sachin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
	
	}


}
