package automationModels;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
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

public class ModelingModel extends Configuration {

	public static ExtentTest test;

	@FindBy(how = How.XPATH, using = "//*[@class = 'x-tree-node-text ' and (text() = 'Modeling' or . = 'Modeling')]")

	public WebElement Modeling;

	@FindBy(how = How.XPATH, using = "//a[(text() = 'Modeling' or . = 'Modeling')]")

	public WebElement ModelingBreadCrumb;



	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-body x-panel-body-default x-panel-body-default x-noborder-t x-panel-default-outer-border-rbl')]")

	public WebElement ModelSurface;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-leftGrid-dataSourcesGrid-54')]//child::input")

	public WebElement SearchTabDatasourcesGrid;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-rightGrid-algorithmsGrid-59')]//child::input")

	public WebElement SearchTabalgorithmsGrid;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]")

	public WebElement ModelExecutionResultAlert;



	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-leftGrid-dataSourcesGrid-54')]//child::table//tr//td[2]//div")

	public List<WebElement> DataSourcesList;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'ext-element') and @stroke-linecap= 'butt' and @fill='#006400']")

	public List<WebElement> DrawNodesList;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'ext-element') and @viewBox= 'null' and @width= '40']")

	public List<WebElement> InputOutputNodesList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]//child::div")

	public List<WebElement> ModelExecutionResult;
	
	// Filter Pane SideBar 
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'filtersGrid')]//div[@data-qtip='Expand panel']")

	WebElement FilterExpandPanel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'filtersGrid')]//div[@data-qtip='Collapse panel']")

	WebElement FilterCollapsePanel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'filtersGrid')]/div[contains(@class,'x-panel-header') and not(contains(@class,'collapse'))]")

	WebElement FilterPane;

	@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'filtersGrid')]//input/parent::div")

	WebElement FilterSearchDiv;

	@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'filtersGrid')]//input")

	WebElement FilterSearchInput;

	@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'filtersGrid')]//input/following::div[1]")

	WebElement FilterSearchCross;

	@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'filtersGrid')]//table")

	List<WebElement> FilterList;
	
	// Chart Pane SideBar 
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//div[@data-qtip='Expand panel']")

	WebElement ChartExpandPanel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//div[@data-qtip='Collapse panel']")

	WebElement ChartCollapsePanel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]/div[contains(@class,'x-panel-header') and not(contains(@class,'collapse'))]")

	WebElement ChartPane;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//input/parent::div")

	WebElement ChartsSearchDiv;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//input")

	WebElement ChartsSearchInput;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//input/following::div[1]")

	WebElement ChartsSearchCross;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'chartsGrid')]//table")

	List<WebElement> ChartList;
	
	// Algorithm Section 
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-splitter-collapsed collapsed')]/div[contains(@class,'x-layout-split-right')]")

	WebElement RightSideExpand;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//input/parent::div[1]")

	WebElement AlgorithmSearchDiv;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//input")

	WebElement AlgorithmSearchInput;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//input/following::div[1]")

	WebElement AlgorithmSearchCross;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//table")

	List<WebElement> AlgorithmList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//table[not(contains(@style,'none'))]//tr[@aria-level='2']//div[contains(@class,'expander')]")

	List<WebElement> AlgorithmMainFolderList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//table[not(contains(@style,'none'))]//tr[@aria-level='3']//div[contains(@class,'expander')]")

	List<WebElement> AlgorithmInnerFolderList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'rightGrid')]/div[2]//div[contains(@class,'rightGrid')]//table[not(contains(@style,'none'))]//tr[@aria-level='4']")

	List<WebElement> AlgorithmsList;
	
	// Parameter View Section
	
	@FindBy(how = How.XPATH, using = "//div[@id='rtParamsViewId-targetEl']/div")

	WebElement ParameterViewPane;
	
	@FindBy(how = How.XPATH, using = "//div[@id='save_results-innerWrapEl']")

	WebElement SaveResultsDataSourceDiv;
	
	@FindBy(how = How.XPATH, using = "//input[@id='save_results-inputEl']")

	WebElement SaveResultsDataSourceInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='save_results' and contains(@class,'checked')]")

	WebElement SelectedSaveResultsDataSource;
	
	@FindBy(how = How.XPATH, using = "//div[@id='save_results' and not(contains(@class,'checked'))]")

	WebElement UnselectedSaveResultsDataSource;
	
	@FindBy(how = How.XPATH, using = "//table[@id='overwrite_append_new_ds-innerCt']/tbody/tr/td")

	List<WebElement> RadioButtonTDList;
	
	@FindBy(how = How.XPATH, using = "//table[@id='overwrite_append_new_ds-innerCt']/tbody/tr/td//input")

	List<WebElement> RadioButtonInputList;
	
	@FindBy(how = How.XPATH, using = "//table[@id='overwrite_append_new_ds-innerCt']/tbody/tr/td//div[contains(@class,'checked')]")

	List<WebElement> RadioButtonSelectedInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='save_name']")

	WebElement ResultantDataSourceNameDiv;
	
	@FindBy(how = How.XPATH, using = "//input[@id='save_name-inputEl']")

	WebElement ResultantDataSourceNameInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='model_name']")

	WebElement ModelNameDiv;
	
	@FindBy(how = How.XPATH, using = "//input[@id='model_name-inputEl']")

	WebElement ModelNameInput;
	
	// Canvas Section
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[2]/div//*[name()='svg']/*/*[1]")

	WebElement Canvas;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel canvas-component')]//*[name()='svg']")

	List<WebElement> CanvasItemsList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]//*[name()='svg']//*[@fill='#006400']")

	List<WebElement> CanvasItemsPortsList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[3]/div//*[name()='svg']//*[@fill='#006400']")

	List<WebElement> CanvasDataSourcePort;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[4]/div//*[name()='svg']//*[@fill='#006400']")

	List<WebElement> CanvasFiltersPort;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[5]/div//*[name()='svg']//*[@fill='#006400']")

	List<WebElement> CanvasAlgorithmPort;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[2]/div//*[name()='svg']/*/*[2]")

	WebElement InputPort;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel mc-drop-target')]/div[2]/div//*[name()='svg']/*/*[3]")

	WebElement OutputPort;
	
	// Top Action Button

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'splitbutton-') and @data-qtip = 'Save Modeling Process']")

	WebElement SaveModel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'modeling_reseting')]//div[contains(@id,'toolbar')]//a[1]/span[2]")

	WebElement SaveModelDropdown;
	

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-modeling-executeButton-52')]//span[contains(@class,'play')]")

	WebElement ModelExecutionButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-modeling-executeButton-52')]//following::span[1][text()='Execute']")

	WebElement ModelExecutionButtonSpan;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-modeling-executeButton-52')]//following::span[1][text()='Stop']")

	WebElement ModelStopButtonSpan;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-modeling-executeButton-52')]//following::span[1]")

	WebElement ModelExecutionButtonText;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'modeling_reseting')]//div[contains(@id,'toolbar')]//a[3]")

	WebElement DeleteButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'modeling_reseting')]//div[contains(@id,'toolbar')]//a[4]")

	WebElement ClearButton;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a")

	List<WebElement> SaveModelDropdownList;
	
	@FindBy(how = How.XPATH, using = "//div[@role='alertdialog']")

	List<WebElement> SaveModelScreen;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'messagebox')]/parent::div")

	WebElement SaveModelInputDiv;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'messagebox')]")

	WebElement SaveModelInput;
	
	@FindBy(how = How.XPATH, using = "//span[text()='OK']")

	WebElement SaveModelOK;

	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")

	WebElement SaveModelCancel;
	
	public void LandingOnPageModeling() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		CM.Analysis.click();
		utilityMethods.visible(this.Modeling, "Side Pane:Verify that Modeling Button is present in Analysis dropdown");
		utilityMethods.clickable(this.Modeling, "Side Pane: Verify that Modeling Button is clickable");
		utilityMethods.clicked_elementVisible(this.Modeling, 2000, this.ModelingBreadCrumb,
				"Side Pane: Verify that clicking on Query Builder Button navigates to 'Query Builder' screen");
		this.ModelingBreadCrumb.click();
		utilityMethods.time(2000);

	}

	public void verifyModelingLeftSidePanel() {
		RankingModel RM = PageFactory.initElements(driver, automationModels.RankingModel.class);

		// Collapse & Expand Button in Side Panel
		utilityMethods.visible(RM.collapseleftpane,
				"Modeling Screen:Verify that Collapse Panel button is present on the side panel in Modeling screen.");
		utilityMethods.clickable(RM.collapseleftpane,
				"Modeling Screen:Verify that Collapse Panel button is clickable.");
		utilityMethods.clicked_Single(RM.collapseleftpane, 1000, RM.expandleftpane,
				"Modeling Screen:Verify that clicking on Collapse Panel button will collapse the side panel in Modeling screen");
		utilityMethods.visible(RM.expandleftpane,
				"Modeling Screen:Verify that clicking on Collapse Panel button will change the button into Expand Panel button");
		utilityMethods.clickable(RM.expandleftpane, "Modeling Screen:Verify that Expand Panel button is clickable");
		utilityMethods.clicked_Single(RM.expandleftpane, 1000, RM.collapseleftpane,
				"Modeling Screen:Verify that clicking on Expand Panel button will expand the side panel in Modelings module");
		utilityMethods.visible(RM.Pane1SideBar,
				"Verify that Data Sources Pane is present on the side panel in Modeling module.");

		// Collapse & Expand Button in DataSource Pane

		utilityMethods.visible(RM.collapseDataSourcepanel,
				"Modeling Screen:Verify that clicking on Collapse Panel button will collapse the Data Source pane.");
		utilityMethods.clickable(RM.collapseDataSourcepanel,
				"Modeling Screen:Verify that Collapse Panel button is clickable.");
		utilityMethods.clicked_Single(RM.collapseDataSourcepanel, 1000, RM.expandDataSourcepanel,
				"Modeling Screen:Verify that clicking on Collapse Panel button will collapse the Data Source pane.");

		utilityMethods.visible(RM.expandDataSourcepanel,
				"Modeling Screen:Verify that clicking on Collapse Panel button will change the button into Expand Panel");
		utilityMethods.clickable(RM.expandDataSourcepanel,
				"Modeling Screen:Verify that Expand Panel button is clickable");
		utilityMethods.clicked_Single(RM.expandDataSourcepanel, 1000, RM.collapseDataSourcepanel,
				"Modeling Screen:Verify that clicking on Expand Panel button will expand the Data Sources pane.");

		// Search Field in Data Source Pane

		utilityMethods.visible(RM.SearchDiv,
				"Modeling Screen:Verify that Search Text Field is visible in the side panel in Data Sources section");
		utilityMethods.clickable(RM.SearchInput, "Modeling Screen:Verify that Search Text Field is clickable");
		utilityMethods.sendKeys_Input(RM.SearchInput, 500, "includeChar",
				"Modeling Screen:Verify that Search Text Field accepts alphabets, numerics and special characters as input");
		utilityMethods.validateSearchPlaceholder(RM.SearchInput, "Search ...",
				"Modeling Screen:Verify that 'Search' is written in this text box by default");
		utilityMethods.validateSearch(RM.SearchInput, RM.DataSourcesList, "Automation",
				"Modeling Screen:Verify that relevant data sources are searched and displayed related to the text entered in the field");
		utilityMethods.visible(RM.crosssearchtextdatasource,
				"Modeling Screen:Verify that a cross is visible to the right in the Search Text Field");
		utilityMethods.clickable(RM.crosssearchtextdatasource, 
				"Modeling Screen:Verify that a cross is clickable");
		utilityMethods.verifyCrossButton(RM.SearchInput, 500, RM.crosssearchtextdatasource,
				"Modeling Screen:Verify that clicking the cross removes any text from the Search Text Field");

		// Drag Data Sources to drop in Modeling Canvas

		utilityMethods.verifyDragDropByOffsets(this.DataSourcesList.get(2),300,0, this.CanvasItemsList,
				"Modeling Screen:Verify that dragging function in Drag Data Sources to drop in Modeling Canvas works.");
		utilityMethods.visible(this.CanvasItemsList.get(0),
				"Modeling Screen:Verify that dropping a data source in the canvas produces a data source visual.");

		// Search Field in Filters Pane

		// Open Filter Pane
		utilityMethods.visible(this.FilterExpandPanel, 
				"Modeling Screen:Verify that Expand Panel button is present in Filters Pane.");
		utilityMethods.clickable(this.FilterExpandPanel, 
				"Modeling Screen:Verify that Expand Panel button is clickable in Filters Pane.");
		utilityMethods.clicked_elementVisible(this.FilterExpandPanel, 500, this.FilterPane,
				"Modeling Screen:Verify that Filter Pane is visible.");
		
		utilityMethods.visible(this.FilterSearchDiv,
				"Modeling Screen:Verify that Search Text Field is visible in the side panel in Filters section");
		utilityMethods.clickable(this.FilterSearchInput, "Modeling Screen:Verify that Search Text Field is clickable");
		utilityMethods.sendKeys_Input(this.FilterSearchInput, 500, "includeChar",
				"Modeling Screen:Verify that Search Text Field accepts alphabets, numerics and special characters as input");
		utilityMethods.validateSearchPlaceholder(this.FilterSearchInput, "Search ...",
				"Modeling Screen:Verify that 'Search' is written in this text box by default");
		utilityMethods.validateSearch(this.FilterSearchInput, this.FilterList, "Auto",
				"Modeling Screen:Verify that relevant data sources are searched and displayed related to the text entered in the field");
		utilityMethods.visible(this.FilterSearchCross,
				"Modeling Screen:Verify that a cross is visible to the right in the Search Text Field");
		utilityMethods.clickable(this.FilterSearchCross, 
				"Modeling Screen:Verify that a cross is clickable");
		utilityMethods.verifyCrossButton(this.FilterSearchInput, 500, this.FilterSearchCross,
				"Modeling Screen:Verify that clicking the cross removes any text from the Search Text Field");
		
		
		// Drag Filter to drop in Modeling Canvas

		utilityMethods.verifyDragDropByOffsets(this.FilterList.get(0), 450,0,this.CanvasItemsList,
				"Modeling Screen:Verify that dragging function in Drag Filters to drop in Modeling Canvas works.");
		utilityMethods.visible(this.CanvasItemsList.get(0),
				"Modeling Screen:Verify that dropping a filters in the canvas produces a data source visual.");
		// Search Field in Charts Pane
		
		// Open Chart Pane
		utilityMethods.visible(this.ChartExpandPanel, 
				"Modeling Screen:Verify that Expand Panel button is present in Filters Pane.");
		utilityMethods.clickable(this.ChartExpandPanel, 
				"Modeling Screen:Verify that Expand Panel button is clickable in Filters Pane.");
		utilityMethods.clicked_elementVisible(this.ChartExpandPanel, 500, this.ChartPane,
				"Modeling Screen:Verify that Filter Pane is visible.");

		utilityMethods.visible(this.ChartsSearchDiv,
				"Modeling Screen:Verify that Search Text Field is visible in the side panel in Chart section");
		utilityMethods.clickable(this.ChartsSearchInput, 
				"Modeling Screen:Verify that Search Text Field is clickable");
		utilityMethods.sendKeys_Input(this.ChartsSearchInput, 500, "includeChar",
				"Modeling Screen:Verify that Search Text Field accepts alphabets, numerics and special characters as input");
		utilityMethods.validateSearchPlaceholder(this.ChartsSearchInput, "Search ...",
				"Modeling Screen:Verify that 'Search' is written in this text box by default");
		utilityMethods.validateSearch(this.ChartsSearchInput, this.ChartList, "Auto",
				"Modeling Screen:Verify that relevant data sources are searched and displayed related to the text entered in the field");
		utilityMethods.visible(this.ChartsSearchCross,
				"Modeling Screen:Verify that a cross is visible to the right in the Search Text Field");
		utilityMethods.clickable(this.ChartsSearchCross, "Modeling Screen:Verify that a cross is clickable");
		utilityMethods.verifyCrossButton(this.ChartsSearchInput, 500, this.ChartsSearchCross,
				"Modeling Screen:Verify that clicking the cross removes any text from the Search Text Field");
	}
	public void verifyModelingRightSidePanel() {
		
		this.RightSideExpand.click();
		utilityMethods.time(500);
		
		
		// Expand Folder Button
		
		// MAIN
		utilityMethods.visible(this.AlgorithmMainFolderList.get(0),
				"Modeling Screen:Verify that Algorithm Folder is present in Algorithm section");
		utilityMethods.clickable(this.AlgorithmMainFolderList.get(0),
				"Modeling Screen:Verify that Algorithm Folder is clickable in Algorithm section");
		utilityMethods.list_NotVisible(this.AlgorithmMainFolderList.get(0), 500, this.AlgorithmInnerFolderList, 
				"Modeling Screen:Verify that Main Folder collapse when click on it.");
		utilityMethods.list_Visible(this.AlgorithmMainFolderList.get(0), 500, this.AlgorithmInnerFolderList, 
				"Modeling Screen:Verify that Main Folder expand when click on it.");
		
		// INNER
		utilityMethods.visible(this.AlgorithmInnerFolderList.get(0),
				"Modeling Screen:Verify that Algorithm Inner Folder is present in Algorithm section.");
		utilityMethods.clickable(this.AlgorithmInnerFolderList.get(0),
				"Modeling Screen:Verify that Algorithm Inner Folder is clickable in Algorithm section.");
		utilityMethods.list_Visible(this.AlgorithmInnerFolderList.get(0), 500, this.AlgorithmsList, 
				"Modeling Screen:Verify that Inner expand when click on it.");
		
		// ALGORITHM
		utilityMethods.visible(this.AlgorithmsList.get(0), 
				"Modeling Screen:Verify that Algorithm's is present inside the folder in Algorithm section.");
		utilityMethods.clickable(this.AlgorithmsList.get(0), 
				"Modeling Screen:Verify that Algorithm's is clickable.");
		
		// Search Field in Algorithm's Pane

		utilityMethods.visible(this.AlgorithmSearchDiv,
				"Modeling Screen:Verify that Search Text Field is visible in the side panel in Algorithm section");
		utilityMethods.clickable(this.AlgorithmSearchInput, 
				"Modeling Screen:Verify that Search Text Field is clickable");
		utilityMethods.sendKeys_Input(this.AlgorithmSearchInput, 500, "includeChar",
				"Modeling Screen:Verify that Search Text Field accepts alphabets, numerics and special characters as input");
		utilityMethods.validateSearchList_SidePanel(this.AlgorithmSearchInput, this.AlgorithmInnerFolderList,this.AlgorithmsList, "Outlier",
				"Modeling Screen:Verify that relevant data sources are searched and displayed related to the text entered in the field");
		utilityMethods.visible(this.AlgorithmSearchCross,
				"Modeling Screen:Verify that a cross is visible to the right in the Search Text Field");
		utilityMethods.clickable(this.AlgorithmSearchCross, 
				"Modeling Screen:Verify that a cross is clickable");
		utilityMethods.verifyCrossButton(this.AlgorithmSearchInput, 500, this.AlgorithmSearchCross,
				"Modeling Screen:Verify that clicking the cross removes any text from the Search Text Field");

		// Drag Data Sources to drop in Modeling Canvas

		utilityMethods.verifyDragDropByLocation(this.AlgorithmsList.get(0),this.Canvas, this.CanvasItemsList,
				"Modeling Screen:Verify that dragging function in Drag Algorithms to drop in Modeling Canvas works.");
		utilityMethods.visible(this.CanvasItemsList.get(1),
				"Modeling Screen:Verify that dropping an algorithm in the canvas produces an algorithm visual.");
		
		
		
		// Parameters View Button
		
		utilityMethods.visible(this.ParameterViewPane,
				"Modeling Screen:Verify that Parameters View Button is visible.");
		
		// Save Results as Data Source Checkbox
		
		utilityMethods.visible(this.SaveResultsDataSourceDiv,
				"Modeling Screen:Verify that Save Results as Data Source Checkbox is visible in Parameters View.");
		utilityMethods.clickable(this.SaveResultsDataSourceInput,
				"Modeling Screen:Verify that Save Results as Data Source is clickable.");
		utilityMethods.visible(this.UnselectedSaveResultsDataSource,
				"Modeling Screen:Verify that Save Results as Data Source Checkbox is unchecked by default.");
		utilityMethods.clicked_elementVisible(this.UnselectedSaveResultsDataSource, 500, this.SelectedSaveResultsDataSource, 
				"Modeling Screen:Verify that on clicking the checkbox a tick shows up in the checkbox.");
		
		// Radio Buttons
		
		utilityMethods.verifyRadioButtonPrivatePublicVisible(this.RadioButtonTDList);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(this.RadioButtonInputList);
		utilityMethods.verifyRadioButtonSelection(this.RadioButtonInputList,this.RadioButtonSelectedInput);
		
		// Resultant Data Source Name Text Field
		
		
		utilityMethods.visible(this.ResultantDataSourceNameDiv,
				"Modeling Screen:Verify that Resultant Data Source Name Text Field is visible in Parameters View.");
		utilityMethods.validateSearchValue(this.ResultantDataSourceNameInput, "Kernel Density Estimation", 
				"Modeling Screen:Verify that Resultant Data Source Name Text Field shows the selected data source's name by default. ");
		utilityMethods.sendKeys_Input(this.ResultantDataSourceNameInput, 500, "includeChar", 
				"Modeling Screen:Verify that Resultant Data Source Name Text Field lets users input alphabets, numbers and special characters. ");
		
		// Model Name Text Field
		
		utilityMethods.visible(this.ModelNameDiv,
				"Modeling Screen:Verify that Model Name Text Field is visible under certain algorithms.");
		utilityMethods.clickable(this.ModelNameInput,
				"Modeling Screen:Verify that Model Name Text Field is clickable and editable.");
		utilityMethods.validateSearchValue(this.ModelNameInput, "Kernel Density Estimation", 
				"Modeling Screen:Verify that Model Name Text Field shows the selected data source's name by default. ");
		utilityMethods.sendKeys_Input(this.ModelNameInput, 500, "includeChar", 
				"Modeling Screen:Verify that Model Name Text Field lets users input alphabets, numbers and special characters. ");
	}
	public void verifyModelingCanvas() {
		
		// Connect Data Source, Algorithm and Output Port

		utilityMethods.verifySizeMatch(this.CanvasDataSourcePort,1, 
				"Modeling Screen:Verify that data sources have one port.");
		utilityMethods.verifySizeMatch(this.CanvasFiltersPort,2,
				"Modeling Screen:Verify that filters have two ports.");
		utilityMethods.verifySizeMatch(this.CanvasAlgorithmPort, 2,
				"Modeling Screen:Verify that algorithms have two ports.");
		utilityMethods.visible(this.OutputPort, 
				"Modeling Screen:Verify that Output Ports are visible in the canvas.");
		this.CanvasDataSourcePort.get(0).click();
		this.CanvasAlgorithmPort.get(0).click();
		this.CanvasAlgorithmPort.get(1).click();
		this.OutputPort.click();
		
		// Save Modeling Process Dropdown
		
		utilityMethods.visible(this.SaveModel, 
				"Modeling Screen:Verify that the save button is present.");
		utilityMethods.clickable(this.SaveModel, 
				"Modeling Screen:Verify that the save button is clickable.");
		utilityMethods.list_Visible(this.SaveModel, 500, this.SaveModelScreen,
				"Modeling Screen:Verify that the Save Analysis Model As screen visible.");
		// Cancel Button
		utilityMethods.visible(this.SaveModelCancel, 
				"Modeling Screen:Verify that the cancel button is present.");
		utilityMethods.clickable(this.SaveModelCancel, 
				"Modeling Screen:Verify that the cancel button is clickable.");
		utilityMethods.list_NotVisible(this.SaveModelCancel, 500, this.SaveModelScreen, 
				"Modeling Screen:Verify that clicking Cancel Button reverts the process and takes the user back to the Modeling screen.");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(this.SaveModelDropdown).click().build().perform();
		utilityMethods.time(1000);
		
		// Copy Modeling As Button
		
		utilityMethods.visible(this.SaveModelDropdownList.get(0), 
				"Verify that 'Verify that Copy Modeling As Button is visible in the Save Modeling Process Dropdown.");
		utilityMethods.clickable(this.SaveModelDropdownList.get(0),
				"Verify that 'Verify that Copy Modeling As Button is clickable.");
		
		actions.moveToElement(this.SaveModelDropdownList.get(0)).click().build().perform();
		utilityMethods.time(1000);
		
		// Ok Button
		utilityMethods.visible(this.SaveModelOK, 
				"Modeling Screen:Verify that Ok Button is visible.");
		utilityMethods.clickable(this.SaveModelOK, 
				"Modeling Screen:Verify that Ok Button is clickable.");
		
		// Enter Name Text Field
		
		utilityMethods.visible(this.SaveModelInputDiv, 
				"Modeling Screen:Verify that Enter Name Text Field is visible when Copy Modeling As Button is clicked.");
		utilityMethods.clickable(this.SaveModelInput, 
				"Modeling Screen:Verify that the save button is clickable");
		utilityMethods.sendKeys_Input(this.SaveModelInput, 500, "includeChar",
				"Modeling Screen:Verify that Enter Name Text Field lets users input alphabets, numbers and special characters. ");
		utilityMethods.validateInputSpaces(this.SaveModelInput, " ", this.SaveModelOK, this.SaveModelScreen,
				"Modeling Screen:Verify that Enter Name Text Field Can't be empty.");
		
		actions.moveToElement(this.SaveModelDropdown).click().build().perform();
		utilityMethods.time(1000);
		
		// Rename Modeling As Button
		
		utilityMethods.visible(this.SaveModelDropdownList.get(1), 
				"Modeling Screen:Verify that Rename Modeling As Button is visible in the Save Modeling Process Dropdown.");
		utilityMethods.clickable(this.SaveModelDropdownList.get(1),
				"Modeling Screen:Verify that Rename Modeling As Button is clickable.");
		
		
		// Execute Button
		
		utilityMethods.visible(this.ModelExecutionButton, 
				"Modeling Screen:Verify that Execute Button is visible on the Modeling screen.");
		utilityMethods.clickable(this.ModelExecutionButton,
				"Modeling Screen:Verify that Execute Button is clickable.");
		utilityMethods.clicked_elementVisible(this.ModelExecutionButton, 100, this.ModelStopButtonSpan, 
				"Modeling Screen:Verify that Execute Button becomes Stop Execution Button upon clicking.");
		utilityMethods.visible(this.ModelStopButtonSpan, 
				"Modeling Screen:Verify that Stop Button is visible on the Modeling screen.");
		utilityMethods.clickable(this.ModelStopButtonSpan,
				"Modeling Screen:Verify that Stop Button is clickable.");
		utilityMethods.clicked_elementVisible(this.ModelStopButtonSpan,200,this.ModelExecutionButtonSpan,
				"Modeling Screen:Verify that Stop Button becomed Execute Button.");
		
		// Delete Button
		utilityMethods.visible(this.DeleteButton, 
				"Modeling Screen:Verify that Delete Button is visible on the Modeling screen.");
		utilityMethods.clickable(this.DeleteButton,
				"Modeling Screen:Verify that Delete Button is clickable.");
		utilityMethods.verifyItemRemoveOnSelection(this.DeleteButton, this.CanvasItemsList, 
				"Modeling Screen:Verify that clicking Delete Button after selecting an item in the canvas deletes it.");
		
		// Clear Button
		utilityMethods.visible(this.ClearButton, 
				"Modeling Screen:Verify that Clear All Button is visible on the Modeling screen.");
		utilityMethods.clickable(this.ClearButton,
				"Modeling Screen:Verify that Delete Button is clickable.");
		utilityMethods.list_NotVisible(this.ClearButton, 500, this.CanvasItemsList, 
				"Modeling Screen:Verify that clicking Clear All Button removes all the items from the canvas and clears it.");
		
		
	}

	public void DragDropDataSource(String DSName) {
		for (WebElement el : DataSourcesList) {

			if (el.getText().equals(DSName)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).moveByOffset(300, 0).release().build();
				dragAndDrop.perform();

				break;
			}
		}

	}

	public void DragDropAlgorithm(String Algorithm) {
		for (WebElement el : AlgorithmsList) {

			if (el.getText().equals(Algorithm)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).moveToElement(ModelSurface).release(ModelSurface).build();
				dragAndDrop.perform();

				break;
			}
		}

	}

	public void CreateModel(String modelName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		test = report.createTest("Side Pane: Verify that Analysis dropdown is visible in the side pane");
		if (CM.Analysis.isDisplayed()) {
			test.log(Status.PASS, " Analysis dropdown is visible in the side pane");
		} else {
			test.log(Status.FAIL, " Analysis dropdown is not visible in the side pane");
		}
		test = report.createTest("Side Pane: Verify that Analysis dropdown is clickable");
		if (CM.Analysis.isEnabled()) {
			test.log(Status.PASS, " Analysis dropdown is clickable");
		} else {
			test.log(Status.FAIL, " Analysis dropdown is not clickable");
		}
		test = report.createTest(
				"Side Pane: Verify that clicking on the Analysis Dropdown displays a list of its sub-modules in the dropdown");
		CM.Analysis.click();

		if (this.Modeling.isDisplayed()) {
			test.log(Status.PASS,
					" clicking on the Analysis Dropdown displays a list of its sub-modules in the dropdown");
		} else {
			test.log(Status.FAIL,
					" clicking on the Analysis Dropdown doesn't display a list of its sub-modules in the dropdown");
		}

		test = report.createTest("Side Pane: Verify that Modeling Button is present in Analysis dropdown");
		if (this.Modeling.isDisplayed()) {
			test.log(Status.PASS, " The Modeling Button is present in Analysis dropdown");
		} else {
			test.log(Status.FAIL, " The Modeling Button is not present in Analysis dropdown");
		}
		test = report.createTest("Side Pane: Verify that Modeling Button is clickable");
		if (this.Modeling.isEnabled()) {
			test.log(Status.PASS, " Modeling Button is clickable");
		} else {
			test.log(Status.FAIL, "Modeling Button is not clickable");
		}

		test = report
				.createTest("Side Pane: Verify that clicking on the Modeling Button navigates to the Modeling screen");
		this.Modeling.click();
		Thread.sleep(2000);
		if (this.ModelSurface.isDisplayed()) {
			test.log(Status.PASS, " clicking on the Modeling Button navigates to the Modeling screen");
		} else {
			test.log(Status.FAIL, "clicking on the Modeling Button navigates to the Modeling screen");
		}

		this.ModelSurface.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in Artifacts.");
		this.SearchTabDatasourcesGrid.sendKeys("Medical Transactions");
		test.log(Status.PASS, "The search tab works for data sources in Artifacts.");
		Thread.sleep(3000);
		test = report.createTest("Verify that all the data sources are loaded in the panel.");
		test.log(Status.PASS, " all the data sources are loaded in the panel");
		test = report.createTest("Verify the user is able to drag and drop datasource into Modeling Surface");
		this.DragDropDataSource("Medical Transactions");
		test.log(Status.PASS, " The user is able to drag and drop datasource into Modeling Surface");
		test = report.createTest("Verify that the algorithms are listed as tree in left pane.");
		test.log(Status.PASS, " The algorithms are listed as tree in left pane.");
		test = report.createTest("Verify that the search feature for algorithms work in left pane.");
		this.SearchTabalgorithmsGrid.sendKeys(modelName);
		test.log(Status.PASS, "  The search feature for algorithms works in left pane.");
		Thread.sleep(3000);
		test = report.createTest("Verify the user is able to drag and drop algorithms into Modeling Surface");
		this.DragDropAlgorithm(modelName);
		test.log(Status.PASS, " The user is able to drag and drop algorithms into Modeling Surface");
		Thread.sleep(2000);
		test = report.createTest(
				"Verify the user is able to draw the connections between datasource, algorithm and output node ");
		this.DrawNodesList.get(0).click();
		this.DrawNodesList.get(1).click();
		this.DrawNodesList.get(2).click();
		this.InputOutputNodesList.get(1).click();
		test.log(Status.PASS,
				" The user is able to draw the connections between datasource, algorithm and output node ");

		test = report.createTest("Verify that the save button is present on modeling screen");
		if (this.SaveModel.isDisplayed()) {
			test.log(Status.PASS, " The save button is present on modeling screen");
		} else {
			test.log(Status.FAIL, " The save button is not present on modeling screen");
		}
		test = report.createTest("Verify that the save button is clickable on modeling screen");
		if (this.SaveModel.isEnabled()) {
			test.log(Status.PASS, " The save button is clickable on modeling screen");
		} else {
			test.log(Status.FAIL, "The save button is not clickable on modeling screen");
		}

		test = report.createTest(
				"Verify that by clicking on save button on modeling screen 'Save Analysis Model AS'pop up opens");
		this.SaveModel.click();
		if (CM.InputName.isDisplayed()) {
			test.log(Status.PASS, "by clicking on save button on modeling screen 'Save Analysis Model AS'pop up opens");
		} else {
			test.log(Status.FAIL,
					"by clicking on save button on modeling screen 'Save Analysis Model AS'pop up does not open");
		}
		test = report.createTest("Save Analysis Model As - Verify Model name is editable.");
		CM.InputName.sendKeys(modelName);
		test.log(Status.PASS, " The Model name is editable");

		test = report.createTest("Save Analysis Model As -Verify that the ok button is present");
		if (CM.OKButton.isDisplayed()) {
			test.log(Status.PASS, " Save Analysis Model As - the ok button is present");
		} else {
			test.log(Status.FAIL, " Save Analysis Model As - the ok button is not present");
		}
		test = report.createTest("Save Analysis Model As -Verify that the ok button is clickable");
		if (CM.OKButton.isEnabled()) {
			test.log(Status.PASS, " Save Analysis Model As -the ok button is clickable");
		} else {
			test.log(Status.FAIL, "Save Analysis Model As -the ok button is not clickable");
		}
		CM.OKButton.click();
		utilityMethods.waitForVisibility(CM.OKButton);
		CM.OKButton.click();

	}

	public void ExecutionOfModel() throws InterruptedException {

		try {
			ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
			this.ModelExecutionButton.click();
			Thread.sleep(2000);
			System.out.println(this.ModelExecutionButtonText.getText());
			Instant start = Instant.now();
			while (this.ModelExecutionButtonText.getText().equals("Stop")) {
				System.out.println("The Model Execution is inprogress");
				Thread.sleep(2000);
				Instant end = Instant.now();
				Duration timeElapsed = Duration.between(start, end);
				long timetaken = timeElapsed.getSeconds();
				if (timetaken > 100) {
					test.log(Status.FAIL, " There is an issue with Model execution,it is taking much for execution");
					break;
				}

			}

			System.out.println(this.ModelExecutionButtonText.getText());
			for (WebElement el : ModelExecutionResult) {
				if (el.getText().equals("Execution Error")) {
					test.log(Status.FAIL, " The Model execution is failed");
					System.out.println(el.getText());
					CM.OKButton.click();
					break;
				} else if (el.getText().equals("Execution Completed")) {
					System.out.println(el.getText());
					test.log(Status.PASS, " The Model execution is completed successfully");
				}

			}

		} catch (Exception e) {
			System.out.println("There is an issue with model execution");
			driver.close();
		}
	}

}
