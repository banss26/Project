package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base {
	
	public static WebDriver driver;
	public WebDriver getDriver()
	{
		try {
			FileInputStream fis = new FileInputStream("C:\\Chintan_work\\java\\01oct_selenium\\Project\\src\\test\\resources\\data.properties");
		
			Properties prop = new Properties();
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Chintan_work\\seleniumdata\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public void getScreenshot(String name)
	{
		TakesScreenshot ss  =(TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Chintan_work\\Files\\"+name+".png");
		
		try 
		{
			Files.copy(source, dest);
			System.out.println("Screenshot taken");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
