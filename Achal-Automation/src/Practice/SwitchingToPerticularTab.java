package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToPerticularTab {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String expectedUrl = "https://www.fossil.com/en-in/";
		
		driver.get("https://www.rolex.com/");
        driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fossil.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jokerandwitch.com/");
		
		Set<String> AllWndIds = driver.getWindowHandles();
		
		for(String str : AllWndIds)
		{
			driver.switchTo().window(str);
			Thread.sleep(2000);
			if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl()))
			{
				break;
				
			}
			
			
			}
		
		
	}

}
