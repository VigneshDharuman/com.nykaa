package com.nykaa.testCases;

import org.testng.annotations.Test;

import com.nykaa.pageObjects.LoginPage;



public class TC_login_config extends BaseClass
{	
	
	
	@Test
	public void loginTest() throws InterruptedException
	{   	
			
		driver.get(baseURL);		
		logger.info("getting the URL");
		
		LoginPage lp =new LoginPage(driver);		
		lp.clickAccount();
		Thread.sleep(2000);
		lp.clickGoogleAccount();
		Thread.sleep(2000);
		lp.enterGoogleAccount(user);
		Thread.sleep(2000);
		lp.ClickNxt();
		Thread.sleep(2000);
		lp.enterGooglePassword(password);
		Thread.sleep(2000);
		lp.ClickSubmit();
		Thread.sleep(2000);
			
		
	}
	
	
	

}
