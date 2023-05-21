package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	
				 new ChromeDriver();

	}

}
