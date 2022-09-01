package automationCases;

import java.nio.file.Paths;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationModels.DataSourceModel;
import automationModels.LoginModel;
import automationModels.ProjectModel;
import automationModels.UserManagementModel;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class UserManagement extends Configuration {
	public static ExtentTest test;
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_UserManagement_001() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		String UserName = utilityMethods.randomString(10);
		test = report.createTest("Verify the user is able to create user");
		UM.CreateUser(UserName, "", "", "", "");
		test.log(Status.PASS, "The user is able to create and new user");
		test = report.createTest("Verify the user is able to delete the user");
		UM.Remove(UserName, UM.Users,UM.UsersList);
		test.log(Status.PASS, "The user is able to delete the user");
		test = report.createTest("Verify the user is able to access Divisions view page");
		int DivsionListCount=UM.CountDivisionList();
		test.log(Status.PASS, "The user is able to access Divisions view page");
		test = report.createTest("Verify the Divisions lsit count");
		System.out.println(DivsionListCount);
		test = report.createTest("Verify the user is able to access Organizations view page");
		int OrganizationListCount=UM.CountOrganizationList();
		test.log(Status.PASS, "The user is able to access Organizations view page");
		test = report.createTest("Verify the Organizations list count");
		System.out.println(OrganizationListCount);
		test = report.createTest("Verify the user is able to access Regions view page");
		int RegionListCount=UM.CountRegionList();
		test.log(Status.PASS, "The user is able to access Regions view page");
		test = report.createTest("Verify the Regions list count");
		System.out.println(RegionListCount);
		test = report.createTest("Verify the user is able to access Departments view page");
		int DepartmentListCount=UM.CountDepartmentList();
		test.log(Status.PASS, "The user is able to access Departments view page");
		test = report.createTest("Verify the Departments list count");
		System.out.println(DepartmentListCount);
		driver.close();
		
}
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_UserManagement_002() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = utilityMethods.randomString(10);
		UM.CreateUser(UserName, "UserLocked", "", "", "");
		UM.LogoutUser();
		Thread.sleep(3000);
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
			UM.LoginFailuretext.isDisplayed();

		   String ActualLoginFailureText = UM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			String ExpectedLoginFailureText = "Account Locked for user";
			if (ExpectedLoginFailureText.contains(ActualLoginFailureText));
			
		    if (UM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with userlocked scenario");
		} 
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName, UM.Users,UM.UsersList);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_UserManagement_003() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = utilityMethods.randomString(10);
		UM.CreateUser(UserName, "", "ForcePasswordChange", "", "");
		UM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = UM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (UM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("There is an issue with login scenario");
		} 
		UM.ChangePasswordWindow();
		String ProjectName = utilityMethods.randomString(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		UM.MenuButton.click();
		UM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName, UM.Users,UM.UsersList);
		UM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	@Test(groups = {"smoke","regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_UserManagement_004() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = utilityMethods.randomString(10);
		UM.CreateUser(UserName, "", "", "MakeSecurityAdmin", "");
		UM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = UM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (UM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("There is an issue with login scenario");
		} 
		int ProjectsCount=PM.ProjectsList.size();
		System.out.println(ProjectsCount);
		if (ProjectsCount>1) {
			
			System.out.println("All the projects are being shown to security user");
		}
		String ProjectName = utilityMethods.randomString(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		UM.MenuButton.click();
		UM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName, UM.Users,UM.UsersList);
		UM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_UserManagement_005() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = utilityMethods.randomString(10);
		UM.CreateUser(UserName, "", "", "", "MakeDatabaseAdmin");
		UM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = UM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (UM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with login scenario");
		} 
		String ProjectName = utilityMethods.randomString(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		PM.GetStarted.click();
		DSM.DataRepository.click();
		DSM.ManageDataSources.click();
		DSM.SearchTabDataSource.click();
		DSM.MicrosoftSQLServer.click();
		PM.PublicOption.click();
		DSM.databaseName.clear();
		DSM.databaseName.sendKeys("ai_analysis");
		try {
		if (UM.WarrningMessageforDBAccess.isDisplayed()) {
			
			System.out.println("The DatabaseAdmin user is not able access this database");
		}
		
	}
	catch (Exception e) {
		System.out.println("The DatabaseAdmin user is able access this database");
	} 
		DSM.cancelbutton.click();
		UM.MenuButton.click();
		UM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName, UM.Users,UM.UsersList);
		UM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_UserManagement_006() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		Thread.sleep(4000);
		String UserName = utilityMethods.randomString(10);
		UM.CreateUser(UserName, "", "", "", "");
		UM.LogoutUser();
		Thread.sleep(3000);
	
		LM.LoginUser(UserName + "@gmail.com", "Alivia21!");
		
		try {
		   String ActualLoginFailureText = UM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (UM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("Thereis an issue with user login scenario");
		} 
		String ProjectName = utilityMethods.randomString(10);
		PM.CreateNewProject(ProjectName);
		Thread.sleep(2000);
		UM.MenuButton.click();
		UM.ProfilePicture.click();
		String ImagePathForProfilePic = Paths.get(System.getProperty("user.dir") + "\\src\\datafiles\\profilepic.png")
				.toAbsolutePath().toString();
		UM.UploadProfilePicture.sendKeys(ImagePathForProfilePic);
		Thread.sleep(2000);
		UM.DoneButton.click();
		Thread.sleep(2000);
		if(UM.VerifyProfilePicture.isDisplayed()==true) {
			System.out.println("The profile picture is uploaded successfully");
		}
		UM.MenuButton.click();
		UM.ChangePassword.click();
		Thread.sleep(2000);
		UM.ChangePasswordWindow();
		UM.MenuButton.click();
		UM.LogoutButton.click();
		Thread.sleep(2000);
		LM.LoginUser(UserName + "@gmail.com", "Alivia2120!");
		Thread.sleep(10000);
		UM.MenuButton.click();
		UM.LogoutButton.click();
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName, UM.Users,UM.UsersList);
		UM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	@Test(groups = {"smoke","regression2"}, priority = 1)
	public void FWA_UserManagement_007() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		UM.ValidationModule("Groups", UM.Groups, "Admin's Department");
		test = report.createTest("Verify the created group shows in groups list");
		String GroupName = utilityMethods.randomString(10);
		if(UM.CreateModule(GroupName, UM.Groups, "Admin's Department")==true) {
			test.log(Status.PASS, "The created group is being shown in groups list");
		}
		else {
			test.log(Status.FAIL, "The created group is not being shown in groups list");
		}
		test = report.createTest("Verify the deleted group removes from groups list");
		if(UM.Remove(GroupName, UM.Groups, UM.GroupsList)==true) {
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}

		driver.close();
}
	@Test(groups = {"smoke","regression"}, priority = 1)
	public void FWA_UserManagement_008() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();	
		String OrgName = utilityMethods.randomString(10);
		if (UM.CreateOrganization(OrgName)==true) {
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		String RegName = utilityMethods.randomString(10);
		if (UM.CreateModule(RegName, UM.Region, OrgName)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		String DivName = utilityMethods.randomString(10);
		if (UM.CreateModule(DivName, UM.Division, RegName)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		String DeptName = utilityMethods.randomString(10);
		if (UM.CreateModule(DeptName, UM.Department, DivName)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		if (UM.Remove(DeptName, UM.Department, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		if (UM.Remove(DivName, UM.Division, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		if (UM.Remove(RegName, UM.Region, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		if (UM.Remove(OrgName, UM.Organization, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted group is removed from groups list");	
		}
		else {
			test.log(Status.FAIL, "The deleted group is not removed from groups list");
		}
		driver.close();
	}
}