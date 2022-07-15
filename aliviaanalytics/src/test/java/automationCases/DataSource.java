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
	public void FWA_DataSource_001() throws InterruptedException {
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
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();

	}

	@Test(groups = { "regression" }, priority = 2, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_002() throws InterruptedException {
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

	@Test(groups = { "regression" }, priority = 3)
	public void FWA_DataSource_003() throws InterruptedException {
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

	@Test(groups = { "regression" }, priority = 3)
	public void FWA_DataSource_004() throws InterruptedException {
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

	@Test(groups = { "regression2" }, priority = 2)
	public void FWA_DataSource_005() throws InterruptedException {
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
		DSM.CreateFolder.click();
		PM.InputFolderName.sendKeys("AutoCreatedFolder");
		PM.PublicOption.click();
		PM.SaveButton.click();
		Thread.sleep(3000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateMicrosoftExcelDS(DSName, "metadataDS.xlsx");
		DSM.ExpandAllDSButton.click();
		int DSListSizeAfterExpand = DSM.DataSourcesList.size();
		System.out.println(DSListSizeAfterExpand);
		DSM.CollapseAllDSButton.click();
		Thread.sleep(2000);
		int DSListSizeAfterCollapse = DSM.DataSourcesList.size();
		System.out.println(DSListSizeAfterCollapse);
		DSM.LoadDataSoucre("AutoCreatedFolder");
		DSM.RightClickOnDS("AutoCreatedFolder");
		PM.DeleteOptionRightClickonProject.click();
		utilityMethods.waitForVisibility(PM.YesButton);
		PM.YesButton.click();
		utilityMethods.waitForVisibility(PM.RenameProjectOk);
		PM.RenameProjectOk.click();
		driver.close();
	}

	@Test(groups = { "RegressionTest5" }, priority = 3)
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

	}

}
