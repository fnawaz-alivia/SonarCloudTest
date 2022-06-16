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
	@Test(groups = { "smoke","regression" }, priority = 1)
	public void FWA_CreateTestData_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);
	    CM.CreateBubbleGroupChart("BubbleGroupChart");
	    Thread.sleep(2000);
	    test = report.createTest("Verify the chart is saved and showing in saved chart list");
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
	
	
	@Test(groups = { "RegressionTest" }, priority = 2)
	public void FWA_CreateTestData_002() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateBarHorizontalChart("BarHorizontalChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	@Test(groups = { "RegressionTest" }, priority = 3)
	public void FWA_CreateTestData_003() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateDrillDownBarChart("DrillDownBarChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	
	@Test(groups = { "RegressionTest" }, priority = 4)
	public void FWA_CreateTestData_004() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreatePieChart("PieChart");	
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	
	@Test(groups = { "RegressionTest" }, priority = 5)
	public void FWA_CreateTestData_005() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateScatterChart("ScatterChart");	
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	
	@Test(groups = { "RegressionTest" }, priority = 6)
	public void FWA_CreateTestData_006() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateLineChart("LineChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	
	@Test(groups = { "RegressionTest" }, priority = 7)
	public void FWA_CreateTestData_007() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(3000);
	    CM.CreateLineStackChart("LineStackChart");	 
	    Thread.sleep(3000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	
	@Test(groups = { "RegressionTest" }, priority = 8)
	public void FWA_CreateTestData_008() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateDrillDownLineGroupChart("DrillDownLineGroupChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    driver.close();
	}
	
	@Test(groups = { "RegressionTest" }, priority = 9)
	public void FWA_CreateTestData_009() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(2000);
	    CM.CreateLineGroupChart("LineGroupChart");
	    Thread.sleep(2000);
		   int SavedChart =  CM.VerifyChartSaved("BubbleGroupChart");
		   System.out.println(SavedChart);
	    Thread.sleep(2000);
	    driver.close();
	}
	

	
	
}
