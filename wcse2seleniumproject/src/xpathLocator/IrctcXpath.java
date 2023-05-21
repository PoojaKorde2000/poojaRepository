package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner')]")).sendKeys("pune");
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='PUNE JN - PUNE')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-57 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-57 ng-star-inserted' and ( text()='MUMBAI CENTRAL - MMCT')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-58 ui-inputtext ui-widget ui-state-default ')]")).click();
		driver.findElement(By.xpath("//a[.='11']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-59 ui-dropdown ui-widget')]")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and (text()='AC First Class (1A) ')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		driver.findElement(By.xpath("//button[.='Search']")).click();
		
	}

}
