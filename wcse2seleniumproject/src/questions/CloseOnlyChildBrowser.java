package questions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://omayo.blogspot.com/");

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		System.out.println("-----------------------------------------");
		
		Set<String> allHandles = driver.getWindowHandles();
		Thread.sleep(2000);

		for(String wh:allHandles)
		{
			
			System.out.println(wh);
			if (!parentHandle.equals(wh))
			{
				
				driver.switchTo().window(wh).close();
				
			}
			
			else 
			{
				
			}
		}

	}

}
