package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.rolex.com/");
        driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.fossil.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://jokerandwitch.com/");
		//driver.close();
		driver.quit();
	}

}
