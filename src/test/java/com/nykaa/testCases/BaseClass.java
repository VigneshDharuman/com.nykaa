package com.nykaa.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nykaa.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig =new ReadConfig();	
	
	public String baseURL = readconfig.getApplicationURL();
	public static WebDriver driver;
	public static Logger logger ;
	public String user = readconfig.getuser();
	public String password = readconfig.getpassword();
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{   				
		logger = Logger.getLogger("ecomes");		
		PropertyConfigurator.configure("Log4j.properties");		 
		
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver=new FirefoxDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(2000);
		}	
		else if (br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readconfig.getedgepath());
			driver=new EdgeDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			Thread.sleep(2000);
		}	
		driver.get(baseURL);
		
	}		
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourse =  ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(sourse, target);
		System.out.println("Screenshot taken");		
		
	}
	
	
	
	
	
	
	
	
	
	
}
