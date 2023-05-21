package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		WebDriver driver= new EdgeDriver(eo);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1aqiuhoa4v5ra");
		
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validUsername = cell.getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis);
		Sheet sheet2 = wb.getSheet("validcreds");
		Row row2 = sheet.getRow(1);
		Cell cell2 = row.getCell(1);
		String validPassword = cell.getStringCellValue();
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		driver.quit();
		

	}

}
