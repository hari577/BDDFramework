package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.fingertip.pageobjects.LoginPage;
//import com.fingertip.utilities.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberContext.TestContext;
import pageObjects.LoginPage;

public class FingerTipStepDefi {
	TestContext testContext;
	LoginPage loginPage;

	public FingerTipStepDefi(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getloginPage();
	}

	@Given("^user launches Url of fingertip$")
	public void user_launches_Url_of_fingertip() throws Throwable {
		loginPage.navigateTo_LoginPage();
	}

	@And("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		loginPage.LoginCredentials();
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		loginPage.LoginButton();
	}
	
	@Then("^user validate fingertip text in home page$")
	public void user_validate_fingertip_text_in_home_page() throws Throwable {
		loginPage.textValidation();
	}
	@Then("^user validate whether login is successful or not$")
	public void user_validate_successful_login() throws Throwable {
		loginPage.invalidtextValidation();
	}
	 @And("^user enters invalid username and password$")
	    public void invalidusername() throws Throwable
	    {
	    	loginPage.invalidLogin();
	    }
	/*
	 * @And("^I close the browser$") public void i_close_the_browser() throws
	 * Throwable { loginPage.closeBrowser(); }
	 */
}
