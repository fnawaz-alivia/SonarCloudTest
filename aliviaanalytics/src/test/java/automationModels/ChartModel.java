package automationModels;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class ChartModel extends Configuration {

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

	public int CountSavedChart() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.Analysis.click();
		this.Charting.click();
		this.ClickonROW.click();
		this.SavedCharts.click();
		this.SavedChartsList.size();

		return this.SavedChartsList.size();
	}
	
	public int VerifyChartSaved(String SavedChart) throws InterruptedException {
		
		this.SavedCharts.click();
		this.SearchTabSavedChartsGrid.sendKeys(SavedChart);
		Thread.sleep(2000);
		this.SavedChartsList.size();

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
		this.BubbleGroup.click();
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
	
	public void CreateBarHorizontalChart(String chartName) throws InterruptedException {

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
		this.chartBarHorizontal.click();
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
		this.ChartDrillDownBarChart.click();
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
		this.ChartPie.click();
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
		this.ChartScatter.click();
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
		this.ChartLine.click();
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
		this.ChartLineStack.click();
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
		this.ChartDrillDownLineGroupChart.click();
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
		this.ChartLineGroup.click();
		this.ClosedialogChartPalette.click();
		this.SaveButton.click();
		this.InputName.sendKeys(chartName);
		this.OKButton.click();
		utilityMethods.waitForVisibility(this.OKButton);
		this.OKButton.click();	
	}
		

}
