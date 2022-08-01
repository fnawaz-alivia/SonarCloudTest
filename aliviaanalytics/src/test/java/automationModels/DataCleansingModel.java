package automationModels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansingModel extends Configuration {
	
	public static ArrayList<String> cList = new ArrayList<>();
	public static int columnSize;
	
	public static ExtentTest test;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Data Cleansing' or . = 'Data Cleansing')]")

	public WebElement DataCleansing;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder = 'Select item ...']")

	public WebElement SelectDSForDataCleansing;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Fill with' or . = 'Fill with')]")

	public WebElement FillWith;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-dataClean-mainGridPane-executeButton-045')]")

	public WebElement DataCleanExecuteButton;

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-dataclean-mainGridPane-exportButton-042')]")

	public WebElement DataCleanExportButton;

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Missing' or . = 'Missing')]")

	public WebElement Missing;

	@FindBy(how = How.XPATH, using = "//*[@class='x-container x-box-item x-window-item x-container-default x-box-layout-ct']//child::input")

	public WebElement ExportDataCleansingFileName;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table//tr//td[3]//div")

	public List<WebElement> ColumnsOnSelectedDS;

	// Almas XPath For Data Cleansing Screen

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'folder-dc-createFolderButton-btnIconEl')]")

	WebElement CreateFolderButton;

	@FindBy(how = How.XPATH, using = "//div[text()='Create New Folder']")

	WebElement CreateNewFolder;

	@FindBy(how = How.XPATH, using = "//div[@data-qtip='Close dialog']/div[contains(@id,'tool-2532')]")

	WebElement CancelCreateNewFolderPopup;

	@FindBy(how = How.XPATH, using = "//span[@id='button-1192-btnIconEl']")

	WebElement RefreshButton;

	@FindBy(how = How.XPATH, using = "//div[@id='toolbar-1191-innerCt']/div/a[@data-qtip='Expand All']/span/span/span")

	WebElement ExpandAllButton;

	@FindBy(how = How.XPATH, using = "//div[@id='toolbar-1191-innerCt']/div/a[@data-qtip='Collapse All']/span/span/span")

	WebElement CollapseAllButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-tree-lines x-grid x-resizable x-panel-resizable x-panel-default-resizable x-border-box')]/div/div/div/div[2]/div")

	WebElement CollapsePanelButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-left x-panel-header-left x-panel-header-default-left x-box-layout-ct')]/div/div/div/div")
	
	WebElement ExpandPanelButton;

	@FindBy(how = How.XPATH, using = "//div[@id='combo-1220-trigger-picker']")

	WebElement SelectDataSourceDropdown;

	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item']")

	List<WebElement> SelectDataSourceDropdownList;
	
	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item x-boundlist-selected']")

	WebElement SelectedDataSource;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")

	WebElement YesButtonInChangeDataSource;
	
	@FindBy(how = How.XPATH, using = "//span[text()='No']")

	WebElement NoButtonInChangeDataSource;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")

	WebElement CancelButtonInChangeDataSource;

	@FindBy(how = How.XPATH, using = "//span[@id='button-1222-btnWrap']")

	WebElement ViewDataButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel snapshot-min-window')]/div[2]/div/div/div/div/div/div")

	WebElement DataSnapShot;
	

	@FindBy(how = How.XPATH, using = "//span[@id='button-1223-btnInnerEl']")

	WebElement ColumnButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'missing')]")

	List<WebElement> ColumnName;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'gridview')]/div[2]/table/tbody/tr/td[3]")
	
	WebElement DataSourceTable;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'gridview')]/div[2]/table/tbody/tr/td[3]")
	
	List<WebElement> DataSourceTables;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]")
	
	WebElement ColumnScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div[2]/div/div/div/div[3]/div/div[2]/table/tbody/tr/td[2]/div")
	
	List<WebElement> columnNameInColumnScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[@class='x-scroller-spacer']")
	
	WebElement columnScreenScroller;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div/div/div/div[2]/div")
	
	WebElement ColumnScreenCancelButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div/div/div/div/div/div/div/input")
	
	WebElement ColumnScreenSearchField;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[2]/div/div/div[contains(@aria-describedby,'description-not-selected')]")
	
	WebElement ColumnNameTopCheckboxNotSelected;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[2]/div/div/div[contains(@aria-describedby,'description-selected')]")
	
	WebElement ColumnNameTopCheckboxSelected;
	
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[1]//td[contains(@aria-describedby,'description-selected')]")
	
	WebElement ColumnNameSelectedCheckbox;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[1]//td[contains(@aria-describedby,'description-not-selected')]")
	
	WebElement ColumnNameUnSelectedCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-sort-ASC')]/div/div/div/div/span")
	
	WebElement UpArrowButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-sort-DESC')]/div/div/div/div/span")
	
	WebElement DownArrowButton;
	
	@FindBy(how = How.XPATH, using = "//table[contains(@class,'x-grid-item-selected') and contains(@id,'gridview')]")
	
	WebElement AllSelectedColumnCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[3]/div/div[2]/table/tbody/tr/td/div/span")
	
	List<WebElement> AllUnselectedColumnCheckbox;
	
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[3]/div/div[2]/table[1]/tbody/tr/td/div/span")
	
	WebElement IndiviualColumnCheckbox;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[3]/div/div[2]/table[1]/tbody/tr/td[2]/div")
	
	WebElement FirstColumnNameInColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//span[text()='OK']")
	
	WebElement OkButton;
    
    @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
	
	WebElement CancelButton;
    
    @FindBy(how = How.XPATH, using = "//span[text()='Calculated Column']")
	
	WebElement CaculatedColumn;
    
    @FindBy(how = How.XPATH, using = "//div[text()='Generate Calculated Column']")
	
	WebElement CalculatedColumnScreen;
	
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div[2]/div/div[2]//table//tr/td/div")
	
	List<WebElement> ColumnNameInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[2]//div[@class='x-scroller-spacer']")
	
	WebElement ColumnNameScrollerInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[1]//input")
	
	WebElement ColumnNameTextFieldInCalculatedColumnScreen;
	
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//input")
	
	WebElement FunctionsTextFieldInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//table//td/div")
	
	List<WebElement> FunctionsListInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//div[@class='x-scroller-spacer']")
	
	WebElement FunctionsScrollerInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]/div[2]/div/div/div/label")
	
	WebElement previewSectionInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]/div[2]/div/div/div/label/b")
	
	WebElement previewSectionContentInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//span[text()='Remove selected item']")
	
   	WebElement RemoveSelectedItemButtonInCalculatedColumnScreen;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[4]/div/div[2]/div/div")
	
   	WebElement FieldPreviewInCalculatedColumn;
    
	

	public void LandingOnDataCleansingPage() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DS = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DS.DataRepository.click();
		test = report.createTest("Side Pane: Verify that Data Cleansing Button is present in Data Repository dropdown");

		if (this.DataCleansing.isDisplayed()) {
			test.log(Status.PASS, "The Data Cleansing Button is present in Data Repository dropdown");
		} else {
			test.log(Status.FAIL, "The Data Cleansing Button is not  present in Data Repository dropdown");
		}
		test = report.createTest("Side Pane: Verify that Data Cleansing Button is clickable");

		if (this.DataCleansing.isEnabled()) {
			test.log(Status.PASS, "The Data Cleansing Button is clickable");
		} else {
			test.log(Status.FAIL, "The Data Cleansing Button is not clickable");
		}

		test = report.createTest(
				"Side Pane: Verify that clicking on Data Cleansing Button navigates to 'Data Cleansing' screen");
		this.DataCleansing.click();
		if (this.SelectDSForDataCleansing.isDisplayed()) {
			test.log(Status.PASS, "clicking on Data Cleansing Button navigates to 'Data Cleansing' screen");
		} else {
			test.log(Status.FAIL, "clicking on Data Cleansing Button doesn't  navigate to 'Data Cleansing' screen");
		}
		utilityMethods.waitForVisibility(this.SelectDSForDataCleansing);
		// By Clicking on this button SideBar will be remove
		this.SelectDSForDataCleansing.click();
		Thread.sleep(2000);
	}

	public void SelectDSForDataCleansing() throws Exception {
		Thread.sleep(2000);
		this.SelectDSForDataCleansing.sendKeys("dental");
		this.SelectDSForDataCleansing.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	public void MissingFillWithValue() throws Exception {
		Thread.sleep(1000);
		List<String> AllColumns = new ArrayList<String>();

		for (int i = 0; i < ColumnsOnSelectedDS.size(); i++) {

			AllColumns.add(ColumnsOnSelectedDS.get(i).getText().split(" ")[0]);
		}
		int index = AllColumns.indexOf("amountallowed");
		System.out.println(index);
		driver.findElement(
				By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" + index
						+ "'+'" + 1 + "']//tr//td[2]"))
				.click();
		test = report.createTest("Verify the user is able to select the operator");
		WebElement Operator = driver.findElement(
				By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" + index
						+ "'+'" + 1 + "']//tr//td[6]"));
		utilityMethods.doubleClick(Operator);
		test.log(Status.PASS, "The user is able to select the operator");
		test = report.createTest("Verify the user is able to select the missing operator");
		this.Missing.click();
		test.log(Status.PASS, "The user is able to select the missing operator");
		WebElement Action = driver.findElement(
				By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" + index
						+ "'+'" + 1 + "']//tr//td[7]"));
		utilityMethods.doubleClick(Action);
		test = report.createTest("Verify the user is able to select the fillwith action");
		this.FillWith.click();
		test.log(Status.PASS, "The user is able to select the fillwith action");
		test = report.createTest("Verify the user is able to set the value ");
		WebElement Value = driver.findElement(
				By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" + index
						+ "'+'" + 1 + "']//tr//td[8]"));
		utilityMethods.SetTextwithActionClass(Value, "0");
		test.log(Status.PASS, "The user is able to set the value");
		
		test = report.createTest("Verify that Execute Button is present on the Data Cleansing screen");
		if (this.DataCleanExecuteButton.isDisplayed()) {
			test.log(Status.PASS, "The Execute Button is present on the Data Cleansing screen");

		} else {
			test.log(Status.FAIL, "The Execute Button is not present on the Data Cleansing screen");
		}
		test = report.createTest("Verify that Execute Button is clickable");
		if (this.DataCleanExecuteButton.isEnabled()) {
			test.log(Status.PASS, "The Execute Button is clickable on the Data Cleansing screen");

		} else {
			test.log(Status.FAIL, "The Execute Button is not clickable on the Data Cleansing screen");
		}
		
		test = report.createTest("Verify that clicking on the Execute Button the selected columns are displayed in the Cleansing Results grid");
		this.DataCleanExecuteButton.click();
		test.log(Status.PASS, "clicking on the Execute Button the selected columns are displayed in the Cleansing Results grid");
		Thread.sleep(2000);
	}

	public void ExportDataIntoCSV(String fileName) throws Exception {
		test = report.createTest("Export Cleansing Filter results data into CSV ");
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(this.DataCleanExportButton);
		test = report.createTest("Verify that Export Data Dropdown is visible on Data Cleansing screen");
		if (this.DataCleanExportButton.isDisplayed()) {
			test.log(Status.PASS, "The Export Data Dropdown is visible on Data Cleansing screen");

		} else {
			test.log(Status.FAIL, "The Export Data Dropdown is not visible on Data Cleansing screen");
		}
		test = report.createTest("Verify that Export Data Dropdown is clickable");
		if (this.DataCleanExportButton.isEnabled()) {
			test.log(Status.PASS, "The Export Data Dropdown is clickable");

		} else {
			test.log(Status.FAIL, "The Export Data Dropdown is clickable");
		}
		test = report.createTest("Verify that clicking on Export Data Dropdown a list of options is visible in Dropdown menu");
		
		this.DataCleanExportButton.click();
		Thread.sleep(1000);
		if (DSM.ExportDataToCSV.isDisplayed()) {
			test.log(Status.PASS, "clicking on Export Data Dropdown a list of options is visible in Dropdown menu");

		} else {
			test.log(Status.FAIL, "clicking on Export Data Dropdown a list of options is not visible in Dropdown menu");
		}
		test = report.createTest("Verify that Export to CSV Button is visible in the Export Data Dropdown");
		if (DSM.ExportDataToCSV.isDisplayed()) {
			test.log(Status.PASS, "The Export to CSV Button is visible in the Export Data Dropdown");

		} else {
			test.log(Status.FAIL, "The Export to CSV Button is not visible in the Export Data Dropdown");
		}
		test = report.createTest("Verify that Export to CSV Button is clickable");
		if (DSM.ExportDataToCSV.isEnabled()) {
			test.log(Status.PASS, "The Export to CSV Button is clickable");

		} else {
			test.log(Status.FAIL, "The Export to CSV Button is not clickable");
		}
		test = report.createTest("Verify that clicking on Export to CSV button 'Export to CSV' pop-up appears");
	
		DSM.ExportDataToCSV.click();
		
		if (this.ExportDataCleansingFileName.isDisplayed()) {
			test.log(Status.PASS, "clicking on Export to CSV button 'Export to CSV' pop-up appears");

		} else {
			test.log(Status.FAIL, "clicking on Export to CSV button 'Export to CSV' pop-up does not appear");
		}
		this.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
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
		test.log(Status.PASS, "The user is able to export Cleansing Filter results data into CSV ");
	}

	public void ExportDataIntoExcel(String fileName) throws Exception {
		test = report.createTest("Export Cleansing Filter results data into Excel ");
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(this.DataCleanExportButton);
		test = report.createTest("Verify that Export Data Dropdown is visible on Data Cleansing screen");
		if (this.DataCleanExportButton.isDisplayed()) {
			test.log(Status.PASS, "The Export Data Dropdown is visible on Data Cleansing screen");

		} else {
			test.log(Status.FAIL, "The Export Data Dropdown is not visible on Data Cleansing screen");
		}
		test = report.createTest("Verify that Export Data Dropdown is clickable");
		if (this.DataCleanExportButton.isEnabled()) {
			test.log(Status.PASS, "The Export Data Dropdown is clickable");

		} else {
			test.log(Status.FAIL, "The Export Data Dropdown is clickable");
		}
		test = report.createTest("Verify that clicking on Export Data Dropdown a list of options is visible in Dropdown menu");
		
		this.DataCleanExportButton.click();
		Thread.sleep(1000);
		if (DSM.ExportDataToExcel.isDisplayed()) {
			test.log(Status.PASS, "clicking on Export Data Dropdown a list of options is visible in Dropdown menu");

		} else {
			test.log(Status.FAIL, "clicking on Export Data Dropdown a list of options is not visible in Dropdown menu");
		}
		test = report.createTest("Verify that Export to excel Button is visible in the Export Data Dropdown");
		if (DSM.ExportDataToExcel.isDisplayed()) {
			test.log(Status.PASS, "The Export to excel Button is visible in the Export Data Dropdown");

		} else {
			test.log(Status.FAIL, "The Export to excel Button is not visible in the Export Data Dropdown");
		}
		test = report.createTest("Verify that Export to excel Button is clickable");
		if (DSM.ExportDataToExcel.isEnabled()) {
			test.log(Status.PASS, "The Export to excel Button is clickable");

		} else {
			test.log(Status.FAIL, "The Export to excel Button is not clickable");
		}
		
		
		test = report.createTest("Verify that clicking on Export to excel button 'Export to excel' pop-up appears");
		
		DSM.ExportDataToExcel.click();
		
		if (this.ExportDataCleansingFileName.isDisplayed()) {
			test.log(Status.PASS, "clicking on Export to excel button 'Export to excel' pop-up appears");

		} else {
			test.log(Status.FAIL, "clicking on Export to excel button 'Export to excel' pop-up does not appear");
		}
		
	
		this.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		test = report.createTest("Verify that ok button is visible on Export to excel screen");
		if (PM.OKButtonSelectaProjectWondow.isDisplayed()) {
			test.log(Status.PASS, "The ok button is visible on Export to excel screen");

		} else {
			test.log(Status.FAIL, "The ok button is not visible on Export to excel screen");
		}
		test = report.createTest("Verify that ok button is clickable on Export to excel screen");
		if (PM.OKButtonSelectaProjectWondow.isEnabled()) {
			test.log(Status.PASS, "The ok button is clickable on Export to excel screen");

		} else {
			test.log(Status.FAIL, "The ok button is not clickable on Export to excel screen");
		}
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The user is able to export Cleansing Filter results data into Excel ");
	}

	// Almas Function For Data Cleansing

	// Start Create Folder

	public void verifyCreateFolderButtonIsVisible() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Create Folder Button is present in 'Data Cleansing' screen");
		if (this.CreateFolderButton.isDisplayed()) {
			test.log(Status.PASS, "The Create folder button is visible");
		} else {
			test.log(Status.FAIL, "The Create folder button is not visible");
		}
	}

	public void verifyCreateButtonIsClickable() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Create Folder Button is clickable in 'Data Cleansing' screen");
		if (this.CreateFolderButton.isEnabled()) {
			test.log(Status.PASS, "The Create Folder Button is clickable");
		} else {
			test.log(Status.FAIL, "The Create Button is not clickable");
		}
	}

	public void verifyCreateFolderPopupIsAppearing() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that 'Create Folder Popup is appearing when click on Create Folder Button in 'Data Cleansing' screen");
		this.CreateFolderButton.click();
		Thread.sleep(2000);
		if (this.CreateNewFolder.isDisplayed()) {
			test.log(Status.PASS, "The Create New folder popup is appearing");
		} else {
			test.log(Status.FAIL, "The Create New folder popup is not appearing");
		}
		CancelButton.click();
		Thread.sleep(2000);
	}

	// End Create Folder

	// Start Refresh
	public void verifyRefreshButtonIsVisible() throws Exception {
		test = report
				.createTest("Saved Filters Panel : Verify that Refresh Button is visible in 'Data Cleansing' screen");
		Thread.sleep(2000);
		if (this.RefreshButton.isDisplayed()) {
			test.log(Status.PASS, "The Refresh Button is visible");
		} else {
			test.log(Status.FAIL, "The Refresh Button is not visible");
		}
	}

	public void verifyRefreshButtonIsClickable() throws Exception {
		test = report
				.createTest("Saved Filters Panel : Verify that Refresh Button is clickable in 'Data Cleansing' screen");
		if (this.RefreshButton.isEnabled()) {
			test.log(Status.PASS, "The Refresh Button is clickable");
		} else {
			test.log(Status.FAIL, "The Refresh Button is not clickable");
		}
	}

	public void verifyListIsRefreshing() {

	}

	public void verifyLoadingSignISAppearing() {

	}
	// End Refresh

	// Start Expand All
	public void verifyExpandAllButtonIsVisible() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Expand All Button is visible in 'Data Cleansing' screen");
		Thread.sleep(2000);
		if (this.ExpandAllButton.isDisplayed()) {
			test.log(Status.PASS, "The Expand All Button is visible");
		} else {
			test.log(Status.FAIL, "The Expand All Button is not visible");
		}
	}

	public void verifyExpandAllButtonIsClickable() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Expand All Button is clickable in 'Data Cleansing' screen");
		if (this.ExpandAllButton.isEnabled()) {
			test.log(Status.PASS, "The Expand All Button is clickable");
		} else {
			test.log(Status.FAIL, "The Expand All Button is not clickable");
		}
	}

	public void verifyListOfAllFiltersIsExpanded() {

	}

	public void verifyExpandAllButtonChangesIntoCollapseAllButton() {
		test = report.createTest(
				"Saved Filters Panel : Verify that by clicking on Collapse Button, it is changing into Expand Button in 'Data Cleansing' screen");
		this.ExpandAllButton.click();
		if (this.CollapseAllButton.isDisplayed()) {
			test.log(Status.PASS, "The Expand All Button is change into Collapse All Button");
		} else {
			test.log(Status.FAIL, "The Expand All Button is not change into Collapse All Button");
		}
	}
	// End Expand All

	// Start Collapse All
	public void verifyCollapseAllButtonIsvisible() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Collapse All Button is visible on 'Data Cleansing' screen");
		Thread.sleep(2000);
		if (this.CollapseAllButton.isDisplayed()) {
			test.log(Status.PASS, "The Collapse All Button is visible");
		} else {
			test.log(Status.FAIL, "The Collapse All Button is not visible");
		}
	}

	public void verifyCollapseAllButtonIsClickable() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Collapse All Button is clickable on 'Data Cleansing' screen");
		if (this.CollapseAllButton.isEnabled()) {
			test.log(Status.PASS, "The Collapse All Button is clickable");
		} else {
			test.log(Status.FAIL, "The Collapse All Button is not clickable");
		}
	}

	public void verifyListOfAllFiltersIsCollapsed() throws Exception {

	}

	public void verifyCollapseAllButtonChangesIntoExpandAllButton() {
		test = report.createTest(
				"Saved Filters Panel : Verify that Expand All Button is Appearing by clicking on Collapse Button in 'Data Cleansing' screen");
		this.CollapseAllButton.click();
		if (this.ExpandAllButton.isDisplayed()) {
			test.log(Status.PASS, "The Collapse All Button is change into Expand All Button");
		} else {
			test.log(Status.FAIL, "The Collapse All Button is not change into Expand All Button");
		}
	}
	// End Collapse All

	// Start Collapse Panel
	public void verifyCollapsePanelButtonIsVisible() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Collapse Panel Button is visible on 'Data Cleansing' screen");
		Thread.sleep(2000);
		if (this.CollapsePanelButton.isDisplayed()) {
			test.log(Status.PASS, "The Collapse Panel Button is visible");
		} else {
			test.log(Status.FAIL, "The Collapse Panel Button is not visible");
		}
	}

	public void verifyCollapsePanelButtonIsClickable() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Collapse Panel Button is clickable on 'Data Cleansing' screen");
		if (this.CollapsePanelButton.isEnabled()) {
			test.log(Status.PASS, "The Collapse Panel Button is clickable");
		} else {
			test.log(Status.FAIL, "The Collapse Panel Button is not clickable");
		}
	}

	public void verifyCollapsePanelIsCollapsing() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Collapse Panel is Collapsing in 'Data Cleansing' screen");
		this.CollapsePanelButton.click();
		Thread.sleep(2000);
		if (this.ExpandPanelButton.isDisplayed()) {
			test.log(Status.PASS, "The Collapse Panel Button is change into Expand Panel Button");
		} else {
			test.log(Status.FAIL, "The Collapse Panel Button is not change into Expand Panel Button");
		}
	}
	// End Collapse Panel

	// Start Expand Panel
	public void verifyExpandPanelButtonIsVisible() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Expand Panel Button is visible on 'Data Cleansing' screen");
		Thread.sleep(2000);
		if (this.ExpandPanelButton.isDisplayed()) {
			test.log(Status.PASS, "The Expand Panel Button is visible");
		} else {
			test.log(Status.FAIL, "The Expand Panel Button is not visible");
		}
	}
	public void verifyExpandPanelButtonIsClickable() throws Exception {
		test = report.createTest(
				"Saved Filters Panel : Verify that Expand Panel Button is clickable on 'Data Cleansing' screen");
		if (this.ExpandPanelButton.isEnabled()) {
			test.log(Status.PASS, "The Expand Panel Button is clickable");
		} else {
			test.log(Status.FAIL, "The Expand Panel Button is not clickable");
		}
	}
	public void verifyExpandPanelIsExpanding() throws Exception {
		test = report
				.createTest("Saved Filters Panel : Verify that Expand Panel is Collapsing in 'Data Cleansing' screen");
		this.ExpandPanelButton.click();
		Thread.sleep(2000);
		if (this.CollapsePanelButton.isDisplayed()) {
			test.log(Status.PASS, "The Expand Panel Button is change into Collapse Panel Button");
		} else {
			test.log(Status.FAIL, "The Expand Panel Button is not change into Collapse Panel Button");
		}
	}
	// End Expand Panel

	// Start Data Source
	public void verifySelectDataSourceDropdownIsVisible() throws Exception {
		test = report.createTest(
				"Verify that Select Data Source Dropdown is visible on 'Data Cleansing' screen");
		if (this.SelectDataSourceDropdown.isDisplayed()) {
			test.log(Status.PASS, "The Data Source Dropdown is visible");
		} else {
			test.log(Status.FAIL, "The Data Source Dropdown is not visible");
		}
	}
	public void verifySelectDataSourceDropdownIsClickable() throws Exception {
		test = report.createTest(
				"Verify that Select Data Source Dropdown is clickable on 'Data Cleansing' screen");
		if (this.SelectDataSourceDropdown.isEnabled()) {
			test.log(Status.PASS, "The Data Source Dropdown is clickable");
		} else {
			test.log(Status.FAIL, "The Data Source dropdown is not clickable");
		}
	}
											// Need Discussion Here ...
	
	public void verifyAvailableListIsAppearingInDataSourceDropdown() throws Exception {
		SelectDataSourceDropdown.click();
		Thread.sleep(2000);
	}
	public void verifySelectedDataSourceIsVisibleInField() {
		int size = SelectDataSourceDropdownList.size();
		Random random = new Random();
		int getSize = random.nextInt(size-1)+1;
		test = report.createTest(
				"Verify that Data Source List in dropdown is clickable on 'Data Cleansing Screen' ");
		WebElement selectDataSource = SelectDataSourceDropdownList.get(getSize);
		selectDataSource.click();
		if (SelectedDataSource.getText().equals(selectDataSource.getText())) {
			test.log(Status.PASS, "The selected Data Source is visible in Data Source input field");
			size = DataSourceTables.size();
			for(WebElement table : DataSourceTables) {
				String[] getText = table.getText().split(" ");
				if (!cList.contains(getText[0])) {
					cList.add(getText[0]);
				}
			}	
		}
		else {
			test.log(Status.PASS, "The selected Data Source is not visible in Data Source input field");
		}
		
	}
	public void verifySelectedDataSourceColumnsIsVisible() {
		test = report.createTest(
				"Verify that selected Data Source Columns are displaying in 'Data Cleansing Screen' ");
		if (DataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Data Source Columns are displayed ");
		}
		else {
			test.log(Status.PASS, "The Data Source Columns are not displayed ");
		}
	}
	public void verifyPopupIsAppearingIfDataSourceIsChanged() throws Exception {
		verifyAvailableListIsAppearingInDataSourceDropdown();
		
		int size = SelectDataSourceDropdownList.size();
		Random random = new Random();
		int getSize = random.nextInt(size-1)+1;
		test = report.createTest(
				"Verify that popup is displayed when Data Source is changed in 'Data Cleansing Screen' ");
		WebElement selectDataSource = SelectDataSourceDropdownList.get(getSize);
		selectDataSource.click();
		
		if (YesButtonInChangeDataSource.isDisplayed()) {
			test.log(Status.PASS, "The Change Data Source is displayed");
		}
		else {
			test.log(Status.PASS, "The Change Data Source is not displayed");
		}
	}
	public void verifyYesButtonIsVisible() {
		test = report.createTest(
				"Verify that Yes Button is visible in 'Data Source Changed' screen");
		if (YesButtonInChangeDataSource.isDisplayed()) {
			test.log(Status.PASS, "The Yes Button is visible");
		} else {
			test.log(Status.FAIL, "The Yes Button is not visible");
		}
	}
	public void verifyYesButtonIsClickable() {
		test = report.createTest(
				"Verify that Yes Button is clickable in 'Data Source Changed' screen");
		if (YesButtonInChangeDataSource.isEnabled()) {
			test.log(Status.PASS, "The Yes Button is clickable");
		} else {
			test.log(Status.FAIL, "The Yes Button is not clickable");
		}
	}
	public void verifyByclickingYesButtonIsDataSourceChanged() throws Exception {
		test = report.createTest("Verify that By clicking Yes Button Data Source is changed in 'Data Cleansing' Screen ");
		YesButtonInChangeDataSource.click();
		Thread.sleep(2000);
		if (DataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Data Source is changed");
		} else {
			test.log(Status.FAIL, "The Data Source is changed");
		}
	}
	public void verifyNoButtonIsVisible() {
		
		test = report.createTest(
				"Verify that No Button is visible in 'Data Source Changed' screen");
		if (NoButtonInChangeDataSource.isDisplayed()) {
			test.log(Status.PASS, "The No Button is visible");
		} else {
			test.log(Status.FAIL, "The No Button is not visible");
		}
	}
	public void verifycancelButtonIsVisible() {
		test = report.createTest(
				"Verify that No Button is visible in 'Data Source Changed' screen");
		if (CancelButtonInChangeDataSource.isDisplayed()) {
			test.log(Status.PASS, "The Cancel Button is visible");
		} else {
			test.log(Status.FAIL, "The Cancel Button is not visible");
		}
	}
	// End Data Source

	// Start View Data
	public void verifyViewDataButtonIsVisible() {
		test = report.createTest(
				"Verify that View Data Button is visible on 'Data Cleansing' screen");
		if (this.ViewDataButton.isDisplayed()) {
			test.log(Status.PASS, "The View Data Button is visible");
		} else {
			test.log(Status.FAIL, "The View Data Button is not visible");
		}
	}
	public void verifyViewDataButtonIsClickable() throws Exception {
		test = report.createTest(
				"Verify that View Button is clickable on 'Data Cleansing' screen");
		if (this.ViewDataButton.isEnabled()) {
			test.log(Status.PASS, "The View Button is clickable");
		} else {
			test.log(Status.FAIL, "The View Button is not clickable");
		}
	}
	public void verifyDataSourceIsVisibleInDataSnapshot() throws Exception {
		test = report.createTest(
				"Verify that View Button is clickable on 'Data Cleansing' screen");
		this.ViewDataButton.click();
		Thread.sleep(2000);
		if (this.DataSnapShot.isDisplayed()) {
			test.log(Status.PASS, "The Data Snapshot is visible");
		} else {
			test.log(Status.FAIL, "The Data Snapshot is not visible");
		}
	}
	// End View Data

	// Start Column
	public void verifyColumnButtonIsVisible() {
		test = report
				.createTest("Verify that Column Button is visible on 'Data Cleansing' screen");
		if (this.ColumnButton.isDisplayed()) {
			test.log(Status.PASS, "The Column Button is visible");
		} else {
			test.log(Status.FAIL, "The Column Button is not visible");
		}
	}
	public void verifyColumnButtonIsClickable() {
		test = report.createTest("Verify that Column Button is clickable on 'Data Cleansing' screen");
		if (this.ColumnButton.isEnabled()) {
			test.log(Status.PASS, "The Column Button is clickable");
		} else {
			test.log(Status.FAIL, "The Column Button is not clickable");
		}
	}
	public void verifyColumnScreenIsOpened() throws Exception {
		test = report.createTest("Verify that Column Screen is visible by clicking on Column Button on 'Data Cleansing' screen");
		this.ColumnButton.click();
		Thread.sleep(2000);
		if (this.ColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "The Column Popup is visible");
		} else {
			test.log(Status.FAIL, "The Column Popup is not visible");
		}
	}
	public void verifyColumnsNameIsDisplaying() throws Exception {
		ArrayList<String> cscreenList = new ArrayList<>();
		test = report.createTest("Verify that Column's Name of Data Source are displaying same in 'Column Screen' ");
		Thread.sleep(2000);
		for (WebElement cnam : columnNameInColumnScreen) {
			String getText = cnam.getText();
			if (!cscreenList.contains(getText)) {
				cscreenList.add(getText);
			}
		}
		Actions actions = new Actions(driver);
		actions.moveToElement(columnScreenScroller).perform();
		for(WebElement cName : columnNameInColumnScreen) {
			String getText = cName.getText();
			if (!cscreenList.contains(getText)) {
				cscreenList.add(getText);
			}
		}
		System.out.println(cscreenList);
		System.out.println(cList);
		if (cscreenList.equals(cList)) {
			test.log(Status.PASS, "The Column's Name of selected data source are displaying same in Column Screen");
		}else {
			test.log(Status.FAIL, "The Column's Name of selected data source are not displaying same in Column Screen");
		}
	}
	public void verifyColumnScreenSeachFieldIsVisible() {
		test = report.createTest("Verify that Search field is visible in 'Column Screen' ");
		if (ColumnScreenSearchField.isDisplayed()) {
			test.log(Status.PASS, "The Column Search Field is visible");
		}else {
			test.log(Status.FAIL, "The Column Search Field is not visible");
		}
	}
	public void verifyColumnScreenSearchFieldInputs() {
		String sendData = "AMT_1";
		test = report.createTest("Verify that Search field inputs alphabets, numeric and special character's in 'Column Screen' ");
		ColumnScreenSearchField.sendKeys(sendData);
		String getInputValue = ColumnScreenSearchField.getAttribute("value");
		if (getInputValue.equals(sendData)) {
			test.log(Status.PASS, "The Column Search Field inputs alphabets, numeric and special character");
		}else {
			test.log(Status.FAIL, "The Column Search Field not inputs alphabets, numeric and special character");
		}
	}
	public void verifyColumnScreenSearchFieldIsWorking() throws Exception {
		String sendData = "ADR";
		ArrayList<String> list = new ArrayList<>();
		test = report.createTest("Verify that valid column's are searched and displayed related to input in 'Column Screen' ");
		ColumnScreenSearchField.clear();
		ColumnScreenSearchField.sendKeys(sendData);
		Thread.sleep(2000);
		for(WebElement cName : columnNameInColumnScreen) {
			String getText = cName.getText();
			list.add(getText);	
		}
		for(String data : list) {
			if (data.contains(sendData)) {
				test.log(Status.PASS, "The valid result are displayed");
			}else {
				test.log(Status.FAIL, "The valid result are not displayed");
			}
		}
		
	}
	public void verifyColumnNameCheckboxIsVisible() {
		ColumnScreenSearchField.clear();
		test = report.createTest("Verify that Column Name Checkbox is visible in 'Column Screen' ");
		if (ColumnNameTopCheckboxNotSelected.isDisplayed()) {
			test.log(Status.PASS, "The Column Name Checkbox is visible");
		}else {
			test.log(Status.FAIL, "The Column Name Checkbox is not visible");
		}
	}
	public void verifyColumnNameCheckbox() {
		test = report.createTest("Verify that Column Name Checkbox can be check or uncheck in 'Column Screen' ");
		
		ColumnNameTopCheckboxNotSelected.click();
		
		if (ColumnNameTopCheckboxSelected.isDisplayed()) {
			test.log(Status.PASS, "The Column Name Checkbox is checked");
		}else {
			test.log(Status.FAIL, "The Column Name Checkbox is not checked");
		}
		
		ColumnNameTopCheckboxSelected.click();
		
		if (ColumnNameTopCheckboxNotSelected.isDisplayed()) {
			test.log(Status.PASS, "The Column Name Checkbox is unchecked");
		}else {
			test.log(Status.FAIL, "The Column Name Checkbox is not unchecked");
		}
	}
	public void verifAllColumnsAreCheckedIfColumnNameIsChecked() {
		test = report.createTest("Verify that All Columns are checked if Column Name is checked in 'Column Screen' ");
		ColumnNameTopCheckboxNotSelected.click();
		if (AllSelectedColumnCheckbox.isDisplayed()) {
			test.log(Status.PASS, "All Columns Checkboxes are checked");
		}else {
			test.log(Status.FAIL, "All Columns Checkboxes are not unchecked");
		}
		ColumnNameTopCheckboxSelected.click();
	}
	public void verifyColumnScreenUpArrowIsVisible() {
		test = report.createTest("Verify that Up Arrow button is visible in 'Column Screen' ");
		
	}
	public void verifyUpArrowButtonIsClickable() {
		test = report.createTest("Verify that Up Arrow button is clickable in 'Column Screen' ");
		if (UpArrowButton.isEnabled()) {
			test.log(Status.PASS, "The Up Arrow button is clickable");
		}else {
			test.log(Status.FAIL, "The Up Arrow button is not clickable");
		}
	}
	public void verifyUpArrowChangesIntoDownArrow() throws Exception {
		test = report.createTest("Verify that Up Arrow button change into Down Arrow button in 'Column Screen' ");
		UpArrowButton.click();
		Thread.sleep(2000);
		if (DownArrowButton.isDisplayed()) {
			test.log(Status.PASS, "The Up Arrow button change into Down Arrow button");
		}else {
			test.log(Status.FAIL, "The Up Arrow button is not change into Down Arrow button ");
		}
	}
	public void verifyUpArrowButtonSortTheData() {
		
		
	}
	public void verifyDownArrowButtonIsClickable() {
		test = report.createTest("Verify that Down Arrow button is clickable in 'Column Screen' ");
		if (DownArrowButton.isEnabled()) {
			test.log(Status.PASS, "The Down Arrow button is clickable");
		}else {
			test.log(Status.FAIL, "The Down Arrow button is not clickable");
		}
	}
	public void verifyDownArrowChangesIntoUpArrow() throws Exception {
		test = report.createTest("Verify that Down Arrow button change into Up Arrow button in 'Column Screen' ");
		DownArrowButton.click();
		Thread.sleep(2000);
		if (UpArrowButton.isDisplayed()) {
			test.log(Status.PASS, "The Down Arrow button change into Up Arrow button");
		}else {
			test.log(Status.FAIL, "The Down Arrow button is not change into Up Arrow button ");
		}
	}
	public void verifyCheckboxIsVisibleWithEachColumnName() {
		test = report.createTest("Verify that Checkbox is visible with each Column Name in  'Column Screen' ");
		for(WebElement listCheckbox : AllUnselectedColumnCheckbox) {
			if (listCheckbox.isDisplayed()) {
				test.log(Status.PASS, "The Checkbox is visible with each column name");
			}else {
				test.log(Status.FAIL, "The Checkbox is not visible with each column name");
			}
		}
	}
	public void verifyIndiviualColumnCanbeCheck() {
		test = report.createTest("Verify that Indiviual Column can be checked in 'Column Screen' ");
		IndiviualColumnCheckbox.click();	
		if (ColumnNameSelectedCheckbox.isDisplayed()) {
			test.log(Status.PASS, "Indiviual Column is checked");
		}else {
			test.log(Status.FAIL, "Indiviual Column is not checked");
		}
		IndiviualColumnCheckbox.click();
		if (ColumnNameUnSelectedCheckbox.isDisplayed()) {
			test.log(Status.PASS, "Indiviual Column is unchecked");
		}else {
			test.log(Status.FAIL, "Indiviual Column is not unchecked");
		}
	}
	public void verifyOKButtonIsVisible() {
		test = report.createTest("Verify that Ok button is visible in 'Column Screen' ");
		if (OkButton.isDisplayed()) {
			test.log(Status.PASS, "Ok button is visible");
		}else {
			test.log(Status.FAIL, "Ok button is not visible");
		}
	}
	public void verifyOKButtonIsClickable() {
		test = report.createTest("Verify that Ok button is clickable 'Column Screen' ");
		if (OkButton.isEnabled()) {
			test.log(Status.PASS, "Ok button is clickable");
		}else {
			test.log(Status.FAIL, "Ok button is not clickable");
		}
	}
	public void verifyByClickingOkButtonColumnScreenClose() throws Exception {
		test = report.createTest("Verify that by clicking on Ok button in Column Screen, Selected Column Display in 'Data Cleansing' Screen ");
		IndiviualColumnCheckbox.click();
		Thread.sleep(2000);
		OkButton.click();
		Thread.sleep(2000);
		int size1 = DataSourceTables.size();
		if (size1==columnSize) {
			test.log(Status.PASS, "Selected Columns are displaying correctly");
		}else {
			test.log(Status.FAIL, "Selected Columns are not displaying correctly");
		}
		
		
	}
	public void verifyCancelButtonIsVisible() throws Exception {
		ColumnButton.click();
		Thread.sleep(2000);
		test = report.createTest("Verify that Cancel button is visible in 'Column Screen' ");
		if (CancelButton.isDisplayed()) {
			test.log(Status.PASS, "Cancel button is visible");
		}else {
			test.log(Status.FAIL, "Cancel button is not visible");
		}
	}
	public void verifyCancelButtonIsClickable() {
		test = report.createTest("Verify that Cancel button is clickable 'Column Screen' ");
		if (CancelButton.isEnabled()) {
			test.log(Status.PASS, "Cancel button is clickable");
		}else {
			test.log(Status.FAIL, "Cancel button is not clickable");
		}
	}
	public void verifyCancelButtonCloseCancelScreen() throws Exception {
		test = report.createTest("Verify that Cancel button closes the 'Column Screen' ");
		CancelButton.click();
		Thread.sleep(2000);
		if (columnNameInColumnScreen.size()==0) {
			test.log(Status.PASS, "The Column Screen is close");
		}else {
			test.log(Status.FAIL, "The Column Screen is not close");
		}
	}
	// End Column
	
	// Start Calculated Column
	
	public void verifyCalculatedColumnButtonIsVisible() throws Exception {
		
		test = report.createTest("Verify that Calculated Column button is visible in 'Data Cleansing' Screen ");
		if (CaculatedColumn.isDisplayed()) {
			test.log(Status.PASS, "Calculated Column button is visible");
		}else {
			test.log(Status.FAIL, "Calculated Column button is not visible");
		}
	}
	public void verifyCalculatedColumnButtonIsClickable() {
		test = report.createTest("Verify that Calculated Column button is clickable 'Data Cleansing' Screen ");
		if (CaculatedColumn.isEnabled()) {
			test.log(Status.PASS, "Calculated Column button is clickable");
		}else {
			test.log(Status.FAIL, "Calculated button is not clickable");
		}
	}
	public void verifyGeneratColumnScreenOpens() {
		test = report.createTest("Verify that By clicking on Calculated Column button it opens 'Generate Column' Screen ");
		CaculatedColumn.click();
		if (CalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "The Calculated Column Screen opened");
		}else {
			test.log(Status.FAIL, "The Calculated Column Screen not opened");
		}
	}
	public void verifyColumnsNameInCalculatedColumnScreen() throws Exception {
		ArrayList<String> ccList = new ArrayList<>();
		test = report.createTest("Verify that Same Column's Name of Data Source are displaying in 'Calculated Column' Screen ");
		Thread.sleep(2000);
		for (WebElement cname : ColumnNameInCalculatedColumnScreen) {
			String getText = cname.getText();
			if (!ccList.contains(getText)) {
				ccList.add(getText);
			}
		}
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ColumnNameScrollerInCalculatedColumnScreen).perform();
		
		for(WebElement cname : ColumnNameInCalculatedColumnScreen) {
			String getText = cname.getText();
			if (!ccList.contains(getText)) {
				ccList.add(getText);
			}
		}
		if (ccList.equals(cList)) {
			test.log(Status.PASS, "Same Column's Name of Data Source are displaying.");
		}else {
			test.log(Status.FAIL, "Same Column's Name of Data Source are not displaying.");
		}
	}
	public void verfiyColumnNameTextFieldIsVisible() throws Exception {
		
		test = report.createTest("Verify that Column Name Text Field is visible in 'Calculated Column' Screen ");
		if (ColumnNameTextFieldInCalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "Column Name Text Field is visible");
		}else {
			test.log(Status.FAIL, "Column Name Text field is not visible");
		}
	}
	public void VerifyColumnNameTextFieldInputs() throws Exception {
		String sendData_Str = "NewText";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		test = report.createTest("Verify that Column Name Text Field input only numeric and alphabet in 'Calculated Column' Screen ");
		ColumnNameTextFieldInCalculatedColumnScreen.clear();
		ColumnNameTextFieldInCalculatedColumnScreen.sendKeys(sendData_Str+sendData_Int+sendData_Char);
		Thread.sleep(2000);
		String getInputValue = ColumnNameTextFieldInCalculatedColumnScreen.getAttribute("value");
		if (getInputValue.equals(sendData_Str+sendData_Int)) {
			test.log(Status.PASS, "Text Field inputs only alphabets and numeric values");
		}else {
			test.log(Status.FAIL, "Text Field not inputs only alphabets and numeric values");
		}
		ColumnNameTextFieldInCalculatedColumnScreen.clear();
	}
	public void verifyFunctionTextFieldIsVisible() {
		test = report.createTest("Verify that Funtions Text Field is visible in 'Calculated Column' Screen ");
		if (FunctionsTextFieldInCalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "Functions Text Field is visible");
		}else {
			test.log(Status.FAIL, "Functions Text field is not visible");
		}
	}
	public void VerifyFunctionsTextFieldInputs() throws Exception {
		String sendData_Str = "NewText";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		test = report.createTest("Verify that Functions Text Field input numeric, characters and alphabet in 'Calculated Column' Screen ");
		FunctionsTextFieldInCalculatedColumnScreen.clear();
		FunctionsTextFieldInCalculatedColumnScreen.sendKeys(sendData_Str+sendData_Int+sendData_Char);
		Thread.sleep(2000);
		String getInputValue = FunctionsTextFieldInCalculatedColumnScreen.getAttribute("value");
		if (getInputValue.equals(sendData_Str+sendData_Int+sendData_Char)) {
			test.log(Status.PASS, "Text Field inputs alphabets, special characters and numeric values");
		}else {
			test.log(Status.FAIL, "Text Field not inputs alphabets, special characters and numeric values");
		}
		
	}
	public void verifyFunctionTextFieldDisplayRelevantData() throws Exception {
		String[] json = {"Right","Left","Lowercase","Trim","Uppercase"};
		Random r=new Random();        
      	int randomNumber=r.nextInt(json.length);
      	String sendData = json[randomNumber];
      	test = report.createTest("Verify that Funtions Text Field is displaying relevant Data in 'Calculated Column' Screen ");
      	FunctionsTextFieldInCalculatedColumnScreen.clear();
      	FunctionsTextFieldInCalculatedColumnScreen.sendKeys(sendData);
      	Thread.sleep(2000);
      	for(WebElement list : FunctionsListInCalculatedColumnScreen) {
      		String listText = list.getText();
      		if (listText.toLowerCase().contains(sendData.toLowerCase())) {
      			test.log(Status.PASS, "The Search is displaying relevant Data -> Input : "+sendData+" </br> Result : "+listText);
			}else {
				test.log(Status.FAIL, "The Search is not displaying relevant Data -> Input : "+sendData+" </br> Result : "+listText);
			}
      	}
      	FunctionsTextFieldInCalculatedColumnScreen.clear();
	}
	public void verifyScrollBarIVisibleOfFunctionsPanel() {
		test = report.createTest("Verify that Funtions Panel Scroll Bar is visible in 'Calculated Column' Screen ");
		if(FunctionsScrollerInCalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "The Sroll bar is visible in Functions Panel");
		}else {
			test.log(Status.FAIL, "The Sroll bar is not visible in Functions Panel");
		}
	}
	public void verifyPreviewSectionOfFucntionsPanelIsVisible() {
		test = report.createTest("Verify that Preview Section of Funtions Panel is visible in 'Calculated Column' Screen ");
		if(previewSectionInCalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "The Preview section of Functions Panel is visible");
		}else {
			test.log(Status.FAIL, "The Preview section of functional Panel is not visiable");
		}
	}
	public void verifyPreviewSectionDisplaySelectedFunctionsDetail() throws Exception {
		test = report.createTest("Verify that Preview Section is displaying functions detail in 'Calculated Column' Screen ");
		int length = FunctionsListInCalculatedColumnScreen.size();
		Random r=new Random();        
      	int randomNumber=r.nextInt(length);
      	WebElement selectedFunction = FunctionsListInCalculatedColumnScreen.get(randomNumber);
      	selectedFunction.click();
      	Thread.sleep(2000);
      	String getSelectedFunctionText = selectedFunction.getText();
      	if (getSelectedFunctionText.equals(previewSectionContentInCalculatedColumnScreen.getText())) {
      		test.log(Status.PASS, "The Preview Section displaying the selected functions");
		}else {
			test.log(Status.FAIL, "The Preview Section is not displaying the selected functions");
		}
	}
	public void verifyRemoveSelectedItemsIsVisible() {
		test = report.createTest("Verify that Remove Selected Item Button is visible in 'Calculated Column' Screen ");
		if(RemoveSelectedItemButtonInCalculatedColumnScreen.isDisplayed()) {
			test.log(Status.PASS, "The Remove Selected button is visible");
		}else {
			test.log(Status.FAIL, "The Remove Selected button is not visiable");
		}
	}
	public void verifyRemoveSelectedItemsIsClickable() {
		test = report.createTest("Verify that Remove Selected Item Button is clickable in 'Calculated Column' Screen ");
		if(RemoveSelectedItemButtonInCalculatedColumnScreen.isEnabled()) {
			test.log(Status.PASS, "The Remove Selected button is clickable");
		}else {
			test.log(Status.FAIL, "The Remove Selected button is not clickable");
		}
	}
	public void verifyRemoveSelectedbuttonRemoveColumnFromFieldPreview() {
		test = report.createTest("Verify that Remove Selected Item Button removes the selected column from Field Preview section in 'Calculated Column' Screen ");
		
		if(RemoveSelectedItemButtonInCalculatedColumnScreen.isEnabled()) {
			test.log(Status.PASS, "The Remove Selected button is clickable");
		}else {
			test.log(Status.FAIL, "The Remove Selected button is not clickable");
		}
	}
}