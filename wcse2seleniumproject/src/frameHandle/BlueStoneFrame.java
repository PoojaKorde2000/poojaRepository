package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));

		driver.switchTo().frame("fc_widget");
		driver.switchTo().frame(frameElement);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));

		//WebElement chatBox = driver.findElement(By.xpath("//div[@id='chat-icon']/ancestor::div[@class='d-hotline h-btn animated zoomIn faster     ']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
        driver.switchTo().defaultContent();
        
        
        
        
	}

}
