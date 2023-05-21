package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("")).sendKeys("Pooja");
		driver.findElement(By.cssSelector("input[name*='wo']")).sendKeys("smileplz");
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();


	}

}
