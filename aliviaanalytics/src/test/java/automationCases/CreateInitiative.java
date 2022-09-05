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
	@Test(groups = { "regression" }, priority = 1)
	public void FWA_CreateInitiative_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		System.out.println(DSName);
		DSM.CreateMSSQLServerDSForInitiative(DSName,"FakeDataDemo_Dev","ALIV_DentalClaimAll");

		test = report.createTest("Verify that the data source created for initiative claims shows in data sources list.");
		if(DSM.LoadDataSoucre(DSName)==true) {
			test.log(Status.PASS, "The  created data source is being shown in list ");
		}else {
			test.log(Status.FAIL, "The  created data source is not being shown in list ");
		}
		System.out.println(DSName1);
		DSM.CreateMSSQLServerDSForInitiative(DSName1,"FakeDataDemo_Dev","ALIV_DentalClaimAll_Provider_RiskScore");
		test = report.createTest("Verify that the data source created for initiative risk scores  shows in data sources list.");
		if(DSM.LoadDataSoucre(DSName1)==true) {
			test.log(Status.PASS, "The  created data source is being shown in list ");
		}else {
			test.log(Status.FAIL, "The  created data source is not being shown in list ");
		}

        driver.close();
	
	}
	
	@Test(groups = { "smoke" ,"regression"}, priority = 2)
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
	
	@Test(groups = {"smoke","regression"}, priority = 3,dependsOnMethods = { "FWA_CreateInitiative_002" })
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
		test = report.createTest("Verify that the output data sources are being created and shown in data source list after successfull execution of scheduler ");

		int DSCount=DSM.CountDataSources(OutputDSName);
		int DSCount1=DSM.CountDataSources(OutputDSName1);
		System.out.println(DSCount);
		System.out.println(DSCount1);
		
		if (DSCount == 2 & DSCount1==2 ) {
			
			test.log(Status.PASS, "The created DataSources  are being shown in datasources list");
		
		} 
		
		else {
			test.log(Status.FAIL, "The created DataSources are not being shown in datasources list");
		}
		
		driver.close();
		
	}
	
	@Test(groups = { "smoke","regression" }, priority = 4,dependsOnMethods = { "FWA_CreateInitiative_003" })
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