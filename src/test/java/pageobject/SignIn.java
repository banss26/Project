package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
		
		WebDriver driver;
		public SignIn(WebDriver driver) {
			this.driver=driver;
		}
		
		
		By email = By.id("email");
		By pass = By.id("pass");
		By login = By.id("send2");
		
		
		public void enterEmail(String emailv)
		{
			driver.findElement(email).sendKeys(emailv);
		}
		
		public void enterPass(String passv)
		{
			driver.findElement(pass).sendKeys(passv);
		}
		
		public void loginButton()
		{
			driver.findElement(login).click();
		}
}
