package automationCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import automationModels.ProjectModel;
import automationModels.RankingModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Ranking extends Configuration {
	
	@Test(groups = { "RegressionTest" }, priority = 1)
	public void FWA_Ranking_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		RankingModel RM = PageFactory.initElements(driver, automationModels.RankingModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		RM.LandingOnPageRanking();
		RM.LoadDataSourceForRank();
		RM.ShowColumnsButton.click();
		RM.CheckBOXShowColumnsWindow.click();
		RM.SearchTabOnShowColumnsWindow.sendKeys("PHYSICIAN_NAME");	
		Thread.sleep(2000);
		RM.ColumnsListOnShowColumnsWindow.get(0).click();
		PM.OKProjectImportButton.click();
		RM.CombinedColumn.click();
		RM.SeachtabInputOnCombinedColumnWindow.get(1).sendKeys("TOT");
		Thread.sleep(2000);
		RM.ColumnsListOnCombinedColumnWindow.get(0).click();
		RM.ColumnsListOnCombinedColumnWindow.get(1).click();
		PM.OKProjectImportButton.click();
		Thread.sleep(2000);
		RM.CombinedHeader.click();
		
		
	}

}
