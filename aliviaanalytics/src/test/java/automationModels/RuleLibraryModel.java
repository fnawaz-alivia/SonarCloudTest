package automationModels;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import automationUtils.utilityMethods;
import configuration.Configuration;

public class RuleLibraryModel extends Configuration {
	

	String SearchInput = RandomStringUtils.randomAlphabetic(1);
	JavascriptExecutor jse = (JavascriptExecutor) driver;

	@FindBy(how = How.XPATH, using = "//table[(text() = 'Rule Library' or . = 'Rule Library')]")

	WebElement RuleLibrary;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'singlePanelRuleLib')]//input")

	WebElement SearchRuleInput;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'singlePanelRuleLib')]//div[contains(@class,'x-form-clear-trigger')]")

	WebElement SearchRuleInputCrossButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'singlePanelRuleLib')]//a[1]")

	WebElement RefreshButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'singlePanelRuleLib')]/div[contains(@class,'x-component') and (@aria-valuetext='Loading...')]")

	WebElement RefreshButtonLoading;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'center_pane_main')]//div[contains(@class,'singlePanelRuleLib')]//a[3]")

	WebElement CreateRuleGroupButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[text()='Create New Rule Group']")

	List<WebElement> CreateRuleGroupScreen;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[contains(@class,'x-panel-body x-panel-body-default')]/div/div/div[2]//input")

	WebElement RuleGroupNameInput;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ruleLibrary')][last()]//tr[1]/td[2]/span")

	WebElement CreatedRuleGroupHeading;

	@FindBy(how = How.XPATH, using = "//table[contains(@class,'ruleLibrary')]//tr[1]/td[2]/span")

	List<WebElement> CreatedRuleGroupList;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ruleLibrary')][last()]//tr[2]/td/span")

	WebElement CreatedRuleGroupDescription;
	
	@FindBy(how = How.XPATH, using = "//table[contains(@class,'ruleLibrary')]//td[4]/span")

	WebElement CreatedRuleName;

	@FindBy(how = How.XPATH, using = "//div[contains(@data-errorqtip,'This field is required')]")

	WebElement TextFieldMandatory;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[contains(@class,'x-panel-body x-panel-body-default')]/div/div/div[3]//input[@type='text']")

	WebElement UploadReferenceInput;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-btn-disabled')]//span[text()='Select File']")

	WebElement SelectFileButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-btn-disabled')]//input[@disabled]")

	WebElement SelectFileButtonDisable;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[contains(@class,'x-panel-body x-panel-body-default')]/div/div/div[4]//textarea")

	WebElement GroupDescription;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//a[contains(@class,'btn-save') and contains(@class,'x-btn-disabled')]")

	WebElement SaveButtonDisable;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//a[contains(@class,'btn-save') and not(contains(@class,'x-btn-disabled'))]")

	WebElement SaveButtonEnable;

	@FindBy(how = How.XPATH, using = "//*[text()='OK']")

	WebElement OKButton;

	@FindBy(how = How.XPATH, using = "//*[text()='Cancel']")

	WebElement CancelButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//span[text()='Remove']")

	WebElement RemoveButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-window-default-resizable')]//div[text()='Update Group']")

	List<WebElement> UpdateRuleGroupScreen;

	@FindBy(how = How.XPATH, using = "//*[text()='Warning']")

	List<WebElement> WarningScreen;

	@FindBy(how = How.XPATH, using = "//*[text()='Yes']")

	WebElement YesButton;

	@FindBy(how = How.XPATH, using = "//*[text()='No']")

	WebElement NoButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-default-outer-border-rbl')]/div/div/div//table//tr/td[4]/span/i[contains(@class,'fa-youtube-play')]")

	WebElement ExecuteGroupPlayButton;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-default-outer-border-rbl')]/div/div/div//table//tr/td[4]/span/i[contains(@class,'fa-stop')]")

	WebElement ExecuteGroupStopButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tbar-rule')]//a[2]")

	WebElement SortButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tbar-rule')]//a[@data-qtip='Expand All']")

	WebElement ExpandAll;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'tbar-rule')]//a[@data-qtip='Collapse All']")

	WebElement CollapseAll;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-default-outer-border-rbl')]/div/div/div/div[2]/div[contains(@class,'x-panel') and not(contains(@style,'visibility: hidden'))]")

	List<WebElement> ExpandedRules;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel-default-outer-border-rbl')]/div/div/div/div[2]/div[contains(@class,'x-panel') and contains(@style,'visibility: hidden')]")

	List<WebElement> CollpasedRules;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel')]//table//td//span[@class='desValue']")

	List<WebElement> CreatedRuleList;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Results']")

	WebElement ResultsButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'main_breadcrumb')]//span[text()='Dashboard']")

	WebElement DashBoardBreadcrumb;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel')]//table//td[6]//div[@data-qtip='Configure']")

	WebElement ConfigureButton;	
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']")

	List<WebElement> ConfigureRuleScreen;	
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Rule Name']/following::input[1]")

	WebElement RuleNameInputCR;

	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Add Rule References']")

	WebElement AddRuleReferenceCR;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::a[contains(@class,'x-btn-disabled')]//span[text()='Add Rule References']")

	WebElement AddRuleReferenceDisableCR;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Rule Group']/following::div[1]/div/div[2]")

	WebElement RuleGroupDropdownCR;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Rule Group']/following::div[1]//input[@disabled]")

	WebElement RuleGroupFieldDisableCR;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Visibility']/following::div[contains(@class,'radio')]")

	List<WebElement> RadioButtonCR;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Visibility']/following::div[contains(@class,'x-form-cb-checked')]//input[@type='radio']")

	List<WebElement> SelectedRadioButtonCR;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']")

	WebElement AdvancedOptionsButton;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table")

	WebElement AdvancedOptionsInside;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[1]/td[1]/div")

	WebElement ForceRerunCheckbox_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::span[contains(@data-qtip,'previous execution')]")

	WebElement ForceRerunQM_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[1]/td[2]/div")

	WebElement MaintainAllCheckbox_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::span[contains(@data-qtip,'Keeps data')]")

	WebElement MaintainAllQM_AO;	
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[2]/td[1]/div")

	WebElement SaveResultCheckbox_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::span[contains(@data-qtip,'append execution')]")

	WebElement SaveResultQM_AO;	
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr/td//div[contains(@class,'x-form-cb-checked')]")

	List<WebElement> SelectedCheckbox_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[3]/td[1]/div[contains(@class,'disabled')]")

	WebElement CTDataSourceDisable_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[3]/td[1]/div[not(contains(@class,'disabled'))]")

	WebElement CTDataSourceEnable_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::span[contains(@data-qtip,'choose data source')]")

	WebElement CTDataSourceQM_AO;

	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[3]/td[1]/div//div[contains(@class,'x-form-text-wrap')]/input")

	WebElement CTDataSourceTextField_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[3]/td[1]/div//div[contains(@class,'x-form-arrow')]")

	WebElement CTDataSourceDropdownButton_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[3]/td[1]/div//div[contains(@class,'x-form-arrow')]")

	WebElement CTDataSourceDropdownList_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[2]/td[2]/div")

	WebElement ExecutionOrder_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[2]/td[2]//span[@data-qtip]")

	WebElement ExecutionOrderQM_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//tr[2]/td[2]/div//input")

	WebElement ExecutionOrderTextField_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//div[contains(@class,'x-form-spinner-up')]")

	WebElement ExecutionOrderIncremenetButton_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::span[text()='Advanced Options']/following::table//div[contains(@class,'x-form-spinner-down')]")

	WebElement ExecutionOrderDecremenetButton_AO;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::fieldset/following::div[contains(@class,'x-form-type-checkbox')]")

	WebElement SaveResultCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::fieldset/following::div[contains(@class,'x-item-disabled')]")

	WebElement DisableSaveResultCheckbox;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::fieldset/following::div[contains(@class,'x-item-disabled')]//span[@data-qtip]")

	WebElement DisableSaveResultQM;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Configure Rule']/following::textarea")

	WebElement RuleDescriptionTextArea;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Rule']")

	WebElement EditRuleButton;	
	
	@FindBy(how = How.XPATH, using = "//*[text()='Configure Rule']/following::span[text()='Save']")

	WebElement SaveButtonCR;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel')]//table//td[7]//div[@data-qtip='Execute']")

	WebElement ExecuteButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'x-panel')]//table//td[7]//div[@data-qtip='Stop Execution']")

	WebElement StopExecuteButton;
	
	

	public void LandingOnRuleLibraryPage() {
		ProjectModel PM = PageFactory.initElements(driver, automationModels.ProjectModel.class);
		DataSourceModel DS = PageFactory.initElements(driver, automationModels.DataSourceModel.class);
		PM.GetStarted.click();
		DS.DataRepository.click();
		utilityMethods.visible(this.RuleLibrary,
				"Side Pane: Verify that Rule Library Button is present in Data Repository dropdown");
		utilityMethods.clickable(this.RuleLibrary, "Side Pane: Verify that Rule Library Button is clickable");
		utilityMethods.clicked_elementVisible(this.RuleLibrary, 100, this.SearchRuleInput,
				"Side Pane: Verify that clicking on Rule Library Button navigates to 'Rule Library' screen");
		this.SearchRuleInput.click();
	}

	public void verifySearchRuleField_RLScreen() {
		utilityMethods.visible(this.SearchRuleInput,
				"Verify that Search Rule Field is present in 'Rule Library' screen");
		utilityMethods.clickable(this.SearchRuleInput,
				"Verify that Search Rule Field is clickable in 'Rule Library' screen");
		utilityMethods.senKeys_Input(this.SearchRuleInput, 500, "includeChar",
				"Verify that Search Rule Field inputs alphabets,numbers and special characters in 'Rule Library' screen");
		utilityMethods.validateSearchList(this.SearchRuleInput,this.CreatedRuleList, this.SearchInput,
				"Verify that Search Rule field show the relevant result when type anything on it in 'Rule Library' screen");
	}

	public void verifySearchCrossButton_RLScreen() {
		utilityMethods.visible(this.SearchRuleInputCrossButton,
				"Verify that Cross Button is present in Serach Field in 'Rule Library' screen");
		utilityMethods.verifyCrossButton(this.SearchRuleInput, 100, this.SearchRuleInputCrossButton,
				"Verify that Cross Button clears the text in the 'Search Rule Field' in 'Rule Library' screen");
		utilityMethods.validateSearchPlaceholder(this.SearchRuleInput, "Search Rule ...", 
				"Verify that Text Field present 'Search Rule' text by default in Search Rule Field in 'Rule Library' screen");
	}

	public void verifyReloadButton_RLScreen() {
		
		utilityMethods.visible(this.RefreshButton, 
				"Verify that Refresh Button is present in 'Rule Library' screen");
		
		utilityMethods.clickable(this.RefreshButton,
				"Verify that Refresh Button is clickable in 'Rule Library' screen");
		
		utilityMethods.clicked_elementVisible(this.RefreshButton, 0, this.RefreshButtonLoading,
				"Verify that List Refresh when click on Refresh Button in 'Rule Library' screen");
	}

	public void verifyCreateRuleGroupButton_RLScreen() {
		
		utilityMethods.visible(this.CreateRuleGroupButton,
				"Verify that Create New Rule Group Button is present in 'Rule Library' screen");
		
		utilityMethods.clickable(this.CreateRuleGroupButton,
				"Verify that Create New Rule Group Button is clickable in 'Rule Library' screen");
		
		utilityMethods.list_Visible(this.CreateRuleGroupButton, 100, this.CreateRuleGroupScreen,
				"Verify that Create New Rule Group screen opens when click on Create New Rule Group Button in 'Rule Library' screen");
	}
	public void verifyRuleGroupInput_RLScreen() {
		
		utilityMethods.visible(this.RuleGroupNameInput,
				"Verify that Create New Rule Group Text Field is present in 'Create New Rule Group' screen");
		
		utilityMethods.clickable(this.RuleGroupNameInput,
				"Verify that Create New Rule Group Text Field is clickable in 'Create New Rule Group' screen");
		
		utilityMethods.senKeys_Input(this.RuleGroupNameInput, 100, "includeChar",
				"Verify that Create New Rule Group Text Field input alphabets, numeric and special characters in 'Create New Rule Group' screen");
		
		utilityMethods.verifyfieldmandatory(this.RuleGroupNameInput, 100, this.TextFieldMandatory,
				"Verify that Create New Rule Group Text Field mandatory is present in 'Create New Rule Group' screen");
		
		utilityMethods.visible(this.UploadReferenceInput,
				"Verify that Upload Reference File field is present in 'Create New Rule Group' screen");
		
		utilityMethods.disable(this.UploadReferenceInput,
				"Verify that Upload Reference File field is disable in 'Create New Rule Group' screen");
		
		utilityMethods.visible(this.SelectFileButton,
				"Verify that Select Files Button is present in 'Create New Rule Group' screen");
		
		utilityMethods.disable(this.SelectFileButtonDisable,
				"Verify that Select Files Buttton is disable in 'Create New Rule Group' screen");
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, " BeforeSpace", this.SaveButtonEnable,  this.CreatedRuleGroupHeading,
				"Verify that Rule Group Text Field Crop Spaces Before the text in 'Create New Rule Group' screen");
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		this.RuleGroupNameInput.sendKeys("New");
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, "After Space ", this.SaveButtonEnable,this.CreatedRuleGroupHeading,
				"Verify that Rule Group Text Field Crop Spaces After the text in 'Create New Rule Group' screen");
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		this.RuleGroupNameInput.sendKeys("New");
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, "  ", this.SaveButtonEnable, this.CreatedRuleGroupHeading, 
				"Verify that Rule Group Text field can't be empty 'Create New Rule Group' screen");
	}


	public void verifyGroupDescription_RLScreen() {
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		this.RuleGroupNameInput.sendKeys("New");
		
		utilityMethods.visible(this.GroupDescription,
				"Verify that Group Description text area is present in 'Create New Rule Group' screen");
		
		utilityMethods.clickable(this.GroupDescription,
				"Verify that Group Description text area is clickable in 'Create New Rule Group' screen");
		
		utilityMethods.senKeys_Input(this.GroupDescription, 100, "includeChar",
				"Verify that Group description text area input alphabets, numeric and special character");
	
		utilityMethods.cropSpaces_Input(this.GroupDescription, " CropSpaceBT", this.SaveButtonEnable, this.CreatedRuleGroupDescription, 
				"Verify that Rule Group Text Area Crop Spaces Before the text in 'Create New Rule Group' screen");
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		this.RuleGroupNameInput.sendKeys("New");
		
		utilityMethods.cropSpaces_Input(this.GroupDescription, "CropSpaceAT ", this.SaveButtonEnable,this.CreatedRuleGroupDescription,
				"Verify that Rule Group Text Area Crop Spaces Before the text in 'Create New Rule Group' screen");
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		this.RuleGroupNameInput.sendKeys("New");
		
		utilityMethods.cropSpaces_Input(this.GroupDescription, "  ", this.SaveButtonEnable, this.CreatedRuleGroupDescription,
				"Verify that Rule Group Text Area can't be empty 'Create New Rule Group' screen");
	}

	public void verifySaveButton_RLScreen() {
		
		this.CreateRuleGroupButton.click();
		utilityMethods.time(100);
		
		utilityMethods.visible(this.SaveButtonDisable,
				"Verfiy that Save Button is disable by default in 'Create New Rule Group' screen");
		
		this.RuleGroupNameInput.sendKeys("New");
		utilityMethods.time(100);
		
		utilityMethods.visible(this.SaveButtonEnable,
				"Verfiy that Save Button is enable when enter some text in 'Create New Rule Group' screen");
	}
	public void verifyCancelButton_RLScreen() {
		utilityMethods.visible(this.CancelButton,
				"Verify that Cancel Button is visible in 'Create New Rule Group' screen");
		utilityMethods.clickable(this.CancelButton,
				"Verify that Cancel Button is clickable in 'Create New Rule Group' screen");
		utilityMethods.list_NotVisible(this.CancelButton, 500, this.CreateRuleGroupScreen,
				"Verify that Cancel Button close the 'Create New Rule Group' screen");
	}
	
	// Update Cases

	public void verifyCreatedRuleGroup_RLScreen() {
		utilityMethods.visible(this.CreatedRuleGroupHeading,
				"Verify that Rule Group Button is visible in 'Rule Library' screen");
		utilityMethods.clickable(this.CreatedRuleGroupHeading,
				"Verify that Rule Group Button is visible in 'Rule Library' screen");
		utilityMethods.list_Visible(this.CreatedRuleGroupHeading, 500, this.UpdateRuleGroupScreen,
				"Verify that Rule Group Button is visible in 'Rule Library' screen");
	}

	

	public void verifyRuleGroupTextField_UGScreen() {
		utilityMethods.visible(this.RuleGroupNameInput,
				"Verify that Rule Group Text Field is present in 'Update Rule Group' screen");
		utilityMethods.clickable(this.RuleGroupNameInput,
				"Verify that Rule Group Text Field is clickable in 'Update Rule Group' screen");
		utilityMethods.senKeys_Input(this.RuleGroupNameInput, 100, "includeChar",
				"Verify that Rule Group Text Field input alphabets, numeric and special characters in 'Update Rule Group' screen");
		utilityMethods.verifyfieldmandatory(this.RuleGroupNameInput, 100, this.TextFieldMandatory,
				"Verify that Rule Group Text Field mandatory is present in 'Update Rule Group' screen");
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, " CropSpaceBT", this.SaveButtonEnable, this.CreatedRuleGroupHeading, 
				"Verify that Rule Group Text Field Crop Spaces Before the text in 'Update Rule Group' screen");
		
		utilityMethods.time(100);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, "CropSpaceAT ", this.SaveButtonEnable, this.CreatedRuleGroupHeading,
				"Verify that Rule Group Text Field Crop Spaces After the text in 'Update Rule Group' screen");
		
		utilityMethods.time(100);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.RuleGroupNameInput, "  ", this.SaveButtonDisable,this.CreatedRuleGroupHeading,
				"Verify that Rule Group Text field can't be empty 'Update Rule Group' screen");
	}

	public void verifyUploadReferenceFile_UGScreen() {
		
		utilityMethods.time(100);
		jse.executeScript("arguments[0].innerText='New';", this.CreatedRuleGroupHeading);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.visible(this.UploadReferenceInput,
				"Verify that Reference File field is present in 'Update Rule Group' screen");
		utilityMethods.disable(this.UploadReferenceInput,
				"Verify that Reference File field is disable in 'Update Rule Group' screen");
		utilityMethods.visible(this.SelectFileButton,
				"Verify that Select Files Button is present in 'Update Rule Group' screen");
		utilityMethods.disable(this.SelectFileButtonDisable,
				"Verify that Select Files Buttton is disable in 'Update Rule Group' screen");
		
	}

	public void verifyGroupDescription_UGScreen() {
		
		utilityMethods.visible(this.GroupDescription,
				"Verify that Group Description text area is present in 'Update Rule Group' screen");
		utilityMethods.clickable(this.GroupDescription,
				"Verify that Group Description text area is clickable in 'Update Rule Group' screen");
		utilityMethods.senKeys_Input(this.GroupDescription, 100, "includeChar",
				"Verify that Group description text area input alphabets, numeric and special character in 'Update Rule Group' screen");
		this.RuleGroupNameInput.sendKeys("Updated");
		
		utilityMethods.cropSpaces_Input(this.GroupDescription, " CropSpaceBT", this.SaveButtonEnable, this.CreatedRuleGroupDescription,
				"Verify that Rule Group Text Area Crop Spaces Before the text in 'Update Rule Group' screen");
		
		utilityMethods.time(100);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.GroupDescription, "CropSpaceAT ", this.SaveButtonEnable, this.CreatedRuleGroupDescription,
				"Verify that Rule Group Text Area Crop Spaces Before the text in 'Update Rule Group' screen");
		
		utilityMethods.time(100);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.GroupDescription, "  ", this.SaveButtonEnable, this.CreatedRuleGroupDescription, 
				"Verify that Rule Group Text Area cant be empty in 'Update Rule Group' screen");
	}

	public void verifyUpdateButton_UGScreen() {
		utilityMethods.testCase_Duplicate(this.CreatedRuleGroupHeading, 100, "click", 
				"");
		utilityMethods.visible(this.SaveButtonEnable,
				"Verfiy that Update Button is enable when enter some text in 'Update Rule Group' screen");
		utilityMethods.testCase_Duplicate(this.RuleGroupNameInput, 100, "sendKeys", 
				"");
		utilityMethods.visible(this.SaveButtonDisable,
				"Verfiy that Update Button is disable by default in 'Update Rule Group' screen");
	}

	public void verifyCancelButton_UGScreen() {
		utilityMethods.visible(this.CancelButton, 
				"Verify that Cancel Button is visible in 'Update Rule Group' screen");
		utilityMethods.clickable(this.CancelButton,
				"Verify that Cancel Button is clickable in 'Update Rule Group' screen");
		utilityMethods.list_NotVisible(this.CancelButton, 500, this.UpdateRuleGroupScreen,
				"Verify that Cancel Button close the 'Update Rule Group' screen");
	}

	public void verifyRemoveButton_UGScreen() {
		
		utilityMethods.time(100);
		this.CreatedRuleGroupHeading.click();
		utilityMethods.time(100);
		
		utilityMethods.visible(this.RemoveButton, 
				"Verify that Remove Button is visible in 'Update Rule Group' screen");
		utilityMethods.clickable(this.RemoveButton,
				"Verify that Remove Button is clickable in 'Update Rule Group' screen");
		utilityMethods.list_Visible(this.RemoveButton, 500, this.WarningScreen,
				"Verify that Warning Screen is visible in 'Update Rule Group' screen");
	}

	public void verifyNoButton_UGScreen() {
		utilityMethods.visible(this.NoButton, 
				"Verify that No Button is visible in 'Update Rule Group' screen");
		utilityMethods.clickable(this.NoButton,
				"Verify that No Button is clickable in 'Update Rule Group' screen");
		utilityMethods.list_Visible(this.NoButton, 500, this.WarningScreen,
				"Verify that No Button close the 'warning' screen");
	}

	public void verifyYesButton_UGScreen() {
		
		utilityMethods.time(100);
		this.RemoveButton.click();
		utilityMethods.time(100);
		
		utilityMethods.visible(this.YesButton, "Verify that Yes Button is visible in 'Update Rule Group' screen");
		utilityMethods.clickable(this.YesButton, 
				"Verify that Yes Button is clickable in 'Update Rule Group' screen");
		int beforeSize = utilityMethods.itemsSize(this.CreatedRuleGroupList);
		utilityMethods.list_NotVisible(this.YesButton, 500, this.UpdateRuleGroupScreen,
				"Verify that Yes Button close the 'Update Rule Group' screen");
		int afterSize = utilityMethods.itemsSize(this.CreatedRuleGroupList);
		utilityMethods.size_Match(beforeSize, afterSize,
				"Verofy that Yes Button removes the Rule Group from the 'Rule Library' Screen");

	}

	public void removeCreatedRuleGroup() {
		for(WebElement el:this.CreatedRuleGroupList) {
			jse.executeScript("arguments[0].innerText='New';", el);
		}
		int size = this.CreatedRuleGroupList.size();
		for(int i=size-1;i>=0;i--) {
			utilityMethods.time(500);
			this.CreatedRuleGroupHeading.click();
			utilityMethods.time(500);
			this.RemoveButton.click();
			utilityMethods.time(500);
			this.YesButton.click();
		}
		
		
	}

	public void verifyExecuteGroupButton_RLScreen() {
		utilityMethods.visible(this.ExecuteGroupPlayButton,
				"Verify that Execute Group All Button is visible in 'Rule Library' screen");
		utilityMethods.clickable(this.ExecuteGroupPlayButton,
				"Verify that Execute Group All Button is clickable in 'Rule Library' screen");
		utilityMethods.clicked_elementVisible(this.ExecuteGroupPlayButton, 10, this.ExecuteGroupStopButton,
				"Verify that Execute Group Play Button converts into Execute Group Stop Button when click on upon it in 'Rule Library Screen");
	}

	public void verifySortButton_RLScreen() {
		utilityMethods.visible(this.SortButton,
				"Verify that Sort Button is visible in 'Rule Library Screen");
		utilityMethods.clickable(this.SortButton,
				"Verify that Sort Button is clickable in 'Rule Library Screen");
		utilityMethods.clicked_elementVisible(this.SortButton,100,this.ExpandAll,
				"Verify that Sort Button is visible in 'Rule Library Screen");
	}

	public void verifyExpandAllButton_RLScreen() {
		utilityMethods.visible(this.ExpandAll,
				"Verify that Expand All Button is visible in 'Rule Library Screen");
		utilityMethods.clickable(this.ExpandAll,
				"Verify that Expand All Button is clickable in 'Rule Library Screen");
		utilityMethods.list_NotVisible(this.ExpandAll,100,this.CollpasedRules,
				"Verify that Expand All Button is expanding the rules of Rule Group in 'Rule Library Screen");
		utilityMethods.visible(this.CollapseAll,
				"Verify that Collapse All Button is visible when click on Expand All Button in 'Rule Library Screen");
	}
	public void verifyCollapseAllButton_RLScreen() {
		utilityMethods.visible(this.CollapseAll,
				"Verify that Collapse All Button is visible in 'Rule Library Screen");
		utilityMethods.clickable(this.CollapseAll,
				"Verify that Collapse All Button is clickable in 'Rule Library Screen");
		utilityMethods.list_NotVisible(this.CollapseAll,100,this.ExpandedRules,
				"Verify that Collapse All Button is collapsing the rules of Rule Group in 'Rule Library Screen");
		utilityMethods.visible(this.ExpandAll,
				"Verify that Expand All Button is visible when click on Collapse All Button in 'Rule Library Screen");
	}

	public void verifyResultButton_RLScreen() {
		this.ExpandAll.click();
		utilityMethods.time(500);
		utilityMethods.visible(this.ResultsButton,
				"Verify that Results Button is visible in 'Rule Library' screen");
		utilityMethods.clickable(this.ResultsButton,
				"Verify that Results Button is clickable in 'Rule Library' creen");
		utilityMethods.clicked_elementVisible(this.ResultsButton, 500, this.DashBoardBreadcrumb,
				"Verify that DashBoard screen opens when click on Results Button in 'Rule Library' screen");
		
	}
	public void verifyConfigureRuleButton_RLScreen() {
		utilityMethods.visible(this.ConfigureButton,
				"Verify that Results Button is visible in 'Rule Library Screen");
		utilityMethods.clickable(this.ConfigureButton,
				"Verify that Results Button is clickable in 'Rule Library Screen");
		utilityMethods.list_Visible(this.ConfigureButton, 100, this.ConfigureRuleScreen, 
				"Verify that Configure Rule Screen opens when click on configure Button in 'Rule Library' screen");
		
	}
	public void verifyRuleNameInput_CRScreen() {
		utilityMethods.visible(this.RuleNameInputCR,
				"Verify that Results Button is visible in 'Rule Library Screen");
		
		utilityMethods.clickable(this.RuleNameInputCR,
				"Verify that Results Button is clickable in 'Rule Library Screen");
		
		utilityMethods.senKeys_Input(this.RuleNameInputCR,100,"includeChar",
				"Verify that Results Button is clickable in 'Rule Library Screen");
		
		utilityMethods.verifyfieldmandatory(this.RuleNameInputCR, 100, this.TextFieldMandatory, 
				"Verify that Rule Name Text Field mandatory check is present when field is empty in 'Rule Library' screen");
		
		utilityMethods.cropSpaces_Input(this.RuleNameInputCR, " CropSpaceBT", this.SaveButtonCR, this.CreatedRuleName, 
				"Verify that Rule Name Text crop Spaces Before the text when click on save button in 'Rule Library' screen");
		
		utilityMethods.time(100);
		this.OKButton.click();
		utilityMethods.time(100);
		this.ConfigureButton.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.RuleNameInputCR, "CropSpaceBT ", this.SaveButtonCR, this.CreatedRuleName, 
				"Verify that Rule Name Text crop Spaces Before the text when click on save button in 'Rule Library' screen");
		
		utilityMethods.time(100);
		this.OKButton.click();
		utilityMethods.time(100);
		this.ConfigureButton.click();
		utilityMethods.time(100);
		
		utilityMethods.cropSpaces_Input(this.RuleNameInputCR, "  ", this.SaveButtonCR, this.CreatedRuleName, 
				"Verify that Rule Name Text Field cannot be save with empty title when click on save button in 'Rule Library' screen");
		
		utilityMethods.time(100);
		this.OKButton.click();
		
	}
	public void verifyAddRuleReferenceButtonVisible_CRScreen() {
		
		utilityMethods.time(100);
		this.ConfigureButton.click();
		utilityMethods.time(100);
		
		utilityMethods.visible(this.AddRuleReferenceCR, 
				"Verify that Add Rule Refernce Button is visible in 'Rule Library' screen");
		utilityMethods.visible(this.AddRuleReferenceDisableCR, 
				"Verify that Add Rule Refernce Button is disable in 'Rule Library' screen");
	}
	public void verifyRuleGroup_CRScreen() {
		utilityMethods.visible(this.RuleGroupDropdownCR, 
				"Verify that Rule Group Dropdown is visible in 'Rule Library' screen");
		utilityMethods.visible(this.RuleGroupFieldDisableCR, 
				"Verify that Rule Group Dropdown Field is disable in 'Rule Library' screen");
		utilityMethods.text_NotMatch(this.RuleGroupFieldDisableCR,"", 
				"Verify that Selected Rule Group is present in Rule Group Field and it's not empty");
	}
	public void verifyRadioButton_CRScreen() {
		utilityMethods.verifyRadioButtonPrivatePublicVisible(this.RadioButtonCR);
		utilityMethods.verifyRadioButtonPrivatePublicClickable(this.RadioButtonCR);
		utilityMethods.verifyRadioButtonSelection(this.RadioButtonCR, this.SelectedRadioButtonCR);
	}
	
	public void verifyAdvancedOptions_CRScreen() {
		
		DataCleansingModel DC = PageFactory.initElements(driver, automationModels.DataCleansingModel.class);
		
		utilityMethods.visible(this.AdvancedOptionsButton, 
				"Verify that advanced options button is present in 'Rule Library' screen");
		utilityMethods.clickable(this.AdvancedOptionsButton, 
				"Verify that advanced options button is clickable in 'Rule Library' screen");
		utilityMethods.clicked_elementVisible(this.AdvancedOptionsButton, 100, this.AdvancedOptionsInside, 
				
				"Verify that advanced options appears when click on advanced options button in 'Rule Library' screen");
		utilityMethods.visible(this.ForceRerunCheckbox_AO, 
				"Verify that Force re-run... check box is present on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.clickable(this.ForceRerunCheckbox_AO, 
				"Verify that Force re-run... check box is clickable on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.ForceRerunQM_AO,
				"If a Rule is chained within other Rule, the previous execution results will be used as input for parent Rule. Check it to always execute and feed newest output in parent Rule");
		utilityMethods.list_Visible(this.ForceRerunCheckbox_AO,100,this.SelectedCheckbox_AO,
				"verify that Force re-run... checkbox is checked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		utilityMethods.list_NotVisible(this.ForceRerunCheckbox_AO, 100, this.SelectedCheckbox_AO,
				"verify that Force re-run... checkbox is unchecked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		
		utilityMethods.visible(this.MaintainAllCheckbox_AO, 
				"Verify that Maintain All Execution... check box is present on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.clickable(this.MaintainAllCheckbox_AO, 
				"Verify that Maintain All Execution... check box is clickable on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.MaintainAllQM_AO,
				"Keeps data for every single run, default is overwrite previous one");
		utilityMethods.list_Visible(this.MaintainAllCheckbox_AO,100,this.SelectedCheckbox_AO,
				"verify that Maintain All Execution... checkbox is checked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		utilityMethods.list_NotVisible(this.MaintainAllCheckbox_AO, 100, this.SelectedCheckbox_AO,
				"verify that Maintain All Execution... checkbox is unchecked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		
		utilityMethods.visible(this.SaveResultCheckbox_AO, 
				"Verify that Save Result... check box is present on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.clickable(this.SaveResultCheckbox_AO, 
				"Verify that Save Result... check box is clickable on the 'Configure Rule' pop-up in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.SaveResultQM_AO,
				"It allows you to append execution results into selected Data Source. Please make sure that slected data source has same field names, types and order");
		utilityMethods.list_Visible(this.SaveResultCheckbox_AO,100,this.SelectedCheckbox_AO,
				"verify that Save Result... checkbox is checked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		utilityMethods.list_NotVisible(this.SaveResultCheckbox_AO, 100, this.SelectedCheckbox_AO,
				"verify that Save Result... checkbox is unchecked when click on it on the 'Configure Rule' pop-up in 'Rule Library' screen");
		
		utilityMethods.visible(this.CTDataSourceDisable_AO, 
				"Verify that Choose or Type DS field is disabled by default on the 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.clicked_elementVisible(this.SaveResultCheckbox_AO, 100, this.CTDataSourceEnable_AO, 
				"Verify that Choose or Type DS field is enabled when click on Save Result.. checkbox on the 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.CTDataSourceQM_AO,
				"You can either choose data source from the list or type your own data source name. New data source will be created automatically if you typed-in data source name");
		utilityMethods.clicked_elementVisible(this.CTDataSourceDropdownButton_AO, 100, DC.SelectDataSourceDropdown, 
				"Verify that Dropdown is appearing when click on dropdown button on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.clicked_dropdownInput(DC.SelectDataSourceMedical,500,this.CTDataSourceTextField_AO,"attribute",
				"Verify that Data Source can be select from the dropdown on 'Confogure Rule' popup in 'Rule Library' screen");
		utilityMethods.verifyInput(this.CTDataSourceTextField_AO, "Automation1 - Dental01", 
				"Verify that Data Source can be select by typing in input field on 'Confogure Rule' popup in 'Rule Library' screen");
		
		utilityMethods.visible(this.ExecutionOrder_AO, 
				"Verify that Execution Order field is present on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.clickable(this.ExecutionOrderTextField_AO, 
				"Verify that Execution Order field is clickable on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.ExecutionOrderQM_AO, 
				"Lower the number means higher the Order/Priority to execute this Rule first in the Rule Group.");
		utilityMethods.verifyIncrementButton(this.ExecutionOrderTextField_AO, 
				this.ExecutionOrderIncremenetButton_AO);
		utilityMethods.verifyDecrementButton(this.ExecutionOrderTextField_AO,
				this.ExecutionOrderDecremenetButton_AO);
		utilityMethods.verifyInput(this.ExecutionOrderTextField_AO, "1", 
				"Verify that Execution Order Input field is typeable on 'Confogure Rule' popup in 'Rule Library' screen");
		utilityMethods.text_Match(this.ExecutionOrderTextField_AO,"1", 
				"Verify that Execution Order field has 1 value by default on 'Configure Rule' popup in 'Rule Library' screen.");
		
	}
	public void verifySaveResult_CRScreen() {
		
		utilityMethods.visible(this.SaveResultCheckbox, 
				"Verify that Save Result in Memory Table checkbox is present on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.visible(this.DisableSaveResultCheckbox, 
				"Verify that Save Result in Memory Table checkbox is disbale by default on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.verifytooltip(this.DisableSaveResultQM, 
				"If DB will support In-Memory tables then this option can be enabled but you should consider overall system memory before enabling this option.");
		
	}
	public void verifyRuleGroupTextArea_CRScreen() {
		
		utilityMethods.visible(this.RuleDescriptionTextArea, 
				"Verify that Rule Description text area is present on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.clickable(this.RuleDescriptionTextArea, 
				"Verify that Rule Description text area is clickable on 'Configure Rule in 'Advanced Options' screen.");
		utilityMethods.senKeys_Input(this.RuleDescriptionTextArea, 100, "includeChar", 
				"Verify that Rule Description Text Field lets users input alphabets, numbers and special characters on 'Configure Rule' popup in 'Rule Library' screen.");
		utilityMethods.cropSpaces_TextArea(this.RuleDescriptionTextArea,this.SaveButtonCR,this.ConfigureButton,this.RuleDescriptionTextArea,
				" CropSpaceBT");
		utilityMethods.cropSpaces_TextArea(this.RuleDescriptionTextArea,this.SaveButtonCR,this.ConfigureButton,this.RuleDescriptionTextArea,
				"CropSpaceAT ");
		utilityMethods.cropSpaces_TextArea(this.RuleDescriptionTextArea,this.SaveButtonCR,this.ConfigureButton,this.RuleDescriptionTextArea,
				"  ");
		
	}
	public void verifyEditRuleButton_CRScreen() {
		
		QueryBuilderModel QB = PageFactory.initElements(driver, automationModels.QueryBuilderModel.class);
		
		utilityMethods.visible(this.EditRuleButton, 
				"Verify that Edit Rule button is present on 'Configure Rule' in 'Rule Library' screen");
		utilityMethods.clickable(this.EditRuleButton, 
				"Verify that Edit Rule button is clickable on 'Configure Rule' in 'Rule Library' screen");
		utilityMethods.clicked_elementVisible(this.EditRuleButton, 1000, QB.QueryBuilderBreadCrumb, 
				"Verify that user navigates to the 'Query Builder' screen when click on Edit Rule Button on 'Configure Rule' popup in 'Rule Library' screen");
	}
	public void verifyCancelButton_CRScreen() {
		utilityMethods.time(500);
		this.ConfigureButton.click();
		utilityMethods.time(500);
		utilityMethods.visible(this.CancelButton, 
				"Verify that Cancel Button is present on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.clickable(this.CancelButton, 
				"Verify that Cancel Button is clickable on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.list_NotVisible(this.CancelButton, 100, this.ConfigureRuleScreen, 
				"Verify that 'Configure Rule' screen close when click on Cancel button in on 'Configure Rule' popup in 'Rule Library' screen");
	}
	public void verifySaveButton_CRScreen() {
		utilityMethods.time(500);
		this.ConfigureButton.click();
		utilityMethods.time(500);
		this.RuleNameInputCR.clear();
		utilityMethods.time(500);
		utilityMethods.visible(this.SaveButtonDisable,
				"Verfiy that Save Button is disable by default on 'Configure Rule' popup in 'Rule Library' screen");
		this.RuleNameInputCR.sendKeys("Configure Rule");
		utilityMethods.time(500);
		utilityMethods.visible(this.SaveButtonEnable,
				"Verfiy that Save Button is enable when enter some text on 'Configure Rule' popup in 'Rule Library' screen");
		
	}
	public void RemoveButton_CRScreen() {
		
		utilityMethods.visible(this.RemoveButton,
				"Verify that Remove Button is present on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.clickable(this.RemoveButton,
				"Verify that Remove Button is clickable on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.list_Visible(this.RemoveButton, 500, this.WarningScreen, 
				"Verify that Warning screen appear when click on Remove Button on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.visible(this.NoButton,
				"Verify that No Button is present on 'Warning' popup in 'Rule Library' screen");
		utilityMethods.clickable(this.NoButton,
				"Verify that No Button is clickable on 'Warning' popup in 'Rule Library' screen");
		utilityMethods.list_NotVisible(this.NoButton, 500, this.WarningScreen, 
				"Verify that warning screen close when click on No button on 'Configure Rule' popup in 'Rule Library' screen");
		utilityMethods.time(100);
		this.RemoveButton.click();
		utilityMethods.time(200);
		utilityMethods.visible(this.YesButton,
				"Verify that Yes Button is present on 'Warning' popup in 'Rule Library' screen");
		utilityMethods.clickable(this.NoButton,
				"Verify that Yes Button is clickable on 'Warning' popup in 'Rule Library' screen");
		int size1 = this.CreatedRuleList.size(); 
		utilityMethods.list_NotVisible(this.YesButton, 500, this.WarningScreen, 
				"Verify that Warning screen close when click on Yes button on 'Configure Rule' popup in 'Rule Library' screen");
		this.OKButton.click();
		utilityMethods.time(200);
		int size2 = this.CreatedRuleList.size();
		utilityMethods.size_Match(size1,size2,
				"Verify that Rule Group remove when click on Yes button on 'Configure Rule' popup in 'Rule Library' screen");
		
	}
	public void verifyExecuteRuleButton() {
		utilityMethods.visible(this.ExecuteButton,
				"Verify that Execute Button is present in 'Rule Library' screen");
		utilityMethods.clickable(this.ExecuteButton,
				"Verify that Execute Button is clickable in 'Rule Library' screen");
		utilityMethods.clicked_elementVisible(this.ExecuteButton, 0, this.StopExecuteButton, 
				"Verify that Execute Button execute the rule in 'Rule Library' screen");
		utilityMethods.visible(this.StopExecuteButton, 
				"Verify that Stop Execution Button is present in 'Rule Library' screen");
		utilityMethods.clickable(this.StopExecuteButton, 
				"Verify that Stop Execution Button is clickable in 'Rule Library' screen");
		utilityMethods.clicked_elementVisible(this.StopExecuteButton, 0, this.ExecuteButton, 
				"Verify that Stop Execute Button Stop the execution of rule and execute button visible in 'Rule Library' screen");
		
	}



}
