import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdDemoWebShop {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Riyaa");
	driver.findElement(By.id("LastName")).sendKeys("Roy");
	driver.findElement(By.id("Email")).sendKeys("riya12yu@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Riya@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Riya@123");
	driver.findElement(By.id("register-button")).click();
	
}
}
