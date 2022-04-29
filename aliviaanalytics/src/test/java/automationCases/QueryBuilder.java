package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class QueryBuilder extends Configuration {
	public static ExtentTest test;
	@Test(groups = { "Smoke" }, priority = 1)
	public void FWA_DataSource_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000); 
		test = report.createTest("Verify the user is able to access Query Builder Module by clicking on Query Builder under Data Repository.");
		QBM.LandingOnQueryBuilderPage();
		test.log(Status.PASS, "The user is able to access Query Builder Module");
		QBM.CreateleftJoin();
		String QBExportFileName = RandomStringUtils.randomAlphabetic(10);
		QBM.ExportDataIntoCSV(QBExportFileName);
		QBM.ExportDataIntoExcel(QBExportFileName);
		driver.close();
	}
	
	
	@Test(groups = { "Regression" }, priority = 1)
	public void FWA_DataSource_002() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000); 
		QBM.LandingOnQueryBuilderPage();
		QBM.CreateInnerJoin();
	}
	
	
	
}
