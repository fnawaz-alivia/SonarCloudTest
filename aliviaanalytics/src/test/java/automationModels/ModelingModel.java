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
import automationUtils.utilityMethods;
import configuration.Configuration;


public class ModelingModel  extends Configuration{
	
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
		CM.Analysis.click();
		this.Modeling.click();
		this.ModelSurface.click();
		Thread.sleep(2000);
		this.SearchTabDatasourcesGrid.sendKeys("Automation1 - Dental01");
		Thread.sleep(3000);
		this.DragDropDataSource("Automation1 - Dental01");
		this.SearchTabalgorithmsGrid.sendKeys(modelName);
		Thread.sleep(3000);
		this.DragDropAlgorithm(modelName);
		Thread.sleep(2000);
		this.DrawNodesList.get(0).click();
		this.DrawNodesList.get(1).click();
		this.DrawNodesList.get(2).click();
		this.InputOutputNodesList.get(1).click();
		this.SaveModel.click();
		CM.InputName.sendKeys(modelName);
		CM.OKButton.click();
		utilityMethods.waitForVisibility(CM.OKButton);
		CM.OKButton.click();	

	}
	
public void ExecutionOfModel() throws InterruptedException {
	
	ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);

			this.ModelExecutionButton.click();
	String EXecutionButtonText = this.ModelExecutionButtonText.getText();
		System.out.println(EXecutionButtonText);
		Instant start = Instant.now();
		while (EXecutionButtonText== "Stop") {
		    Thread.sleep(2000);
		    Instant end = Instant.now();
			Duration timeElapsed = Duration.between(start, end);
			
			long timetaken = timeElapsed.getSeconds();
			if (timetaken>60) 
				{				
					driver.close();
					break;
				}
		  
		}
		
		System.out.println(EXecutionButtonText);
		
		for (WebElement el : ModelExecutionResult) {
		    if (el.getText().equals("Execution Error")) {
		        System.out.println(el.getText());
		        CM.OKButton.click();

		        break;
		    }
			 else if (el.getText().equals("Execution Completed")) {
				 System.out.println(el.getText());
}
	
		}	
}
}
