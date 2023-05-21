package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath06 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.xpath("//div[@class='_3OO5Xc']")).click();
		 
		 driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		

	}

}
