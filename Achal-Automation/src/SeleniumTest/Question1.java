package SeleniumTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/adimn/Downloads/Assign.html");
		String ParentWindId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
         Set<String> allWinIds = driver.getWindowHandles();
         
         String ExpectedUrl = "https://www.swiggy.com/";
         for(String childWindId : allWinIds)
         {
        	 driver.switchTo().window(childWindId);
        	 if(driver.getCurrentUrl().equalsIgnoreCase(ExpectedUrl))
        	 {
        		 driver.manage().window().maximize();
            	 Thread.sleep(2000);
            	 driver.close();
        	 }
        	 
        	 
        	 
         }
	}

}
