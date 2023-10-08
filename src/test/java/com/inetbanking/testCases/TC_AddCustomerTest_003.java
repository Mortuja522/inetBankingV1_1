package com.inetbanking.testCases;

import java.io.IOException;

//import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Username is Provideed");
		
		lp.setPassword(password);
		logger.info("Password is Provideed");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		logger.info("Providing the customer details....");
		addcust.ClickAddNewCustomer();
		addcust.custName("Mortuja");
		addcust.custGender("male");
		addcust.custDob("12", "31", "1998");
		Thread.sleep(5000);
		addcust.custAddress("Dhakabangladesh");
		addcust.custCity("Tikatuli");
		addcust.custState("Dhaka");
		addcust.custPinno("500765");
		addcust.custTelephoneno("987890091");
		
		String email = randomestring()+"@gmail.com";
		addcust.custEmailid(email);
		addcust.custPassword("abcdefg");
		addcust.custSubmit();
		Thread.sleep(3000);
		
		logger.info("Validation is Stared.....");
		boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			
			logger.info("Test Case is Passed");
			Assert.assertTrue(true);
			
			
		}
		
		else
		{
			logger.info("Test case is Failed!");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
}
