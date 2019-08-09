package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.ClassEvent;

public class L2MenuSalesInfo 
{
private WebDriver driver; 
	
	public L2MenuSalesInfo(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="menu-sale")
		private WebElement menuSales;  
	
     @FindBy(xpath="//*[@id=\"menu-sale\"]/ul/li[1]/a")
 	 private WebElement SaleOrderLnk;
     
     @FindBy(xpath="//a[@data-original-title='Add New']")
 	 private WebElement SaleOrdAddBtn;
     
     @FindBy(id="input-customer")
 	 private WebElement custName;
     
   
     @FindBy(xpath="//button[@id='button-customer']")
 	 private WebElement ContinueBtn;
     
     @FindBy(id="input-product")
 	 private WebElement prodName;
     
     @FindBy(id="input-quantity")
 	 private WebElement prodQty;
   
     @FindBy(id="button-product-add")
 	 private WebElement prodAdd;
     
     @FindBy(xpath="//button[@id='button-cart']")
 	 private WebElement prodCtnue;
     
     @FindBy(xpath="//a[contains(@href,'tab-voucher')]")
 	 private WebElement Voucher;
     
     @FindBy(id="input-to-name")
 	 private WebElement vouchRecName;
     
     @FindBy(id="input-to-email")
 	 private WebElement vouchRecEmail; 
     
     @FindBy(id="input-from-name")
 	 private WebElement vouchSenName; 
     
     @FindBy(id="input-from-email")
 	 private WebElement vouchSenMail; 
     
     @FindBy(id="input-theme")
 	 private WebElement vouchThem;
     
     @FindBy(id="input-message")
 	 private WebElement vouchMsg;
     
     @FindBy(id="input-amount")
 	 private WebElement vouchAmt; 
     
     @FindBy(id="button-voucher-add ")
 	 private WebElement vouchAddBtn; 
     
     @FindBy(xpath="//button[@id='button-payment-address']")
 	 private WebElement paymentContinBtn;
     
       
 	
	 public void MenuSalesListInfo() 
	 {
		 ClassEvent env = new ClassEvent(driver);
		 env.performEvent(menuSales);
		 env.clickEvent(SaleOrderLnk);
		 
		/* List<WebElement>saleList = driver.findElements(By.id("menu-sales"));
		 for (WebElement ele :saleList)
		 {
			 String info = ele.getText();
			 System.out.println("menu sales list information: "+info);
			 
		 }*/
	 }	 
	public void SalesOrderAddNewBtn() 
	{
		SaleOrdAddBtn.click();	 
		//System.out.println("Hi click on add new btn");
			 
	}
	
	
	
	public void SalOrdCustDetails(String fnam,String lname,String mail,String tele)
	{
		
		ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
		addCust.GenCstfname(fnam);
		
		addCust.GenCstLastname(lname);
		
		addCust.GenCstEmail(mail);
		
		addCust.GenCstTelefone(tele);
					
	}
	
	public void ClkOnContinueBtn()
	{
		ContinueBtn.click();
		
	}
	
	public void addProdDetails(String prodname,String quantity) throws InterruptedException
	{
		prodName.sendKeys(prodname);
		prodQty.sendKeys(quantity);
		
			
	}
	
	public void clkOnAddProd() throws InterruptedException
	{
		prodAdd.click();
		Thread.sleep(3000);
		
	}
	
	public void clkOnProdContinue()
	{
		
		prodCtnue.click();
		
	}
	
	
	
	public void ClikonVocherSection()
	{
		Voucher.click();
	
	}
	public void enterVocherRecDetails(String recName,String recEmail)
	{
		vouchRecName.sendKeys(recName);
		vouchRecEmail.sendKeys(recEmail);
		
	}
	
	public void enterVocherSendDetails(String sendName,String sendEmail)
	{
		vouchSenName.sendKeys(sendName);
		vouchSenMail.sendKeys(sendEmail);
		
	}
	
	
	public void enterAmtDetails(String amt)
	{
		vouchAmt.sendKeys(amt);	
	}
	
	public void paymentDetails(String fnam) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
		addCust.GenCstfname(fnam);	
				
	}
	
	public void paymentDetails1(String lnam) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
		addCust.GenCstfname(lnam);	
	}
	
	public void paymentDetails2(String addr1) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
       addCust.GenCstAddr1(addr1);
	}
	
	public void paymentDetails3(String addr2) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
       addCust.GenCstAddr2(addr2);
	}
	
	public void paymentDetails4(String city) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
       addCust.GenCstAddrCity(city);
	}
	
	public void paymentDetails5(String cntry) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
       addCust.GenCstAddrCntry(cntry);
	}
	
	public void paymentDetails6(String state) 
	{
       ClikCustLinkfrmMnuCust addCust = new ClikCustLinkfrmMnuCust(driver);
		
       addCust.GenCstAddrState(state);
	}
	
	public void paymentContinueBtn()
	{
		
		paymentContinBtn.click();
	}
	
 }
	 
	
	 
	
	

