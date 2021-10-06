package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("Hello");


String driverExecutablePath = "C:\\Users\\Saloni\\.eclipse\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", driverExecutablePath);


 WebDriver driver=new ChromeDriver();
 driver.get("https://demoqa.com");
 Thread.sleep(3000);
 driver.quit();
 System.out.println("Execution complete");

driver.findElement(By.id("12300")).findElement(By.id("2345"));

	}

}
