package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 17",Keys.ENTER);
		WebElement addToCart = driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Silver')][1]/../../../..//button[1]"));
        addToCart.click();
       WebElement price = driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip, Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Silver')][1]/../../../..//span[text()='1,34,900']"));
        System.out.println(price.getText());
	
	
	}

}
