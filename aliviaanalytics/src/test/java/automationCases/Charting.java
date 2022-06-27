package automationCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.ChartModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Charting  extends Configuration{
	public static ExtentTest test;
	@Test(groups = { "smoke","regression" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
	    CM.CreateBubbleGroupChart("BubbleGroupChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the BubbleGroupChart is saved and showing in saved chart list");
	   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
	   System.out.println(SavedChart);
	   if (SavedChart>0)
		   
	   {
			test.log(Status.PASS, "The Chart is saved successfully");
		   System.out.println("The Chart is saved successfully");
	   }
	   else {
		   System.out.println("The Chart is not saved");
			test.log(Status.FAIL, "The Chart is not saved"); 
	   }
	   CM.ReNameChart();
	   CM.DeleteChart();
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 2,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_002() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateBarHorizontalChart("BarHorizontalChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the BarHorizontalChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("BarHorizontalChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	@Test(groups = { "regression" }, priority = 3,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_003() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateDrillDownBarChart("DrillDownBarChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the DrillDownBarChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("DrillDownBarChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 4,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_004() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreatePieChart("PieChart");	
	    Thread.sleep(2000);
	    test = report.createTest("Verify the PieChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("PieChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 5,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_005() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		   test = report.createTest("Verify the ScatterChart is saved and showing in saved chart list");
	    CM.CreateScatterChart("ScatterChart");	
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("ScatterChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 6,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_006() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
		   test = report.createTest("Verify the LineChart is saved and showing in saved chart list");
	    CM.CreateLineChart("LineChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("LineChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 7,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_007() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(3000);
	    CM.CreateLineStackChart("LineStackChart");	 
	    Thread.sleep(3000);
	    test = report.createTest("Verify the LineStackChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("LineStackChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	
	@Test(groups = { "regression" }, priority = 8,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_008() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateDrillDownLineGroupChart("DrillDownLineGroupChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the DrillDownLineGroupChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("DrillDownLineGroupChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    driver.close();
	}
	
	@Test(groups = { "regression" }, priority = 9,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_CreateTestData_009() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateLineGroupChart("LineGroupChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the LineGroupChart is saved and showing in saved chart list");
		   int SavedChart =  CM.VerifyChartSaved("LineGroupChart");
		   System.out.println(SavedChart);
		   if (SavedChart>0)
			   
		   {
				test.log(Status.PASS, "The Chart is saved successfully");
			   System.out.println("The Chart is saved successfully");
		   }
		   else {
			   System.out.println("The Chart is not saved");
				test.log(Status.FAIL, "The Chart is not saved"); 
		   }
	    Thread.sleep(2000);
	    driver.close();
	}
	

	
	
}
