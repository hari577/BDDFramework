package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumberContext.TestContext;
import pageObjects.DecisionPage;

public class DecisionsSmokeStepDef {
	TestContext testContext;
	DecisionPage decisionpage;
	public DecisionsSmokeStepDef(TestContext context) {
		testContext = context;
		decisionpage = testContext.getPageObjectManager().getdecisionPage();
	}
	@Then("^Click on Decision Tab$")
	public void click_on_Decision_Tab() throws Throwable {
		decisionpage.clickOnDecision();
	}
	@Then("^Click on New button$")
	public void click_on_New_button() throws Throwable {
	decisionpage.clickOnNewButton();
	}
	@Then("^User select \"([^\"]*)\" frm the dropdown$")
	public void user_select_frm_the_dropdown(String dropdownvalue) throws Throwable {
	  decisionpage.dropDown(dropdownvalue);
	}
	@Then("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		decisionpage.continuebutton();
	}
	@Then("^user enters \"([^\"]*)\" in NewDecision page$")
	public void user_enters_in_NewDecision_page(String title) throws Throwable {
		decisionpage.enterTextTitle(title);
	}
	@Then("^user enters \"([^\"]*)\" in decision page$")
	public void user_enters_in_decision_page(String description) throws Throwable {
	    decisionpage.enterDescriptionText(description);
	}
	
	  @Then("^user selects \"([^\"]*)\" in date picker$")
	  public void user_selects_in_date_picker(String datepick) throws Throwable {
	  decisionpage.datePicker(datepick); 
	  }
	  @Then("^user validate \"([^\"]*)\" error message$")
	  public void text_error_message(String errmessage) throws Throwable {
		  decisionpage.textvalidate(errmessage);
	  }
	 
	 
	@Then("^user selects \"([^\"]*)\" as priority$")
	public void user_selects_as_priority(String priority) throws Throwable {
		decisionpage.priorityDropDown(priority);
	}
	@Then("^I click on share button$")
	public void i_click_on_share_button() throws Throwable {
		decisionpage.clickOnShareButton();
	}
	@Then("^I vaidate text \"([^\"]*)\" in Decision page$")
	public void i_vaidate_text_in_Decision_page(String text) throws Throwable {
		decisionpage.decisionText(text);
	}
    @And("^user selects \"([^\"]*)\" in time section$")
    public void time_in_decision_page(String tim) throws Throwable {
    	decisionpage.setTime(tim);
    }
   
}
