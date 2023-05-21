package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethodr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");

		WebElement usernameTB = driver.findElement(By.name("username"));

		WebElement passwordTB = driver.findElement(By.name("pwd"));

		usernameTB.sendKeys("admin");
		passwordTB.sendKeys("manager");

		Thread.sleep(2000);

		usernameTB.clear();
		Thread.sleep(2000);
		passwordTB.clear();


	}

}
