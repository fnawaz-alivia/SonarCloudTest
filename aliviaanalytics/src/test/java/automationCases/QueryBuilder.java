package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class QueryBuilder extends Configuration {
	public static ExtentTest test;
	@Test(groups = { "smoke" ,"regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_QueryBuilder_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000); 
		test = report.createTest("Verify the user is able to access Query Builder Module by clicking on Query Builder under Data Repository.");
		QBM.LandingOnQueryBuilderPage();
		test.log(Status.PASS, "The user is able to access Query Builder Module");
		QBM.CreateleftJoin();
		String QBExportFileName = RandomStringUtils.randomAlphabetic(10);
		QBM.ExportDataIntoCSV(QBExportFileName);
		QBM.ExportDataIntoExcel(QBExportFileName);
		driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 1)
	public void FWA_QueryBuilder_002() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000); 
		QBM.LandingOnQueryBuilderPage();
		QBM.CreateInnerJoin();
	}
	@Test(groups = { "smoke" ,"regression1"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_QueryBuilder_003() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000); 
		
		QBM.LandingOnQueryBuilderPage();
		QBM.verifySaveQueryFilterPanel();
	
	}
	
	@Test(groups = { "smoke" ,"regression2"}, priority = 1)
	public void FWA_QueryBuilder_004() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000); 
		
		QBM.LandingOnQueryBuilderPage();
		QBM.CreateNewRuleAndGroupForInitiative();
	
	}
	
}
