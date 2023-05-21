package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		ChromeDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//consider we are taking ss of selenium.dev webPage....

		driver.get("https://www.makemytrip.com/homestays/");

		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss3.jpg");
		
		Files.copy(src, dest);


		
		
		 
		 
		 
		 
		 

	}

}
