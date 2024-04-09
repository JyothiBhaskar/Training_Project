package pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utitlity.com.HelperClass;

public class Loginpage {
	
	
	protected WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By Loginbutton=By.xpath("//a[@id='nav-link-accountList']");
	private By MobileNumber=By.xpath("//input[@type='email']");
	private By Continue=By.xpath("//input[@id='continue']");
	private By password=By.xpath("//input[@type='password']");
	private By signinBtn=By.xpath("//input[@id='signInSubmit']");
	private By Dashboard=By.xpath("//span[contains(text(),'Deliver to')]");
	
	
	public void Loginbtn()
	{
		driver.findElement(Loginbutton).click();
	}
	
	public void LoginCred(String UserN,String Pswd)
	{
		
		HelperClass.waitmethod(driver, MobileNumber).sendKeys(UserN);
		//driver.findElement(MobileNumber).sendKeys(UserN);
		HelperClass.waitmethod(driver, Continue).click();
		//driver.findElement(Continue).click();
		HelperClass.waitmethod(driver, password).sendKeys(Pswd);
		//driver.findElement(password).sendKeys(Pswd);
	}
	
	public void SigninBtn()
	{
		HelperClass.waitmethod(driver, signinBtn).click();
		//driver.findElement(signinBtn).click();
		
	}
	public boolean DisplayValidation()
	{
		return HelperClass.waitmethod(driver, Dashboard).isDisplayed();
		//return driver.findElement(Dashboard).isDisplayed();
		
	}
	
}

