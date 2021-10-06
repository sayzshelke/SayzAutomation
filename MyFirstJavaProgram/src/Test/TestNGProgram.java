package Test;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNGProgram {
	 @Test
	  public void f() {
		  System.out.println("I am in Test");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("I am in Before Class");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("I am in After Class");
	  }
}
