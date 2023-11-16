package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass {
	
	
	@Test
	public void deleteCustomer() throws InterruptedException {
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Username is Provideed");
		
		lp.setPassword(password);
		logger.info("Password is Provideed");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		
		DeleteCustomerPage deletecust = new DeleteCustomerPage(driver);
		
		logger.info("Providing the customer Id....");
		deletecust.ClickDeleteCustomer();
		
		deletecust.CustomerId("31994");
		deletecust.custAccSubmit();
		Thread.sleep(3000);
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		logger.info("Alart  accept");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}

}
