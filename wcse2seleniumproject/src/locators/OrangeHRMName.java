package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMName {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
        driver.findElement(By.name("username")).sendKeys("Pooja");
        Thread.sleep(4000);
        driver.findElement(By.name("password")).sendKeys("smile123");
        Thread.sleep(4000);
        driver.findElement(By.xpath("submit")).click();
       
} 	

}
