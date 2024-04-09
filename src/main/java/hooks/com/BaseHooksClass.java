package hooks.com;

import org.openqa.selenium.WebDriver;

import browserfactory.com.Browserclass;
import dataProvider.com.ConfigProperty;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utitlity.com.HelperClass;

public class BaseHooksClass {
	
	public WebDriver driver;
	
	@Before
	public void startBrowser()
	{
		
		System.out.println("Log Info: Browser will start now");
		driver=Browserclass.getBrowser(ConfigProperty.getProperties("BrowserName"),ConfigProperty.getProperties("appURL"));
		System.out.println("Log Info: Browse is up and Running");
		
	}
	
	@After
	public void EndBrowser()
	{
		System.out.println("Closing the browser session");
		driver.quit();
	}

	@AfterStep
	public void failureScreenshot(Scenario result)
	{
		if(result.isFailed())
		{
			String screenshot=HelperClass.Screenshot(driver);
			result.attach(screenshot, "image/png", result.getName());
		}
		
	}
}
