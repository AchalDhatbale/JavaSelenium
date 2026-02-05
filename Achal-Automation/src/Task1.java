import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
   public static void main(String[] args) throws InterruptedException {

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.stayvista.com/");
   // String parentWindId = driver.getWindowHandle();
   //driver.navigate().refresh();
	//driver.findElement(By.xpath("//span[text()='Our Brands']")).click();
	  // driver.navigate().refresh();
	  // driver.findElement(By.xpath("//span[text()='Our Brands']")).click();
	  // driver.navigate().refresh();
	//driver.findElement(By.xpath("//div[text()='Lean Luxury']")).click();
	
	
	driver.findElement(By.xpath("city-page-autocomplete")).sendKeys("Mumbai");
	
	WebElement checkin = driver.findElement(By.xpath("//div[text()='Select Date'][1]"));
	checkin.click();
    driver.findElement(By.xpath("//div[text()='Jan 2026']/..//span[text()='24']")).click();
    
    WebElement checkout = driver.findElement(By.xpath("//div[text()='Select Date'][2]"));
	checkin.click();
    driver.findElement(By.xpath("//div[text()='Feb 2026']/..//span[text()='24']")).click();
    
	
	
	
	
	
}
}