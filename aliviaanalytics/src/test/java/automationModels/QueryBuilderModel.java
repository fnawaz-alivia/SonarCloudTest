package automationModels;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class QueryBuilderModel extends Configuration{
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Query Builder' or . = 'Query Builder')]")

	public WebElement QueryBuilder;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Join' or . = 'Join')]")

	public WebElement Join;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[7]")

	public WebElement ExecuteQBButton;

	@FindBy(how = How.XPATH, using = "	//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'aggregation-row-options-combobox-column1' and @placeholder = 'Join Column 1']")

	public WebElement JoinColumn1;
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'aggregation-row-options-combobox-column2' and @placeholder = 'Join Column 2']")

	public WebElement JoinColumn2;
	@FindBy(how = How.XPATH, using = "//*[@id = 'folder-tree-bodyWrap']//child::input")

	public WebElement SearchTabQB;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'datasource-combobox' and @placeholder = 'Select Data Source ...']")

	public WebElement SelectDataSourceTab;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dataRepo-queryBuilder-AggrBuilderUtility-okButton-018')]")

	public WebElement AggrBuilderUtilityokButton;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'dataRepo-queryBuilder-datasourceMainPane-saveButton-015')]")

	public WebElement QBSaveButton;
	
	@FindBy(how = How.XPATH, using = " //*[@id='querybuilder-winCreateNode-bodyWrap']//child::input")

	public WebElement InputNameQB;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]")

	public WebElement QBResultText;
		
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-btn btn-save x-unselectable x-box-item x-toolbar-item x-btn-default-small']")

	public WebElement SaveQBFilterName;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'OK' or . = 'OK')]")

	public WebElement OkButtonQB;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'criteria-andor-combobox']")

	public WebElement DropDownListForJoin;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Inner Join' or . = 'Inner Join')]")

	public WebElement InnerJoin;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and @class = 'x-btn-wrap x-btn-wrap-default-small x-btn-arrow x-btn-arrow-right' and (text() = ' ' or . = ' ')]")

	public WebElement AddDataSourceButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-querybuilder-aggrEditor-dataSourceMainPane-exportButton-044')]")

	public WebElement ExportQBButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Add Data Source' or . = 'Add Data Source')]")

	public WebElement AddDataSourceOption;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dataRepo-queryBuilder-querybuilderMain-leftPaneGrid-016') ]//preceding::table[1]//td[2]")

	public List<WebElement> QBList;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id,'combo-') and @type ='text' and @name ='datasource-combobox' and @placeholder ='Select Data Source ...']")

	public List<WebElement> SelectDSInputList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataRepo-queryBuilder-AggrBuilderUtility-gridPanel-017') ]//preceding::table[1]//tr//td[1]")

	public List<WebElement> SelectedDSColumnsList;
	
	
	public void LandingOnQueryBuilderPage() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		Thread.sleep(2000);
		this.QueryBuilder.click();
		Thread.sleep(2000);
	}
	
	public int CountQB() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		Thread.sleep(2000);
		this.QueryBuilder.click();
		Thread.sleep(2000);
		this.SelectDataSourceTab.click();
		Thread.sleep(1000);
		this.SearchTabQB.sendKeys("AutoCreatedQB");
		Thread.sleep(2000);
		return this.QBList.size();
	}
	
	public void  CreateQueryBuilder() throws InterruptedException {
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Medical Transactions");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		this.SelectedDSColumnsList.get(3).click();
		this.SelectedDSColumnsList.get(4).click();
		this.SelectedDSColumnsList.get(5).click();
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		new Actions(driver).moveToElement(this.QBSaveButton).moveByOffset(-10, 0).click().perform();
		Thread.sleep(2000);
		this.InputNameQB.sendKeys("AutoCreatedQB");
		utilityMethods.waitForVisibility(this.SaveQBFilterName);
		this.SaveQBFilterName.click();
		utilityMethods.waitForVisibility(this.OkButtonQB);
		this.OkButtonQB.click();
	}
	
	public void  CreateleftJoin() throws InterruptedException {
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.AggrBuilderUtilityokButton.click();
		this.AddDataSourceButton.click();
		this.AddDataSourceOption.click();
		this.SelectDSInputList.get(1).sendKeys("Automation2 - Dental 01");
		this.SelectDSInputList.get(1).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.SelectedDSColumnsList.get(3).click();
		this.SelectedDSColumnsList.get(4).click();
		this.AggrBuilderUtilityokButton.click();
		this.Join.click();
		Thread.sleep(1000);
		this.JoinColumn1.sendKeys("DS_1.amountatrisk");
		this.JoinColumn2.sendKeys("DS_0.amountatrisk");
		Thread.sleep(1000);
		this.ExecuteQBButton.click();
		Thread.sleep(2000);
		String QBResult = this.QBResultText.getText();
		System.out.println(QBResult);
		this.QBSaveButton.click();
		Thread.sleep(2000);
		this.InputNameQB.sendKeys("LeftJoinQB");
		utilityMethods.waitForVisibility(this.SaveQBFilterName);
		this.SaveQBFilterName.click();
		utilityMethods.waitForVisibility(this.OkButtonQB);
		this.OkButtonQB.click();
	}
	
	public void  CreateInnerJoin() throws InterruptedException {
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.AggrBuilderUtilityokButton.click();
		this.AddDataSourceButton.click();
		this.AddDataSourceOption.click();
		this.SelectDSInputList.get(1).sendKeys("Automation2 - Dental 01");
		this.SelectDSInputList.get(1).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.SelectedDSColumnsList.get(3).click();
		this.SelectedDSColumnsList.get(4).click();
		this.AggrBuilderUtilityokButton.click();
		this.Join.click();
		Thread.sleep(1000);
		this.DropDownListForJoin.click();
		Thread.sleep(1000);
		this.InnerJoin.click();
		this.JoinColumn1.sendKeys("DS_1.amountatrisk");
		this.JoinColumn2.sendKeys("DS_0.amountatrisk");
		Thread.sleep(1000);
		this.ExecuteQBButton.click();
		Thread.sleep(2000);
		String QBResult = this.QBResultText.getText();
		System.out.println(QBResult);
		this.QBSaveButton.click();
		Thread.sleep(2000);
		this.InputNameQB.sendKeys("InnerJoinQB");
		utilityMethods.waitForVisibility(this.SaveQBFilterName);
		this.SaveQBFilterName.click();
		utilityMethods.waitForVisibility(this.OkButtonQB);
		this.OkButtonQB.click();
	}
	
	
	public void ExportDataIntoCSV(String fileName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);	
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(this.ExportQBButton);
		this.ExportQBButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToCSV.click();
		DCM.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
	}
	
	public void ExportDataIntoExcel(String fileName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(this.ExportQBButton);
		this.ExportQBButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToExcel.click();
		DCM.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);

	}	

}
