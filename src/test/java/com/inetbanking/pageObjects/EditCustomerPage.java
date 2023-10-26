package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
    
    WebDriver ldriver;
    
    public EditCustomerPage(WebDriver rdriver){
	
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
}
    
    @FindBy(how = How.XPATH, using="//a[normalize-space()='Edit Customer']")
	@CacheLookup
	WebElement lnkEditCustomer;
    
    @FindBy(how =How.XPATH, using="//input[@name='cusid']")
	@CacheLookup
	WebElement txtCustomerId;
    
    @FindBy(how =How.XPATH , using ="//input[@name='AccSubmit']")
	@CacheLookup
	WebElement btnSubmit;
	
    public void  ClickEditCustomer()
    {
	lnkEditCustomer.click();
	
    }

     public void CustomerId(String id) 
     {
	 txtCustomerId.sendKeys(id);
	 }
    
    public void custSubmit()
	{
		btnSubmit.click();
	}

}
