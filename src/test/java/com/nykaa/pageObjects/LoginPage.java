package com.nykaa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
		
	}
	
	@FindBy(className="AccountText")
	@CacheLookup
	WebElement txtclickAccount;
	
	@FindBy(xpath="//span[@class='new-login-button new-login-button--google']")
	@CacheLookup
	WebElement txtclickGoogleAccount;	
	
	
	@FindBy(xpath="//input[@name='identifier']")
	@CacheLookup
	WebElement enterGoogleAccount;
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	@CacheLookup
	WebElement Nxtbtn;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement enterGooglePassword;
	
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	@CacheLookup
	WebElement btnLogin;
	
	
	public void clickAccount()
	{
		txtclickAccount.click();
		
	}
	public void clickGoogleAccount()
	{
		txtclickGoogleAccount.click();
		
	}
	public void enterGoogleAccount(String user)
	{
		enterGoogleAccount.sendKeys(user);
		
	}
	public void ClickNxt()
	{
		Nxtbtn.click();
		
	}
	public void enterGooglePassword(String password)
	{
		enterGooglePassword.sendKeys(password);
		
	}
	public void ClickSubmit()
	{
		btnLogin.click();
		
	}
	

}
