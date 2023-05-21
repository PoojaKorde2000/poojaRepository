package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {
	
	//single select dropdown...

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/dell/Desktop/SeleniumData/WebElement/SingleSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		//Select sel = new Select(dropDown);
		//Thread.sleep(2000);
		//sel.selectByIndex(5);
		
		//select single optiom from multi select dropdown
	      
		Select sel = new Select(dropDown);
		
		sel.selectByIndex(8);
		
		//multi-select dropdown
		
		for (int i = 0; i<=6; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
		
		


	}

}
