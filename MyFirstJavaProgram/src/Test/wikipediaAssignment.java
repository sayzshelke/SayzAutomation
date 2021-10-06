package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class wikipediaAssignment {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.wikipedia.org/");
	  driver.findElement(By.xpath("//a/*[text()='English']")).click();
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Selenium");
	  driver.findElement(By.xpath("//input[@class='searchButton']")).click();

		String Title =  driver.getTitle();
		assertEquals(Title, "Selenium - Wikipedia");
		String Heading =  driver.findElement(By.xpath("//h1[@id='firstHeading']")).getText();
		assertEquals(Heading, "Selenium");
	
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String driverExecutablePath = "C:\\Users\\Saloni\\.eclipse\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath);


	    driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
