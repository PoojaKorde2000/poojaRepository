package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScenarioMouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'l-gold-coins-weight-1gms,m'))]")).click();
		
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
		
		if (coin.isDisplayed()) 
		{
		System.out.println("coin is displayed!!");	
		}
		else 
		{
			System.out.println("will get exception!!");
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
