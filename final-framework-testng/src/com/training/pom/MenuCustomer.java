package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.ClassEvent;

public class MenuCustomer {

private WebDriver driver; 
	
	public MenuCustomer(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="menu-customer")
		private WebElement menuCust;  
	   
	   @FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[2]")
	 	private WebElement custGrp;
	   
	   @FindBy(xpath="//div/a[@data-original-title='Add New']")
	   		 //*[@id=\"content\"]/div[1]/div/div/a")
		private WebElement addBtn;
	   
	   @FindBy(xpath="//div/input[@name='customer_group_description[1][name]']")
		private WebElement cstGrpName;
	   
	   @FindBy(name="customer_group_description[1][description]")
	  	private WebElement cstGrpDesc;
	   
	   @FindBy(name="approval")
	   private WebElement radioBtn;
	   
	   @FindBy(xpath="//button[@type='submit']")
	   private WebElement saveBtn;
	   
	   
	   //ClassEvent instantiate.
	   
	 
	  
	  public void ClickOnCustMenu() throws InterruptedException
	  {
			  
		 ClassEvent cls=new ClassEvent(driver);
		  
		cls.performEvent(menuCust);
		  
		Thread.sleep(2000);
		  
		List<WebElement> custMenu= driver.findElements(By.id("menu-customer"));
		
		for(WebElement we:custMenu)
		{
			String a1 = we.getText();
			System.out.println("Menu Customer List :"+a1);
			
		}
		
	  }
		public void ClickOnCustGroup() throws InterruptedException
		{
			ClassEvent cls=new ClassEvent(driver);
			cls.clickEvent(custGrp);
			
		    Thread.sleep(4000);
		}
			
		public void ClickAddButton()
		{
		  
		   addBtn.click();  
		}
		   
		public void CustGrpName(String grpname)
		{
		   cstGrpName.sendKeys(grpname);
		   System.out.println("custogropname");
		}
		  
		public void CustGrpDesc(String desc) 
		{
		   cstGrpDesc.sendKeys(desc);
		   System.out.println("custogropdesc");
		}
		  
		public void radioButton()
		{
		   radioBtn.click();
		}
		  
		public void saveButton()
		{
		   saveBtn.click();
		}
	
	}


