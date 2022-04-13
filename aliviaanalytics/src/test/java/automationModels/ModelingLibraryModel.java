package automationModels;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configuration.Configuration;

public class ModelingLibraryModel extends Configuration { 
	public int index;
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Modeling Library' or . = 'Modeling Library')]")

	public WebElement ModelingLibrary;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel singlePanel analysis-modelingLibrary-mainGrid-49 x-fit-item x-panel-default x-grid']//child::input")

	public WebElement SearchTabModelingLibrary;
	
		
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel singlePanel analysis-modelingLibrary-mainGrid-49 x-fit-item x-panel-default x-grid']//child::table//tr//td[2]//div")

	public List<WebElement> ModelingLibraryList;
	
	
	
	public void LandingOnPageModlingLibrary() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		PM.GetStarted.click();
		CM.Analysis.click();
		this.ModelingLibrary.click();
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
