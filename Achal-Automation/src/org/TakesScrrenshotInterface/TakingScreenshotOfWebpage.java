package org.TakesScrrenshotInterface;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakingScreenshotOfWebpage {

	public static void main(String[] args) throws IOException, InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.yamaha-motor-india.com/");
	  Thread.sleep(5000);
	 //step-1
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 
	 //step-2
	 File src = ts.getScreenshotAs(OutputType.FILE);//File is from java

	 //step-3 
	 File dest = new File("C:\\Users\\adimn\\OneDrive\\Desktop\\scrrenshot1.png");//this is obsolute path 
	 
	 FileHandler.copy(src,dest);//FileHandler is from selenium
	 
	 
	 
	}

}
