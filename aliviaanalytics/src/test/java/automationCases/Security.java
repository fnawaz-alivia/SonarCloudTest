package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import automationModels.ProjectModel;
import automationModels.SecurityModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Security extends Configuration {
	
	@Test(groups = { "Smoke" }, priority = 1)
	public void FWA_Ranking_001() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		SM.LandingOnAdminViewPage();
		String UserName = RandomStringUtils.randomAlphabetic(10);
		SM.CreateUser(UserName);
		SM.RemoveUser(UserName);
		int DivsionListCount=SM.CountDivisionList();
		System.out.println(DivsionListCount);
		int OrganizationListCount=SM.CountOrganizationList();
		System.out.println(OrganizationListCount);
		int RegionListCount=SM.CountRegionList();
		System.out.println(RegionListCount);
		int DepartmentListCount=SM.CountDepartmentList();
		System.out.println(DepartmentListCount);
		driver.close();
		
}
	
}