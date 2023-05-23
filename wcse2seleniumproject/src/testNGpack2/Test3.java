package testNGpack2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void test3Method() {
	  
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		WebDriver driver= new EdgeDriver(eo);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
  }
}
