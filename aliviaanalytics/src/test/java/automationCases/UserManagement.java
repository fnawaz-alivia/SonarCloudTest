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

	@Test(groups = { "smoke", "regression" }, priority = 1/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
	public void FWA_UserManagement_000() throws InterruptedException {	
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		UserManagementModel UM = PageFactory.initElements(driver, automationModels.UserManagementModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		UM.LandingOnAdminViewPage();
		UM.UserDetailFormValidation();
		driver.close();
	}
	@Test(groups = { "smoke", "regression" }, priority = 1/* ,retryAnalyzer = listeners.RetryAnalyzer.class */)
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
		UM.Remove(UserName, "Users",UM.Users,UM.UsersList);
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
			LM.LoginFailuretext.isDisplayed();

		   String ActualLoginFailureText = LM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			String ExpectedLoginFailureText = "Account Locked for user";
			if (ExpectedLoginFailureText.contains(ActualLoginFailureText));
			
		    if (LM.LoginFailuretext.isDisplayed() == true) {
		        System.out.println("Login failure window is being shown");
		        UM.Okbutton.click();
		    }
		}
		catch (Exception e) {
			System.out.println("There is an issue with userlocked scenario");
		} 
		LM.LoginUser(Configuration.username, Configuration.password);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		UM.LandingOnAdminViewPage();
		UM.Remove(UserName,"Users" ,UM.Users,UM.UsersList);
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
		
		// Verify super user is able to creating the new user.
		test = report.createTest("Admin View:Verify the user is creating with Force Password Change option.");
		String UserName = utilityMethods.randomString(10);
		if(UM.CreateUser(UserName, "", "ForcePasswordChange", "", "")==true) {
			test.log(Status.PASS, "The created user is being shown in user list.");
		}else {
			test.log(Status.FAIL, "The created user is not being shown in user list.");
		}
		
		// Verify super user is able to logout.
		test = report.createTest("Admin View:Verify the user is able to logout.");
		if(UM.LogoutUser()==true) {
			test.log(Status.PASS, "The user is logout");
		}else {
			test.log(Status.FAIL, "The user is not logout");
		}
		
		// Verify newly user (Force Password change) is able to login. 
		test = report.createTest("Verify that newly created user is able to login.");
		if(LM.LoginUser2(UserName + "@gmail.com", "Alivia21!")==true) {
			test.log(Status.PASS, "Newly Created user Logged in.");
		}else {
			test.log(Status.FAIL, "Newly Created user is not Logged in.");
		}
		// Remove Project popup and verify change password screen visible
		utilityMethods.list_Visible(UM.Okbutton, 500, UM.ChangePasswordScreen,
				"Get Started:Verify that Change Password screen is present when newly user ('Force Password Change') is login.");
		// Old Password Field
		utilityMethods.visible(UM.oldPassword_Div, 
				"Change Password:Verify that Old Password input field is visible.");
		utilityMethods.clickable(UM.oldPassword_Input, 
				"Change Password:Verify that Old Password input field is clickable.");
		utilityMethods.sendKeys_Input(UM.oldPassword_Input, 500, "includeChar",
				"Change Password:Verify that Old Password input field allow user to input alphabets,numerics and special character.");
		utilityMethods.verifyfieldmandatory(UM.oldPassword_Input, 500, UM.oldPassword_Error,
				"Change Password:Verify that Old Password input field show error tooltip if field is empty.");
		
		//New Password Field
		utilityMethods.visible(UM.newPassword_Div, 
				"Change Password:Verify that New Password input field is visible");
		utilityMethods.clickable(UM.newPassword_Input, 
				"Change Password:Verify that New Password input field is clickable");
		utilityMethods.sendKeys_Input(UM.newPassword_Input, 500, "includeChar",
				"Change Password:Verify that Old Password input field allow user to input alphabets,numerics and special character.");
		utilityMethods.verifyfieldmandatory(UM.newPassword_Input, 500, UM.newPassword_Error,
				"Change Password:Verify that New Password input field show error tooltip if field is empty.");
		
		//Confirm Password Field
		utilityMethods.visible(UM.cNewPassword_Div, 
				"Change Password:Verify that Confirm Password input field is visible");
		utilityMethods.clickable(UM.cNewPassword_Input, 
				"Change Password:Verify that Confirm Password input field is clickable");
		utilityMethods.sendKeys_Input(UM.cNewPassword_Input, 500, "includeChar",
				"Change Password:Verify that Confirm Password input field allow user to input alphabets,numerics and special character.");
		utilityMethods.verifyfieldmandatory(UM.cNewPassword_Input, 500, UM.cNewPassword_Error,
				"Change Password:Verify that Confirm Password input field show error tooltip if field is empty.");
		
		// Change Password Button
		utilityMethods.visible(UM.SubmitPasswordDisabled, 
				"Change Password:Verify that Submit Password button is visible.");
		utilityMethods.visible(UM.SubmitPasswordDisabled, 
				"Change Password:Verify that Submit Password button is disable by default.");
		utilityMethods.visible(UM.LogoutButton, 
				"Change Password:Verify that Logout button is visible");
		utilityMethods.clickable(UM.LogoutButton, 
				"Change Password:Verify that Logout button is visible");
		
		test = report.createTest("Change Password:Verify the user is able to update the password.");
		if(UM.ChangePasswordWindow()==true) {
			test.log(Status.PASS, "Password changed successfully.");
		}else {
			test.log(Status.PASS, "Password not changed successfully.");
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
		UM.Remove(UserName, "Users",UM.Users,UM.UsersList);
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
		   String ActualLoginFailureText = LM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (LM.LoginFailuretext.isDisplayed() == true) {
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
		UM.Remove(UserName,"Users" ,UM.Users,UM.UsersList);
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
		   String ActualLoginFailureText = LM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (LM.LoginFailuretext.isDisplayed() == true) {
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
		UM.Remove(UserName,"Users" ,UM.Users,UM.UsersList);
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
		   String ActualLoginFailureText = LM.LoginFailuretext.getText();
			System.out.println(ActualLoginFailureText);
			
		    if (LM.LoginFailuretext.isDisplayed() == true) {
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
		UM.Remove(UserName,"Users" ,UM.Users,UM.UsersList);
		UM.UserView.click();
		PM.DeleteProject(ProjectName);
		driver.close();
	}
	@Test(groups = {"smoke","regression"}, priority = 1)
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
		if(UM.Remove(GroupName,"groups" ,UM.Groups, UM.GroupsList)==true) {
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
		test = report.createTest("Verify the created organization shows in organizations list");
		String OrgName = utilityMethods.randomString(10);
		if (UM.CreateOrganization(OrgName)==true) {
			test.log(Status.PASS, "The created organization is being shown in  organizations list");
		}
		else {
			test.log(Status.FAIL, "The created organization is  not being shown in organizations list");
		}
		test = report.createTest("Verify the created Region shows in Regions list");
		String RegName = utilityMethods.randomString(10);
		UM.ValidationModule("Regions", UM.Region, OrgName);
		if (UM.CreateModule(RegName, UM.Region, OrgName)==true)
		{
			test.log(Status.PASS, "The created Region is being shown in Regions list");
		}
		else {
			test.log(Status.FAIL, "The created Region  is  not being shown in Regions list");
		}
		test = report.createTest("Verify the created Division shows in Divisions list");
		String DivName = utilityMethods.randomString(10);
		UM.ValidationModule("Divisions ", UM.Division, RegName);
		if (UM.CreateModule(DivName, UM.Division, RegName)==true)
		{
			test.log(Status.PASS, "The created Division is being shown in Divisions list");
		}
		else {
			test.log(Status.FAIL, "The created Division is  not being shown in Divisions list");
		}
		test = report.createTest("Verify the created Department shows in Departments list");
		String DeptName = utilityMethods.randomString(10);
		UM.ValidationModule("Departments ", UM.Department, DivName);
		if (UM.CreateModule(DeptName, UM.Department, DivName)==true)
		{
			test.log(Status.PASS, "The created Department is being shown in Departments list");
		}
		else {
			test.log(Status.FAIL, "The created Department is  not being shown in Departments list");
		}
		test = report.createTest("Verify the deleted Department removes from Departments list");
		if (UM.Remove(DeptName,"Department" ,UM.Department, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted Department is removed from Departments list");
		}
		else {
			test.log(Status.FAIL, "The deleted Department is not removed from Departments list");
		}
		test = report.createTest("Verify the deleted Division removes from Divisions list");
		if (UM.Remove(DivName, "Division",UM.Division, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted Division is removed from Divisions list");
		}
		else {
			test.log(Status.FAIL, "The deleted Division is not removed from Divisions list");
		}
		test = report.createTest("Verify the deleted Region removes from n Regions list");
		if (UM.Remove(RegName, "Region",UM.Region, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted Region is removed from Regions list");
		}
		else {
			test.log(Status.FAIL, "The deleted Region is not removed from Regions list");
		}
		test = report.createTest("Verify the deleted Organization removes from  Organizations list");
		if (UM.Remove(OrgName,"Organization" ,UM.Organization, UM.ModuleList)==true)
		{
			test.log(Status.PASS, "The deleted Organization is removed from Organizations list");	
		}
		else {
			test.log(Status.FAIL, "The deleted Organization is not removed from Organizations list");
		}
		driver.close();
	}
}