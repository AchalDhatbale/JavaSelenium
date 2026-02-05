package org.TakesScrrenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfWebpageUsingRelativePath {
public static void main(String[] args) throws InterruptedException, IOException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.yamaha-motor-india.com/");
	  Thread.sleep(5000);
	 //step-1
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 
	 //step-2
	 File src = ts.getScreenshotAs(OutputType.FILE);//File is from java

	 LocalDate ldt = LocalDate.now();
	 String timestamp = ldt.toString().replace(':','-');
	 
	 //step-3 
	 File dest = new File("./Errorshots/scrrenshot"+timestamp+".png");//this is Relative path 
	 
	 FileHandler.copy(src,dest);//FileHandler is from selenium
	 
}
}
