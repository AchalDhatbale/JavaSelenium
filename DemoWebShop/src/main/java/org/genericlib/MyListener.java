package org.genericlib;

import java.io.File;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class MyListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Testcase "+result.getName()+" has started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		  
		Reporter.log("Testcase "+result.getName()+" has successfully executed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//taking screenshot when sripts gets fails
		String ldt = LocalDate.now().toString();
		String DateTime = ldt.replaceAll(":","-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Errorshots/"+result.getName()+DateTime+".png");
		
		try {
	           FileHandler.copy(src, dest);
		    }
		catch(Exception e)
		{
			e.printStackTrace();   
		}
		
		
		Reporter.log("Testcase "+result.getName()+" is failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Testcase "+result.getName()+" is skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		Reporter.log("Testcase "+result.getName()+" has successfully pass with some percentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		Reporter.log("Testcase "+result.getName()+" is failed due to timeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("<tagName> "+context.getName()+" has started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("<tagName> "+context.getName()+" has finished",true);
	}

	
	
}
