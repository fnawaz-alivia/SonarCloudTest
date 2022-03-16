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
		
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-btn btn-save x-unselectable x-box-item x-toolbar-item x-btn-default-small']")

	public WebElement SaveQBFilterName;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'OK' or . = 'OK')]")

	public WebElement OkButtonQB;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dataRepo-queryBuilder-querybuilderMain-leftPaneGrid-016') ]//preceding::table[1]//td[2]")

	public List<WebElement> QBList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'dataRepo-queryBuilder-AggrBuilderUtility-gridPanel-017') ]//preceding::table[1]//tr//td[1]")

	public List<WebElement> SelectedDSColumnsList;
	
	
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
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		Thread.sleep(2000);
		this.QueryBuilder.click();
		Thread.sleep(2000);
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
	

}
