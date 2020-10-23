package com.nykaa.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.nykaa.pageObjects.LoginPage;

public class TC_Fragrance extends BaseClass {
	
	
    @Test /*(dataProvider = "testdata",dataProviderClass = TC_LoginDDT.class)*/
	//@Parameters("login_or_guest")
	public void Fragrance(/*String user ,String password,String login_or_guest*/) throws InterruptedException, IOException {
		
//		if (login_or_guest.equals("login"))
//		{
//			LoginPage lp =new LoginPage(driver);		
//			lp.clickAccount();
//			Thread.sleep(2000);
//			lp.clickGoogleAccount();
//			Thread.sleep(2000);
//			lp.enterGoogleAccount(user);
//			Thread.sleep(2000);
//			lp.ClickNxt();
//			Thread.sleep(2000);
//			lp.enterGooglePassword(password);
//			Thread.sleep(2000);
//			lp.ClickSubmit();
//			Thread.sleep(2000);
//			
//		}else if (login_or_guest.equals("guest")){
//			logger.info("loging as guest");
			
//		}
		
    	 try
		 {
			logger.info("getting the URL");
		
		     WebElement hoverele = driver.findElement(By.xpath("//a[contains(text(),'fragrance')]"));
		     Actions action = new Actions(driver);
		     action.moveToElement(hoverele).build().perform();
		     Thread.sleep(1000);
		     logger.info("Hovering");
		     driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[10]/ul[1]/li[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")).click();
			 Thread.sleep(1000);
			 logger.info("clicking envy");
			
			 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(newTab.get(1));
			 logger.info("new tab");
			 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]")).click();
			 Thread.sleep(1000);
			 logger.info("select the product");
			 ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(newTab2.get(2));
			 Thread.sleep(1000);
			 logger.info("new tab");
			 Thread.sleep(1000);			
			 driver.findElement(By.xpath("//div[@class='clearfix combo-add-to-btn-section']")).click();
			 Thread.sleep(1000);	
			 logger.info("adding to bag");
			 
			 driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
			 Thread.sleep(1000);
			 logger.info("clicking the bag");
			 Thread.sleep(1000);
//			 WebElement text =driver.findElement(By.xpath("//div[@class='AddBagIcon']"));
//			 String strng = text.getText();
//			 logger.info("gechecking the value");
//			 int number = Integer.parseInt(strng);
//			 
//			 if(number>2000)
//				{
//					Assert.assertTrue(true);
//					logger.info("amount test passed");
//				}
//				else
//				{
//					captureScreen(driver,"Total");
//					Assert.assertTrue(false);
//					logger.info("Total amount");
//				}	 
			  // Store your parent window
//			    Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
//		        Iterator<String> itererator = windowId.iterator();   
//
//		        String mainWinID = itererator.next();
//		        String  newAdwinID = itererator.next();
//
//		        driver.switchTo().window(newAdwinID);
			// new Actions(driver).click(driver.findElement(By.xpath("//div[@class='modal sliding-cart-namespace animate']"))).perform();
			 //driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='modal sliding-cart-namespace animate']")));
			 WebElement featuredItem = driver.findElement(By.xpath("//div[@class='modal sliding-cart-namespace animate']"));
			 Actions a = new Actions(driver);
			 a.moveToElement(featuredItem, 1, 1).click().perform();
			 logger.info("subWindowHandler");
			 driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
			 logger.info("clicking proceed button");
			 Thread.sleep(1000);
//			 if (login_or_guest.equals("login"))
//				{
//				 
//				 driver.findElement(By.xpath("//button[@class='action-btn secondary-action']")).click();
//			     Thread.sleep(1000);
//			     driver.findElement(By.xpath("//li[@class='cash-on-delivery active']")).click(); 
//				 Thread.sleep(1000);
//				
//					
//				}else {
										
					driver.findElement(By.xpath("//button[@class='btn full big']")).click();
					logger.info("as guest ");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vignesh");
					Thread.sleep(1000);
					logger.info("Entering name");
					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vignesh@gmail.com");
					Thread.sleep(1000);
					logger.info("Entering email");
					driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9791016357");
					Thread.sleep(1000);
					logger.info("Entering number");
					driver.findElement(By.xpath("//input[@name='pinCode']")).sendKeys("600100");
					Thread.sleep(1000);
					logger.info("Entering pincode");
					driver.findElement(By.xpath("//textarea[@class='textarea-control prl10']")).sendKeys("No 3 Ramalinga Adigalar St , Periyar Nagar\r\n" + "Pallikaranai");
					Thread.sleep(1000);
					logger.info("Entering address");
					driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed big'] ")).click();
					Thread.sleep(1000);
					logger.info("clicking proceed ");
					driver.findElement(By.xpath("//li[@class='cash-on-delivery active']")).click(); 
					Thread.sleep(1000);
					logger.info("COD active");
			 }catch (Throwable e) {
				 logger.info("Exceptions happen!", e);
			 }
//				}
		
	}
	

}
