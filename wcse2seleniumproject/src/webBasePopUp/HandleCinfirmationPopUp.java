package webBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCinfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/dell/OneDrive/Desktop/SeleniumData/WebElement/Confirmation.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();

		System.out.println(al.getText());
		al.dismiss();
	}

}
