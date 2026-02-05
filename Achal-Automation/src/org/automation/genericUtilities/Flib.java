package org.automation.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import static org.automation.genericUtilities.FrameWorkConstants.*;

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
	public static String getPropertyValue(String key)
	{
		File file = new File(PROPERTY_PATH);
		
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
	
	public static String getWorkbookCellValue(String SheetName, int rowIndex, int cellIndex)
	{
		File file = new File(EXCEL_PATH);
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
	
	
	
	


}
