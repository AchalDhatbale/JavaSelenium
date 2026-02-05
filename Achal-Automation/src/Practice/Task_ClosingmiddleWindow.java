package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_ClosingmiddleWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String ExpURL = "https://www.fossil.com/en-in/";
		driver.get("https://www.rolex.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fossil.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jokerandwitch.com/");
		
		Set<String> AllWindHandles = driver.getWindowHandles();
		for(String Awh : AllWindHandles)
		{
			driver.switchTo().window(Awh);
			if(driver.getCurrentUrl().equalsIgnoreCase(ExpURL))
			{
				driver.close();//not completed
			}
		}
		
		
	}
	}

