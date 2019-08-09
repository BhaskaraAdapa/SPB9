package WebTable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageTitle = js.executeScript("return document.title").toString();
		
		System.out.println("page title "+pageTitle);
		
		
	}
	
}
