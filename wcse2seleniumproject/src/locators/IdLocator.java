package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver.","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/SeleniumData/WebElement/Checkbox.html");
		driver.findElement(By.id("i1")).sendKeys("manager");
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/dell/Desktop/SeleniumData/WebElement/Username.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		
	}

}
