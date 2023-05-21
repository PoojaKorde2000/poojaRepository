package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ScreenShotWayEdge4 {

		
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--remote-allow-origins=*");

			WebDriver driver= new EdgeDriver(eo);
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.netflix.com/in/login");
			
			EventFiringWebDriver eFW = (EventFiringWebDriver)driver;

			File src = eFW.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/ss6.jpg");

			Files.copy(src, dest);

			

	}

}
