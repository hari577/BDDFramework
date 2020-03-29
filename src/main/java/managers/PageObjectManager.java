package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.DecisionPage;
import pageObjects.LoginPage;



public class PageObjectManager {
	private WebDriver driver;

	private LoginPage loginPage;
	private DecisionPage decisionpage;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public LoginPage getloginPage(){
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	public DecisionPage getdecisionPage()
	{
		return (decisionpage == null) ? decisionpage = new DecisionPage(driver) : decisionpage;
	}

	
}
