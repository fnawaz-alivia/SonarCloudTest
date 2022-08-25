package automationUtils;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import configuration.Configuration;

public class utilityMethods extends Configuration {
	public static ExtentTest test;

	public static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public static void SetTextwithActionClass(WebElement element, String text) {
		Actions action = new Actions(driver);
		action.sendKeys(element, text).perform();
	}

	public static void waitForVisibility(WebElement element) throws Error {
		new WebDriverWait(driver, 120).until(ExpectedConditions.visibilityOf(element));
	}

	public static void WaitforElementNotVisible(WebElement element) throws Error {
		new WebDriverWait(driver, 120).until(ExpectedConditions.invisibilityOf(element));
	}

	public static void time(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String randomString(int size) {
		return RandomStringUtils.randomAlphabetic(size);
	}
	public static void moveToElement(WebElement element) throws Error {
		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.moveToElement(element).build();
		dragAndDrop.perform();
	}

	public static String Columns(List<WebElement> elements) {
		ArrayList<String> list = new ArrayList<>();
		for (WebElement ele : elements) {
			String[] getListText = ele.getText().split(" \\(");
			list.add(getListText[0]);
		}
		StringBuilder strbul = new StringBuilder();
		for (String str : list) {
			strbul.append(str);
			strbul.append(",");
		}
		String str = strbul.toString().replace(",+,", " + ");
		return str;
	}


	public static void visible(WebElement element, String testTitle) {
		test = report.createTest(testTitle);
		if (element.isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}

	public static void clickable(WebElement element, String testTitle) {
		test = report.createTest(testTitle);
		if (element.isEnabled()) {
			test.log(Status.PASS, "The element is clickable");
		} else {
			test.log(Status.FAIL, "The element is not clickable");
		}
	}

	public static void disable(WebElement element, String testTitle) {
		test = report.createTest(testTitle);
		if (!element.isEnabled()) {
			test.log(Status.PASS, "The element is disable");
		} else {
			test.log(Status.FAIL, "The element is not disable");
		}
	}
	public static void clearField(WebElement el) {
		utilityMethods.time(1000);
		el.clear();
		utilityMethods.time(1000);
	}
	public static void click(WebElement el) {
		utilityMethods.time(1000);
		el.click();
		utilityMethods.time(1000);
	}

	public static void clicked_elementVisible(WebElement element, int time, WebElement element1, String testTitle) {

		test = report.createTest(testTitle);
		element.click();
		time(time);
		if (element1.isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}

	public static void testCase_Duplicate(WebElement element, int time, String type, String sendData) {
		time(time);
		if (type.equals("sendKeys")) {
			element.clear();
			element.sendKeys(sendData);
		} else {
			element.click();
		}
		time(time);
	}

	public static void clicked_dropdownInput(WebElement element, int time, WebElement element1, String type,
			String testTitle) {
		test = report.createTest(testTitle);
		String elementText = element.getText();
		element.click();
		time(time);
		if (type == "text") {
			String getInputValue = element1.getText();
			if (getInputValue.equals(elementText)) {
				test.log(Status.PASS, "The Field contains the selected value");
			} else {
				test.log(Status.FAIL, "The Field not contains the selected value");
			}
		} else {
			String getInputValue = element1.getAttribute("value");
			if (getInputValue.equals(elementText)) {
				test.log(Status.PASS, "The Field contains the selected value");
			} else {
				test.log(Status.FAIL, "The Field not contains the selected value");
			}
		}

	}

	public static void verifyCrossButton(WebElement element, int time, WebElement element2, String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		element.sendKeys(randomString(4));
		time(time);
		String getInputValue = element.getAttribute("value");
		element2.click();
		time(time);
		String getInputValue2 = element.getAttribute("value");
		if (!getInputValue.equals(getInputValue2)) {
			test.log(Status.PASS, "The field is clear");
		} else {
			test.log(Status.FAIL, "The field is not clear");
		}
	}

	public static void cropSpaces_Input(WebElement element, String sendData, WebElement element2, WebElement element3,
			String testTitle) {

		test = report.createTest(testTitle);
		element.clear();
		element.sendKeys(sendData);
		element2.click();
		time(500);
		if (!element3.getAttribute("textContent").equals(sendData)) {
			test.log(Status.PASS, "The information is saved with valid data");
		} else {
			test.log(Status.FAIL, "The information is saved with invalid data.");
		}
	}

	public static void cropSpaces_TextArea(WebElement element, WebElement element2, WebElement element3,
			WebElement element4, String sendData,String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		element.sendKeys(sendData);
		element2.click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[text()='OK']"));
		if (ele.size() > 0) {
			ele.get(0).click();
		}
		time(500);
		element3.click();
		time(500);
		if (!element4.getAttribute("value").equals(sendData)) {
			test.log(Status.PASS, "Spaces are croped form the text.");
		} else {
			test.log(Status.FAIL, "Spaces are not croped from the text.");
		}
	}

	public static void verifyCropSpacesTextField_SidePanel(WebElement sfsp, WebElement rbsp, WebElement cnfsp, WebElement cnfif,
			WebElement cnfsb, List<WebElement> el4, String sendData, String testTitle) {
		
		/* This function will firstly clear the search text field, Secondly Create the folder by adding spaces
		   in input field and then verify spaces..
		   Note : This function will only work for sidepanel */
		
		test = report.createTest(testTitle);
		sfsp.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
		utilityMethods.time(500);
		rbsp.click();
		utilityMethods.time(500);
		cnfsp.click();
		time(500);
		cnfif.clear();
		time(500);
		cnfif.sendKeys(sendData);
		time(500);
		cnfsb.click();
		time(500);
		sfsp.sendKeys(sendData);
		time(500);
		for (WebElement li : el4)
			if (!li.getAttribute("textContent").equals(sendData)) {
				test.log(Status.PASS, "Spaces are croped form the text.");
			} else {
				test.log(Status.FAIL, "Spaces are not croped form the text.");
			}

	}
	
	public static void verifyCropSpacesTextArea_SidePanel(WebElement sfsp, WebElement rbsp, WebElement cnfsp, WebElement cnfif,WebElement cnfta,
			WebElement cnfsb, WebElement edbt, List<WebElement> list,WebElement cancel, String sendData, String testTitle) {
		
		/* This function will firstly clear the search text field, Secondly Create the folder by adding spaces
		   in text area and then open the same created foler to verify text area spaces */
		
		test = report.createTest(testTitle);
		sfsp.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
		utilityMethods.time(500);
		rbsp.click();
		utilityMethods.time(500);
		cnfsp.click();
		time(500);
		cnfif.clear();
		time(500);
		cnfif.sendKeys(sendData);
		time(500);
		cnfta.sendKeys(sendData);
		time(500);
		cnfsb.click();
		time(500);
		sfsp.sendKeys(sendData);
		time(500);
		Actions action = new Actions(driver);
		action.moveToElement(list.get(0)).contextClick().build().perform();
		edbt.click();
		time(1000);
		if (cnfta.getAttribute("textContent").equals(sendData)) {
			test.log(Status.PASS, "Spaces are croped form the text.");
		} else {
			test.log(Status.FAIL, "Spaces are not croped form the text.");
		}
		cancel.click();
	}
	public static void removeList_SidePanel(List<WebElement> el,WebElement e1,List<WebElement> e2,WebElement del,WebElement yes,WebElement ok) {
		
		// This function will clear the text of search input field from sidepanel and then remove all items in the list....
		time(1000);
		e1.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
		time(1000);
		for(int i = el.size()-1;i>=0;i--) {
			Actions action = new Actions(driver);
			action.moveToElement(e2.get(i)).contextClick().build().perform();
			utilityMethods.time(1000);
			action.moveToElement(del).click().build().perform();
			utilityMethods.time(1000);
			yes.click();
			utilityMethods.time(1000);
			ok.click();
		}
	}

	public static void sendKeys_Input(WebElement element, int time, String type, String testTitle) {
		test = report.createTest(testTitle);

		String sendStr_Int = "NewColumn12";
		String sendChar = "'!@_ #$)/(+='";
		time(500);
		element.clear();
		element.sendKeys(sendStr_Int + sendChar);
		time(time);
		String getInputValue = element.getAttribute("value");
		if (type.equals("includeChar")) {
			if (getInputValue.equals(sendStr_Int + sendChar)) {
				test.log(Status.PASS, "The field is containing valid value");
			} else {
				test.log(Status.FAIL, "The field is containing invalid value");
			}
		} else {
			if (getInputValue.equals(sendStr_Int)) {
				test.log(Status.PASS, "The field is containing valid value");
			} else {
				test.log(Status.FAIL, "The field is containing invalid value");
			}
		}
	}

	public static void verifyInput(WebElement element, String sendData, String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		element.sendKeys(sendData);
		element.sendKeys(Keys.chord(Keys.ENTER));
		time(500);
		String getInputValue = element.getAttribute("value");
		if (getInputValue.equals(sendData)) {
			test.log(Status.PASS, "The Data is successfully entered in the field.");
		} else {
			test.log(Status.FAIL, "The Data is not entered in the field.");
		}
	}
	public static void verifyDropdownOptionSelected(List<WebElement> eList,WebElement e2,String testTitle) {
		// Before run this function make sure dropdown list is visible...
		test = report.createTest(testTitle);
		Random rand = new Random();
		int i = rand.nextInt(eList.size());
		String getText = eList.get(i).getText();
		time(500);
		eList.get(i).click();
		time(500);
		String getValue = e2.getAttribute("value");
		if(getText.toLowerCase().equals(getValue.toLowerCase())) {
			test.log(Status.PASS, "The Selected value from the dropdown is presenting in the field.");
		}
		else {
			test.log(Status.FAIL, "The Selected value from the dropdown is not presenting in the field.");
		}
		
	}
	public static void validateSearchPlaceholder(WebElement element, String data, String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		String getPlaceholder = element.getAttribute("placeholder");
		time(300);
		if (getPlaceholder.equals(data)) {
			test.log(Status.PASS, "This Search field conatins " + getPlaceholder + " by default.");
		} else {
			test.log(Status.FAIL, "This Search field doesn't conatins " + getPlaceholder + " by default.");
		}

	}

	public static void validateSearchList_SidePanel(WebElement element, List<WebElement> elementList,
			List<WebElement> childList, String data, String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		time(100);
		element.sendKeys(data);
		time(500);
		if (elementList.size() > 0) {
			for (WebElement list : elementList) {
				if (list.getText().toLowerCase().contains(data.toLowerCase()) && list.isDisplayed()) {
					test.log(Status.PASS,
							"The Search is working beacuase type word '" + data + "' is present in " + list.getText());
				} else {
					for (WebElement li : childList) {
						if (li.getText().toLowerCase().contains(data.toLowerCase()) && list.isDisplayed()) {
							test.log(Status.PASS, "The Search is working beacuase type word '" + data
									+ "' is present in " + li.getText());
						} else {
							test.log(Status.FAIL,
									"The Search is not working beacuase type word '" + data + "' is not present");
						}
					}
				}
			}
		} else {
			test.log(Status.PASS, "No element found against the typed word '" + data + "' in the list.");
		}
	}

	public static void validateSearch(WebElement element, List<WebElement> elementList, String data, String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		time(100);
		element.sendKeys(data);
		time(1000);
		if (elementList.size() > 0) {
			for (WebElement list : elementList) {
				if (list.getText().toLowerCase().contains(data.toLowerCase()) && list.isDisplayed()) {
					test.log(Status.PASS,
							"The Search is working beacuase type word '" + data + "' is present in " + list.getText());
				} else {
					test.log(Status.FAIL, "The Search is not working beacuase type word '" + data + "' is not present");
				}
			}
		} else {
			test.log(Status.PASS, "No element found against the typed word '" + data + "' in the list.");
		}
	}
	public static void validateElementText_Match(WebElement element, String data, String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getText();
		if (getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing " + getInputValue);
		} else {
			test.log(Status.FAIL, "The field is not containing " + getInputValue);
		}
	}
	public static void validateElementText_NotMatch(WebElement element, String data, String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getText();
		if (!getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing " + getInputValue);
		} else {
			test.log(Status.FAIL, "The field is not containing " + getInputValue);
		}
	}
	public static void validateInputText_Match(WebElement element, String data, String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getAttribute("value");
		if (getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing " + getInputValue);
		} else {
			test.log(Status.FAIL, "The field is not containing " + getInputValue);
		}
	}

	public static void validateInputText_NotMatch(WebElement element, String data, String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getAttribute("value");
		if (!getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing " + data);
		} else {
			test.log(Status.FAIL, "The field is not containing " + data);
		}
	}
	
	public static void validateUpDownButton(WebElement div, WebElement input, WebElement update, WebElement move, String testTitle) {
		test = report.createTest(testTitle);
		Actions action = new Actions(driver);
		action.moveToElement(div).doubleClick().build().perform();
		time(1000);
		input.sendKeys("test");
		time(1000);
		update.click();
		time(1000);
		move.click();
		time(1000);
		if(!div.getText().equals("test")) {
			test.log(Status.PASS, "The arrow button is clicked and item is switched from it's position.");
		}else {
			test.log(Status.FAIL, "The arrow button is clicked but item is not switched from it's position.");
		}
	}

	public static void list_Visible(WebElement element, int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		time(time);
		element.click();
		time(time);
		if (element2.size() > 0 && element2.get(0).isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}

	public static void list_NotVisible(WebElement element, int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		time(time);
		if (element2.size() == 0) {
			test.log(Status.PASS, "The element is close.");
		} else {
			if (element2.get(0).isDisplayed()) {
				test.log(Status.FAIL, "The element is not close.");
			} else {
				test.log(Status.PASS, "The element is close.");
			}

		}
	}

	public static void list_Match(List<WebElement> element, int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		String firstList = Columns(element);
		time(time);
		String secondList = Columns(element2);
		if (firstList.contains(secondList)) {
			test.log(Status.PASS, "The element is match");
		} else {
			test.log(Status.FAIL, "The element is not match");
		}
	}
	public static void verifyListSorting(WebElement element2, int time, List<WebElement> element, String testTitle) {
		test = report.createTest(testTitle);
		String[] firstList = Columns(element).split(",");
		time(time);
		element2.click();
		time(time);
		String[] secondList = Columns(element).split(",");
		if (!firstList[0].equals(secondList[0])) {
			test.log(Status.PASS, "The list is sorted");
		} else {
			test.log(Status.FAIL, "The list is not sorted");
		}
	}
	public static void verifyItemAdded(List<WebElement> list,WebElement e,String testTitle) {
		test = report.createTest(testTitle);
		int beforeSize = list.size();
		time(500);
		e.click();
		time(500);
		int afterSize = list.size();
		if (afterSize > beforeSize) {
			test.log(Status.PASS, "The item added successfully.");
		} else {
			test.log(Status.FAIL, "The item not added.");
		}
	}

	public static void verifyItemRemove(WebElement removeButton,List<WebElement> itemList, String testTitle) {
		test = report.createTest(testTitle);
		int beforeSize = itemList.size();
		removeButton.click();
		time(1000);
		int afterSize = itemList.size();
		if (afterSize<beforeSize) {
			test.log(Status.PASS, "The element remove form the list");
		} else {
			test.log(Status.FAIL, "The element is not remove from the list");
		}
	}

	public static void verifyItemRemove_OkButton(WebElement removeButton,List<WebElement> itemList, WebElement okButton, String testTitle) {
		test = report.createTest(testTitle);
		int beforeSize = itemList.size();
		removeButton.click();
		time(1000);
		okButton.click();
		time(1000);
		int afterSize = itemList.size();
		if (afterSize<beforeSize) {
			test.log(Status.PASS, "The element remove form the list");
		} else {
			test.log(Status.FAIL, "The element is not remove from the list");
		}
	}
	public static void verifyItemNotRemove(WebElement removeButton,List<WebElement> itemList, String testTitle) {
		test = report.createTest(testTitle);
		int beforeSize = itemList.size();
		removeButton.click();
		time(1000);
		int afterSize = itemList.size();
		if (afterSize==beforeSize) {
			test.log(Status.PASS, "The element not remove form the list");
		} else {
			test.log(Status.FAIL, "The element is remove from the list");
		}
	}
	public static void verifySizeMatch(List<WebElement> list, int size2, String testTitle) {
		test = report.createTest(testTitle);
		int size = list.size();
		if (size >= size2) {
			test.log(Status.PASS, "The element list are appearing correctly.");
		} else {
			test.log(Status.FAIL, "The element list are not appearing correctly.");
		}
	}

	public static void verifyIncrementButton(WebElement element, WebElement element2) {
		test = report.createTest("Verify Increment Button increase the value in input field.");
		String getInputValue = element.getAttribute("value");
		int val1 = Integer.parseInt(getInputValue);
		element2.click();
		time(500);
		String getInputValue1 = element.getAttribute("value");
		int val2 = Integer.parseInt(getInputValue1);
		if (val2 > val1) {
			test.log(Status.PASS, "Increment Button is increasing the value");
		} else {
			test.log(Status.FAIL, "Increment Button is not increasing the value");
		}
	}

	public static void verifyDecrementButton(WebElement element, WebElement element2) {
		test = report.createTest("Verify Increment Button increase the value in input field.");
		String getInputValue = element.getAttribute("value");
		int val1 = Integer.parseInt(getInputValue);
		element2.click();
		time(500);
		String getInputValue1 = element.getAttribute("value");
		int val2 = Integer.parseInt(getInputValue1);
		if (val2 < val1) {
			test.log(Status.PASS, "Decrement Button is decreasing the value");
		} else {
			test.log(Status.FAIL, "Decrement Button is not decreasing the value");
		}
	}

	public static void verifyFieldInputs(WebElement element) {

		String sendData_Str = "NewColumn";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		test = report.createTest(
				"Verify that Text Field inputs numeric, characters and alphabet in 'Create New Filter' Screen ");
		element.clear();
		element.sendKeys(sendData_Str + sendData_Int + sendData_Char);
		time(500);
		String getInputValue = element.getAttribute("value");
		if (getInputValue.equals(sendData_Str + sendData_Int + sendData_Char)) {
			test.log(Status.PASS, "Text Field inputs alphabets, special characters and numeric values");
		} else {
			test.log(Status.FAIL, "Text Field not inputs alphabets, special characters and numeric values");
		}

	}

	public static void verifyRadioButtonPrivatePublicVisible(List<WebElement> element) {
		test = report.createTest("Verify that Radio Button is visible");
		for (WebElement radionbtn : element) {
			if (radionbtn.isDisplayed()) {
				test.log(Status.PASS, radionbtn.getText() + " Radio Button is visible");
			} else {
				test.log(Status.FAIL, radionbtn.getText() + " Radio Button is not visible");
			}
		}
	}

	public static void verifyRadioButtonPrivatePublicClickable(List<WebElement> element) {
		test = report.createTest("Verify that Radio Button is clickable ");
		for (WebElement radionbtn : element) {
			if (radionbtn.isEnabled()) {
				test.log(Status.PASS, radionbtn.getText() + " Radio Button is clickable");
			} else {
				test.log(Status.FAIL, radionbtn.getText() + " Radio Button is not clickable");
			}
		}
	}

	public static void verifyRadioButtonSelection(List<WebElement> element, List<WebElement> selectedelement) {
		test = report.createTest("Verify that only one Visibility Radio Button can be selected at a time.");
		for (WebElement radionbtn : element) {
			radionbtn.click();
			if (selectedelement.size() == 1) {
				test.log(Status.PASS,
						radionbtn.getText() + " Radio Button is selected & Other Radio button is unselected");
			} else if (selectedelement.size() > 1) {
				test.log(Status.FAIL, radionbtn.getText() + " & Other Radio Button selected at similar time.");
			} else {
				test.log(Status.FAIL, "No Radio Button is not selected");
			}
		}
	}

	public static void clicked_Single(WebElement element, int time, WebElement element1, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (element1.isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}

	public static void verifyfieldmandatory(WebElement element, int time, WebElement element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		element.sendKeys("ABCD");
		element.clear();
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (element2.isDisplayed()) {
			test.log(Status.PASS, "if the field is empty an exclamation mark appears on right side");
		} else {
			test.log(Status.FAIL, "if the field is not empty an exclamation mark doesn't appear on right side");
		}
		test = report.createTest(
				"Verify that hovering on the exclamation mark should display 'This field is required' message");
		if (element2.getAttribute("data-errorqtip").contains("This field is required")) {
			test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
		} else {
			test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
		}
	}

	public static void verifytooltip(WebElement element, String data) {
		test = report.createTest("Verify that Question mark appears on the right side of the options");
		if (element.isDisplayed()) {
			test.log(Status.PASS, "Question Mark button is visible");
		} else {
			test.log(Status.FAIL, "Question Mark button is not visible");
		}
		test = report.createTest("Verify that hovering on the Question mark should display some text");
		if (element.getAttribute("data-qtip").contains(data)) {
			test.log(Status.PASS, "hovering on the Question mark displays " + data);
		} else {
			test.log(Status.FAIL, "hovering on the Question mark dosn't display " + data);
		}
	}

	public static void verifyChildFolder_SidePanel(WebElement sf, List<WebElement> folder, WebElement el, WebElement el2,
			WebElement el3, List<WebElement> el4, String sendData) {
		// This function will firstly clear the text search then search the desired folder and select it and create sub folder inside it...
		test = report.createTest(
				"Verify that 'Inner Folder' is creating when 'Create New Folder' by selecting parent folder");
		sf.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
		utilityMethods.time(1000);
		sf.sendKeys(" CropSpaceBT");
		utilityMethods.time(1000);
		folder.get(0).click();
		time(500);
		sf.sendKeys(Keys.chord(Keys.CONTROL, "a" + Keys.BACK_SPACE));
		time(500);
		el.click();
		time(500);
		el2.sendKeys(sendData);
		el3.click();
		time(500);
		if (el4.size() == 0) {
			test.log(Status.PASS, "Child Folder Created successfully");
		} else {
			test.log(Status.FAIL, "Child Folder not Created unfortunately.");
		}
	}

	public static void verifyListExpandAndCollapse_SidePanel(WebElement el, WebElement el2, List<WebElement> el3) {
		test = report
				.createTest("Side Pane: Veify that Side Panel Filter is expanding when click on Expand All button.");
		el.click();
		time(500);
		if (el3.size() > 0) {
			test.log(Status.PASS, "Side Panel List section is expanding");
		} else {
			test.log(Status.PASS, "Side Panel List section is not expanding");
		}
		test = report
				.createTest("Side Pane: Veify that Side Panel Filter is collapsing when click on Collapse All button.");
		el2.click();
		time(500);
		if (el3.size() == 0) {
			test.log(Status.PASS, "Side Panel List section is collapsing");
		} else {
			test.log(Status.PASS, "Side Panel List section is not collapsing");
		}

	}
	public static void verifyItemVisibleOnHover(WebElement el,WebElement el2,String testTitle) {
		test = report.createTest(testTitle);
		Actions actions = new Actions(driver);
		actions.moveToElement(el).build().perform();
		time(500);
		if (el2.isDisplayed()) {
			test.log(Status.PASS, "The Item is visible when hover on it.");
		} else {
			test.log(Status.FAIL, "The Item is not visible when hover on it.");
		}
	}
	public static void verifyColumnRemoveCheckbox(List<WebElement> li,List<WebElement> columnName,String testTitle) {
		test = report.createTest("Remove Case: "+testTitle);
		time(500);
		int size1 = columnName.size();
		li.get(0).click();
		time(100);
		int size2 = columnName.size();
		if(size1>size2) {
			test.log(Status.PASS, "The Selected Column removed.");
		}else {
			test.log(Status.FAIL, "The Selected Column not removed.");
		}
		test = report.createTest("Add Case: "+testTitle);
		li.get(0).click();
		time(500);
		int size3 = columnName.size();
		if(size2<size3) {
			test.log(Status.PASS, "The Selected Column Add.");
		}else {
			test.log(Status.FAIL, "The Selected Column not Add.");
		}

	}
	public static void verifyQueryBuilderCreated(WebElement input,String data,List<WebElement> Columns,List<WebElement> screen,WebElement ok,String testTitle) {
		test = report.createTest(testTitle);
		time(1000);
		input.click();
		input.sendKeys(data);
		input.sendKeys(Keys.ENTER);
		time(1500);
		Columns.get(3).click();
		Columns.get(4).click();
		Columns.get(5).click();
		ok.click();
		time(500);
		if(screen.size()==0) {
			test.log(Status.PASS, "The Query Builder created.");
		}else {
			test.log(Status.PASS, "The Query Builder not created.");
		}
	}

	public static void trycatch(WebElement element, WebElement element1, WebElement element2, int time,
			String testTitle) {

		try {
			test = report.createTest(testTitle);
			element.click();
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (element1.isDisplayed()) {
				test.log(Status.PASS, "The element is visible");
			} else {
				test.log(Status.FAIL, "The element is not visible");
			}

		}

		catch (Exception e) {
			test = report.createTest(testTitle);
			element2.click();
			test.log(Status.FAIL, "The element is not visible");
		}
    }
}
