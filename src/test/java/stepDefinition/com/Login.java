package stepDefinition.com;

import org.testng.Assert;

import browserfactory.com.Browserclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.com.Loginpage;

public class Login {

	Loginpage page;
	
	@Given("Access the application")
	public void access_the_application() {
	    
	page=new Loginpage(Browserclass.getDriver());
			
	}

	@When("click on the Login link")
	public void click_on_the_login_link() {
	    page.Loginbtn();
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String string, String string2) {
	    System.out.println("Enter password");
	page.LoginCred(string, string2);
		
		
	//@When("I enter username and password")
	//public void i_enter_username_and_password(String string,String string2) {
	   // page.LoginCred(string, string2);
	}

	@When("click on submit button")
	public void click_on_submit_button() {
	    page.SigninBtn();
	}

	@Then("user able to view Dashboard")
	public void user_able_to_view_dashboard() {
	    Assert.assertTrue(page.DisplayValidation());
	}
}
