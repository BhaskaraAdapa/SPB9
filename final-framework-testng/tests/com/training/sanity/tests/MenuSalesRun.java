package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.L2MenuSalesInfo;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MenuSalesRun 
{
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private L2MenuSalesInfo mnuSales;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception 
	{
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		mnuSales = new L2MenuSalesInfo(driver);

		
			
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception 
	{
		Thread.sleep(1000);
		driver.quit();
	}
		
	  /**
	 * @throws Exception
	 */
	@Test 
	  public void validLoginTest() throws Exception {
	  loginPOM.sendUserName("admin"); 
	  loginPOM.sendPassword("admin@123");
	  loginPOM.clickLoginBtn();
	  mnuSales.MenuSalesListInfo();
	  Thread.sleep(3000);
	  mnuSales.SalesOrderAddNewBtn();
	 
	  mnuSales.SalOrdCustDetails("bhaskar", "adapa", "a.bhaskara01@gmail.com", "9902926606");
	  Thread.sleep(2000);
	  mnuSales.ClkOnContinueBtn();
	  
	  mnuSales.addProdDetails("Asus", "1");
	  Thread.sleep(3000);
	  mnuSales.clkOnAddProd();
	  Thread.sleep(3000);
	  mnuSales.clkOnProdContinue();
	  mnuSales.paymentDetails("bhaskar");
	  mnuSales.paymentDetails1("adapa");
	  mnuSales.paymentDetails2("bglore1");
	  mnuSales.paymentDetails3("bglore2");
	  mnuSales.paymentDetails4("Bangalore");
	  mnuSales.paymentDetails5("India");
	  mnuSales.paymentDetails6("Karnataka");
	  mnuSales.paymentContinueBtn();
	  
}

}