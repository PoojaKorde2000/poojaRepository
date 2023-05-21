package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String button = driver.findElement(By.xpath("//button[text()=' Login ']")).getText();

		System.out.println(button);

		String link = driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]")).getText();

		System.out.println(link);

		  

	}

}
