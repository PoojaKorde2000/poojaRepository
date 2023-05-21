package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentMouseHover {

	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

			WebDriver driver= new ChromeDriver(co);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.bluestone.com/");
			
			driver.findElement(By.id("denyBtn")).click();
			
			WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(target).perform();
			
			
			
			

	}

}
