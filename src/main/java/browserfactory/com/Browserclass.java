package browserfactory.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserclass {
	
	
	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static WebDriver getBrowser(String BrowserName,String appURL)
	{
		if(BrowserName.equalsIgnoreCase("Chrome")||BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome")||BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome")||BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new EdgeDriver();
		}
	driver.manage().window().maximize();
	driver.get(appURL);
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

}
