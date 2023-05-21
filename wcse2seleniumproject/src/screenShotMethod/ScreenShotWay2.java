package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//consider we are taking ss of selenium.dev webPage....
		driver.get("https://www.selenium.dev/downloads/");
		
		RemoteWebDriver rwd = (RemoteWebDriver) driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss2.png");
		
		Files.copy(src, dest);
		
		
		
		

	}

}
