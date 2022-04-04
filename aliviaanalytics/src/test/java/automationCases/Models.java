package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ModelingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Models extends Configuration {
	
	public class Charting  extends Configuration{
		
		@Test(groups = { "RegressionTest2" }, priority = 1)
		public void FWA_Model_001() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(2000);
			MM.CreateModel("R Operator");   
			driver.close();

	}
		
		@Test(groups = { "RegressionTest" }, priority = 1)
		public void FWA_Model_002() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(2000);
			MM.CreateModel("FP Growth");   
			MM.ExecutionOfModel();
			driver.close();

	}
	
}
	}
