package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	
		WebDriver driver;
		
		public LandingPage(WebDriver driver) {
			this.driver = driver;
		}
		
		By signin = By.linkText("Sign In");
		By signup = By.linkText("Create an Account");
	
		public void signIn()
		{
			driver.findElement(signin).click();
		}
		
		public void signUp()
		{
			driver.findElement(signup).click();
		}
}
