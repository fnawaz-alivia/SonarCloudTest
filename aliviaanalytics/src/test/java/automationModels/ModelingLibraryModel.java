package automationModels;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import configuration.Configuration;

public class ModelingLibraryModel extends Configuration { 
	public int index;
	public static ExtentTest test;
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Modeling Library' or . = 'Modeling Library')]")

	public WebElement ModelingLibrary;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel singlePanel analysis-modelingLibrary-mainGrid-49 x-fit-item x-panel-default x-grid']//child::input")

	public WebElement SearchTabModelingLibrary;
	
		
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel singlePanel analysis-modelingLibrary-mainGrid-49 x-fit-item x-panel-default x-grid']//child::table//tr//td[2]//div")

	public List<WebElement> ModelingLibraryList;
	
	
	
	public void LandingOnPageModlingLibrary() throws InterruptedException {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		CM.Analysis.click();
		test = report.createTest("Side Pane: Verify that Modeling Library Button is present in Analysis dropdown");
		if (this.ModelingLibrary.isDisplayed()) {
			test.log(Status.PASS, " The Modeling Library Button is present in Analysis dropdown");
		} else {
			test.log(Status.FAIL, " The Modeling Library Button is not present in Analysis dropdown");
		}
		test = report.createTest("Side Pane: Verify that Modeling Library Button is clickable");
		if (this.ModelingLibrary.isEnabled()) {
			test.log(Status.PASS, " Modeling Library Button is clickable");
		} else {
			test.log(Status.FAIL, "Modeling Library Button is not clickable");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on Modeling Library Button navigates to Modeling Library screen");
		this.ModelingLibrary.click();
		Thread.sleep(2000);
		if (this.SearchTabModelingLibrary.isDisplayed()) {
			test.log(Status.PASS, " clicking on Modeling Library Button navigates to Modeling Library screen");
		} else {
			test.log(Status.FAIL, " clicking on Modeling Library Button doesn't navigate to Modeling Library screen");
		}
		
		test = report.createTest("Verify that Search Text Field is visible on the Modeling Library screen. ");
		if (this.SearchTabModelingLibrary.isDisplayed()) {
			test.log(Status.PASS, " The Search Text Field is visible on the Modeling Library screen.");
		} else {
			test.log(Status.FAIL, " The Search Text Field is not visible on the Modeling Library screen.");
		}
		test = report.createTest("Verify that Search Text Field is clickable and editable on the Modeling Library screen. ");
		if (this.SearchTabModelingLibrary.isEnabled()) {
			test.log(Status.PASS, "Search Text Field is clickable and editable on the Modeling Library screen");
		} else {
			test.log(Status.FAIL, "Search Text Field is not clickable and editable on the Modeling Library screen");
		}
		
		
		this.SearchTabModelingLibrary.click();
		
	}
	
	public int CountModlingLibrary() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		CM.Analysis.click();
		this.ModelingLibrary.click();
		this.SearchTabModelingLibrary.click();
		return this.ModelingLibraryList.size();
	}
	
	public void GetIndexOfModel(String model) {
		
		this.SearchTabModelingLibrary.click();
		this.SearchTabModelingLibrary.sendKeys(model);
		List<String> AllModels = new ArrayList<String>();

		for (int i = 0; i < ModelingLibraryList.size(); i++) {

			AllModels.add(ModelingLibraryList.get(i).getText());
		}
		index = AllModels.indexOf(model);
		
	}

	
	

}
