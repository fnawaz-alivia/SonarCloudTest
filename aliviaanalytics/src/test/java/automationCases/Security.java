package automationCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.DataSourceModel;
import automationModels.LoginModel;
import automationModels.ProjectModel;
import automationModels.SecurityModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Security extends Configuration {
	public static ExtentTest test;
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Security_001() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		test = report.createTest("Verify the user is able to access admin view page");
		SM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		test.log(Status.PASS, "The user is able to access admin view page");
		String UserName = RandomStringUtils.randomAlphabetic(10);
		test = report.createTest("Verify the user is able to create user");
		SM.CreateUser(UserName, "", "", "", "");
		test.log(Status.PASS, "The user is able to create and new user");
		test = report.createTest("Verify the user is able to delete the user");
		SM.RemoveUser(UserName);
		test.log(Status.PASS, "The user is able to delete the user");
		test = report.createTest("Verify the user is able to access Divisions view page");
		int DivsionListCount=SM.CountDivisionList();
		test.log(Status.PASS, "The user is able to access Divisions view page");
		test = report.createTest("Verify the Divisions lsit count");
		System.out.println(DivsionListCount);
		test = report.createTest("Verify the user is able to access Organizations view page");
		int OrganizationListCount=SM.CountOrganizationList();
		test.log(Status.PASS, "The user is able to access Organizations view page");
		test = report.createTest("Verify the Organizations list count");
		System.out.println(OrganizationListCount);
		test = report.createTest("Verify the user is able to access Regions view page");
		int RegionListCount=SM.CountRegionList();
		test.log(Status.PASS, "The user is able to access Regions view page");
		test = report.createTest("Verify the Regions list count");
		System.out.println(RegionListCount);
		test = report.createTest("Verify the user is able to access Departments view page");
		int DepartmentListCount=SM.CountDepartmentList();
		test.log(Status.PASS, "The user is able to access Departments view page");
		test = report.createTest("Verify the Departments list count");
		System.out.println(DepartmentListCount);
		driver.close();
		
}
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_Security_002() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		SM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = RandomStringUtils.randomAlphabetic(10);
		SM.CreateUser(UserName, "UserLocked", "", "", "");
		SM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		    SM.LoginFailuretext.isDisplayed();

		   String ActualLoginFailureText = SM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			String ExpectedLoginFailureText = "Account Locked for user";
			if (ExpectedLoginFailureText.contains(ActualLoginFailureText));
			
		    if (SM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        SM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with userlocked scenario");
		} 
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		SM.LandingOnAdminViewPage();
		SM.RemoveUser(UserName);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_Security_003() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		SM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = RandomStringUtils.randomAlphabetic(10);
		SM.CreateUser(UserName, "", "ForcePasswordChange", "", "");
		SM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = SM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (SM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        SM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with userlocked scenario");
		} 
		SM.ChangePasswordWindow();
		String ProjectName = RandomStringUtils.randomAlphabetic(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		SM.LandingOnAdminViewPage();
		SM.RemoveUser(UserName);
		SM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Security_004() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		SM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = RandomStringUtils.randomAlphabetic(10);
		SM.CreateUser(UserName, "", "", "MakeSecurityAdmin", "");
		SM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = SM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (SM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        SM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with userlocked scenario");
		} 
		
		System.out.println(PM.ProjectsList.size());
		String ProjectName = RandomStringUtils.randomAlphabetic(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		SM.LandingOnAdminViewPage();
		SM.RemoveUser(UserName);
		SM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression2"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Security_005() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		SM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = RandomStringUtils.randomAlphabetic(10);
		SM.CreateUser(UserName, "", "", "", "MakeDatabaseAdmin");
		SM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = SM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (SM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        SM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with userlocked scenario");
		} 
		String ProjectName = RandomStringUtils.randomAlphabetic(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		DSM.ManageDataSources.click();
		DSM.SearchTabDataSource.click();
		DSM.MicrosoftSQLServer.click();
		Thread.sleep(30000);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		SM.LandingOnAdminViewPage();
		SM.RemoveUser(UserName);
		SM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Security_006() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Security_007() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
	}
	
}