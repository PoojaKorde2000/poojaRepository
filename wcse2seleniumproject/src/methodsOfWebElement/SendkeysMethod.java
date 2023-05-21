package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("manager123");
		driver.findElement(By.name("pwd")).sendKeys("admin123");
		

	}

}
