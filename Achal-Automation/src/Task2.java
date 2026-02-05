import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.stayvista.com/");
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Gardenéa']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("argument[0].scrollIntoview(true)",ele);
		driver.findElement(By.xpath("//p[text()='Vista Valencia Villa']/../..//img[@alt='arrow']")).click();
		
		
		ChromeDriver driver1 = new ChromeDriver();
		
		
		
	}

}
