package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	//Browser Operation
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// setSize of browser
		Dimension targetSize = new Dimension(300,450);
		driver.manage().window().setSize(targetSize);
		// setPosition of browser
		Thread.sleep(4000);
		Point targetPosition = new Point(399,546);
		driver.manage().window().setPosition(targetPosition);
		
	}
	
}
 