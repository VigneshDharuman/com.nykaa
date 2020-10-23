package com.nykaa.testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nykaa.pageObjects.LoginPage;
import com.nykaa.utilities.XLUtils;

public class TC_LoginDDT extends BaseClass {
	
	@Test(dataProvider = "testdata")
	public void LoginDDT(String user ,String password) throws InterruptedException, IOException {
		
				
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
		
		 WebElement hoverele = driver.findElement(By.xpath("//a[contains(text(),'fragrance')]"));
	     Actions action = new Actions(driver);
	     action.moveToElement(hoverele).build().perform();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[10]/ul[1]/li[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")).click();
		 Thread.sleep(1000);
		 driver.close();
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(newTab.get(1));
		
		 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]")).click();
		 Thread.sleep(1000);
		 driver.switchTo().window(newTab.get(2));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  ']")).click();
		 Thread.sleep(1000);			
		 driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		 Thread.sleep(1000);
		 WebElement text =driver.findElement(By.xpath("//div[@class='AddBagIcon']"));
		 String strng = text.getText();
		 
		 int number = Integer.parseInt(strng);
		 
		 if(number>2000)
			{
				Assert.assertTrue(true);
				logger.info("amount test passed");
			}
			else
			{
				captureScreen(driver,"Total");
				Assert.assertTrue(false);
				logger.info("Total amount");
			}	 
		 
		 
		driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
		driver.findElement(By.xpath("//button[@class='action-btn secondary-action']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='cash-on-delivery active']")).click(); 
		Thread.sleep(1000);
		
	}
	@DataProvider(name = "testdata")
	String [][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"//src//test//java//com//nykaa//testData//testdata.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
		
		String logindata[][] =new  String [rownum][colcount];
		
		for(int i= 1;i<=rownum;i++)
		{
			for (int j = 0 ; j<colcount;j++)
			{
				logindata[i-1][j]= XLUtils.getCellData(path, "Sheet1", i, j); //1 0
				
			}
		}

		return logindata;
	}

}
