package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustDashboard<WebElements> 
{
	
private WebDriver driver; 
	

	
	public CustDashboard(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu-customer']")
	private WebElement menuCust; 
	
	//check with mentor how to call list webelements.
	/*@FindBy(xpath="//*[@id=\"menu-customer\"]")
	//private WebElements menuCustDisplay;*/                                           
	
	
	
	@FindBy(name="filter_email")
	private WebElement custEmail;
	
	
	
	@FindBy(linkText="Customers")
	private WebElement customerLink;
	
	@FindBy(name="filter_name")
	private WebElement customerName;
	
	@FindBy(id="button-filter")
	private WebElement filterCustomer;
	
	@FindBy(xpath="//input[@name='selected[]']")
	private WebElement CustCheckbox;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement DeleteBtn;
	
		
	public void menuCustDashboard()
	{
		Actions actCust = new Actions(driver);
		actCust.moveToElement(menuCust).build().perform();
	}
	
	public void clickOnCustomersLink()
	{
		Actions actCust = new Actions(driver);
		actCust.moveToElement(customerLink).click().build().perform();
		
	}
	
	public void CustomersInfo()
	{
			
		Actions actCust = new Actions(driver);
		actCust.moveToElement(menuCust).perform();
	    List<WebElement> menuCustDisplay = driver.findElements(By.xpath("//*[@id=\"menu-customer\"]"));
	    
	    for(WebElement ele:menuCustDisplay)
	  {
		  
		  String dropdown = ele.getText();
		  System.out.println("Menu Customer section display :" + dropdown);
		  
	  }
	  
		
	}
	
	public void SearchCust(String user)
	{
		customerName.sendKeys(user);
		filterCustomer.click();
		
	}

	public void DeleteCust(String user1)
	{
		String user2= user1;
		SearchCust(user2);
		CustCheckbox.click();
		DeleteBtn.click();
		String textmsg = driver.switchTo().alert().getText();
		System.out.println("Text Msg :"+textmsg);
		driver.switchTo().alert().accept();
		System.out.println(" Success: You have modified customers! Message should get displayed and Selected registered customer should get removed from Customer List");
		
			
	}
	
	
	
	
}
