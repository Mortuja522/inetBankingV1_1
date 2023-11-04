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
	WebElement btnAccSubmit;
    
 
	
	@FindBy(how =How.NAME , using ="addr")
	@CacheLookup
	WebElement txtAddress,txtClearAddress;
	
	@FindBy(how =How.NAME , using ="city")
	@CacheLookup
	WebElement txtCity,txtClearCity;
	
	@FindBy(how =How.NAME , using ="state")
	@CacheLookup
	WebElement txtState,txtClearState;
	
	@FindBy(how =How.NAME , using ="telephoneno")
	@CacheLookup
	WebElement txtTelephoneno,txtClearTelephoneno;
	
	@FindBy(how =How.NAME , using ="emailid")
	@CacheLookup
	WebElement txtEmailid,txtClearEmailid;
	
	@FindBy(how =How.NAME , using ="sub")
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
    
    public void custAccSubmit()
    {
	  btnAccSubmit.click();
	  
    }
 
    public void custAddress(String caddress)
    {
	txtClearAddress.clear();
    	txtAddress.sendKeys(caddress);;
    }
    
    public void custCity(String ccity) 
    {
	txtClearCity.clear();
    	txtCity.sendKeys(ccity);
    }
    
    public void custState(String cstate)
    {
	txtClearState.clear();
	txtState.sendKeys(cstate);
    }
    
    public void custTelephoneno(String ctelephoneno)
    {
    	txtTelephoneno.sendKeys(ctelephoneno);
    }
    
    public void custEmailid(String cmailid)
    {
	
    	txtEmailid.sendKeys(cmailid);
    }
    
    public void custSubmit()
   {
   	btnSubmit.click();
   }
    

    
    
}
