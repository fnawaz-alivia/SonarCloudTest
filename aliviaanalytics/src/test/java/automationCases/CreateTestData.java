package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import automationModels.ChartModel;
import automationModels.DataSourceModel;
import automationModels.ModelingModel;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationUtils.reportUtil;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class CreateTestData extends Configuration  {
	
	public static ExtentTest test;
	public static ExtentReports report;
	
	
	@BeforeClass(alwaysRun=true)
	public static void startreport() {

		reportUtil.startTest();
		report = reportUtil.getReport();

	}
	
	
	@Test
	public void FWA_CreateTestData_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    PM.NoProjectClickOk();
	    PM.CreateNewProject("Training-Automation");
	    DSM.CreateMicrosoftExcelDS("Automation1 - Dental01", "Automation1 - Dental01.xlsx");
	    DSM.CreateMicrosoftExcelDS("Automation2 - Dental 01", "Automation2 - Dental 01.xlsx");
	    DSM.CreateCSVDS("Medical Transactions", "Medical Transactions.csv");  
	}
	
	@Test
	public void FWA_CreateTestData_002() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateChart("autoCreatedChart");	    	    
	}
	
	@Test
	public void FWA_CreateTestData_003() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		MM.CreateModel("R Operator");    
	}
	
	
	@Test
	public void FWA_CreateTestData_004() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		QBM.CreateQueryBuilder();
		
		
	}
	
	@Test(groups = { "smokeTest" }, priority = 1)
	public void FWA_CreateTestData_005() throws InterruptedException {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);

	}
	
	
	
	
	@AfterClass(alwaysRun=true)
	public static void endreport() {

		reportUtil.endTest();

	}

}
