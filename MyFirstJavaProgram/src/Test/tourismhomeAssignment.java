package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class tourismhomeAssignment {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	driver.get("https://nichethyself.com/tourism/home.html");  
	
	driver.findElement(By.name("username")).sendKeys("stc123");
	
	driver.findElement(By.name("password")).sendKeys("12345");
	
	driver.findElement(By.name("password")).submit();

	//driver.findElement(By.xpath("//*[@type='submit']")).submit();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  String driverExecutablePath = "C:\\Users\\Saloni\\.eclipse\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath);


	    driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
  }

  @AfterMethod
  public void afterMethod() {
  }

}
