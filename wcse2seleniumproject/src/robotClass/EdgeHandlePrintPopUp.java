package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeHandlePrintPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		WebDriver driver= new EdgeDriver(eo);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		
		
		//shift controls to cancel.....
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		//press entre to handle print popup....
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();

		

	}

}
