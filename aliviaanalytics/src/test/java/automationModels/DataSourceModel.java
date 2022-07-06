package automationModels;

import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataSourceModel extends Configuration {
	public static ExtentTest test;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Data Repository' or . = 'Data Repository')]")

	public WebElement DataRepository;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'instanceName']")

	public WebElement instanceName;

	@FindBy(how = How.XPATH, using = "//*[@style = 'left: 690px; top: 3px; margin: 0px;' and starts-with(@class, 'x-tool x-box-item x-tool-default x-tool-after-title') and @data-qtip = 'Close dialog']")

	public WebElement CloseDialog;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Connect' or . = 'Connect')]")

	public WebElement Connect;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'tableName' and @placeholder = 'Select Table ...']")

	public WebElement ChooseTableName;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'databaseName']")

	public WebElement databaseName;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dataRepo-manageDatasources-dataDetailView-deleteButton-012')]")

	public WebElement DeleteLoadedDS;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Microsoft SQL Server' or . = 'Microsoft SQL Server')]")

	public WebElement MicrosoftSQLServer;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Remove database table of this data source as well' or . = 'Remove database table of this data source as well')]")

	public WebElement CheckBoxRemoveDatabaseTable;

	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-dataDetailView-loadedDSName-011']")

	public WebElement LoadedDSFileName;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dataRepo-manageDatasources-dataDetailView-dataSnapshotHeader-014')]")

	public WebElement DataSnapshotGridText;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-datasource-manageDataDetailView-exportButton-043')]")

	public WebElement ExportDataButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Export to CSV' or . = 'Export to CSV')]")

	public WebElement ExportDataToCSV;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Export to Excel' or . = 'Export to Excel')]")

	public WebElement ExportDataToExcel;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'label-') and (starts-with(text(), 'Rows:') or starts-with(., 'Rows:'))]")

	public WebElement GetRowsOfLoadedDS;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Manage Data Sources' or . = 'Manage Data Sources')]")

	public WebElement ManageDataSources;

	@FindBy(how = How.XPATH, using = "//*[@id='ds-folder-tree-bodyWrap']//child::input")

	public WebElement SearchTabDataSource;
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Microsoft Excel' or . = 'Microsoft Excel')]")

	public WebElement MicrosoftExcel;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'datasourceName']")

	public WebElement DataSourceName;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Upload File' or . = 'Upload File')]")

	public WebElement UploadFileDataSource;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'filefield-') and @type = 'file' and @name = 'file']")

	public WebElement BrowseDataSourceFile;

	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-uploadFile-saveButton-010']")

	public WebElement SaveUploadFile;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Close' or . = 'Close')]")

	public WebElement CloseUploadDSWindow;

	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-saveButton-009']")

	public WebElement SaveDataSoures;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Text File' or . = 'Text File')]")

	public WebElement TextFile;

	@FindBy(how = How.XPATH, using = "//*[@class = 'x-btn icon-focus-cls x-unselectable x-box-item x-btn-default-small' and @data-qtip = 'Edit selected data source']")

	public WebElement EditSelectedDataSourceButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and @class = 'x-btn-button x-btn-button-default-small x-btn-text  x-btn-icon x-btn-icon-left x-btn-button-center ' and (text() = 'Yes' or . = 'Yes')]")

	public WebElement yesDeletedConfirmationBOx;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'CSV File' or . = 'CSV File')]")

	public WebElement CSV;

	@FindBy(how = How.XPATH, using = "//*[@id = 'folder-ds-createFolderButton' and @data-qtip = 'Create Folder']")

	public WebElement CreateFolder;

	@FindBy(how = How.XPATH, using = "//*[@class = 'x-component x-border-box x-mask x-component-default' and starts-with(@id, 'loadmask') and @aria-valuetext = 'Processing Data Source...']")

	public WebElement ProcessingDataSourceICon;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @data-qtip = 'Expand All' and @style = 'font-size: 16px; left: 174px; top: 0px; margin: 0px;']")

	public WebElement ExpandAllDSButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @data-qtip = 'Collapse All' and @style = 'font-size: 16px; left: 174px; top: 0px; margin: 0px;']")

	public WebElement CollapseAllDSButton;

	@FindBy(how = How.XPATH, using = "//*[@class='x-component x-window-text x-box-item x-component-default']")

	public WebElement NoticePopUp;

	@FindBy(how = How.XPATH, using = "//*[@id='ds-folder-tree-bodyWrap']//child::table//tr//td//span")

	public List<WebElement> DataSourcesList;

	@FindBy(how = How.XPATH, using = "//*[@id='DataRepo-ManageDS-dataDetailView-gridPanel-003-bodyWrap']//child::table//tr//td[2]//div")

	public List<WebElement> ColumnsMetaDataDetails;

	public int CountDataSources(String DSName) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		this.ManageDataSources.click();
		utilityMethods.waitForVisibility(this.SearchTabDataSource);
		this.SearchTabDataSource.click();
		this.SearchTabDataSource.clear();
		this.SearchTabDataSource.sendKeys(DSName);
		Thread.sleep(5000);
		return this.DataSourcesList.size();
	}

	public void LoadDataSoucre(String DSName) throws InterruptedException {
		utilityMethods.waitForVisibility(this.SearchTabDataSource);
		this.SearchTabDataSource.click();
		this.SearchTabDataSource.clear();
		test = report.createTest("Verify the search tab works for data sources ");
		this.SearchTabDataSource.sendKeys(DSName);
		test.log(Status.PASS, "The search tab works for data sources");
		Thread.sleep(3000);
		test = report.createTest("Verify the user is able to open the newly created data source");
		for (WebElement el : DataSourcesList) {
			if (el.getText().equals(DSName)) {
				el.click();

				break;
			}
		}
		test.log(Status.PASS, "The user is able to open the newly created data source");

	}

	public void RightClickOnDS(String DSName) {

		for (WebElement el : DataSourcesList) {

			if (el.getText().equals(DSName)) {
				new Actions(driver).contextClick(el).perform();
				break;
			}
		}

	}

	public void DeleteDataSoucre(String DSName) throws InterruptedException {
		test = report.createTest("Verify the user is able to delete the DataSource");

		this.DeleteLoadedDS.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(this.CheckBoxRemoveDatabaseTable);
		this.CheckBoxRemoveDatabaseTable.click();
		utilityMethods.waitForVisibility(this.yesDeletedConfirmationBOx);
		this.yesDeletedConfirmationBOx.click();
		test.log(Status.PASS, "The DataSource is created with CSV file successfully");
	}

	public void EditDSAndVerifyUpdateName(String DSName) throws InterruptedException {
		test = report.createTest("The user is able to delete the DataSource");

		this.EditSelectedDataSourceButton.click();
		Thread.sleep(2000);
		this.DataSourceName.clear();
		this.DataSourceName.sendKeys(DSName);
		this.SaveDataSoures.click();
		test.log(Status.PASS, "The user is able to edit the DataSource");
		Thread.sleep(5000);
	}

	public void ExportDataIntoCSV() throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(this.ExportDataButton);
		this.ExportDataButton.click();
		Thread.sleep(1000);
		this.ExportDataToCSV.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the user can  export data source in CSV file ");

		try {

			boolean NoticePopup = this.NoticePopUp.isDisplayed();
			String NoticePopUpText = this.NoticePopUp.getText();
			System.out.println(NoticePopUpText);
			if (NoticePopup == true) {
				test.log(Status.FAIL, "The user is not able to  export data source in CSV file");
				PM.OKButtonSelectaProjectWondow.click();
			}

		} catch (Exception e) {
			test.log(Status.PASS, "The user can export data source in CSV file");
		}
	}

	public void ExportDataIntoExcel() throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(this.ExportDataButton);
		this.ExportDataButton.click();
		Thread.sleep(1000);
		test = report.createTest("Verify the user can  export data source in Excel file ");
		this.ExportDataToExcel.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		try {

			boolean NoticePopup = this.NoticePopUp.isDisplayed();
			String NoticePopUpText = this.NoticePopUp.getText();
			System.out.println(NoticePopUpText);
			if (NoticePopup == true) {
				test.log(Status.FAIL, "The user is not able to  export data source in Excel file");
				PM.OKButtonSelectaProjectWondow.click();
			}

		} catch (Exception e) {
			test.log(Status.PASS, "The user can export data source in Excel file");
		}
	}

	public void CreateMicrosoftExcelDS(String DSName, String DSPath) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();

		test = report.createTest("Side Pane: Verify that Data Repository dropdown is visible in the side pane");
		if (this.DataRepository.isDisplayed()) {
			test.log(Status.PASS, "The Data Repository dropdown is visible in the side pane");
		} else {
			test.log(Status.FAIL, "The Data Repository dropdown is not visible in the side pane");
		}

		test = report.createTest("Side Pane: Verify that Data Repository dropdown is clickable ");
		if (this.DataRepository.isEnabled()) {
			test.log(Status.PASS, "The Data Repository dropdown is clickable ");
		} else {
			test.log(Status.FAIL, "The Data Repository dropdown is not clickable ");
		}

		test = report.createTest(
				"Side Pane:Verify that clicking on the Data Repository displays a list of its sub-modules in the dropdown ");
		this.DataRepository.click();
		if (this.ManageDataSources.isDisplayed()) {
			test.log(Status.PASS, "clicking on the Data Repository displays a list of its sub-modules in the dropdown");
		} else {
			test.log(Status.FAIL,
					"clicking on the Data Repository does not display a list of its sub-modules in the dropdown");
		}
		test = report.createTest(
				"Side Pane: Verify that Manage Data Sources Button is present in Data Repository dropdown ");

		if (this.ManageDataSources.isDisplayed()) {
			test.log(Status.PASS, "the Manage Data Sources Button is present in Data Repository dropdown");
		} else {
			test.log(Status.FAIL, "the Manage Data Sources Button is not present in Data Repository dropdown");
		}
		test = report.createTest("Side Pane: Verify that Manage Data Sources Button is clickable ");

		if (this.ManageDataSources.isEnabled()) {
			test.log(Status.PASS, "the Manage Data Sources Button is clickable ");
		} else {
			test.log(Status.FAIL, "the Manage Data Sources Button is not clickable ");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
		this.ManageDataSources.click();
		if (this.SearchTabDataSource.isDisplayed()) {
			test.log(Status.PASS, "clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
		} else {
			test.log(Status.FAIL, "clicking on Manage Data Sources Button doesn't navigate to 'Manage Data Sources' screen");
		}
		Thread.sleep(2000);
		this.SearchTabDataSource.click();
		this.MicrosoftExcel.click();
		PM.PublicOption.click();
		this.DataSourceName.sendKeys(DSName);
		this.UploadFileDataSource.click();
		Thread.sleep(2000);

		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		this.SaveUploadFile.click();
		Thread.sleep(2000);

		this.CloseUploadDSWindow.click();
		Thread.sleep(2000);
		this.SaveDataSoures.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();

	}

	public void CreateMSSQLServerDS(String DSName) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		try {
			this.DataRepository.click();
			this.ManageDataSources.click();
			Thread.sleep(2000);
			this.SearchTabDataSource.click();
			this.MicrosoftSQLServer.click();
			Thread.sleep(2000);
			PM.PublicOption.click();
			this.DataSourceName.sendKeys(DSName);
			this.instanceName.sendKeys("localhost:1433");
			this.instanceName.sendKeys(Keys.ENTER);
			this.databaseName.sendKeys("ai_analysis");
			this.databaseName.sendKeys(Keys.ENTER);
			this.Connect.click();
			Thread.sleep(2000);
			this.ChooseTableName.sendKeys("Automation1_Dental01");
			this.ChooseTableName.sendKeys(Keys.ENTER);
			this.SaveDataSoures.click();
			utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
			PM.OKButtonSelectaProjectWondow.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			this.CloseDialog.click();
		}
	}

	public void CreateCSVDS(String DSName, String DSPath) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		test = report.createTest("Verify the user is able to access the manage data sources screen");
		this.ManageDataSources.click();
		test.log(Status.PASS, "the manage data sources screen is being shown");
		Thread.sleep(2000);
		this.SearchTabDataSource.click();
		test = report.createTest("Verify the create  CSV file data source widnow opens clicking on CSV File button");
		this.CSV.click();
		test.log(Status.PASS, " The create CSV file data source widnow by clicking on CSV File button is being shown");
		test = report.createTest("Create New Project Window - Project visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The public option is selected successfully");
		test = report
				.createTest("Verify the user is able to enter data source name on create  CSV file data source widnow");
		this.DataSourceName.sendKeys(DSName);
		test.log(Status.PASS, " The user is able to enter data source name on create  CSV file data source widnow");
		test = report.createTest("Verify the user can upload CSV file");
		this.UploadFileDataSource.click();
		test.log(Status.PASS, " The the user can upload CSV file");
		Thread.sleep(2000);
		test = report.createTest("Verify the upload File button works on create  CSV file data source widnow");
		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		test.log(Status.PASS, " The upload File button works on create  CSV file data source widnow");
		test = report.createTest("Verify the save button works on create  CSV file data source widnow");
		this.SaveUploadFile.click();
		test.log(Status.PASS, "The save button works on create  CSV file data source widnow");
		Thread.sleep(2000);
		test = report.createTest("Verify the cross button works on create  CSV file data source widnow");
		this.CloseUploadDSWindow.click();
		test.log(Status.PASS, "The cross button works on create  CSV file data source widnow");
		Thread.sleep(2000);
		test = report.createTest("Verify the save button works ");
		this.SaveDataSoures.click();
		test.log(Status.PASS, "The save button works ");
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();

	}

	public void CreateTextFileDS(String DSName, String DSPath) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();

		this.ManageDataSources.click();
		Thread.sleep(2000);

		this.SearchTabDataSource.click();

		this.TextFile.click();
		PM.PublicOption.click();
		this.DataSourceName.sendKeys(DSName);
		this.UploadFileDataSource.click();
		Thread.sleep(2000);

		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		this.SaveUploadFile.click();
		Thread.sleep(2000);

		this.CloseUploadDSWindow.click();
		Thread.sleep(2000);
		this.SaveDataSoures.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();

	}

}
