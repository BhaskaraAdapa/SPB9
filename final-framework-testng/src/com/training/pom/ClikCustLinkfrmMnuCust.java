package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClikCustLinkfrmMnuCust 
{
private WebDriver driver; 
	
	public ClikCustLinkfrmMnuCust(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="menu-customer")
		private WebElement menuCust;  
	   
	   @FindBy(xpath="//*[@id=\"menu-customer\"]/ul/li[1]")
	 	private WebElement custLink;
	
	   @FindBy(name="customer_group_id")
	 	private WebElement cstGroup;
	   
	   @FindBy(name="firstname")
	 	private WebElement cstFirstname;
	   
	   @FindBy(name="lastname")
	 	private WebElement cstLstname;
	   
	   @FindBy(name="email")
	 	private WebElement cstEmail;
	   
	   @FindBy(name="telephone")
	 	private WebElement cstTelfone;
	   
	   @FindBy(name="fax")
	 	private WebElement cstFax;
	   
	   @FindBy(id="input-password")
	 	private WebElement cstPwd;
	   
	   @FindBy(id="input-confirm")
	 	private WebElement cstConfrmPwd;
	   
	   @FindBy(id="input-newsletter")
	 	private WebElement cstNewsLtr; 
	   
	   @FindBy(id="input-status")
	 	private WebElement cstStatus;
	   
	   @FindBy(name="approved")
	 	private WebElement cstApprovd;
	   
	   @FindBy(name="safe")
	 	private WebElement cstSafe; 
	   
	   @FindBy(xpath="//*[@id=\"address-add\"]")
	  	private WebElement cstGenAddrBtn;
	   
	   @FindBy(id="input-firstname1")
	 	private WebElement cstAddrFname;
	   
	   
	   @FindBy(id="input-lastname1")
	 	private WebElement cstAddrLname; 
	   
	   @FindBy(id="input-address-11")
	 	private WebElement cstAddr1; 
	  
	   @FindBy(id="input-address-21")
	 	private WebElement cstAddr2;
	   
	   @FindBy(id="input-city1")
	 	private WebElement cstAddrCity;
	   
	   @FindBy(id="input-postcode1")
	 	private WebElement cstAddrPinCode;
	  
	   @FindBy(id="input-country1")
	 	private WebElement cstAddrContry;
	   
	   @FindBy(id="input-zone1")
	 	private WebElement cstAddrState;
	   
	   @FindBy(xpath="//button[@type='submit']")
	 	private WebElement cstGenSubmitBtn;
	   
	   
    public void ClickOnCustMenu() throws InterruptedException
    {
	   MenuCustomer m1 = new MenuCustomer(driver);
	 
	   m1.ClickOnCustMenu();
	 
    }
	 
	public void ClikCustLink()
	{
		custLink.click();
		
	}
	
	public void clickAddButton() 
	{
		MenuCustomer m1 = new MenuCustomer(driver);
		m1.ClickAddButton();
		
	}
	
	public void GeneralcstGrp(String grpname)
	{
		cstGroup.click();
		Select sel = new Select(cstGroup);
		sel.selectByVisibleText(grpname);
		
	}
	
	public void GenCstfname(String fname)
	{
		cstFirstname.sendKeys(fname);
	}

	public void GenCstLastname(String lstname)
	{
		cstLstname.sendKeys(lstname);
	}

	public void GenCstEmail(String email)
	{
		cstEmail.sendKeys(email);
	}
	
	public void GenCstTelefone(String tel)
	{
		cstTelfone.sendKeys(tel);
	}
	
	public void GenCstFax(String fax)
	{
		cstFax.sendKeys(fax);
	}
	
	public void GenCstPwd(String pwd)
	{
		cstPwd.sendKeys(pwd);
	}
	
	public void GenCstConfmPwd(String cnfmPwd)
	{
		cstConfrmPwd.sendKeys(cnfmPwd);
	}
	
	public void GenCstNewsLtr(String ltr)
	{
       Select sele = new Select(cstNewsLtr);
       sele.selectByVisibleText(ltr);
       
    }
	
	public void GenCstStatus(String stat)
	{
       Select sele = new Select(cstStatus);
       sele.selectByVisibleText(stat);
       
    }
	
	public void GenCstAproved(String aprov)
	{
       Select sele = new Select(cstApprovd);
       sele.selectByVisibleText(aprov);
    }
	
	public void GenCstSafe(String safe)
	{
       Select sele = new Select(cstSafe);
       sele.selectByVisibleText(safe);
    }
	
	public void clkonCstAddrBtn()
	{
		cstGenAddrBtn.click();
    }
	
	public void GenCstAddrFname(String AddrFname)
	{
		cstAddrFname.sendKeys(AddrFname);
	}
	
	public void GenCstAddrLname(String AddrLname)
	{
		cstAddrLname.sendKeys(AddrLname);
	}
	
	public void GenCstAddr1(String addr1)
	{
		cstAddr1.sendKeys(addr1);
	}
	
	public void GenCstAddr2(String addr2)
	{
		cstAddr2.sendKeys(addr2);
	}
	
	public void GenCstAddrCity(String addrCity)
	{
		cstAddrCity.sendKeys(addrCity);
	}
	
	public void GenCstAddrCode(String addrCode)
	{
		cstAddrPinCode.sendKeys(addrCode);
	}
		
	public void GenCstAddrCntry(String addrCountry)
	{
		
		Select sel3 = new Select(cstAddrContry);
		sel3.selectByVisibleText(addrCountry);
	}
	
	
	public void GenCstAddrState(String addrState)
	{
		Select sel3 = new Select(cstAddrState);
		sel3.selectByVisibleText(addrState);
		
	}
	
	public void ClikSubmitBtn()
	{
		cstGenSubmitBtn.click();
		
	}
	
		 
	
}
