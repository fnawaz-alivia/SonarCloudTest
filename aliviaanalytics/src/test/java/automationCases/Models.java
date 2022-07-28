package automationCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.ModelingLibraryModel;
import automationModels.ModelingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Models extends Configuration {	
	public static ExtentTest test;
		@Test(groups = { "regression11" }, priority = 1)
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
			test = report.createTest("Verify that the user is able to execute already existing Model");
			driver.findElement(By.xpath("//div[contains(@class, 'analysis-modelingLibrary-mainGrid-49')]//child::table['"+MLM.index+"'+'"+1+"']//tr//td[3]//div[1]//div[1]")).click();
			test.log(Status.PASS, " The user is able to execute already existing Model");
			WebElement ModelExecutionStatus = driver.findElement(By.xpath("//div[contains(@class,'analysis-modelingLibrary-mainGrid-49')]//child::table['"+MLM.index+"'+'"+1+"']//tr//td[4]//div"));	
			String ExecutionStatus = ModelExecutionStatus.getText();
			System.out.println(ExecutionStatus);
			test = report.createTest("Verify that the user is able to execute already existing Model and Model result is completed");
			while (ModelExecutionStatus.getText().equals("Running"))
					{
			Thread.sleep(2000);
			}
			System.out.println(ModelExecutionStatus.getText());
			
			if (ExecutionStatus.equals("Complete")){
				test.log(Status.PASS, " The user is able to execute already existing Model and Model result is completed");
				}

				 else if (ExecutionStatus.equals("Error"))  
					 {
					 test.log(Status.FAIL, " The user is able to execute already existing Model but  Model result is in error status");
				}
			driver.close();
	}
		
		@Test(groups = { "smoke","regression" },  priority = 2,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_002() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(2000);
			MM.CreateModel("R Operator");
			ModelingModel.test = report.createTest("Verify that the Model 'R Operator' is executed as intended.");
			MM.ExecutionOfModel();
			driver.close();

	}
		
		@Test(groups = {"smoke", "regression" }, priority = 3,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_003() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(8000);	
			MM.CreateModel("FP Growth"); 
			ModelingModel.test = report.createTest("Verify that the Model 'FP Growth' is executed as intended.");
			MM.ExecutionOfModel();
			driver.close();

	}
		
		@Test(groups = {"smoke", "regression" }, priority = 4,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_004() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(8000);	
			MM.CreateModel("Python Operator Template"); 
			ModelingModel.test = report.createTest("Verify that the Model 'Python Operator Template' is executed as intended.");
			MM.ExecutionOfModel();
			driver.close();

	}
		
		@Test(groups = {"smoke", "regression" }, priority = 4,retryAnalyzer = listeners.RetryAnalyzer.class)
		public void FWA_Model_005() throws InterruptedException {
			Configuration.BConfiguration();
			Configuration.LoginApplication();
			ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
			ModelingModel MM = PageFactory.initElements(driver, automationModels.ModelingModel.class);
			utilityMethods.waitForVisibility(PM.GetStarted);
			Thread.sleep(8000);	
			MM.CreateModel("Outlier (Spark)"); 
			ModelingModel.test = report.createTest("Verify that the Model 'Outlier (Spark)' is executed as intended.");
			MM.ExecutionOfModel();
			driver.close();

	}
	
}
	
