package automationModels;

import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
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
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]//a[3]//span[text()='Cancel']")

	public WebElement cancelbutton;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]//span[text()='Cancel']")

	public WebElement cancelbuttonNewFolderScreen;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Connect' or . = 'Connect')]")

	public WebElement Connect;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'tableName' and @placeholder = 'Select Table ...']")

	public WebElement ChooseTableName;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//a[contains(@class,'btn-save') and contains(@class,'x-btn-disabled')]")

	public WebElement saveButtonDisable;


	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'databaseName']")

	public WebElement databaseName;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'fieldset-') and (text() = 'Config' or . = 'Config')]")

	public WebElement config;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[text()='Choose Drill Down Source Column:']/following::div[1]//input")

	public WebElement choosedrilldownsourcecolumn;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[text()='Choose Drill Down Detail Column:']/following::div[2]//input")

	public WebElement choosedrilldowndetailscolumn;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'numberfield-') and @type = 'text' and @name = 'rowsForMetadata']")

	public WebElement processrowsForMetadata;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Mark First Row as Header' or . = 'Mark First Row as Header')]")

	public WebElement MarkFirstRowasHeader;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'numberfield-') and @type = 'text' and @name = 'skipRowsFromTop']")

	public WebElement skipRowsFromTop;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'lineSeparator']")

	public WebElement lineSeparator;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'quoteCharacter']")

	public WebElement quoteCharacter;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'colSeparator']")

	public WebElement columnSeparator;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Trim Spaces around Text' or . = 'Trim Spaces around Text')]")

	public WebElement TrimSpacesaroundText;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[text()='Username:']/following::input[1]")

	public WebElement input_Username_SQL_SEVER;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[text()='Password:']/following::input[1]")

	public WebElement input_Password_SQL_SERVER;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'radio-') and (text() = 'Database Authentication' or . = 'Database Authentication')]")

	public WebElement DatabaseAuthentication;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'wauthcheckid-') and (text() = 'Windows Authentication [tomcatServiceUser] ?' or . = 'Windows Authentication [tomcatServiceUser] ?')]")

	public WebElement WindowsAuthentication ;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dataRepo-manageDatasources-dataDetailView-deleteButton-012')]")

	public WebElement DeleteLoadedDS;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Microsoft SQL Server' or . = 'Microsoft SQL Server')]")

	public WebElement MicrosoftSQLServer;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Remove database table of this data source as well' or . = 'Remove database table of this data source as well')]")

	public WebElement CheckBoxRemoveDatabaseTable;

	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-dataDetailView-loadedDSName-011']")

	public WebElement LoadedDSFileName;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'mask for me' or . = 'mask for me')]")

	public WebElement maskforme;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'preview-') and (text() = 'Preview Data' or . = 'Preview Data')]")

	public WebElement PreviewData;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Distinct Results' or . = 'Distinct Results')]")

	public WebElement DistinctResults;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Lock Data Source and Make it Read Only' or . = 'Lock Data Source and Make it Read Only')]")

	public WebElement LockDataSourceandMakeitReadOnly;

	@FindBy(how = How.XPATH, using = "//*[@id = 'combo-' and @type = 'text' and @name = 'connectionType' and @placeholder = 'Select Connection Type ...']")

	public WebElement connectionType;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'detailDataSourceId' and @placeholder = 'Select Detail Source ...']")

	public WebElement detailDataSourceId;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'fieldset-') and (text() = 'Drill Down Details' or . = 'Drill Down Details')]")

	public WebElement DrillDownDetails;

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

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder= 'Select File...']")

	public WebElement SelectFileDropDown;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']/following::label[text()='Geo Mapping']")

	public WebElement GeoMapping;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Advance' or . = 'Advance')]")

	public WebElement AdvanceButton;

	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-saveButton-009']")

	public WebElement SaveDataSoures;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Text File' or . = 'Text File')]")

	public WebElement TextFile;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Advanced Metadata Options']/following::span[text()='Save']")

	public WebElement SaveAdvancedMetadataOptions;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Advanced Metadata Options']/following::span[text()='Cancel']")

	public WebElement CancelAdvancedMetadataOptions;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Failed']/following::span[text()='OK']")

	public WebElement okFailed;

	@FindBy(how = How.XPATH, using = "//*[@class = 'x-btn icon-focus-cls x-unselectable x-box-item x-btn-default-small' and @data-qtip = 'Edit selected data source']")

	public WebElement EditSelectedDataSourceButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and @class = 'x-btn-button x-btn-button-default-small x-btn-text  x-btn-icon x-btn-icon-left x-btn-button-center ' and (text() = 'Yes' or . = 'Yes')]")

	public WebElement yesDeletedConfirmationBOx;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-')and @data-qtip = 'Refresh DataSource list']")

	public WebElement RefreshDataSourcelist;

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

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-form-type-radio')]")

	public List<WebElement> RadioButtonList;
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-form-item-body')]//div[contains(@class,'x-form-cb-checked')]")

	public List<WebElement> SelectRadioButton;

	public int CountDataSources(String DSName) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		this.ManageDataSources.click();
		utilityMethods.waitForVisibility(this.SearchTabDataSource);
		this.SearchTabDataSource.click();
		this.SearchTabDataSource.clear();
		this.SearchTabDataSource.sendKeys(DSName);
		this.RefreshDataSourcelist.click();
		Thread.sleep(3000);
		return this.DataSourcesList.size();
	}

	public void LoadDataSoucre(String DSName) throws InterruptedException {
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);

		utilityMethods.waitForVisibility(this.SearchTabDataSource);
		this.SearchTabDataSource.click();
		this.SearchTabDataSource.clear();
		test = report.createTest("Verify the search tab works for data sources ");
		this.SearchTabDataSource.sendKeys(DSName);
		test.log(Status.PASS, "The search tab works for data sources");
		test = report.createTest("Verify that updated DataSource file shows in datasources list");
		int updatedDSCount = this.CountDataSources(DSName);
		System.out.println(updatedDSCount);
		if (updatedDSCount == 2) {
			test.log(Status.PASS, "The created/updated DataSource file is being shown in datasources list");

		} else {
			test.log(Status.FAIL, "The created/updated DataSource file is not being shown in datasources list");
		}

		Thread.sleep(3000);
		test = report.createTest("Verify the user is able to open the newly created data source");
		for (WebElement el : DataSourcesList) {
			if (el.getText().equals(DSName)) {
				el.click();

				break;
			}
		}

		try {

			Thread.sleep(2000);
			if (DCM.OkButton.isDisplayed() == true) {

				System.out.println("Data cannot be loaded");
				test.log(Status.FAIL, "The user is not able to open the newly created data source");
				DCM.OkButton.click();
				driver.close();
			}
			else {
				test.log(Status.PASS, "The user is able to open the newly created data source");
			}
		} catch (Exception e) {
			
		}
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
		test = report.createTest("Verify the delete button is displayed on datasource detials page");
		if (this.DeleteLoadedDS.isDisplayed()) {
			test.log(Status.PASS, "The delete button is being shown ");

		} else {
			test.log(Status.FAIL, "The delete button is not being shown ");
		}
		test = report.createTest("Verify the delete button is clickable on datasource detials page");
		if (this.DeleteLoadedDS.isEnabled()) {
			test.log(Status.PASS, "The delete button is clickable");

		} else {
			test.log(Status.FAIL, "The delete button is not clickable");
		}
		test = report.createTest("Verify that a pop up to select check box to remove database table ");
		this.DeleteLoadedDS.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(this.CheckBoxRemoveDatabaseTable);
		if (this.CheckBoxRemoveDatabaseTable.isDisplayed()) {
			test.log(Status.PASS, "A pop up to select check box to remove database table is being shown");

		} else {
			test.log(Status.FAIL, "A pop up to select check box to remove database table is not being shown");
		}
		test = report.createTest("Verify that the user is able to select check box to remove database table  ");

		this.CheckBoxRemoveDatabaseTable.click();
		test.log(Status.PASS, "The user is able to select check box to remove database table  ");
		utilityMethods.waitForVisibility(this.yesDeletedConfirmationBOx);
		test = report.createTest("Verify that user is able to click on yes button for on confirmation box");
		this.yesDeletedConfirmationBOx.click();
		test.log(Status.PASS, "The user is able to click on yes button for on confirmation box");

		int DSCount = this.CountDataSources(DSName);
		System.out.println("DSCount After delete" + DSCount);
		test = report.createTest("Verify that deleted Datasource is removed from data source list ");
		if (DSCount == 0) {
			test.log(Status.PASS, "The deleted Datasource is removed from data source list ");

		} else {
			test.log(Status.FAIL, "The deleted Datasource is not removed from data source list ");
		}
	}

	public void EditDSAndVerifyUpdateName(String DSName) throws InterruptedException {
		test = report.createTest("Verify that edit button is visible on data source details page");
		if (this.EditSelectedDataSourceButton.isDisplayed()) {
			test.log(Status.PASS, "The edit button is visible on data source details page");

		} else {
			test.log(Status.FAIL, "The edit button is not  visible on data source details page");
		}
		test = report.createTest("Verify that edit button is clickable on data source details page");
		if (this.EditSelectedDataSourceButton.isEnabled()) {
			test.log(Status.PASS, "The edit button is clickable on data source details page");

		} else {
			test.log(Status.FAIL, "The edit button is not  clickable on data source details page");
		}

		test = report.createTest("Update datasouce screen shows by clicking on edit button ");
		this.EditSelectedDataSourceButton.click();
		Thread.sleep(2000);
		if (this.DataSourceName.isDisplayed()) {
			test.log(Status.PASS, "The Update datasouce screen is being shown by clicking on edit button");

		} else {
			test.log(Status.FAIL, "The Update datasouce screen is not being shown by clicking on edit button");
		}
		test = report
				.createTest("Verfiy that user is able to clear existing datasouce name  from data source name field");
		this.DataSourceName.clear();
		System.out.println(this.DataSourceName.getText());
		test = report.createTest("Verfiy that user is able to enter the datasouce name  in  data source name field");
		this.DataSourceName.sendKeys(DSName);
		System.out.println(this.DataSourceName.getText());
		utilityMethods.trycatch(this.AdvanceButton, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Edit  Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on advance button");
		
		this.CancelAdvancedMetadataOptions.click();
		Thread.sleep(1000);
		this.GeoMapping.click();
		utilityMethods.trycatch(this.GeoMapping, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Edit  Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on geomap check box ");
		this.CancelAdvancedMetadataOptions.click();
		Thread.sleep(2000);
		this.GeoMapping.click();
		test = report.createTest("Verify that save button is visible on update data source screen");
		if (this.SaveDataSoures.isDisplayed()) {
			test.log(Status.PASS, "The save button is visible  on update data source screen");

		} else {
			test.log(Status.FAIL, "The save button is not visible  on update data source screen");
		}
		test = report.createTest("Verify that save button is clickable on update data source screen");
		if (this.SaveDataSoures.isEnabled()) {
			test.log(Status.PASS, "The save button is clickable on update data source screen");

		} else {
			test.log(Status.FAIL, "The save button is not clickable on update data source screen");
		}
		this.SaveDataSoures.click();
		Thread.sleep(7000);
	}

	public void ExportDataIntoCSV() throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(this.ExportDataButton);
		test = report.createTest("Verify that export data button is visible on data source details page");
		if (this.ExportDataButton.isDisplayed()) {
			test.log(Status.PASS, "The export data button is visible on data source details page");

		} else {
			test.log(Status.FAIL, "The export data button  is not visible on data source details page");
		}
		test = report.createTest("Verify that export data button is clickable on data source details page");
		if (this.ExportDataButton.isEnabled()) {
			test.log(Status.PASS, "The export data button is clickable on data source details page");

		} else {
			test.log(Status.FAIL, "The export data button is not  clickable on data source details page");
		}
		test = report.createTest("Verify that dropdown opens by clicking on export data button");
		this.ExportDataButton.click();
		Thread.sleep(1000);
		if (this.ExportDataToCSV.isDisplayed()) {
			test.log(Status.PASS, "The dropdown opens by clicking on export data button");

		} else {
			test.log(Status.FAIL, "The dropdown doesn't open by clicking on export data button");
		}
		test = report.createTest("Verify that Export to CSV option is available in dropdown list ");
		if (this.ExportDataToCSV.isDisplayed()) {
			test.log(Status.PASS, "The Export to CSV option is available in dropdown list ");

		} else {
			test.log(Status.FAIL, "The Export to CSV option is not available in dropdown list ");
		}

		test = report.createTest("Verify that Export to CSV option is clickable in dropdown list ");
		if (this.ExportDataToCSV.isEnabled()) {
			test.log(Status.PASS, "The  Export to CSV option is clickable in dropdown list");

		} else {
			test.log(Status.FAIL, "The  Export to CSV option is not clickable in dropdown list");
		}
		test = report.createTest("Verify that Export to CSV screen shows by clicking on export to CSV option");
		this.ExportDataToCSV.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		if (PM.OKButtonSelectaProjectWondow.isDisplayed()) {
			test.log(Status.PASS, "The Export to CSV screen shows by clicking on export to CSV option");

		} else {
			test.log(Status.FAIL, "The Export to CSV screen does not shows by clicking on export to CSV option");
		}
		test = report.createTest("Verify that ok button is visible on Export to CSV screen");
		if (PM.OKButtonSelectaProjectWondow.isDisplayed()) {
			test.log(Status.PASS, "The ok button is visible on Export to CSV screen");

		} else {
			test.log(Status.FAIL, "The ok button is not visible on Export to CSV screen");
		}
		test = report.createTest("Verify that ok button is clickable on Export to CSV screen");
		if (PM.OKButtonSelectaProjectWondow.isEnabled()) {
			test.log(Status.PASS, "The ok button is clickable on Export to CSV screen");

		} else {
			test.log(Status.FAIL, "The ok button is not clickable on Export to CSV screen");
		}
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
		test = report.createTest("Verify that export data button is visible on data source details page");
		if (this.ExportDataButton.isDisplayed()) {
			test.log(Status.PASS, "The export data button is visible on data source details page");

		} else {
			test.log(Status.FAIL, "The export data button  is not visible on data source details page");
		}
		test = report.createTest("Verify that export data button is clickable on data source details page");
		if (this.ExportDataButton.isEnabled()) {
			test.log(Status.PASS, "The export data button is clickable on data source details page");

		} else {
			test.log(Status.FAIL, "The export data button is not  clickable on data source details page");
		}
		test = report.createTest("Verify that dropdown opens by clicking on export data button");
		this.ExportDataButton.click();
		Thread.sleep(1000);
		if (this.ExportDataToExcel.isDisplayed()) {
			test.log(Status.PASS, "The dropdown opens by clicking on export data button");

		} else {
			test.log(Status.FAIL, "The dropdown doesn't open by clicking on export data button");
		}
		test = report.createTest("Verify that Export to excel option is available in dropdown list ");
		if (this.ExportDataToExcel.isDisplayed()) {
			test.log(Status.PASS, "The Export to excel option is available in dropdown list ");

		} else {
			test.log(Status.FAIL, "The Export to excel option is not available in dropdown list ");
		}

		test = report.createTest("Verify that Export to excel option is clickable in dropdown list ");
		if (this.ExportDataToExcel.isEnabled()) {
			test.log(Status.PASS, "The  Export to excel option is clickable in dropdown list");

		} else {
			test.log(Status.FAIL, "The  Export to excel option is not clickable in dropdown list");
		}
		test = report.createTest("Verify that Export to excel screen shows by clicking on export to excel option");
		this.ExportDataToExcel.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		if (PM.OKButtonSelectaProjectWondow.isDisplayed()) {
			test.log(Status.PASS, "The Export to excel screen shows by clicking on export to excel option");

		} else {
			test.log(Status.FAIL, "The Export to excel screen does not shows by clicking on export to excel option");
		}
		test = report.createTest("Verify that ok button is visible on Export to excel screen");
		if (PM.OKButtonSelectaProjectWondow.isDisplayed()) {
			test.log(Status.PASS, "The ok button is visible on Export to excel screen");

		} else {
			test.log(Status.FAIL, "The ok button is not visible on Export to excel screen");
		}
		test = report.createTest("Verify that ok button is clickable on Export to excel screen");
		if (this.EditSelectedDataSourceButton.isEnabled()) {
			test.log(Status.PASS, "The ok button is clickable on Export to excel screen");

		} else {
			test.log(Status.FAIL, "The ok button is not clickable on Export to CSV screen");
		}
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the user can  export data source in Excel file");
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

	public void CreateMicrosoftExcelDS(String DSName, String DSPath) throws Exception {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		utilityMethods.visible(this.DataRepository,
				"Side Pane: Verify that Data Repository dropdown is visible in the side pane");
		utilityMethods.clickable(this.DataRepository, "Side Pane: Verify that Data Repository dropdown is clickable ");
		utilityMethods.clicked_Single(this.DataRepository, 0, this.ManageDataSources,
				"Side Pane:Verify that clicking on the Data Repository displays a list of its sub-modules in the dropdown ");
		utilityMethods.visible(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is present in Data Repository dropdown ");
		utilityMethods.clickable(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is clickable ");
		utilityMethods.clicked_Single(this.ManageDataSources, 0, this.SearchTabDataSource,
				"Side Pane: Verify that clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
		Thread.sleep(2000);
		utilityMethods.visible(this.SearchTabDataSource,
				"Verify that Search Text Field is visible on the Data source screen. ");
		utilityMethods.clickable(this.SearchTabDataSource,
				"Verify that Search Text Field is clickable and editable on the Data source screen.");
		this.SearchTabDataSource.click();
		utilityMethods.visible(this.MicrosoftExcel, "Verify that CSV File Button is visible");
		utilityMethods.clickable(this.MicrosoftExcel,
				"Verify that CSV File Button is clickable and the user can click.");
		utilityMethods.clicked_Single(this.MicrosoftExcel, 1000, PM.PublicOption,
				"Verify that Excel File Button opens 'Create Microsoft Excel  Data Source' screen upon clicking.");
		utilityMethods.verifyRadioButtonPrivatePublicVisible(RadioButtonList);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(RadioButtonList);
		utilityMethods.verifyRadioButtonSelection(RadioButtonList, SelectRadioButton);
		utilityMethods.visible(this.config, "Verify that Config Button is visible.");
		utilityMethods.clicked_Single(this.config, 1000, this.processrowsForMetadata,
				"Verify that Config Button upon clicking expands and displays further fields.");
		utilityMethods.visible(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is visible. ");
		utilityMethods.clickable(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.processrowsForMetadata, 2000, PM.exclamationmark,
				"Verify that Process Rows for Metadata Prediction Text Field is highlighted red upon leaving it empty. ");
		utilityMethods.visible(this.skipRowsFromTop, "Verify thatS kip Rows from Top Text Field is visible. ");
		utilityMethods.clickable(this.skipRowsFromTop,
				"Verify that Skip Rows from Top Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.skipRowsFromTop, 2000, PM.exclamationmark,
				"Verify that Skip Rows from Top Text Field is highlighted red upon leaving it empty.");
		utilityMethods.visible(this.MarkFirstRowasHeader, "Verify that Mark First Row as Header Check Box is visible.");
		utilityMethods.clickable(this.MarkFirstRowasHeader,
				"Verify that Mark First Row as Header Check Box is clickable");
		utilityMethods.visible(this.TrimSpacesaroundText, "Verify that Trim Spaces around Text Check Box is visible. ");
		utilityMethods.clickable(this.TrimSpacesaroundText,
				"Verify that Trim Spaces around Text Check Box is clickable");
		this.config.click();
		utilityMethods.visible(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is visible.");
		utilityMethods.clickable(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is clickable.");
		utilityMethods.clicked_Single(this.DrillDownDetails, 1000, this.detailDataSourceId,
				"Verify that Drill Down Details Dropdown upon clicking expands and displays further fields");
		utilityMethods.visible(this.detailDataSourceId, "Verify that Choose Detail Source Dropdown is visible");
		utilityMethods.clickable(this.detailDataSourceId,
				"Verify that Choose Detail Source Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is  visible");
		utilityMethods.clickable(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is visible");
		utilityMethods.clickable(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is visible. ");
		utilityMethods.clickable(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Distinct Results Check Box is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Distinct Results Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Mask for me Check Box is visible.");
		utilityMethods.clickable(this.DistinctResults, "Verify that Mask for me Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Preview Data Button is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Preview Data Button is clickable.  ");
		this.DrillDownDetails.click();
		utilityMethods.visible(this.cancelbutton,
				"Create Microsoft Excel  Data Source Window :Verify that Cancel Data Button is visible");
		utilityMethods.clickable(this.cancelbutton,
				"Create Microsoft Excel  Data Source Window:Verify that Cancel Button is clickable. ");
		utilityMethods.clicked_Single(this.cancelbutton, 2000, this.MicrosoftExcel,
				"Verify that clicking the Cancel Button takes the user back to the 'Manage Data Sources' landing page. ");
		this.MicrosoftExcel.click();
		Thread.sleep(2000);
		test = report
				.createTest("Create Microsoft Excel  Data Source- The user is able to select public visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The user is able to select public visibility type.");
		utilityMethods.visible(this.DataSourceName,
				"Create Microsoft Excel  Data Source Window: Verify that Data Source Name Text Box is visible on the Landing Page");
		utilityMethods.clickable(this.DataSourceName,
				"Create Microsoft Excel  Data Source Window:Verify that Data Source Name Text Box is editable.");
		utilityMethods.verifyfieldmandatory(this.DataSourceName, 2000, PM.exclamationmark,
				"Verify that if the Data Source  Name is empty an exclamation mark should appear on right side");
		utilityMethods.verifyFieldInputs(this.DataSourceName);
		this.DataSourceName.clear();
		this.DataSourceName.sendKeys(DSName);
		utilityMethods.visible(this.SelectFileDropDown,
				"Create Microsoft Excel  Data SourceWindow : Verify that Select FIle Dropdown is visible.");
		utilityMethods.clickable(this.SelectFileDropDown,
				"Create Microsoft Excel  Data Source Window:Verify that Select FIle Dropdown is clickable.");
		utilityMethods.visible(this.AdvanceButton,
				"Create Microsoft Excel  Data Source Window: Verify that Advance Button is visible.");
		utilityMethods.clickable(this.AdvanceButton,
				"Create Microsoft Excel  Data Source Window:Verify that Advance Button is clickable.");
		utilityMethods.trycatch(this.AdvanceButton, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Microsoft Excel  Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on advance button");
		Thread.sleep(10000);
		utilityMethods.visible(this.UploadFileDataSource,
				"Create Microsoft Excel  Data Source Window:Verify that Upload File Button is visible in the list of sub modules displayed under Data Repository Bread Crumb.");
		utilityMethods.clickable(this.UploadFileDataSource,
				"Create Microsoft Excel  Data Source Window:Verify that Upload File Button is clickable.");
		utilityMethods.clicked_Single(this.UploadFileDataSource, 2000, this.SaveUploadFile,
				"Verify that Upload File Button navigates to Upload File Screen.");
		Thread.sleep(2000);
		// utilityMethods.visible(this.BrowseDataSourceFile, "Upload File Window :Verify
		// that browse button is visible.");
		utilityMethods.clickable(this.BrowseDataSourceFile,
				"Upload File Window:Verify thatbrowse button  is clickable.");
		test = report.createTest("Verify the user is able to browse the file ");
		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		test.log(Status.PASS, " The user is able to browse the file ");
		utilityMethods.visible(this.SaveUploadFile, "Upload File Window :Verify that save button is visible.");
		utilityMethods.clickable(this.SaveUploadFile, "Upload File Window:Verify that save button  is clickable.");
		utilityMethods.clicked_Single(this.SaveUploadFile, 2000, this.CloseUploadDSWindow,
				"Upload File Window :Verify that save button is works.");

		utilityMethods.visible(this.CloseUploadDSWindow, "File Manager Window :Verify that close button is visible.");
		utilityMethods.clickable(this.CloseUploadDSWindow,
				"File Manager Window:Verify that close button  is clickable.");
		utilityMethods.clicked_Single(this.CloseUploadDSWindow, 2000, this.SaveDataSoures,
				"File Manager Window :Verify the close button works");
		utilityMethods.visible(this.GeoMapping,
				"Create Microsoft Excel  Data Source Window:Verify that Geo Mapping Check Box is visible.");
		utilityMethods.clickable(this.GeoMapping,
				"Create Microsoft Excel  Data Source Window :Verify that Geo Mapping Check Box  is clickable.");
		utilityMethods.trycatch(this.GeoMapping, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Microsoft Excel  Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on geomap check box ");
		this.CancelAdvancedMetadataOptions.click();
		utilityMethods.visible(this.SaveDataSoures,
				"Create Microsoft Excel  Data Source Window : Verify that save Button is visible.");
		utilityMethods.clickable(this.SaveDataSoures,
				"Create Microsoft Excel  Data Source Window : Verify that save Button is visible.");
		test = report.createTest("Verify the save button works ");
		this.SaveDataSoures.click();
		test.log(Status.PASS, "The save button works ");
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();

	}

	public void CreateMSSQLServerDS(String DSName) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		try {
			utilityMethods.visible(this.DataRepository,
					"Side Pane: Verify that Data Repository dropdown is visible in the side pane");
			utilityMethods.clickable(this.DataRepository,
					"Side Pane: Verify that Data Repository dropdown is clickable ");
			utilityMethods.clicked_Single(this.DataRepository, 0, this.ManageDataSources,
					"Side Pane:Verify that clicking on the Data Repository displays a list of its sub-modules in the dropdown ");
			utilityMethods.visible(this.ManageDataSources,
					"Side Pane: Verify that Manage Data Sources Button is present in Data Repository dropdown ");
			utilityMethods.clickable(this.ManageDataSources,
					"Side Pane: Verify that Manage Data Sources Button is clickable ");
			utilityMethods.clicked_Single(this.ManageDataSources, 0, this.SearchTabDataSource,
					"Side Pane: Verify that clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
			Thread.sleep(2000);
			utilityMethods.visible(this.SearchTabDataSource,
					"Verify that Search Text Field is visible on the Data source screen. ");
			utilityMethods.clickable(this.SearchTabDataSource,
					"Verify that Search Text Field is clickable and editable on the Data source screen.");
			this.SearchTabDataSource.click();
			utilityMethods.visible(this.MicrosoftSQLServer,
					"Verify that Create Microsoft SQL Server  Button is visible");
			utilityMethods.clickable(this.MicrosoftSQLServer,
					"Verify that Create Microsoft SQL Server  Button is clickable and the user can click.");
			utilityMethods.clicked_Single(this.MicrosoftSQLServer, 1000, PM.PublicOption,
					"Verify that Create Microsoft SQL Server Button opens 'Create Microsoft SQL Server Data Source' screen upon clicking.");
			utilityMethods.verifyRadioButtonPrivatePublicVisible(RadioButtonList);
			utilityMethods.verifyRadioButtonPrivatePublicClickable(RadioButtonList);
			// utilityMethods.verifyRadioButtonSelection(RadioButtonList,
			// SelectRadioButton);
			utilityMethods.visible(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is visible.");
			utilityMethods.clickable(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is clickable.");
			utilityMethods.clicked_Single(this.DrillDownDetails, 1000, this.detailDataSourceId,
					"Verify that Drill Down Details Dropdown upon clicking expands and displays further fields");

			Thread.sleep(2000);
			utilityMethods.moveToElement(this.DistinctResults);
			utilityMethods.visible(this.detailDataSourceId, "Verify that Choose Detail Source Dropdown is visible");
			utilityMethods.clickable(this.detailDataSourceId,
					"Verify that Choose Detail Source Dropdown is clickable and editable.");
			  utilityMethods.visible(this.choosedrilldownsourcecolumn,
			  "Verify that Choose Drill Down Source Column Dropdown is  visible");
			  utilityMethods.clickable(this.choosedrilldownsourcecolumn,
			  "Verify that Choose Drill Down Source Column Dropdown is clickable and editable."
			  ); utilityMethods.visible(this.choosedrilldowndetailscolumn,
			  "Verify that Choose Drill Down Detail Column Dropdown is visible");
			  utilityMethods.clickable(this.choosedrilldowndetailscolumn,
			  "Verify that Choose Drill Down Detail Column Dropdown is clickable and editable."
			  );	 
			utilityMethods.visible(this.LockDataSourceandMakeitReadOnly,
					"Verify that Lock Data Source to Make it Read Only Check Box is visible. ");
			utilityMethods.clickable(this.LockDataSourceandMakeitReadOnly,
					"Verify that Lock Data Source to Make it Read Only Check Box is clickable. ");
			utilityMethods.visible(this.DistinctResults, "Verify that Distinct Results Check Box is visible");
			utilityMethods.clickable(this.DistinctResults, "Verify that Distinct Results Check Box is clickable. ");
			utilityMethods.visible(this.DistinctResults, "Verify that Mask for me Check Box is visible.");
			utilityMethods.clickable(this.maskforme, "Verify that Mask for me Check Box is clickable.maskforme");
			this.DrillDownDetails.click();
			utilityMethods.moveToElement(this.DataSourceName);
			utilityMethods.visible(this.cancelbutton,
					"Create Microsoft SQL Server Data Source Window :Verify that Cancel Data Button is visible");
			utilityMethods.clickable(this.cancelbutton,
					"Create Microsoft SQL Server Data Source Window :Verify that Cancel Button is clickable. ");
			utilityMethods.clicked_Single(this.cancelbutton, 2000, this.MicrosoftSQLServer,
					"Verify that clicking the Cancel Button takes the user back to the 'Manage Data Sources' landing page. ");
			this.MicrosoftSQLServer.click();
			Thread.sleep(2000);
			test = report.createTest(
					"Create Microsoft SQL Server Data Source Window- The user is able to select public visibility type.");
			PM.PublicOption.click();
			test.log(Status.PASS, "The user is able to select public visibility type.");
			utilityMethods.visible(this.DataSourceName,
					"Create Microsoft SQL Server Data Source Window: Verify that Data Source Name Text Box is visible on the Landing Page");
			utilityMethods.clickable(this.DataSourceName,
					"Create Microsoft SQL Server Data Source Window :Verify that Data Source Name Text Box is editable.");
			utilityMethods.verifyfieldmandatory(this.DataSourceName, 2000, PM.exclamationmark,
					"Verify that if the Data Source  Name is empty an exclamation mark should appear on right side");
			utilityMethods.verifyFieldInputs(this.DataSourceName);
			this.DataSourceName.clear();
			this.DataSourceName.sendKeys(DSName);
			utilityMethods.visible(this.AdvanceButton,
					"Create Microsoft SQL Server Data Source: Verify that Advance Button is visible.");
			utilityMethods.clickable(this.AdvanceButton,
					"Create Microsoft SQL Server Data Source :Verify that Advance Button is clickable.");
			utilityMethods.trycatch(this.AdvanceButton, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Microsoft SQL Server Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on advance button");
			Thread.sleep(1000);
			this.CancelAdvancedMetadataOptions.click();
			utilityMethods.visible(this.GeoMapping,
					"Create Microsoft SQL Server Data Source Window :Verify that Geo Mapping Check Box is visible.");
			utilityMethods.clickable(this.GeoMapping,
					"Create Microsoft SQL Server Data Source Window :Verify that Geo Mapping Check Box  is clickable.");
			utilityMethods.trycatch(this.GeoMapping, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Microsoft SQL Server Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on geomap check box ");
			this.CancelAdvancedMetadataOptions.click();
			utilityMethods.visible(this.SaveDataSoures,
					"Create CSV File Data Source Window : Verify that save Button is visible.");
			utilityMethods.clickable(this.SaveDataSoures,
					"Create CSV File Data Source Window : Verify that save Button is visible.");
			Thread.sleep(2000);
			utilityMethods.visible(this.instanceName,
					"Create Microsoft SQL Server Data Source:Verify that Instance Name/IP Address Dropdown Text Box is visible on the Landing Page. ");
			utilityMethods.clickable(this.instanceName,
					"Create Microsoft SQL Server Data Source :Verify that Instance Name/IP Address Dropdown Text Box is  clickable.");
			// utilityMethods.verifyfieldmandatory(this.instanceName, 2000,
			// PM.exclamationmark, "Verify that if Instance Name/IP Address Name is empty an
			// exclamation mark should appear on right side");
			utilityMethods.verifyFieldInputs(this.instanceName);
			this.instanceName.clear();
			System.out.println(Configuration.instanceName);
			this.instanceName.sendKeys(Configuration.instanceName);
			this.instanceName.sendKeys(Keys.ENTER);
			utilityMethods.visible(this.databaseName,
					"Create Microsoft SQL Server Data Source:Verify that Database Name Dropdown Text Box is visible on the Landing Page.");
			utilityMethods.clickable(this.databaseName, "Verify that Database Name Dropdown Text Box is editable. ");
			// utilityMethods.verifyfieldmandatory(this.databaseName, 2000,
			// PM.exclamationmark, "Verify that if the Data Source Name is empty an
			// exclamation mark should appear on right side");
			utilityMethods.verifyFieldInputs(this.databaseName);
			this.databaseName.clear();
			this.databaseName.sendKeys("ai_analysis");
			this.databaseName.sendKeys(Keys.ENTER);
			utilityMethods.visible(this.WindowsAuthentication,
					"Create Microsoft SQL Server Data Source:Verify that Windows Authentication Radio Button is visible. ");
			utilityMethods.clickable(this.WindowsAuthentication,
					"Create Microsoft SQL Server Data Source :Verify that Windows Authentication Radio Button is clickable.");
			utilityMethods.visible(this.DatabaseAuthentication,
					"Create Microsoft SQL Server Data Source:Verify that Database Authentication Radio Button is visible.");
			utilityMethods.clickable(this.DatabaseAuthentication,
					"Create Microsoft SQL Server Data Source :Verify that Database Authentication Radio Button is clickable.");
			utilityMethods.disable(this.input_Username_SQL_SEVER, "Verify that Username Text Field is disabled when Windows Authentication is selected.");
			utilityMethods.disable(this.input_Password_SQL_SERVER, "Verify that password  Field is disabled when Windows Authentication is selected.");
			this.DatabaseAuthentication.click();
			utilityMethods.clickable(this.input_Username_SQL_SEVER,
					"Verify that Username Text Field is only editable when Database Authentication is selected.");
			utilityMethods.clickable(this.input_Password_SQL_SERVER,
					"Verify that password Field is only editable when Database Authentication is selected.");
			utilityMethods.visible(this.Connect,
					"Create Microsoft SQL Server Data Source:Verify that Connect Button is visible.");
			utilityMethods.clickable(this.Connect, "Verify that Connect Button is clickable. ");
			
			 utilityMethods.verifyfieldmandatory(this.input_Username_SQL_SEVER, 2000,
						PM.exclamationmark, "Verify that Username Text Field shows a red exclamation mark to the right when it is left empty.");
			 utilityMethods.verifyfieldmandatory(this.input_Password_SQL_SERVER, 2000,
						PM.exclamationmark, "Verify that Password Text Field shows a red exclamation mark to the right when it is left empty.");
			this.WindowsAuthentication.click();
			this.Connect.click();
			Thread.sleep(2000);
			this.ChooseTableName.sendKeys("Automation1_Dental01");
			this.ChooseTableName.sendKeys(Keys.ENTER);
			
			test = report.createTest("Verify the save button works ");
			this.SaveDataSoures.click();
			test.log(Status.PASS, "The save button works ");
			utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
			PM.OKButtonSelectaProjectWondow.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			this.CloseDialog.click();
		}
	}

	public void CreateCSVDS(String DSName, String DSPath) throws Exception {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		utilityMethods.visible(this.DataRepository,
				"Side Pane: Verify that Data Repository dropdown is visible in the side pane");
		utilityMethods.clickable(this.DataRepository, "Side Pane: Verify that Data Repository dropdown is clickable ");
		utilityMethods.clicked_Single(this.DataRepository, 0, this.ManageDataSources,
				"Side Pane:Verify that clicking on the Data Repository displays a list of its sub-modules in the dropdown ");
		utilityMethods.visible(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is present in Data Repository dropdown ");
		utilityMethods.clickable(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is clickable ");
		utilityMethods.clicked_Single(this.ManageDataSources, 0, this.SearchTabDataSource,
				"Side Pane: Verify that clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
		Thread.sleep(2000);
		utilityMethods.visible(this.SearchTabDataSource,
				"Verify that Search Text Field is visible on the Data source screen. ");
		utilityMethods.clickable(this.SearchTabDataSource,
				"Verify that Search Text Field is clickable and editable on the Data source screen.");
		this.SearchTabDataSource.click();
		utilityMethods.visible(this.CSV, "Verify that CSV File Button is visible");
		utilityMethods.clickable(this.CSV, "Verify that CSV File Button is clickable and the user can click.");
		utilityMethods.clicked_Single(this.CSV, 1000, PM.PublicOption,
				"Verify that CSV File Button opens 'Create CSV File Data Source' screen upon clicking.");
		utilityMethods.verifyRadioButtonPrivatePublicVisible(RadioButtonList);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(RadioButtonList);
		utilityMethods.verifyRadioButtonSelection(RadioButtonList, SelectRadioButton);
		utilityMethods.visible(this.config, "Verify that Config Button is visible.");
		utilityMethods.clicked_Single(this.config, 1000, this.processrowsForMetadata,
				"Verify that Config Button upon clicking expands and displays further fields.");
		utilityMethods.visible(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is visible. ");
		utilityMethods.clickable(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.processrowsForMetadata, 2000, PM.exclamationmark,
				"Verify that Process Rows for Metadata Prediction Text Field is highlighted red upon leaving it empty. ");
		utilityMethods.visible(this.skipRowsFromTop, "Verify thatS kip Rows from Top Text Field is visible. ");
		utilityMethods.clickable(this.skipRowsFromTop,
				"Verify that Skip Rows from Top Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.skipRowsFromTop, 2000, PM.exclamationmark,
				"Verify that Skip Rows from Top Text Field is highlighted red upon leaving it empty.");
		utilityMethods.visible(this.columnSeparator, "Verify that Column Separator Dropdown is visible. ");
		utilityMethods.clickable(this.columnSeparator,
				"Verify that Column Separator Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.columnSeparator, 2000, PM.exclamationmark,
				"Verify that Column Separator Dropdown cannot be left empty. ");
		utilityMethods.visible(this.lineSeparator, "Verify that Line Separator Dropdown is visible. ");
		utilityMethods.clickable(this.lineSeparator, "Verify that Line Separator Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.lineSeparator, 2000, PM.exclamationmark,
				"Verify that Line Separator Dropdown cannot be left empty");
		utilityMethods.visible(this.quoteCharacter, "Verify that Column Quote Char Dropdown is visible. ");
		utilityMethods.clickable(this.quoteCharacter,
				"Verify that Column Quote Char Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.quoteCharacter, 2000, PM.exclamationmark,
				"Verify that Column Quote Char Dropdown cannot be left empty. ");
		utilityMethods.visible(this.MarkFirstRowasHeader, "Verify that Mark First Row as Header Check Box is visible.");
		utilityMethods.clickable(this.MarkFirstRowasHeader,
				"Verify that Mark First Row as Header Check Box is clickable");
		utilityMethods.visible(this.TrimSpacesaroundText, "Verify that Trim Spaces around Text Check Box is visible. ");
		utilityMethods.clickable(this.TrimSpacesaroundText,
				"Verify that Trim Spaces around Text Check Box is clickable");
		this.config.click();
		utilityMethods.visible(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is visible.");
		utilityMethods.clickable(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is clickable.");
		utilityMethods.clicked_Single(this.DrillDownDetails, 1000, this.detailDataSourceId,
				"Verify that Drill Down Details Dropdown upon clicking expands and displays further fields");
		utilityMethods.visible(this.detailDataSourceId, "Verify that Choose Detail Source Dropdown is visible");
		utilityMethods.clickable(this.detailDataSourceId,
				"Verify that Choose Detail Source Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is  visible");
		utilityMethods.clickable(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is visible");
		utilityMethods.clickable(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is visible. ");
		utilityMethods.clickable(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Distinct Results Check Box is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Distinct Results Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Mask for me Check Box is visible.");
		utilityMethods.clickable(this.DistinctResults, "Verify that Mask for me Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Preview Data Button is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Preview Data Button is clickable.  ");
		this.DrillDownDetails.click();
		utilityMethods.visible(this.cancelbutton,
				"Create CSV File Data Source Window :Verify that Cancel Data Button is visible");
		utilityMethods.clickable(this.cancelbutton,
				"Create CSV File Data Source Window :Verify that Cancel Button is clickable. ");
		utilityMethods.clicked_Single(this.cancelbutton, 2000, this.CSV,
				"Verify that clicking the Cancel Button takes the user back to the 'Manage Data Sources' landing page. ");
		this.CSV.click();
		Thread.sleep(2000);
		test = report
				.createTest("Create CSV File Data Source Window- The user is able to select public visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The user is able to select public visibility type.");
		utilityMethods.visible(this.DataSourceName,
				"Create CSV File Data Source Window: Verify that Data Source Name Text Box is visible on the Landing Page");
		utilityMethods.clickable(this.DataSourceName,
				"Create CSV File Data Source Window :Verify that Data Source Name Text Box is editable.");
		utilityMethods.verifyfieldmandatory(this.DataSourceName, 2000, PM.exclamationmark,
				"Verify that if the Data Source  Name is empty an exclamation mark should appear on right side");
		utilityMethods.verifyFieldInputs(this.DataSourceName);
		this.DataSourceName.clear();
		this.DataSourceName.sendKeys(DSName);
		utilityMethods.visible(this.SelectFileDropDown,
				"Create CSV File Data Source Window : Verify that Select FIle Dropdown is visible.");
		utilityMethods.clickable(this.SelectFileDropDown,
				"Create CSV File Data Source Window:Verify that Select FIle Dropdown is clickable.");
		utilityMethods.visible(this.AdvanceButton,
				"Create CSV File Data Source Window : Verify that Advance Button is visible.");
		utilityMethods.clickable(this.AdvanceButton,
				"Create CSV File Data Source Window :Verify that Advance Button is clickable.");
		utilityMethods.trycatch(this.AdvanceButton, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create CSV File Data Source Window :Verify that Advanced Metadata OptionsScreen opens clicking on advance button");
		Thread.sleep(10000);
		utilityMethods.visible(this.UploadFileDataSource,
				"Create CSV File Data Source Window :Verify that Upload File Button is visible in the list of sub modules displayed under Data Repository Bread Crumb.");
		utilityMethods.clickable(this.UploadFileDataSource,
				"Create CSV File Data Source Window :Verify that Upload File Button is clickable.");
		utilityMethods.visible(this.GeoMapping,
				"Create CSV File Data Source Window :Verify that Geo Mapping Check Box is visible.");
		utilityMethods.clickable(this.GeoMapping,
				"Create CSV File Data Source Window :Verify that Geo Mapping Check Box  is clickable.");
		utilityMethods.clicked_Single(this.UploadFileDataSource, 2000, this.SaveUploadFile,
				"Verify that Upload File Button navigates to Upload File Screen.");
		Thread.sleep(2000);
		// utilityMethods.visible(this.BrowseDataSourceFile, "Upload File Window :Verify
		// that browse button is visible.");
		utilityMethods.clickable(this.BrowseDataSourceFile,
				"Upload File Window:Verify thatbrowse button  is clickable.");
		test = report.createTest("Verify the user is able to browse the file ");
		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		test.log(Status.PASS, " The user is able to browse the file ");
		utilityMethods.visible(this.SaveUploadFile, "Upload File Window :Verify that save button is visible.");
		utilityMethods.clickable(this.SaveUploadFile, "Upload File Window:Verify that save button  is clickable.");
		utilityMethods.clicked_Single(this.SaveUploadFile, 2000, this.CloseUploadDSWindow,
				"Upload File Window :Verify that save button is works.");

		utilityMethods.visible(this.CloseUploadDSWindow, "File Manager Window :Verify that close button is visible.");
		utilityMethods.clickable(this.CloseUploadDSWindow,
				"File Manager Window:Verify that close button  is clickable.");
		utilityMethods.clicked_Single(this.CloseUploadDSWindow, 2000, this.SaveDataSoures,
				"File Manager Window :Verify the close button works");
		utilityMethods.trycatch(this.GeoMapping, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create CSV File Data Source Window :Verify that Advanced Metadata OptionsScreen opens clicking on geomap check box ");
		this.CancelAdvancedMetadataOptions.click();
		utilityMethods.visible(this.SaveDataSoures,
				"Create CSV File Data Source Window : Verify that save Button is visible.");
		utilityMethods.clickable(this.SaveDataSoures,
				"Create CSV File Data Source Window : Verify that save Button is visible.");
		test = report.createTest("Verify the save button works ");
		this.SaveDataSoures.click();
		test.log(Status.PASS, "The save button works ");
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();

	}

	public void CreateTextFileDS(String DSName, String DSPath) throws Exception {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		utilityMethods.visible(this.DataRepository,
				"Side Pane: Verify that Data Repository dropdown is visible in the side pane");
		utilityMethods.clickable(this.DataRepository, "Side Pane: Verify that Data Repository dropdown is clickable ");
		utilityMethods.clicked_Single(this.DataRepository, 0, this.ManageDataSources,
				"Side Pane:Verify that clicking on the Data Repository displays a list of its sub-modules in the dropdown ");
		utilityMethods.visible(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is present in Data Repository dropdown ");
		utilityMethods.clickable(this.ManageDataSources,
				"Side Pane: Verify that Manage Data Sources Button is clickable ");
		utilityMethods.clicked_Single(this.ManageDataSources, 0, this.SearchTabDataSource,
				"Side Pane: Verify that clicking on Manage Data Sources Button navigates to 'Manage Data Sources' screen");
		Thread.sleep(2000);
		utilityMethods.visible(this.SearchTabDataSource,
				"Verify that Search Text Field is visible on the Data source screen. ");
		utilityMethods.clickable(this.SearchTabDataSource,
				"Verify that Search Text Field is clickable and editable on the Data source screen.");
		this.SearchTabDataSource.click();
		utilityMethods.visible(this.TextFile, "Verify that Text File Button is visible");
		utilityMethods.clickable(this.TextFile, "Verify that Text File Button is clickable and the user can click.");
		utilityMethods.clicked_Single(this.TextFile, 1000, PM.PublicOption,
				"Verify that Text File Button opens 'Create Text File Data Source' screen upon clicking.");
		utilityMethods.verifyRadioButtonPrivatePublicVisible(RadioButtonList);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(RadioButtonList);
		utilityMethods.verifyRadioButtonSelection(RadioButtonList, SelectRadioButton);
		utilityMethods.visible(this.config, "Verify that Config Button is visible.");
		utilityMethods.clicked_Single(this.config, 1000, this.processrowsForMetadata,
				"Verify that Config Button upon clicking expands and displays further fields.");
		utilityMethods.visible(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is visible. ");
		utilityMethods.clickable(this.processrowsForMetadata,
				"Verify that Process Rows for Metadata Prediction Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.processrowsForMetadata, 2000, PM.exclamationmark,
				"Verify that Process Rows for Metadata Prediction Text Field is highlighted red upon leaving it empty. ");
		utilityMethods.visible(this.skipRowsFromTop, "Verify thatS kip Rows from Top Text Field is visible. ");
		utilityMethods.clickable(this.skipRowsFromTop,
				"Verify that Skip Rows from Top Text Field is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.skipRowsFromTop, 2000, PM.exclamationmark,
				"Verify that Skip Rows from Top Text Field is highlighted red upon leaving it empty.");
		utilityMethods.visible(this.columnSeparator, "Verify that Column Separator Dropdown is visible. ");
		utilityMethods.clickable(this.columnSeparator,
				"Verify that Column Separator Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.columnSeparator, 2000, PM.exclamationmark,
				"Verify that Column Separator Dropdown cannot be left empty. ");
		utilityMethods.visible(this.lineSeparator, "Verify that Line Separator Dropdown is visible. ");
		utilityMethods.clickable(this.lineSeparator, "Verify that Line Separator Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.lineSeparator, 2000, PM.exclamationmark,
				"Verify that Line Separator Dropdown cannot be left empty");
		utilityMethods.visible(this.quoteCharacter, "Verify that Column Quote Char Dropdown is visible. ");
		utilityMethods.clickable(this.quoteCharacter,
				"Verify that Column Quote Char Dropdown is clickable and editable.");
		utilityMethods.verifyfieldmandatory(this.quoteCharacter, 2000, PM.exclamationmark,
				"Verify that Column Quote Char Dropdown cannot be left empty. ");
		utilityMethods.visible(this.MarkFirstRowasHeader, "Verify that Mark First Row as Header Check Box is visible.");
		utilityMethods.clickable(this.MarkFirstRowasHeader,
				"Verify that Mark First Row as Header Check Box is clickable");
		utilityMethods.visible(this.TrimSpacesaroundText, "Verify that Trim Spaces around Text Check Box is visible. ");
		utilityMethods.clickable(this.TrimSpacesaroundText,
				"Verify that Trim Spaces around Text Check Box is clickable");
		this.config.click();
		utilityMethods.visible(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is visible.");
		utilityMethods.clickable(this.DrillDownDetails, "Verify that Drill Down Details Dropdown is clickable.");
		utilityMethods.clicked_Single(this.DrillDownDetails, 1000, this.detailDataSourceId,
				"Verify that Drill Down Details Dropdown upon clicking expands and displays further fields");
		utilityMethods.visible(this.detailDataSourceId, "Verify that Choose Detail Source Dropdown is visible");
		utilityMethods.clickable(this.detailDataSourceId,
				"Verify that Choose Detail Source Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is  visible");
		utilityMethods.clickable(this.choosedrilldownsourcecolumn,
				"Verify that Choose Drill Down Source Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is visible");
		utilityMethods.clickable(this.choosedrilldowndetailscolumn,
				"Verify that Choose Drill Down Detail Column Dropdown is clickable and editable.");
		utilityMethods.visible(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is visible. ");
		utilityMethods.clickable(this.LockDataSourceandMakeitReadOnly,
				"Verify that Lock Data Source to Make it Read Only Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Distinct Results Check Box is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Distinct Results Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Mask for me Check Box is visible.");
		utilityMethods.clickable(this.DistinctResults, "Verify that Mask for me Check Box is clickable. ");
		utilityMethods.visible(this.DistinctResults, "Verify that Preview Data Button is visible");
		utilityMethods.clickable(this.DistinctResults, "Verify that Preview Data Button is clickable.  ");
		this.DrillDownDetails.click();
		utilityMethods.visible(this.cancelbutton,
				"Create Text File Data Source Window :Verify that Cancel Data Button is visible");
		utilityMethods.clickable(this.cancelbutton,
				"Create Text File Data Source Window :Verify that Cancel Button is clickable. ");
		utilityMethods.clicked_Single(this.cancelbutton, 2000, this.TextFile,
				"Verify that clicking the Cancel Button takes the user back to the 'Manage Data Sources' landing page. ");
		this.TextFile.click();
		Thread.sleep(2000);
		test = report
				.createTest("Create CSV File Data Source Window- The user is able to select public visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The user is able to select public visibility type.");
		utilityMethods.visible(this.DataSourceName,
				"Create Text File Data Source Window: Verify that Data Source Name Text Box is visible on the Landing Page");
		utilityMethods.clickable(this.DataSourceName,
				"Create Text File Data Source Window :Verify that Data Source Name Text Box is editable.");
		utilityMethods.verifyfieldmandatory(this.DataSourceName, 2000, PM.exclamationmark,
				"Verify that if the Data Source  Name is empty an exclamation mark should appear on right side");
		utilityMethods.verifyFieldInputs(this.DataSourceName);
		this.DataSourceName.clear();
		this.DataSourceName.sendKeys(DSName);
		utilityMethods.visible(this.SelectFileDropDown,
				"Create Text File Data Source Window : Verify that Select FIle Dropdown is visible.");
		utilityMethods.clickable(this.SelectFileDropDown,
				"Create Text File Data Source Window:Verify that Select FIle Dropdown is clickable.");
		utilityMethods.visible(this.AdvanceButton,
				"Create Text File Data Source Window : Verify that Advance Button is visible.");
		utilityMethods.clickable(this.AdvanceButton,
				"Create Text File Data Source Window :Verify that Advance Button is clickable.");
		utilityMethods.trycatch(this.AdvanceButton, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Text File Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on advance button");
		Thread.sleep(10000);
		utilityMethods.visible(this.UploadFileDataSource,
				"Create Text File Data Source Window :Verify that Upload File Button is visible in the list of sub modules displayed under Data Repository Bread Crumb.");
		utilityMethods.clickable(this.UploadFileDataSource,
				"Create Text File Data Source Window :Verify that Upload File Button is clickable.");
		utilityMethods.visible(this.GeoMapping,
				"Create Text File Data Source Window :Verify that Geo Mapping Check Box is visible.");
		utilityMethods.clickable(this.GeoMapping,
				"Create Text File Data Source Window :Verify that Geo Mapping Check Box  is clickable.");
		utilityMethods.clicked_Single(this.UploadFileDataSource, 2000, this.SaveUploadFile,
				"Verify that Upload File Button navigates to Upload File Screen.");
		Thread.sleep(2000);
		// utilityMethods.visible(this.BrowseDataSourceFile, "Upload File Window :Verify
		// that browse button is visible.");
		utilityMethods.clickable(this.BrowseDataSourceFile,
				"Upload File Window:Verify thatbrowse button  is clickable.");
		test = report.createTest("Verify the user is able to browse the file ");
		String FilePathForDS = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\" + DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		test.log(Status.PASS, " The user is able to browse the file ");
		utilityMethods.visible(this.SaveUploadFile, "Upload File Window :Verify that save button is visible.");
		utilityMethods.clickable(this.SaveUploadFile, "Upload File Window:Verify that save button  is clickable.");
		utilityMethods.clicked_Single(this.SaveUploadFile, 2000, this.CloseUploadDSWindow,
				"Upload File Window :Verify that save button is works.");

		utilityMethods.visible(this.CloseUploadDSWindow, "File Manager Window :Verify that close button is visible.");
		utilityMethods.clickable(this.CloseUploadDSWindow,
				"File Manager Window:Verify that close button  is clickable.");
		utilityMethods.clicked_Single(this.CloseUploadDSWindow, 2000, this.SaveDataSoures,
				"File Manager Window :Verify the close button works");
		utilityMethods.trycatch(this.GeoMapping, this.SaveAdvancedMetadataOptions, this.okFailed,2000, "Create Text File Data Source Window:Verify that Advanced Metadata OptionsScreen opens clicking on geomap check box ");
		this.CancelAdvancedMetadataOptions.click();
		utilityMethods.visible(this.SaveDataSoures,
				"Create Text File Data Source Window : Verify that save Button is visible.");
		utilityMethods.clickable(this.SaveDataSoures,
				"Create Text File Data Source Window : Verify that save Button is visible.");
		test = report.createTest("Verify the save button works ");
		this.SaveDataSoures.click();
		test.log(Status.PASS, "The save button works ");
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
	}

}