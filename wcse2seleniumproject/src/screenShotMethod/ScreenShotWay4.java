package screenShotMethod;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

import zmq.ZError.IOException;
public class ScreenShotWay4 {

	public static void main(String[] args) throws java.io.IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		EventFiringWebDriver eFW = new EventFiringWebDriver(driver);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.netflix.com/in/login");

		File src = eFW.getScreenshotAs(OutputType.FILE);

		File dest = new File("./ScreenShots/ss5.jpg");

		Files.copy(src, dest);



	}

	
	}

	



