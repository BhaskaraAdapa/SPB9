package com.training.pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class ReportsDashboard 
{

private WebDriver driver; 
	
	public ReportsDashboard (WebDriver driver) {
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
	
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[3]")
	private WebElement shipEle;
	
	@FindBy(xpath="//div/table//tr/td[3]")
	private WebElement salesOrdernum;
	
	@FindBy(xpath="//div/table//tr/td[4]")
	private WebElement salesOrderProd;
	//div/table//tr/td[3]
	
	@FindBy(name="filter_group")
	private WebElement SalesOrderGroupBy;
	
	
	public void clickReport()
	{
		
		menuReport.click();
		List<WebElement> menureplist= driver.findElements(By.id("menu-report"));
				
		 for(WebElement e: menureplist )
		 {
			   String dropdown= e.getText();
			   System.out.println("Report List:"+dropdown);
		 }
			
	}
		 
	 public void clickSales() throws InterruptedException
	 {
		salesEle.click();
		Thread.sleep(4000);
		
		List<WebElement> salesList= driver.findElements(By.xpath("//li[@id='menu-report']//li[@class='open']"));
		
		
	    for(WebElement e: salesList )
		 {
			   String dropdown1 = e.getText();
			   System.out.println("sales list:"+dropdown1);
		 }
				
		
	 }
	 
	 public void ClickOnSalesOrders()
	 {
		 salesOrders.click();
		 
		System.out.println("MenuReport->Sales->Click on Orders Link displayed.");
		
		  int rows = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr")).size();
		  int cols = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td")).size();
		  
		  System.out.println("print list of rows and cols :"+rows+" "+cols);
		  
		  int sum=0,prodsum = 0;
		  
		 for(int i=1;i<=rows;i++)
		  
		 {
		  String temp = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr["+i+"]/td[3]")).getText();
		  String temp1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
		  
		  int i1=Integer.parseInt(temp);
		  sum=sum+i1;
		  int i2=Integer.parseInt(temp1);
		  prodsum=prodsum+i2;
		 
		 } 
		 System.out.println("Total no of Orders  "+sum+"total no of Products"+prodsum);	 

		 //print total no.of products in same table.
	    
		
		 
		/* for(int i=1;i<=rows1;i++)
		 {
			 
			 String temp1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr[+i+]/td[4]")).getText();
			 
			 int i2 = Integer.parseInt(temp1);
			 sum1=sum1+i2;
		 }
		 System.out.println("Total no of Orders  "+sum1);*/
		  
	 }
	 
	 public void OrderFormSection()
	 {
		 salesOrders.click();
		 //SalesOrderGroupBy.click();
		 Select sel = new Select(SalesOrderGroupBy);
		 WebElement selected_value = sel.getFirstSelectedOption();
		 System.out.println("After slelect the value as  :"+ selected_value);
		 
	 }
	 
	 
	
		
}
	
		
	
	
