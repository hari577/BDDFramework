package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class DecisionPage {

	
	public DecisionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='slds-context-bar__label-action slds-p-left--none']/../../a/span[text()='Decisions']")
	WebElement decisions;
	@FindBy(xpath = "//button[@title='New Decision' and text()='New']")
	WebElement newbutton;
	@FindBy(xpath= "//div[@class='slds-form-element']/div/div/select[@class='select uiInput uiInputSelect uiInput--default uiInput--select']")
    WebElement recorddropdown;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="//input[@class='slds-input input uiInput uiInputText uiInput--default uiInput--input']")
	WebElement texttitle;
	@FindBy(xpath="//textarea[@class='slds-textarea textarea uiInput uiInputTextArea uiInput--default uiInput--textarea']")
	WebElement descriptiondecision;
	@FindBy(xpath="//a[@class='datePicker-openIcon display']")
	WebElement datepicker;
	@FindBy(xpath="//select[@class='slds-select picklist__label']")
	WebElement dateyear;
	@FindBy(xpath="//div[@class='visible DESKTOP uiDatePicker--default uiDatePicker']")
	WebElement cale;
	@FindBy(xpath="//h2[@class='monthYear']")
	List<WebElement> datemonth;
	@FindBy(xpath="//div[@class='datepicker__filter--month slds-grid slds-grid_align-spread slds-grow']/div[@class='nextLinks slds-align-middle']")
	WebElement monthch;
	@FindBy(xpath="//div[@class='site-content slds-p-around--medium qcd_wrapper']/div[2]/select[@class='select uiInput uiInputSelect uiInput--default uiInput--select']")
	WebElement prioritydrop;
	@FindBy(xpath="//div[@class='scrollable uiScrollerWrapper']")
	WebElement scrollview;
	@FindBy(xpath="//button[@class='slds-button slds-button--neutral slds-button slds-button--neutral slds-button--brand uiButton']")
	WebElement sharebutton;
	@FindBy(xpath="//div[@class='slds-align-middle decision-title-no-truncate']")
	WebElement decisiontext;
	@FindBy(xpath="//div[@class='scroller slds-datepicker']")
	WebElement dateverify;
	@FindBy(xpath="//tr[@class='calRow']")
	List<WebElement> rowtr;
	@FindBy(xpath="//div[@class='scroller slds-datepicker']/div[2]/table/tbody/tr/td[@class='uiDayInMonthCell']")
	List<WebElement> coltd;
	@FindBy(xpath="//div[@class='scroller slds-datepicker']/div[2]/table/tbody/tr[7]/td/button[text()='Today']")
	WebElement todaydate;
	@FindBy(xpath="//div[@class='scrollable uiScrollerWrapper']/div/div/div/div[3]/div/label[text()='Taxonomy']")
	WebElement taxn;
	@FindBy(xpath="//span[@class='toastMessage slds-text-heading--small forceActionsText']")
	WebElement errormessage;
	@FindBy(xpath="//div[@class='input-has-icon input-has-icon--right']")
	WebElement time;
	@FindBy(xpath="//ul[@class='datepicker--time__list']/li")
	List<WebElement> timedrop;
	
	
	
	
	
	
	public void clickOnDecision() throws Exception {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",decisions);
			  Actions hover = new Actions(driver);
			  hover.moveToElement(decisions).click().build().perform();
			  Thread.sleep(75000);
			/*
			 * JavascriptExecutor executor = (JavascriptExecutor)driver;
			 * executor.executeScript("arguments[0].click();", decisions);
			 */
		}
	
	public void clickOnNewButton() throws Exception {
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,20); WebElement
		 * ele=wait.until(ExpectedConditions.visibilityOf(newbutton));
		 * if(ele.isDisplayed()) { System.out.println("New Button is displayed"); }
		 */
		
		
		if(newbutton.isDisplayed()) { 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",newbutton);
	
			newbutton.click();
		}

	
	  else { throw new Exception("Button not found");
	  }}
	
	public void dropDown(String dropdownvalue) throws Exception {
		if(recorddropdown.isDisplayed()) {
			Select drpdecision=new Select(recorddropdown);
			drpdecision.selectByVisibleText(dropdownvalue);
		}
		else {
			throw new Exception("dropdown value not found");
		}
		}
	public void continuebutton() throws Exception {
		if(continuebutton.isDisplayed()) {
			continuebutton.click();
		}
		else {
			throw new Exception("button not found");
		}
	}
	public void enterTextTitle(String title) throws Exception {
		if(texttitle.isDisplayed()) {
			texttitle.clear();
			texttitle.click();
			texttitle.sendKeys(title);
		}
		else {
			throw new Exception("text is not found");
		}
	}
	public void enterDescriptionText(String description) throws Exception {
		if(descriptiondecision.isDisplayed()) {
			descriptiondecision.clear();
			descriptiondecision.click();
			descriptiondecision.sendKeys(description);
		}
		else {
			throw new Exception("Description field is not found");
		}
	}
	public void priorityDropDown(String priority) throws Exception
	{
		
		if(prioritydrop.isDisplayed())
		{
			/*
			 * ((JavascriptExecutor)
			 * driver).executeScript("arguments[0].scrollIntoView(true);",scrollview);
			 * Thread.sleep(2000);
			 */
			Actions ac=new Actions(driver);
			ac.moveToElement(prioritydrop);
			ac.perform();
			Thread.sleep(4000);
			Select drp=new Select(prioritydrop);
			drp.selectByVisibleText(priority);
		}
		else {
			throw new Exception("priority drop down is not found");
		}
	}
	public void clickOnShareButton() throws Exception
	{
		if(sharebutton.isDisplayed())
		{
			sharebutton.click();
		}
		else
		{
			throw new Exception("Share button not found");
		}
	}
	
	  public void datePicker(String datepick) throws Exception { 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();",taxn);
		  Thread.sleep(3000);
		  datepicker.click();
		  String datetext=todaydate.getText();
		  System.out.println(datetext);
		  if(datetext.equalsIgnoreCase(datepick))
		  {
			  todaydate.click();
		  }
		  else 
		  {
		  String date,month,year;
		  String dateArray[]=datepick.split("/"); 
		  date=dateArray[0];
		  System.out.println(date);
		  month=dateArray[1];
		  System.out.println(month);
		  year=dateArray[2]; 
		  System.out.println(year);
		  
		  if(!dateyear.getText().equals(year))
		  {
		Select drpyear=new Select(dateyear);
		drpyear.selectByVisibleText(year);
		  }		
			  Thread.sleep(4000);
		
			for(WebElement month1:datemonth)
			{
				System.out.println(month1);
	
				while(!month1.getText().equalsIgnoreCase(month))
				{
					System.out.println(month1);
					System.out.println(month);
					Actions act=new Actions(driver);
					act.moveToElement(monthch);
					monthch.click();
				}
			}
			   
			System.out.println(date);
			
			 
			Thread.sleep(2000);
			for (WebElement cell:coltd){
				   System.out.println(cell.getText());
				   if(cell.getText().equals(date)){
				   cell.click();
				   break;
				   }
				/*
				 * else { throw new Exception("entered date is incorrect"); }
				 */
				  } 
		  }
			}		
	  public void textvalidate(String errmessage) throws Exception {
		  String text=errormessage.getText();
		  System.out.println(text);
		  System.out.println(errmessage);
		  if(text.equalsIgnoreCase(errmessage))
		  {
			  System.out.println("Correct error message is dispayed");
		  }
		  else
		  {
			  throw new Exception("In correct message displayed");
		  }
		 
	  }
	  
     public void setTime(String tim) throws Exception {
    	 Thread.sleep(2000);
    	 time.click();
    	 Thread.sleep(2000);
    	 for(WebElement time1:timedrop)
    	 {
    		 String text=time1.getText();
    		 if(text.equalsIgnoreCase(tim))
    		 {
    			 time1.click();
    			 break;
    		 }
    		 
    	 }
    	 
		/*
		 * for(WebElement time1:timedrop) { System.out.println(timedrop);
		 * System.out.println(time1); if(time1.getText().equalsIgnoreCase(tim)) {
		 * time1.click(); break; } }
		 */
    	 
     }

	  public void decisionText(String text1) throws Exception{
		  Thread.sleep(50000);
		  if(decisiontext.isDisplayed())
		  {
			  JavascriptExecutor js= (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", decisiontext);
			  Thread.sleep(4000);
			  String text2=decisiontext.getText();
			  text2.equals(text1);
		  }
		  else
		  {
			  throw new Exception("Text not valid");
		  }
		  
	  }
}