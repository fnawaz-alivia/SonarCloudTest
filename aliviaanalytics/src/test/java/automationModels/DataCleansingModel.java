package automationModels;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansingModel extends Configuration {
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Data Cleansing' or . = 'Data Cleansing')]")

	public WebElement DataCleansing;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and @placeholder = 'Select item ...']")

	public WebElement SelectDSForDataCleansing;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Fill with' or . = 'Fill with')]")

	public WebElement FillWith;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-dataClean-mainGridPane-executeButton-045')]")

	public WebElement DataCleanExecuteButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepo-dataclean-mainGridPane-exportButton-042')]")

	public WebElement DataCleanExportButton;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Missing' or . = 'Missing')]")

	public WebElement Missing;
	 
	@FindBy(how = How.XPATH, using = "//*[@class='x-container x-box-item x-window-item x-container-default x-box-layout-ct']//child::input")

	public WebElement ExportDataCleansingFileName;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table//tr//td[3]//div")

	public List<WebElement> ColumnsOnSelectedDS;

	
	public void LandingOnDataCleansingPage() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DS = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DS.DataRepository.click();
		this.DataCleansing.click();
		
	}
	
	public void SelectDSForDataCleansing() throws InterruptedException {
		Thread.sleep(2000);
	    this.SelectDSForDataCleansing.sendKeys("dental");
	    this.SelectDSForDataCleansing.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
		
	}
	
	public void MissingFillWithValue() throws InterruptedException {
		Thread.sleep(1000);
			List<String> AllColumns = new ArrayList<String>();

			for (int i = 0; i < ColumnsOnSelectedDS.size(); i++) {

				AllColumns.add(ColumnsOnSelectedDS.get(i).getText().split(" ")[0]);
			}
			int index = AllColumns.indexOf("amountallowed");
			System.out.println(index);
			driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[2]")).click();
			WebElement Operator =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[6]"));
			utilityMethods.doubleClick(Operator);
			this.Missing.click();
			WebElement Action =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[7]"));
			utilityMethods.doubleClick(Action);
			this.FillWith.click();
			WebElement Value =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[8]"));
			utilityMethods.SetTextwithActionClass(Value, "0");
			this.DataCleanExecuteButton.click();
			Thread.sleep(2000);	
		}
	
	public void ExportDataIntoCSV(String fileName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);	
		utilityMethods.waitForVisibility(this.DataCleanExportButton);
		this.DataCleanExportButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToCSV.click();
		this.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
	}
	
	public void ExportDataIntoExcel(String fileName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(this.DataCleanExportButton);
		this.DataCleanExportButton.click();
		Thread.sleep(1000);
		DSM.ExportDataToExcel.click();
		this.ExportDataCleansingFileName.sendKeys(fileName);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);

	}	
}