package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationModels.RuleLibraryModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class RuleLibrary extends Configuration {

	@Test(groups = { "smoke", "regression" }, priority = 1/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_RuleLibrary_001() throws InterruptedException {

		Configuration.BConfiguration();

		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		RLM.LandingOnRuleLibraryPage();

		RLM.verifySearchRuleField_RLScreen();
		RLM.verifySearchCrossButton_RLScreen();
		RLM.verifyReloadButton_RLScreen();
		RLM.verifyCreateRuleGroupButton_RLScreen();
		RLM.verifyRuleGroupInput_RLScreen();
		RLM.verifyGroupDescription_RLScreen();
		RLM.verifySaveButton_RLScreen();
		RLM.verifyCancelButton_RLScreen();
		RLM.verifyCreatedRuleGroup_RLScreen();
		
		
		RLM.verifyRuleGroupTextField_UGScreen();
		RLM.verifyUploadReferenceFile_UGScreen();
		RLM.verifyGroupDescription_UGScreen();
		RLM.verifyUpdateButton_UGScreen();
		RLM.verifyCancelButton_UGScreen();
		RLM.verifyRemoveButton_UGScreen();
		RLM.verifyNoButton_UGScreen();
		RLM.verifyYesButton_UGScreen();
		RLM.removeCreatedRuleGroup();
		
		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 2/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_RuleLibrary_002() throws InterruptedException {

		Configuration.BConfiguration();

		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		QBM.LandingOnQueryBuilderPage();
		QBM.CreateNewRuleAndGroup();

		RLM.LandingOnRuleLibraryPage();

		RLM.verifyExecuteGroupButton_RLScreen();
		RLM.verifySortButton_RLScreen();
		RLM.verifyExpandAllButton_RLScreen();
		RLM.verifyCollapseAllButton_RLScreen();
		RLM.verifyResultButton_RLScreen();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 3/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_RuleLibrary_003() throws InterruptedException {

		Configuration.BConfiguration();

		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		RLM.LandingOnRuleLibraryPage();

		RLM.verifyConfigureRuleButton_RLScreen();

		RLM.verifyRuleNameInput_CRScreen();
		RLM.verifyAddRuleReferenceButtonVisible_CRScreen();
		RLM.verifyRuleGroup_CRScreen();
		RLM.verifyRadioButton_CRScreen();
		RLM.verifyAdvancedOptions_CRScreen();
		RLM.verifySaveResult_CRScreen();

		RLM.verifyRuleGroupTextArea_CRScreen();
		RLM.verifyEditRuleButton_CRScreen();
		
		driver.close();
	}
	@Test(groups = { "smoke", "regression" }, priority = 4/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_RuleLibrary_004() throws InterruptedException {

		Configuration.BConfiguration();

		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		RLM.LandingOnRuleLibraryPage();
		RLM.verifyCancelButton_CRScreen();
		RLM.verifySaveButton_CRScreen();
		RLM.RemoveButton_CRScreen();
		
		driver.close();

	}
	@Test(groups = { "smoke", "regression" }, priority = 4/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_RuleLibrary_005() throws InterruptedException {

		Configuration.BConfiguration();

		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		QBM.LandingOnQueryBuilderPage();
		QBM.CreateNewRuleAndGroup();
		
		RLM.LandingOnRuleLibraryPage();
		
		RLM.verifyExecuteRuleButton();
		
		driver.close();
	

	}

}