package WebTable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertMsg {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		//js.executeScript("alert('welcome to manipal manzoor training')");
		//js.executeScript("confirm('welcome to manipal manzoor training')");
		js.executeScript("prompt('welcome to manipal manzoor training','Yes/No')");	

	}

}
