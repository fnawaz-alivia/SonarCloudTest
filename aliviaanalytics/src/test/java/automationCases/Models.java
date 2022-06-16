package automationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ModelingLibraryModel;
import automationModels.ModelingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Models extends Configuration {	
	
		@Test(groups = { "RegressionTest" }, priority = 1)
		public void FWA_Model_001() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingLibraryModel MLM = PageFactory.initElements(driver, automationModels.ModelingLibraryModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(2000);
			MLM.LandingOnPageModlingLibrary();
			MLM.GetIndexOfModel("R Operator");
			System.out.println(MLM.index);
			driver.findElement(By.xpath("//div[contains(@class, 'analysis-modelingLibrary-mainGrid-49')]//child::table['"+MLM.index+"'+'"+1+"']//tr//td[3]//div[1]//div[1]")).click();
			WebElement ModelExecutionStatus = driver.findElement(By.xpath("//div[contains(@class,'analysis-modelingLibrary-mainGrid-49')]//child::table['"+MLM.index+"'+'"+1+"']//tr//td[4]//div"));	
			String ExecutionStatus = ModelExecutionStatus.getText();
			System.out.println(ExecutionStatus);
			
			while (ExecutionStatus.equals("Running"))
					{
			Thread.sleep(2000);
			}
			System.out.println(ModelExecutionStatus.getText());
			
			if (ExecutionStatus.equals("Complete")){
				System.out.println("passed");
				}

				 else if (ExecutionStatus.equals("Error"))  
					 {
					 System.out.println("failed");
				}

	}
		
		@Test(groups = { "smoke","regression" },  priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_002() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(2000);
			MM.CreateModel("R Operator");   
			MM.ExecutionOfModel();
			driver.close();

	}
		
		@Test(groups = {"smoke", "regression" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_003() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(8000);
			MM.CreateModel("FP Growth");   
			MM.ExecutionOfModel();
			driver.close();

	}
	
}
	
