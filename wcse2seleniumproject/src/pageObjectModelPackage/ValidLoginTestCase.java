package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();


		//login page

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		Flib flib = new Flib();

		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));

		Thread.sleep(2000);
		hp.logOutMethod();
		
		{
			bt.tearDown();
		}
	}
}
	



