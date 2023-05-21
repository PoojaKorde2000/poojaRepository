package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvalidLoginTestCase extends Flib {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("http://127.0.0.1/login.do;jsessionid=2dekh3jhw07j2");
		
		//to read the data from external files create the obj of flib
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
		String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i,0);
		String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds",i,1);

		driver.findElement(By.name("username")).sendKeys(invalidUsername);
		driver.findElement(By.name("pwd")).sendKeys( invalidPassword);
		driver.findElement(By.id("loginButton")).click();
		}
		
		driver.close();
		
	}
}


		


	


