package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class LoginPage
{
WebDriver driver;
//pagefactory
@FindBy(xpath="//input[@name='username']")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement password;

@FindBy(xpath="//input[@id='Login']")
WebElement loginbutton;

@FindBy(xpath="//a[text()='Forgot Your Password?']")
WebElement forgotpassword;

@FindBy(xpath="//a[text()='Use Custom Domain']")
WebElement Custom;

@FindBy(xpath="//div[@class='slds-context-bar__item slds-context-bar_dropdown-trigger slds-dropdown-trigger slds-dropdown-trigger--click slds-no-hover']/span/span")
WebElement homeText;

@FindBy(xpath="//div[@id='theloginform']/form/div[@class='loginError']")
WebElement invalidtext;

public LoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void LoginCredentials() throws InterruptedException
{
	System.out.println("***********Execution Started****************");
	username.sendKeys(FileReaderManager.getInstance().getConfigReader().userName());
	password.sendKeys(FileReaderManager.getInstance().getConfigReader().passWord());
}
public void invalidLogin() throws Exception
{
	username.sendKeys(FileReaderManager.getInstance().getConfigReader().invalidUserName());
	password.sendKeys(FileReaderManager.getInstance().getConfigReader().invalidPassWord());
}

public void LoginButton()
{
	try
	{
	if(loginbutton.isDisplayed())
	{
		loginbutton.click();
		Thread.sleep(15000);
	}
	else
	{
		throw  new Exception("Button is not found");
	}
	}
	catch(Exception e)
	{
		System.out.println("Exception is found"+e);
	}
}	
public void navigateTo_LoginPage() throws InterruptedException {
	
	driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	Thread.sleep(3000);
}
public void textValidation() throws Exception
{
 if(homeText.isDisplayed())
      {
			 JavascriptExecutor js = (JavascriptExecutor) driver; 
			 js. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",homeText);
			 
    	  String text1=homeText.getText();
    	  String text2="Fingertip";
    	  text1.equals(text2);
    	  
		/*
		 * } else { throw new Exception("text is incorrect"); }
		 */
}}
 public void invalidtextValidation() throws Exception
 {
  if(invalidtext.isDisplayed())
       {
 			 JavascriptExecutor js = (JavascriptExecutor) driver; 
 			 js. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",invalidtext);
 			 
     	  String text1=invalidtext.getText();
     	  String text2="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
     	  text1.equals(text2);
     	  
 		/*
 		 * } else { throw new Exception("text is incorrect"); }
 		 */
 }
}
}


