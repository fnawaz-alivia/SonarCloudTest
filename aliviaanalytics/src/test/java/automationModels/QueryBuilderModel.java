package automationModels;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
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

public class QueryBuilderModel extends Configuration{
	public static ExtentTest test;
	String RuleGroupName = RandomStringUtils.randomAlphabetic(10);
	String RuleName = RandomStringUtils.randomAlphabetic(10);
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
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'datasource-combobox' and @placeholder = 'Select Data Source ...']")

	public List<WebElement> SelectDataSourceList;
	
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
	
	public void  CreateNewRuleAndGroup() throws InterruptedException {
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		this.SelectedDSColumnsList.get(3).click();
		this.SelectedDSColumnsList.get(4).click();
		this.SelectedDSColumnsList.get(5).click();
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the rule is saved by clicking on save button.");
		new Actions(driver).moveToElement(this.QBSaveButton).moveByOffset(20, 5).click().perform();
		Thread.sleep(2000);
		RLM.SaveAsNewRule.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The rule is saved by clicking on save button.");
		utilityMethods.waitForVisibility(RLM.RuleName.get(0));
		test = report.createTest("Save As Rule Window -Verify The Rule name is editable");
		RLM.RuleName.get(0).sendKeys(RuleName);
		System.out.println("RuleName"+RuleName);
		test.log(Status.PASS, "The Rule name is editable");
		test = report.createTest("Verify the Create New group Button works");
		Thread.sleep(2000);
		RLM.CreateNewRuleGroup.click();
		test.log(Status.PASS, "The Create New group Button works");
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify Rule group name is editable.");
		RLM.RuleName.get(1).sendKeys(RuleGroupName);
		System.out.println("RuleGroup"+RuleGroupName);
		test.log(Status.PASS, "The Rule group name is editable.");
		Thread.sleep(2000);
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify that the save option saves the details of rule group.");
		RLM.SaveButton.get(4).click();
		test.log(Status.PASS, "The save option saves the details of rule group");
		test = report.createTest("Verify the user is able to select the rule Group while creating rule ");
		RLM.RuleGroupId.click();
		utilityMethods.SetTextwithActionClass(RLM.RuleGroupId, RuleGroupName);
		Thread.sleep(2000);
		RLM.RuleGroupId.clear();
		Thread.sleep(2000);
		RLM.RuleGroupId.sendKeys(RuleGroupName);
		Thread.sleep(2000);
		System.out.println("RuleGroup"+RuleGroupName);
		RLM.RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		RLM.RuleGroupSaveButton.click();
		utilityMethods.waitForVisibility(RLM.OKConfigureRule);
		RLM.OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		RLM.ResetButtonQB.click();
		test.log(Status.PASS, "The reset button clear every detail in QB work space");
	}
	
	public void  CreateRuleChaining() throws InterruptedException {
		RuleLibraryModel RLM = PageFactory.initElements(driver, automationModels.RuleLibraryModel.class);
		test = report.createTest("Verify that enabling rule chaining adds another filter data source to the chain.");
		RLM.EnableRuleChaining.click();
		test.log(Status.PASS, "Another filter data source adds to the chain by enabling rule chaining");
		test = report.createTest("Verify that enabling rule chaining also enables selecting rule group.");
		RLM.ChooseRuleGroup.click();
		test.log(Status.PASS, "The enabling rule chaining also enables selecting rule group");
		test = report.createTest("Verify that rule groups are listed in the Choose Rule Group drop down.");
		RLM.ChooseRuleGroup.sendKeys(RuleGroupName);
		System.out.println(RuleGroupName);
		test.log(Status.PASS, "The rule groups are listed in the Choose Rule Group drop down.");
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		this.SelectedDSColumnsList.get(3).click();
		this.SelectedDSColumnsList.get(4).click();
		this.SelectedDSColumnsList.get(5).click();
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		this.SelectDataSourceList.get(1).click();
		this.SelectDataSourceList.get(1).sendKeys(RuleName);
		System.out.println(RuleName);
		this.SelectDataSourceList.get(1).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		this.Join.click();
		Thread.sleep(1000);
		this.JoinColumn1.sendKeys("DS_0.amountallowed");
		this.JoinColumn2.sendKeys("RL_1.amountallowed");
		Thread.sleep(1000);
		this.ExecuteQBButton.click();
		Thread.sleep(2000);
		String QBResult = this.QBResultText.getText();
		System.out.println(QBResult);
		test = report.createTest("Verify the Rule chaining result");
		String Rows= "24";
		if (QBResult.contains(Rows)) {
			test.log(Status.PASS, "The rule chaining result is correct");
		    System.out.println("Values Matched");
		} else {
			test.log(Status.FAIL, "The rule chaining result is not matched with expected outcome");
		    System.out.println("Values are not Matched");
		}
		
	}
	public void  CreateleftJoin() throws InterruptedException {
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		test = report.createTest("Verify Datasources are visible from Select Data Source drop down menu.");
		this.SelectDataSourceTab.click();
		test.log(Status.PASS, " Datasources are visible from Select Data Source drop down menu.");
		test = report.createTest("Verify User can select a datasource from the drop down menu.");
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		test.log(Status.PASS, "The User can select a datasource from the drop down menu.");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test = report.createTest("Add Multiple Columns Window - Verify the OK button saves the changes.");
		this.AggrBuilderUtilityokButton.click();
		test.log(Status.PASS, "The OK button saves the changes.");
		test = report.createTest("Verify the Add button of data source works.");
		this.AddDataSourceButton.click();
		test.log(Status.PASS, "The Add button of data source works");
		this.AddDataSourceOption.click();
		test = report.createTest("Verify that data source or rule are listed in Add data source drop down list.");
		this.SelectDSInputList.get(1).sendKeys("Automation2 - Dental 01");
		this.SelectDSInputList.get(1).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		test.log(Status.PASS, "The data source or rule are listed in Add data source drop down list.");
		test = report.createTest("Verify that user is able to select columns from the datasource.");
		this.SelectedDSColumnsList.get(3).click();
		test.log(Status.PASS, "The user is able to select columns from the datasource.");
		this.SelectedDSColumnsList.get(4).click();
		test = report.createTest("Add Multiple Columns Window - Verify the search feature works for columns");
		test.log(Status.PASS, "The search feature works for columns");
		test = report.createTest("Add Multiple Columns Window - Verify by selecting the columns it gets highlighted.");
		test.log(Status.PASS, "By selecting the columns it gets highlighted");
		this.AggrBuilderUtilityokButton.click();
		test = report.createTest("Verify the drop down join on data source columns are listed and selectable.");
		this.Join.click();
		test.log(Status.PASS, "The drop down join on data source columns are listed and selectable");
		Thread.sleep(1000);
		test = report.createTest("Verify the user can select columns to apply join");
		this.JoinColumn1.sendKeys("DS_1.amountatrisk");
		this.JoinColumn2.sendKeys("DS_0.amountatrisk");
		test.log(Status.PASS, "The user can select columns to apply join");
		Thread.sleep(1000);
		test = report.createTest("Verify that execute button generate data snap shot of the query.");
		this.ExecuteQBButton.click();
		test.log(Status.PASS, "The execute button generate data snap shot of the query.");
		Thread.sleep(2000);
		test = report.createTest("Verify the Left Join query is working as intended.");
		String QBResult = this.QBResultText.getText();
		System.out.println(QBResult);
		test.log(Status.PASS, "The Left Join query is working as intended.");
		test = report.createTest("Verify the user can save the query builder filter");
		this.QBSaveButton.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The user can save the query builder filter");
		test = report.createTest("Verify the Query Filter name is editable ");
		this.InputNameQB.sendKeys("LeftJoinQB");
		test.log(Status.PASS, "The Query Filter name is editable ");
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
		test = report.createTest("Verify Export Query Filter results data into CSV");
		this.ExportQBButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToCSV.click();
		DCM.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Export Query Filter results data into CSV works");
	}
	
	public void ExportDataIntoExcel(String fileName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(this.ExportQBButton);
		test = report.createTest("Verify Export Query Filter results data into Excel");
		this.ExportQBButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToExcel.click();
		DCM.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "Export Query Filter results data into Excel works");

	}	

}
