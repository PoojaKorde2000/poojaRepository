package testNGExecuton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
	static WebDriver driver;
	@Test
	@Parameters({"browserValue", "url","Vusername","Vpassword"})
	public void method1(String browserValue,String url,String validUsername,String validPassword) {
		
		if(browserValue.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(validUsername);
			driver.findElement(By.name("pwd")).sendKeys(validPassword);
			driver.findElement(By.id("loginButton")).click();
		}
		
		else if(browserValue.equals("edge")) 
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--remote-allow-origins=*");

			WebDriver driver = new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(validUsername);
			driver.findElement(By.name("pwd")).sendKeys(validPassword);
			driver.findElement(By.id("loginButton")).click();
		}

		else 
		{
			
			System.out.println("invalid browserValue!!");
				
		}
	}
}
