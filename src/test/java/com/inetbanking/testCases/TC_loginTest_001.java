package com.inetbanking.testCases;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_loginTest_001 extends BaseClass 
{


	@Test
	public void loginTest() throws IOException {
		
		 
		logger.info("URL is Open");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered UserName");
		lp.setPassword(password);
		logger.info("Entered  Password");
	        lp.clickSubmit();
		
	    
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login Test Passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			
			Assert.assertTrue(false);
			logger.info("login Test Failed!");
		}
	}
}
