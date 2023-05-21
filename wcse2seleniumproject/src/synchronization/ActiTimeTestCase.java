package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTestCase {

	public static void main(String[] args) {
		
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		 driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		 
		String loginPageTitle =driver.getTitle();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		if (wait.until(ExpectedConditions.titleContains(loginPageTitle)))
		{
		
			System.out.println("Login page title is matched!!,Test case passed!!");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("Login page title is not matched!!,Test case failed!!");
			
		}
		
		String homePageTitle= driver.getTitle();
		
		if (wait.until(ExpectedConditions.titleContains( "actiTIME - Enter Time-Track")))
		{
			System.out.println("Home page title is matched!!,Test case passed!!");
			
		}
		
		else 
		{
			System.out.println("Home page title is not matched!!,Test case failed!!");
			
		}
		 
		 

	}

}
