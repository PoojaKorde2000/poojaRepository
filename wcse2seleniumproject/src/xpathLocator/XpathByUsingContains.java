package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingContains {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.shine.com/registration/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("admin");
		 driver.findElement(By.id("id_email")).sendKeys("admin@123");
		 driver.findElement(By.xpath("//input[contains(@class,'mobileNo')]")).sendKeys("9764074521");
		 driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("smileplz");
		 driver.findElement(By.xpath("//button[contains(@class,'btn mb-3 align-self-end w-80 right-90')]")).click();
	}

}
