package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath02 {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
			driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9764057821");
			Thread.sleep(4000);
		
	}

}
