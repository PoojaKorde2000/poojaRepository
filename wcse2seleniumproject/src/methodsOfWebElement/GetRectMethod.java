package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		Rectangle rect = button.getRect();
		
		// get the location of webelement
		
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println("x axis :"+xaxis+" y axis :"+yaxis);
		
        //get the height and width of webelement
		int h = rect.getHeight();
		int w = rect.getWidth();
		
		System.out.println("Height :"+h+" Width :"+w);


	}

}
