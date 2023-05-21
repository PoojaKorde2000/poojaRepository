package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/dell/Desktop/SeleniumData/WebElement/MultiSelectDropdown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);
		
		Thread.sleep(2000);
		
		//deselect the options
		
		for(int i=0;i<8;i++)
		{
			if (i%2==0)
			{
				Thread.sleep(2000);
				sel.deselectByIndex(i);
				
			}
			else {
				System.out.println("its odd place");
			}
		}

	}

}
