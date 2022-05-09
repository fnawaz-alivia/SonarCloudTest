package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class RuleLibrary extends Configuration{
	
	@Test(groups = { "Smoke" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_RuleLibrary_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		QBM.LandingOnQueryBuilderPage();
		QBM.CreateNewRuleAndGroup();
		QBM.CreateRuleChaining();
		driver.close();
	}
	}