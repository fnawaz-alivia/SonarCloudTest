package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ProjectModel;
import automationModels.SchedulerModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Scheduler extends Configuration{
	
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Scheduler_001() throws InterruptedException {
		
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SchedulerModel SM = PageFactory.initElements(driver, automationModels.SchedulerModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		SM.LandingOnSchedulerPage();
		SM.CreateProcess();
		driver.close();
		
	}
	
	@Test(groups = {"smoke","regression1"}, priority = 1)
	public void FWA_Scheduler_002() throws InterruptedException {
		
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SchedulerModel SM = PageFactory.initElements(driver, automationModels.SchedulerModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
		SM.LandingOnSchedulerPage();
		SM.CreateProcessforInitiative();
		driver.close();
		
	}
}
