package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=flipkart");
	    driver.findElement(By.id("yschsp")).sendKeys("abcd123@gmail.com");
	    Thread.sleep(2000);
	    driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=amazon");
	    driver.findElement(By.id("yschsp")).sendKeys("abcdf");
	    driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=instagram");
	    driver.findElement(By.id("yschsp")).sendKeys("fdfefgefgfef");
	    driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=facebook+login");
	    driver.findElement(By.id("yschsp")).sendKeys("@duggu");
	    driver.navigate().to("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN826G0&p=zomato");
	    driver.findElement(By.id("yschsp")).sendKeys("1334243");
	    driver.navigate().to("https://www.bing.com/search?q=uber&form=ANSPH1&refig=1da8144ade0c44b29724175ade00f200&pc=U531&sp=1&filters=ufn%3A%22Uber%22+sid%3A%228a6a4f67-6f18-895e-f565-4340f3f76bb5%22&asbe=AS&qs=MB&pq=uber&sc=10-4&cvid=1da8144ade0c44b29724175ade00f200");
	    driver.findElement(By.id("sb_form_q")).sendKeys("ggfhgfhgfrfgfg");
	    }
}
