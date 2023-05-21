package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Logo & Color Scheme')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
