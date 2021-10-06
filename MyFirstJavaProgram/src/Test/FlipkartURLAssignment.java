package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartURLAssignment {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.facebook.com/");
	  List<WebElement> alllinkElement = driver.findElements(By.xpath("//a"));
	  
	  System.out.println("No. of links " + alllinkElement.size());
	  
	  for(WebElement onelink : alllinkElement)
	  {
		  System.out.println(onelink.getText() + " - " + onelink.getAttribute("href"));
	  }
	  
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
