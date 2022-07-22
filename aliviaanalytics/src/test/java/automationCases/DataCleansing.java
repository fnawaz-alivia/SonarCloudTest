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
		DCM.verifyCreateFolderButtonIsVisible();
		DCM.verifyCreateButtonIsClickable();
		DCM.verifyCreateFolderPopupIsAppearing();

		// These functions will validate 'Refresh Button' Operations
		DCM.verifyRefreshButtonIsVisible();
		DCM.verifyRefreshButtonIsClickable();

		// These functions will validate 'Expand All Button' Operations
		DCM.verifyExpandAllButtonIsVisible();
		DCM.verifyExpandAllButtonIsClickable();
		DCM.verifyListOfAllFiltersIsExpanded();
		DCM.verifyExpandAllButtonChangesIntoCollapseAllButton();

		// These functions will validate 'Collapse All Button' Operations

		DCM.verifyCollapseAllButtonIsvisible();
		DCM.verifyCollapseAllButtonIsClickable();
		DCM.verifyListOfAllFiltersIsCollapsed();
		DCM.verifyCollapseAllButtonChangesIntoExpandAllButton();

		// These functions will validate 'Collapse Panel' Operations

		DCM.verifyCollapsePanelButtonIsVisible();
		DCM.verifyCollapsePanelButtonIsClickable();
		DCM.verifyCollapsePanelIsCollapsing();

		// These function will validate 'Expand Panel' Operations

		DCM.verifyExpandPanelButtonIsVisible();
		DCM.verifyExpandPanelButtonIsClickable();
		DCM.verifyExpandPanelIsExpanding();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 3, retryAnalyzer = listeners.RetryAnalyzer.class)
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
		DCM.verifySelectDataSourceDropdownIsVisible();
		DCM.verifySelectDataSourceDropdownIsClickable();
		DCM.verifyAvailableListIsAppearingInDataSourceDropdown();
		DCM.verifySelectedDataSourceIsVisibleInField();
		DCM.verifySelectedDataSourceColumnsIsVisible();
		DCM.verifyPopupIsAppearingIfDataSourceIsChanged();
		DCM.verifyYesButtonIsVisible();
		DCM.verifyYesButtonIsClickable();
		DCM.verifyByclickingYesButtonIsDataSourceChanged();

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 4, retryAnalyzer = listeners.RetryAnalyzer.class)
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
		DCM.verifyAvailableListIsAppearingInDataSourceDropdown();
		DCM.verifySelectedDataSourceIsVisibleInField();

		// These functions will validate 'View Data' Operations in
		// Data Cleansing Screen
		DCM.verifyViewDataButtonIsVisible();
		DCM.verifyViewDataButtonIsClickable();
		DCM.verifyDataSourceIsVisibleInDataSnapshot();

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
		DCM.verifyAvailableListIsAppearingInDataSourceDropdown();
		DCM.verifySelectedDataSourceIsVisibleInField();

		// These functions Will validate Column Operation's
		DCM.verifyColumnButtonIsVisible();
		DCM.verifyColumnButtonIsClickable();
		DCM.verifyColumnScreenIsOpened();
		DCM.verifyColumnsNameIsDisplaying();
		DCM.verifyColumnScreenSeachFieldIsVisible();
		DCM.verifyColumnScreenSearchFieldInputs();
		DCM.verifyColumnScreenSearchFieldIsWorking();
		DCM.verifyColumnNameCheckboxIsVisible();
		DCM.verifyColumnNameCheckbox();
		DCM.verifAllColumnsAreCheckedIfColumnNameIsChecked();
		DCM.verifyColumnScreenUpArrowIsVisible();
		DCM.verifyUpArrowButtonIsClickable();
		DCM.verifyUpArrowChangesIntoDownArrow();

		DCM.verifyUpArrowButtonSortTheData();

		DCM.verifyDownArrowButtonIsClickable();
		DCM.verifyDownArrowChangesIntoUpArrow();
		DCM.verifyCheckboxIsVisibleWithEachColumnName();
		DCM.verifyIndiviualColumnCanbeCheck();
		DCM.verifyOKButtonIsVisible();
		DCM.verifyOKButtonIsClickable();
		DCM.verifyByClickingOkButtonColumnScreenClose();
		DCM.verifyCancelButtonIsVisible();
		DCM.verifyCancelButtonIsClickable();
		DCM.verifyCancelButtonCloseCancelScreen();
		

		driver.close();
	}

	@Test(groups = { "smoke", "regression" }, priority = 6, retryAnalyzer = listeners.RetryAnalyzer.class)
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
		DCM.verifyAvailableListIsAppearingInDataSourceDropdown();
		DCM.verifySelectedDataSourceIsVisibleInField();

		// These functions Will validate Calculated column Operation's

		DCM.verifyCalculatedColumnButtonIsVisible();
		DCM.verifyCalculatedColumnButtonIsClickable();
		DCM.verifyGeneratColumnScreenOpens();
		DCM.verifyColumnsNameInCalculatedColumnScreen();
		DCM.verfiyColumnNameTextFieldIsVisible();
		DCM.VerifyColumnNameTextFieldInputs();
		DCM.verifyFunctionTextFieldIsVisible();
		DCM.VerifyFunctionsTextFieldInputs();
		DCM.verifyFunctionTextFieldDisplayRelevantData();
		DCM.verifyScrollBarIVisibleOfFunctionsPanel();
		DCM.verifyPreviewSectionOfFucntionsPanelIsVisible();
		DCM.verifyPreviewSectionDisplaySelectedFunctionsDetail();
		DCM.verifyRemoveSelectedItemsIsVisible();
		DCM.verifyRemoveSelectedItemsIsClickable();
		
	}

}