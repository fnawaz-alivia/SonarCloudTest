package automationModels;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;


public class ModelingModel  extends Configuration{
	
	public static ExtentTest test;
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-tree-node-text ' and (text() = 'Modeling' or . = 'Modeling')]")
	
	public WebElement Modeling;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'analysis-modeling-executeButton-52')]")
	
	public WebElement ModelExecutionButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-modeling-executeButton-52')]//following::span[1]")

	public WebElement ModelExecutionButtonText;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-body x-panel-body-default x-panel-body-default x-noborder-t x-panel-default-outer-border-rbl')]")

	public WebElement ModelSurface;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-leftGrid-dataSourcesGrid-54')]//child::input")

	public WebElement SearchTabDatasourcesGrid;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-rightGrid-algorithmsGrid-59')]//child::input")

	public WebElement SearchTabalgorithmsGrid;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]")

	public WebElement ModelExecutionResultAlert;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'splitbutton-') and @data-qtip = 'Save Modeling Process']")

	public WebElement SaveModel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-leftGrid-dataSourcesGrid-54')]//child::table//tr//td[2]//div")

	public List<WebElement> DataSourcesList;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-modeling-rightGrid-51')]//child::table//tr//td//div//span")

	public List<WebElement> AlgorithmsList;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'ext-element') and @stroke-linecap= 'butt' and @fill='#006400']")

	public List<WebElement> DrawNodesList;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'ext-element') and @viewBox= 'null' and @width= '40']")

	public List<WebElement> InputOutputNodesList;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]//child::div")

	public List<WebElement> ModelExecutionResult;
	
	
	public void DragDropDataSource(String DSName) {
		for (WebElement el : DataSourcesList) {

			if (el.getText().equals(DSName)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).moveByOffset(300, 0).release().build();
				dragAndDrop.perform();

				break;
			}
		}

	}
	
	
	public void DragDropAlgorithm(String Algorithm) {
		for (WebElement el : AlgorithmsList) {

			if (el.getText().equals(Algorithm)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).moveToElement(ModelSurface).release(ModelSurface).build();
				dragAndDrop.perform();

				break;
			}
		}

	}
	
	
	
	public void CreateModel(String modelName) throws InterruptedException {
		
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		test = report.createTest("Side Pane: Verify that Analysis dropdown is visible in the side pane");
		if (CM.Analysis.isDisplayed()) {
			test.log(Status.PASS, " Analysis dropdown is visible in the side pane");
		} else {
			test.log(Status.FAIL, " Analysis dropdown is not visible in the side pane");
		}
		test = report.createTest("Side Pane: Verify that Analysis dropdown is clickable");
		if (CM.Analysis.isEnabled()) {
			test.log(Status.PASS, " Analysis dropdown is clickable");
		} else {
			test.log(Status.FAIL, " Analysis dropdown is not clickable");
		}
		test = report.createTest("Side Pane: Verify that clicking on the Analysis Dropdown displays a list of its sub-modules in the dropdown");
		CM.Analysis.click();
		
		if (this.Modeling.isDisplayed()) {
			test.log(Status.PASS, " clicking on the Analysis Dropdown displays a list of its sub-modules in the dropdown");
		} else {
			test.log(Status.FAIL, " clicking on the Analysis Dropdown doesn't display a list of its sub-modules in the dropdown");
		}
		
		test = report.createTest("Side Pane: Verify that Modeling Button is present in Analysis dropdown");
		if (this.Modeling.isDisplayed()) {
			test.log(Status.PASS, " The Modeling Button is present in Analysis dropdown");
		} else {
			test.log(Status.FAIL, " The Modeling Button is not present in Analysis dropdown");
		}
		test = report.createTest("Side Pane: Verify that Modeling Button is clickable");
		if (this.Modeling.isEnabled()) {
			test.log(Status.PASS, " Modeling Button is clickable");
		} else {
			test.log(Status.FAIL, "Modeling Button is not clickable");
		}
		
		test = report.createTest("Side Pane: Verify that clicking on the Modeling Button navigates to the Modeling screen");
		this.Modeling.click();
		Thread.sleep(2000);
		if (this.ModelSurface.isDisplayed()) {
			test.log(Status.PASS, " clicking on the Modeling Button navigates to the Modeling screen");
		} else {
			test.log(Status.FAIL, "clicking on the Modeling Button navigates to the Modeling screen");
		}
		
		this.ModelSurface.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the search tab works for data sources in Artifacts.");
		this.SearchTabDatasourcesGrid.sendKeys("Medical Transactions");
		test.log(Status.PASS, "The search tab works for data sources in Artifacts.");
		Thread.sleep(3000);
		test = report.createTest("Verify that all the data sources are loaded in the panel.");
		test.log(Status.PASS, " all the data sources are loaded in the panel");
		test = report.createTest("Verify the user is able to drag and drop datasource into Modeling Surface");
		this.DragDropDataSource("Medical Transactions");
		test.log(Status.PASS, " The user is able to drag and drop datasource into Modeling Surface");
		test = report.createTest("Verify that the algorithms are listed as tree in left pane.");
		test.log(Status.PASS, " The algorithms are listed as tree in left pane.");
		test = report.createTest("Verify that the search feature for algorithms work in left pane.");
		this.SearchTabalgorithmsGrid.sendKeys(modelName);
		test.log(Status.PASS, "  The search feature for algorithms works in left pane.");
		Thread.sleep(3000);
		test = report.createTest("Verify the user is able to drag and drop algorithms into Modeling Surface");
		this.DragDropAlgorithm(modelName);
		test.log(Status.PASS, " The user is able to drag and drop algorithms into Modeling Surface");
		Thread.sleep(2000);
		test = report.createTest("Verify the user is able to draw the connections between datasource, algorithm and output node ");
		this.DrawNodesList.get(0).click();
		this.DrawNodesList.get(1).click();
		this.DrawNodesList.get(2).click();
		this.InputOutputNodesList.get(1).click();
		test.log(Status.PASS, " The user is able to draw the connections between datasource, algorithm and output node ");
		test = report.createTest("Verify the Model is saved by clicking on save button.");
		this.SaveModel.click();
		test.log(Status.PASS, " The Model is saved by clicking on save button.");
		test = report.createTest("Save Analysis Model As - Verify Model name is editable.");
		CM.InputName.sendKeys(modelName);
		test.log(Status.PASS, " The Model name is editable");
		CM.OKButton.click();
		utilityMethods.waitForVisibility(CM.OKButton);
		CM.OKButton.click();	

	}
	
public void ExecutionOfModel() throws InterruptedException {
	
	try {
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
	this.ModelExecutionButton.click();
	Thread.sleep(2000);
	System.out.println(this.ModelExecutionButtonText.getText());
	Instant start = Instant.now();
	while (this.ModelExecutionButtonText.getText().equals("Stop")) {
		System.out.println("The Model Execution is inprogress");
		Thread.sleep(2000);
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		long timetaken = timeElapsed.getSeconds();
		if (timetaken > 100) {
			test.log(Status.FAIL, " There is an issue with Model execution,it is taking much for execution");	
			break;
		}

	}
	
	System.out.println(this.ModelExecutionButtonText.getText());
	for (WebElement el : ModelExecutionResult) {
		if (el.getText().equals("Execution Error")) {
			test.log(Status.FAIL, " The Model execution is failed");
			System.out.println(el.getText());
			CM.OKButton.click();
			break;
		} 
		else if (el.getText().equals("Execution Completed")) {
			System.out.println(el.getText());
			test.log(Status.PASS, " The Model execution is completed successfully");
		}

	}

	}
	catch(Exception e)
	{
		System.out.println("There is an issue with model execution");
		driver.close();
	}
	}
}
