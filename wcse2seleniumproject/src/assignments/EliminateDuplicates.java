package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
        WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/dell/Desktop/SeleniumData/WebElement/SingleSelectDropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);

		List<WebElement> allOptions = sel.getOptions();

		// to eliminate the duplicate & maintain the order of insertion we use

		// TreeSet<String> ts = new TreeSet<String>();

		HashSet<String> hs = new HashSet<String>();

		//LinkedList<String> s = new LinkedList<String>();


		// to read the list by eliminating duplicates....
		for(int i=0;i<allOptions.size();i++)
		{

			// get the options and text of options
			String op = allOptions.get(i).getText();


			// add the options & text of options 

			// ts.add(op);
			hs.add(op);
			//s.add(op);



		}

		// to read the options from set
		
		//for(String options:ts)
		for(String options:hs)
			//for(String options:s)

		{
			Thread.sleep(2000);
			System.out.println(options);

		}


	}

}
