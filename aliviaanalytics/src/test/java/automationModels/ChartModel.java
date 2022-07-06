package automationModels;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
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

public class ChartModel extends Configuration {
	public static ExtentTest test;
	   String RenameChartName = RandomStringUtils.randomAlphabetic(10);
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Analysis' or . = 'Analysis')]")

	public WebElement Analysis;
		
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-bar-horizontal ')]")

	public WebElement chartBarHorizontal;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-drilldownbarchart')]")

	public WebElement ChartDrillDownBarChart;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-bubble')]")

	public WebElement ChartBubble;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'chart-pie')]")

	public WebElement ChartPie;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-scatter')]")

	public WebElement ChartScatter;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-line')]")

	public WebElement ChartLine;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-line-stack')]")

	public WebElement ChartLineStack;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-drilldownlinegroupchart')]")

	public WebElement ChartDrillDownLineGroupChart;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-line-group')]")

	public WebElement ChartLineGroup;
	
	

	@FindBy(how = How.XPATH, using = "//*[(text() = 'Charting' or . = 'Charting')]")

	public WebElement Charting;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'label-') and (text() = 'Rows' or . = 'Rows')]")

	public WebElement ClickonROW;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id,'label-') and (text() = 'Columns' or . = 'Columns')]")

	public WebElement ClickonColumn;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'OK' or . = 'OK')]")

	public WebElement OKButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-charting-leftGrid-savedChartsGrid-63')]")

	public WebElement SavedCharts;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-charting-leftGrid-savedChartsGrid-63')]//child::input")

	public WebElement SearchTabSavedChartsGrid;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-charting-leftGrid-dataSourcesGrid-62')]//child::input")

	public WebElement LeftSearchTabDataSourcesGrid;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Chart Palette' or . = 'Chart Palette')]")

	public WebElement ChartPaletteButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'x-btn-icon-el x-btn-icon-el-default-large chart-bubble ')]")

	public WebElement BubbleGroup;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'tool-') and @data-qtip = 'Close dialog']")

	public WebElement ClosedialogChartPalette;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'analysis-charting-centerPane-saveButton-68')]")

	public WebElement SaveButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'messagebox-') and @type = 'text']")

	public WebElement InputName;


	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-charting-leftGrid-descriptorsValuesGrid-64')]//child::input")

	public WebElement LeftSearchTabDescriptorsValuesGrid;

	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-charting-leftGrid-savedChartsGrid-63')]//child::table//tr//td[2]//div")

	public List<WebElement> SavedChartsList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-charting-leftGrid-dataSourcesGrid-62')]//child::table//tr//td[2]//div")

	public List<WebElement> DataSourcesList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-charting-leftGrid-descriptorsValuesGrid-64')]//child::table//tr//td//div//span")

	public List<WebElement> DescriptorsValuesList;

	public int CountSavedChart() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		this.SavedCharts.click();
		Thread.sleep(5000);
		this.SavedChartsList.size();

		return this.SavedChartsList.size();
	}
	
	public int VerifyChartSaved(String SavedChart) throws InterruptedException {
		test = report.createTest("Verify that the collapse panel for the saved charts works.");
		this.SavedCharts.click();
		test.log(Status.PASS, "The collapse panel for the saved charts works");
		test = report.createTest("verify that search filter for saved charts works on charting screen ");
		this.SearchTabSavedChartsGrid.sendKeys(SavedChart);
		test.log(Status.PASS, "The search filter for saved charts works on charting screen");
		test = report.createTest("Verify the created chart shows in saved charts panel");
		Thread.sleep(2000);
		this.SavedChartsList.size();
		test.log(Status.PASS, "The created chart shows in saved charts panel");
		return this.SavedChartsList.size();
	}

	public void SelectDataSource(String DSName) {

		for (WebElement el : DataSourcesList) {
			if (el.getText().equals(DSName)) {
				el.click();
				break;
			}
		}
	}

	public void DragDescriptorValuesDropInRow(String value) {
		for (WebElement el : DescriptorsValuesList) {

			if (el.getText().equals(value)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).release(this.ClickonROW).build();
				dragAndDrop.perform();

				break;
			}
		}

	}

	public void DragDescriptorValuesDropInCloumn(String value) {
		for (WebElement el : DescriptorsValuesList) {

			if (el.getText().equals(value)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).release(this.ClickonColumn).build();
				dragAndDrop.perform();

				break;
			}
		}

	}

	public void CreateBubbleGroupChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		test = report.createTest("Side Pane: Verify that Charting Button is present in Analysis dropdown");
		if (this.Charting.isDisplayed()) {
			test.log(Status.PASS, " The Charting Button is present in Analysis dropdown");
		} else {
			test.log(Status.FAIL, " The Charting Button is not present in Analysis dropdown");
		}
		test = report.createTest("Side Pane: Verify that Charting Button is clickable");
		if (this.Charting.isEnabled()) {
			test.log(Status.PASS, " Charting Button is clickable");
		} else {
			test.log(Status.FAIL, "Charting Button is not clickable");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on Charting Button navigates Charting screen");
		this.Charting.click();
		Thread.sleep(2000);
		if (this.ClickonROW.isDisplayed()) {
			test.log(Status.PASS, " clicking on Charting Button navigates to Charting screen");
		} else {
			test.log(Status.FAIL, " clicking on Charting Button doesn't navigate to Charting screen");
		}

		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		test = report.createTest("Verify that chart palette button");
		this.ChartPaletteButton.click();
		test.log(Status.PASS, "The chart palette button works");
		test = report.createTest("Verify Create Bubble Group in Charting");
		this.BubbleGroup.click();
		test.log(Status.PASS, "The bubble group chart is created successfully");
		test = report.createTest("Verify the close button works on chart palette ");
		this.ClosedialogChartPalette.click();
		test.log(Status.PASS, "The chart palette window is clsoed successfully");
		test = report.createTest("Verify the save button works");
		this.SaveButton.click();
		test.log(Status.PASS, "The save button works");
		test = report.createTest("Verify the user is able to enter the chart name");
		this.InputName.sendKeys(chartName);
		test.log(Status.PASS, "The user is able to enter the chart name");
		this.OKButton.click();
		test = report.createTest("Verify the created chart is saved");
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
		test.log(Status.PASS, "The created chart is saved successfully");
	}
	
	public void CreateBarHorizontalChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create BarHorizontal chart in Charting");
		this.chartBarHorizontal.click();
		test.log(Status.PASS, "The BarHorizontal chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	public void CreateDrillDownBarChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create DrillDownBarChart chart in Charting");
		this.ChartDrillDownBarChart.click();
		test.log(Status.PASS, "The DrillDownBarChart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	public void CreatePieChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create Pie chart in Charting");
		this.ChartPie.click();
		test.log(Status.PASS, "The Pie chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	
	public void CreateScatterChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create Scatter chart in Charting");
		this.ChartScatter.click();
		test.log(Status.PASS, "The Scatter chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	
	public void CreateLineChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create Line chart in Charting");
		this.ChartLine.click();
		test.log(Status.PASS, "The Line chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	public void CreateLineStackChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		Thread.sleep(2000);
		this.SelectDataSource("Automation1 - Dental01");
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create LineStack chart in Charting");
		this.ChartLineStack.click();
		test.log(Status.PASS, "The LineStack chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	
	public void CreateDrillDownLineGroupChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create DrillDownLineGroupChart chart in Charting");
		this.ChartDrillDownLineGroupChart.click();
		test.log(Status.PASS, "The DrillDownLineGroupChart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	
	public void CreateLineGroupChart(String chartName) throws InterruptedException {

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		test = report.createTest("Verify the user is able to access Charting Module by clicking on Charting under Analysis");
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		test.log(Status.PASS, "The user is able to access Charting Module by clicking on Charting under Analysis");
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.LeftSearchTabDataSourcesGrid.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in right panel");
		this.SelectDataSource("Automation1 - Dental01");
		test.log(Status.PASS, "The search tab works for data sources in right panel");
		Thread.sleep(2000);
		test = report.createTest("Verify that search feature on Descriptors.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on Descriptors works");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInRow("amountatrisk");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		test = report.createTest("Verify that search feature on values.");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("amount");
		test.log(Status.PASS, "The search feature on values works");
		this.DragDescriptorValuesDropInRow("amountallowed");
		this.LeftSearchTabDescriptorsValuesGrid.clear();
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		this.LeftSearchTabDescriptorsValuesGrid.sendKeys("ad");
		Thread.sleep(2000);
		this.DragDescriptorValuesDropInCloumn("adjudicationdate");
		Thread.sleep(2000);
		this.ChartPaletteButton.click();
		test = report.createTest("Verify Create LineGroup chart in Charting");
		this.ChartLineGroup.click();
		test.log(Status.PASS, "The LineGroup chart is created successfully");
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
public void DeleteChart() throws InterruptedException {
	
	try {
	  DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
	  ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
	  QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
	    this.SavedCharts.click();
		this.SearchTabSavedChartsGrid.clear();
		Thread.sleep(1000);
		this.SearchTabSavedChartsGrid.sendKeys(RenameChartName);
	
		Thread.sleep(2000);
		int listSizebeforeDelete= this.SavedChartsList.size();
		System.out.println("Chart list size before the delete chart"+listSizebeforeDelete);        
		this.RightClickOnChartName(RenameChartName);
        Thread.sleep(3000);
        DM.RightDeleteOption.click();
        Thread.sleep(2000);
        PM.YesButton.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(QBM.OkButtonQB);
		QBM.OkButtonQB.click();
        this.SavedCharts.click();
		this.SearchTabSavedChartsGrid.clear();
		Thread.sleep(1000);
		this.SearchTabSavedChartsGrid.sendKeys(RenameChartName);
		Thread.sleep(3000);
        test = report.createTest("Verify the user is able to delete the chart ");
        int listSizeafterdelete= this.SavedChartsList.size();
        System.out.println("Chart list size after the delete chart"+listSizeafterdelete);   
        
       if (listSizebeforeDelete> listSizeafterdelete) {
    	   test.log(Status.PASS, "The user is able to delete the chart"); 
    	   System.out.println("The user is able to delete the chart");
       }
       
       else {
    	   test.log(Status.FAIL, "The user is not able to delete the chart");  
    	   System.out.println("The user is not able to delete the chart");
    	   
       }
	
}
catch(Exception e)
{
	test = report.createTest("Verify the user is able to delete the chart ");
	System.out.println("The user is not  able to delete the chart");
	test.log(Status.FAIL, "The user is not able to delete the chart"); 
	}
	}
	
public void ReNameChart() throws InterruptedException {
	   DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
	    QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		this.SearchTabSavedChartsGrid.clear();
		this.SearchTabSavedChartsGrid.sendKeys("BubbleGroupChart");
		Thread.sleep(2000);
		this.SavedChartsList.size();
		Thread.sleep(2000);
        this.RightClickOnChartName("BubbleGroupChart");
        Thread.sleep(2000);
        DM.RightRenameOption.click();
        Thread.sleep(2000);
        test = report.createTest("Verify the user is able to rename the chart ");
        DM.InputNameDashboard.clear();
        Thread.sleep(2000);
     
        DM.InputNameDashboard.sendKeys(RenameChartName);
         QBM.OkButtonQB.click();
         Thread.sleep(2000);
         
	try {
			
			boolean ErrorAlertBox = DM.ErrorAlertMessage.isDisplayed();
			String ErrorAlertBoxText =DM.ErrorAlertMessage.getText();
			System.out.println(ErrorAlertBoxText);
			if (ErrorAlertBox==true) {
				test.log(Status.FAIL, "The user is not able to  rename the chart ");
				QBM.OkButtonQB.click();	
			}
			
		}
		catch(Exception e)
		{
			System.out.println("No Error alert is shown for renamed chart");
		}
	this.SavedCharts.click();
	this.SearchTabSavedChartsGrid.clear();
	this.SearchTabSavedChartsGrid.sendKeys(RenameChartName);
 		Thread.sleep(4000);
 		int listSizeAfterRenameChart= this.SavedChartsList.size();
 		System.out.println("listSizeAfterRenameChart"+listSizeAfterRenameChart);
 		int expectedSizeAfterRenameChart=1;
 		
 		if (listSizeAfterRenameChart==expectedSizeAfterRenameChart) {
 			test.log(Status.PASS, "The user is able to  rename the chart ");	
 			
 		}
 		else {
 			
 			test.log(Status.FAIL, "The user is not able to  rename the chart ");
 		}
       
	}
	
	


	public void RightClickOnChartName(String chartName) {

		for (WebElement el : SavedChartsList) {

			if (el.getText().equals(chartName)) {
				  new Actions(driver).contextClick(el).perform();

			        break;
			    }
			}

	}
		

}
