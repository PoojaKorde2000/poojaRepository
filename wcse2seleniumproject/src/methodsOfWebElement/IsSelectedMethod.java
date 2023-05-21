package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelectedMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         
		driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		
		boolean verify = checkBox.isSelected();
		
		System.out.println(verify);
		
		checkBox.click();
		boolean verify1 = checkBox.isSelected();
		System.out.println(verify1);

	}

}
