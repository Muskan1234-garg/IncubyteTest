package com.qa.trial.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	
	public TestBase()
	{
		prop=new Properties();
		
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\mgarg48\\eclipse-workspace\\IncubyteTestTrial\\src\\main\\java\\com\\qa\\trial\\config\\config.properties");
			prop.load(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

	public static void Initialization()
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mgarg48\\eclipse-workspace\\IncubyteTestTrial\\src\\main\\java\\webdriverexe\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}

