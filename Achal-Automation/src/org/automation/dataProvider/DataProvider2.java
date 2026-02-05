package org.automation.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	
	@DataProvider(name = "InvalidCredentials")
    public String[] [] invalidLogincreds() throws EncryptedDocumentException, IOException
   {
        FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("InvalidCredentials");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;//4-1=3
        System.out.println(rowCount);//3
        int cellcount = sheet.getRow(1).getPhysicalNumberOfCells();//2
        System.out.println(cellcount);//2
        String	[] [] creds = new String [rowCount] [cellcount];// 3 2

        for(int i=1;i<=rowCount;i++) //(i=1 because in excel data start from 1 in row)
      {
          for(int j=0;j<cellcount; j++)  //(j=0 , because in excel data start from 0 in coloumm)
        	{
               creds [i-1] [j]= sheet.getRow(i).getCell(j).toString();  //for store data into creds(position)
            }
      }
	   return creds;
   }

	@Test(dataProvider = "InvalidCredentials" , dataProviderClass = org.automation.dataProvider.DataProvider2.class)
    public void invalidLogin(String email , String  password) throws InterruptedException
      {
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://demowebshop.tricentis.com/");
          driver.findElement(By.linkText("Log in")).click();
          Thread.sleep(1000);
          driver.findElement(By.id("Email")).sendKeys(email);
          Thread.sleep(1000);
          driver.findElement(By.id("Password")).sendKeys(password);
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@value='Log in']")).click();
          driver.quit();
      }
}
