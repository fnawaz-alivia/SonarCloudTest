package automationModels;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansingModel extends Configuration {
	public static ExtentTest test;
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
		test = report.createTest("Side Pane: Verify that Data Cleansing Button is present in Data Repository dropdown");

		if (this.DataCleansing.isDisplayed()) {
			test.log(Status.PASS, "The Data Cleansing Button is present in Data Repository dropdown");
		} else {
			test.log(Status.FAIL, "The Data Cleansing Button is not  present in Data Repository dropdown");
		}
		test = report.createTest("Side Pane: Verify that Data Cleansing Button is clickable");

		if (this.DataCleansing.isEnabled()) {
			test.log(Status.PASS, "The Data Cleansing Button is clickable");
		} else {
			test.log(Status.FAIL, "The Data Cleansing Button is not clickable");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on Data Cleansing Button navigates to 'Data Cleansing' screen");
		this.DataCleansing.click();
		if (this.SelectDSForDataCleansing.isDisplayed()) {
			test.log(Status.PASS, "clicking on Data Cleansing Button navigates to 'Data Cleansing' screen");
		} else {
			test.log(Status.FAIL, "clicking on Data Cleansing Button doesn't  navigate to 'Data Cleansing' screen");
		}
			
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
			test = report.createTest("Verify the user is able to select the operator");
			WebElement Operator =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[6]"));
			utilityMethods.doubleClick(Operator);
			test.log(Status.PASS, "The user is able to select the operator");
			test = report.createTest("Verify the user is able to select the missing operator");
			this.Missing.click();
			test.log(Status.PASS, "The user is able to select the missing operator");
			WebElement Action =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[7]"));
			utilityMethods.doubleClick(Action);
			test = report.createTest("Verify the user is able to select the fillwith action");
			this.FillWith.click();
			test.log(Status.PASS, "The user is able to select the fillwith action");
			test = report.createTest("Verify the user is able to set the value ");
			WebElement Value =driver.findElement(By.xpath("//div[contains(@class, 'dataRepo-dataClean-mainGridTable-grid-039')]//child::table['" +index + "'+'"+ 1 + "']//tr//td[8]"));
			utilityMethods.SetTextwithActionClass(Value, "0");
			test.log(Status.PASS, "The user is able to set the value");
			test = report.createTest("Verify the dataclean execution button works ");
			this.DataCleanExecuteButton.click();
			test.log(Status.PASS, "The dataclean execution button works");
			Thread.sleep(2000);	
		}
	
	public void ExportDataIntoCSV(String fileName) throws InterruptedException {
		test = report.createTest("Export Cleansing Filter results data into CSV ");
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
		test.log(Status.PASS, "The user is able to export Cleansing Filter results data into CSV ");
	}
	
	public void ExportDataIntoExcel(String fileName) throws InterruptedException {
		test = report.createTest("Export Cleansing Filter results data into Excel ");
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
		test.log(Status.PASS, "The user is able to export Cleansing Filter results data into Excel ");
	}	
}