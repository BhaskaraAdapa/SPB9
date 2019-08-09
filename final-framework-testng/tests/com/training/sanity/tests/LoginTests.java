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
import com.training.pom.LoginPOM;
import com.training.pom.MenuCustomer;
import com.training.pom.ReportsDashboard;
import com.training.pom.SalesTaxDashboard;
import com.training.pom.ShippingDashboard;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.ClikCustLinkfrmMnuCust;
import com.training.pom.CustDashboard;
import com.training.pom.L2AddRewardPoints;



public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	/*
	 * private ReportsDashboard RepDashboard;
	private CustDashboard dashboard;
	private SalesTaxDashboard RepTaxboard;
	private ShippingDashboard Repshipboard;
	*/
	
    private MenuCustomer customer;
	private ClikCustLinkfrmMnuCust customlink;
	private L2AddRewardPoints rewardPont;
	
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
		//dashboard = new CustDashboard(driver);
		customer = new MenuCustomer(driver);
		customlink = new ClikCustLinkfrmMnuCust(driver);                 //MenuCustomer->Customers Link.
		rewardPont = new L2AddRewardPoints(driver);
		
			
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
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
	  
		 /*dashboard.CustomersInfo(); dashboard.menuCustDashboard();
		 * dashboard.clickOnCustomersLink(); dashboard.DeleteCust("Ankit Pal");
		 * RepDashboard.clickReport(); RepDashboard.clickSales();
		 * RepDashboard.ClickOnSalesOrders(); RepDashboard.OrderFormSection();
		 
		 * RepTaxboard.clickReport(); RepTaxboard.clickSales();
		 * RepTaxboard.ClickonSalesTaxlink(); RepTaxboard.RepSalestaxInfo();
		 * 
		 * //report sales shipping method call.
		 * Repshipboard.clickReport();
		 * Repshipboard.clickSales(); Repshipboard.clickShippingLink();
		 * Repshipboard.RepSalesInfo(); Repshipboard.NumofOrders();
		 * Repshipboard.FilterBtn();
		 */
	  	/*
	  	 customer.ClickOnCustMenu(); 
	  	 customer.ClickOnCustGroup();
		 customer.ClickAddButton();
		 customer.CustGrpName("subramanya"); 
		 customer.CustGrpDesc("surbramanyamvalli"); 
		 customer.radioButton();
		 customer.saveButton();  
		 //Customers Menu->Click on Customers link->click on Add new button->fill the all general info also addr info.
		
		  customlink.ClickOnCustMenu(); customlink.ClikCustLink();
		  customlink.clickAddButton(); customlink.GenCstfname("tulasidas");
		  customlink.GenCstLastname("adapa");
		  customlink.GenCstEmail("tulasidas@sai.com");
		  customlink.GenCstTelefone("9980909090");
		  customlink.GenCstFax("0409988998899"); customlink.GenCstPwd("vswami@123");
		  customlink.GenCstConfmPwd("vswami@123"); customlink.GenCstNewsLtr("Enabled");
		  customlink.GenCstStatus("Enabled"); customlink.GenCstAproved("Yes");
		  customlink.GenCstSafe("Yes"); Thread.sleep(5000);
		  
		  customlink.clkonCstAddrBtn(); customlink.GenCstAddrFname("tulasidas");
		  customlink.GenCstAddrLname("adapa"); customlink.GenCstAddr1("Golagamudi");
		  customlink.GenCstAddr2("HNo.2,Nellore");
		  customlink.GenCstAddrCity("GolagamudiCity");//524003
		  customlink.GenCstAddrCode("524003"); customlink.GenCstAddrCntry("India");
		  customlink.GenCstAddrState("Andhra Pradesh"); customlink.ClikSubmitBtn();
		  Thread.sleep(5000);
		 */
		 		 
		
		  rewardPont.ClickOnCustMenu(); 
		  rewardPont.ClickOnCustLink(); 
		  rewardPont.SearchCustName("Sankara"); 
		  rewardPont.ClicFiltrBtn(); 
		  rewardPont.editCustIcon(); 
		  Thread.sleep(3000); 
		  rewardPont.GenFrstName("srivallabha"); // rewardPont.CustAddrCode("534456"); 
		  rewardPont.SelectRewardPnts("Sankaraa chaarya swami kanchi kamokoti68", "45");
		  rewardPont.ClkonAddRewardsBtn(); 
		  rewardPont.saveBtn();
		  rewardPont.menuReprtOption();
	  
	  }
	 

}
