package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("pooja@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("smileplease");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		
	}

}
