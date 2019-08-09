package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo3 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"email\").value = 'adapa.bhaskara@gmail.com'");
		js.executeScript("document.getElementById(\"enterimg\").click();");		
		
		WebElement fname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		js.executeScript("arguments[0].value='bhaskar'",fname);
        //js.executeScript("window.ScrollBy(0,300)");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("document.getElementById(\"firstpassword\").scrollIntoView()");
		
		

	}

}
