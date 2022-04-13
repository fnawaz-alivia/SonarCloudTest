package automationModels;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import configuration.Configuration;

public class RankingModel extends Configuration {

@FindBy(how = How.XPATH, using = "//*[@class = 'x-tree-node-text ' and (text() = 'Ranking' or . = 'Ranking')]")
	
public WebElement Ranking;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Show Values' or . = 'Show Values')]")

public WebElement ShowValues;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-leftGrid-dataSourcesGrid-65')]//child::input")

public WebElement SearchTabforDS;

@FindBy(how = How.XPATH, using = "//a[contains(@class, 'analysis-ranking-columns-btn-72')]")

public WebElement ShowColumnsButton;


@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-column-header-checkbox')]")

public WebElement CheckBOXShowColumnsWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-columns-71')]//child::input")

public WebElement SearchTabOnShowColumnsWindow;



@FindBy(how = How.XPATH, using = "//*[@class = 'header' and @transform= 'translate(265,0)']")

public WebElement CombinedHeader;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Combined Column' or . = 'Combined Column')]")

public WebElement CombinedColumn;


@FindBy(how = How.XPATH, using = "//*[@class = 'tableData text' and starts-with(@clip-path, 'url(#clip-BPHYSICIAN_NAME')]")

public List<WebElement> PhysicianNameList;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-columns-71') ]//child::table//tr//td[2]")

public List<WebElement> ColumnsListOnShowColumnsWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class,'analysis-ranking-leftGrid-dataSourcesGrid-65')]//child::table//tr//td[2]//div")

public List<WebElement> DataSourcesList;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-combinedColumns-70') ]//child::table//tr//td[2]")

public List<WebElement> ColumnsListOnCombinedColumnWindow;

@FindBy(how = How.XPATH, using = "//div[contains(@class, 'analysis-ranking-combinedColumns-70')]//child::input")

public List<WebElement> SeachtabInputOnCombinedColumnWindow;


public void LandingOnPageRanking() {
	ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
	ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
	PM.GetStarted.click();
	CM.Analysis.click();
	this.Ranking.click();
	
}

public void LoadDataSourceForRank() throws InterruptedException {

	this.ShowValues.click();
	this.SearchTabforDS.click();
	this.SearchTabforDS.sendKeys("Medical Transactions");
	Thread.sleep(2000);
	for (WebElement el : DataSourcesList) {
	    if (el.getText().equals("Medical Transactions")) {
	        el.click();
	        break;
	    }
	}	
}


}


