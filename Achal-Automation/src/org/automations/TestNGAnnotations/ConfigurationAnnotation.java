package org.automations.TestNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
  @Test
  public void testcase1() {
	  Reporter.log("this is Test Case 1",true);
	}
  
  @Test
  public void testcase2() {
	  Reporter.log("this is Test Case 2",true);
	}
  
  @Test
  public void testcase3() {
	  Reporter.log("this is Test Case 3",true);
	}
  
  @BeforeMethod
  public void beforeMethd() {
	  Reporter.log("this is before method",true);
	}
  
  
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("this is before class",true);
	}
  
 @BeforeTest
  public void beforetest() {
	  Reporter.log("this is before Test",true);
	}
  
  @BeforeSuite
  public void beforeSuit() {
	  Reporter.log("this is before suite",true);
	}
  
  @AfterSuite
  public void afterSuit() {
	  Reporter.log("this is after suite",true);
	}
  
  @AfterTest
  public void afterTest() {
	  Reporter.log("this is after Test",true);
	}
  
  @AfterClass 
  public void afterClass() {
	  Reporter.log("this is after class",true);
	}
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("this is after method",true);
	}
}
