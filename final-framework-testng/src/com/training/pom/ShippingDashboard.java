package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ShippingDashboard 
{

private WebDriver driver; 
	
	public ShippingDashboard (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu-report")
	private WebElement menuReport;   
	
	@FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]")
	private WebElement salesEle;
	
    @FindBy(xpath="//*[@id=\"menu-report\"]/ul/li[1]/ul/li[3]")
	private WebElement shipEle;
    
    @FindBy(name="filter_group")
	private WebElement SalesOrderGroupBy;
	
    @FindBy(xpath="//div//i[@class='fa fa-filter']")
	private WebElement FilterBtn;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/thead/tr/td[4]")
    private WebElement NoofOrders;
  //*[@id="content"]/div[2]/div/div[2]/div[2]/table/thead/tr/td[4]
    
    
    public void clickReport() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(menuReport).build().perform();
		Thread.sleep(2000);
			
		List<WebElement> menureplist= driver.findElements(By.id("menu-report"));
				
		 for(WebElement e: menureplist )
		 {
			   String dropdown= e.getText();
			   System.out.println("Report List:"+dropdown);
		 }  
			
	}
	
	 public void clickSales() throws InterruptedException
	 {
	    Actions act1 = new Actions(driver);
		act1.moveToElement(salesEle).click().build().perform();
		Thread.sleep(2000);
		
		List<WebElement> salesList= driver.findElements(By.xpath("//li[@id='menu-report']//li[@class='open']"));
		
		
	    for(WebElement e: salesList )
		 {
			   String dropdown1 = e.getText();
			   System.out.println("sales list:"+dropdown1);
		 }
				
	 }
	
	 public void clickShippingLink() throws InterruptedException
	 {
		 Actions act2 = new Actions(driver);
		 act2.moveToElement(shipEle).click().build().perform();
		 Thread.sleep(2000);
		 
	 }
	 
	 public void RepSalesInfo()
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
	 
	 public void NumofOrders()
	 {
		 //No.of Orders field : count the no.of total orders.
		  int rows = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr")).size();
		  int cols = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td")).size();
		  
		  System.out.println("print list of rows and cols :"+rows+" "+cols);
		  
		int ordersum=0;
		String totalship = null;
		  
		 for(int i=1;i<=rows;i++)
		  
		 {                                             //*[@id="content"]/div[2]/div/div[2]/div[2]/table/tbody/tr/td[4]
		  String temp = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr["+i+"]/td[4]")).getText();
		  String temp1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/table/tbody/tr["+i+"]/td[5]")).getText();
		  
		  int i1=Integer.parseInt(temp);
		  ordersum=ordersum+i1;
		  
		 // System.out.println(temp1);
		  
	       String[] arr1 = temp1.split("Rs.");
		  
		  for(String a :arr1)
		  {
		    //int i2=Integer.parseInt(a);
		    totalship=totalship+a;
		 
	      } 
		  	 
    }   
		 System.out.println("Total no of Orders  "+ordersum +" "+"Total Shipping cost"+totalship); 
		
		    		 
	 }
	 public void FilterBtn()
		{
			FilterBtn.click();
				
		}
	 
	 
	 
	 
	}
