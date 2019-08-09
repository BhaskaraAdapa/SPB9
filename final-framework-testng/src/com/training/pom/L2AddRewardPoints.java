package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.ClassEvent;

public class L2AddRewardPoints 
{
    private WebDriver driver; 
	
	public L2AddRewardPoints(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(name="filter_name")
	 private WebElement CstName;
	 	 
	 @FindBy(id="button-filter")
	 private WebElement filterBtn;
	 
	 
	 
	 @FindBy(xpath="//div/table/tbody/tr[1]/td[8]/a")
	 private WebElement editCustBtn;	
	
	 @FindBy(xpath="//a[@href='#tab-address1']")
	 private WebElement GenAddr1;

	 @FindBy(name="firstname")
	 private WebElement cstFirstname;
	 
	 @FindBy(id="input-postcode1")
	 private WebElement cstAddrPinCode;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement cstGenSubmitBtn;
	 
	 @FindBy(xpath="//*[text()='Reward Points' and @href='#tab-reward']")
	 private WebElement cstGenRewardPoint;
	 
	 @FindBy(id="input-reward-description")
	 private WebElement rewardsDesc;
	 
	 @FindBy(id="input-points")
	 private WebElement rewardPonts;
	 
	 @FindBy(xpath="//button[@id='button-reward']")
	 private WebElement addRewardpontsBtn;
	 
	 @FindBy(xpath="//*[@id=\"menu-report\"]")
	 private WebElement menuReprt;
	 
	 @FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/a")
	 private WebElement menuReprtOpCust;
	 
	 @FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[3]/ul/li[5]")
	 private WebElement menuRepCustSelRewar;
	 
	
	 
	  
	 public void ClickOnCustMenu() throws InterruptedException 	   
	 {
		 ClikCustLinkfrmMnuCust a = new ClikCustLinkfrmMnuCust(driver);
		 a.ClickOnCustMenu();
		 
     }
	 
	 public void ClickOnCustLink() 	   
	 {
		 ClikCustLinkfrmMnuCust b = new ClikCustLinkfrmMnuCust(driver);
		 b.ClikCustLink();
		 
     }
	 
	 public void SearchCustName(String cstName)
	 {
		 this.CstName.sendKeys(cstName);
		 
	 }
	 
	 public void ClicFiltrBtn()
	 {
		 this.filterBtn.click();
		 
	 }
	 
	 public void editCustIcon()
	 {
		 
		 this.editCustBtn.click();
	 }
	 public void GenFrstName(String name)
	 {
		
		 cstFirstname.clear();
		 cstFirstname.sendKeys(name);
		
		 
	 }
	 
		 
	 public void CustAddrCode(String Adrcode) throws InterruptedException
		{
		 
		 GenAddr1.click();
		 Thread.sleep(5000);
		 cstAddrPinCode.clear();
		 cstAddrPinCode.sendKeys(Adrcode);
		 Thread.sleep(2000);
		 
		 
		}
	 public void SelectRewardPnts(String desc,String points)
	 {
		 cstGenRewardPoint.click();
		 rewardsDesc.sendKeys(desc);
		 rewardPonts.sendKeys(points);
		 
	 }
	 public void ClkonAddRewardsBtn()
	 {
		 addRewardpontsBtn.click();
		 System.out.println("Success: You have modified customers! Message with reward points should get displayed");
	
	 }
	 
	 public void saveBtn() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 cstGenSubmitBtn.click();/// change this one.
		 System.out.println("Success: You have modified customers! Message with Customer List should get displayed");
		  
	 }
	 
	 
	 public void menuReprtOption() throws InterruptedException 
	 {
		 ClassEvent act = new ClassEvent(driver);
		 act.performEvent(menuReprt);
		 //list of report options.
		 List<WebElement> repList = driver.findElements(By.id("menu-report"));
		 for(WebElement ele:repList)
		 {
			 String options = ele.getText();
			 System.out.println("Display the menu report options :"+options);
			 
		 }
		 		 
		 Thread.sleep(3000);
		 act.clickEvent(menuReprtOpCust);
		 Thread.sleep(3000);
		 act.clickEvent(menuRepCustSelRewar);
		 Thread.sleep(3000);
		 
		 
	 }
	 
	 
}
