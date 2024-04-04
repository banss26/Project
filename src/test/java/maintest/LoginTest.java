package maintest;



import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base;
import com.ExcellReader;

import pageobject.LandingPage;
import pageobject.SignIn;
import pageobject.SignUp;

public class LoginTest extends Base{
	
	@Test
	public void demo()
	{
		driver = getDriver();
		LandingPage l = new LandingPage(driver);
		l.signUp();
		assertTrue(false);
	}
	
	@Test(dataProvider = "dp")
	public void test(String uname, String pass,String title)
	{
		driver = getDriver();
		
		LandingPage lp = new LandingPage(driver);
		lp.signIn();
		
		SignIn si = new SignIn(driver);
		si.enterEmail(uname);
		si.enterPass(pass);
		si.loginButton();
		
		
		assertEquals(title, driver.getTitle());
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		ExcellReader rd  =new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\test.xlsx", "data");
		int row = rd.rowCount();
		int col = rd.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
				
		return obj;
		
	}
}
