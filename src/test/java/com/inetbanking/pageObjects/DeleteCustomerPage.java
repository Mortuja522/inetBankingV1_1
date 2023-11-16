package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {

	
    WebDriver ldriver;
    
    public DeleteCustomerPage(WebDriver rdriver){
	
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	
}
    
    
	@FindBy(how = How.XPATH, using="//a[normalize-space()='Delete Customer']")
	@CacheLookup
	WebElement lnkDeleteCustomer;
	
	
	@FindBy(how =How.XPATH, using="//input[@name='cusid']")
	@CacheLookup
	WebElement txtCustomerId;
	
	@FindBy(how =How.XPATH , using ="//input[@name='AccSubmit']")
	@CacheLookup
	WebElement btnAccSubmit;
	
	 public void  ClickDeleteCustomer()
	    {
		 lnkDeleteCustomer.click();
		
	    }

	     public void CustomerId(String id) 
	     {
		 txtCustomerId.sendKeys(id);
		 
	     }
	    
	    public void custAccSubmit()
	    {
		  btnAccSubmit.click();
		  
	    }
	
}