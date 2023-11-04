package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass{
    
 
    @Test
    public void editCustomer() throws InterruptedException, IOException {
	
	LoginPage lp = new LoginPage(driver);
	
	lp.setUserName(username);
	logger.info("Username is Provideed");
	
	lp.setPassword(password);
	logger.info("Password is Provideed");
	lp.clickSubmit();
	Thread.sleep(3000);
	
	EditCustomerPage editcust = new EditCustomerPage(driver);
	
	logger.info("Providing the customer Id....");
	editcust.ClickEditCustomer();
	
	editcust.CustomerId("74513");
	editcust.custAccSubmit();
	Thread.sleep(3000);
	
	logger.info("Providing the update customer Information....");
	editcust.custAddress("update Dhaka");
	Thread.sleep(3000);
	editcust.custCity(" update Tikatuli");
	Thread.sleep(3000);
	editcust.custState("Dhaka");
	editcust.custSubmit();
	Thread.sleep(3000);
	
    }
    
}
