package utitlity.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

	
	public static String Screenshot(WebDriver driver)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String value=ts.getScreenshotAs(OutputType.BASE64);
		return value;	
	}
	
	public static WebElement waitmethod(WebDriver driver,By Locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(Locator));
		return ele;
	}
	
	
	
}
