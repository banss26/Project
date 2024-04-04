package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	
	WebDriver driver;
	public SignUp(WebDriver driver) {
		this.driver  = driver;
	}
	
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By email = By.id("email_address");
	By pass = By.id("password");
	By cpass = By.id("password-confirmation");
	By submit = By.xpath("//button[@title='Create an Account']");
	
	
	public void enterFname(String fnamev)
	{
		driver.findElement(fname).sendKeys(fnamev);
	}
	
	public void enterLname(String lnamev)
	{
		driver.findElement(lname).sendKeys(lnamev);
	}
	
	public void enterEmail(String emailv)
	{
		driver.findElement(email).sendKeys(emailv);
	}
	
	public void enterPass(String passv)
	{
		driver.findElement(pass).sendKeys(passv);
	}
	
	public void enterCpass(String cpassv)
	{
		driver.findElement(cpass).sendKeys(cpassv);
	}
	
	public void clicksubmit()
	{
		driver.findElement(submit).click();
	}
	
	
	
	
}
