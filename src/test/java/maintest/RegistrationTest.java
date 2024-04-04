package maintest;



import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import com.Base;

import pageobject.LandingPage;
import pageobject.SignUp;

public class RegistrationTest extends Base{
	
	@Test
	public void test()
	{
		driver = getDriver();
		
		LandingPage lp = new LandingPage(driver);
		lp.signUp();
		
		SignUp sp = new SignUp(driver);
		sp.enterFname("Nirav");
		sp.enterLname("Goti");
		sp.enterEmail("nirav@gmail.com");
		sp.enterPass("Nirav@123");
		sp.enterCpass("Nirav@123");
		sp.clicksubmit();
		assertTrue(false);
	}
}
