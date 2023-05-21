package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
		driver.get("https://www.netflix.com/in/Login");
		
		WebElement usnTB = driver.findElement(By.name("userLoginId"));
		
		WebElement passTB = driver.findElement(By.name("password"));
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if (usnTB.isDisplayed())

		{
			usnTB.sendKeys("Pooja@123");

		}

		else 

		{
			System.out.println("will get exception!!");

		}

		if (passTB.isDisplayed()) 

		{
			passTB.sendKeys("pooja1234");

		}
		else 

		{
			System.out.println("will get exception!!");

		}

		if (button.isDisplayed())

		{
			button.click();

		}

		else 

		{

			System.out.println("will get exception!!!");

		}

	}

}
