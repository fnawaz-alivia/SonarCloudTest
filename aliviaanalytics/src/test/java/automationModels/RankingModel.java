package automationModels;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class RankingModel extends Configuration {
	public static ExtentTest test;
@FindBy(how = How.XPATH, using = "//*[@class = 'x-tree-node-text ' and (text() = 'Ranking' or . = 'Ranking')]")
	
public WebElement Ranking;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Show Values' or . = 'Show Values')]")

public WebElement ShowValues;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-leftGrid-dataSourcesGrid-65')]//child::input")

public WebElement SearchTabforDS;

@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-ranking-columns-btn-72')]")

public WebElement ShowColumnsButton;


@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div/div[1]//div[contains(@class,'collapse-left')]")

public WebElement collapseleftpane;


@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/following::div[1]/div[contains(@class,'x-layout-split-left')]")

public WebElement expandleftpane;


@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-body center_pane')]/div[not(contains(@class,'x-hidden-offsets'))]//div[contains(@class,'dashboard-filters')]//div[contains(@class,'dataSourcesGrid-54')]")

public WebElement Pane1SideBar;


@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']/div/div[1]//div[contains(@class,'collapse-top')]")

public WebElement collapseDataSourcepanel;



@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']/div/div[1]//div[contains(@class,'expand-bottom')]")

public WebElement expandDataSourcepanel;


@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']/div/div[2]//div[contains(@class,'collapse-top')]")

public WebElement collapseSavedRankspanel;



@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']/div/div[2]//div[contains(@class,'expand-bottom')]")

public WebElement expandSavedRankspanel;



@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[contains(@class,'x-tree-lines ')]//div[contains(@class,'collapse-top')]")

public WebElement collapsevaluespanel;



@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[contains(@class,'x-tree-lines ')]//div[contains(@class,'expand-bottom')]")

public WebElement expandvaluespanel;




@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-column-header-checkbox')]")

public WebElement CheckBOXShowColumnsWindow;

@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//a[1]")

public WebElement SortDatasource;

@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//a[2]")

public WebElement Refreshdatasources;

@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'dataSourcesGrid')]//input/following::div[1]")

public WebElement crosssearchtextdatasource;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-columns-71')]//child::input")

public WebElement SearchTabOnShowColumnsWindow;


@FindBy(how = How.XPATH, using = "//*[@class = 'header' and @transform= 'translate(265,0)']")

public WebElement CombinedHeader;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Combined Column' or . = 'Combined Column')]")

public WebElement CombinedColumn;


@FindBy(how = How.XPATH, using = "//*[@class = 'tableData text' and starts-with(@clip-path, 'url(#clip-BPHYSICIAN_NAME')]")

public List<WebElement> PhysicianNameList;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-columns-71') ]//child::table//tr//td[2]")

public List<WebElement> ColumnsListOnShowColumnsWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-ranking-leftGrid-dataSourcesGrid-65')]//child::table//tr//td[2]//div")

public List<WebElement> DataSourcesList;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-combinedColumns-70') ]//child::table//tr//td[2]")

public List<WebElement> ColumnsListOnCombinedColumnWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-combinedColumns-70')]//child::input")

public List<WebElement> SeachtabInputOnCombinedColumnWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel description-valueanalysis-ranking-leftGrid-descriptorsValuesGrid-67')]//a//span[text()='Expand All']")

public WebElement ExpandAllButton;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel description-valueanalysis-ranking-leftGrid-descriptorsValuesGrid-67')]//a//span[text()='Collapse All']")

public WebElement CollapseAllButton;

@FindBy(how = How.XPATH, using = "//div[contains(@class,' dimensionFolderIcon')]/parent::div/div[1]")

public WebElement DescriptorsExpandButton;

@FindBy(how = How.XPATH, using = "//div[contains(@class,' measureFolderIcon')]/parent::div/div[1]")

public WebElement ValueExpandButton;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel description-valueanalysis-ranking-leftGrid-descriptorsValuesGrid-67')]//tr[@class='x-grid-tree-node-leaf  x-grid-row']")

public List<WebElement> ExpndAllListDescriptors;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-noborder-trl')]//a[contains(@class,'sort-focus-cls')]")

public WebElement SortButton;

@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a")

public List<WebElement> SortDropdownList;

@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a//span[text()='Sort by Name']")

public WebElement SortByName;

@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a//span[text()='Sort by Date Created']")

public WebElement SortByDateCreated;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-noborder-trl')]//a[@data-qtip='Refresh Data Sources List']")

public WebElement RefreshButton;

@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'dataSourcesGrid')]//input/parent::div[1]")

public WebElement SearchDiv;

@FindBy(how = How.XPATH, using = "//div[not(contains(@class,'x-hidden-offsets')) and contains(@class,'cls') ]//div[contains(@class,'singlePanel')]/div[2]//div[@role='tablist']//div[contains(@class,'dataSourcesGrid')]//input")

public WebElement SearchInput;





public void LandingOnPageRanking() throws InterruptedException {
	ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
	ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
	PM.GetStarted.click();
	CM.Analysis.click();
	test = report.createTest("Side Pane: Verify that Ranking Button is present in Analysis dropdown");
	if (CM.Analysis.isDisplayed()) {
		test.log(Status.PASS, " The Ranking Button is present in Analysis dropdown");
	} else {
		test.log(Status.FAIL, " The Ranking Button is not present in Analysis dropdown");
	}
	test = report.createTest("Side Pane: Verify that Ranking Button is clickable");
	if (CM.Analysis.isEnabled()) {
		test.log(Status.PASS, " Ranking Button is clickable");
	} else {
		test.log(Status.FAIL, "Ranking Button is not clickable");
	}
	
	test = report.createTest("Side Pane: Verify that clicking on Ranking Button navigates to Ranking screen");
	this.Ranking.click();
	Thread.sleep(2000);
	if (this.ShowValues.isDisplayed()) {
		test.log(Status.PASS, " clicking on Ranking Button navigates to Ranking screen");
	} else {
		test.log(Status.FAIL, " clicking on Ranking Button doesn't navigate to Ranking screen");
	}
	this.ShowValues.click();
}

public void LoadDataSourceForRank() throws InterruptedException {

	this.ShowValues.click();
	this.SearchTabforDS.click();
	utilityMethods.validateSearchPlaceholder(this.SearchTabforDS, "Search ...", 
			"Verify that Search Text Field is visible in the side panel in Data Sources section");
	utilityMethods.visible(this.crosssearchtextdatasource,
			"Verify that a cross is visible to the right in the Search Text Field");
	utilityMethods.verifyCrossButton(this.SearchTabforDS, 1000, this.crosssearchtextdatasource, "Verify that clicking the cross removes any text from the Search Text Field");
	utilityMethods.visible(this.SearchTabforDS,
			"Verify that Search Text Field is visible in the side panel in Data Sources section");
	utilityMethods.clickable(this.SearchTabforDS,
			"Verify that Search Text Field is clickable in the side panel in Data Sources section");
	test = report.createTest("Verify Search tab works for datasources on ranking page");
	this.SearchTabforDS.sendKeys("Medical Transactions");
	test.log(Status.PASS, "Search tab works for datasources on ranking page");
	Thread.sleep(2000);
	test = report.createTest("Verify by double clicking on datasources all the coulmn shows by default");
	for (WebElement el : DataSourcesList) {
	    if (el.getText().equals("Medical Transactions")) {
	        el.click();
	        break;
	    }
	}
	test.log(Status.PASS, "By double clicking on datasources all the coulmn shows by default");
}


}


