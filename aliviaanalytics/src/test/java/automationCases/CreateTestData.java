package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import automationModels.ChartModel;
import automationModels.DashboardModel;
import automationModels.DataSourceModel;
import automationModels.ModelingModel;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class CreateTestData extends Configuration  {
	
	
	@BeforeSuite(alwaysRun = true)
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
	    driver.close();
	}
	
	@BeforeSuite(dependsOnMethods = { "FWA_CreateTestData_001" })
	public void FWA_CreateTestData_002() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateBubbleGroupChart("AutoCreatedChart");	 
	    driver.close();
	}
	
	@BeforeSuite(alwaysRun = true)
	public void FWA_CreateTestData_003() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		MM.CreateModel("R Operator");   
		driver.close();
	}
	
	
	@BeforeSuite(alwaysRun = true)
	public void FWA_CreateTestData_004() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		QBM.LandingOnQueryBuilderPage();
		QBM.CreateQueryBuilder();
		driver.close();
		
		
	}
	
	@BeforeSuite(alwaysRun = true)
	public void FWA_CreateTestData_005() throws InterruptedException {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		DM.CreateDashboardwithChartItem("AutoCreatedChart");
		driver.close();

	}
	


}
