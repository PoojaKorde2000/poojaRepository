package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeAssignment {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		 
		 driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		 
		if (driver.getTitle().equals("actiTIME - Login")) 
		{
			
			System.out.println("home page title is matched!!,Test case passed!!");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
		}
		
		else
		{
			System.out.println("home page title is not matched!!,Test case failed!!");
			
				
		}
		
		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) 
		{
			
			System.out.println("home page title is matched!!,Test case passed!!");
			
		}
		
		else
		{
			System.out.println("home page title is not matched!!,Test case failed!!");
			
			
		}
		 
		
		 
		 
		 
		 

	}

}
