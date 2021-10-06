package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioandCheckBox2 {
	WebDriver driver;
	  @Test
	  public void f() {
		  
		  driver.get("https://nichethyself.com/tourism/home.html");
		  driver.findElement(By.xpath("//a[@href='customised.html']")).click();
		  driver.switchTo().window("Customized tours");
		  
		
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
		 // driver.quit();
	  }


}
