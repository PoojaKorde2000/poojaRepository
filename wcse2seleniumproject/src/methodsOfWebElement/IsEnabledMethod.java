package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         
		driver.get("https://www.instagram.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		boolean verifyButton = loginButton.isEnabled();
		
		System.out.println(verifyButton);
		
		driver.findElement(By.name("username")).sendKeys("hghgfhghrgfrhgh");
		driver.findElement(By.name("password")).sendKeys("hegegh123");
		
		boolean verify = loginButton.isEnabled();
		
		System.out.println(verify);

	}

}
