package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginIdLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.get("https://www.netflix.com/in/");
        driver.findElement(By.id("id_email_hero_fuji")).sendKeys("abcd13@gmail.com");
        driver.findElement(By.xpath("btn nmhp-cta btn-red nmhp-cta-extra-large btn-none btn-custom")).click();
	}
}
