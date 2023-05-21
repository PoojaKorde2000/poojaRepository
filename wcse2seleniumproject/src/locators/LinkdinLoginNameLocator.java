package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinLoginNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
		 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/signup/cold-join");
        Thread.sleep(4000);
        driver.findElement(By.name("email-or-phone")).sendKeys("1234567894");
        Thread.sleep(4000);
        driver.findElement(By.name("password")).sendKeys("abcde123");
		
	}

}
