package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClassEvent

{
	Actions act1;
	
	 public ClassEvent(WebDriver driver)
	 {  
		  this.act1 =new Actions(driver);
	 }

	  
    public  void performEvent(WebElement wel)
	
    {
    	act1.moveToElement(wel).build().perform();
    		
    }
	
   public  void clickEvent(WebElement mele)
   {
	   
	 act1.moveToElement(mele).click().build().perform();
   		   
   }

  
  


}
