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
	String RuleGroupName = utilityMethods.randomString(10);
	String RuleName = utilityMethods.randomString(10);
	
	
	@FindBy(how = How.XPATH, using = "//table[(text() = 'Query Builder' or . = 'Query Builder')]")

	public WebElement QueryBuilder;
	
	@FindBy(how = How.XPATH, using = "//a[(text() = 'Query Builder' or . = 'Query Builder')]")

	public WebElement QueryBuilderBreadCrumb;
	
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
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[@class='x-column-header-checkbox']")

	public WebElement SelectAllColumnsOfDS;
	
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
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Save As New Rule' or . = 'Save As New Rule')]")

	public WebElement SaveAsNewRule;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[@type = 'text' and @name = 'name']")

	WebElement RuleNameInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//*[text()='Save']")

	WebElement RuleSaveButton;	
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Create New Rule Group' or . = 'Create New Rule Group')]")

	WebElement CreateNewRuleGroup;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'create-rule-group')]//*[@type = 'text' and @name = 'name']")

	WebElement RuleGroupNameInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'create-rule-group')]//*[text()='Save']")

	WebElement RuleGroupSaveButton;	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo') and @type = 'text' and @name = 'groupId']")
 
	WebElement RuleGroupId;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'OK' or . = 'OK')]")

	WebElement OKConfigureRule;
	
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Advanced Options' or . = 'Advanced Options')]")

	WebElement AdvancedOptions;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Force re-run chained rule to produce fresh results' or . = 'Force re-run chained rule to produce fresh results')]")

	WebElement Forcererunchainedruletoproducefreshresults;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Maintain All Execution Results' or . = 'Maintain All Execution Results')]")

	WebElement MaintainAllExecutionResults;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Save Result into following Data Source' or . = 'Save Result into following Data Source')]")

	WebElement SaveResultintofollowingDataSource;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @name = 'dataSourceName']")

	WebElement outputdataSourceName;
	
	
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepository-queryBuilder-tBar-resetAll-btn-73')]")

	WebElement ResetButtonQB;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Enable Rule Chaining' or . = 'Enable Rule Chaining')]")

	WebElement EnableRuleChaining;
	

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and starts-with(@name, 'combo-') and @placeholder = 'Choose Rule Group ...']")

	WebElement ChooseRuleGroup;
	
	
	
	
	public void LandingOnQueryBuilderPage()  {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		utilityMethods.time(2000);
		utilityMethods.visible(this.QueryBuilder, 
				"Side Pane:Verify that Query Builder Button is present in Data Repository dropdown");
		utilityMethods.clickable(this.QueryBuilder,
				"Side Pane: Verify that Quey Builder Button is clickable");
		utilityMethods.clicked_elementVisible(this.QueryBuilder, 2000, this.SelectDataSourceTab,
				"Side Pane: Verify that clicking on Query Builder Button navigates to 'Query Builder' screen");
		utilityMethods.time(2000);
		this.SelectDataSourceTab.click();
		
	
	}
	public void verifySaveQueryFilterPanel() {
		
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.visible(DCM.SearchFieldSidePanel,
				"Side Pane: Verify that Saved Query Filters Search Text Field is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.SearchFieldSidePanel,
				"Side Pane: Verify that Saved Query Filters Search Text Field is clickable on 'Query Builder' screen");
		utilityMethods.senKeys_Input(DCM.SearchFieldSidePanel, 100, "includeChar",
				"Side Pane: Verify that Saved Query Filters Search Text Field lets users input alphabets, numbers and special characters on 'Query Builder' screen");
		utilityMethods.validateSearchList(DCM.SearchFieldSidePanel, DCM.TreeListSidePanel,utilityMethods.randomString(1),
				"Side Pane: Verify that users can search saved rules using the Search Text Field.");
		utilityMethods.visible(DCM.SearchFieldCrossButtonSidePanel, 
				"Side Pane: Verify that cross button is present in Search Text Field on 'Query Builder' screen");
		utilityMethods.verifyCrossButton(DCM.SearchFieldSidePanel, 100, DCM.SearchFieldCrossButtonSidePanel, 
				"Side Pane: Verify that cross button clears the text in Search Text Field on 'Query Builder' screen");
		utilityMethods.validateSearchPlaceholder(DCM.SearchFieldSidePanel, "Search",
				"Side Pane: Verify that Search text present by default in Search Text Field on 'Query Builder' screen");
		utilityMethods.visible(DCM.CreateFolderButtonSidePanel, 
				"Side Pane: Verify that Create New Folder Button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CreateFolderButtonSidePanel, 
				"Side Pane: Verify that Create New Folder Button is clickable on 'Query Builder' screen");
		utilityMethods.list_Visible(DCM.CreateFolderButtonSidePanel, 100, DCM.CreateNewFolderScreen,
				"Side Pane: Verify that 'Create New Folder' popup appears when click on Create New Folder button on 'Query Builder' screen");
		utilityMethods.visible(DCM.CreateNewFolderTextField,
				"Create New Folder: Verify that 'Folder Name' Text Field is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CreateNewFolderTextField,
				"Create New Folder: Verify that 'Folder Name' Text Field is clickable on 'Query Builder' screen");
		utilityMethods.senKeys_Input(DCM.CreateNewFolderTextField,100,"includeChar",
				"Create New Folder: Verify that 'Folder Name' Text Field allow user to input alpahbets, numeric and special characters on 'Query Builder' screen");
		utilityMethods.verifyCropSpacesForSidePanel(DCM.CreateNewFolderTextField, DCM.SaveButton, DCM.CreateNewFolderScreen, DCM.SearchFieldSidePanel, DCM.CreatedFolderListSidePanel, " CropSpaceBT",
				"Create New Folder: Verify that 'Folder Name' Text Field doesn't save invalid data when click on it on 'Query Builder' screen");
		utilityMethods.visible(DCM.RefreshButtonSidePanel, 
				"Side Pane: Verify that Refresh button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.RefreshButtonSidePanel, 
				"Side Pane: Verify that Refresh button is clickable on 'Query Builder' screen");
		utilityMethods.list_Visible(DCM.RefreshButtonSidePanel, 0, DCM.RefreshButtonLoadingSidePanel, 
				"Side Pane: Verify that Refresh button reload the filter list when click it on 'Query Builder' screen");
		utilityMethods.visible(DCM.ExpandAllButtonSidePanel, 
				"Side Pane: Verify that Expand All button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.ExpandAllButtonSidePanel, 
				"Side Pane: Verify that Expand All button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.ExpandAllButtonSidePanel, 200, DCM.CollapseAllButtonSidePanel, 
				"Side Pane: Verify that Expand All button converts to Collapse All button when click it on 'Query Builder' screen");
		
		// Need to add Test Case for List Collapse //
		
		utilityMethods.visible(DCM.CollapseAllButtonSidePanel, 
				"Side Pane: Verify that Collapse All button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CollapseAllButtonSidePanel, 
				"Side Pane: Verify that Collapse All button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.CollapseAllButtonSidePanel, 200, DCM.ExpandAllButtonSidePanel, 
				"Side Pane: Verify that Collapse All button converts to Expand All button when click it on 'Query Builder' screen");
		
		// Need to add Test Case for List Expand //
		
		utilityMethods.visible(DCM.CollapsePanelButtonSidePanel,
				"Side Pane: Verify that Collapse Panel button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CollapsePanelButtonSidePanel,
				"Side Pane: Verify that Collapse Panel button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.CollapsePanelButtonSidePanel, 500, DCM.ExpandPanelButtonSidePanel, 
				"Side Pane: Verify that Collapse Panel button converts into Expand Panel button when click it on 'Query Builder' screen");
		
		utilityMethods.visible(DCM.ExpandPanelButtonSidePanel,
				"Side Pane: Verify that Expand Panel button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.ExpandPanelButtonSidePanel,
				"Side Pane: Verify that Expand Panel button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.ExpandPanelButtonSidePanel, 500, DCM.CollapsePanelButtonSidePanel, 
				"Side Pane: Verify that Expand Panel button converts into Collapse Panel button when click it on 'Query Builder' screen");
		
		
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
		SaveAsNewRule.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The rule is saved by clicking on save button.");
		utilityMethods.waitForVisibility(RuleNameInput);
		test = report.createTest("Save As Rule Window -Verify The Rule name is editable");
		RuleNameInput.sendKeys(RuleName);
		System.out.println("RuleName"+RuleName);
		test.log(Status.PASS, "The Rule name is editable");
		test = report.createTest("Verify the Create New group Button works");
		Thread.sleep(2000);
		CreateNewRuleGroup.click();
		test.log(Status.PASS, "The Create New group Button works");
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify Rule group name is editable.");
		RuleGroupNameInput.sendKeys(RuleGroupName);
		System.out.println("RuleGroup"+RuleGroupName);
		test.log(Status.PASS, "The Rule group name is editable.");
		Thread.sleep(2000);
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify that the save option saves the details of rule group.");
		RuleGroupSaveButton.click();
		test.log(Status.PASS, "The save option saves the details of rule group");
		test = report.createTest("Verify the user is able to select the rule Group while creating rule ");
		RuleGroupId.click();
		utilityMethods.SetTextwithActionClass(RuleGroupId, RuleGroupName);
		Thread.sleep(2000);
		RuleGroupId.clear();
		Thread.sleep(2000);
		RuleGroupId.sendKeys(RuleGroupName);
		Thread.sleep(2000);
		System.out.println("RuleGroup"+RuleGroupName);
		RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		RuleSaveButton.click();
		utilityMethods.waitForVisibility(OKConfigureRule);
		OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		ResetButtonQB.click();
		test.log(Status.PASS, "The reset button clear every detail in QB work space");
	}
	
	public void  CreateRuleChaining() throws InterruptedException {
		
		test = report.createTest("Verify that enabling rule chaining adds another filter data source to the chain.");
		EnableRuleChaining.click();
		test.log(Status.PASS, "Another filter data source adds to the chain by enabling rule chaining");
		test = report.createTest("Verify that enabling rule chaining also enables selecting rule group.");
		ChooseRuleGroup.click();
		test.log(Status.PASS, "The enabling rule chaining also enables selecting rule group");
		test = report.createTest("Verify that rule groups are listed in the Choose Rule Group drop down.");
		ChooseRuleGroup.sendKeys(RuleGroupName);
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
	
public void  CreateNewRuleAndGroupForInitiative() throws InterruptedException {
		
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		this.SelectAllColumnsOfDS.click();
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the rule is saved by clicking on save button.");
		new Actions(driver).moveToElement(this.QBSaveButton).moveByOffset(20, 5).click().perform();
		Thread.sleep(2000);
		SaveAsNewRule.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The rule is saved by clicking on save button.");
		utilityMethods.waitForVisibility(RuleNameInput);
		test = report.createTest("Save As Rule Window -Verify The Rule name is editable");
		String randomint = RandomStringUtils.randomNumeric(3);
		String NewRuleName = "Output_Fake_Claims_Rule"+randomint;
		RuleNameInput.sendKeys(NewRuleName);
		System.out.println("RuleName"+NewRuleName);
		test.log(Status.PASS, "The Rule name is editable");
		test = report.createTest("Verify the Create New group Button works");
		Thread.sleep(2000);
		CreateNewRuleGroup.click();
		test.log(Status.PASS, "The Create New group Button works");
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify Rule group name is editable.");
		String NewRuleGroupName = "Fake_Dental_RuleGroup"+randomint;
		RuleGroupNameInput.sendKeys(NewRuleGroupName);
		System.out.println("RuleGroup"+NewRuleGroupName);
		test.log(Status.PASS, "The Rule group name is editable.");
		Thread.sleep(2000);
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify that the save option saves the details of rule group.");
		RuleGroupSaveButton.click();
		test.log(Status.PASS, "The save option saves the details of rule group");
		test = report.createTest("Verify the user is able to select the rule Group while creating rule ");
		RuleGroupId.click();
		Thread.sleep(2000);
		RuleGroupId.sendKeys(NewRuleGroupName);
		Thread.sleep(2000);
		System.out.println("RuleGroup"+NewRuleGroupName);
		RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		AdvancedOptions.click();
		this.Forcererunchainedruletoproducefreshresults.click();
		this.MaintainAllExecutionResults.click();
		this.SaveResultintofollowingDataSource.click();
		String DSName = "Output_Fake_"+randomint+"_Claims";
		System.out.println(DSName);
		this.outputdataSourceName.sendKeys(DSName);
		RuleSaveButton.click();
		utilityMethods.waitForVisibility(OKConfigureRule);
		OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		ResetButtonQB.click();
		test.log(Status.PASS, "The reset button clear every detail in QB work space");
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys("Automation1 - Dental01");
		this.SelectDataSourceTab.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		this.SelectAllColumnsOfDS.click();
		this.AggrBuilderUtilityokButton.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the rule is saved by clicking on save button.");
		new Actions(driver).moveToElement(this.QBSaveButton).moveByOffset(20, 5).click().perform();
		Thread.sleep(2000);
		SaveAsNewRule.click();
		Thread.sleep(2000);
		test.log(Status.PASS, "The rule is saved by clicking on save button.");
		utilityMethods.waitForVisibility(RuleNameInput);
		test = report.createTest("Save As Rule Window -Verify The Rule name is editable");
		String NewRuleName1 = "Output_Fake_RiskScores_Rule"+randomint;
		RuleNameInput.sendKeys(NewRuleName1);
		System.out.println("RuleName"+NewRuleName1);
		test.log(Status.PASS, "The Rule name is editable");
		test = report.createTest("Verify the Create New group Button works");
		Thread.sleep(2000);
		RuleGroupId.click();
		RuleGroupId.sendKeys(NewRuleGroupName);
		Thread.sleep(2000);
		System.out.println("RuleGroup"+NewRuleGroupName);
		RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		AdvancedOptions.click();
		this.Forcererunchainedruletoproducefreshresults.click();
		this.MaintainAllExecutionResults.click();
		this.SaveResultintofollowingDataSource.click();
		String DSName1 = "Output_Fake_"+randomint+"_Risk Scores";
		System.out.println(DSName1);
		this.outputdataSourceName.sendKeys(DSName1);
		RuleSaveButton.click();
		utilityMethods.waitForVisibility(OKConfigureRule);
		OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		ResetButtonQB.click();
	}

}
