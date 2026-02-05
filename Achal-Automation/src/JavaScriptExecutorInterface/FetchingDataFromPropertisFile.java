package JavaScriptExecutorInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertisFile {
	public static void main(String[] args) throws IOException {
		File file = new File(".\\Testdata\\DWS.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		
		
		
	}

}
