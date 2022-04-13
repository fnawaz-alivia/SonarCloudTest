package automationCases;


import java.nio.file.Paths;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import automationModels.ChartModel;
import automationModels.DashboardModel;
import automationModels.DataSourceModel;
import automationModels.LoginModel;
import automationModels.ModelingLibraryModel;
import automationModels.ProjectModel;
import automationModels.QueryBuilderModel;
import automationModels.SecurityModel;
import automationUtils.reportUtil;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Projects extends Configuration {
	public static ExtentTest test;
	public static ExtentReports report;
	String excldatasourcename1 = RandomStringUtils.randomAlphabetic(10);
	String excldatasourcename = RandomStringUtils.randomAlphabetic(10);
	
	@BeforeClass(alwaysRun=true)
	public static void startreport() {

		reportUtil.startTest();
		report = reportUtil.getReport();
	}

	@Test(groups = { "Smoke" }, priority = 1)
	public void FWA_Project_001() throws InterruptedException {
		
		
		Configuration.BConfiguration();
		
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		test = report.createTest("Create Folder button works");
		PM.CreateFolderButton.click();
		test.log(Status.PASS, "Create Folder button is working as expected");
		PM.ProjectFormFill("AutoCreatedFolder", "AutoCreatedFolder");
		PM.PublicOption.click();
		PM.SaveButton.click();
		test = report.createTest("save button works");
		test.log(Status.PASS, "save button is working as expected");
		Thread.sleep(2000);
		for (int i = 1; i < 3; i++) {
			PM.RightClickOnProject("AutoCreatedFolder");
			Thread.sleep(2000);
			test = report.createTest("User can create project by right click on folder");
			PM.CreateProjectOptionRightClickonFolder.click();
			test.log(Status.PASS, "User is able to create project");
			PM.ProjectFormFill("AutoCreatedProject" + i, "AutoCreatedProject" + i);
			PM.PublicOption.click();
			PM.SaveButton.click();
			Thread.sleep(2000);
			PM.YesButton.click();
			Thread.sleep(2000);

			Assert.assertEquals(PM.LoadedProjectText.getText(), "AutoCreatedProject" + i);
		}
		PM.DeleteProject("AutoCreatedFolder");
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}

	@Test(groups = { "RegressionTest" }, priority = 2)
	public void FWA_Project_002() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.GetIndexOfProject("Training-Automation");
		Thread.sleep(2000);
		test = report.createTest("Project Items details");
		driver.findElement(By.xpath("//*[@id='project-projectTree-treePanel-001']//child::table['" + PM.index + "'+'"
				+ 1 + "']//tr//td[2]")).click();
		Thread.sleep(2000);
	
		test.log(Status.PASS, "Project Items details are being shown");
		Thread.sleep(2000);
		test = report.createTest("Project Items details");
		PM.ExpandAllProjectItems();
		test.log(Status.PASS, "Model Type type test is fine");
		test = report.createTest("Verify Model Type");
		PM.ClickItemProjectDetailTree("R Operator");
		Thread.sleep(2000);
		Assert.assertEquals("Analysis Model", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "Model Type type test is fine");
		Thread.sleep(2000);
		test = report.createTest("Verify Dashboard Type");
		PM.ClickItemProjectDetailTree("AutoCreatedDashboard");
		Thread.sleep(2000);
		Assert.assertEquals("Dashboard", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "Dashbaord Type type test is fine");
		test = report.createTest("Verify Data Source Type");
		PM.ClickItemProjectDetailTree("Medical Transactions");
		Thread.sleep(2000);
		Assert.assertEquals("Data Source", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "DataSource Type type test is fine");
		test = report.createTest("Verify Query Filter Type");
		PM.ClickItemProjectDetailTree("AutoCreatedQB");
		Thread.sleep(2000);
		Assert.assertEquals("Query Filter", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "Query Filter Type type test is fine");
		test = report.createTest("Verify chart Type");
		PM.ClickItemProjectDetailTree("AutoCreatedChart");
		Thread.sleep(2000);
		Assert.assertEquals("Chart", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "chart Type type test is fine");
		driver.close();
	}

	@Test(groups = { "Smoke" }, priority = 3)
	public void FWA_Project_003() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CheckLoadedProjectandLoadAutomationProject();
		PM.RightClickOnProject("Training-Automation");
		PM.ExportOptionRightClickonProject.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(PM.CheckBoxForExportFilters);
		PM.CheckBoxForExportFilters.click();
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		driver.close();
	} 
	
	@Test(groups = { "RegressionTest" }, priority = 4)
	public void FWA_Project_004() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ModelingLibraryModel MLM = PageFactory.initElements(driver, automationModels.ModelingLibraryModel.class);
		DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CheckLoadedProjectandLoadAutomationProject();
		PM.RightClickOnProject("Training-Automation");
		PM.ExportOptionRightClickonProject.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		Thread.sleep(2000);
		PM.ImportLocalProjectButton.click();
		String FilePathForImportProject = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\project-2022-01-11 15.45.54.alivia")
				.toAbsolutePath().toString();
		PM.BrowseFileForProject.sendKeys(FilePathForImportProject);
		PM.ImportFileForProject.click();
		Thread.sleep(2000);
		PM.RadioButtonforCreateNew.click();
		PM.InputProjectNameToImport.clear();
		PM.InputProjectNameToImport.sendKeys("Imported Project");
		utilityMethods.waitForVisibility(PM.OKButton);
		PM.OKButton.click();
		utilityMethods.waitForVisibility(PM.CheckBoxToImportLocalPorojectData);
		PM.CheckBoxToImportLocalPorojectData.click();
		utilityMethods.waitForVisibility(PM.SaveImportProjectButton);
		PM.SaveImportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OKProjectImportButton);
		PM.OKProjectImportButton.click();
		PM.ReloadProjects.click();
		utilityMethods.WaitforElementNotVisible(PM.LoadProjectsICon);
		Thread.sleep(2000);
		PM.LoadAutomationProject("Imported Project");
		Thread.sleep(2000);
		int savedChartCount=CM.CountSavedChart();
		System.out.println(savedChartCount);
		int dataSourcesCount=  DSM.CountDataSources("Medical Transactions");
		System.out.println(dataSourcesCount);
		test = report.createTest("Verify Model shows");
		int CountModels=  MLM.CountModlingLibrary();
		System.out.println(CountModels);
		int CountDashboards= DM.CountDashboard();
		System.out.println(CountDashboards);
		
		
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		Thread.sleep(2000);
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}
	@Test (groups = { "RegressionTest" }, priority = 5,dependsOnMethods = { "FWA_Project_004" })
	public void FWA_Project_005() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CheckLoadedProjectandLoadAutomationProject();
		Thread.sleep(2000);
		PM.ImportLocalProjectButton.click();

		String FilePathForImportProject = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\project-2021-12-15 17.15.22.alivia")
				.toAbsolutePath().toString();
		PM.BrowseFileForProject.sendKeys(FilePathForImportProject);
		PM.ImportFileForProject.click();
		Thread.sleep(2000);
		PM.RadioButtonChooseExistingProject.click();
		utilityMethods.waitForVisibility(PM.OKButton);
		PM.OKButton.click();
		utilityMethods.waitForVisibility(PM.SelectProjectImportLocalProjectDataWindow);
		PM.SelectProjectImportLocalProjectDataWindow.click();
		PM.SelectProjectImportLocalProjectDataWindow.sendKeys("Imported Project");
		PM.SelectProjectImportLocalProjectDataWindow.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		PM.SelectProjectItemstoImport.click();
		utilityMethods.waitForVisibility(PM.SaveImportProjectButton);
		PM.SaveImportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OKProjectImportButton);
		PM.OKProjectImportButton.click();
		PM.ReloadProjects.click();
		Thread.sleep(2000);
		PM.LoadAutomationProject("Imported Project");
		Thread.sleep(2000);
		int QBCount=QBM.CountQB();
		System.out.println(QBCount);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		Thread.sleep(2000);
		PM.DeleteProject("Imported Project");
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}
	
	
	
	@Test(groups = { "RegressionTest" }, priority = 6)
	public void FWA_Project_006() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CreateFolderButton.click();
		PM.ProjectFormFill("AutoCreatedFolder", "AutoCreatedFolder");
		PM.PublicOption.click();
		PM.SaveButton.click();
		utilityMethods.waitForVisibility(PM.CheckFolderAccess);	
		System.out.println(PM.CheckFolderAccess.getText());
		System.out.println(PM.CheckFolderName.getText());
		PM.ConfigButton.click();
		Thread.sleep(2000);
		PM.CancelButtonEditFolderWidnow.click();
		Thread.sleep(2000);
		PM.ConfigButton.click();
		Thread.sleep(2000);
		PM.CloseDialogEditFolderWidnow.click();
		Thread.sleep(2000);
		PM.RightClickOnProject("AutoCreatedFolder");
		PM.EditOptionRightClikonFolder.click();
		PM.InputFolderName.clear();
		PM.InputFolderName.sendKeys("Updated");
		PM.InputFolderDescription.clear();
		PM.InputFolderDescription.sendKeys("Updated");
		PM.Private.click();
		PM.SaveButton.click();	
		Thread.sleep(2000);
		PM.ReloadProjects.click();
		utilityMethods.WaitforElementNotVisible(PM.LoadProjectsICon);
		Thread.sleep(2000);
		PM.ClickOnProject("Updated");
		System.out.println(PM.CheckFolderAccess.getText());
		System.out.println(PM.CheckFolderName.getText());
		PM.RightClickOnProject("Updated");
		PM.RenameOptionRightClikonFolder.click();
		PM.InputRenameFolder.clear();
		PM.InputRenameFolder.sendKeys("Renamed");
		PM.OKButtonSelectaProjectWondow.click();
		utilityMethods.waitForVisibility(PM.RenameProjectOk);
		PM.RenameProjectOk.click();
		Thread.sleep(2000);
		PM.DeleteProject("Renamed");	
		driver.close();
	}
	
	@Test(groups = { "RegressionTest" }, priority = 7)
	public void FWA_Project_007() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CreateNewProject("AutoCreatedProject");
		utilityMethods.waitForVisibility(PM.CheckFolderAccess);	
		System.out.println(PM.CheckFolderAccess.getText());
		System.out.println(PM.CheckFolderName.getText());
		PM.ConfigButton.click();
		Thread.sleep(2000);
		PM.CancelButtonEditFolderWidnow.click();
		Thread.sleep(2000);
		PM.ConfigButton.click();
		Thread.sleep(2000);
		PM.CloseDialogEditFolderWidnow.click();
		Thread.sleep(2000);
		PM.RightClickOnProject("AutoCreatedProject");
		PM.EditOptionRightClikonFolder.click();
		PM.InputFolderName.clear();
		PM.InputFolderName.sendKeys("UpdatedProject");
		PM.InputFolderDescription.clear();
		PM.InputFolderDescription.sendKeys("UpdatedProject");
		PM.PublicOption.click();
		PM.SaveButton.click();	
		Thread.sleep(2000);
		PM.ReloadProjects.click();
		utilityMethods.WaitforElementNotVisible(PM.LoadProjectsICon);
		Thread.sleep(2000);
		PM.ClickOnProject("UpdatedProject");
		System.out.println(PM.CheckFolderAccess.getText());
		System.out.println(PM.CheckFolderName.getText());
		PM.RightClickOnProject("UpdatedProject");
		PM.RenameOptionRightClikonFolder.click();
		PM.InputRenameFolder.clear();
		PM.InputRenameFolder.sendKeys("RenamedProject");
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		PM.DeleteProject("RenamedProject");
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}
	
	@Test(groups = { "RegressionTest5" }, priority = 8)
	public void FWA_Project_008() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();	
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.RightClickOnProject("Training-Automation");
		PM.SharingOptionsRightClikonFolder.click();
		utilityMethods.waitForVisibility(PM.SearchTabAddParticipantsWindow);
		PM.SearchTabAddParticipantsWindow.sendKeys("Test");
		Thread.sleep(3000);
		PM.DragParticipantDropinCetralArea("Test1 Test1 (Test@gmail.com)");
		Thread.sleep(3000);
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		PM.SaveSharedProject.click();
		SM.MenuButton.click();
		SM.LogoutButton.click();
		LM.LoginFormFill("Test@gmail.com", "Selenium@2022");
		LM.loginbutton.click();
		PM.NoProjectClickOk();
		PM.LoadAutomationProject("Training-Automation");
		int DSCount=DSM.CountDataSources("Medical Transactions");		
		System.out.println(DSCount);	
		int ChartCount=CM.CountSavedChart();
		System.out.println(ChartCount);
		driver.close();
	}
	
	
	@Test(groups = { "RegressionTest5" }, priority = 9)
	public void FWA_Project_009() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();	
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ChartModel CM = PageFactory.initElements(driver, automationModels.ChartModel.class);
		DashboardModel DM = PageFactory.initElements(driver, automationModels.DashboardModel.class);
		
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CreateNewProject("SharedProject");
		PM.LoadAutomationProject("Training-Automation");
		PM.GetIndexOfProject("Training-Automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='project-projectTree-treePanel-001']//child::table['" + PM.index + "'+'"
				+ 1 + "']//tr//td[2]")).click();
		Thread.sleep(2000);
		PM.ExpandAllProjectItems();
		PM.RightClickOnItemProjectDetailTree("AutoCreatedDashboard");
		Thread.sleep(2000);
		PM.ShareItemWithOtherProject.click();
		Thread.sleep(2000);
		PM.SelectProjectToshare("SharedProject");
		PM.SaveSharedItemWithOtherProjects.click();
		PM.LoadAutomationProject("SharedProject");
		int DSCount=DSM.CountDataSources("Medical Transactions");		
		System.out.println(DSCount);	
		int ChartCount=CM.CountSavedChart();
		System.out.println(ChartCount);
		int CountDashboards= DM.CountDashboard();
		System.out.println(CountDashboards);
		Thread.sleep(2000);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
        PM.DeleteProject("SharedProject");
        PM.LoadAutomationProject("Training-Automation");
        driver.close();
	}
	

	@Test(groups = {"RegressionTest1"}, priority = 10)
	public void FWA_Project_010() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		LM.LoginFormFill("Test@gmail.com", "Selenium@2022");
		LM.loginbutton.click();
		PM.NoProjectClickOk();
		PM.CreateNewProject("ProjectAddGit");
		DSM.CreateMicrosoftExcelDS(excldatasourcename, "Automation1 - Dental01.xlsx");
		int CountDS=DSM.CountDataSources(excldatasourcename);
		System.out.println(CountDS);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		PM.RightClickOnProject("ProjectAddGit");
		PM.GitOptionRightClickonProject.click();
		Thread.sleep(2000);
		PM.AddOption.click();
		Thread.sleep(2000);
		PM.OkExportProjectButton.click();
		String AddtoGitMessage=PM.MessageBoxTextAddPushPullDeleteToGit.getText();
		System.out.println(AddtoGitMessage);
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		driver.close();
	}
	@Test(groups = {"RegressionTest1"}, priority = 11,dependsOnMethods = { "FWA_Project_010" })
	public void FWA_Project_011() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);

		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		LM.LoginFormFill("Test2@gmail.com", "Selenium@2022");
		LM.loginbutton.click();
		PM.NoProjectClickOk();
		PM.ImportFromGitButton.click();
		Thread.sleep(2000);
		PM.SelectProjecttoImportFromGit("ProjectAddGit");
		Thread.sleep(5000);
		PM.CheckBoxSelectItemsofProjecttoImportFromGit.click();
		PM.ImportFileFromGit.click();
		utilityMethods.waitForVisibility(PM.OkImportProjectFromGit);
		PM.OkImportProjectFromGit.click();
		PM.ReloadProjects.click();
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		PM.LoadAutomationProject("ProjectAddGit");
		int CountDSImportedProject=DSM.CountDataSources(excldatasourcename);
		System.out.println(CountDSImportedProject);
	    DSM.CreateMicrosoftExcelDS(excldatasourcename1, "Automation1 - Dental01.xlsx");
	    Thread.sleep(2000);
	    int CountDSafterAddedDSInImportedProject=DSM.CountDataSources(excldatasourcename1);
		System.out.println(CountDSafterAddedDSInImportedProject);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		PM.RightClickOnProject("ProjectAddGit");
		PM.GitOptionRightClickonProject.click();
		Thread.sleep(2000);
		PM.CommitPush.click();
		Thread.sleep(2000);
		PM.OkExportProjectButton.click();
		String commitPushGitMessage=PM.MessageBoxTextAddPushPullDeleteToGit.getText();
		System.out.println(commitPushGitMessage);
		utilityMethods.waitForVisibility(PM.OKButton);
		PM.OKButton.click();
		driver.close();
		
	}
			
	@Test(groups = {"RegressionTest1"}, priority = 12,dependsOnMethods = { "FWA_Project_011" })
	public void FWA_Project_012() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();
		LoginModel LM = PageFactory.initElements(driver, automationModels.LoginModel.class);
		SecurityModel SM = PageFactory.initElements(driver, automationModels.SecurityModel.class);
		DataSourceModel DSM = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);

		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);	
		SM.MenuButton.click();
		SM.LogoutButton.click();
		Thread.sleep(2000);	
		LM.LoginFormFill("Test@gmail.com", "Selenium@2022");
		LM.loginbutton.click();
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		int CountDSBeforePulled=DSM.CountDataSources(excldatasourcename);
		System.out.println(CountDSBeforePulled);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		PM.RightClickOnProject("ProjectAddGit");
		PM.GitOptionRightClickonProject.click();
		Thread.sleep(2000);
		PM.Pull.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(PM.OKButton);
		PM.OKButton.click();
		String pullGitMessage=PM.MessageBoxTextAddPushPullDeleteToGit.getText();
		System.out.println(pullGitMessage);
		int CountDSafterPull=DSM.CountDataSources(excldatasourcename1);
		System.out.println(CountDSafterPull);
		SM.MenuButton.click();
		SM.LogoutButton.click();
		Configuration.LoginApplication();
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.DeleteProject("ProjectAddGit");
		driver.close();
	
	}
	@Test
	public void FWA_Project_013() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		PM.DeleteAllAutoCreatedProjects("import");
		PM.DeleteAllAutoCreatedProjects("hello");
	
	}
	@AfterClass(alwaysRun=true)
	public static void endreport() {

		reportUtil.endTest();

	}
}
