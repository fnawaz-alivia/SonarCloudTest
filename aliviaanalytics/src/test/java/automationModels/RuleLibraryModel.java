package automationModels;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import configuration.Configuration;

public class RuleLibraryModel extends Configuration {

@FindBy(how = How.XPATH, using = "//*[(text() = 'Save As New Rule' or . = 'Save As New Rule')]")
	
public WebElement SaveAsNewRule;

@FindBy(how = How.XPATH, using = "//*[@type = 'text' and @name = 'name']")

public List<WebElement> RuleName;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() ='Save' or . = 'Save')]")

public List<WebElement> SaveButton;

@FindBy(how = How.XPATH, using = "//*[(text() = 'Create New Rule Group' or . = 'Create New Rule Group')]")

public WebElement CreateNewRuleGroup;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo') and @type = 'text' and @name = 'groupId']")

public WebElement RuleGroupId;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'button-') and (text() = 'Save' or . = 'Save')]")

public WebElement RuleGroupSaveButton;

@FindBy(how = How.XPATH, using = "//*[(text() = 'OK' or . = 'OK')]")

public WebElement OKConfigureRule;

@FindBy(how = How.XPATH, using = "//a[contains(@class, 'dataRepository-queryBuilder-tBar-resetAll-btn-73')]")

public WebElement ResetButtonQB;


@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'checkbox-') and (text() = 'Enable Rule Chaining' or . = 'Enable Rule Chaining')]")

public WebElement EnableRuleChaining;

@FindBy(how = How.XPATH, using = "//*[starts-with(@id, 'combo-') and @type = 'text' and starts-with(@name, 'combo-') and @placeholder = 'Choose Rule Group ...']")

public WebElement ChooseRuleGroup;


}
