package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadioandCheckBox {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://demoqa.com/automation-practice-form");
	WebElement Female =  driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
	if(!Female.isSelected())
	Female.click();
	if(!Female.isSelected())
		System.out.println("Female Selected"); 
	
	WebElement Music = driver.findElement(By.xpath("//label[@for = 'hobbies-checkbox-1']"));
	
	if(Music.isSelected())
	System.out.println("Music already selected");
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
