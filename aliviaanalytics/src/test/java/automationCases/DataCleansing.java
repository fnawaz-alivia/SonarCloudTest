package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.DataCleansingModel;
import automationModels.ProjectModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class DataCleansing extends Configuration {
	
	@Test(groups = { "Smoke" }, priority = 1)
	public void FWA_DataSource_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataCleansingModel DCM = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000); 
		DCM.LandingOnDataCleansingPage();
		DCM.SelectDSForDataCleansing();
		DCM.MissingFillWithValue();
		String DCExportFileName = RandomStringUtils.randomAlphabetic(10);
		DCM.ExportDataIntoCSV(DCExportFileName);
		DCM.ExportDataIntoExcel(DCExportFileName);
		driver.close();
}
	
}