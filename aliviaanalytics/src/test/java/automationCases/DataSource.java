package automationCases;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.DataSourceModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataSource extends Configuration {
	public static ExtentTest test;

	@Test(groups = { "smoke", "regression" }, priority = 1, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_001() throws Exception {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateCSVDS(DSName, "Medical Transactions.csv");
		test = report.createTest("Verify the user is able to Create the DataSource with CSV File");
		DSM.LoadDataSoucre(DSName);
		test.log(Status.PASS, "The DataSource is created with CSV file successfully");
		Thread.sleep(3000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();

	}

	@Test(groups = { "regression" }, priority = 2, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_002() throws Exception {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		test = report.createTest("Verify the user is able to Create the DataSource with xsl File");
		DSM.CreateMicrosoftExcelDS(DSName, "Automation1 - Dental01.xlsx");
		DSM.LoadDataSoucre(DSName);
		test.log(Status.PASS, "The DataSource is created with xsl file successfully");
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();

	}

	@Test(groups = { "regression" }, priority = 3, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_003() throws Exception {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateTextFileDS(DSName, "Text File.txt");
		DSM.LoadDataSoucre(DSName);
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();

	}

	@Test(groups = { "regression" }, priority = 3, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_004() throws Exception {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateMicrosoftExcelDS(DSName, "metadataDS.xlsx");
		DSM.LoadDataSoucre(DSName);
		Thread.sleep(2000);
		List<String> ColumnsMetaDataDetails = new ArrayList<String>();

		for (int i = 0; i < DSM.ColumnsMetaDataDetails.size(); i++) {

			ColumnsMetaDataDetails.add(DSM.ColumnsMetaDataDetails.get(i).getText());
		}
		int ruleGroupIdindex = ColumnsMetaDataDetails.indexOf("ruleGroupId");
		System.out.println(ruleGroupIdindex);
		int ruleNumberdindex = ColumnsMetaDataDetails.indexOf("ruleNumber");
		System.out.println(ruleNumberdindex);
		int execDateindex = ColumnsMetaDataDetails.indexOf("execDate");
		System.out.println(execDateindex);
		test = report.createTest("Verify that ruleGroupId Column Type is text ");
		String ruleGroupIdColumnType = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleGroupIdindex + "'+'" + 1 + "']//tr//td[3]//div"))
				.getText();
		System.out.println(ruleGroupIdColumnType);
		if (ruleGroupIdColumnType.equals("text")) {
			test.log(Status.PASS, "The ruleGroup Id Column Type is showing correct");

		} else {
			test.log(Status.FAIL, "The ruleGroup Id Column Type is showing wrong");
		}
		test = report.createTest("Verify that Null count of coulmn rule group ID");
		String ruleGroupIdNullCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleGroupIdindex + "'+'" + 1 + "']//tr//td[4]//div"))
				.getText();
		System.out.println(ruleGroupIdNullCount);
		if (ruleGroupIdNullCount.equals("0")) {
			test.log(Status.PASS, "Null count of coulmn rule group ID is showing");

		} else {
			test.log(Status.FAIL, "Null count of coulmn rule group ID is not showing");
		}
		test = report.createTest("Verify that Missing count of coulmn rule group ID");

		String ruleGroupIdMissingCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleGroupIdindex + "'+'" + 1 + "']//tr//td[5]//div"))
				.getText();
		System.out.println(ruleGroupIdMissingCount);
		if (ruleGroupIdMissingCount.equals("3")) {
			test.log(Status.PASS, "Missing count of coulmn rule group ID is showing");

		} else {
			test.log(Status.FAIL, "Missing count of coulmn rule group ID is not showing");
		}
		test = report.createTest("Verify that ruleNumber Column Type is numeric");
		String ruleNumberColumnType = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleNumberdindex + "'+'" + 1 + "']//tr//td[3]//div"))
				.getText();
		System.out.println(ruleNumberColumnType);
		if (ruleNumberColumnType.equals("numeric")) {
			test.log(Status.PASS, "The ruleNumber Column Type is showing correct");

		} else {
			test.log(Status.FAIL, "The ruleNumber Column Type is showing wrong");
		}
		test = report.createTest("Verify that Null count of coulmn ruleNumber");
		String ruleNumberNullCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleNumberdindex + "'+'" + 1 + "']//tr//td[4]//div"))
				.getText();
		System.out.println(ruleNumberNullCount);
		if (ruleNumberNullCount.equals("2")) {
			test.log(Status.PASS, "Null count of coulmn ruleNumber is showing");

		} else {
			test.log(Status.FAIL, "Null count of coulmn ruleNumber is not showing");
		}
		test = report.createTest("Verify that Missing count of coulmn ruleNumber");
		String ruleNumberMissingCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ ruleNumberdindex + "'+'" + 1 + "']//tr//td[5]//div"))
				.getText();
		System.out.println(ruleNumberMissingCount);
		if (ruleNumberMissingCount.equals("2")) {
			test.log(Status.PASS, "Missing count of coulmn ruleNumber is showing");

		} else {
			test.log(Status.FAIL, "Missing count of coulmn ruleNumber is not showing");
		}
		test = report.createTest("Verify that execDate Column Type is date");
		String execDateColumnType = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ execDateindex + "'+'" + 1 + "']//tr//td[3]//div"))
				.getText();
		System.out.println(execDateColumnType);
		if (execDateColumnType.equals("date")) {
			test.log(Status.PASS, " The execDate Column Type is showing correct");

		} else {
			test.log(Status.FAIL, "The execDate Column Type is showing wrong");
		}
		test = report.createTest("Verify that Null count of coulmn execDate is showing");
		String execDateNullCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ execDateindex + "'+'" + 1 + "']//tr//td[4]//div"))
				.getText();
		System.out.println(execDateNullCount);
		if (execDateNullCount.equals("1")) {
			test.log(Status.PASS, " Null count of coulmn execDate is showing");

		} else {
			test.log(Status.FAIL, " Null count of coulmn execDate is not showing");
		}
		test = report.createTest("Verify that Missing count of coulmn execDate is showing");
		String execDateMissingCount = driver.findElement(
				By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"
						+ execDateindex + "'+'" + 1 + "']//tr//td[5]//div"))
				.getText();
		System.out.println(execDateMissingCount);
		if (execDateMissingCount.equals("1")) {
			test.log(Status.PASS, "Missing count of coulmn execDate is showing");

		} else {
			test.log(Status.FAIL, "Missing count of coulmn execDate is not showing");
		}
		test = report.createTest("Verify that user is able to do right click on DS");
		DSM.RightClickOnDS(DSName);
		test.log(Status.PASS, "The user is able to do right click on DS");
		test = report.createTest("Verify that user is able to do right click on DS and select Edit option ");
		PM.EditOptionRightClikonFolder.click();
		test.log(Status.PASS, "The user is able to do right click on DS and select Edit option ");
		Thread.sleep(2000);
		test = report.createTest("Verify that Edit DS screen shows by clicking on edit option");
		if (DSM.DataSourceName.isDisplayed()) {
			test.log(Status.PASS, "Edit DS screen is being shown by clicking on edit option");

		} else {
			test.log(Status.FAIL, "Edit DS screen is not being shown by clicking on edit option");
		}
		test = report.createTest("Verify that the user is able to clear the DS name on  Edit DS screen");
		DSM.DataSourceName.clear();
		test.log(Status.PASS, "The user is able to clear the DS name on  Edit DS screen");
		test = report.createTest("Verify that the user is able to enter the DS name on  Edit DS screen");
		DSM.DataSourceName.sendKeys("UpdatedDS");
		test.log(Status.PASS, "The user is able to enter the DS name on  Edit DS screen");
		test = report.createTest("Verify that the user is able to save the DS name on  Edit DS screen");
		DSM.SaveDataSoures.click();
		test.log(Status.PASS, "The user is able to save the DS name on  Edit DS screen");
		Thread.sleep(3000);
		test = report.createTest("Verify that the user is able to laod the Updated Data Source");
		DSM.LoadDataSoucre("UpdatedDS");
		test.log(Status.PASS, "The user is able to laod the Updated Data Source");
		test = report.createTest("Verify that the user is able to do right click on the Updated Data Source");
		DSM.RightClickOnDS("UpdatedDS");
		test.log(Status.PASS, "the user is able to do right click on the Updated Data Source");
		test = report.createTest("Verify that the delete option show by clicking right on DS  ");
		if (PM.DeleteOptionRightClickonProject.isDisplayed()) {
			test.log(Status.PASS, "The delete option is showing in  right click options ");

		} else {
			test.log(Status.FAIL, "The delete option is not showing in  right click options");
		}
		test = report.createTest("Verify that the user is able to click on delete option");
		PM.DeleteOptionRightClickonProject.click();
		test.log(Status.PASS, "The user is able to click on delete option");
		utilityMethods.waitForVisibility(DSM.CheckBoxRemoveDatabaseTable);
		test = report.createTest("Verify that the user is able to click on check box to remove database table ");
		DSM.CheckBoxRemoveDatabaseTable.click();
		test.log(Status.PASS, "The user is able to click on check box to remove database table");
		utilityMethods.waitForVisibility(DSM.yesDeletedConfirmationBOx);
		test = report.createTest("Verify that the user is able to click  yes button on deleted confirmation box  ");
		DSM.yesDeletedConfirmationBOx.click();
		test.log(Status.PASS, "The user is able to click  yes button on deleted confirmation box ");
		driver.close();

	}

	@Test(groups = { "regression" }, priority = 2, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_005() throws Exception {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		DSM.ManageDataSources.click();
		utilityMethods.waitForVisibility(DSM.SearchTabDataSource);
		DSM.SearchTabDataSource.click();
		test = report.createTest(
				"Data source Tree: Verify that create new folder button is visible ");

		if (DSM.CreateFolder.isDisplayed()) {
			test.log(Status.PASS, "The create folder button is visible");
		} else {
			test.log(Status.FAIL, "The create folder button is not visible");
		}
		test = report.createTest(
				"Data source Tree: Verify that create new folder button is clickable ");

		if (DSM.CreateFolder.isEnabled()) {
			test.log(Status.PASS, "The create folder button is clickable");
		} else {
			test.log(Status.FAIL, "The create folder button is not clickable");
		}
		
		test = report.createTest("Verify that the user is able to create the folder in data source tree");
		DSM.CreateFolder.click();
		test.log(Status.PASS, "The user is able to create the folder in data source tree");
		PM.InputFolderName.sendKeys("AutoCreatedFolder");
		test = report.createTest("Create New folder Window - folder visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The public option is selected successfully");
		test = report.createTest("Verify the save button works ");
		PM.SaveButton.click();
		test.log(Status.PASS, "The save button works ");
		Thread.sleep(3000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateMicrosoftExcelDS(DSName, "metadataDS.xlsx");
		test = report.createTest(
				"Data source Tree: Verify that expand all button is visible ");

		if (DSM.ExpandAllDSButton.isDisplayed()) {
			test.log(Status.PASS, "The expand all  button is visible");
		} else {
			test.log(Status.FAIL, "The expand all create folder button is not visible");
		}
		test = report.createTest(
				"Data source Tree: Verify that expand all  button is clickable ");

		if (DSM.ExpandAllDSButton.isEnabled()) {
			test.log(Status.PASS, "The expand all button is clickable");
		} else {
			test.log(Status.FAIL, "The expand all button is not clickable");
		}
		DSM.ExpandAllDSButton.click();
		int DSListSizeAfterExpand = DSM.DataSourcesList.size();
		System.out.println(DSListSizeAfterExpand);
		test = report.createTest(
				"Data source Tree: Verify that collapse all button is visible ");

		if (DSM.CollapseAllDSButton.isDisplayed()) {
			test.log(Status.PASS, "The collapse all  button is visible");
		} else {
			test.log(Status.FAIL, "The collapse all create folder button is not visible");
		}
		test = report.createTest(
				"Data source Tree: Verify that collapse all  button is clickable ");

		if (DSM.CollapseAllDSButton.isEnabled()) {
			test.log(Status.PASS, "The collapse all button is clickable");
		} else {
			test.log(Status.FAIL, "The collapse all button is not clickable");
		}
		DSM.CollapseAllDSButton.click();
		Thread.sleep(2000);
		int DSListSizeAfterCollapse = DSM.DataSourcesList.size();
		System.out.println(DSListSizeAfterCollapse);
		test = report.createTest(
				"Data source Tree: Verify that collapse all and expand all  button is working as expected ");

		if (DSListSizeAfterExpand>DSListSizeAfterCollapse) {
			test.log(Status.PASS, "The  collapse all and expand all  button is working as expected");
		} else {
			test.log(Status.FAIL, "The  collapse all and expand all  button is not working as expected");
		}
		DSM.LoadDataSoucre("AutoCreatedFolder");
		DSM.RightClickOnDS("AutoCreatedFolder");
		test = report.createTest("Verify the delete option is displayed when the user does the right click on folder");
		if (PM.DeleteOptionRightClickonProject.isDisplayed()) {
			test.log(Status.PASS, "The delete option is being shown ");

		} else {
			test.log(Status.FAIL, "The delete option  is not being shown ");
		}
		test = report.createTest("Verify the delete option is clickable  when the user does the right click on folder");
		if (PM.DeleteOptionRightClickonProject.isEnabled()) {
			test.log(Status.PASS, "The delete option is clickable");

		} else {
			test.log(Status.FAIL, "The delete option is not clickable");
		}
		test = report.createTest("Verify that please confirm screen shows  when the user clicks on delete option");
		PM.DeleteOptionRightClickonProject.click();
		utilityMethods.waitForVisibility(PM.YesButton);
		if (PM.YesButton.isDisplayed()) {
			test.log(Status.PASS, "Please confirm screen is being shown");

		} else {
			test.log(Status.FAIL, "Please confirm screen is not being shown");
		}
		test = report.createTest("Verify the yes button is displayed on please confirm screen");
		if (PM.YesButton.isDisplayed()) {
			test.log(Status.PASS, "The yes button is being shown ");

		} else {
			test.log(Status.FAIL, "The yes button is not being shown ");
		}
		test = report.createTest("Verify the yes button is clickable on please confirm screen");
		if (PM.YesButton.isEnabled()) {
			test.log(Status.PASS, "The yes button is clickable");

		} else {
			test.log(Status.FAIL, "The yes button is not clickable");
		}
		utilityMethods.waitForVisibility(PM.YesButton);
		test = report.createTest("Verify that delete folder screen shows for successfull message by clicking on yes button ");
		PM.YesButton.click();
		utilityMethods.waitForVisibility(PM.RenameProjectOk);
		if (PM.RenameProjectOk.isDisplayed()) {
			test.log(Status.PASS, "The delete folder screen is being shown");

		} else {
			test.log(Status.FAIL, "The delete folder screen is not being shown");
		}
		test = report.createTest("Verify that OK button shows on delete folder screen");
		if (PM.RenameProjectOk.isDisplayed()) {
			test.log(Status.PASS, "The OK button is being shown ");

		} else {
			test.log(Status.FAIL, "The OK button is not being shown ");
		}
		test = report.createTest("Verify that OK button is clickable on delete folder screen");
		if (PM.RenameProjectOk.isEnabled()) {
			test.log(Status.PASS, "The OK button is clickable");

		} else {
			test.log(Status.FAIL, "The OK button is not clickable");
		}
		PM.RenameProjectOk.click();
		int foldercount= DSM.CountDataSources("AutoCreatedFolder");
		System.out.println("foldercount in data source tree after delete"+foldercount);
		test = report.createTest("Verify that deleted folder is removed from data source list ");
		if (foldercount==0) {
			test.log(Status.PASS, "The deleted folder is removed from data source list ");

		} else {
			test.log(Status.FAIL, "The deleted folder is not removed from data source list ");
		}
		driver.close();
	}

	@Test(groups = { "regression" }, priority = 3, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_006() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateMSSQLServerDS(DSName);
		DSM.LoadDataSoucre(DSName);
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("UpdatedSQLDS");
		DSM.LoadDataSoucre("UpdatedSQLDS");
		DSM.DeleteDataSoucre("UpdatedSQLDS");
        driver.close();
	}

}
