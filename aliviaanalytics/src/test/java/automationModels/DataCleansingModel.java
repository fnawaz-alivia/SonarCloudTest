package automationModels;

import java.util.ArrayList;
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

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansingModel extends Configuration {

	public static int columnSize;

	public static ExtentTest test;

	@FindBy(how = How.XPATH, using = "//table[(text() = 'Data Cleansing' or . = 'Data Cleansing')]")

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

	// Almas Changes .... //

	// Start Create Folder XPath's

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]//div[contains(@class,'search')]//input")

	WebElement SearchFieldSidePanel;

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]//div[contains(@class,'clear')]")

	WebElement SearchFieldCrossButtonSidePanel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]/div[2]/div[2]//a[contains(@id,'folder')]")

	WebElement CreateFolderButtonSidePanel;

	@FindBy(how = How.XPATH, using = "//div[text()='Create New Folder']")

	List<WebElement> CreateNewFolderScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[2]//input[@type='text']")

	WebElement CreateNewFolderTextField;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//textarea")

	WebElement CreateNewFolderTextArea;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]//table//div[contains(@class,'folder')]/following::span[1]")

	List<WebElement> CreatedFolderListSidePanel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]//table//span[@class='x-tree-node-text ']")

	List<WebElement> TreeListSidePanel;
	
	

	// End

	// Start Refresh XPath's

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]/div[2]/div[2]//a[contains(@data-qtip,'Refresh')]")

	WebElement RefreshButtonSidePanel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]//div[contains(text(),'Filters ...')]")

	List<WebElement> RefreshButtonLoadingSidePanel;

	// End

	// Start Expand and Collapse Button

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]/div[2]/div[2]//a[contains(@data-qtip,'Expand All')]")

	WebElement ExpandAllButtonSidePanel;

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]/div[2]/div[2]//a[contains(@data-qtip,'Collapse All')]")

	WebElement CollapseAllButtonSidePanel;

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'x-panel-resizable')]/div[1]//div[contains(@class,'collapse')]")

	WebElement CollapsePanelButtonSidePanel;

	@FindBy(how = How.XPATH, using = "//div[@class='x-panel x-fit-item x-panel-default']/div/div/div[contains(@class,'vertical')]/div[1]//div[contains(@class,'expand')]")

	WebElement ExpandPanelButtonSidePanel;

	// End

	// Start Folders and Filters

	@FindBy(how = How.XPATH, using = "//div[@id='dataClean-folder-tree-body']/div/div[2]//table[1]//div[contains(@class,'cleans-lock')]")

	WebElement CreatedFilter_DC;

	// Start Select and Change Data Source

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'dataCleansingPanel')]//div[contains(@class,'x-form-arrow-trigger')]")

	WebElement SelectDataSourceDropdownButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']/div/ul")

	WebElement SelectDataSourceDropdown;

	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item' and text()='Medical Transactions']")

	WebElement SelectDataSourceMedical;

	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item x-boundlist-selected' and text()='Medical Transactions']")

	WebElement SelectedDataSource;
	
	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item' and contains(text(),'Automation1')]")

	WebElement ChangeDataSource;	
	
	@FindBy(how = How.XPATH, using = "//li[@class='x-boundlist-item x-boundlist-selected'] and contains(text(),'Automation1')]")

	WebElement SelectedChangeDataSource;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Data Source changed']")

	WebElement DataSourceChangeScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'dataCleansingPanel')]//input")

	WebElement SelectDataSourceInput;
	
	

	// Generic Button
	
	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")

	WebElement YesButton;

	@FindBy(how = How.XPATH, using = "//span[text()='No']")

	WebElement NoButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")

	WebElement CancelButton;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Save']")

	WebElement SaveButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[contains(@class,'x-tool-close')]")

	WebElement CrossButton;

	// End

	// Start View Data

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'dataCleansingPanel')]//a[1]/span")

	WebElement ViewDataButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'snapshot-min-window')]//div[contains(@class,'x-grid-scrollbar-clipper')]")

	WebElement DataSnapShot;

	// End

	// Start Save Button

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div//a[4]/span/span[1]")

	WebElement SaveIconButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div//a[4]/span[2]")

	WebElement SaveDownArrowButton;

	@FindBy(how = How.XPATH, using = "//span[text()='Save As']")

	WebElement SaveAsButton;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Create New Filter']")

	List<WebElement> CreateNewFilterScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div//a[5]/span")

	WebElement RemoveButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div//a[6]/span")

	WebElement ResetButton;

	@FindBy(how = How.XPATH, using = "//div[text()='Please Confirm']")

	WebElement PleaseConfirmDialog;

	@FindBy(how = How.XPATH, using = "//div[text()='Please Confirm']")

	List<WebElement> Size_PCD;

	@FindBy(how = How.XPATH, using = "//div[@class='queryBuilderBreadCrumbsWrap']")

	List<WebElement> BreadCrumbs;

	// End

	// Start Data Source Table

	@FindBy(how = How.XPATH, using = "//table[contains(@id,'gridview')]/tbody/tr/td[3]/div")

	WebElement DataSourceTable;

	@FindBy(how = How.XPATH, using = "//table[contains(@id,'gridview')]/tbody/tr/td[3]/div")

	List<WebElement> DataSourceTables;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'fa fa-trash')]")

	List<WebElement> RemoveButtonDataSourceTable;

	@FindBy(how = How.XPATH, using = "//table//div[text()='calculated']/following::td[7]")

	List<WebElement> CalculatedColumnRemoveButtonDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div[2]/div/div/div/div/div/div[3]")

	WebElement ColumnNameHeadingDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataCleansingPanel')]/div/div[2]/div/div/div/div/div/div[3]/div/div[2]")

	WebElement ColumnNameHeadingDropdownArrowDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]")

	WebElement ColumnNameHeadingDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]//span[text()='Sort Ascending']")

	WebElement SortAscendingButtonColumnDropdownDatSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]//span[text()='Sort Descending']")

	WebElement SortDescendingButtonColumnDropdownDatSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]//span[text()='Columns']")

	WebElement ColumnsButtonColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Column Name')]")

	WebElement InnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span[contains(text(),'Column Name')]")

	WebElement ColumnNameInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = " //div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span[text()='Type']")

	WebElement TypeInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = " //div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span[text()='Change Type']")

	WebElement ChangeTypeInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = " //div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span[text()='Filters']")

	WebElement FiltersInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = " //div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span[text()='Rename Column']")

	WebElement RenameColumnInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = " //div[contains(@data-componentid,'menu') and contains(.,'Column Name')]//span//i[text()='Actions']")

	WebElement ActionsInnerColumnDropdownDataSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]//div[contains(@class,'x-menu-item-unchecked')]//span[text()='Filters']")

	WebElement UnselectedFiltersButtonColumnDropdownDatSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu') and contains(.,'Sort')]//div[contains(@class,'x-menu-item-checked')]//span[text()='Filters']")

	WebElement SelectedFiltersButtonColumnDropdownDatSourceTable;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-componentid,'menu')]//input[contains(@placeholder,'Enter Filter Text')]")

	WebElement FiltersSearchColumnDropdownDatSourceTable;

	// End

	// Start Column Button

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'dataCleansingPanel')]//a[2]/span")

	WebElement ColumnButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]")

	WebElement ColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div[2]/div/div/div/div[3]/div/div[2]/table/tbody/tr/td[2]/div")

	List<WebElement> ColumnNameColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[@class='x-scroller-spacer']")

	WebElement ScollerColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div/div/div/div[2]/div")

	WebElement CancelButtonColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div/div/div/div/div/div/div/input")

	WebElement SearchFieldColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[2]/div/div/div[contains(@aria-describedby,'description-not-selected')]")

	WebElement UnselectedTopCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[2]/div/div/div[contains(@aria-describedby,'description-selected')]")

	WebElement SelectedTopCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[1]//td[contains(@aria-describedby,'description-selected')]")

	WebElement SelectedFirstCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[1]//td[contains(@aria-describedby,'description-not-selected')]")

	WebElement UnselectedFirstCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-sort-ASC')]/div/div/div/div/span")

	WebElement UpArrowButtonColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-sort-DESC')]/div/div/div/div/span")

	WebElement DownArrowButtonColumnScreen;

	@FindBy(how = How.XPATH, using = "//table[contains(@class,'x-grid-item-selected') and contains(@id,'gridview')]")

	WebElement AllColumnsSelectedCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[contains(@class,'x-grid-item') and contains(@id,'gridview')]")

	WebElement AllColumnsUnSelectedCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div[3]/div/div[2]/table/tbody/tr/td/div/span")

	List<WebElement> AllColumnsUnselectedCheckboxColumnScreen;

	@FindBy(how = How.XPATH, using = "//span[text()='OK']")

	WebElement OkButton;

	// End

	// Start Calculated Column

	@FindBy(how = How.XPATH, using = "//span[text()='Calculated Column']")

	WebElement CalculatedColumn;

	@FindBy(how = How.XPATH, using = "//div[text()='Generate Calculated Column']")

	WebElement CalculatedColumnScreenHeading;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-resizable')]/div[2]/div/div[2]//table//tr/td/div")

	List<WebElement> ColumnNameCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[2]//div[@class='x-scroller-spacer']")

	WebElement ColumnsScrollerCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[1]//input")

	WebElement NewColumnFieldCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//input")

	WebElement SearchFunctionsFieldCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//table//td/div")

	List<WebElement> FunctionsListCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]//div[@class='x-scroller-spacer']")

	WebElement FunctionsScrollerCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]/div[2]/div/div/div/label")

	WebElement PreviewSectionCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[3]/div[2]/div/div/div/label/b")

	WebElement PreviewSectionContentCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//span[text()='Remove selected item']")

	WebElement RemoveSelectedItemButtonCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[4]/div/div[2]/div/div")

	WebElement FieldPreviewCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//a[contains(@class,'ftobutton-target')]//span[2]")

	List<WebElement> FieldPreviewItemsCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[4]/div/div[2]/div/div/a//span[2]")

	List<WebElement> FieldPreviewItemsWithConcatenationCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//a[contains(@class,'btn-pressed')]")

	WebElement SelectedFieldPreviewItemsCalculatedColumnScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div[4]//div[@class='x-scroller-spacer']")

	List<WebElement> FieldPreviewScrollerCalculatedColumnScreen;

	// End

	// Start Create New Filter

	@FindBy(how = How.XPATH, using = "//div[text()='Create New Filter']")

	WebElement CreateNewFilterHeading;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]/div/div/div/div/div/div[1]//input")

	WebElement TextFieldCNFilter;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-errorqtip,'This field is required')]")

	WebElement TextFieldMandatoryCNFilter;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-form-type-radio')]")

	List<WebElement> RadioButtonsListCNFilter;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-form-item-body')]//div[contains(@class,'x-form-cb-checked')]")

	List<WebElement> SelectedRadioButtonCNFilter;



	// Helper Function //
	public String InnerColumn(List<WebElement> elements) {
		ArrayList<String> list = new ArrayList<>();
		for (WebElement ele : elements) {
			String getListText = ele.getText();
			list.add(getListText);
		}
		StringBuilder strbul = new StringBuilder();
		for (String str : list) {
			strbul.append(str);
			strbul.append(",");
		}
		String str = strbul.toString().replace(",+,", " + ");
		return str;
	}

	public String DataSourceTablesFunc() {
		ArrayList<String> list = new ArrayList<>();
		for (WebElement newData : DataSourceTables) {
			String[] tableData = newData.getText().split(" \\(");
			list.add(tableData[0]);
		}
		StringBuilder strbul = new StringBuilder();
		for (String str : list) {
			strbul.append(str);
			strbul.append(",");
		}
		String str = strbul.toString();
		return str;
	}

	public void LandingOnDataCleansingPage() throws Exception {
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
		Thread.sleep(500);
		this.SelectDSForDataCleansing.click();
	}

	public void SelectDSForDataCleansing() throws Exception {
		Thread.sleep(500);
		this.SelectDSForDataCleansing.sendKeys("dental");
		this.SelectDSForDataCleansing.sendKeys(Keys.ENTER);
		Thread.sleep(500);

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
		Thread.sleep(500);
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
		Thread.sleep(500);
		test.log(Status.PASS, "The user is able to export Cleansing Filter results data into Excel ");
	}

	// Almas Function For Data Cleansing

	// Start Create Folder

	public void verifyCreateNewFolderButtonVisible_DCScreen()  {
		utilityMethods.visible(this.CreateFolderButtonSidePanel,
				"Verify that Create New Folder Button is present in 'Data Cleansing' screen");
	}

	public void verifyCreateNewFolderButtonClickable_DCScreen()  {
		utilityMethods.clickable(this.CreateFolderButtonSidePanel,
				"Verify that Create New Folder Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyCreateNewFolderScreenVisible()  {
		utilityMethods.list_Visible(this.CreateFolderButtonSidePanel,500,this.CreateNewFolderScreen,
				"Verify that Create New Folder Screen is visible after clicking on Create New Folder Button in 'Data Cleansing' screen");
	}

	public void verifyCancelButtonVisible_CNFScreen() {
		utilityMethods.visible(this.CancelButton,
				"Verify that Cancel Button is present in 'Create New Folder' screen");
	}
	
	public void verifyCancelButtonClickable_CNFolder() {
		utilityMethods.clickable(this.CancelButton,
				"Verify that Cancel Button is clickable in 'Create New Folder' screen");
	}

	public void verifyCancelButton_CNFolder() throws InterruptedException {
		utilityMethods.list_NotVisible(this.CancelButton, 500, this.CreateNewFolderScreen,
				"Verify that Create New Folder screen close when click on Cancel Button in 'Create New Folder' screen");
	}

	// End Create Folder

	// Start Refresh
	public void verifyRefreshButtonIsVisible()  {
		utilityMethods.visible(this.RefreshButtonSidePanel,
				"Verify that Refresh Button is present in 'Data Cleansing' screen");
	}

	public void verifyRefreshButtonIsClickable()  {
		utilityMethods.clickable(this.RefreshButtonSidePanel,
				"Verify that Refresh Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyListIsRefreshing() {

	}

	public void verifyLoadingSignISAppearing() {

	}
	// End Refresh

	// Start Expand All
	public void verifyExpandAllButtonVisible_DCScreen()  {
		utilityMethods.visible(this.ExpandAllButtonSidePanel,
				"Verify that Expand All Button is present in 'Data Cleansing' screen");
	}

	public void verifyExpandAllButtonClickable_DCScreen()  {
		utilityMethods.clickable(this.ExpandAllButtonSidePanel,
				"Verify that Expand All Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyListOfAllFiltersIsExpanded() {

	}

	public void verifyExpandAllButton_DCScreen()  {
		utilityMethods.clicked_elementVisible(this.ExpandAllButtonSidePanel,500,this.CollapseAllButtonSidePanel,
				"Verify that Expand All Button converts into Collapse All Button when click on it in 'Data Cleansing' screen");
	}
	// End Expand All

	// Start Collapse All
	public void verifyCollapseAllButtonvisible_DCScreen()  {
		utilityMethods.visible(this.CollapseAllButtonSidePanel,
				"Verify that Collapse All Button is present in 'Data Cleansing' screen");
	}

	public void verifyCollapseAllButtonClickable_DCScreen()  {
		utilityMethods.clickable(this.CollapseAllButtonSidePanel,
				"Verify that Collapse All Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyListOfAllFiltersIsCollapsed()  {

	}

	public void verifyCollapseAllButton_DCScreen()  {
		utilityMethods.clicked_elementVisible(this.CollapseAllButtonSidePanel,500,this.ExpandAllButtonSidePanel,
				"Verify that Collapse All Button converts into Expand All Button when click on it in 'Data Cleansing' screen");
	}
	// End Collapse All

	// Start Collapse Panel
	public void verifyCollapsePanelButtonVisible_DCScreen()  {
		utilityMethods.visible(this.CollapsePanelButtonSidePanel,
				"Verify that Collapse Panel Button is present in 'Data Cleansing' screen");
	}

	public void verifyCollapsePanelButtonClickable_DCScreen()  {
		utilityMethods.clickable(this.CollapsePanelButtonSidePanel,
				"Verify that Collapse Panel Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyCollapsePanel_DCScreen()  {
		utilityMethods.clicked_elementVisible(this.CollapsePanelButtonSidePanel,500,ExpandPanelButtonSidePanel,
				"Verify that Collapse Panel Button converts into Expand Panel Button when click on it in 'Data Cleansing' screen");
	}
	// End Collapse Panel

	// Start Expand Panel
	public void verifyExpandPanelButtonVisible_DCScreen() throws Exception {
		utilityMethods.visible(this.ExpandPanelButtonSidePanel,
				"Verify that Expand Panel Button is present in 'Data Cleansing' screen");
	}

	public void verifyExpandPanelButtonClickable_DCScreen() throws Exception {
		utilityMethods.clickable(this.ExpandPanelButtonSidePanel,
				"Verify that Expand Panel Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyExpandPanel_DCScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.ExpandPanelButtonSidePanel,500,CollapsePanelButtonSidePanel,
				"Verify that Collapse Panel Button converts into Expand Panel Button when click on it in 'Data Cleansing' screen");
	}
	// End Expand Panel

	// Start Data Source
	public void verifySelectDataSourceDropdownButtonVisible_DCScreen() throws Exception {
		utilityMethods.visible(this.SelectDataSourceDropdownButton,
				"Verify that Select Data Source Dropdown Button is present in 'Data Cleansing' screen");
	}

	public void verifySelectDataSourceDropdownButtonClickable_DCScreen() throws Exception {
		utilityMethods.clickable(this.SelectDataSourceDropdownButton,
				"Verify that Select Data Source Dropdown Button is clickable in 'Data Cleansing' screen");
	}
	public void verifySelectDataSourceDropdownButton_DCScreen() {
		utilityMethods.clicked_elementVisible(this.SelectDataSourceDropdownButton, 500, this.SelectDataSourceDropdown, 
				"Verify that Select Data Source Dropdown is present when click on Data Source Dropdown Button in 'Data Cleansing' Screen");
	}

	public void verifySelectDataSourceDropdownListVisible_DCScreen() throws Exception {
		utilityMethods.visible(this.SelectDataSourceMedical,
				"Verify that Select Data Source Dropdown List is present in 'Data Cleansing' screen");
	}
	public void verifySelectDataSourceDropdownListClickable_DCScreen() {
		utilityMethods.clickable(this.SelectDataSourceMedical,
				"Verify that Select Data Source Dropdown List is clickable in 'Data Cleansing' screen");
	}
	public void verifySelectDataSourceDropdownList_DCScreen() {
		utilityMethods.clicked_dropdownInput(this.SelectDataSourceMedical,500,this.SelectDataSourceInput,"attribute",
				"Verify that Data Source is selected from the List and visible in Data Source Field in 'Data Cleansing' screen");
	}
	public void verifySelectedDataSourceTableVisible_DCScreen() {
		utilityMethods.visible(this.DataSourceTable,
				"Verify that Selected Data Source is present in 'Data Cleansing' screen");
	}
	public void changeDataSource() {
		verifySelectDataSourceDropdownButton_DCScreen();
		utilityMethods.clicked_elementVisible(this.ChangeDataSource,500,this.DataSourceChangeScreen,
				"Verify that Data Source is Changing in 'Data Cleansing' screen");
	}

	public void verifyChangeDataSourceScreenVisible_DCScreen() throws Exception {
		changeDataSource();
		utilityMethods.visible(this.DataSourceChangeScreen,
				"Verify that Change Data Source screen is present when Data Source is changed in 'Data Cleansing' screen");
	}

	public void verifyYesButtonVisible_CDScreen() {	
		utilityMethods.visible(this.YesButton,
				"Verify that Yes Button is present in 'Data Source Changed' screen");
	}

	public void verifyYesButtonIsClickable_CDScreen() {
		utilityMethods.clickable(this.YesButton,
				"Verify that Yes Button is clickable in 'Data Source Changed' screen");
	}

	public void verifyYesButton_CDScreen() throws Exception {
		utilityMethods.clicked_elementVisible(YesButton, 500, DataSourceTable, 
				"Verify that Data Source change when click on Yes Button in 'Data Source Change' screen");
	}

	public void verifyNoButtonIsVisible_CDScreen() {
		utilityMethods.visible(this.NoButton,
				"Verify that No Button is present in 'Data Source Changed' screen");
	}

	public void verifyNoButtonIsClickable_CDScreen() {
		utilityMethods.clickable(this.NoButton,
				"Verify that No Button is clickable in 'Data Source Changed' screen");
	}
	public void verifyCancelButtonIsVisible_CDScreen() {
		utilityMethods.visible(this.CancelButton,
				"Verify that Cancel Button is present in 'Data Source Changed' screen");
	}

	public void verifyCancelButtonIsClickable_CDScreen() {
		utilityMethods.clickable(this.CancelButton,
				"Verify that Cancel Button is clickable in 'Data Source Changed' screen");
	}
	// End Data Source

	// Start View Data
	public void verifyViewDataButtonVisible_DCScreen() {
		utilityMethods.visible(this.ViewDataButton,
				"Verify that View Data Button is present in 'Data Cleansing' screen");
	}

	public void verifyViewDataButtonClickable_DCScreen() throws Exception {
		utilityMethods.clickable(this.ViewDataButton,
				"Verify that View Data Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyDataSnapshotVisible_DCScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.ViewDataButton, 500, this.DataSnapShot,
				"Verify that Data Snapshot is present when click on View Data Button in 'Data Cleansing' screen");
	}
	// End View Data

	// Start Column
	public void verifyColumnButtonVisible_DCScreen() {
		utilityMethods.visible(this.ColumnButton,
				"Verify that Column Button is present in 'Data Cleansing' screen");
	}

	public void verifyColumnButtonClickable_DCScreen() {
		utilityMethods.clickable(this.ColumnButton,
				"Verify that Column Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyColumnButton_DCScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.ColumnButton,500,this.ColumnScreen,
				"Verify that Column Button is clickable in 'Data Cleansing' screen");
	}

	public void verifyColumnsNameVisible_CScreen() throws Exception {
		utilityMethods.list_Match(this.DataSourceTables,500,this.ColumnNameColumnScreen,
				"Verify that Columns Name in Data Cleansing screen and in Column Screen are similar");
	}

	public void verifySeachFieldVisible_CScreen() throws Exception {
		utilityMethods.visible(this.SearchFieldColumnScreen, 
				"Verify that Search field is present in 'Column Screen'");
	}

	public void verifySearchFieldInputs_CScreen() {
		utilityMethods.senKeys_Input(this.SearchFieldColumnScreen, 200, "includeChar",
				"Verify that Search field inputs alphabets, numeric and special character's in 'Column Screen'");
	}
 
	public void verifySearchField_CScreen() throws Exception {
		String sendData = "ADR";
		ArrayList<String> list = new ArrayList<>();
		test = report.createTest(
				"Verify that valid column's are searched and displayed related to input in 'Column Screen' ");
		SearchFieldColumnScreen.clear();
		SearchFieldColumnScreen.sendKeys(sendData);
		Thread.sleep(500);
		for (WebElement cName : ColumnNameColumnScreen) {
			String getText = cName.getText();
			list.add(getText);
		}
		for (String data : list) {
			if (data.contains(sendData)) {
				test.log(Status.PASS, "The valid result are displayed");
			} else {
				test.log(Status.FAIL, "The valid result are not displayed");
			}
		}
		SearchFieldColumnScreen.clear();
	}

	public void verifyHeadingCheckboxVisible_CScreen() {
		utilityMethods.visible(this.UnselectedTopCheckboxColumnScreen,
				"Verify that Column Name Heading Checkbox is present in 'Column Screen'");
	}

	public void verifyHeadingCheckbox_CScreen() {
		utilityMethods.clicked_elementVisible(this.UnselectedTopCheckboxColumnScreen, 100, this.SelectedTopCheckboxColumnScreen,
				"Verify that Column Heading Checkbox can be mark as checked 'Column Screen' ");
		utilityMethods.clicked_elementVisible(this.SelectedTopCheckboxColumnScreen, 100, this.UnselectedTopCheckboxColumnScreen,
				"Verify that Column Heading Checkbox can be mark as unchecked 'Column Screen' ");
	}

	public void verifAllColumnsCheckbox_CScreen() {
		utilityMethods.clicked_elementVisible(this.UnselectedTopCheckboxColumnScreen, 100, this.AllColumnsSelectedCheckboxColumnScreen,
				"Verify that All Columns can be checked if Column Heading is checked in 'Column Screen' ");
		utilityMethods.clicked_elementVisible(this.SelectedTopCheckboxColumnScreen, 100, this.AllColumnsUnSelectedCheckboxColumnScreen,
				"Verify that All Columns can be unchecked if Column Heading is unchecked in 'Column Screen' ");
	}
	
	public void verifyUpArrowButtonVisible_CScreen() {
		utilityMethods.visible(this.UpArrowButtonColumnScreen, 
				"Verify that Up Arrow button is present in 'Column Screen' ");
	}

	public void verifyUpArrowButtonClickable_CScreen() {
		utilityMethods.clickable(this.UpArrowButtonColumnScreen, 
				"Verify that Up Arrow button is clickable in 'Column Screen' ");
	}

	public void verifyDownArrow_CScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.UpArrowButtonColumnScreen, 100, this.DownArrowButtonColumnScreen,
				"Verify that Up Arrow button change into Down Arrow button when click on it in 'Column Screen' ");
	}

	public void verifyUpArrowButtonSortTheData() {

	}

	public void verifyDownArrowButtonVisible_CScreen() {
		utilityMethods.visible(this.DownArrowButtonColumnScreen, 
				"Verify that Down Arrow button is present in 'Column Screen' ");
	}
	public void verifyDownArrowButtonClickable_CScreen() {
		utilityMethods.clickable(this.DownArrowButtonColumnScreen, 
				"Verify that Down Arrow button is clickable in 'Column Screen' ");
	}

	public void verifyDownArrowButton_CScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.DownArrowButtonColumnScreen, 100, this.UpArrowButtonColumnScreen,
				"Verify that Down Arrow button change into Up Arrow button when click on it in 'Column Screen' ");
	}

	public void verifyAllCheckboxVisible_CScreen() {
		test = report.createTest("Verify that Checkbox is visible with each Column Name in  'Column Screen' ");
		for (WebElement listCheckbox : this.AllColumnsUnselectedCheckboxColumnScreen) {
			if (listCheckbox.isDisplayed()) {
				test.log(Status.PASS, "The Checkbox is visible with each column name");
			} else {
				test.log(Status.FAIL, "The Checkbox is not visible with each column name");
			}
		}
	}

	public void verifyIndiviualCheckbox_CScreen() {
		utilityMethods.clicked_elementVisible(this.UnselectedFirstCheckboxColumnScreen, 100, this.SelectedFirstCheckboxColumnScreen, 
				"Verify that Indiviual Column can be checked in 'Column Screen' ");
		utilityMethods.clicked_elementVisible(this.SelectedFirstCheckboxColumnScreen, 100, this.UnselectedFirstCheckboxColumnScreen, 
				"Verify that Indiviual Column can be unchecked in 'Column Screen' ");
	}

	public void verifyOKButtonVisible_CScreen() {
		utilityMethods.visible(this.OkButton, 
				"Verify that Ok button is present in 'Column Screen' ");
	}

	public void verifyOKButtonClickable_CScreen() {
		utilityMethods.clickable(this.OkButton, 
				"Verify that Ok button is clickable in 'Column Screen' ");
	}

	public void verifyOKButton_CScreen() throws Exception {
		test = report.createTest(
				"Verify that by clicking on Ok button in Column Screen, Selected Column Display in 'Data Cleansing' Screen ");
		UnselectedFirstCheckboxColumnScreen.click();
		Thread.sleep(500);
		OkButton.click();
		Thread.sleep(500);
		int size1 = DataSourceTables.size();
		if (size1 == columnSize) {
			test.log(Status.PASS, "Selected Columns are displaying correctly");
		} else {
			test.log(Status.FAIL, "Selected Columns are not displaying correctly");
		}

	}

	public void verifyCancelButtonVisible_CScreen() throws Exception {
		ColumnButton.click();
		Thread.sleep(500);
		utilityMethods.visible(this.CancelButton, 
				"Verify that Cancel button is present in 'Column Screen' ");
	}

	public void verifyCancelButtonClickable_CScreen() {
		utilityMethods.clickable(this.CancelButton, 
				"Verify that Cancel button is clickable in 'Column Screen' ");
		}

	public void verifyCancelButton_CScreen() throws Exception {
		utilityMethods.list_NotVisible(this.CancelButton, 500, this.ColumnNameColumnScreen,
				"Verify that Cancel button closes the 'Column Screen' ");
	}
	// End Column

	// Start Calculated Column

	public void verifyCalculatedColumnButtonVisible_DCScreen() throws Exception {
		utilityMethods.visible(this.CalculatedColumn, 
				"Verify that Calculated Column button is present in 'Data Cleansing' Screen ");
	}

	public void verifyCalculatedColumnButtonClickable_DCScreen() {
		utilityMethods.clickable(this.CalculatedColumn, 
				"Verify that Calculated Column button is clickable in 'Data Cleansing' Screen ");
	}

	public void verifyCalculatedColumnButton_DCScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.CalculatedColumn, 500, this.CalculatedColumnScreenHeading,
				"Verify that Calculated Screen present when click on Calculated Column Button in 'Data Cleansing' Screen");
	}
	public void verifyColumnsNameVisible_CCScreen() throws Exception {
		utilityMethods.visible(this.ColumnNameCalculatedColumnScreen.get(0),
				"Verify that Columns are present in 'Calculated Column' Screen ");
		utilityMethods.list_Match(this.DataSourceTables, 100, this.ColumnNameCalculatedColumnScreen, 
				"Verify that Same Columns are present as compare to 'Data Cleansing' screen in 'Calculated Column' Screen ");
	}

	public void verfiyColumnNameFieldVisible_CCScreen() throws Exception {
		utilityMethods.visible(this.NewColumnFieldCalculatedColumnScreen, 
				"Verify that Column Name Text Field is present in 'Calculated Column' Screen ");
	}

	public void verifyColumnNameField_CCScreen() throws Exception {
		utilityMethods.senKeys_Input(this.NewColumnFieldCalculatedColumnScreen, 500, "excludeChar",
				"Verify that Columns Text Field input numeric and alphabet only in 'Calculated Column' Screen ");
	}

	public void verifyFunctionSearchVisible_CCScreen() {
		utilityMethods.visible(this.SearchFunctionsFieldCalculatedColumnScreen, 
				"Verify that Funtions Text Field is visible in 'Calculated Column' Screen ");
	}

	public void verifyFunctionsSearchInputs_CCScreen() throws Exception {
		utilityMethods.senKeys_Input(this.SearchFunctionsFieldCalculatedColumnScreen, 500, "includeChar",
				"Verify that Functions Text Field input numeric, characters and alphabet in 'Calculated Column' Screen ");

	}

	public void verifyFunctionSearch_CCScreen() throws Exception {
		String[] json = { "Right", "Left", "Lowercase", "Trim", "Uppercase" };
		Random r = new Random();
		int randomNumber = r.nextInt(json.length);
		String sendData = json[randomNumber];
		test = report.createTest(
				"Verify that Funtions Text Field is displaying relevant Data in 'Calculated Column' Screen ");
		SearchFunctionsFieldCalculatedColumnScreen.clear();
		SearchFunctionsFieldCalculatedColumnScreen.sendKeys(sendData);
		Thread.sleep(500);
		for (WebElement list : FunctionsListCalculatedColumnScreen) {
			String listText = list.getText();
			if (listText.toLowerCase().contains(sendData.toLowerCase())) {
				test.log(Status.PASS, "The Search is displaying relevant Data -> Input : " + sendData
						+ " </br> Result : " + listText);
			} else {
				test.log(Status.FAIL, "The Search is not displaying relevant Data -> Input : " + sendData
						+ " </br> Result : " + listText);
			}
		}
		SearchFunctionsFieldCalculatedColumnScreen.clear();
	}

	public void verifyPreviewFunctionScrollerVisible_CCScreen() {
		utilityMethods.visible(this.FunctionsScrollerCalculatedColumnScreen, 
				"Verify that Funtions Panel Scroll Bar is present in 'Calculated Column' Screen ");
	}

	public void verifyPreviewFunctionVisible_CCScreen() {
		utilityMethods.visible(this.PreviewSectionCalculatedColumnScreen, 
				"Verify that Preview Section of Funtions Panel is visible in 'Calculated Column' Screen ");
	}

	public void verifyFunctionPreview_CCScreen() throws Exception {
		int length = FunctionsListCalculatedColumnScreen.size();
		Random r = new Random();
		int randomNumber = r.nextInt(length);
		WebElement selectedFunction = FunctionsListCalculatedColumnScreen.get(randomNumber);
		selectedFunction.click();
		
		utilityMethods.clicked_dropdownInput(selectedFunction, 500,this.PreviewSectionContentCalculatedColumnScreen, "text", 
				"Verify that Preview Section is displaying functions detail in 'Calculated Column' Screen");
	}

	public void verifyRemoveSelectedItemButtonVisible_CCScreen() {
		utilityMethods.visible(this.RemoveSelectedItemButtonCalculatedColumnScreen, 
				"Verify that Remove Selected Item Button is present in 'Calculated Column' Screen ");
	}

	public void verifyRemoveSelectedItemButtonClickable_CCScreen() {
		utilityMethods.clickable(this.RemoveSelectedItemButtonCalculatedColumnScreen, 
				"Verify that Remove Selected Item Button is clickable in 'Calculated Column' Screen ");
	}

	public void verifyColumnDragIntoPreviewArea_CCScreen() throws Exception {
		test = report.createTest(
				"Verify that Column Name dragged into Field Preview section in 'Calculated Column' Screen ");
		// int length = ColumnNameInCalculatedColumnScreen.size();
		Actions actions = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			actions.dragAndDrop(ColumnNameCalculatedColumnScreen.get(i), FieldPreviewCalculatedColumnScreen).perform();
		}
		Thread.sleep(1000);
		if (FieldPreviewItemsCalculatedColumnScreen.size() > 0) {
			test.log(Status.PASS, "The Column Name dragged successfully in Field Preview section");
		} else {
			test.log(Status.FAIL, "The Column Name dragged not successfully in Field Preview section");
		}
	}

	public void verifyPreviewAreaScrollerVisible_CCScreen() {
		utilityMethods.list_Visible(ColumnNameCalculatedColumnScreen.get(0), 500, this.FieldPreviewScrollerCalculatedColumnScreen,
				"Verify that Scroller is present in Columns Preview Area in 'Calculated Column' Screen ");
	}

	public void VerifyRemoveButtonRemovePreviewColumn_CCScreen() throws Exception {
		test = report.createTest(
				"Verify that Column Name removes into Field Preview section in 'Calculated Column' Screen ");
		int length = FieldPreviewItemsCalculatedColumnScreen.size();
		for (int i = length - 1; i >= 0; i--) {
			FieldPreviewItemsCalculatedColumnScreen.get(i).click();
			Thread.sleep(500);
			RemoveSelectedItemButtonCalculatedColumnScreen.click();
		}
		if (FieldPreviewItemsCalculatedColumnScreen.size() == 0) {
			test.log(Status.PASS, "The Column Name removes from the Field Preview");
		} else {
			test.log(Status.FAIL, "The Column Name not removes from the Field Preview");
		}
	}

	public void verifyDoubleClickPreviewColumn_CCScreen() throws Exception {
		test = report.createTest(
				"Verify that Double Click add Column Name into Field Preview section in 'Calculated Column' Screen ");
		Actions actions = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			actions.doubleClick(ColumnNameCalculatedColumnScreen.get(i)).perform();
		}
		Thread.sleep(500);
		if (FieldPreviewItemsCalculatedColumnScreen.size() > 0) {
			test.log(Status.PASS,
					"The Column Name added successfully in Field Preview section By Doing Double Click on it");
		} else {
			test.log(Status.FAIL,
					"The Column Name is not added successfully in Field Preview section By Doing Double Click on it");
		}
	}

	public void verifyOKButtonVisible_CCScreen() {
		utilityMethods.visible(this.OkButton, 
				"Verify that Ok Button is present in 'Calculated Column' Screen ");
		
	}

	public void verifyOKButtonClickable_CCScreen() {
		utilityMethods.clickable(this.OkButton, 
				"Verify that Ok Button is clickable in 'Calculated Column' Screen ");
	}

	public void verifyOkButtonAddColumn_CCScreen() throws Exception {

		test = report.createTest(
				"Verify that Generated Calculated Columns are adding in Data Source Table 'Calculated Column' Screen ");
		String filePreviewItems = InnerColumn(FieldPreviewItemsWithConcatenationCalculatedColumnScreen);
		OkButton.click();
		Thread.sleep(1000);
		String dataSourceItems = DataSourceTablesFunc();
		if (dataSourceItems.contains(filePreviewItems)) {
			test.log(Status.PASS, "The new Calculated Column added successfully in Data Source");
		} else {
			test.log(Status.FAIL, "The new Calculated Column not added successfully in Data Source");
		}
	}

	public void verifyCancelButtonVisible_CCScreen() throws Exception {
		utilityMethods.clicked_elementVisible(this.CalculatedColumn, 100, this.CancelButton,
				"Verify that Cancel Button is visible in 'Calculated Column' Screen ");
	}

	public void verifyCancelButtonClickable_CCScreen() throws Exception {
		utilityMethods.clickable(this.CancelButton,
				"Verify that Cancel Button is clickable in 'Calculated Column' Screen ");
	}

	public void verifyCancelButtonNotAddColumn_CCScreen() throws Exception {
		test = report.createTest("Verify that Cancel Button does not add any column in Data Source ");
		Actions actions = new Actions(driver);
		for (int i = 0; i < 2; i++) {
			actions.dragAndDrop(ColumnNameCalculatedColumnScreen.get(i), FieldPreviewCalculatedColumnScreen).perform();
		}
		String filePreviewItems = InnerColumn(FieldPreviewItemsWithConcatenationCalculatedColumnScreen);
		Thread.sleep(500);
		CancelButton.click();
		Thread.sleep(500);
		String dataSourceItems = DataSourceTablesFunc();
		if (!dataSourceItems.contains(filePreviewItems)) {
			test.log(Status.PASS, "The Cancel button is not adding Calculated Column in Data Source Table");
		} else {
			test.log(Status.FAIL, "The Cancel button is adding Calculated Column in Data Source Table");
		}
	}
	// End Calculated Column

	// Start Data Source Table

	public void verifyRemoveButtonVisible_DSTable() throws Exception {
		test = report.createTest("Verify that Remove Button is visible with each column Name in Data Source ");
		for (WebElement remove : RemoveButtonDataSourceTable) {
			if (remove.isDisplayed()) {
				test.log(Status.PASS, "The Remove Button is visible ");
			} else {
				test.log(Status.FAIL, "The Remove Button is not visible ");
			}
		}
	}

	public void verifyRemoveButtonClickable_DSTable() {
		test = report.createTest("Verify that Remove Button is clickable  Data Source ");
		for (WebElement remove : RemoveButtonDataSourceTable) {
			if (remove.isEnabled()) {
				test.log(Status.PASS, "The Remove Button is clickable ");
			} else {
				test.log(Status.FAIL, "The Remove Button is not clickable ");
			}
		}
	}

	public void verifyColumnRemoves_DSTable() throws Exception {
		test = report.createTest("Verify that Remove Button removes Column From Data Cleansing");
		// Removing only those which is added through calculated column
		int size = CalculatedColumnRemoveButtonDataSourceTable.size();
		for (int i = size - 1; i >= 0; i--) {
			CalculatedColumnRemoveButtonDataSourceTable.get(i).click();
		}
		Thread.sleep(500);
		if (CalculatedColumnRemoveButtonDataSourceTable.size() == 0) {
			test.log(Status.PASS, "The Column remove from the Data Source ");
		} else {
			test.log(Status.FAIL, "The Column not remove from the Data Source ");
		}
	}

	public void verifyColumnDropdownVisible_DSTable() throws Exception {
		test = report.createTest("Verify that Column Dropdown Button is visible in 'Data Source Table' ");
		Actions actions = new Actions(driver);
		actions.moveToElement(ColumnNameHeadingDataSourceTable);
		actions.moveToElement(ColumnNameHeadingDropdownArrowDataSourceTable).click().build().perform();
		Thread.sleep(500);
		if (ColumnNameHeadingDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Column Name Dropdown is visible");
		} else {
			test.log(Status.FAIL, "The Column Name Dropdown is not visible");
		}

	}

	public void verifySortAscendingButtonVisible_DSTable() {
		test = report.createTest(
				"Verify that Sort Ascending button is visible in Column Name Dropdown on 'Data Source Table' ");
		if (SortAscendingButtonColumnDropdownDatSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Sort Ascending Button is visble");
		} else {
			test.log(Status.FAIL, "The Sort Ascending Button is not visble");
		}
	}

	public void verifySortAscendingButtonClickable_DSTable() {
		test = report.createTest(
				"Verify that Sort Ascending button is clickable in Column Name Dropdown on 'Data Source Table' ");
		if (SortAscendingButtonColumnDropdownDatSourceTable.isEnabled()) {
			test.log(Status.PASS, "The Sort Ascending Button is clickable");
		} else {
			test.log(Status.FAIL, "The Sort Ascending Button is not clickable");
		}
	}

	public void verifySortAscending_DSTable() throws InterruptedException {
		test = report.createTest(
				"Verify that Column's are Sorting in Ascending order when click on Sort Ascending button in 'Data Source Table' ");
		String[] beforeSorting = DataSourceTablesFunc().split(",");
		SortAscendingButtonColumnDropdownDatSourceTable.click();
		Thread.sleep(500);
		String[] afterSorting = DataSourceTablesFunc().split(",");
		if (!beforeSorting[1].equals(afterSorting[1])) {
			test.log(Status.PASS, "The Column List is sort in ascending");
		} else {
			test.log(Status.FAIL, "The Column List is not sort in ascending");
		}
	}

	public void verifySortDescendingButtonVisible_DSTable() throws Exception {
		verifyColumnDropdownVisible_DSTable();
		test = report.createTest(
				"Verify that Sort Descending button is visible in Column Name Dropdown on 'Data Source Table' ");
		if (SortDescendingButtonColumnDropdownDatSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Sort Descending Button is visible");
		} else {
			test.log(Status.FAIL, "The Sort Descending Button is not visible");
		}
	}

	public void verifySortDescendingButtonClickable_DSTable() {
		test = report.createTest(
				"Verify that Sort Descending button is clickable in Column Name Dropdown on 'Data Source Table' ");
		if (SortDescendingButtonColumnDropdownDatSourceTable.isEnabled()) {
			test.log(Status.PASS, "The Sort Descending Button is clickable");
		} else {
			test.log(Status.FAIL, "The Sort Descending Button is not clickable");
		}
	}

	public void verifySortDescending_DSTable() throws InterruptedException {
		test = report.createTest(
				"Verify that Column's are Sorting in Descending order when click on Sort Descending button in 'Data Source Table' ");
		String[] beforeSorting = DataSourceTablesFunc().split(",");
		SortDescendingButtonColumnDropdownDatSourceTable.click();
		Thread.sleep(500);
		String[] afterSorting = DataSourceTablesFunc().split(",");
		if (!beforeSorting[1].equals(afterSorting[1])) {
			test.log(Status.PASS, "The Column List is sort in descending");
		} else {
			test.log(Status.FAIL, "The Column List is not sort in descending");
		}
	}

	public void verifyColumnsButtonVisible_DSTable() throws Exception {
		verifyColumnDropdownVisible_DSTable();
		test = report
				.createTest("Verify that Columns button is visible in Column Name Dropdown on 'Data Source Table' ");
		if (ColumnsButtonColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Columns Button is visble");
		} else {
			test.log(Status.FAIL, "The Columns Button is not visble");
		}
	}

	public void verifyColumnsButtonClickable_DSTable() {
		test = report
				.createTest("Verify that Column button is clickable in Column Name Dropdown on 'Data Source Table' ");
		if (ColumnsButtonColumnDropdownDataSourceTable.isEnabled()) {
			test.log(Status.PASS, "The Columns Button is clickable");
		} else {
			test.log(Status.FAIL, "The Columns Button is not clickable");
		}
	}

	public void verifyInnerColumnDropdownVisible_DSTable() throws Exception {
		test = report
				.createTest("Verify that Column Dropdown is visible inside Column Name Filter in 'Data Source Table'");
		Actions actions = new Actions(driver);
		actions.moveToElement(ColumnsButtonColumnDropdownDataSourceTable).click().build().perform();
		Thread.sleep(500);
		if (InnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Inner Column Dropdown is visible");
		} else {
			test.log(Status.FAIL, "The Inner Column Dropdown is not visible");
		}
	}

	public void verifyColumnNameInnerColumnNameVisible_DSTable() {
		test = report.createTest(
				"Verify that Column Name button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (ColumnNameInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Column Name Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Column Name Button inside Inner Column is not visible");
		}
	}

	public void verifyTypeInnerColumnNameVisible_DSTable() {
		test = report
				.createTest("Verify that Type button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (TypeInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Type Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Type Button Name inside Inner Column is not visible");
		}
	}

	public void verifyChangeTypeInnerColumnNameVisible_DSTable() {
		test = report.createTest(
				"Verify that Change Type button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (ChangeTypeInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Change Type Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Change Type Button inside Inner Column is not visible");
		}
	}

	public void verifyFiltersColumnInnerColumnNameVisible_DSTable() {
		test = report.createTest(
				"Verify that Filters button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (FiltersInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Filters Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Filters Button inside Inner Column is not visible");
		}
	}

	public void verifyRenameColumnInnerColumnNameVisible_DSTable() {
		test = report.createTest(
				"Verify that Rename Column button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (RenameColumnInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Rename Column Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Rename Column Button inside Inner Column is not visible");
		}
	}

	public void verifyActionsInnerColumnNameVisible_DSTable() {
		test = report.createTest(
				"Verify that Actions button inside Inner Column Dropdown is visible in 'Data Source Table'");
		if (ActionsInnerColumnDropdownDataSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Actions Button inside Inner Column is visible");
		} else {
			test.log(Status.FAIL, "The Actions Button inside Inner Column is not visible");
		}
	}

	public void verifyFiltersButtonVisible_DSTable() throws Exception {
		verifyColumnDropdownVisible_DSTable();
		test = report
				.createTest("Verify that Filters button is visible in Column Name Dropdown on 'Data Source Table' ");
		if (UnselectedFiltersButtonColumnDropdownDatSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Filters Button is visble");
		} else {
			test.log(Status.FAIL, "The Filters Button is not visble");
		}
	}

	public void verifyFiltersButtonClickable_DSTable() {
		test = report
				.createTest("Verify that Filters button is clickable in Column Name Dropdown on 'Data Source Table'");
		if (UnselectedFiltersButtonColumnDropdownDatSourceTable.isEnabled()) {
			test.log(Status.PASS, "The Filters Button is clickable");
		} else {
			test.log(Status.FAIL, "The Filters Button is not clickable");
		}
	}

	public void verifyFilterSearchFieldVisible_DSTable() throws Exception {
		test = report.createTest(
				"Verify that Filter Search is visible when hover over Filter option in 'Data Source Table'");
		Actions actions = new Actions(driver);
		actions.moveToElement(UnselectedFiltersButtonColumnDropdownDatSourceTable).click().build().perform();
		Thread.sleep(500);
		if (FiltersSearchColumnDropdownDatSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Filters Search is visible");
		} else {
			test.log(Status.FAIL, "The Filters Search is not visible");
		}
	}

	public void verifyFilterSearchField_DSTable() throws Exception {
		test = report.createTest(
				"Verify that Columns are visible when search columns in Filter Search in 'Data Source Table'");
		String[] data = { "Mail", "Billed", "Paid" };
		Random rand = new Random();
		int num = rand.nextInt(data.length);
		String sendData = data[num];
		Actions actions = new Actions(driver);
		actions.moveToElement(FiltersSearchColumnDropdownDatSourceTable).sendKeys(sendData).build().perform();
		Thread.sleep(500);
		String[] columns = DataSourceTablesFunc().split(",");
		for (String column : columns) {
			if (column.toLowerCase().contains(sendData.toLowerCase())) {
				test.log(Status.PASS, "The " + column + " Column is visible in Data Source against this word "
						+ sendData + " in Filter Search");
			} else {
				test.log(Status.FAIL, "The " + column + " Column is not visible in Data Source against this word "
						+ sendData + " in Filter Search");
			}
		}
	}

	public void verifyFilterButtonChecked_DSTable() {
		test = report.createTest(
				"Verify that Filter Button gets checked whenever type in Filter Search in 'Data Source Table'");
		if (SelectedFiltersButtonColumnDropdownDatSourceTable.isDisplayed()) {
			test.log(Status.PASS, "The Filter button is checked after typing something in Search Field");
		} else {
			test.log(Status.FAIL, "The Filter button is not checked after typing something in Search Field");
		}

	}

	public void verifyFilterSearchInputs_DSTable() throws Exception {
		test = report.createTest("Verify that Filter Search input alphabets, numeric and special characters'");
		String sendData_Str = "NewColumn";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		Actions actions = new Actions(driver);
		actions.click(FiltersSearchColumnDropdownDatSourceTable).build().perform();
		FiltersSearchColumnDropdownDatSourceTable
				.sendKeys(Keys.chord(Keys.CONTROL, "a") + sendData_Str + sendData_Int + sendData_Char);
		Thread.sleep(500);
		String getSearchValue = FiltersSearchColumnDropdownDatSourceTable.getAttribute("value");
		if (getSearchValue.equals(sendData_Str + sendData_Int + sendData_Char)) {
			test.log(Status.PASS, "The Filter Search inputs alphabets, numeric and special charatcers");
		} else {
			test.log(Status.FAIL, "The Filter Search not inputs alphabets, numeric and special charatcers");
		}
	}

	// End

	// Start Save Button and New Filter
	public void verifySaveButtonVisible() {
		test = report.createTest("Verify that Save Button is visible in 'Data Cleansing' Screen");
		if (SaveIconButton.isDisplayed()) {
			test.log(Status.PASS, "The Save button is visible");
		} else {
			test.log(Status.FAIL, "The Save button is not visible");
		}
	}

	public void verifySaveButtonClickable() {
		test = report.createTest("Verify that Save Button is clickable in 'Data Cleansing' Screen");
		if (SaveIconButton.isEnabled()) {
			test.log(Status.PASS, "The Save button is clickable");
		} else {
			test.log(Status.FAIL, "The Save button is not clickable");
		}
	}

	public void verifyCreateNewFilterScreenOpen_Save() throws Exception {
		test = report.createTest(
				"Verify that Create New Filter Screen Open when click on Save Button in 'Data Cleansing' Screen");
		SaveIconButton.click();
		Thread.sleep(500);
		if (CreateNewFilterHeading.isDisplayed()) {
			test.log(Status.PASS, "The Create New Filter Screen is visible");
		} else {
			test.log(Status.FAIL, "The Create New Filter Screen is not visible");
		}
	}

	public void verifyCancelButtonVisible_CNFilter() {
		test = report.createTest("Verify that Cancel Button is visible in 'Create New Filter' screen");
		if (this.CancelButton.isDisplayed()) {
			test.log(Status.PASS, "The Cancel Button is visible");
		} else {
			test.log(Status.FAIL, "The Cancel Button is not visible");
		}
	}

	public void verifyCancelButtonClickable_CNFilter() {
		test = report.createTest("Verify that Cancel Button is clickable in 'Create New Filter' screen");
		if (this.CancelButton.isEnabled()) {
			test.log(Status.PASS, "The Cancel Button is clickable");
		} else {
			test.log(Status.FAIL, "The Cancel Button is not clickable");
		}
	}

	public void verifyCancelButton_CNFilter() throws InterruptedException {
		test = report.createTest(
				"Verify that Create New Filter Screen close, When click on Cancel Button in 'Create New Filter' screen");
		this.CancelButton.click();
		Thread.sleep(500);
		if (this.CreateNewFilterScreen.size() == 0) {
			test.log(Status.PASS, "The Create New Filter Screen closed");
		} else {
			test.log(Status.FAIL, "The Create New Filter Screen not closed");
		}
	}

	public void verifySaveDownArrowButton() throws Exception {
		test = report.createTest("Verify that Save Down Arrow Button is clickable in 'Data Cleansing' screen");
		Actions actions = new Actions(driver);
		actions.moveToElement(SaveDownArrowButton).click().build().perform();
		Thread.sleep(500);
		if (this.SaveAsButton.isDisplayed()) {
			test.log(Status.PASS, "The Down Arrow Button is clicked");
		} else {
			test.log(Status.FAIL, "The Down Arrow Button is not clicked");
		}
	}

	public void verifySaveAsButtonVisible() {
		test = report.createTest("Verify that Save As Button is visible in 'Data Cleansing' Screen");
		if (SaveAsButton.isDisplayed()) {
			test.log(Status.PASS, "The Save As button is visible");
		} else {
			test.log(Status.FAIL, "The Save As button is not visible");
		}
	}

	public void verifySaveAsButtonClickable() {
		test = report.createTest("Verify that Save As Button is clickable in 'Data Cleansing' Screen");
		if (SaveAsButton.isEnabled()) {
			test.log(Status.PASS, "The Save As button is clickable");
		} else {
			test.log(Status.FAIL, "The Save As button is not clickable");
		}
	}

	public void verifyCreateNewFilterScreenOpen_SaveAs() throws Exception {
		test = report.createTest(
				"Verify that Create New Filter Screen Open when click on Save As Button in 'Data Cleansing' Screen");
		SaveAsButton.click();
		Thread.sleep(500);
		if (CreateNewFilterHeading.isDisplayed()) {
			test.log(Status.PASS, "The Create New Filter Screen is visible");
		} else {
			test.log(Status.FAIL, "The Create New Filter Screen is not visible");
		}
	}

	public void verifyFilterNameFieldVisible_CNFilter() {
		test = report.createTest("Verify that Create New Filter Text Field is visible in 'Create New Filter' Screen ");
		if (TextFieldCNFilter.isDisplayed()) {
			test.log(Status.PASS, "Create New Filter Text Field is visible");
		} else {
			test.log(Status.FAIL, "Create New Filter Text Filed is not visible");
		}

	}

	public void verifyFilterNameFieldInputs_CNFilter() throws Exception {
		String sendData_Str = "NewColumn";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		test = report.createTest(
				"Verify that Create New Filter Text Field inputs numeric, characters and alphabet in 'Create New Filter' Screen ");
		TextFieldCNFilter.clear();
		TextFieldCNFilter.sendKeys(sendData_Str + sendData_Int + sendData_Char);
		Thread.sleep(500);
		String getInputValue = TextFieldCNFilter.getAttribute("value");
		if (getInputValue.equals(sendData_Str + sendData_Int + sendData_Char)) {
			test.log(Status.PASS, "Text Field inputs alphabets, special characters and numeric values");
		} else {
			test.log(Status.FAIL, "Text Field not inputs alphabets, special characters and numeric values");
		}

	}

	public void verifyFilterNameFieldMandatory_CNFilter() {
		test = report
				.createTest("Verify that Create New Filter Text Field is mandatory in 'Create New Filter' Screen ");
		TextFieldCNFilter.clear();
		if (TextFieldMandatoryCNFilter.isDisplayed()) {
			test.log(Status.PASS, "Filter Name Text field is mandatory");
		} else {
			test.log(Status.FAIL, "Filter Name Text field is not mandatory");
		}

	}

	public void verifyRadioButtonVisible_CNFilter() {
		test = report.createTest("Verify that Radio Button is visible in 'Create New Filter' Screen ");
		for (WebElement radionbtn : RadioButtonsListCNFilter) {
			if (radionbtn.isDisplayed()) {
				test.log(Status.PASS, radionbtn.getText() + " Radio Button is visible");
			} else {
				test.log(Status.FAIL, radionbtn.getText() + " Radio Button is not visible");
			}
		}
	}

	public void verifyRadioButtonSelection_CNFilter() throws Exception {
		test = report.createTest("Verify that Radio Button is clickable  in 'Create New Filter' Screen ");
		for (WebElement radionbtn : RadioButtonsListCNFilter) {
			radionbtn.click();
			if (SelectedRadioButtonCNFilter.size() == 1) {
				test.log(Status.PASS,
						radionbtn.getText() + " Radio Button is selected & Other Radio button is unselected");
			} else if (SelectedRadioButtonCNFilter.size() > 1) {
				test.log(Status.FAIL, radionbtn.getText() + " & Other Radio Button selected at similar time.");
			} else {
				test.log(Status.FAIL, "No Radio Button is not selected");
			}
		}
	}

	public void verifySaveButtonVisible_CNFilter() {
		test = report.createTest("Verify that Save Button is visible in 'Create New Filter' Screen");
		if (SaveButton.isDisplayed()) {
			test.log(Status.PASS, "The Save button is visible");
		} else {
			test.log(Status.FAIL, "The Save button is not visible");
		}
	}

	public void verifySaveButtonClickable_CNFilter() {
		test = report.createTest("Verify that Save Button is clickable in 'Create New Filter' Screen");
		if (SaveIconButton.isEnabled()) {
			test.log(Status.PASS, "The Save button is clickable");
		} else {
			test.log(Status.FAIL, "The Save button is not clickable");
		}
	}

	public void verifySaveButton_CNFilter() throws InterruptedException {
		String sendData_Str = "New Filter";
		test = report
				.createTest("Verify that New Filter is created when click on Ok button 'Create New Filter' screen");
		TextFieldCNFilter.clear();
		TextFieldCNFilter.sendKeys(sendData_Str);
		RadioButtonsListCNFilter.get(0).click();
		this.SaveButton.click();
		Thread.sleep(500);
		OkButton.click();
		if (this.CreateNewFilterScreen.size() == 0 && CreatedFilter_DC.isDisplayed()) {
			test.log(Status.PASS, "The New Filter Created");
		} else {
			test.log(Status.FAIL, "The New Filter Not Created");
		}
	}

	public void verifyFilterNameCropsSpaces_CNFilter() throws Exception {
		verifySaveDownArrowButton();
		verifyCreateNewFilterScreenOpen_SaveAs();
		String[] data = { " New Filter", "   " };
		Random rand = new Random();
		int get = rand.nextInt(data.length);
		String sendData = data[get];
		test = report.createTest(
				"Verify that Create New Filter Text Field Crops spaces before and after in 'Create New Filter' Screen ");
		TextFieldCNFilter.clear();
		TextFieldCNFilter.sendKeys(sendData);
		SaveButton.click();
		Thread.sleep(500);
		OkButton.click();
		Thread.sleep(500);
		if (!CreatedFilter_DC.getAttribute("textContent").equals(sendData)) {
			test.log(Status.PASS, "Before & After Spaces trim successfully from New Filter");
		} else {
			test.log(Status.FAIL, "Before & After Spaces not trim successfully from New Filter");
		}
	}

	public void selectFilter() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(CreatedFilter_DC).doubleClick().build().perform();
		Thread.sleep(500);
	}

	public void verifyRemoveButtonVisible_DC() {
		test = report.createTest("Verify that Remove Button is visible in Data Cleansing Screen ");
		if (RemoveButton.isDisplayed()) {
			test.log(Status.PASS, "The Remove Button is visible ");
		} else {
			test.log(Status.FAIL, "The Remove Button is not visible ");
		}
	}

	public void verifyRemoveButtonClickable_DC() {
		test = report.createTest("Verify that Remove Button is visible in Data Cleansing Screen ");
		if (RemoveButton.isEnabled()) {
			test.log(Status.PASS, "The Remove Button is clickable ");
		} else {
			test.log(Status.FAIL, "The Remove Button is not clickable ");
		}
	}

	public void verifyRemoveButtonRemoveSelectedFilter_DC() throws Exception {
		test = report.createTest("Verify that Remove button removes the selected filter");
		selectFilter();
		RemoveButton.click();
		Thread.sleep(500);
		if (PleaseConfirmDialog.isDisplayed()) {
			test.log(Status.PASS, "The Please Confirm Dialog is visible");
		} else {
			test.log(Status.FAIL, "The Please Confirm Dialog is not visible");
		}
	}

	public void verifyYesButtonVisible_PCDialog() throws Exception {
		test = report.createTest("Verify that Yes Button is visible in Please Confirm Dialog");
		if (YesButton.isDisplayed()) {
			test.log(Status.PASS, "The Yes Button is visible");
		} else {
			test.log(Status.FAIL, "The Yes Button is not visible");
		}
	}

	public void verifyYesButtonClickable_PCDialog() throws Exception {
		test = report.createTest("Verify that Yes Button is clickable in Please Confirm Dialog");
		if (YesButton.isEnabled()) {
			test.log(Status.PASS, "The Yes Button is clickable");
		} else {
			test.log(Status.FAIL, "The Yes Button is not clickable");
		}
	}

	public void verifyNoButtonVisible_PCDialog() throws Exception {
		test = report.createTest("Verify that Yes Button is visible in Please Confirm Dialog");
		if (NoButton.isDisplayed()) {
			test.log(Status.PASS, "The No Button is visible");
		} else {
			test.log(Status.FAIL, "The No Button is not visible");
		}
	}

	public void verifyNoButtonClickable_PCDialog() throws Exception {
		test = report.createTest("Verify that No Button is clickable in Please Confirm Dialog");
		if (NoButton.isEnabled()) {
			test.log(Status.PASS, "The No Button is clickable");
		} else {
			test.log(Status.FAIL, "The No Button is not clickable");
		}
	}

	public void verifyNoButton_PCDialog() throws Exception {
		test = report.createTest("Verify that No Button close the Please Confirm Dialog");
		NoButton.click();
		Thread.sleep(500);
		if (DataSourceTables.size() > 0) {
			test.log(Status.PASS, "No Button close the confirm dialog");
		} else {
			test.log(Status.FAIL, "No Button not close the confirm dialog");
		}
	}

	public void verifyYesButton_PCDialog() throws Exception {
		verifyRemoveButtonRemoveSelectedFilter_DC();
		test = report.createTest("Verify that Yes Button close the Please Confirm Dialog");
		YesButton.click();
		Thread.sleep(500);
		OkButton.click();
		Thread.sleep(500);
		if (DataSourceTables.size() == 0 && BreadCrumbs.size() == 0) {
			test.log(Status.PASS, "Filter deleted successfully");
		} else {
			test.log(Status.FAIL, "Filter not deleted successfully");
		}
	}

	public void verifyRemoveButtonNotRemoveUnSelectedFilter_DC() throws Exception {
		verifySelectDataSourceDropdownButton_DCScreen();
		verifySelectDataSourceDropdownList_DCScreen();
		
		utilityMethods.list_NotVisible(this.RemoveButton, 500, Size_PCD,
				"Verify that Remove button do nothing when none filter is selected");
	}

	public void verifyResetButtonVisible_DC() throws Exception {
		utilityMethods.visible(this.ResetButton, 
				"Verify that Reset Button is visible in 'Please Confirm Dialog' ");
	}

	public void verifyResetButtonClickable_DC() throws Exception {
		utilityMethods.clickable(this.ResetButton,
				"Verify that Reset Button is clickable in 'Please Confirm Dialog' ");
	}

	public void ResetAll_DC() throws Exception {
		utilityMethods.list_NotVisible(this.ResetButton, 500, DataSourceTables, "Verify that Reset All Button reset Data Cleansing Screen");
		utilityMethods.list_NotVisible(this.ResetButton, 500, BreadCrumbs, "Verify that Reset All Button reset BreadCrumbs");
	}
}