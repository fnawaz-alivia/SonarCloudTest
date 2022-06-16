package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.DataCleansingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansing extends Configuration {
	public static ExtentTest test;
	@Test(groups = {"smoke","regression" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000); 
		test = report.createTest("Verify the user is able to access Data Cleansing Module by clicking on Data Cleansing under Data Repository");
		DCM.LandingOnDataCleansingPage();
		test.log(Status.PASS, "The user is able to access Data Cleansing Module by clicking on Data Cleansing under Data Repository");
		test = report.createTest("Verify the user is able to select the Data Source for  Data Cleansing");
		DCM.SelectDSForDataCleansing();
		test.log(Status.PASS, "The user is able to select the Data Source for  Data Cleansing");
		DCM.MissingFillWithValue();
		String DCExportFileName = RandomStringUtils.randomAlphabetic(10);
		DCM.ExportDataIntoCSV(DCExportFileName);
		DCM.ExportDataIntoExcel(DCExportFileName);
		driver.close();
}
	
}