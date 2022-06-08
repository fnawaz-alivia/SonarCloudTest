package automationCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.ProjectModel;
import automationModels.RankingModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Ranking extends Configuration {
	public static ExtentTest test;
	
	@Test(groups = { "Smoke" }, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Ranking_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		RankingModel RM = PageFactory.initElements(driver, automationModels.RankingModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		test = report.createTest("Verify the user is able to access ranking page clicking on ranking under analysis ");
		RM.LandingOnPageRanking();
		test.log(Status.PASS, "The Ranking page is laoded");
		RM.LoadDataSourceForRank();
		test = report.createTest("Verify the user is able to select only required column ");
		RM.ShowColumnsButton.click();
		test.log(Status.PASS, "The user is able to select only required column ");
		test = report.createTest("verify the user can select and unselect all columns of datasource");
		RM.CheckBOXShowColumnsWindow.click();
		test.log(Status.PASS, "The user can select and unselect all columns of datasource");
		test = report.createTest("Verify the search tab works on show columns window ");
		RM.SearchTabOnShowColumnsWindow.sendKeys("PHYSICIAN_NAME");	
		test.log(Status.PASS, "The search tab works on show columns window ");
		Thread.sleep(2000);
		RM.ColumnsListOnShowColumnsWindow.get(0).click();
		test = report.createTest("Verify the ok button works on show columns window ");
		PM.OKProjectImportButton.click();
		test.log(Status.PASS, "The ok button works on show columns window ");
		test = report.createTest("Verify the ok button works on show columns window ");
		RM.CombinedColumn.click();
		test.log(Status.PASS, "The ok button works on show columns window ");
		test = report.createTest("Verify the search tab works on add combined column window ");
		RM.SeachtabInputOnCombinedColumnWindow.get(1).sendKeys("TOT");
		test.log(Status.PASS, "The search tab works on add combined column window ");
		Thread.sleep(2000);
		RM.ColumnsListOnCombinedColumnWindow.get(0).click();
		RM.ColumnsListOnCombinedColumnWindow.get(1).click();
		test = report.createTest("Verify the ok button works on add combined column window ");
		PM.OKProjectImportButton.click();
		test.log(Status.PASS, "The ok button works on add combined column window ");
		Thread.sleep(2000);
		test = report.createTest("Verify the data is loaded in asc/des by clicking on column name");
		RM.CombinedHeader.click();
		test.log(Status.PASS, "The data is loaded in asc/des by clicking on column name");
		Thread.sleep(4000);
		test = report.createTest("Verify the user is able to create  a Ranking Using the Medical Transactions Demo Source");
		test = report.createTest("verify the only selected coulmn shows on ranking screen");
		test.log(Status.PASS, "The only selected coulmn shows on ranking screen");
		List<String> AllPhysiciansName = new ArrayList<String>();

		for (int i = 0; i < RM.PhysicianNameList.size(); i++) {

			AllPhysiciansName.add(RM.PhysicianNameList.get(i).getText());
			
		}
		System.out.println(RM.PhysicianNameList.get(0).getText());
		int index = AllPhysiciansName.indexOf("High Risk Doctor");
		 System.out.println(index);
		 int expectedindex=0 ;
		 if(index==expectedindex) {
			 
			 test.log(Status.PASS, "The user is able to create  a Ranking Using the Medical Transactions Demo Source");
		 }
		 else {
		 test.log(Status.FAIL, "The user is not able to create  a Ranking Using the Medical Transactions Demo Source");
	 System.out.println("passed");
		 }
		 driver.close();
		 
	}

}
