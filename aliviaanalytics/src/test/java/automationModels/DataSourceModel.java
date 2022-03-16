package automationModels;

import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataSourceModel extends Configuration {
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Data Repository' or . = 'Data Repository')]")

	public WebElement DataRepository;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Manage Data Sources' or . = 'Manage Data Sources')]")

	public WebElement ManageDataSources;
	
	@FindBy(how = How.XPATH, using = "//*[@id='ds-folder-tree-bodyWrap']//child::input")

	public WebElement SearchTabDataSource;
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Microsoft Excel' or . = 'Microsoft Excel')]")

	public WebElement MicrosoftExcel;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'datasourceName']")

	public WebElement DataSourceName;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Upload File' or . = 'Upload File')]")

	public WebElement UploadFileDataSource;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'filefield-') and @type = 'file' and @name = 'file']")

	public WebElement BrowseDataSourceFile;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-uploadFile-saveButton-010']")

	public WebElement SaveUploadFile;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Close' or . = 'Close')]")

	public WebElement CloseUploadDSWindow;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'dataRepo-manageDatasources-saveButton-009']")

	public WebElement SaveDataSoures;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'CSV File' or . = 'CSV File')]")

	public WebElement CSV;
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-component x-border-box x-mask x-component-default' and starts-with(@id, 'loadmask') and @aria-valuetext = 'Processing Data Source...']")

	public WebElement ProcessingDataSourceICon;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='ds-folder-tree-bodyWrap']//child::table//tr//td//span")

	public List<WebElement> DataSourcesList;
	
	
	public int CountDataSources(String DSName) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		this.ManageDataSources.click();
		this.SearchTabDataSource.click();
		this.SearchTabDataSource.clear();
		this.SearchTabDataSource.sendKeys(DSName);
		Thread.sleep(4000);
		return this.DataSourcesList.size();
	}
	
	public void CreateMicrosoftExcelDS(String DSName, String DSPath) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		
		this.ManageDataSources.click();
		Thread.sleep(2000);
		
		this.SearchTabDataSource.click();
		this.MicrosoftExcel.click();
		PM.PublicOption.click();
		this.DataSourceName.sendKeys(DSName);
		this.UploadFileDataSource.click();
		Thread.sleep(2000);
		
		String FilePathForDS = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\"+DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		this.SaveUploadFile.click();
		Thread.sleep(2000);
		
		this.CloseUploadDSWindow.click();
		Thread.sleep(2000);
		this.SaveDataSoures.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();	
		
	}
	
	public void CreateCSVDS(String DSName, String DSPath) throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.GetStarted.click();
		this.DataRepository.click();
		
		this.ManageDataSources.click();
		Thread.sleep(2000);
		
		this.SearchTabDataSource.click();
		
		this.CSV.click();
		PM.PublicOption.click();
		this.DataSourceName.sendKeys(DSName);
		this.UploadFileDataSource.click();
		Thread.sleep(2000);
		
		String FilePathForDS = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\"+DSPath)
				.toAbsolutePath().toString();
		this.BrowseDataSourceFile.sendKeys(FilePathForDS);
		this.SaveUploadFile.click();
		Thread.sleep(2000);
		
		this.CloseUploadDSWindow.click();
		Thread.sleep(2000);
		this.SaveDataSoures.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();	
		
	}
	
}
