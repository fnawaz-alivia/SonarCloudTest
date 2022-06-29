package automationCases;


import java.nio.file.Paths;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
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
import automationUtils.utilityMethods;
import configuration.Configuration;

public class Projects extends Configuration {
	public static ExtentTest test;
	String excldatasourcename1 = RandomStringUtils.randomAlphabetic(10);
	String excldatasourcename = RandomStringUtils.randomAlphabetic(10);
	String ImportedProject = RandomStringUtils.randomAlphabetic(10);

	@Test(groups = {"smoke" ,"regression"}, priority = 1,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_001() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		test = report.createTest("Verify the user is able to access the Project screen");
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		test.log(Status.PASS, "The Project screen is being shown");
		Thread.sleep(8000);
		test = report.createTest("Create Folder button works");
		PM.CreateFolderButton.click();
		test.log(Status.PASS, "New Folder is being created");
		PM.ProjectFormFill("AutoCreatedFolder", "AutoCreatedFolder");
		test = report.createTest("Create New Folder Window - Folder visibility type.");
		PM.PublicOption.click();
		test.log(Status.PASS, "The public option is selected successfully");
		test = report.createTest("Create New Folder Window - Details can be saved");
		PM.SaveButton.click();
		test.log(Status.PASS, "The folder details are saved successfully");
		Thread.sleep(2000);
		for (int i = 1; i < 3; i++) {
			PM.RightClickOnProject("AutoCreatedFolder");
			Thread.sleep(2000);
			test = report.createTest("Verify that the Create Project option is enabled and Project can be created from right click selection menu.");
			test = report.createTest("Verify the create project button is enabled when the user do the right click on the folder");
			PM.CreateProjectOptionRightClickonFolder.click();
			test.log(Status.PASS, "the create project button is enabled when the user do the right click on the folder");
			test.log(Status.PASS, "User is able to create project");
			PM.ProjectFormFill("AutoCreatedProject" + i, "AutoCreatedProject" + i);
			test = report.createTest("Create New Project Window - Project visibility type.");
			PM.PublicOption.click();
			test.log(Status.PASS, "The public option is selected successfully");
			test = report.createTest("Create New Folder Window - Details can be saved");
			PM.SaveButton.click();
			test.log(Status.PASS, "The project details are saved successfully");
			Thread.sleep(2000);
			test = report.createTest("Verify Newly created project laods");
			PM.YesButton.click();
			test.log(Status.PASS, "The project is being laoded");
			Thread.sleep(2000);
			test = report.createTest("Switch between projects Proj1 to another project");
			Assert.assertEquals(PM.LoadedProjectText.getText(), "AutoCreatedProject" + i);
			test.log(Status.PASS, "The projects are being swithced successfully");
		}
		test = report.createTest("Verify the user is able to delete the Project.");
		PM.DeleteProject("AutoCreatedFolder");
		test.log(Status.PASS, "The projects is deleted successfully");
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}

	@Test(groups = {"regression"}, priority = 2,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_002() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.GetIndexOfProject("Training-Automation");
		Thread.sleep(2000);
		test = report.createTest("Verfiy the project Items details");
		driver.findElement(By.xpath("//*[@id='project-projectTree-treePanel-001']//child::table['" + PM.index + "'+'"
				+ 1 + "']//tr//td[2]")).click();
		Thread.sleep(2000);
	
		test.log(Status.PASS, "The project Items details are being shown");
		Thread.sleep(2000);
		test = report.createTest("Verify the user can expand all project items in Items details panel");
		PM.ExpandAllProjectItems();
		test.log(Status.PASS, " The user is able to expand all project items in Items details panel");
		test = report.createTest("Verify Model Type");
		PM.ClickItemProjectDetailTree("R Operator");
		Thread.sleep(2000);
		Assert.assertEquals("Analysis Model", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "The Model type is being shown correct");
		Thread.sleep(2000);
		test = report.createTest("Verify Dashboard Type");
		PM.ClickItemProjectDetailTree("AutoCreatedDashboard");
		Thread.sleep(2000);
		Assert.assertEquals("Dashboard", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "The Dashboard type is being shown correct");
		test = report.createTest("Verify Data Source Type");
		PM.ClickItemProjectDetailTree("Medical Transactions");
		Thread.sleep(2000);
		Assert.assertEquals("Data Source", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "The Data Source type is being shown correct");
		test = report.createTest("Verify Query Filter Type");
		PM.ClickItemProjectDetailTree("AutoCreatedQB");
		Thread.sleep(2000);
		Assert.assertEquals("Query Filter", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "The Query Filter type is being shown correct");
		test = report.createTest("Verify chart Type");
		PM.ClickItemProjectDetailTree("AutoCreatedChart");
		Thread.sleep(2000);
		Assert.assertEquals("Chart", PM.GetElementTypeText.getText());
		test.log(Status.PASS, "The Chart type is being shown correct");
		driver.close();
	}

	@Test(groups = {"smoke" ,"regression"}, priority = 3,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_003() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(8000);
		PM.CheckLoadedProjectandLoadAutomationProject();
		test = report.createTest("Verify the user can export project with filters");
		test = report.createTest("Whole project can be exported");
		test = report.createTest("All projects shall have option to export in their right click menu");
		
		PM.RightClickOnProject("Training-Automation");
		test = report.createTest("All items of exported project shall be imported but shouldn't have any data and executions.");
		
		PM.ExportOptionRightClickonProject.click();
		test.log(Status.PASS, "The projects have option to export in their right click menu");
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(PM.CheckBoxForExportFilters);
		test = report.createTest("Verify CheckBOx shows to export project with Filters");
		PM.CheckBoxForExportFilters.click();
		test.log(Status.PASS, "The Checkbox to export project is being shown");
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		test = report.createTest("Verify that on project export .alivia file shall be created");
		PM.OkExportProjectButton.click();
		test.log(Status.PASS, "The Project is being exported successfully");
		test.log(Status.PASS, "The whole Project is being exported successfully");
		test.log(Status.PASS, "The project is being created with .alivia file");
		driver.close();
	} 
	
	@Test(groups = {"regression"}, priority = 4,retryAnalyzer = listeners.RetryAnalyzer.class)
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
		test = report.createTest("Verify The user is able to export project without Filters");
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OkExportProjectButton);
		PM.OkExportProjectButton.click();
		test.log(Status.PASS, "The project is being exported without filtes");
		Thread.sleep(2000);
		test = report.createTest("Verify the import local project button works");
		PM.ImportLocalProjectButton.click();
		test.log(Status.PASS, "The import local project button works");
		test = report.createTest("Verify User is able browseFile to import");
		String FilePathForImportProject = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\project-2022-01-11 15.45.54.alivia")
				.toAbsolutePath().toString();
		PM.BrowseFileForProject.sendKeys(FilePathForImportProject);
		test.log(Status.PASS, "The User is able browseFile to import");
		PM.ImportFileForProject.click();
		Thread.sleep(2000);
		test = report.createTest("Verify User is able to import as a new project");
		PM.RadioButtonforCreateNew.click();
		test.log(Status.PASS, "Th User is able to import as a new project");
		PM.InputProjectNameToImport.clear();
		test = report.createTest("Verify User is able to enter Project name");
		PM.InputProjectNameToImport.sendKeys(ImportedProject);
		test.log(Status.PASS, "Th User is able to enter Project name");
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
		PM.LoadAutomationProject(ImportedProject);
		Thread.sleep(2000);
		test = report.createTest("Verify the chart shows in imported project");
		int savedChartCount=CM.CountSavedChart();
		System.out.println(savedChartCount);
		test.log(Status.PASS, "The charts are being shown in imported project");
		test = report.createTest("Verify  the datasource shows in imported project");
		int dataSourcesCount=  DSM.CountDataSources("Medical Transactions");
		System.out.println(dataSourcesCount);
		test.log(Status.PASS, "The datasources are being shown in imported project");
		test = report.createTest("Verify the model shows in imported project");
		int CountModels=  MLM.CountModlingLibrary();
		System.out.println(CountModels);
		test.log(Status.PASS, "The models are being shown in imported project");
		test = report.createTest("Verify the dashboard shows in imported project");
		int CountDashboards= DM.CountDashboard();
		System.out.println(CountDashboards);
		test.log(Status.PASS, "The dashboards are being shown in imported project");
		
		
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		Thread.sleep(2000);
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}
	@Test (groups = {"regression"}, priority = 5,dependsOnMethods = { "FWA_Project_004" },retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_005() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		QueryBuilderModel QBM = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CheckLoadedProjectandLoadAutomationProject();
		Thread.sleep(2000);
		test = report.createTest("Verify the import local project button works");
		PM.ImportLocalProjectButton.click();
		test.log(Status.PASS, "The import local project button is working as expected");
		test = report.createTest("Verify the user is able to browse the local project");
		String FilePathForImportProject = Paths
				.get(System.getProperty("user.dir") + "\\src\\datafiles\\project-2021-12-15 17.15.22.alivia")
				.toAbsolutePath().toString();
		test.log(Status.PASS, "The user is able to browse the local project");
		PM.BrowseFileForProject.sendKeys(FilePathForImportProject);
		PM.ImportFileForProject.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the user is able to checked the radio button for existing project");
		PM.RadioButtonChooseExistingProject.click();
		test.log(Status.PASS, "The user is able to checked the radio button for existing project");
		utilityMethods.waitForVisibility(PM.OKButton);
		PM.OKButton.click();
		utilityMethods.waitForVisibility(PM.SelectProjectImportLocalProjectDataWindow);
		PM.SelectProjectImportLocalProjectDataWindow.click();
		test = report.createTest("Verify the user is able to select the existing project");
		PM.SelectProjectImportLocalProjectDataWindow.sendKeys(ImportedProject);
		PM.SelectProjectImportLocalProjectDataWindow.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		PM.SelectProjectItemstoImport.click();
		test.log(Status.PASS, "The user is able to select the existing project");
		utilityMethods.waitForVisibility(PM.SaveImportProjectButton);
		PM.SaveImportProjectButton.click();
		utilityMethods.waitForVisibility(PM.OKProjectImportButton);
		PM.OKProjectImportButton.click();
		PM.ReloadProjects.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the user is able to load the imported project");
		PM.LoadAutomationProject(ImportedProject);
		Thread.sleep(2000);
		test.log(Status.PASS, "The user is able to load the imported project");
		test = report.createTest("Verify the Query Filters are avilable in imported project");
		int QBCount=QBM.CountQB();
		System.out.println(QBCount);
		test.log(Status.PASS, "The Query Filters are avilable in imported project");
		PM.GetStarted.click();
		PM.SearchTabProject.click();
		Thread.sleep(2000);
		PM.DeleteProject(ImportedProject);
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
	}
	
	
	
	@Test(groups = {"regression"}, priority = 6,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_006() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		test = report.createTest("Verify that Create folder Button is visible on the landing screen");
		if(PM.CreateFolderButton.isDisplayed())
		{
			test.log(Status.PASS, "The Create folder Button is visible on the landing screen");	
		}
		else {
			test.log(Status.FAIL, "The Create folder Button is visible on the landing screen");
		}	
		
		test = report.createTest("Verify that 'Create Folder Button' is clickable");
		if(PM.CreateFolderButton.isEnabled())
		{
			test.log(Status.PASS, "The 'Create Folder Button' is clickable");	
		}
		else {
			test.log(Status.FAIL, "The 'Create Folder Button' is not clickable");
		}	
		
		test = report.createTest("Verify the create folder button works");
		PM.CreateFolderButton.click();
		test.log(Status.PASS, "The create folder is working as expected");
		test = report.createTest("Verify the user is able to fill the form on new folder window");
		PM.ProjectFormFill("AutoCreatedFolder", "AutoCreatedFolder");
		test.log(Status.PASS, "The the user is able to fill the form on new folder window");
		test = report.createTest("Create New Project Window -Verfiy the project visibility type.");
		test = report.createTest("Verify that 'Visibility Radio Button' appears on the 'Create New Project Screen'");
		if(PM.PublicOption.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Visibility Radio Button' appears appears on the 'Create New Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Visibility Radio Button' doesn't appear on the 'Create New Project Screen'");			
		}
		test = report.createTest("Verify that both Public and Private Radio Buttons are Clickable");
		if(PM.Private.isDisplayed()) 
		{
			test.log(Status.PASS, "both Public and Private Radio Buttons are Clickable");	
		}
		else {
			test.log(Status.FAIL, "both Public and Private Radio Buttons are not Clickable");			
		}
		test = report.createTest("Verify that both Public and Private Radio Buttons cannot be clicked simultaneously.");
		PM.PublicOption.click();
		test.log(Status.PASS, "both Public and Private Radio Buttons cannot be clicked simultaneously.");
		test = report.createTest("Verify that Save Button is visible on 'Create Folder' screen");
		if(PM.SaveButton.isDisplayed()) 
		{
			test.log(Status.PASS, " The Save Button appears on the 'Create Folder' Screen");	
		}
		else {
			test.log(Status.FAIL, "The Save Button doesn't appear on the Create Folder' Screen");			
		}
		test = report.createTest("Create Folder:- Verify that Save Button is Clickable ");
		if (PM.SaveButton.isEnabled()) {
			test.log(Status.PASS, " The Save Button is Clickable");
		}
		else {
			test.log(Status.FAIL, "The Save Button is not Clickable");	
		}
		
		test = report.createTest("New Folder Screen:- Verify that Cancel button appears on the New Project Screen");
		if(PM.CancelButtonEditFolderWidnow.isDisplayed()) 
		{
			test.log(Status.PASS, "The cancel button appears on the new folder Screen");	
		}
		else {
			test.log(Status.FAIL, "The cancel button doesn't appear on the new folder Screen");			
		}
		
		test = report.createTest("New folder Screen:- Verify that Cancel button is Clickable");
		if(PM.CancelButtonEditFolderWidnow.isEnabled()) 
		{
			test.log(Status.PASS, "The cancel button is Clickable");	
		}
		else {
			test.log(Status.FAIL, "The cancel button is not Clickable");			
		}
		
		test = report.createTest("Verify the save button works on create new folder window");
		PM.SaveButton.click();
		test.log(Status.PASS, "The save button works on create new folder window");
		test = report.createTest("Verify the folder acess after saving the folder");
		utilityMethods.waitForVisibility(PM.CheckFolderAccess);	
		
		System.out.println(PM.CheckFolderAccess.getText());
		
		String folderAcess =PM.CheckFolderAccess.getText();
		if (folderAcess.equalsIgnoreCase("Public"))
		{
			test.log(Status.PASS, "The folder acess is public as expected");
		}
		else {
			test.log(Status.FAIL, "The folder acess is not showing correct");
		}
		test = report.createTest("Verify the folder name on preview/details tab");
		System.out.println(PM.CheckFolderName.getText());
		String folderName= PM.CheckFolderName.getText();
		if (folderName.equalsIgnoreCase("AUTOCREATEDFOLDER"))
		{
			test.log(Status.PASS, "The folder Name is correct");
		}
		else {
			test.log(Status.FAIL, "The folder Name is showing wrong");
		}
		test = report.createTest("Verify the edit folder widnow opens by clicking upon config button on preview/details tab ");
		test = report.createTest("Verify the config button works on preview/details tab ");
		PM.ConfigButton.click();
		test.log(Status.PASS, "The config button works on preview/details tab ");
		test = report.createTest("Edit folder Screen:- Verify that Project Name Text Field is auto populated when Edit Project Screen opens");
		String projectNameOnEditpage= PM.InputFolderName.getAttribute("value");
		if (projectNameOnEditpage.equalsIgnoreCase("AUTOCREATEDFOLDER"))
		{
			test.log(Status.PASS, "The folder Name Text Field is auto populated when Edit folder Screen opens");
		}
		else {
			test.log(Status.FAIL, "The folder Name Text Field is not auto populated when Edit folder Screen opens");
		}
		test = report.createTest("Edit Project Screen:- Verify that Project Description Text Field is auto populated when Edit Project Screen opens");
		String projectDescriptionOnEditpage=PM.InputFolderDescription.getAttribute("value");
		if (projectDescriptionOnEditpage.equalsIgnoreCase("AUTOCREATEDFOLDER"))
		{
			test.log(Status.PASS, "The folder Description Text Field is auto populated when Edit folder Screen opens");
		}
		else {
			test.log(Status.FAIL, "The folder  Description Text Field is not auto populated when Edit folder Screen opens");
		}
	
		test = report.createTest("Edit folder Screen:- Verify that 'folder Name Text Field' appears on the 'Edit folder''");
		if(PM.InputFolderName.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'folder Name Text Field' appears on the 'Edit folder Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'folder Name Text Field' doesn't appear on the 'Edit folder Screen'");			
		}
		test = report.createTest("Edit folder screen:Verify that the 'folder Name Text Field' is mandatory");
		test = report.createTest("Edit folder screen:Verify that if the folder Name is empty an exclamation mark should appear on right side");
		PM.InputFolderName.click();
		PM.InputFolderName.clear();
		PM.InputFolderDescription.click();
		Thread.sleep(3000);
		if(PM.exclamationmark.isDisplayed()) {
			test.log(Status.PASS, "if the folder Name is empty an exclamation mark appears on right side");
		}
		else {
			test.log(Status.FAIL, "if the folder Name is empty an exclamation mark doesn't appear on right side");
		}
		test = report.createTest("Edit folder screen:Verify that hovering on the exclamation mark should display 'This field is required' message");
		if(PM.exclamationmark.getAttribute("data-errorqtip").contains("This field is required")) {
			test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
		}
		else
		{
			test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
		}
         PM.InputFolderName.sendKeys("AutoCreatedProject");
		
		test = report.createTest("Edit folder screen:Verify that a 'folder Description' box appears on the 'Edit folder screen'");
		if(PM.InputFolderDescription.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'folder Description' box appears appears on the 'Edit folder screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'folder Description' box doesn't appear on the 'Edit folder screen'");			
		}
	
		test = report.createTest("Edit folder screen -Verfiy the folder visibility type.");
		test = report.createTest("Edit folder screen:Verify that 'Visibility Radio Button' appears on the 'Edit folder screen'");
		if(PM.PublicOption.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Visibility Radio Button' appears appears on the 'Edit folder screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Visibility Radio Button' doesn't appear on the 'Edit folder screen'");			
		}
		test = report.createTest("Edit folder screen:Verify that both Public and Private Radio Buttons are Clickable");
		if(PM.Private.isDisplayed()) 
		{
			test.log(Status.PASS, "both Public and Private Radio Buttons are Clickable");	
		}
		else {
			test.log(Status.FAIL, "both Public and Private Radio Buttons are not Clickable");			
		}
		test = report.createTest("Edit Folder Screen:- Verify that Cancel button appears on the Edit Project Screen");
		if(PM.CancelButtonEditFolderWidnow.isDisplayed()) 
		{
			test.log(Status.PASS, "The cancel button appears on the Edit folder Screen");	
		}
		else {
			test.log(Status.FAIL, "The cancel button doesn't appear on the Edit folder Screen");			
		}
		
		test = report.createTest("Edit folder Screen:- Verify that Cancel button is Clickable");
		if(PM.CancelButtonEditFolderWidnow.isEnabled()) 
		{
			test.log(Status.PASS, "The cancel button is Clickable");	
		}
		else {
			test.log(Status.FAIL, "The cancel button is not Clickable");			
		}
		test = report.createTest("Edit Folder:- Verify that clicking on Cancel Button discards the chnages and navigates back to Landing screen");
		PM.CancelButtonEditFolderWidnow.click();
		test.log(Status.PASS, "clicking on Cancel Button discards the chnages and navigates back to Landing screen");
		Thread.sleep(2000);
		test = report.createTest("Verify the edit folder window gets closed by clicking on canncel button");
		test.log(Status.PASS, "The edit folder window gets closed by clicking on canncel button");
		PM.ConfigButton.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the edit folder window gets closed by clicking on cross button ");
		PM.CloseDialogEditFolderWidnow.click();
		test.log(Status.PASS, "The edit folder window gets closed by clicking on cross button ");
		Thread.sleep(2000);
		test = report.createTest("Verify that user can have Edit options for folders in the right click menu. ");
		PM.RightClickOnProject("AutoCreatedFolder");
		PM.EditOptionRightClikonFolder.click();
		test.log(Status.PASS, "The edit folder window opens on eidt option");
		test = report.createTest("Edit Folder Window - Folder name is editable. ");
		PM.InputFolderName.clear();
		test = report.createTest("Verify the Query Filters are avilable in imported project");
		PM.InputFolderName.sendKeys("Updated");
		test = report.createTest("Edit Folder Window - Folder description is editable.");
		PM.InputFolderDescription.clear();
		test = report.createTest("Edit Folder Window - Folder description is editable.");
		PM.InputFolderDescription.sendKeys("Updated");
		test = report.createTest("Verify the Query Filters are avilable in imported project");
		test = report.createTest("Edit Folder Window - Folder visibility type.");
		PM.Private.click();
		test = report.createTest("Edit Folder:- Verify that Save Button is visible on Edit Folder screen");
		if(PM.SaveButton.isDisplayed()) 
		{
			test.log(Status.PASS, " The Save Button appears on the Edit Folder screen");	
		}
		else {
			test.log(Status.FAIL, "The Save Button doesn't appear on the Edit Folder screen");			
		}
		test = report.createTest("Edit Folder screen:- Verify that Save Button is Clickable ");
		if (PM.SaveButton.isEnabled()) {
			test.log(Status.PASS, " The Save Button is Clickable");
		}
		else {
			test.log(Status.FAIL, "The Save Button is not Clickable");
		}
		test = report.createTest("Edit Folder Window - Edits can be saved");
		PM.SaveButton.click();	
		Thread.sleep(2000);
		test = report.createTest("Verify the reload projects button works");
		PM.ReloadProjects.click();
		utilityMethods.WaitforElementNotVisible(PM.LoadProjectsICon);
		Thread.sleep(2000);
		PM.ClickOnProject("Updated");
		test = report.createTest("Verify the folder access after edit to private");
		System.out.println(PM.CheckFolderAccess.getText());
		
		String folderAcessAfterEdit =PM.CheckFolderAccess.getText();
		if (folderAcessAfterEdit.equalsIgnoreCase("Private"))
		{
			test.log(Status.PASS, "The folder acess is Private as expected");
		}
		else {
			test.log(Status.FAIL, "The folder acess is not showing correct");
		}
		test = report.createTest("Verify the folder name after edits");
		System.out.println(PM.CheckFolderName.getText());
		String folderNameAfterEdit= PM.CheckFolderName.getText();
		if (folderNameAfterEdit.equalsIgnoreCase("UPDATED"))
		{
			test.log(Status.PASS, "The folder Name is correct");
		}
		else {
			test.log(Status.FAIL, "The folder Name is showing wrong");
		}
		test = report.createTest("Verify that user can have Rename option for folders in the right click menu.");
		PM.RightClickOnProject("Updated");
		PM.RenameOptionRightClikonFolder.click();
		test.log(Status.PASS, " The user can have Rename option for folders in the right click menu");
		test = report.createTest("Rename Filter  Window - Filter name is editable.");
		PM.InputRenameFolder.clear();
		test.log(Status.PASS, " Filter name is editable");
		test = report.createTest("Verify the user is able to enter folder name");
		PM.InputRenameFolder.sendKeys("Renamed");
		test.log(Status.PASS, " Filter name is can be clear and enter");
		PM.OKButtonSelectaProjectWondow.click();
		test = report.createTest("Rename Filter  Window - Detail can be saved.");
		utilityMethods.waitForVisibility(PM.RenameProjectOk);
		PM.RenameProjectOk.click();
		test.log(Status.PASS, " The Details are being saved successfully");
		Thread.sleep(2000);
		test = report.createTest("Verify the user can delete the renamed folder");
		PM.DeleteProject("Renamed");
		test.log(Status.PASS, "The user can delete the renamed folder");
		driver.close();
		}
		
		@Test(groups = {"regression"}, priority = 7,retryAnalyzer = listeners.RetryAnalyzer.class)
	public void FWA_Project_007() throws InterruptedException {
		Configuration.BConfiguration();
		Configuration.LoginApplication();
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);
		PM.CreateNewProject("AutoCreatedProject");
		test = report.createTest("Verify the project visibility type");
		utilityMethods.waitForVisibility(PM.CheckFolderAccess);	
		System.out.println(PM.CheckFolderAccess.getText());
		String projectAcess =PM.CheckFolderAccess.getText();
		if (projectAcess.equalsIgnoreCase("Public"))
		{
			test.log(Status.PASS, "The project acess is Public as expected");
		}
		else {
			test.log(Status.FAIL, "The project acess is not showing correct");
		}
		test = report.createTest("Verify the project name");
		System.out.println(PM.CheckFolderName.getText());
		String projectName= PM.CheckFolderName.getText();
		if (projectName.equalsIgnoreCase("AutoCreatedProject"))
		{
			test.log(Status.PASS, "The project Name is correct");
		}
		else {
			test.log(Status.FAIL, "The project Name is showing wrong");
		}
		test = report.createTest("Verify the config button is enabled");
		PM.ConfigButton.click();
		test.log(Status.PASS, "The config button is enabled");
		Thread.sleep(4000);
		test = report.createTest("Edit Project Screen:- Verify that Project Name Text Field is auto populated when Edit Project Screen opens");
		String projectNameOnEditpage= PM.InputFolderName.getAttribute("value");
		if (projectNameOnEditpage.equalsIgnoreCase("AutoCreatedProject"))
		{
			test.log(Status.PASS, "Project Name Text Field is auto populated when Edit Project Screen opens");
		}
		else {
			test.log(Status.FAIL, "The Project Name Text Field is not auto populated when Edit Project Screen opens");
		}
		test = report.createTest("Edit Project Screen:- Verify that Project Type Text Field is auto populated when Edit Project Screen opens");
		String projectTypeOnEditpage=PM.InputProjectType.getAttribute("value");
		if (projectTypeOnEditpage.equalsIgnoreCase("AutoCreatedProject"))
		{
			test.log(Status.PASS, "The Project Type Text Field is auto populated when Edit Project Screen opens");
		}
		else {
			test.log(Status.FAIL, "The Project Type Text Field is not auto populated when Edit Project Screen opens");
		}
		test = report.createTest("Edit Project Screen:- Verify that Project Description Text Field is auto populated when Edit Project Screen opens");
		String projectDescriptionOnEditpage=PM.InputFolderDescription.getAttribute("value");
		if (projectDescriptionOnEditpage.equalsIgnoreCase("AutoCreatedProject"))
		{
			test.log(Status.PASS, "The Project Description Text Field is auto populated when Edit Project Screen opens");
		}
		else {
			test.log(Status.FAIL, "TheProject Description Text Field is not auto populated when Edit Project Screen opens");
		}
		
		test = report.createTest("Edit Project Screen:- Verify that 'Project Name Text Field' appears on the 'Edit Project''");
		if(PM.InputFolderName.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Name Text Field' appears on the 'Edit Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Name Text Field' doesn't appear on the 'Edit Project Screen'");			
		}
		test = report.createTest("Edit Project screen:Verify that the 'Project Name Text Field' is mandatory");
		test = report.createTest("Edit Project screen:Verify that if the Project Name is empty an exclamation mark should appear on right side");
		PM.InputFolderName.click();
		PM.InputFolderName.clear();
		PM.InputFolderDescription.click();
		Thread.sleep(3000);
		if(PM.exclamationmark.isDisplayed()) {
			test.log(Status.PASS, "if the Project Name is empty an exclamation mark appears on right side");
		}
		else {
			test.log(Status.FAIL, "if the Project Name is empty an exclamation mark doesn't appear on right side");
		}
		test = report.createTest("Edit Project screen:Verify that hovering on the exclamation mark should display 'This field is required' message");
		if(PM.exclamationmark.getAttribute("data-errorqtip").contains("This field is required")) {
			test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
		}
		else
		{
			test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
		}
         PM.InputFolderName.sendKeys("AutoCreatedProject");
		test = report.createTest("Edit Project screen:Verify that 'Project Type Text Field' appears on the 'Edit Project screen'");
		if(PM.InputProjectType.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Type Text Field' appears on the 'Edit Project screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Type Text Field' doesn't appear on the 'Edit Project screen'");			
		}
		test = report.createTest("Edit Project screen:Verify that a 'Project Description' box appears on the 'Edit Project screen'");
		if(PM.InputFolderDescription.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Description' box appears appears on the 'Edit Project screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Description' box doesn't appear on the 'Edit Project screen'");			
		}
	
		test = report.createTest("Edit Project screen -Verfiy the project visibility type.");
		test = report.createTest("Edit Project screen:Verify that 'Visibility Radio Button' appears on the 'Edit Project screen'");
		if(PM.PublicOption.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Visibility Radio Button' appears appears on the 'Edit Project screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Visibility Radio Button' doesn't appear on the 'Edit Project screen'");			
		}
		test = report.createTest("Edit Project screen:Verify that both Public and Private Radio Buttons are Clickable");
		if(PM.Private.isDisplayed()) 
		{
			test.log(Status.PASS, "both Public and Private Radio Buttons are Clickable");	
		}
		else {
			test.log(Status.FAIL, "both Public and Private Radio Buttons are not Clickable");			
		}

		test = report.createTest("Edit Project Screen:- Verify that Cancel button appears on the Edit Project Screen");
		if(PM.CancelButtonEditFolderWidnow.isDisplayed()) 
		{
			test.log(Status.PASS, "The cancel button appears on the Edit Project Screen");	
		}
		else {
			test.log(Status.FAIL, "The cancel button doesn't appear on the Edit Project Screen");			
		}
		
		test = report.createTest("Edit Project Screen:- Verify that Cancel button is Clickable");
		if(PM.CancelButtonEditFolderWidnow.isEnabled()) 
		{
			test.log(Status.PASS, "The cancel button is Clickable");	
		}
		else {
			test.log(Status.FAIL, "The cancel button is not Clickable");			
		}
		
		test = report.createTest("Edit Project Screen:- Verify that on Clicking the Cancel Button the 'Edit Project Screen' Disapperas and navigates back to Landing Screen");
		PM.CancelButtonEditFolderWidnow.click();
		test.log(Status.PASS, "on Clicking the Cancel Button the 'Edit Project Screen' Disapperas and navigates back to Landing Screen");
		Thread.sleep(2000);
		PM.ConfigButton.click();
		Thread.sleep(2000);
		test = report.createTest("Edit Project Window - verify the cross button.");
		PM.CloseDialogEditFolderWidnow.click();
		test.log(Status.PASS, "The  cross button is working as expected");
		Thread.sleep(2000);
		PM.RightClickOnProject("AutoCreatedProject");
		test = report.createTest("Verify that user can have Edit option for Projects in the right click menu.");
		PM.EditOptionRightClikonFolder.click();
		test.log(Status.PASS, "The  user can have Edit option for Projects in the right click menu");
		test = report.createTest("Edit Project Window - Project name is editable. ");
		PM.InputFolderName.clear();
		test.log(Status.PASS, "The Project name is editable.");
		PM.InputFolderName.sendKeys("UpdatedProject");
		test = report.createTest("Edit Project Window - Project description is editable.");
		PM.InputFolderDescription.clear();
		PM.InputFolderDescription.sendKeys("UpdatedProject");
		test.log(Status.PASS, "The Project description is editable.");
		test = report.createTest("Edit Project Window - Project visibility type.");
		PM.Private.click();
		test.log(Status.PASS, "The project visibility can be changed ");
		test = report.createTest("Edit Project Screen:- Verify that Save Button appears on the Edit Project Screen");
		if(PM.SaveButton.isDisplayed()) 
		{
			test.log(Status.PASS, " The Save Button appears on the 'Edit Project Screen");	
		}
		else {
			test.log(Status.FAIL, "The Save Button doesn't appear on the 'Edit Project Screen");			
		}
		test = report.createTest("Edit Project Screen:- Verify that the Save Button is Clickable");
if (PM.SaveButton.isEnabled()) {
			test.log(Status.PASS, " The Save Button is Clickable");
		}
		else {
	test.log(Status.FAIL, "The Save Button is not Clickable");			
		
		}
		test = report.createTest("Edit Project Screen:- Verify that the Save Button saves the Edited Project in the project list on the Landing Screen");
		PM.SaveButton.click();	
		test.log(Status.PASS, "The Save Button saves the Edited Project in the project list on the Landing Screen");
		Thread.sleep(2000);
		test = report.createTest("Verify the reload project button works");
		PM.ReloadProjects.click();
		test.log(Status.PASS, "The reload project button works as expected");
		utilityMethods.WaitforElementNotVisible(PM.LoadProjectsICon);
		Thread.sleep(2000);
		PM.ClickOnProject("UpdatedProject");
		test = report.createTest("Verify the project visibility after edits");
		System.out.println(PM.CheckFolderAccess.getText());
		String projectAcessAfterEdit =PM.CheckFolderAccess.getText();
		if (projectAcessAfterEdit.equalsIgnoreCase("Private"))
		{
			test.log(Status.PASS, "The project acess is Private as expected");
		}
		else {
			test.log(Status.FAIL, "The project acess is not showing correct");
		}
		test = report.createTest("Verify the project name after edits");
		System.out.println(PM.CheckFolderName.getText());
		String projectNameAfterEdit= PM.CheckFolderName.getText();
		if (projectNameAfterEdit.equalsIgnoreCase("UPDATEDPROJECT"))
		{
			test.log(Status.PASS, "The project Name is correct");
		}
		else {
			test.log(Status.FAIL, "The project Name is showing wrong");
		}
		PM.RightClickOnProject("UpdatedProject");
		test = report.createTest("Verify that user can have Rename option for Projects in the right click menu.");
		PM.RenameOptionRightClikonFolder.click();
		test.log(Status.PASS, "The user can have Rename option for Projects in the right click menu.");
		test = report.createTest("Rename Filter  Window - project name is editable.");
		PM.InputRenameFolder.clear();
		PM.InputRenameFolder.sendKeys("RenamedProject");
		test.log(Status.PASS, "project name is editable");
		PM.OKButtonSelectaProjectWondow.click();
		Thread.sleep(2000);
		test = report.createTest("Verify the renamed project can be deleted");
		PM.DeleteProject("RenamedProject");
		test.log(Status.PASS, "The user can delete the renamed project");
		PM.LoadAutomationProject("Training-Automation");
		driver.close();
		
	}
	@Test(groups = {"regression"}, priority = 8,retryAnalyzer = listeners.RetryAnalyzer.class)
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
		test = report.createTest("Verify that user can have sharing option for Projects in the right click menu.");
		PM.RightClickOnProject("Training-Automation");
		PM.SharingOptionsRightClikonFolder.click();
		test.log(Status.PASS, "The user can have sharing option for Projects in the right click menu.");
		test = report.createTest("Sharing Feature - Add Participant Window - Expand all/collapse all button shall work for the user hierarchy");
		test.log(Status.PASS, " Expand all/collapse all button works for the user hierarchy");
		test = report.createTest("Sharing Feature - verify Add Participant Window opens by clicking on sharing options");
		test.log(Status.PASS, " Add Participant Window opens by clicking on sharing options");
		test = report.createTest("Verify that on Clicking the Share Button 'Add Participants' Screen opens");
		utilityMethods.waitForVisibility(PM.SearchTabAddParticipantsWindow);
		if(PM.SearchTabAddParticipantsWindow.isDisplayed()) {
			test.log(Status.PASS, "on Clicking the Share Button 'Add Participants' Screen opens");
		}
		else {
			test.log(Status.FAIL, "on Clicking the Share Button 'Add Participants' Screen doesn't open");
		}
		test = report.createTest("Verify the Search Input Field is visible on 'Add Participant Screen'");
		if (PM.SearchTabAddParticipantsWindow.isDisplayed())
		{
			test.log(Status.PASS, " the Search Input Field is visible on 'Add Participant Screen'");
		}
		else {
			test.log(Status.FAIL, "the Search Input Field is not visible on 'Add Participant Screen'");
		}
		test.log(Status.PASS, " Add Participant Window - Search feature  works for the shared user.");
		test = report.createTest("Sharing Feature - Add Participant Window - Search feature shall work for the shared user.");
		PM.SearchTabAddParticipantsWindow.sendKeys("Test");
		Thread.sleep(3000);
		test.log(Status.PASS, " Add Participant Window - Search feature  works for the shared user.");
		test = report.createTest("Sharing Feature - Add Participant Window - verify Users can be dragged and dropped into the central area.");
		PM.DragParticipantDropinCetralArea("Test1 Test1 (Test@gmail.com)");
		test.log(Status.PASS, " Add Participant Window - The Users can be dragged and dropped into the central area");
		Thread.sleep(3000);
		test = report.createTest("Sharing Feature - Add Participant Window - Sharing Options - Role access can be given to the assigned user.");
		utilityMethods.waitForVisibility(PM.OKButtonSelectaProjectWondow);
		PM.OKButtonSelectaProjectWondow.click();
		test = report.createTest("Verify the save button works");
		PM.SaveSharedProject.click();
		test.log(Status.PASS, "The save button works on add participant window");
		test = report.createTest("Verify the user is able to click on menu button");
		SM.MenuButton.click();
		test.log(Status.PASS, "The user is able to click on menu button");
		test = report.createTest("Verify the user is able to logout");
		SM.LogoutButton.click();
		test.log(Status.PASS, "The user is able to logout");
		LM.LoginFormFill("Test@gmail.com", "Lahore@2022@");
		LM.loginbutton.click();
		PM.NoProjectClickOk();
		PM.LoadAutomationProject("Training-Automation");
		test = report.createTest("Verify the datasoucres shows in shared project");
		int DSCount=DSM.CountDataSources("Medical Transactions");		
		System.out.println(DSCount);
        if (DSCount>=1) {
        	test.log(Status.PASS, "The data source is showing in shared project.");
		}
		else {
			test.log(Status.FAIL, "The data source is not showing in shared project");
			
		}
		test = report.createTest("Verify the chart shows in shared project");
		int ChartCount=CM.CountSavedChart();
		if (ChartCount>=1) {
			test.log(Status.PASS, "The chart is showing in shared project.");
		}
		else {
			test.log(Status.FAIL, "The chart is not showing in shared project.");
		}
		System.out.println(ChartCount);
		driver.close();
	}
	
	
	@Test(groups = {"regression"}, priority = 9,retryAnalyzer = listeners.RetryAnalyzer.class)
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
		test = report.createTest("Verify the datasource is shared with dashoabrd");
		if (DSCount>=1) {
			test.log(Status.PASS, "The datasource is being shared with dashoabrd.");
		}
		else {
			test.log(Status.FAIL, "The datasource is not being shared with dashoabrd.");
		}
		int ChartCount=CM.CountSavedChart();
		test = report.createTest("Verify the chart is shared with dashoabrd");
		System.out.println(ChartCount);
		if (ChartCount>=1) {
			test.log(Status.PASS, "The chart is being shared with dashoabrd");
		}
		else {
			test.log(Status.FAIL, "The chart is being shared with dashoabrd");
		}
		test = report.createTest("Verify the shared dashobaod shows in shared project");
		int CountDashboards= DM.CountDashboard();
		System.out.println(CountDashboards);
		if (CountDashboards>=1) {
			test.log(Status.PASS, "The shared dashobaod is being shown in shared project");
		}
		else {
			test.log(Status.FAIL, "The shared dashobaod is not being shown in shared project");
		}
		Thread.sleep(2000);
		PM.GetStarted.click();
		PM.SearchTabProject.click();
        PM.DeleteProject("SharedProject");
        PM.LoadAutomationProject("Training-Automation");
        driver.close();
	}
	

	@Test(groups = {"regressiontest"}, priority = 10)
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
	@Test(groups = {"regressiontest"}, priority = 11,dependsOnMethods = { "FWA_Project_010" })
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
			
	@Test(groups = {"regressiontest"}, priority = 12,dependsOnMethods = { "FWA_Project_011" })
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
	@AfterSuite(alwaysRun = true)
	public void FWA_Project_013() throws InterruptedException {
		Configuration.BConfiguration();

		Configuration.LoginApplication();

		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		utilityMethods.waitForVisibility(PM.LoadedProjectText);
		Thread.sleep(2000);	
		PM.DeleteAllAutoCreatedProjects("Training-Automation");
		driver.close();
	
	}
}
