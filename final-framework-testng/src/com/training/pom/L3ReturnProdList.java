package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.ClassEvent;

public class L3ReturnProdList 
{
    private WebDriver driver; 
	
	public L3ReturnProdList(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="menu-sale")
	 private WebElement menuSale;  
	
     @FindBy(xpath="//*[@id=\"menu-sale\"]/ul/li[3]")
 	 private WebElement clkonReturnLnk;   
     
     @FindBy(xpath="//a[@data-original-title='Add New']")
 	 private WebElement returnsAddBtn;
     
     @FindBy(id="input-order-id")
 	 private WebElement ProdReturnOrdId;
     
     @FindBy(id="input-product")
 	 private WebElement RetProdName;
     
     @FindBy(id="input-model")
 	 private WebElement RetProdModel;
     
   //button[@type='submit']
     
     @FindBy(xpath="//button[@type='submit']")
 	 private WebElement saveBtn;
     
     
    public void ClikOnMenuSales()
    {
		ClassEvent ce = new ClassEvent(driver);
		
		ce.performEvent(menuSale);
		
		List<WebElement> menuSaleList= driver.findElements(By.id("menu-sale"));
		
		 for(WebElement e: menuSaleList )
		 {
			   String dropdown= e.getText();
			   System.out.println("Report List:"+dropdown);
		 }  
			
    }
	
	public void ClikOnReturnsLnk()
    {
		ClassEvent ce = new ClassEvent(driver);
		
		ce.clickEvent(clkonReturnLnk);
		
    }
	
	public void ReturnsProdAddBtn()
	{
		returnsAddBtn.click();
		
	}
	
	public void ReturnProdOrdrId(String OrdId)
	{
		
		ProdReturnOrdId.sendKeys(OrdId);
	}
	
	public void ReturnsProdFname(String fname)
	{
		 ClikCustLinkfrmMnuCust cust = new ClikCustLinkfrmMnuCust(driver);
		 cust.GenCstfname(fname); 
		
	}
     
	public void ReturnsProdLname(String lname)
	{
		ClikCustLinkfrmMnuCust cust = new ClikCustLinkfrmMnuCust(driver);
		 cust.GenCstLastname(lname);
		
	}
	
	public void ReturnsProdEmail(String email)
	{
		ClikCustLinkfrmMnuCust cust = new ClikCustLinkfrmMnuCust(driver);
		cust.GenCstEmail(email);
		
	}
	public void ReturnsProdTel(String tel)
	{
		ClikCustLinkfrmMnuCust cust = new ClikCustLinkfrmMnuCust(driver);
		cust.GenCstTelefone(tel);
		
	}
	
	public void ReturnsAddProdName(String prod)
	{
		
		RetProdName.sendKeys(prod);
	}
     
	
	public void ReturnsAddProdModel(String pmodel)
	{
		
		RetProdModel.sendKeys(pmodel);
	} 
	
	public void ReturnsProdSaveBtn()
	{
		saveBtn.click();
		System.out.println(" Success: You have modified returns! Message should get displayed & return product should display in Product Return List");
		
	}

}
