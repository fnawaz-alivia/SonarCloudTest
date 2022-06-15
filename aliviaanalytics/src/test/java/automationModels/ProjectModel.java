package automationModels;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import automationUtils.utilityMethods;
import configuration.Configuration;

public class ProjectModel extends Configuration

{

	public int index;
	public static ExtentTest test;
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]")

	public WebElement PleaseOpenOrSelectaProjectWindow;
	@FindBy(how = How.XPATH, using = "//*[@class='x-btn x-breadcrumb-btn x-breadcrumb-btn-default x-unselectable x-box-item x-btn-plain-toolbar-small']//span")

	public WebElement LoadedProjectText;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'name' and @role = 'textbox']")

	public WebElement InputFolderName;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield-') and @type = 'text' and @name = 'detail' and @role = 'textbox']")

	public WebElement InputProjectType;
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @class = 'x-form-error-msg x-form-invalid-icon x-form-invalid-icon-default' and (text() = 'This field is required' or . = 'This field is required')]")

	public WebElement exclamationmark ;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textfield') and @class = 'x-form-error-msg x-form-invalid-icon x-form-invalid-icon-default' and (text() = 'This field is required' or . = 'This field is required')]")

	public WebElement exclamationmarkTooltip ;
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Save' or . = 'Save')]")

	public WebElement SaveSharedProject;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'radio-') and (text() = 'Public' or . = 'Public')]")

	public WebElement PublicOption;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'textarea') and @name = 'description']")

	public WebElement InputFolderDescription;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and @class = 'x-btn-inner x-btn-inner-default-small' and (text() = 'Save' or . = 'Save')]")

	public WebElement SaveButton;

	@FindBy(how = How.XPATH, using = "//*[@id = 'project-projectPane-createFolderButton-004']")

	public WebElement CreateFolderButton;

	@FindBy(how = How.XPATH, using = "//*[@id='project-projectTree-treePanel-001']//child::table//tr//td//span")

	public List<WebElement> ProjectsList;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Delete' or . = 'Delete')]")

	public WebElement DeleteOptionRightClickonProject;

	@FindBy(how = How.XPATH, using = "//span[starts-with(@id, 'button-') and (text() = 'Yes' or . = 'Yes')]")

	public WebElement YesButton;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @class = 'x-btn-button x-btn-button-default-small x-btn-text    x-btn-button-center ' and (text() = 'Ok' or . = 'Ok')]")

	public WebElement OkButtonDeleteProject;

	@FindBy(how = How.XPATH, using = "//span[starts-with(@id, 'menuitem-') and @data-ref = 'textEl' and (text() = 'Create Project' or . = 'Create Project')]")

	public WebElement CreateProjectOptionRightClickonFolder;

	@FindBy(how = How.XPATH, using = "//*[@id='project-ProjectDetailTree-treePanel-007']//child::table//tr//td//div[2]")

	public List<WebElement> ExpandProjectItemsList;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel x-grid-header-hidden x-box-item x-window-item x-panel-default x-tree-panel x-tree-lines x-grid x-resizable x-panel-resizable x-panel-default-resizable x-border-box']//child::table//tr//td//span")

	public List<WebElement> ParticipantList;

	@FindBy(how = How.XPATH, using = "//*[@id='project-ProjectDetailTree-treePanel-007']//child::table//tr//td//span")

	public List<WebElement> ClickElementToCheckTypeList;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel x-grid-header-hidden x-box-item x-window-item x-panel-default x-tree-panel x-tree-lines x-grid']//child::table//tr//td//div//span")

	public List<WebElement> ProjectsListToShareWithOtherProjects;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-component ai-shareditor x-fit-item x-component-default x-scroller']")

	public WebElement PlaceWhereProjectDroppedToshare;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='win-projectTree-treePanel-001-bodyWrap']//child::table//tr//td//div//span")

	public List<WebElement> ProjectListOnImportGitProjectWindow;
	
	@FindBy(how = How.XPATH, using = "//*[@id='win-project-ProjectDetailTree-treePanel-bodyWrap']//child::table//tr//td//div[2]")

	public WebElement CheckBoxSelectItemsofProjecttoImportFromGit;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @class = 'x-btn-inner x-btn-inner-default-small' and (text() = 'Import File' or . = 'Import File')]")

	public WebElement ImportFileFromGit;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @class = 'x-btn-button x-btn-button-default-small x-btn-text    x-btn-button-center ' and (text() = 'OK' or . = 'OK')]")

	public WebElement OkImportProjectFromGit;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@class,'x-btn public_private x-unselectable')]")

	public WebElement CheckFolderAccess;
	@FindBy(how = How.XPATH, using = "//*[@class='x-component title x-box-item x-component-default']")

	public WebElement CheckFolderName;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@class, 'x-btn config-focus-cls x-unselectable')]")

	public WebElement ConfigButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'radio') and (text() = 'Private' or . = 'Private')]")

	public WebElement Private;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@class, 'x-btn btn-cancel x-unselectable')]")

	public WebElement CancelButtonEditFolderWidnow;
	
	@FindBy(how = How.XPATH, using = "//*[@style = 'left: 540px; top: 3px; margin: 0px;' and starts-with(@class, 'x-tool x-box-item x-tool-default x-tool-after-title') and @data-qtip = 'Close dialog']")

	public WebElement CloseDialogEditFolderWidnow;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Sharing Options ...' or . = 'Sharing Options ...')]")

	public WebElement SharingOptionsRightClikonFolder;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem-') and (text() = 'Make Copy' or . = 'Make Copy')]")

	public WebElement MakeCopyOptionRightClikonFolder;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Rename' or . = 'Rename')]")

	public WebElement RenameOptionRightClikonFolder;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Edit' or . = 'Edit')]")

	public WebElement EditOptionRightClikonFolder;
	
	@FindBy(how = How.XPATH, using = " //*[@class='x-container x-box-item x-window-item x-container-default x-box-layout-ct']//child::input")

	public WebElement InputRenameFolder;
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-component x-border-box x-mask x-component-default' and @aria-valuetext = 'Loading Projects ...']")

	public WebElement LoadProjectsICon;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-container ai-accordion-static x-box-item x-container-default x-box-layout-ct')]//child::label[1]//span[2]")

	public WebElement GetElementTypeText;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'importGitProject-id-btnIconEl']")

	public WebElement ImportFromGitButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and @href = '#' and (text() = 'Pull' or . = 'Pull')]")

	public WebElement Pull;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Commit & Push' or . = 'Commit & Push')]")

	public WebElement CommitPush;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Export Project' or . = 'Export Project')]")

	public WebElement ExportOptionRightClickonProject;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @class = 'x-btn-inner x-btn-inner-default-small' and (text() = 'Save' or . = 'Save')]")

	public WebElement SaveSharedItemWithOtherProjects;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and @href = '#' and @tabindex != '0' and (text() = 'Git' or . = 'Git')]")

	public WebElement GitOptionRightClickonProject;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'gitMenuItem') and @href = '#' and (text() = 'Add' or . = 'Add')]")

	public WebElement AddOption;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-component x-window-text x-box-item x-component-default']")

	public WebElement MessageBoxTextAddPushPullDeleteToGit;
	
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'x-btn-button x-btn-button-default-small x-btn-text    x-btn-button-center ' and (text() = 'Ok' or . = 'Ok')]")

	public WebElement OkExportProjectButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel ai-tree-list x-grid-header-hidden treeview-center-area-cls x-window-item x-panel-default x-tree-panel x-tree-lines x-grid')]//child::table//tr//td//div//div[2]")

	public WebElement CheckBoxForExportFilters;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'importLocalProject-id-btnIconEl']")

	public WebElement ImportLocalProjectButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'filefield') and @type = 'file' and @name = 'file']")

	public WebElement BrowseFileForProject;
	@FindBy(how = How.XPATH, using = "//*[@id = 'import-file-btn-btnInnerEl' and (text() = 'Import File' or . = 'Import File')]")

	public WebElement ImportFileForProject;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'radio') and (text() = 'Create New' or . = 'Create New')]")

	public WebElement RadioButtonforCreateNew;
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'import-new-file-inputEl' and @type = 'text' and @name = 'txt-test1']")

	public WebElement InputProjectNameToImport;
	
	@FindBy(how = How.XPATH, using = "//*[@id='importProjectData-1-body']//child::table//tr//td//div//div[2]")

	public WebElement CheckBoxToImportLocalPorojectData;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id = 'save-import-file-btn-btnInnerEl' and (text() = 'Save' or . = 'Save')]")

	public WebElement SaveImportProjectButton;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Ok' or . = 'Ok')]")

	public WebElement OKButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'OK' or . = 'OK')]")

	public WebElement OKButtonSelectaProjectWondow;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'Ok' or . = 'Ok')]")

	public WebElement RenameProjectOk;

	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @class = 'x-btn-inner x-btn-inner-default-small' and (text() = 'OK' or . = 'OK')]")

	public WebElement OKProjectImportButton;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and @data-qtip = 'Reload Projects' and (text() = ' ' or . = ' ')]")

	public WebElement ReloadProjects;
	
	@FindBy(how = How.XPATH, using = "//*[(text() = 'Get Started' or . = 'Get Started')]")

	public WebElement GetStarted;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id, 'projectPane-id-bodyWrap')]//child::input")

	public WebElement SearchTabProject;
	
	@FindBy(how = How.XPATH, using = "//*[@data-qtip ='Create Project']")

	public WebElement CreateProjectButton;
	
	@FindBy(how = How.XPATH, using = "//*[@class='x-panel x-grid-header-hidden x-box-item x-window-item x-panel-default x-tree-panel x-tree-lines x-grid x-resizable x-panel-resizable x-panel-default-resizable x-border-box']//child::input")

	public WebElement SearchTabAddParticipantsWindow;
	@FindBy(how = How.XPATH, using = " //*[@class='x-panel-body x-panel-body-default x-panel-body-default x-scroller x-noborder-trbl x-resizable x-panel-body-resizable x-panel-body-default-resizable']")

	public WebElement CentralAreaAddParticipantsWindow;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'radio') and (text() = 'Choose Existing Project' or . = 'Choose Existing Project')]")

	public WebElement RadioButtonChooseExistingProject;
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button') and (text() = 'No' or . = 'No')]")

	public WebElement NoButtonProjectLoad;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-field import-dropdown importGitField x-form-item x-form-item-default x-form-type-text x-field-default x-border-box x-fit-item x-window-item x-form-text-heighted')]//child::input")

	public WebElement SelectProjectImportLocalProjectDataWindow;
	
	
	@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'menuitem') and (text() = 'Share with Other Project' or . = 'Share with Other Project')]")

	public WebElement ShareItemWithOtherProject;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class, 'x-window importLocalProject importLocalProject2Options x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable')]//child::table//tr//td//div//div[2]")

	public WebElement SelectProjectItemstoImport;

	public void ProjectFormFill(String pname, String pdescription) throws InterruptedException {
		
		test = report.createTest("Verify that 'Create Folder Button' when clicked pops up 'Create New Folder' screen");
		if (this.InputFolderName.isDisplayed()) {
			test.log(Status.PASS, "The 'Create New Folder' screen opens clicking on create folder button");	
		}
		
		else {
			
			test.log(Status.FAIL, "The 'Create New Folder' screen doesn't open clicking on create folder button");
		}
		
		test = report.createTest("Verify that Folder Name Text Field is visible on 'Create New Folder' screen");
		if (this.InputFolderName.isDisplayed()) {
			test.log(Status.PASS, "The Folder Name Text Field is visible on 'Create New Folder' screen");	
		}
		
		else {
			
			test.log(Status.FAIL, "The Folder Name Text Field is not visible on 'Create New Folder' screen");
		}	
		test = report.createTest("Verify that the 'Project Name Text Field' is mandatory");
		test = report.createTest("Verify that if the Project Name is empty an exclamation mark should appear on right side");
		this.InputFolderName.click();
		this.InputFolderDescription.click();
		Thread.sleep(2000);
		if(this.exclamationmark.isDisplayed()) {
			test.log(Status.PASS, "if the folder Name is empty an exclamation mark appears on right side");
		}
		else {
			test.log(Status.FAIL, "if the folder Name is empty an exclamation mark doesn't appear on right side");
		}
		test = report.createTest("Verify that hovering on the exclamation mark should display 'This field is required' message");
		if(this.exclamationmark.getAttribute("data-errorqtip").contains("This field is required")) {
			test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
		}
		else
		{
			test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
		}
		test = report.createTest("Verify that 'Folder Name' accepts  alphabets");
		this.InputFolderName.sendKeys(pname);
		test.log(Status.PASS, "The user is able to enter the folder name");
		test = report.createTest("Verify that 'Folder Description' Text Field is visible on Create Folder screen");
		if(this.InputFolderDescription.isDisplayed()) {
			test.log(Status.PASS, "The 'Folder Description' Text Field is visible on Create Folder screen");
		}
		else
		{
			test.log(Status.FAIL, "The 'Folder Description' Text Field is not visible on Create Folder screen\"");
		}
		test = report.createTest("Verify that 'Folder Description' accepts  alphabets");
		this.InputFolderDescription.sendKeys(pdescription);
		test.log(Status.PASS, "The user is able to enter the alphabets in field ");
	}
	
	public void SelectProjecttoImportFromGit(String pname) {

		for (WebElement el : ProjectListOnImportGitProjectWindow) {
			if (el.getText().equals(pname)) {
				el.click();
				break;
			}
		}
	}

	public void NoProjectClickOk() throws InterruptedException {
		try {

			Thread.sleep(10000);
			if (this.PleaseOpenOrSelectaProjectWindow.isDisplayed() == true) {

				System.out.println("Element is Visible");
				this.OKButtonSelectaProjectWondow.click();
			}
		} catch (Exception e) {
		}
	}
	
	public void CreateNewProject(String pname) throws InterruptedException {
		test = report.createTest("Verify that Create Project Button is visible on the landing screen");
		if(this.CreateProjectButton.isDisplayed())
		{
			test.log(Status.PASS, "The Create Project Button is visible on the landing screen");	
		}
		else {
			test.log(Status.FAIL, "The Create Project Button is visible on the landing screen");
		}	
		test = report.createTest("Verify that Create Project Button is Clickable and user can click");
		this.CreateProjectButton.click();
		test.log(Status.PASS, "The Create Project Button is Clickable and user can click");
		test = report.createTest("Verify that the Create Project Buttons open 'Create New Project Screen' upon clicking");
		if(this.InputFolderName.isDisplayed()) 
		{
			test.log(Status.PASS, "The Create Project Buttons open 'Create New Project Screen' upon clicking");	
		}
		else {
			test.log(Status.FAIL, "The Create Project Buttons don't open 'Create New Project Screen' upon clicking");			
		}
		test = report.createTest("Verify that 'Project Name Text Field' appears on the 'Create New Project Screen'");
		if(this.InputFolderName.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Name Text Field' appears on the 'Create New Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Name Text Field' doesn't appear on the 'Create New Project Screen'");			
		}
		test = report.createTest("Verify that the 'Project Name Text Field' is mandatory");
		test = report.createTest("Verify that if the Project Name is empty an exclamation mark should appear on right side");
		this.InputFolderName.click();
		this.InputFolderDescription.click();
		Thread.sleep(2000);
		if(this.exclamationmark.isDisplayed()) {
			test.log(Status.PASS, "if the Project Name is empty an exclamation mark appears on right side");
		}
		else {
			test.log(Status.FAIL, "if the Project Name is empty an exclamation mark doesn't appear on right side");
		}
		test = report.createTest("Verify that hovering on the exclamation mark should display 'This field is required' message");
		if(this.exclamationmark.getAttribute("data-errorqtip").contains("This field is required")) {
			test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
		}
		else
		{
			test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
		}
		test = report.createTest("Verify that 'Project Name Text Field' inputs alphabets");	
		this.InputFolderName.sendKeys(pname);
		test.log(Status.PASS, "The user is able to enter alphabets as inputs in Project Name Text Field ");
		test = report.createTest("Verify that 'Project Type Text Field' appears on the 'Create New Project Screen'");
		if(this.InputProjectType.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Type Text Field' appears on the 'Create New Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Type Text Field' doesn't appear on the 'Create New Project Screen'");			
		}
		test = report.createTest("Verify that 'Project type Text Field' inputs alphabets");	
		this.InputProjectType.sendKeys(pname);
		test.log(Status.PASS, "The user is able to enter alphabets as inputs in Project type Text Field ");
		test = report.createTest("Verify that a 'Project Description' box appears on the 'Create New Project Screen'");
		if(this.InputFolderDescription.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Project Description' box appears appears on the 'Create New Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Project Description' box doesn't appear on the 'Create New Project Screen'");			
		}
	
		test = report.createTest("Verify that the 'Project Description' inputs alphabets");
		this.InputFolderDescription.sendKeys(pname);
		test.log(Status.PASS, "The user is able to enter alphabets as inputs in 'Project Description' Text Field ");
		test = report.createTest("Create New Project Window -Verfiy the project visibility type.");
		test = report.createTest("Verify that 'Visibility Radio Button' appears on the 'Create New Project Screen'");
		if(this.PublicOption.isDisplayed()) 
		{
			test.log(Status.PASS, "The 'Visibility Radio Button' appears appears on the 'Create New Project Screen'");	
		}
		else {
			test.log(Status.FAIL, "The 'Visibility Radio Button' doesn't appear on the 'Create New Project Screen'");			
		}
		test = report.createTest("Verify that both Public and Private Radio Buttons are Clickable");
		if(this.Private.isDisplayed()) 
		{
			test.log(Status.PASS, "both Public and Private Radio Buttons are Clickable");	
		}
		else {
			test.log(Status.FAIL, "both Public and Private Radio Buttons are not Clickable");			
		}
		test = report.createTest("Verify that both Public and Private Radio Buttons cannot be clicked simultaneously.");
		this.PublicOption.click();
		test.log(Status.PASS, "both Public and Private Radio Buttons cannot be clicked simultaneously.");
		test = report.createTest("Verify that Save Button appears on the 'Create New Project Screen'");
		if(this.SaveButton.isDisplayed()) 
		{
			test.log(Status.PASS, " The Save Button appears on the 'Create New Project Screen");	
		}
		else {
			test.log(Status.FAIL, "The Save Button doesn't appear on the 'Create New Project Screen");			
		}
		test = report.createTest("Verify that the Save Button is Clickable");
		if (this.SaveButton.isEnabled()) {
			test.log(Status.PASS, " The Save Button is Clickable");
		}
		else {
			test.log(Status.FAIL, "The Save Button is not Clickable");			
		}
		test = report.createTest("Verify that the Save Button saves the Project in the project list on the Landing Screen");
		test = report.createTest("Verify that on clicking the Save Button 'Please Confirm Screen appears'");
		this.SaveButton.click();
		test.log(Status.PASS, " on clicking the Save Button 'Please Confirm Screen appears'");
		utilityMethods.waitForVisibility(this.YesButton);
		Thread.sleep(2000);
		test = report.createTest("Verify that Yes Button appears on the 'Please Confirm Screen'");
		if (this.YesButton.isDisplayed()) {
			test.log(Status.PASS, "Yes Button appears on the 'Please Confirm Screen'");
		}
		else {
			test.log(Status.FAIL, "Yes Button doesn't appear on the 'Please Confirm Screen'");			
		}
		test = report.createTest("Verify that Yes Button is clickable");
		if (this.YesButton.isEnabled()) {
			test.log(Status.PASS, " The Yes Button is Clickable");
		}
		else {
			test.log(Status.FAIL, "The Yes Button is not Clickable");			
		}
		test = report.createTest("Verify that on Clicking Yes the Project opens and navigates back to Landing Screen");
		this.YesButton.click();
		test.log(Status.PASS, " on Clicking Yes the Project opens and navigates back to Landing Screen");
		Thread.sleep(5000);

	}
	

	public void RightClickOnProject(String projectname) {

		for (WebElement el : ProjectsList) {
			if (el.getText().equals(projectname)) {
				new Actions(driver).contextClick(el).perform();

				break;
			}
		}
	}
	public void ClickOnProject(String projectname) {

		for (WebElement el : ProjectsList) {
			if (el.getText().equals(projectname)) {
				el.click();

				break;
			}
		}
	}
	public void DeleteProject(String projectname) throws InterruptedException {

		for (WebElement el : ProjectsList) {
			if (el.getText().equals(projectname)) {
				new Actions(driver).contextClick(el).perform();
				break;
			}
		}
		Thread.sleep(4000);
		this.DeleteOptionRightClickonProject.click();
		utilityMethods.waitForVisibility(this.YesButton);
		this.YesButton.click();
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(this.OkButtonDeleteProject);
		this.OkButtonDeleteProject.click();
	}
	
	public void CheckLoadedProjectandLoadAutomationProject() throws InterruptedException {

		try {
			
			if (this.LoadedProjectText.getText().equalsIgnoreCase("Training-Automation")) {

				System.out.println("The automation training  project is already loaded");

			}

			else {

				for (WebElement el : ProjectsList) {
					if (el.getText().equals("Training-Automation")) {
						new Actions(driver).doubleClick(el).perform();

						break;
					}
				}
				utilityMethods.waitForVisibility(this.YesButton);
				Thread.sleep(2000);
				this.YesButton.click();
				Thread.sleep(2000);
			}

		} catch (Exception e) {

		}
	}

	public void LoadAutomationProject(String projectname) throws InterruptedException {
		for (WebElement el : ProjectsList) {
			if (el.getText().equals(projectname)) {
				new Actions(driver).doubleClick(el).perform();

				break;
			}
		}
	
		Thread.sleep(2000);
		utilityMethods.waitForVisibility(this.YesButton);
		this.YesButton.click();
		Thread.sleep(5000);
	}

	public void GetIndexOfProject(String project) {
		List<String> AllProjects = new ArrayList<String>();

		for (int i = 0; i < ProjectsList.size(); i++) {

			AllProjects.add(ProjectsList.get(i).getText());
		}
		index = AllProjects.indexOf(project);
		System.out.println(index);
	}

	public void ExpandAllProjectItems() throws InterruptedException {

		System.out.println(ExpandProjectItemsList.size());
		for (int i = 0; i < ExpandProjectItemsList.size(); i++) {
			ExpandProjectItemsList.get(i).click();
			Thread.sleep(1000);
		}
	}

	public void ClickItemProjectDetailTree(String item) {

		for (WebElement el : ClickElementToCheckTypeList) {

			if (el.getText().equals(item)) {
				el.click();
				break;
			}
		}
	}
	
	
	public void RightClickOnItemProjectDetailTree(String item) {

		for (WebElement el : ClickElementToCheckTypeList) {

			if (el.getText().equals(item)) {
				  new Actions(driver).contextClick(el).perform();

			        break;
			    }
			}

	}
	
	
	public void DeleteAllAutoCreatedProjects(String project) {
		try {
			
			Thread.sleep(5000);
			if (this.PleaseOpenOrSelectaProjectWindow.isDisplayed() == true) {
				
				System.out.println("Element is Visible");
				this.OKButtonSelectaProjectWondow.click();
				}
			}
			catch(Exception e){	
			}

			try {

				List<String> AllProjects = new ArrayList<String>();

			 int count=0;
			 
			 for (int i = 0; i < ProjectsList.size(); i++) {
			   
				 AllProjects.add(ProjectsList.get(i).getText());
				 
				 if (ProjectsList.get(i).getText().equals(project)) {
					 	
					count++;
				 }
				 
			 }
			 
			 
			 for (int i = 0; i < count; i++)
			 {
			this.DeleteProject(project);
			}
			 }
			 catch(Exception e){
			 
			}
	
	}
	
	
	public void DragParticipantDropinCetralArea(String participant) {
		for (WebElement el : ParticipantList) {

			if (el.getText().equals(participant)) {
				Actions builder = new Actions(driver);

				Action dragAndDrop = builder.clickAndHold(el).release(this.CentralAreaAddParticipantsWindow).build();
				dragAndDrop.perform();

				break;
			}
		}

	}
	
	public void SelectProjectToshare(String pname) {
		for (WebElement el : ProjectsListToShareWithOtherProjects) {

			if (el.getText().equals(pname)) {
				Actions builder = new Actions(driver);
				el.click();
				Action dragAndDrop = builder.clickAndHold(el).release(this.PlaceWhereProjectDroppedToshare).build();
				dragAndDrop.perform();

				break;
			}
		}

	}
	
	
}
