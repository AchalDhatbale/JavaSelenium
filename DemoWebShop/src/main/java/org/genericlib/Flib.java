package org.genericlib;
import static org.genericlib.FrameWorkConstants.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * The class Flib is used mainly to interact with the file and fetch the test data needed for automating application
 * @author Achal D
 */
public class Flib {
	/**
	 * This method accepts the key and it will fetch the value of the respective key from the give property file 
	 * @param key[String]
	 * @return value[String]
	 */
	public static String getPropertyValue(String propPath , String key)
	{
		File file = new File(propPath);
		
		FileInputStream fis = null;
		try {
		      fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		  Properties prop = new Properties();
		  
		try{
		     prop.load(fis);
		  }
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
			String value = prop.getProperty(key);
			return value;
		
	}
	
	public static String getWorkbookCellValue(String excelPath, String SheetName, int rowIndex, int cellIndex)
	{
		File file = new File(excelPath);
		FileInputStream fis = null;
		Workbook wb=null;
		try
		{
	     	fis = new FileInputStream(file);
		  wb = WorkbookFactory.create(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e) 
		{
			e.printStackTrace();
		}
		
		String value = wb.getSheet(SheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return value;
		
		
	}
	
	public static String getNumericCellvalueMethod(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		double data = cell.getNumericCellValue();
		
		int data1 = (int)data;
		String value = String.valueOf(data1);
		return value;
	}
	
	public static int generateRandomNo()
	{
		Random random = new Random();
	     int random4No = random.nextInt(1000,9999);//it will give value in between 1000 to 9999 i.e 4 digit number
	      return random4No;
	  
	}
 
	

}
