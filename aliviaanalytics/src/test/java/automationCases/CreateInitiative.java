package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.DashboardModel;
import automationModels.DataSourceModel;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationModels.SchedulerModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class CreateInitiative extends Configuration{
	public static ExtentTest test;
	String randomint = RandomStringUtils.randomNumeric(3);
	String  DSName ="Fake Dental Claims_"+randomint;
	String  DSName1 ="Fake Risk Scores_"+randomint;
	String OutputDSName = "Output_Fake_"+randomint+"_Claims";
	String OutputDSName1 = "Output_Fake_"+randomint+"_Risk Scores";
	String RuleGroupName = "Fake_Dental_RuleGroup_"+randomint;
	String DashboardName ="Fake_Dental_Dashboard_"+randomint;
	String InitiativeName ="Initiative_"+randomint;
	String SelectTop = "10" ;
	@Test(groups = { "regression1" }, priority = 1)
	public void FWA_CreateInitiative_001() throws InterruptedException {
		try {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		System.out.println(DSName);
		DSM.CreateMSSQLServerDSwithouTest(DSName,"FakeDataDemo_Dev","ALIV_EHCClaimAll_BigData");
		DSM.LoadDataSoucre(DSName);
		System.out.println(DSName1);
		DSM.CreateMSSQLServerDSwithouTest(DSName1,"FakeDataDemo_Dev","ALIV_EHCClaimAll_BigData_Provider_RiskScore");
		DSM.LoadDataSoucre(DSName1);
        driver.close();
		}
		catch (Exception e) {
			
		}	
	}
	
	@Test(groups = { "smoke" ,"regression1"}, priority = 2)
	public void FWA_CreateInitiative_002() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000); 
		
		QBM.LandingOnQueryBuilderPage();
		System.out.println(DSName+DSName1);
		QBM.CreateNewRuleAndGroupForInitiative(DSName,DSName1,OutputDSName,OutputDSName1,RuleGroupName);
	driver.close();
	}
	
	@Test(groups = {"smoke","regression1"}, priority = 3)
	public void FWA_CreateInitiative_003() throws InterruptedException {
		
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		SchedulerModel SM = PageFactory.initElements(driver, automationModels.SchedulerModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		SM.LandingOnSchedulerPage();
		SM.CreateProcessforInitiative(RuleGroupName);
		int DSCount=DSM.CountDataSources(OutputDSName);
		int DSCount1=DSM.CountDataSources(OutputDSName1);
		System.out.println(DSCount);
		System.out.println(DSCount1);
		driver.close();
		
	}
	
	@Test(groups = { "smoke","regression1" }, priority = 4)
	public void FWA_CreateInitiative_004() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		DM.CreateDashboardForInitiative(OutputDSName,OutputDSName1,DashboardName,InitiativeName,SelectTop);
		Thread.sleep(4000);
		driver.close();
}
}