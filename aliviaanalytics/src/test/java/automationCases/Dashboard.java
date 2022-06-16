package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.DashboardModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Dashboard extends Configuration{
	@Test(groups = { "smoke","regression" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Dashboard_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		DM.CreateDashboardAndAddKPIInWidgets("KPI Widget");	
		Thread.sleep(4000);
		DM.ReNameDashboard();
		DM.DeleteDashboard();
		driver.close();
	}
	

	
	
	
	
}