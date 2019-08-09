package WebTable;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/LatestSelenium/webtable.html");
		
		int rows = driver.findElements(By.xpath("//html/body/table/tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//html/body/table/tbody/tr/th")).size();
		
		System.out.println("print rows "+rows+" "+cols);
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td[2]")).getText()+" ");
				
			}
			
			System.out.println();
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageTitle = js.executeScript(return document.title).toString();
		
		

	}

}
