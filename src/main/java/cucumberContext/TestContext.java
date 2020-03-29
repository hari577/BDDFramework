package cucumberContext;


import managers.PageObjectManager;
	import managers.WebDriverManager;

	public class TestContext {
		private WebDriverManager webDriverManager;
		private PageObjectManager pageObjectManager;
		private ScenarioContext scenarioContext;
	//	public CommonMethods commonmethod;
		
		public TestContext(){
			webDriverManager = new WebDriverManager();
			pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
			scenarioContext = new ScenarioContext();
		//	commonmethod=new CommonMethods();
		}
		
		public WebDriverManager getWebDriverManager() {
			return webDriverManager;
		}
		
		public PageObjectManager getPageObjectManager() {
			return pageObjectManager;
		}
		
		public ScenarioContext getScenarioContext() {
			return scenarioContext;
		}
	/*
	 * public CommonMethods getCommonMethods() { return commonmethod; }
	 */

	}


