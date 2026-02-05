package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Dimension size = driver.manage().window().getSize();
		
		//driver.manage().window().maximize();
		//Dimension size = driver.manage().window().getSize();
		
		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println(width);
		System.out.println(height);
		int WindowWidth = width/4;
		System.out.println(WindowWidth);
		
		driver.get("https://www.meesho.com");
		driver.manage().window().setPosition(new Point(-8,0));
		driver.manage().window().setSize(new Dimension(WindowWidth , height));
    	Dimension size1 = driver.manage().window().getSize();
         int width1 = size1.getWidth();
//		System.out.println(size1.getHeight());
		
	//	Dimension di = new Dimension();//width height
		
         driver.switchTo().newWindow(WindowType.WINDOW);
	   driver.get("https://www.meesho.com");
	   driver.manage().window().setPosition(new Point(width1-8 ,0));
		driver.manage().window().setSize(new Dimension(WindowWidth , height));
		Dimension size2 = driver.manage().window().getSize();
        int width2 = size1.getWidth();
		
	   
//	   driver.switchTo().newWindow(WindowType.WINDOW);
//       driver.get("https://www.myntra.com");
//       driver.manage().window().setPosition(new Point(width2-8 ,0));
//		driver.manage().window().setSize(new Dimension(WindowWidth , height));
//		Dimension size3 = driver.manage().window().getSize();
//       int width3 = size1.getWidth();
//       
//    	driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.ajio.com/");
//        driver.manage().window().setPosition(new Point(width3-8 ,0));
//		driver.manage().window().setSize(new Dimension(WindowWidth , height));
		
        
		
		
		
		
		
		
	}

}
