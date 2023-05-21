package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackAssignment {

	private static final By CheckButton = null;

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		 driver.get("https://www.shoppersstack.com/");
		 
		 driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']")).click();
		 
		 driver.findElement(By.id("Check Delivery")).sendKeys("580023");
		 
		 //apply the explicitly wait to the webelement
		 
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(CheckButton)).click();
		
	    driver.findElement(By.id("Check")).click();
		 
		 
		 
		 

	}

}
