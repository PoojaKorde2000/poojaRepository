package assignments;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");


		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
		WebElement mobiles = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		
		WebElement priceOfMobiles = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		

			
		}
		
	}

		





	


