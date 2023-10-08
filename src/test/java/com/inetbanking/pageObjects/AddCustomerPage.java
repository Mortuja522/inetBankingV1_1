package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	
	WebDriver ldriver;
	
	
	public AddCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how =How.NAME, using="name")
	@CacheLookup
	WebElement txtCustomername;
	
	@FindBy(how = How.NAME , using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how =How.NAME , using ="dob")
	@CacheLookup
	WebElement txtDob;
	
	@FindBy(how =How.NAME , using ="addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how =How.NAME , using ="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how =How.NAME , using ="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how =How.NAME , using ="pinno") 
	@CacheLookup
	WebElement txtPinno;
	
	@FindBy(how =How.NAME , using ="telephoneno")
	@CacheLookup
	WebElement txtTelephoneno;
	
	@FindBy(how =How.NAME , using ="emailid")
	@CacheLookup
	WebElement txtEmailid;
	
	@FindBy(how =How.NAME , using ="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how =How.NAME , using ="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void  ClickAddNewCustomer(){
		
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		
		txtCustomername.sendKeys(cname);
	}
	public void custGender(String cgender) {
		
		rdGender.click();
	}
	public void custDob(String mm,String dd , String yyyy) {
		
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yyyy);
		
	}
    public void custAddress(String caddress) {
		
    	txtAddress.sendKeys(caddress);;
	}
    
    public void custCity(String ccity) {
		
    	txtCity.sendKeys(ccity);
	}

   public void custState(String cstate){
	   
	   txtState.sendKeys(cstate);
	 }
   
   public void custPinno(String cpinno)
	{
		txtPinno.sendKeys(String.valueOf(cpinno));
	}
   
//   public void custPinno(int cpinno) //required numerical pin
//  	{
//  		txtPinno.sendKeys(String.valueOf(cpinno)); //type casting
//  	}
   
	public void custTelephoneno(String ctelephoneno)
	{
		txtTelephoneno.sendKeys(ctelephoneno);
	}
	public void custEmailid(String cmailid)
	{
		txtEmailid.sendKeys(cmailid);
	}
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	public void custSubmit()
	{
		btnSubmit.click();
	}
    

    
    
}
