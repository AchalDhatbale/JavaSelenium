package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close1stAnd3rdWindow {

	public static void main(String[] args) {
		String exceptedURL = "https://www.hersheyland.in/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.parleproducts.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.hersheyland.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.cadbury.co.uk/");
		
		Set<String> WindHandle = driver.getWindowHandles();
		
		for(String ewh : WindHandle)
		{
			driver.switchTo().window(ewh);
			if(!(driver.getCurrentUrl().equalsIgnoreCase(exceptedURL)))
			{
					driver.close();
				
			}
		}

	}

}
