package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// Store all the WebElements of LoginPage by using @FindBy Annotation...

	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//A[@class='content users']/IMG[@class='sizer']") private WebElement usersModule;
	@FindBy(xpath = "//A[@class='content tasks']/IMG[@class='sizer']")private WebElement taskModule;
	@FindBy(xpath ="//A[@class='content tt_selected selected']/DIV[2]/IMG" )private WebElement timeTrackModule; 
	@FindBy(xpath ="//A[@class='content reports']/IMG[@class='sizer']" )private WebElement reportModule;
	
	
	
	//initalization
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	//Utilizatioon
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getUsersModule() {
		return usersModule;
	}
	public WebElement getTaskModule() {
		return taskModule;
	}
	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}
	public WebElement getReportModule() {
		return reportModule;
	} 
	
	
	
	
	//Operational method
	
	public void logOutMethod()
	{
		logoutLink.click();
	}
	
	public void usersModuleMethod()
	{
		usersModule.click();
	} 



	
}
