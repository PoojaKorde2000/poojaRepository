package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginIdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(4000);
         driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_ya_signin&prevRID=D5YDWN477HFV6ZHQBW3M&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
         driver.findElement(By.id("ap_customer_name")).sendKeys("Pooja");
         driver.findElement(By.id("ap_email")).sendKeys("smile12@gmail.com");
         driver.findElement(By.id("ap_password")).sendKeys("smile123");
         driver.findElement(By.id("ap_password_check")).sendKeys("smile123");
         driver.findElement(By.id("continue")).click();
	}

}
