package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
	
	static WebDriver driver;
    public static void main(String[] args) {
		
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Select browser which u want!!!");
			String browserValue = sc.next();
			
			if (browserValue.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			
			else if (browserValue.equals("edge"))
			{
				
				 System.setProperty("webdriver.msedge,driver","./drivers/msedgedriver.exe");
				 driver=new EdgeDriver();
				 driver.manage().window().maximize();
			 }
			else 
			{
				System.out.println("Select valid browser value!!!!");
				
			}
		}

		}

	}


