package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollTillParticularWebElement2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver(co);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.selenium.dev/");
		 
		 WebElement logoElement = driver.findElement(By.xpath("//img[@class='w-100 shadow-1-strong rounded selenium-backer-logo']/ancestor::div[@class='row justify-content-around pt-4 pb-5 px-5']"));

		 Point point = logoElement.getLocation();
		 int xaxis = point.getX();
		 int yaxis = point.getY();
  
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 System.out.println(xaxis);
		 System.out.println(yaxis);
		 
		 jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
	}

}
