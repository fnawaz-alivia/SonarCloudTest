package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
// import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
// import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.Status;

import automationModels.DataCleansingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansing extends Configuration {
	public static ExtentTest test;

	@Test(groups = { "smoke", "regression" }, priority = 1, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataCleansing_001() throws Exception {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		test = report.createTest(
				"Verify the user is able to access Data Cleansing Module by clicking on Data Cleansing under Data Repository");
		DCM.LandingOnDataCleansingPage();
		test.log(Status.PASS,
				"The user is able to access Data Cleansing Module by clicking on Data Cleansing under Data Repository");
		test = report.createTest("Verify the user is able to select the Data Source for  Data Cleansing");
		DCM.SelectDSForDataCleansing();
		test.log(Status.PASS, "The user is able to select the Data Source for  Data Cleansing");
		DCM.MissingFillWithValue();
		String DCExportFileName = RandomStringUtils.randomAlphabetic(10);
		DCM.ExportDataIntoCSV(DCExportFileName);
		DCM.ExportDataIntoExcel(DCExportFileName);
		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 2, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataCleansing_002() throws Exception {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// These functions will validate 'Create Folder Button' Operations
		DCM.verifyCreateNewFolderButtonVisible_DCScreen();
		DCM.verifyCreateNewFolderButtonClickable_DCScreen();
		DCM.verifyCreateNewFolderScreenVisible();
		DCM.verifyCancelButtonVisible_CNFScreen();
		DCM.verifyCancelButtonClickable_CNFolder();
		DCM.verifyCancelButton_CNFolder();

		// These functions will validate 'Refresh Button' Operations
		DCM.verifyRefreshButtonIsVisible();
		DCM.verifyRefreshButtonIsClickable();

		// These functions will validate 'Expand All Button' Operations
		DCM.verifyExpandAllButtonVisible_DCScreen();
		DCM.verifyExpandAllButtonClickable_DCScreen();
		DCM.verifyListOfAllFiltersIsExpanded();
		DCM.verifyExpandAllButton_DCScreen();

		// These functions will validate 'Collapse All Button' Operations

		DCM.verifyCollapseAllButtonvisible_DCScreen();
		DCM.verifyCollapseAllButtonClickable_DCScreen();
		DCM.verifyListOfAllFiltersIsCollapsed();
		DCM.verifyCollapseAllButton_DCScreen();

		// These functions will validate 'Collapse Panel' Operations

		DCM.verifyCollapsePanelButtonVisible_DCScreen();
		DCM.verifyCollapsePanelButtonClickable_DCScreen();
		DCM.verifyCollapsePanel_DCScreen();

		// These function will validate 'Expand Panel' Operations

		DCM.verifyExpandPanelButtonVisible_DCScreen();
		DCM.verifyExpandPanelButtonClickable_DCScreen();
		DCM.verifyExpandPanel_DCScreen();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 3 , retryAnalyzer = listeners.RetryAnalyzer.class )
	public void FWA_DataCleansing_003() throws Exception {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// These functions will validate 'Data Source' Operations in
		// Data Cleansing Screen
		DCM.verifySelectDataSourceDropdownButtonVisible_DCScreen();
		DCM.verifySelectDataSourceDropdownButtonClickable_DCScreen();
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		
		DCM.verifySelectDataSourceDropdownListVisible_DCScreen();
		DCM.verifySelectDataSourceDropdownListClickable_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();
		
		DCM.verifySelectedDataSourceTableVisible_DCScreen();
		
		DCM.verifyChangeDataSourceScreenVisible_DCScreen();
		DCM.verifyYesButtonVisible_CDScreen();
		DCM.verifyYesButtonIsClickable_CDScreen();
		DCM.verifyNoButtonIsVisible_CDScreen();
		DCM.verifyNoButtonIsClickable_CDScreen();
		DCM.verifyCancelButtonIsVisible_CDScreen();
		DCM.verifyCancelButtonIsClickable_CDScreen();
		DCM.verifyYesButton_CDScreen();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 4 , retryAnalyzer = listeners.RetryAnalyzer.class )
	public void FWA_DataCleansing_004() throws Exception {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// Pre-Req : This function will select Data Source
		
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();
		

		// These functions will validate 'View Data' Operations in
		// Data Cleansing Screen
		DCM.verifyViewDataButtonVisible_DCScreen();
		DCM.verifyViewDataButtonClickable_DCScreen();
		DCM.verifyDataSnapshotVisible_DCScreen();

		driver.close();
	} //

	@Test(groups = { "smoke", "regression" }, priority = 5, retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataCleansing_005() throws Exception {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// Pre-Req : This function will select Data Source
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();

		// These functions Will validate Column Operation's
		DCM.verifyColumnButtonVisible_DCScreen();
		DCM.verifyColumnButtonClickable_DCScreen();
		DCM.verifyColumnButton_DCScreen();
		DCM.verifyColumnsNameVisible_CScreen();
		DCM.verifySeachFieldVisible_CScreen();
		DCM.verifySearchFieldInputs_CScreen();
		DCM.verifySearchField_CScreen();
		DCM.verifyHeadingCheckboxVisible_CScreen();
		DCM.verifyHeadingCheckbox_CScreen();
		DCM.verifAllColumnsCheckbox_CScreen();
		DCM.verifyUpArrowButtonVisible_CScreen();
		DCM.verifyUpArrowButtonClickable_CScreen();
		DCM.verifyDownArrow_CScreen();

		DCM.verifyUpArrowButtonSortTheData();

		DCM.verifyDownArrowButtonVisible_CScreen();
		DCM.verifyDownArrowButtonClickable_CScreen();
		DCM.verifyDownArrowButton_CScreen();
		DCM.verifyAllCheckboxVisible_CScreen();
		DCM.verifyIndiviualCheckbox_CScreen();
		DCM.verifyOKButtonVisible_CScreen();
		DCM.verifyOKButtonClickable_CScreen();
		DCM.verifyOKButton_CScreen();
		DCM.verifyCancelButtonVisible_CScreen();
		DCM.verifyCancelButtonClickable_CScreen();
		DCM.verifyCancelButton_CScreen();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 6 ,retryAnalyzer = listeners.RetryAnalyzer.class )
	public void FWA_DataCleansing_006() throws Exception {

		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// Pre-Req : This function will select Data Source
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();

		// These functions Will validate Calculated column Operation's

		DCM.verifyCalculatedColumnButtonVisible_DCScreen();
		DCM.verifyCalculatedColumnButtonClickable_DCScreen();
		DCM.verifyCalculatedColumnButton_DCScreen();
		DCM.verifyColumnsNameVisible_CCScreen();
	
		DCM.verfiyColumnNameFieldVisible_CCScreen();
		DCM.verifyColumnNameField_CCScreen();
		
		DCM.verifyFunctionSearchVisible_CCScreen();
		DCM.verifyFunctionsSearchInputs_CCScreen();
		DCM.verifyFunctionSearch_CCScreen();
		DCM.verifyPreviewFunctionScrollerVisible_CCScreen();
		DCM.verifyPreviewFunctionVisible_CCScreen();
		DCM.verifyFunctionPreview_CCScreen();
		DCM.verifyRemoveSelectedItemButtonVisible_CCScreen();
		DCM.verifyRemoveSelectedItemButtonClickable_CCScreen();
		DCM.verifyColumnDragIntoPreviewArea_CCScreen();
		DCM.verifyPreviewAreaScrollerVisible_CCScreen();
		DCM.VerifyRemoveButtonRemovePreviewColumn_CCScreen();

		DCM.verifyDoubleClickPreviewColumn_CCScreen();
		DCM.verifyOKButtonVisible_CCScreen();
		DCM.verifyOKButtonClickable_CCScreen();
		DCM.verifyOkButtonAddColumn_CCScreen();
		DCM.verifyCancelButtonVisible_CCScreen();
		DCM.verifyCancelButtonClickable_CCScreen();
		DCM.verifyCancelButtonNotAddColumn_CCScreen();
		
		driver.close();
	}
	@Test(groups = { "smoke", "regression" }, priority = 7  ,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_DataCleansing_007() throws Exception {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// Pre-Req : These function will select Data Source
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();
		
		
		// Pre-Req : These function will add calculated column 
		// in Data source, so we can remove it from data source
		DCM.verifyCalculatedColumnButton_DCScreen();
		DCM.verifyDoubleClickPreviewColumn_CCScreen();
		DCM.verifyOkButtonAddColumn_CCScreen();
		
		
		// These functions Will validate Data Source Operation's
		DCM.verifyRemoveButtonVisible_DSTable();
		DCM.verifyRemoveButtonClickable_DSTable();
		DCM.verifyColumnRemoves_DSTable();
		DCM.verifyColumnDropdownVisible_DSTable();
		
		DCM.verifySortAscendingButtonVisible_DSTable();
		DCM.verifySortAscendingButtonClickable_DSTable();
		DCM.verifySortDescending_DSTable();
		
		DCM.verifySortDescendingButtonVisible_DSTable();
		DCM.verifySortDescendingButtonClickable_DSTable();
		DCM.verifySortAscending_DSTable();

		DCM.verifyColumnsButtonVisible_DSTable();
		DCM.verifyColumnsButtonClickable_DSTable();
		DCM.verifyInnerColumnDropdownVisible_DSTable();
		DCM.verifyColumnNameInnerColumnNameVisible_DSTable();
		DCM.verifyTypeInnerColumnNameVisible_DSTable();
		DCM.verifyChangeTypeInnerColumnNameVisible_DSTable();
		DCM.verifyFiltersColumnInnerColumnNameVisible_DSTable();
		DCM.verifyRenameColumnInnerColumnNameVisible_DSTable();
		DCM.verifyActionsInnerColumnNameVisible_DSTable();

		DCM.verifyFiltersButtonVisible_DSTable();
		DCM.verifyFiltersButtonClickable_DSTable();
		DCM.verifyFilterSearchFieldVisible_DSTable();
		DCM.verifyFilterSearchField_DSTable();
		DCM.verifyFilterButtonChecked_DSTable();
		DCM.verifyFilterSearchInputs_DSTable();
		
		driver.close();
	}
	
	@Test(groups = { "smoke", "regression" }, priority = 8  ,retryAnalyzer = listeners.RetryAnalyzer.class )
	public void FWA_DataCleansing_008() throws Exception{
		
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.GetStarted);
		Thread.sleep(8000);

		// This function will take you to the data cleansing screen
		DCM.LandingOnDataCleansingPage();

		// Pre-Req : These function will select Data Source
		DCM.verifySelectDataSourceDropdownButton_DCScreen();
		DCM.verifySelectDataSourceDropdownList_DCScreen();
		
		DCM.verifySaveButtonVisible();
		DCM.verifySaveButtonClickable();
		DCM.verifyCreateNewFilterScreenOpen_Save();
		DCM.verifyCancelButtonVisible_CNFilter();
		DCM.verifyCancelButtonClickable_CNFilter();
		DCM.verifyCancelButton_CNFilter();
		
		DCM.verifySaveDownArrowButton();
		
		DCM.verifySaveAsButtonVisible();
		DCM.verifySaveAsButtonClickable();
		DCM.verifyCreateNewFilterScreenOpen_SaveAs();
		DCM.verifyFilterNameFieldVisible_CNFilter();
		DCM.verifyFilterNameFieldInputs_CNFilter();
		DCM.verifyFilterNameFieldMandatory_CNFilter();
		DCM.verifyRadioButtonVisible_CNFilter();
		DCM.verifyRadioButtonSelection_CNFilter();
		DCM.verifySaveButtonVisible_CNFilter();
		DCM.verifySaveButtonClickable_CNFilter();
		DCM.verifySaveButton_CNFilter();
		DCM.verifyFilterNameCropsSpaces_CNFilter();
		DCM.verifyRemoveButtonVisible_DC();
		DCM.verifyRemoveButtonClickable_DC();
		DCM.verifyRemoveButtonRemoveSelectedFilter_DC();
		DCM.verifyYesButtonVisible_PCDialog();
		DCM.verifyYesButtonClickable_PCDialog();
		DCM.verifyNoButtonVisible_PCDialog();
		DCM.verifyNoButtonClickable_PCDialog();
		DCM.verifyNoButton_PCDialog();
		DCM.verifyYesButton_PCDialog();
		DCM.verifyRemoveButtonNotRemoveUnSelectedFilter_DC();
		DCM.verifyResetButtonVisible_DC();
		DCM.verifyResetButtonClickable_DC();
		DCM.ResetAll_DC();
		
		
		driver.close();
	}
}