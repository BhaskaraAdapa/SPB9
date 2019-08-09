package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SalesTaxDashboard 
{

    private WebDriver driver; 
	
	public SalesTaxDashboard (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu-report")
	private WebElement menuReport;   
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]")
	private WebElement salesEle;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[1]")
	private WebElement salesOrders;
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[2]")
	private WebElement salesTax;	
	
	@FindBy(name="filter_group")
	private WebElement SalesOrderGroupBy;
	
	
	@FindBy(xpath="//div//i[@class='fa fa-filter']")
	private WebElement FilterBtn;
		
	public void clickReport() throws InterruptedException
	{
		menuReport.click();
		
		List<WebElement> menureplist= driver.findElements(By.id("menu-report"));
				
		 for(WebElement e: menureplist )
		 {
			   String dropdown= e.getText();
			   System.out.println("Report List:"+dropdown);
		 }  
		
		/*
		Actions act = new Actions(driver);
		act.moveToElement(menuReport).build().perform();
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(salesEle).click().build().perform();
		Thread.sleep(2000);
		Actions act2 = new Actions(driver);
		act1.moveToElement(salesOrders).click().build().perform();
		*/		
	}
	
	 public void clickSales() throws InterruptedException
	 {
		salesEle.click();
		
		Thread.sleep(3000);
		
		List<WebElement> salesList= driver.findElements(By.xpath("//li[@id='menu-report']//li[@class='open']"));
		
		
	    for(WebElement e: salesList )
		 {
			   String dropdown1 = e.getText();
			   System.out.println("sales list:"+dropdown1);
		 }
				
	 }
	
	public void ClickonSalesTaxlink()
	{
		
		salesTax.click();
		
	}
	public void RepSalestaxInfo()
	{
		//verify the Group By field list of values(Menu Rep->Click on Sales->Click on Tax link->Tax Info displayed.
		Select sel = new Select(SalesOrderGroupBy);
		List<WebElement> GroupBy_List = sel.getOptions();
		int total_list = GroupBy_List.size();
		Assert.assertEquals(total_list, 4);
		System.out.println("total list of values are :"+total_list);
		for(WebElement ele:GroupBy_List)
		{
		    String GroupBy_Values = ele.getText();
		    System.out.println(GroupBy_Values);
		}
	}	
	
	
	//Tax form section click on filter button.
	public void FilterBtn()
	{
		FilterBtn.click();
			
	}
	
}