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
	@Test(groups = { "Smoke" }, priority = 1)
	public void FWA_DataSource_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateCSVDS(DSName, "Medical Transactions.csv"); 
		test = report.createTest("Verify the user is able to Create the DataSource with CSV File");
		test.log(Status.PASS, "The DataSource is created with CSV file successfully");
		DSM.LoadDataSoucre(DSName);
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();
		
		
	}
	@Test(groups = { "Smoke1" }, priority = 2,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataSource_002() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		String DSName = RandomStringUtils.randomAlphabetic(10);
		DSM.CreateMicrosoftExcelDS(DSName, "Automation1 - Dental01.xlsx");
		DSM.LoadDataSoucre(DSName);
		Thread.sleep(2000);
		DSM.ExportDataIntoCSV();
		DSM.ExportDataIntoExcel();
		DSM.EditDSAndVerifyUpdateName("Updated");
		DSM.LoadDataSoucre("Updated");
		DSM.DeleteDataSoucre("Updated");
		driver.close();
		
	}
	
	@Test(groups = { "RegressionTest" }, priority = 3)
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
	
	@Test(groups = { "RegressionTest2" }, priority = 3)
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
		         int ruleGroupIdindex= ColumnsMetaDataDetails.indexOf("ruleGroupId");
				 System.out.println(ruleGroupIdindex);
				 int ruleNumberdindex= ColumnsMetaDataDetails.indexOf("ruleNumber");
				 System.out.println(ruleNumberdindex);
				 int execDateindex= ColumnsMetaDataDetails.indexOf("execDate");
				 System.out.println(execDateindex);				 
				String ruleGroupIdColumnType= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleGroupIdindex+"'+'"+1+"']//tr//td[3]//div")).getText();
			    System.out.println(ruleGroupIdColumnType);
			    String	 ruleGroupIdNullCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleGroupIdindex+"'+'"+1+"']//tr//td[4]//div")).getText();
			    System.out.println(ruleGroupIdNullCount);
				String	  ruleGroupIdMissingCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleGroupIdindex+"'+'"+1+"']//tr//td[5]//div")).getText();
			    System.out.println(ruleGroupIdMissingCount);   
				 String  ruleNumberColumnType= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleNumberdindex+"'+'"+1+"']//tr//td[3]//div")).getText();
				System.out.println(ruleNumberColumnType);
				 String	   ruleNumberNullCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleNumberdindex+"'+'"+1+"']//tr//td[4]//div")).getText();
				System.out.println(ruleNumberNullCount);
				 String	    ruleNumberMissingCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+ruleNumberdindex+"'+'"+1+"']//tr//td[5]//div")).getText();
				System.out.println(ruleNumberMissingCount);				
				String execDateColumnType= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+execDateindex+"'+'"+1+"']//tr//td[3]//div")).getText();
				 System.out.println(execDateColumnType);
				 String  execDateNullCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+execDateindex+"'+'"+1+"']//tr//td[4]//div")).getText();
				System.out.println(execDateNullCount);
				String   execDateMissingCount= driver.findElement(By.xpath("//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table['"+execDateindex+"'+'"+1+"']//tr//td[5]//div")).getText();
				System.out.println(execDateMissingCount);				
				DSM.RightClickOnDS(DSName);
				PM.EditOptionRightClikonFolder.click();
				Thread.sleep(2000);
				DSM.DataSourceName.clear();
				DSM.DataSourceName.sendKeys("UpdatedDS");
				DSM.SaveDataSoures.click();
				Thread.sleep(3000);
				DSM.LoadDataSoucre("UpdatedDS");
				DSM.RightClickOnDS("UpdatedDS");
				PM.DeleteOptionRightClickonProject.click();				
				utilityMethods.waitForVisibility(DSM.CheckBoxRemoveDatabaseTable);
				DSM.CheckBoxRemoveDatabaseTable.click();
				utilityMethods.waitForVisibility(DSM.yesDeletedConfirmationBOx);
				DSM.yesDeletedConfirmationBOx.click();			

	}
	
	@Test(groups = { "Smoke1" }, priority = 2)
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
		int DSListSizeAfterExpand= DSM.DataSourcesList.size();
		System.out.println(DSListSizeAfterExpand);
		DSM.CollapseAllDSButton.click();
		Thread.sleep(2000);
		int DSListSizeAfterCollapse= DSM.DataSourcesList.size();
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
	
	
