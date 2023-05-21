package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PracticeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(3000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='a-tab-heading htw-tab-heading']/ancestor::div[@class='a-tab-container a-spacing-none htw-tab-container']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='M14']")).click();

		Actions act = new Actions(driver);


        
	}

}
