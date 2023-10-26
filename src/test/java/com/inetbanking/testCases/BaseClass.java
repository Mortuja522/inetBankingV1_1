package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;



public class BaseClass {

	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL= readconfig.getApplicationURL();
	public String username= readconfig.getUsername();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) throws InterruptedException 
	{
	        logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		
		ChromeOptions opt = new ChromeOptions();
		opt.addExtensions(new File("./Extensions/AdBlock.crx"));
		driver = new ChromeDriver(opt);
		Thread.sleep(6000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		}
	
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
			 driver = new InternetExplorerDriver();
		}
		
		else if(br.equals("gecko"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getGeckoPath());
			driver = new FirefoxDriver();
			

		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterClass	
	public void tearDown() 
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	
    public String randomestring() 
    {
		String generating = RandomStringUtils.randomAlphabetic(8).toLowerCase();
		return (generating);	
	}
	
	public static String randomNumber()
	{
		String generateString2=RandomStringUtils.randomNumeric(4);
		return (generateString2);
	}

}
