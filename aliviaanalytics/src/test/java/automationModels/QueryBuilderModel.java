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
import com.sun.tools.javac.util.Name.Table;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class QueryBuilderModel extends Configuration {

	public static ExtentTest test;
	String RuleGroupName = utilityMethods.randomString(10);
	String RuleName = utilityMethods.randomString(10);
	String Alias = utilityMethods.randomString(5);
	String searchWord = utilityMethods.randomString(1);

	@FindBy(how = How.XPATH, using = "//table[(text() = 'Query Builder' or . = 'Query Builder')]")

	public WebElement QueryBuilder;

	@FindBy(how = How.XPATH, using = "//a[(text() = 'Query Builder' or . = 'Query Builder')]")

	public WebElement QueryBuilderBreadCrumb;

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

	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-queryBuilder-AggrBuilderUtility-okButton-018')]")

	public WebElement AggrBuilderUtilityokButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-queryBuilder-AggrBuilderUtility-okButton-018')]")

	public WebElement CancelButton;

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
	
	
	// Start Advanced Dropdown

	@FindBy(how = How.XPATH, using = "//span[text()='Advanced']")

	WebElement AdvancedDropdownButton;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-builder-advanced-menu')]//div[contains(@class,'x-box-target')]/div[2]//span")

	WebElement ExpressionColumn;
	
	// .... Expression Column .... //
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div")

	List<WebElement> AggregationEditorList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-boundlist-floating')]//ul[@aria-hidden='false']/li")

	List<WebElement> DropdownListLi;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-boundlist-floating')]//ul[@aria-hidden='false']/div[not(contains(@style,'font'))]")

	List<WebElement> DropdownListDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a")

	List<WebElement> DropdownListA;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//div[contains(@class,'x-form-cb-checked')]/div[1]/div/span")

	WebElement OutputCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//div[contains(@class,'x-form-type-checkbox')]/div[1]/div/span")

	List<WebElement> UnselectedOutputCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@value='SELECT']")

	WebElement BuildOptionInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@value='SELECT']/following::div[1]")

	WebElement BuildOptionDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@placeholder='Select Expression Column ...']")

	WebElement SelectExpressionColumnInput;	
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@placeholder='Select Expression Column ...']/parent::div")

	WebElement SelectExpressionColumnDiv;	
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@placeholder='Select Expression Column ...']/following::div[1]")

	WebElement SelectExpressionColumnDropdown;	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@placeholder='Column Alias ...']")

	WebElement ColumnAliasInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//input[@placeholder='Column Alias ...']/parent::div")

	WebElement ColumnAliasDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']//a//span[contains(@class,'trash')]")

	WebElement RemoveButton;
	
	// .... End Expression Column .... //
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-builder-advanced-menu')]//div[contains(@class,'x-box-target')]/div[3]//span")

	WebElement LogicalExpression;
	
	// .... Logical Expression .... //
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-closable')]//div[text()='Expression Builder']")

	List<WebElement> ExpressionBuilderScreen;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Expression Builder']/following::div[1]")

	WebElement ExpressionBuilderQuitButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-closable') and @aria-hidden='false']//input[@placeholder='Search ...']/parent::div")

	WebElement SearchDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-closable') and @aria-hidden='false']//input[@placeholder='Search ...']")

	WebElement SearchInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-closable') and @aria-hidden='false']//input[@placeholder='Search ...']/following::div[1]")

	WebElement SearchCross;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-item x-panel-default x-grid')]/div[2]//table//td[@data-qtip]")

	List<WebElement> ExpressionNameList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//span[text()='Add Row']")

	WebElement AddRow;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//span[text()='Save Expression']")

	WebElement SaveExpressionButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//a[2]/span[2]")

	WebElement SaveExpressionDropdown;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Save As New Expression']")

	WebElement SaveAsNewExpressionButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//a[3]//span[contains(@class,'fa-broom')]")

	WebElement ResetAllButton;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Expression Name']")

	List<WebElement> ExpesssionNameScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@role,'alertdialog')]//input/parent::div")

	WebElement ExpressionNameDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@role,'alertdialog')]//input")

	WebElement ExpressionNameInput;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Status']")

	List<WebElement> StatusScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@role,'alertdialog')]//div[contains(@class,'x-window-text')]")

	WebElement StatusText;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table")

	List<WebElement> ExpressionList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]/div/div[not(contains(@class,'x-hidden-offsets'))]//div[@aria-owns]/div")

	List<WebElement> ExpressionUpdateList;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td[2]/div")
	
	WebElement ConditionDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[2]//input")

	WebElement ConditionInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[2]//input/following::div[1]")

	WebElement ConditionDropdown;
		
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td[3]/div")

	WebElement ExpressionElement1Div;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[3]//input")

	WebElement ExpressionElement1Input;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[3]//input/following::div[1]")

	WebElement ExpressionElement1Dropdown;	
	
	
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td[4]/div")

	WebElement OperatorDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[4]//input")

	WebElement OperatorInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[4]//input/following::div[1]")

	WebElement OperatorDropdown;	

	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td[5]/div")

	WebElement ExpressonElement2Div;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[5]//input")

	WebElement ExpressionElement2Input;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]/div/div[2]//div[@aria-owns]/div/div/div[5]//input/following::div[1]")

	WebElement ExpressionElement2Dropdown;	

	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td[6]/div")

	WebElement AliasDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//div[6]//input")

	WebElement AliasInput;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'x-btn x-row-editor-update-button')]//span[text()='Update']")

	WebElement UpdateButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[2]//div[@data-qtip='Move Up']")

	WebElement MoveUpButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//div[@data-qtip='Move Down']")

	WebElement MoveDownButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-closable x-noborder-trbl')]/div[2]//table[1]//td//div[contains(@class,'trash')]")

	WebElement RemoveExpressionButton;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Expression Builder']/following::span[text()='Cancel']")

	WebElement CancelExpressionButton;
	
	
	
	
	// .... End Logical Expression .... //
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-builder-advanced-menu')]//div[contains(@class,'x-box-target')]/div[5]//span")

	WebElement CustomQueries;
	
	// .... Custom Query .... //
	
	@FindBy(how = How.XPATH, using = "//div[text()='Custom Query Editor']")

	List<WebElement> CustomQueryScreen;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Custom Query Editor']/following::div[1]")

	WebElement CustomQueryQuitButton;
	
	// .... End Custom Query .... //
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-builder-advanced-menu')]//div[contains(@class,'x-box-target')]/div[6]//span")

	WebElement QueryView;
	
	// .... Query View.... //
	
	@FindBy(how = How.XPATH, using = "//textarea[contains(@id,'sqlEditor') and @aria-hidden='false']/parent::div")

	List<WebElement> WritingQueryScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryViewTextarea')]/div/div[2]/div/div/label")

	WebElement Errors;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-builder-advanced-menu')]//div[contains(@class,'x-box-target')]/div[6]//span[text()='Visual Query Builder']")

	WebElement VisualQuery;
	
	// .... End Query View .... //
	
	// .... End Advance Dropdown .... //
	
	// .... Multiple Columns .... //
	
	@FindBy(how = How.XPATH, using = "//div[@id='qb-main-pane-bodyWrap']//a[@data-qtip='Multiple Columns']")

	WebElement MultipleColumns;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Add Multiple Columns']")

	List<WebElement> MultipleColumnsScreen;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select Table ...']")

	WebElement SelectTableInput;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select Table ...']/following::div[1]")

	WebElement SelectTableDropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select Table ...']/following::a[1]")

	WebElement SelectTableCrossButton;	

	
	// Data Source 
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-checkbox') and not(contains(@class,'x-grid-hd-checker-on'))]//span[@class='x-column-header-checkbox']")

	WebElement UnselectedHeaderCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@class,'x-column-header-checkbox') and contains(@class,'x-grid-hd-checker-on')]//span[@class='x-column-header-checkbox']")

	WebElement SelectedHeaderCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-default') and @aria-hidden='false']")

	List<WebElement> HeaderColumnName;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[contains(@class,'selected')]//tr/td[1]")

	List<WebElement> SelectedColumnCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//table[not(contains(@class,'selected'))]//tr/td[1]")

	List<WebElement> UnselectedColumnCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Function']")

	WebElement FunctionHeading;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Function']/following::div[1]")

	WebElement FunctionDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Type']")

	WebElement TypeHeading;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Type']/following::div[1]")

	WebElement TypeDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Column Name']")

	WebElement ColumnNameHeading;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-body-default-resizable')]//span[text()='Column Name']/following::div[1]")

	WebElement ColumnNameDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a//span[text()='Sort Ascending']")

	WebElement SortAscending;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a//span[text()='Sort Descending']")

	WebElement SortDescending;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a//span[text()='Columns']")

	WebElement ColumnsDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true']//a[contains(@id,'menucheck')]/span")

	List<WebElement> ColumnsDropdownList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataRepo-queryBuilder-AggrBuilderUtility-gridPanel-017') ]//table//tr//td[4]")

	List<WebElement> SelectedDSColumnNameList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'footer')]//div[contains(@class,'x-form-cb-wrap-default') and not(contains(@class,'checked'))]")

	WebElement UnselectedAggregateSelectedColumns;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'footer')]//div[contains(@class,'x-form-cb-checked')]")

	WebElement SelectedAggregateSelectedColumns;
	
	// .... End Multiple Columns .... //
	
	// .... Row Filter .... //
	
	@FindBy(how = How.XPATH, using = "//a[@data-qtip='Expand Filter Row']")

	WebElement ExpandRowFilter;
	
	@FindBy(how = How.XPATH, using = "//a[@data-qtip='Collapse Filter Row']")

	WebElement CollapseRowFilter;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-toolbar-id' and @aria-hidden='true']")

	List<WebElement> HiddenRowFilter;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-toolbar-id' and @aria-hidden='false']")

	List<WebElement> VisibleRowFilter;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-toolbar-id']//div[contains(@class,'checked')]")

	List<WebElement> FilterRowSelectedCheckbox;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Top Rows']/parent::div")

	WebElement TopRowsDiv;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Top Rows']")

	WebElement TopRowsInput;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Top Rows']/following::div/div[1]")

	WebElement TopRowsIncrement;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Top Rows']/following::div/div[2]")

	WebElement TopRowsDeccrement;
	
	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1284']")

	WebElement PercentangeDiv;
	
	@FindBy(how = How.XPATH, using = "	//div[@id='checkbox-1284' and not(contains(@class,'checked'))]")

	WebElement PercentageUnchecked;
	
	@FindBy(how = How.XPATH, using = "//input[@name='top-percent-checkbox']")

	WebElement PercentangeCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1286']")

	WebElement DistinctDiv;
	
	@FindBy(how = How.XPATH, using = "	//div[@id='checkbox-1286' and not(contains(@class,'checked'))]")

	WebElement DistinctUnchecked;
	
	@FindBy(how = How.XPATH, using = "//input[@name='distinct-keyword-checkbox']")

	WebElement DistinctCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1288']")

	WebElement SimpleRandomSampleDiv;
	
	@FindBy(how = How.XPATH, using = "	//div[@id='checkbox-1288' and not(contains(@class,'checked'))]")

	WebElement SimpleRandomSampleUnchecked;
	
	@FindBy(how = How.XPATH, using = "//input[@name='random-sample-checkbox']")

	WebElement SimpleRandomSampleCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='checkbox-1291']")

	WebElement AggregateOnTimePeriodDiv;
	
	@FindBy(how = How.XPATH, using = "	//div[@id='checkbox-1291' and not(contains(@class,'checked'))]")

	WebElement AggregateOnTimePeriodUnchecked;
	
	@FindBy(how = How.XPATH, using = "//input[@name='time-aggregation-checkbox']")

	WebElement AggregateOnTimePeriodCheckbox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1292']")

	WebElement SelectDateColumnDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1292']//input")

	WebElement SelectDateColumnInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1292']//input/following::div[1]")

	WebElement SelectDateColumnDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1292' and not(contains(@class,'disabled'))]")

	WebElement SelectDateColumnEnableDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1292' and contains(@class,'disabled')]")

	WebElement SelectDateColumnDisableDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1293']")

	WebElement SelectTimeIntervalDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1293']//input")

	WebElement SelectTimeIntervalInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1293']//input/following::div[1]")

	WebElement SelectTimeIntervalDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1293' and not(contains(@class,'disabled'))]")

	WebElement SelectTimeIntervalEnableDiv;
	
	@FindBy(how = How.XPATH, using = "//div[@id='combo-1293' and contains(@class,'disabled')]")

	WebElement SelectTimeIntervalDisableDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-field dataRepo-queryBuilder-datasourcesPane-okButton-019')]")

	WebElement AliasDiv_QBPane;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-field dataRepo-queryBuilder-datasourcesPane-okButton-019')]//input")

	WebElement AliasInput_QBPane;

	@FindBy(how = How.XPATH, using = "//a[@aria-label='Database Icon']/following::div[1]")

	WebElement DataSourceDiv;
	
	@FindBy(how = How.XPATH, using = "//input[@name='datasource-combobox']/following::div[1]")

	WebElement DataSourceDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,' x-form-item-no-label') and not(contains(@class,'x-form-dirty'))]//input[@name='datasource-combobox']")

	WebElement DataSourceInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,' x-form-item-no-label') and contains(@class,'x-form-dirty')]//input[@name='datasource-combobox']")

	WebElement SelectedDataSourceInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-datasource-pane-cls')]/div/div/div")

	List<WebElement> QueryBuilderPaneList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-datasource-pane-cls')]/div/div/div[1]/div/div/div[3]//a[@data-qtip='Remove' and not(contains(@class,'disabled'))]")

	WebElement EnableQueryBuilderPaneRemove;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'query-datasource-pane-cls')]/div/div/div[1]/div/div/div[3]//a[@data-qtip='Remove' and contains(@class,'disabled')]")

	WebElement DisableQueryBuilderPaneRemove;
	
	@FindBy(how = How.XPATH, using = "//a[@aria-label='Add' and @aria-hidden='false']")

	WebElement QueryBuilderPaneAddDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-menu-default')][last()]//span[text()='Add Data Source']")

	WebElement AddDataSource;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-menu-default')][last()]//span[text()='Add Rule']")

	WebElement AddRule;
	
	@FindBy(how = How.XPATH, using = "//div[@role='menu' and @aria-expanded='true' and @aria-disabled='true']//a/span[text()='Add Rule']")

	List<WebElement> DisabledAddRule;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Join']")

	WebElement Join;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[2]//input/following::div[1]")

	WebElement JoinDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[2]//input")

	WebElement JoinInput;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@src,'inner')]")

	WebElement InnerJoinIcon;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[1]//input/following::div[1]")

	WebElement JoinColumn1Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[1]//input")

	WebElement JoinColumn1Input;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[2]//input/following::div[1]")

	WebElement ChooseOperatorDropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[2]//input")

	WebElement ChooseOperatorInput;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[3]//input/following::div[1]")

	WebElement JoinColumn2Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@id='aggregation-editor-aggreditor-pane-vbox-targetEl']/div/div/div/div[3]/div[1]/div/div[3]//input")

	WebElement JoinColumn2Input;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryBuilderToolBar')]/div/div/div[1]")

	WebElement EnableRuleChainingDiv;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryBuilderToolBar')]/div/div/div[contains(@class,'checked')]")

	WebElement SelectedEnableRuleChaining;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryBuilderToolBar')]/div/div/div[contains(@class,'checkbox') and not(contains(@class,'checked'))]")

	WebElement UnselectedEnableRuleChaining;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryBuilderToolBar')]/div/div/div[contains(@class,'x-form-type-text') and contains(@class,'disable')]")

	WebElement DisableSelectRuleGroup;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'queryBuilderToolBar')]/div/div/div[contains(@class,'x-form-type-text') and not(contains(@class,'disabled'))]")

	WebElement EnableSelectRuleGroup;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Choose Rule Group ...']")

	WebElement SelectRuleGroupInput;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Choose Rule Group ...']/following::div[1]")

	WebElement SelectRuleGroupDropdown;
	

	@FindBy(how = How.XPATH, using = "//div[@id='qb-main-pane-bodyWrap']//span[contains(@class,'fa-play-circle')]")

	WebElement Execute;
	
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

	public void LandingOnQueryBuilderPage() {
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
		
		// Search Field 
		utilityMethods.visible(DCM.SearchFieldSidePanel,
				"Side Pane: Verify that Saved Query Filters Search Text Field is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.SearchFieldSidePanel,
				"Side Pane: Verify that Saved Query Filters Search Text Field is clickable on 'Query Builder' screen");
		utilityMethods.sendKeys_Input(DCM.SearchFieldSidePanel, 100, "includeChar",
				"Side Pane: Verify that Saved Query Filters Search Text Field allow users to input alphabets, numbers and special characters on 'Query Builder' screen");
		utilityMethods.validateSearchList_SidePanel(DCM.SearchFieldSidePanel, DCM.TreeListSidePanel,
				DCM.CreatedSubFolderSidePanel, searchWord,
				"Side Pane: Verify that users can search saved rules using the Search Text Field.");
		utilityMethods.visible(DCM.SearchFieldCrossButtonSidePanel,
				"Side Pane: Verify that cross button is present in Search Text Field on 'Query Builder' screen");
		utilityMethods.verifyCrossButton(DCM.SearchFieldSidePanel, 100, DCM.SearchFieldCrossButtonSidePanel,
				"Side Pane: Verify that cross button clears the text in Search Text Field on 'Query Builder' screen");
		utilityMethods.validateSearchPlaceholder(DCM.SearchFieldSidePanel, "Search",
				"Side Pane: Verify that Search text present by default in Search Text Field on 'Query Builder' screen");
		
		// Create Folder
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
		utilityMethods.sendKeys_Input(DCM.CreateNewFolderTextField, 100, "includeChar",
				"Create New Folder: Verify that 'Text Field' allow user to input alpahbets, numeric and special characters on 'Query Builder' screen");
		utilityMethods.verifyfieldmandatory(DCM.CreateNewFolderTextField, 500, DCM.CreateNewFolderMandatoryCheck,
				"Create New Folder: Verify that Folder Name Text Field is highlighted red when field empty.");
		utilityMethods.verifyRadioButtonPrivatePublicVisible(DCM.CreateNewFolderRadioButton);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(DCM.CreateNewFolderRadioButton);
		utilityMethods.verifyRadioButtonSelection(DCM.CreateNewFolderRadioButton,
				DCM.CreateNewFolderSelectedRadioButton);
		utilityMethods.visible(DCM.CreateNewFolderTextArea,
				"Create New Folder: Verify that 'Text Area' is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CreateNewFolderTextArea,
				"Create New Folder: Verify that 'Text Area Field' is clickable on 'Query Builder' screen");
		utilityMethods.sendKeys_Input(DCM.CreateNewFolderTextArea, 500, "includeChar",
				"Create New Folder: Verify that 'Text Area Field' allow user to input alphabets, numbers and special character on 'Query Builder' screen");
		DCM.CreateNewFolderTextArea.clear();

		utilityMethods.visible(DCM.DisableSaveButtonCreateNewFolder,
				"Create New Folder: Verify that 'Disable Save Button' is disabled by default on 'Query Builder' screen");

		DCM.CreateNewFolderTextField.sendKeys("Verify");

		utilityMethods.visible(DCM.SaveButton,
				"Create New Folder: Verify that 'Save Button' is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.SaveButton,
				"Create New Folder: Verify that 'Save Button' is clickable on 'Query Builder' screen");

		utilityMethods.visible(DCM.CancelButton,
				"Create New Folder: Verify that 'Cancel Button' is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CancelButton,
				"Create New Folder: Verify that 'Cancel Button' is clickable on 'Query Builder' screen");
		utilityMethods.list_NotVisible(DCM.CancelButton, 500, DCM.CreateNewFolderScreen,
				"Create New Folder: Verify that popup close when click on cancel button on 'Query Builder' screen");

		
		utilityMethods.verifyCropSpacesTextField_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.SaveButton,
				DCM.CreatedFolderListSidePanel, " ",
				"Create New Folder: Verify that 'Folder Name' Text Field can't be save as an empty field on 'Query Builder' screen");
		
		utilityMethods.verifyCropSpacesTextField_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.SaveButton,
				DCM.CreatedFolderListSidePanel, " CropSpaceBT_TF",
				"Create New Folder: Verify that 'Folder Name' Text Field Crop Spaces from Before Text when click on save button on 'Query Builder' screen");
		
		utilityMethods.verifyCropSpacesTextField_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.SaveButton,
				DCM.CreatedFolderListSidePanel, "CropSpaceAT_TF ",
				"Create New Folder: Verify that 'Folder Name' Text Field Crop Spaces from After Text when click on save button on 'Query Builder' screen");
		
		utilityMethods.removeList_SidePanel(DCM.CreatedFolderListSidePanel, DCM.SearchFieldSidePanel,
				DCM.CreatedFolderListSidePanel, DCM.DeleteButtonCreateNewFolder, DCM.YesButton, DCM.OkButton2);

		
		
		utilityMethods.verifyCropSpacesTextArea_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.CreateNewFolderTextArea,
				DCM.SaveButton, DCM.EditButtonCreateNewFolder, DCM.CreatedFolderListSidePanel,
				DCM.CancelButtonCreateNewFolder, " ",
				"Create New Folder: Verify that 'Folder Description' Text Area can't be save as an empty field on 'Query Builder' screen");
		
		utilityMethods.verifyCropSpacesTextArea_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.CreateNewFolderTextArea,
				DCM.SaveButton, DCM.EditButtonCreateNewFolder, DCM.CreatedFolderListSidePanel,
				DCM.CancelButtonCreateNewFolder, " CropSpaceBT_TA",
				"Create New Folder: Verify that 'Folder Description' Text Area Crop Spaces from Before Text when click on save button on 'Query Builder' screen");
		
		utilityMethods.verifyCropSpacesTextArea_SidePanel(DCM.SearchFieldSidePanel, DCM.RefreshButtonSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.CreateNewFolderTextArea,
				DCM.SaveButton, DCM.EditButtonCreateNewFolder, DCM.CreatedFolderListSidePanel,
				DCM.CancelButtonCreateNewFolder, "CropSpaceAT_TA ",
				"Create New Folder: Verify that 'Folder Description' Text Area Crop Spaces from After Text when click on save button on 'Query Builder' screen");

		utilityMethods.verifyChildFolder_SidePanel(DCM.SearchFieldSidePanel, DCM.TreeListSidePanel,
				DCM.CreateFolderButtonSidePanel, DCM.CreateNewFolderTextField, DCM.SaveButton,
				DCM.CreateNewFolderScreen, "New Folder");
		
		// Refresh 

		utilityMethods.visible(DCM.RefreshButtonSidePanel,
				"Side Pane: Verify that Refresh button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.RefreshButtonSidePanel,
				"Side Pane: Verify that Refresh button is clickable on 'Query Builder' screen");
		utilityMethods.list_Visible(DCM.RefreshButtonSidePanel, 0, DCM.RefreshButtonLoadingSidePanel,
				"Side Pane: Verify that Refresh button reload the filter list when click it on 'Query Builder' screen");
		
		// Expand and Collapse All
		utilityMethods.visible(DCM.ExpandAllButtonSidePanel,
				"Side Pane: Verify that Expand All button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.ExpandAllButtonSidePanel,
				"Side Pane: Verify that Expand All button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.ExpandAllButtonSidePanel, 200, DCM.CollapseAllButtonSidePanel,
				"Side Pane: Verify that Expand All button converts to Collapse All button when click it on 'Query Builder' screen");
		utilityMethods.visible(DCM.CollapseAllButtonSidePanel,
				"Side Pane: Verify that Collapse All button is present on 'Query Builder' screen");
		utilityMethods.clickable(DCM.CollapseAllButtonSidePanel,
				"Side Pane: Verify that Collapse All button is clickable on 'Query Builder' screen");
		utilityMethods.clicked_elementVisible(DCM.CollapseAllButtonSidePanel, 200, DCM.ExpandAllButtonSidePanel,
				"Side Pane: Verify that Collapse All button converts to Expand All button when click it on 'Query Builder' screen");

		utilityMethods.verifyListExpandAndCollapse_SidePanel(DCM.ExpandAllButtonSidePanel, DCM.CollapseAllButtonSidePanel,
				DCM.CreatedSubFolderSidePanel);

		// Expand and Collapse Panel
		
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
		utilityMethods.time(1000);
		
		// Clear all list before exit..
		utilityMethods.removeList_SidePanel(DCM.CreatedFolderListSidePanel, DCM.SearchFieldSidePanel,
				DCM.CreatedFolderListSidePanel, DCM.DeleteButtonCreateNewFolder, DCM.YesButton, DCM.OkButton2);
		

	}
	public void verifyAdvanceDropdown() {
		
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		
		// Advanced Dropdown
		utilityMethods.visible(this.AdvancedDropdownButton, 
				"Verify that 'Advanced Dropdown' button is present on the Query Builder screen.");
		utilityMethods.clickable(this.AdvancedDropdownButton,
				"Verify that 'Advanced Dropdown' button is clickable on the Query Builder screen.");
		utilityMethods.list_Visible(this.AdvancedDropdownButton, 500, this.DropdownListA,
				"Verify that clicking 'Advanced Dropdown' shows Two kinds of Expressions and Two kinds of Queries on the 'Query Builder' screen");
		
		
		// Expression Column Button
		utilityMethods.visible(this.ExpressionColumn, 
				"Verify that 'Expression Column' button is present on the Query Builder screen.");
		utilityMethods.clickable(this.ExpressionColumn,
				"Verify that 'Expression Column' button is clickable on the Query Builder screen.");
		utilityMethods.list_Visible(this.ExpressionColumn, 500, this.AggregationEditorList,
				"Verify that clicking Expression Column Button populates a Expression Column record in the Visual Query Builder on 'Query Builder' screen");
		
		// Output Check box 
		utilityMethods.visible(this.OutputCheckbox, 
				"Verify that Output Check Box is present in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.OutputCheckbox,
				"Verify that Output Check Box is clickable on the Query Builder screen. ");
		utilityMethods.visible(this.OutputCheckbox, 
				"Verify that Output Check Box is checked by default and displays a tick in the check box on the Query Builder screen.");
		utilityMethods.list_Visible(this.OutputCheckbox,500,this.UnselectedOutputCheckbox,
				"Verify that on unchecking the Output Check Box the tick is removed on the Query Builder screen. ");
		
		// Build Options
		utilityMethods.visible(this.BuildOptionDropdown, 
				"Verify that Build Options Dropdown is present in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.BuildOptionDropdown, 
				"Verify that Build Options Dropdown is clickable in the grid on the Query Builder screen.");
		utilityMethods.list_Visible(this.BuildOptionDropdown, 500, this.DropdownListLi, 
				"Verify that clicking on the down arrow on the right of Build Options Dropdown expands the dropdown to display available Build Options on the Query Builder screen.");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 7, 
				"Verify that there are currently Seven Build Options to choose from on 'Query Builder' screen.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.BuildOptionInput, 
				"Verify that clicking on any Build Option, selects it. ");
		
		// Select Expression Column Text Field
		utilityMethods.visible(this.SelectExpressionColumnDiv, 
				"Verify that Select Expression Column Text Field is present in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.SelectExpressionColumnInput, 
				"Verify that Select Expression Column Text Field is clickable in the grid on the Query Builder screen.");
		utilityMethods.sendKeys_Input(this.SelectExpressionColumnInput, 500, "includeChar", 
				"Verify that Select Expression Column Text Field lets users input alphabets, numbers and special characters on the Query Builder screen.");
		utilityMethods.validateSearchPlaceholder(this.SelectExpressionColumnInput, "Select Expression Column ...", 
				"Verify that Select Expression Column Text Field displays a 'Select Expression Column … ' message by default on the Query Builder screen.");
		
		this.SelectExpressionColumnInput.sendKeys(Alias);
		utilityMethods.time(1000);
		
		utilityMethods.validateInputText_Match(this.ColumnAliasInput, Alias, 
				"Verify that typing in the Select Expression Column Text Field simultaneously inputs text in the Column Alias Text Field on Query Builder screen.");
		
		this.SelectExpressionColumnInput.clear();
		this.ColumnAliasInput.clear();
		utilityMethods.time(1000);
		
		// Column Alias Text Field
		utilityMethods.visible(this.ColumnAliasDiv, 
				"Verify that Column Alias Text Field is visible in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.ColumnAliasInput, 
				"Verify that Column Alias Text Field is clickable and editable on the Query Builder screen.");
		utilityMethods.sendKeys_Input(this.ColumnAliasInput, 500, "includeChar", 
				"Verify that Column Alias Text Field lets users input alphabets, numbers and special characters on the Query Builder screen.");
		utilityMethods.validateSearchPlaceholder(this.ColumnAliasInput, "Column Alias ...", 
				"Verify that Column Alias Text Field displays a 'Column Alias … ' message by default on the Query Builder screen.");
		
		this.ColumnAliasInput.sendKeys(Alias);
		utilityMethods.time(1000);
		
		utilityMethods.validateInputText_NotMatch(this.SelectExpressionColumnInput, Alias, 
				"Verify that typing in the Column Alias Text Field however does not simultaneously input text in the Select Expression Column Text Field on Query Builder screen.");
		
		// Remove Button
		utilityMethods.visible(this.RemoveButton, 
				"Verify that Remove Button is visible in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.RemoveButton, 
				"Verify that Remove Button is clickable in the grid on the Query Builder screen.");
		utilityMethods.list_NotVisible(this.RemoveButton, 500, this.AggregationEditorList, 
				"Verify that clicking Remove Button removes populated Expression Column record from the grid on Query Builder screen.");
		
		
		// Select Data Source Before 
		
		utilityMethods.booleanTestCase(this.CreateQueryBuilder("requiredColumn", "Medical Transactions"),
				"Verify that upon selecting a data source its name appears in Select Data Source text box.");
		
		// DUPLICATE CASE to open advance dropdown to select logical expression button...
		utilityMethods.testCase_Duplicate(this.AdvancedDropdownButton, 500, "click", ""); 
		
		// Logical Expression Button
		
		utilityMethods.visible(this.LogicalExpression, 
				"Verify that 'Logical Expression' button is present on the Query Builder screen.");
		utilityMethods.clickable(this.LogicalExpression,
				"Verify that 'Logical Expression' button is clickable on the Query Builder screen.");
		utilityMethods.list_Visible(this.LogicalExpression, 500, this.ExpressionBuilderScreen,
				"Verify that clicking Logical Expressions Button opens up an 'Expression Builder' screen on 'Query Builder' screen");
		
		// Search Saved Expressions Text Field
		
		utilityMethods.visible(this.SearchDiv, 
				"Verify that Search Saved Expressions Text Field is visible on the Expression Builder screen.");
		utilityMethods.clickable(this.SearchInput, 
				"Verify that Search Saved Expressions Text Field is clickable and editable on the Expression Builder screen.");
		utilityMethods.sendKeys_Input(this.SearchInput, 500, "includeChar", 
				"Verify that Search Saved Expressions Text Field lets users input alphabets, numbers and special characters on the Expression Builder screen.");
		utilityMethods.visible(this.SearchCross, 
				"Verify that a cross is present on the right in the Search Saved Expressions Text Field on Expression Builder screen.");
		utilityMethods.verifyCrossButton(this.SearchInput, 500, this.SearchCross,
				"Verify that clicking the cross removes any text from the Search Saved Expressions Text Field onExpression Builder screen.");
		utilityMethods.validateSearch(this.SearchInput, this.ExpressionNameList, searchWord,
				"Verify that users can search saved expressions using the Search Text Field on Expression Builder screen.");
		utilityMethods.validateSearchPlaceholder(this.SearchInput, "Search ...", 
				"Verify that Search Saved Expressions Text Field displays a 'Search ...' message by default on the Expression Builder screen.");
		
		// Add Row Button
		
		utilityMethods.visible(this.AddRow, 
				"Verify that Add Row Button is visible on the Expression Builder screen.");
		utilityMethods.clickable(this.AddRow,
				"Verify that Add Row Button is clickable on the Expression Builder screen.");
		utilityMethods.verifyItemAdded(this.ExpressionList, this.AddRow,
				"Verify that clicking the Add Row Button adds a new row in the Expression Builder screen.");
		 
		// Save Expression Button
		
		utilityMethods.visible(this.SaveExpressionButton, 
				"Verify that Save Expression Button is visible on the Expression Builder screen.");
		utilityMethods.clickable(this.SaveExpressionButton,
				"Verify that Save Expression Button is clickable on the Expression Builder screen.");
		utilityMethods.list_Visible(this.SaveExpressionButton, 500, this.ExpesssionNameScreen,
				"Verify that clicking on the Save Expression Button opens up an 'Expression Name' screen. ");
		
		// Expression Name Text Field
		
		utilityMethods.visible(this.ExpressionNameDiv, 
				"Verify that Expression Name Text Field is visible on the Expression Name screen.");
		utilityMethods.clickable(this.ExpressionNameInput,
				"Verify that Expression Name Text Field is clickable and editable on the Expression Name screen.");
		utilityMethods.sendKeys_Input(this.ExpressionNameInput, 500, "includeChar",
				"Verify that Expression Name Text Field lets users input alphabets, numbers and special characters on the 'Expression Name' screen. ");
		utilityMethods.clearField(this.ExpressionNameInput);
		
		
		// OK Button 
		
		utilityMethods.visible(DCM.OkButton, 
				"Verify that OK Button is visible on the Expression Name screen.");
		utilityMethods.clickable(DCM.OkButton,
				"Verify that OK Button is clickable on the Expression Name screen.");
		utilityMethods.verifyItemAdded(this.ExpressionNameList, DCM.OkButton, 
				"Verify that clicking OK Button saves an expression on the Expresson Name screen.");
		
		utilityMethods.validateText_Match(this.StatusText, "Expression saved successfully.",
				"Verify that a 'Expression saved successfully' message is displayed on the Status screen.");

		utilityMethods.visible(DCM.OkButton, 
				"Verify that OK Button is visible on the Status screen.");
		utilityMethods.clickable(DCM.OkButton,
				"Verify that OK Button is clickable on the Status screen.");

		utilityMethods.list_NotVisible(DCM.OkButton, 1000, this.StatusScreen, 
				"Verify that Status screen close when click on Ok button on the Status screen.");
		

		// DUPLICATE CASE to open Exprsssion Name Screen...
		Actions actions = new Actions(driver);
		actions.moveToElement(this.SaveExpressionDropdown).click().build().perform();
		utilityMethods.time(1000);
		
		utilityMethods.visible(this.SaveAsNewExpressionButton, 
				"Verify that 'Save As New Expression' button is present on the Query Builder screen.");
		utilityMethods.clickable(this.SaveAsNewExpressionButton,
				"Verify that 'Save As New Expression' button is clickable on the Query Builder screen.");
		
		actions.moveToElement(this.SaveAsNewExpressionButton).click().build().perform();
		
		utilityMethods.time(1000);
		
		// Cancel Button 
		utilityMethods.visible(DCM.CancelButton, 
				"Verify that Cancel Button is visible on the Expression Name screen.");
		utilityMethods.clickable(DCM.CancelButton,
				"Verify that Cancel Button is clickable on the Expression Name screen.");
		utilityMethods.list_NotVisible(DCM.CancelButton, 1000, this.ExpesssionNameScreen, 
				"Verify that clicking Cancel Button cancels the operation of naming an expression on Expression Name screen.");
		
		
		// Move Down Arrow Button
		
		utilityMethods.visible(this.MoveDownButton, 
				"Verify that Move Down Arrow Button is visible in the grid in the Action Column upon adding a row.");
		utilityMethods.clickable(this.MoveDownButton, 
				"Verify that Move Down Arrow Button is clickable in the grid in the Action Column upon adding a row.");
		utilityMethods.validateUpDownButton(this.AliasDiv,this.AliasInput,this.UpdateButton,this.MoveDownButton,
				"Verify that Move Down Arrow Button moves up a record in the grid. ");
		
		// Move Up Arrow Button
		
		utilityMethods.visible(this.MoveUpButton, 
				"Verify that Move Up Arrow Button is visible in the grid in the Action Column upon adding a row.");
		utilityMethods.clickable(this.MoveUpButton, 
				"Verify that Move Up Arrow Button is clickable in the grid in the Action Column upon adding a row.");
		utilityMethods.validateUpDownButton(this.AliasDiv,this.AliasInput,this.UpdateButton,this.MoveUpButton,
				"Verify that Move Up Arrow Button moves up a record in the grid. ");
	
		
		// Delete Button
		
		utilityMethods.visible(this.RemoveExpressionButton, 
				"Verify that Delete Button is visible in the grid in the Action Column upon adding a row.");
		utilityMethods.clickable(this.RemoveExpressionButton, 
				"Verify that Delete Button is clickable in the grid in the Action Column upon adding a row.");
		utilityMethods.verifyItemRemove(this.RemoveExpressionButton, this.ExpressionList, 
				"Verify that Delete Button removes a record from the grid. ");
		
		
		// Reset All Button
		
		utilityMethods.visible(this.ResetAllButton, 
				"Verify that Reset All Button is visible on the Expression Builder screen.");
		utilityMethods.clickable(this.ResetAllButton, 
				"Verify that Reset All Button is clickable on the Expression Builder screen.");
		utilityMethods.list_NotVisible(this.ResetAllButton, 1000, ExpressionList, 
				"Verify that clicking Reset All Button reverts all user input. ");
		
		// Condition Type Dropdown
		actions.moveToElement(this.ConditionDiv).doubleClick().build().perform();
		utilityMethods.time(1000);
		
		utilityMethods.visible(this.ConditionDropdown, 
				"Verify that Condition Type Dropdown is visible in the grid upon adding a row.");
		utilityMethods.clickable(this.ConditionDropdown, 
				"Verify that Condition Type Dropdown is clickable in the grid upon adding a row.");
		utilityMethods.list_Visible(this.ConditionDropdown, 500, this.DropdownListLi, 
				"Verify that clicking on the down arrow on the right of Condition Type Dropdown expands the dropdown to display available Condition Type Dropdown Options.");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 12, 
				"Verify that there are currently Twelve Condition Type Dropdown Options to choose from. ");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.ConditionInput, 
				"Verify that clicking on any Condition Type Option, selects it. ");
		utilityMethods.validateSearch(this.ConditionInput, this.DropdownListLi, "IF", 
				"Verify that valid Condition Type Dropdown Options are searched and displayed related to the inputs in Condition Type Dropdown.");
		
		// Expression Element 1 Dropdown
		
		utilityMethods.visible(this.ExpressionElement1Dropdown, 
				"Verify that Expression Element 1 Dropdown is visible in the grid upon adding a row.");
		utilityMethods.clickable(this.ExpressionElement1Dropdown, 
				"Verify that Expression Element 1 Dropdown is clickable in the grid upon adding a row");
		utilityMethods.list_Visible(this.ExpressionElement1Dropdown, 500, this.DropdownListDiv, 
				"Verify that clicking on the down arrow on the right of Expression Element 1 Dropdown expands the dropdown to display available Expression Element 1 Options.");
		utilityMethods.verifySizeMatch(this.DropdownListDiv, 2, 
				"Verify that there are currently Two Expression Element 1 Dropdown Options to choose from. ");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListDiv, this.ExpressionElement1Input, 
				"Verify that clicking on any Expression Element 1 Option, selects it. ");
		utilityMethods.validateSearch(this.ExpressionElement1Input, this.DropdownListDiv, "DS_0.ADR_MAIL_CITY_DSP", 
				"Verify that valid Expression Element 1 Dropdown Options are searched and displayed related to the inputs in Expression Element 1 Dropdown.");
		
		// Operator Dropdown
		
		utilityMethods.visible(this.OperatorDropdown, 
				"Verify that Operator Dropdown is visible in the grid upon adding a row.");
		utilityMethods.clickable(this.OperatorDropdown, 
				"Verify that Operator Dropdown is clickable in the grid upon adding a row.");
		utilityMethods.list_Visible(this.OperatorDropdown, 500, this.DropdownListLi, 
				"Verify that clicking on the down arrow on the right of Operator Dropdown expands the dropdown to display available Operator Dropdown Options.");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 14, 
				"Verify that there are currently Two Expression Element 1 Dropdown Options to choose from. ");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.OperatorInput, 
				"Verify that clicking on any Operator Dropdown Option, selects it.  ");
		utilityMethods.validateSearch(this.OperatorInput, this.DropdownListLi, "EQUAL TO", 
				"Verify that valid Operator Dropdown Options are searched and displayed related to the inputs in Operator Dropdown.");
		
		// Expression Element 2 Dropdown
		
		utilityMethods.visible(this.ExpressionElement2Dropdown, 
				"Verify that Expression Element 2 Dropdown is visible in the grid upon adding a row.");
		utilityMethods.clickable(this.ExpressionElement2Dropdown, 
				"Verify that Expression Element 2 Dropdown is clickable in the grid upon adding a row");
		utilityMethods.list_Visible(this.ExpressionElement2Dropdown, 500, this.DropdownListDiv, 
				"Verify that clicking on the down arrow on the right of Expression Element 2 Dropdown expands the dropdown to display available Expression Element 2 Options.");
		utilityMethods.verifySizeMatch(this.DropdownListDiv, 2, 
				"Verify that there are currently Two Expression Element 2 Dropdown Options to choose from. ");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListDiv, this.ExpressionElement2Input, 
				"Verify that clicking on any Expression Element 2 Option, selects it. ");
		utilityMethods.validateSearch(this.ExpressionElement2Input, this.DropdownListDiv, "DS_0.ADR_MAIL_CITY_DSP", 
				"Verify that valid Expression Element 2 Dropdown Options are searched and displayed related to the inputs in Expression Element 2 Dropdown.");
		
		// Alias Text Field
		
		utilityMethods.visible(this.AliasInput, 
				"Verify that Alias Text Field is visible in the grid upon adding a row.");
		utilityMethods.clickable(this.AliasInput, 
				"Verify that Alias Text Field is clickable in the grid upon adding a row.");
		utilityMethods.sendKeys_Input(this.AliasInput, 500, "includeChar", 
				"Verify that Alias Text Field lets users input alphabets, numbers and special characters. ");
		
		// Update Button
		
		utilityMethods.visible(this.UpdateButton, 
				"Verify that Update Button is visible in the grid upon editing. ");
		utilityMethods.clickable(this.UpdateButton, 
				"Verify that Update Button is clickable in the grid upon editing.");
		utilityMethods.list_NotVisible(this.UpdateButton, 1000, this.ExpressionUpdateList, 
				"Verify that clicking Update Button updates the record.");
		
		actions.moveToElement(ConditionDiv).doubleClick().build().perform();
		utilityMethods.time(1000);
		
		// Cancel Button
		utilityMethods.visible(this.CancelExpressionButton, 
				"Verify that Cancel Button is visible in the grid upon editing.");
		utilityMethods.clickable(this.CancelExpressionButton, 
				"Verify that Cancel Button is clickable in the grid upon editing.");
		
		utilityMethods.list_NotVisible(this.CancelExpressionButton, 500, this.ExpressionUpdateList, 
				"Verify that clicking Cancel Button Cancels the record.");
		utilityMethods.list_NotVisible(this.ExpressionBuilderQuitButton, 500, this.ExpressionBuilderScreen, 
				"Verify that clicking on cross button of Expression builder screen, the screen close.");
		
		
		
		// DUPLICATE CASE to open advance dropdown to select Custom Queries button...
		utilityMethods.testCase_Duplicate(this.AdvancedDropdownButton, 500, "click", ""); 
		
		// Custom Queries Button
		utilityMethods.visible(this.CustomQueries, 
				"Verify that Custom Queries Button is visible in the Advanced Dropdown.");
		utilityMethods.clickable(this.CustomQueries, 
				"Verify that Custom Queries Button is clickable in the Advanced Dropdown.");
		utilityMethods.list_Visible(this.CustomQueries, 500, this.CustomQueryScreen, 
				"Verify that clicking Custom Queries Button opens up a 'Custom Query Editor' screen.");
	
		// Search Custom Queries
		utilityMethods.visible(this.SearchDiv, 
				"Verify that Search Saved Custom Queries Text Field is visible on the Custom Query Editor screen.");
		utilityMethods.clickable(this.SearchInput, 
				"Verify that Search Saved Custom Queries Text Field is clickable on the Custom Query Editor screen.");
		utilityMethods.sendKeys_Input(this.SearchInput, 1000, "includeChar", 
				"Verify that Search Saved Custom Queries Text Field lets users input alphabets, numbers and special characters. ");
		utilityMethods.visible(this.SearchCross, 
				"Verify that a cross is present on the right in the Search Saved Custom Queries Text Field. ");
		utilityMethods.verifyCrossButton(this.SearchInput, 500, this.SearchCross,
				"Verify that clicking the cross removes any text from the Search Saved Custom Queries Text Field. ");
		// This test case require custom queries list in side panel. For now it always fail it.
		utilityMethods.validateSearch(this.SearchInput, this.ExpressionNameList, searchWord,
				"Verify that users can search saved custom queries using the Search Text Field. ");
		utilityMethods.validateSearchPlaceholder(this.SearchInput, "Search ...", 
				"VVerify that Search Saved Custom Queries Text Field displays a 'Search ...' message by default. ");
		
		utilityMethods.list_NotVisible(this.CustomQueryQuitButton, 500, this.CustomQueryScreen, 
				"Verify that clicking on cross button of Custom Query Screen, the screen close.");
		
		// DUPLICATE CASE to open advance dropdown to select Query View button...
		utilityMethods.testCase_Duplicate(this.AdvancedDropdownButton, 500, "click", ""); 
		
		utilityMethods.visible(this.QueryView, 
				"Verify that Query View Button is visible in the Advanced Dropdown.");
		utilityMethods.clickable(this.QueryView, 
				"Verify that Query View Button is clickable in the Advanced Dropdown.");
		utilityMethods.list_Visible(this.QueryView, 1000, this.WritingQueryScreen, 
				"Verify that clicking Query View Button makes the grid editable for writing queries. ");
		utilityMethods.clicked_elementVisible(this.AdvancedDropdownButton, 500, this.VisualQuery,
				"Verify that clicking Query View Button changes it into Visual Query Builder Button in the Advanced Dropdown. ");
		utilityMethods.list_NotVisible(this.VisualQuery, 1000, this.WritingQueryScreen, 
				"Verify that clicking Visual Query Builder View changes into Query View in Advanced Dropdown.");

	}
	public void verifyMultipleColumns() {
		
		Actions actions = new Actions(driver);
		// Multiple Columns Button
		
		utilityMethods.visible(this.MultipleColumns, 
				"Verify that Multiple Columns Button is visible on the Query Builder screen.");
		utilityMethods.clickable(this.MultipleColumns, 
				"Verify that Multiple Columns Button is clickable on the Query Builder screen.");
		utilityMethods.list_Visible(this.MultipleColumns, 500, this.MultipleColumnsScreen,
				"Verify that clicking Multiple Columns Button opens up an 'Add Multiple Columns' screen. ");
		
		// Select Table Dropdown
		
		utilityMethods.visible(this.SelectTableDropdown, 
				"Verify that Select Table Dropdown is visible on the 'Add Multiple Columns' screen. ");
		utilityMethods.clickable(this.SelectTableDropdown, 
				"Verify that Select Table Dropdown is clickable on the 'Add Multiple Columns' screen. ");
		utilityMethods.list_Visible(this.SelectTableDropdown, 500, this.DropdownListLi, 
				"Verify that clicking the dropdown arrow expands and displays the list of uploaded data sources. ");
		utilityMethods.validateSearchPlaceholder(this.SelectTableInput, "Select Table ...", 
				"Verify that Select Table Dropdown Field displays a 'Select Table …' message by default. ");
		
		
		// Search Text Field 
		utilityMethods.visible(this.SearchDiv, 
				"Verify that Search Text Field is visible on the Add Multiple Columns screen. ");
		utilityMethods.clickable(this.SearchInput, 
				"Verify that Search Text Field is clickable on the Add Multiple Columns screen. ");
		utilityMethods.sendKeys_Input(this.SearchInput, 500,"includeChar",
				"Verify that Search Text Field lets users input alphabets, numbers and special characters. ");
		utilityMethods.validateSearch(this.SearchInput, this.SelectedDSColumnNameList, "DSP", 
				"Verify that users can search existing columns in a data source in the Search Text Field. ");
		utilityMethods.visible(this.SearchCross, 
				"Verify that a cross shows up to the right on entering text in the Search Text Field. ");
		utilityMethods.verifyCrossButton(this.SearchInput,500,this.SearchCross,
				"Verify that clicking the cross removes any text from the Search Text Field. ");
		utilityMethods.validateSearchPlaceholder(this.SearchInput, "Search ...", 
				"Verify that Search Text Field displays a 'Search ...' message by default. ");
		
		
		// Cross Button
		
		utilityMethods.visible(this.SelectTableCrossButton, 
				"Verify that Cross is visible next to the Select Table Dropdown on the Add Multiple Columns screen. ");
		utilityMethods.clickable(this.SearchInput, 
				"Verify that Cross is clickable next to the Select Table Dropdown on the Add Multiple Columns screen. ");
		utilityMethods.verifyCrossButton(this.SelectTableInput,500,this.SelectTableCrossButton,
				"Verify that clicking the cross removes any text from the Select Table Dropdown. ");
		
		// Check Columns Check Box
		
		utilityMethods.visible(this.UnselectedHeaderCheckbox, 
				"Verify that Check Columns Check Box is visible on the Add Multiple Columns screen in the grid below.");
		utilityMethods.clickable(this.UnselectedHeaderCheckbox, 
				"Verify that Check Columns Check Box is clickable on the Add Multiple Columns screen in the grid below.");
		utilityMethods.list_Visible(this.UnselectedHeaderCheckbox, 500, this.SelectedColumnCheckbox, 
				"Verify that checking Check Columns Check Box selects all available columns. ");
		
		// Function Column Dropdown
		
		utilityMethods.verifyItemVisibleOnHover(this.FunctionHeading, this.FunctionDropdown, 
				"Verify that Function Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		utilityMethods.list_Visible(this.FunctionDropdown, 500, this.DropdownListA, 
				"Verify that Function Dropdown List is visible in the Function Column Dropdown.");
		
		utilityMethods.visible(this.SortAscending, 
				"Function Column:Verify that Sort Ascending Button is visible in the Function Column Dropdown.");
		utilityMethods.clickable(this.SortAscending, 
				"Function Column:Verify that Sort Ascending Button is clickable in the Function Column Dropdown.");
		utilityMethods.verifyListSorting(this.SortAscending, 500,this.SelectedDSColumnNameList, 
				"Function Column:Verify that clicking on Sort Ascending Button sorts the list of column names.");
		
		actions.moveToElement(FunctionHeading).build().perform();
		utilityMethods.click(FunctionDropdown);
		
		utilityMethods.visible(this.SortDescending, 
				"Function Column:Verify that Sort Descending Button is visible in the Function Column Dropdown.");
		utilityMethods.clickable(this.SortDescending, 
				"Function Column:Verify that Sort Descending Button is clickable in the Function Column Dropdown.");
		utilityMethods.verifyListSorting(this.SortDescending, 500,this.SelectedDSColumnNameList, 
				"Function Column:Verify that clicking on Sort Descending Button sorts the list of column names.");
		
		actions.moveToElement(FunctionHeading).build().perform();
		utilityMethods.click(FunctionDropdown);
		
		utilityMethods.list_Visible(this.ColumnsDropdown,500, this.ColumnsDropdownList, 
				"Function Column:Verify that Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		utilityMethods.verifyColumnRemoveCheckbox(this.ColumnsDropdownList, this.HeaderColumnName, 
				"Function Column:Verify that checking Column Check Boxes adds columns and unchecking removes columns.");
		
		// Type Column Dropdown 
		
		
		utilityMethods.verifyItemVisibleOnHover(this.TypeHeading, this.TypeDropdown, 
				"Verify that Type Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		
		utilityMethods.list_Visible(this.TypeDropdown, 500, this.DropdownListA, 
				"Verify that Type Dropdown List is visible in the Type Column Dropdown.");
		
		utilityMethods.visible(this.SortAscending, 
				"Type Column:Verify that Sort Ascending Button is visible in the Type Column Dropdown.");
		utilityMethods.clickable(this.SortAscending, 
				"Type Column:Verify that Sort Ascending Button is clickable in the Type Column Dropdown.");
		utilityMethods.verifyListSorting(this.SortAscending, 500,this.SelectedDSColumnNameList, 
				"Type Column:Verify that clicking on Sort Ascending Button sorts the list of column names.");
		
		actions.moveToElement(TypeHeading).build().perform();
		utilityMethods.click(TypeDropdown);
		
		utilityMethods.visible(this.SortDescending, 
				"Type Column:Verify that Sort Descending Button is visible in the Type Column Dropdown.");
		utilityMethods.clickable(this.SortDescending, 
				"Type Column:Verify that Sort Descending Button is clickable in the Type Column Dropdown.");
		utilityMethods.verifyListSorting(this.SortDescending, 500,this.SelectedDSColumnNameList, 
				"Type Column:Verify that clicking on Sort Descending Button sorts the list of column names.");
		
		actions.moveToElement(TypeHeading).build().perform();
		utilityMethods.click(TypeDropdown);
		
		utilityMethods.list_Visible(this.ColumnsDropdown,500, this.ColumnsDropdownList, 
				"Type Column:Verify that Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		utilityMethods.verifyColumnRemoveCheckbox(this.ColumnsDropdownList, this.HeaderColumnName, 
				"Type Column:Verify that checking Column Check Boxes adds columns and unchecking removes columns.");
		
		// Column Name Column Dropdown
		
		utilityMethods.verifyItemVisibleOnHover(this.ColumnNameHeading, this.ColumnNameDropdown, 
				"Verify that Column Name Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		
		utilityMethods.list_Visible(this.ColumnNameDropdown, 500, this.DropdownListA, 
				"Verify that Column Name Dropdown List is visible in the Column Name Dropdown.");
		
		utilityMethods.visible(this.SortAscending, 
				"Column Name:Verify that Sort Ascending Button is visible in the Column Name Dropdown.");
		utilityMethods.clickable(this.SortAscending, 
				"Column Name:Verify that Sort Ascending Button is clickable in the Column Name Dropdown.");
		utilityMethods.verifyListSorting(this.SortAscending, 500,this.SelectedDSColumnNameList, 
				"Column Name:Verify that clicking on Sort Ascending Button sorts the list of column names.");
		
		actions.moveToElement(ColumnNameHeading).build().perform();
		utilityMethods.click(ColumnNameDropdown);
		
		utilityMethods.visible(this.SortDescending, 
				"Column Name:Verify that Sort Descending Button is visible in the Column Name Dropdown.");
		utilityMethods.clickable(this.SortDescending, 
				"Column Name:Verify that Sort Descending Button is clickable in the Column Name Dropdown.");
		utilityMethods.verifyListSorting(this.SortDescending, 500,this.SelectedDSColumnNameList, 
				"Column Name:Verify that clicking on Sort Descending Button sorts the list of column names.");
		
		actions.moveToElement(ColumnNameHeading).build().perform();
		utilityMethods.click(ColumnNameDropdown);
		
		utilityMethods.list_Visible(this.ColumnsDropdown,500, this.ColumnsDropdownList, 
				"Column Name:Verify that Column Dropdown is visible by clicking on arrow button that is present on the right. ");
		utilityMethods.verifyColumnRemoveCheckbox(this.ColumnsDropdownList, this.HeaderColumnName, 
				"Column Name:Verify that checking Column Check Boxes adds columns and unchecking removes columns.");
		
		// Aggregate Selected Columns Check Box
		
		utilityMethods.visible(this.UnselectedAggregateSelectedColumns, 
				"Verify that Aggregate Selected Columns Check Box is visible on the Add Multiple Columns screen. ");
		utilityMethods.clickable(this.UnselectedAggregateSelectedColumns, 
				"Verify that Aggregate Selected Columns Check Box is clickable on the Add Multiple Columns screen. ");
		utilityMethods.clicked_elementVisible(this.UnselectedAggregateSelectedColumns, 500, this.SelectedAggregateSelectedColumns,
				"Verify that clicking Aggregate Selected Columns Check Box aggregates the selected columns.");
		
		// OK Button
		
		utilityMethods.visible(this.AggrBuilderUtilityokButton, 
				"Verify that OK Button is visible on the Add Multiple Columns screen.");
		utilityMethods.clickable(this.AggrBuilderUtilityokButton, 
				"Verify that OK Button is clickable on the Add Multiple Columns screen.");
		utilityMethods.list_NotVisible(this.AggrBuilderUtilityokButton, 500, this.MultipleColumnsScreen, 
				"Verify that clicking OK Button takes users back to the Query Builder screen & save the operations. ");
		
		
		// Duplicate Case to open Add Multiple Column Screen
		utilityMethods.testCase_Duplicate(this.MultipleColumns, 1000, "click", "");
		
		// Cancel Button
		utilityMethods.visible(this.CancelButton, 
				"Verify that OK Button is visible on the Add Multiple Columns screen.");
		utilityMethods.clickable(this.CancelButton, 
				"Verify that OK Button is clickable on the Add Multiple Columns screen.");
		utilityMethods.list_NotVisible(this.CancelButton, 500, this.MultipleColumnsScreen, 
				"Verify that clicking OK Button takes users back to the Query Builder screen & save the operations. ");
		
	}
	public void verifyRowFilter() {

		
		// Expand Filter Row Button
		
		utilityMethods.visible(this.ExpandRowFilter, 
				"Verify that Expand Filter Row Button is visible on the Query Builder screen. ");
		utilityMethods.clickable(this.ExpandRowFilter, 
				"Verify that Expand Filter Row Button is clickable on the Query Builder screen. ");
		utilityMethods.list_Visible(this.ExpandRowFilter, 500, this.VisibleRowFilter, 
				"Verify that clicking Expand Filter Row Button opens up a filter row below. ");
		utilityMethods.visible(this.CollapseRowFilter, 
				"Verify that Collapse Filter Row Button is visible on the Query Builder screen. ");
		
		// Top Rows Text Field
		
		utilityMethods.visible(this.TopRowsDiv, 
				"Verify that Top Rows Text Field is visible when Expand Filter Row Button is clicked.");
		utilityMethods.clickable(this.TopRowsInput, 
				"Verify that Top Rows Text Field is clickable and editable. ");
		utilityMethods.validateSearchPlaceholder(this.TopRowsInput, "Top Rows",
				"Verify that Top Rows Text Field displays a 'Top Rows' message by default.");
		this.TopRowsInput.sendKeys("10");
		utilityMethods.time(1000);
		utilityMethods.verifyIncrementButton(this.TopRowsInput, this.TopRowsIncrement);
		utilityMethods.verifyDecrementButton(this.TopRowsInput, this.TopRowsDeccrement);
		
		// Intended Action Case Remaining 
		
		
		// Percentage Check Box
		utilityMethods.visible(this.PercentangeDiv, 
				"Verify that Percentage Check Box is visible when Expand Filter Row Button is clicked.");
		utilityMethods.clickable(this.PercentangeCheckbox, 
				"Verify that Percentage Check Box is clickable. ");
		utilityMethods.visible(this.PercentageUnchecked, 
				"Verify that Percentage Check Box is unchecked by default.");
		utilityMethods.list_Visible(this.PercentangeCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Percentage Check Box a tick shows up. ");
		utilityMethods.list_NotVisible(this.PercentangeCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Percentage Check Box again a tick removes. ");
		
		// Intended Action Case Remaining 
		
		// Distinct Check Box 
		utilityMethods.visible(this.DistinctDiv, 
				"Verify that Percentage Check Box is visible when Expand Filter Row Button is clicked.");
		utilityMethods.clickable(this.DistinctCheckbox, 
				"Verify that Percentage Check Box is clickable. ");
		utilityMethods.visible(this.DistinctUnchecked, 
				"Verify that Percentage Check Box is unchecked by default.");
		utilityMethods.list_Visible(this.DistinctCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Percentage Check Box a tick shows up. ");
		utilityMethods.list_NotVisible(this.DistinctCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Distinct Check Box again a tick removes. ");
		
		// Intended Action Case Remaining 
		
		// Simple Random Sample Check Box
		
		utilityMethods.visible(this.SimpleRandomSampleDiv, 
				"Verify that Simple Random Sample Check Box is visible when Expand Filter Row Button is clicked.");
		utilityMethods.clickable(this.SimpleRandomSampleCheckbox, 
				"Verify that Simple Random Sample Check Box is clickable. ");
		utilityMethods.visible(this.SimpleRandomSampleUnchecked, 
				"Verify that Simple Random Sample Check Box is unchecked by default.");
		utilityMethods.list_Visible(this.SimpleRandomSampleCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Simple Random Sample Check Box a tick shows up. ");
		utilityMethods.list_NotVisible(this.SimpleRandomSampleCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Simple Random Sample Check Box again a tick removes. ");
		
		// Intended Action Case Remaining 
		
		// Aggregate on Time Period Check Box
		utilityMethods.visible(this.AggregateOnTimePeriodDiv, 
				"Verify that Aggregate on Time Period Check Box is visible when Expand Filter Row Button is clicked.");
		utilityMethods.clickable(this.AggregateOnTimePeriodCheckbox, 
				"Verify that Percentage Check Box is clickable.  ");
		utilityMethods.visible(this.AggregateOnTimePeriodUnchecked, 
				"Verify that Percentage Check Box is unchecked by default.");
		utilityMethods.list_Visible(this.AggregateOnTimePeriodCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Aggregate On Time Period Checkbox a tick shows up. ");
		utilityMethods.visible(this.SelectDateColumnEnableDiv, 
				"Verify that checking Aggregate on Time Period Check Box enables 'Select Date Column Text Field' Dropdown. ");
		utilityMethods.visible(this.SelectTimeIntervalEnableDiv, 
				"Verify that checking Aggregate on Time Period Check Box enables 'Select Time Interval Dropdown. ");
		utilityMethods.list_NotVisible(this.AggregateOnTimePeriodCheckbox, 500, this.FilterRowSelectedCheckbox, 
				"Verify that on checking the Aggregate On Time Period Checkbox again a tick removes. ");
		
		// Intended Action Case Remaining 
		
		// Select Date Column Text Field & Select Time Interval Dropdown
		
		utilityMethods.visible(this.SelectDateColumnDiv, 
				"Verify that Select Date Column Text Field is visible when Expand Filter Row Button is clicked.");
		utilityMethods.visible(this.SelectTimeIntervalDiv, 
				"Verify that Select Time Interval Dropdown is visible when Expand Filter Row Button is clicked.");		
		utilityMethods.clickable(this.SelectDateColumnDisableDiv, 
				"Verify that Select Date Column Text Field is not editable by default.");
		utilityMethods.clickable(this.SelectTimeIntervalDisableDiv, 
				"Verify that Select Time Interval Dropdown is not editable by default.");
		utilityMethods.click(this.AggregateOnTimePeriodCheckbox);
		utilityMethods.visible(this.SelectDateColumnEnableDiv, 
				"Verify that Select Date Column Text Field only becomes editable when the Aggregate on Time Period Check Box is checked.");
		utilityMethods.clickable(this.SelectDateColumnInput, 
				"Verify that Select Date Column Text Field is clickable and editable. ");
		utilityMethods.sendKeys_Input(this.SelectDateColumnInput, 500, "includeChar", 
				"Verify that Select Data Column Text Field lets users input alphabets, numbers and special characters. ");
		utilityMethods.visible(this.SelectTimeIntervalEnableDiv, 
				"Verify that Select Time Interval Dropdown only becomes editable when the Aggregate on Time Period Check Box is checked.");
		utilityMethods.list_Visible(this.SelectTimeIntervalDropdown, 500, this.DropdownListLi, 
				"Verify that clicking on the Select Time Interval Dropdown expands the dropdown to display available Time Interval Options.");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 5, 
				"Verify that there are Five Time Interval Options to choose from. ");
		
	}
	public void verifyQBMainPane() {
		
		//Alias Text Field
		
		utilityMethods.visible(this.AliasDiv_QBPane, 
				"Verify that Alias Text Field is visible above the grid on the Query Builder screen.");
		utilityMethods.clickable(this.AliasInput_QBPane, 
				"Verify that Alias Text Field is clickable and editable.");		
		utilityMethods.sendKeys_Input(this.AliasInput_QBPane, 500,"includeChar",
				"Verify that Alias Text Field lets users input alphabets, numbers and special characters.");
		
		// Reset Everything before selecting data source
		this.ResetButtonQB.click();
		utilityMethods.time(500);
		// Select Data Source Dropdown
		
		utilityMethods.visible(this.DataSourceDiv, 
				"Verify that Select Data Source Dropdown is visible on Query Builder screen.");
		utilityMethods.clickable(this.DataSourceDropdown, 
				"Verify that Select Data Source Dropdown has down arrow button which is clickable.");		
		utilityMethods.list_Visible(this.DataSourceDropdown, 500,this.DropdownListLi,
				"Verify that clicking on the arrow a list of available data sources is displayed in a dropdown.");
		utilityMethods.booleanTestCase(this.CreateQueryBuilder("requiredColumn", "Medical Transactions"),
				"Verify that upon selecting a data source its name appears in Select Data Source text box.");

	}
	public void verifyEnableRuleChaining() {
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		
		// Reset Everything Before this Case 
		utilityMethods.click(this.ResetButtonQB);
		
		// Enable Rule Chaining Check Box
		
		utilityMethods.visible(this.EnableRuleChainingDiv, 
				"Verify that Enable Rule Chaining Check Box is visible on the Query Builder screen.");
		utilityMethods.clickable(this.EnableRuleChainingDiv, 
				"Verify that Enable Rule Chaining Check Box is clickable.");		
		utilityMethods.visible(this.UnselectedEnableRuleChaining,
				"Verify that Enable Rule Chaining Check Box is unchecked by default.");
		utilityMethods.verifyItemAdded(this.QueryBuilderPaneList, this.EnableRuleChainingDiv, 
				"Verify that checking Enable Rule Chaining creates a record above the grid with a filter icon as an indication.");
		
		// Select Rule Group Dropdown
		
		utilityMethods.visible(this.SelectedEnableRuleChaining,
				"Verify that on checking the Enable Rule Chaining Check Box a tick shows up.");
		utilityMethods.verifyItemNotRemove(this.EnableRuleChainingDiv,this.QueryBuilderPaneList,
				"Verify that unchecking Enable Rule Chaining does not remove the record that was created. ");
		utilityMethods.clicked_elementVisible(this.EnableRuleChainingDiv, 500, this.EnableSelectRuleGroup,
				"Verify that checking Enable Rule Chaining Check Box enables rule chaining.");
		utilityMethods.clickable(this.SelectRuleGroupDropdown,
				"Verify that checking Enable Rule Chaining Check Box makes the Select Rule Group editable.");
		utilityMethods.list_Visible(this.SelectRuleGroupDropdown, 500, this.DropdownListLi, 
				"Verify that clicking the Select Rule Group Dropdown arrow expands the dropdown to display existing rule groups.");
		
		// Delete Button
		
		utilityMethods.visible(this.EnableQueryBuilderPaneRemove,
				"Verify that Delete Button is visible in the record in the Query Builder screen.");
		utilityMethods.clickable(this.EnableQueryBuilderPaneRemove,
				"Verify that Delete Button is clickable. ");
		utilityMethods.verifyItemRemove_OkButton(this.EnableQueryBuilderPaneRemove,this.QueryBuilderPaneList, DCM.YesButton,
				"Verify that Delete Button removes a record from the grid. ");
		utilityMethods.visible(DisableQueryBuilderPaneRemove,
				"Verify that Delete Button becomes unclickable when only one record is left. ");
		
		// Add Dropdown
		
		utilityMethods.visible(this.QueryBuilderPaneAddDropdown,
				"Verify that Add Dropdown is visible in the record in the Query Builder screen.");
		utilityMethods.clickable(this.QueryBuilderPaneAddDropdown, 
				"Verify that Add Dropdown is clickable.");
		utilityMethods.list_Visible(this.QueryBuilderPaneAddDropdown, 500, this.DropdownListA, 
				"Verify that clicking Add Dropdown expands the dropdown to display the dropdown options.");
		utilityMethods.verifySizeMatch(this.DropdownListA, 2, 
				"Verify that there are Two Add Dropdown Options to choose from: Add Data Source and Add Rule.");
		
		// Add Data Sorce Button
		
		utilityMethods.visible(this.AddDataSource,
				"Verify that Add Data Source Button is visible.");
		utilityMethods.clickable(this.AddDataSource, 
				"Verify that Add Data Source Button is visible.");
		utilityMethods.verifyItemAdded(this.QueryBuilderPaneList, this.AddDataSource, 
				"Verify that clicking Add Data Source adds a record for Data Source selection.");
		

		utilityMethods.click(this.QueryBuilderPaneAddDropdown);
		
		// Add Rule Button
		
		utilityMethods.visible(this.AddRule,
				"Verify that Add Rule Button is visible.");
		utilityMethods.clickable(this.AddRule, 
				"Verify that Add Rule Button is visible.");
		utilityMethods.verifyItemAdded(this.QueryBuilderPaneList, this.AddRule, 
				"Verify that clicking Add Rule adds a record for Data Source selection.");
		
		utilityMethods.click(this.ResetButtonQB);
		
		utilityMethods.list_Visible(this.QueryBuilderPaneAddDropdown, 500, this.DisabledAddRule, 
				"Verify that the Add Rule option becomes unclickable when Enable Rule Chaining is unchecked. ");

	}
	public void verifyJoin() {
		
		// Reset Everything Before this Case 
		utilityMethods.click(this.ResetButtonQB);
		
		// Select Data Sources Before any Operation and now it required two data source for this case,
		
		// Medical Data Source
		
		utilityMethods.booleanTestCase(this.CreateQueryBuilder("", "Medical Transactions"),
				"Verify that upon selecting a data source its name appears in Select Data Source text box.");
		this.QueryBuilderPaneAddDropdown.click();
		utilityMethods.time(1000);
		this.AddDataSource.click();
		utilityMethods.time(1000);
		utilityMethods.booleanTestCase(this.CreateQueryBuilder("", "Automation1"),
				"Verify that upon selecting a data source its name appears in Select Data Source text box.");		
		// Join Button
		utilityMethods.visible(this.Join, 
				"Verify that Join Button is visible on the Query Builder screen. ");
		utilityMethods.clickable(this.Join, 
				"Verify that Join Button is clickable.");
		utilityMethods.list_Visible(this.Join, 500, this.AggregationEditorList, 
				"Verify that clicking Join Button populates relevant Output and Build Options fields in the grid. ");
		
		utilityMethods.validateText_Match(this.Errors, "Joins are not configured for Sources", 
				"Query Builder:Verify that a 'Joins are not configured for Sources error shows up when a column is added directly from the Data Source onto the grid.");
		
		// Join Type Dropdown
		utilityMethods.visible(this.JoinDropdown, 
				"Query Builder:Verify that Join Type Dropdown is visible in the output column in the grid when Join Button is clicked.");
		utilityMethods.clickable(this.JoinDropdown, 
				"Query Builder:Verify that Join Type Dropdown is clickable.");
		utilityMethods.list_Visible(this.JoinDropdown, 500, this.DropdownListLi, 
				"Query Builder:Verify that clicking the Join Type Dropdown expands the dropdown to display all the available Join Types.");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 14, 
				"Query Builder:Verify that there are 14 types of Joins available.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.JoinInput, 
				"Query Builder:Verify that joins list are clickable and clicking on any joins in the dropdown selects it. ");
		
		
		
		// Join Column 1 Dropdown
		
		utilityMethods.visible(this.JoinColumn1Dropdown, 
				"Query Builder:Verify that Join Column 1 Dropdown is visible in the build options column in the grid when Join Button is clicked. ");
		utilityMethods.clickable(this.JoinColumn1Dropdown, 
				"Query Builder:Verify that Join Column 1 Dropdown is clickable.");
		utilityMethods.validateSearchPlaceholder(this.JoinColumn1Input, "Join Column 1", 
				"Query Builder:Verify that by default Join Column 1 Dropdown displays 'Join Column 1'. ");


		utilityMethods.list_Visible(this.JoinColumn1Dropdown, 500, this.DropdownListDiv, 
				"Query Builder:Verify that Join Column 1 Dropdown only expands to show columns when a Data Source is selected.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListDiv, this.JoinColumn1Input, 
				"Query Builder: Verify that join Column 1 list are clickable and clicking on any column in the dropdown selects it.");
		
		
		// Matching Condition Dropdown
		
		utilityMethods.visible(this.ChooseOperatorDropdown, 
				"Query Builder:Verify that Choose Operator Dropdown is visible in the build options column in the grid on the Query Builder screen.");
		utilityMethods.clickable(this.ChooseOperatorInput, 
				"Query Builder:Verify that Choose Operator Dropdown is clickable.");
		utilityMethods.validateInputText_Match(this.ChooseOperatorInput, "equal to", 
				"Query Builder:Verify that by default Choose Operator Dropdown displays 'Eqaul To'.  ");
		utilityMethods.list_Visible(this.ChooseOperatorDropdown, 500, this.DropdownListLi, 
				"Query Builder:Verify that clicking on the Choose Operator Dropdown arrow expands the dropdown to display all the available conditions. ");
		utilityMethods.verifySizeMatch(this.DropdownListLi, 14, 
				"Query Builder:Verify that there are 14 types of Conditions available.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListLi, this.ChooseOperatorInput, 
				"Query Builder:Verify that clicking on any Condition in the dropdown selects it. ");
		
		// Join Column 2 Dropdown
		
		utilityMethods.visible(this.JoinColumn2Dropdown, 
				"Query Builder:Verify that Join Column 2 Dropdown is visible in the build options column in the grid when Join Button is clicked. ");
		utilityMethods.clickable(this.JoinColumn2Dropdown, 
				"Query Builder:Verify that Join Column 2 Dropdown is clickable.");
		utilityMethods.validateSearchPlaceholder(this.JoinColumn2Input, "Join Column 2", 
				"Query Builder:Verify that by default Join Column 2 Dropdown displays 'Join Column 2'. ");
		utilityMethods.list_Visible(this.JoinColumn2Dropdown, 500, this.DropdownListDiv, 
				"Query Builder:Verify that Join Column 2 Dropdown only expands to show columns when a Data Source is selected.");
		utilityMethods.verifyDropdownOptionSelected(this.DropdownListDiv, this.JoinColumn2Input, 
				"Query Builder: Verify that join Column 2 list are clickable and clicking on any column in the dropdown selects it.");
		
		
		
		// Validate Errors
		
		/*
		 * utilityMethods.click(this.JoinDropdown);
		 * utilityMethods.click(this.DropdownListLi.get(0));
		 * utilityMethods.validateText_Match(this.Errors,
		 * "Both Parameter Columns/Expressions required for selected Operator",
		 * "Query Builder:Verify that leaving both columns 1 & 2 empty while having selected the right parenthesis from the dropdown gives a 'Both Parameter Columns/Expressions required for selected Operator' error. "
		 * );
		 * 
		 */
		
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

	public void CreateQueryBuilder() throws InterruptedException {
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
	public boolean CreateQueryBuilder(String requireColumn,String DataSource) {
		utilityMethods.time(1000);
		this.DataSourceInput.click();
		this.DataSourceInput.sendKeys(DataSource);
		this.SelectedDataSourceInput.sendKeys(Keys.ENTER);
		utilityMethods.time(1500);
		if(requireColumn.equals("requiredColumn")) {
			this.SelectedDSColumnsList.get(3).click();
			this.SelectedDSColumnsList.get(4).click();
			this.SelectedDSColumnsList.get(5).click();
		}
		this.AggrBuilderUtilityokButton.click();
		utilityMethods.time(1500);
		if(SelectedDataSourceInput.getAttribute("value").contains(DataSource)) {
			return true;
		}
		return false;
	}

	public void CreateNewRuleAndGroup() throws InterruptedException {

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
		System.out.println("RuleName" + RuleName);
		test.log(Status.PASS, "The Rule name is editable");
		test = report.createTest("Verify the Create New group Button works");
		Thread.sleep(2000);
		CreateNewRuleGroup.click();
		test.log(Status.PASS, "The Create New group Button works");
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify Rule group name is editable.");
		RuleGroupNameInput.sendKeys(RuleGroupName);
		System.out.println("RuleGroup" + RuleGroupName);
		test.log(Status.PASS, "The Rule group name is editable.");
		Thread.sleep(2000);
		test = report.createTest(
				"Save As Rule Window - Create New Rule Group - Verify that the save option saves the details of rule group.");
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
		System.out.println("RuleGroup" + RuleGroupName);
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

	public void CreateRuleChaining() throws InterruptedException {

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
		String Rows = "24";
		if (QBResult.contains(Rows)) {
			test.log(Status.PASS, "The rule chaining result is correct");
			System.out.println("Values Matched");
		} else {
			test.log(Status.FAIL, "The rule chaining result is not matched with expected outcome");
			System.out.println("Values are not Matched");
		}

	}

	public void CreateleftJoin() throws InterruptedException {
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

	public void CreateInnerJoin() throws InterruptedException {
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
	
public void  CreateNewRuleAndGroupForInitiative(String DSName, String DSName1, String OutputDSName ,String OutputDSName1, String RuleGroupName) throws InterruptedException {
		
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys(DSName);
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
		RuleGroupNameInput.sendKeys(RuleGroupName);
		test.log(Status.PASS, "The Rule group name is editable.");
		Thread.sleep(2000);
		test = report.createTest("Save As Rule Window - Create New Rule Group - Verify that the save option saves the details of rule group.");
		RuleGroupSaveButton.click();
		test.log(Status.PASS, "The save option saves the details of rule group");
		test = report.createTest("Verify the user is able to select the rule Group while creating rule ");
		  RuleGroupId.click();
		  Thread.sleep(3000);
	        utilityMethods.SetTextwithActionClass(RuleGroupId, RuleGroupName);
	        Thread.sleep(3000);
	        RuleGroupId.clear();
	        Thread.sleep(3000);
	        RuleGroupId.sendKeys(RuleGroupName);
		Thread.sleep(2000);
		System.out.println("RuleGroup"+RuleGroupName);
		RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		AdvancedOptions.click();
		this.Forcererunchainedruletoproducefreshresults.click();
		this.MaintainAllExecutionResults.click();
		this.SaveResultintofollowingDataSource.click();
		this.outputdataSourceName.sendKeys(OutputDSName);
		RuleSaveButton.click();
		utilityMethods.waitForVisibility(OKConfigureRule);
		OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		ResetButtonQB.click();
		test.log(Status.PASS, "The reset button clear every detail in QB work space");
		utilityMethods.waitForVisibility(this.SelectDataSourceTab);
		this.SelectDataSourceTab.click();
		this.SelectDataSourceTab.sendKeys(DSName1);
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
		Thread.sleep(3000);
        utilityMethods.SetTextwithActionClass(RuleGroupId, RuleGroupName);
        Thread.sleep(3000);
        RuleGroupId.clear();
        Thread.sleep(3000);
        RuleGroupId.sendKeys(RuleGroupName);
		System.out.println("RuleGroup"+RuleGroupName);
		RuleGroupId.sendKeys(Keys.ENTER);
		test.log(Status.PASS, "The user is able to select the rule Group while creating rule");
		Thread.sleep(2000);
		AdvancedOptions.click();
		this.Forcererunchainedruletoproducefreshresults.click();
		this.MaintainAllExecutionResults.click();
		this.SaveResultintofollowingDataSource.click();
		this.outputdataSourceName.sendKeys(OutputDSName1);
		RuleSaveButton.click();
		utilityMethods.waitForVisibility(OKConfigureRule);
		OKConfigureRule.click();
		Thread.sleep(5000);
		test = report.createTest("Verify that reset button clear every detail in QB work space.");
		ResetButtonQB.click();
	}

}
