package automationUtils;


import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public static int itemsSize(List<WebElement> itemList) {
		int size = itemList.size();
		return size;
	}
	
	public static void visible(WebElement element,String testTitle) {
		test = report.createTest(testTitle);
		if (element.isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}
	public static void clickable(WebElement element,String testTitle) {
		test = report.createTest(testTitle);
		if (element.isEnabled()) {
			test.log(Status.PASS, "The element is clickable");
		} else {
			test.log(Status.FAIL, "The element is not clickable");
		}
	}
	public static void disable(WebElement element,String testTitle) {
		test = report.createTest(testTitle);
		if (!element.isEnabled()) {
			test.log(Status.PASS, "The element is disable");
		} else {
			test.log(Status.FAIL, "The element is not disable");
		}
	}
	public static void clicked_elementVisible(WebElement element,int time,WebElement element1, String testTitle) {
		
		test = report.createTest(testTitle);
		element.click();
		time(time);
		if (element1.isDisplayed()) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}
	public static void testCase_Duplicate(WebElement element,int time,String type,String sendData) {
		if(type.equals("sendKeys")) {
			element.clear();
			element.sendKeys(sendData);
		}else {
			element.click();
		}
		time(time);
	}
	public static void clicked_dropdownInput(WebElement element,int time,WebElement element1,String type, String testTitle) {
		test = report.createTest(testTitle);
		String elementText = element.getText();
		element.click();
		time(time);
		if(type=="text") {
			String getInputValue = element1.getText();
			if (getInputValue.equals(elementText)) {
				test.log(Status.PASS, "The Field contains the selected value");
			} else {
				test.log(Status.FAIL, "The Field not contains the selected value");
			}
		}else {
			String getInputValue = element1.getAttribute("value");
			if (getInputValue.equals(elementText)) {
				test.log(Status.PASS, "The Field contains the selected value");
			} else {
				test.log(Status.FAIL, "The Field not contains the selected value");
			}
		}
		
	}
	public static void clicked_fieldInput(WebElement element,String sendData,int time,WebElement element2,String testTitle) {
		test = report.createTest(testTitle);
		element.clear();
		element.sendKeys(sendData);
		time(time);
		String getInputValue = element.getAttribute("value");
		element2.click();
		time(time);
		String getInputValue2 = element.getAttribute("value");
		if(!getInputValue.equals(getInputValue2)) {
			test.log(Status.PASS, "The field is clear");
		}else {
			test.log(Status.FAIL, "The field is not clear");
		}
	}
	public static void cropSpaces_Input(WebElement element,String sendData,WebElement element2,WebElement element3,String testTitle) {
		
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
	public static void cropSpaces_TextArea(WebElement element,WebElement element2, WebElement element3,WebElement element4,String sendData) {
		test = report.createTest("Verify that Spaces are croped from the text when click on saved button");
		element.clear();
		element.sendKeys(sendData);
		element2.click();
		List<WebElement> ele = driver.findElements(By.xpath("//*[text()='OK']"));
		if(ele.size()>0) {
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
	
	
	public static void senKeys_Input(WebElement element,int time,String type, String testTitle) {
		test = report.createTest(testTitle);
		
		String sendStr_Int = "NewColumn12";
		String sendChar = "'!@_ #$)/(+='";
		element.clear();
		element.sendKeys(sendStr_Int+sendChar);
		time(time);
		String getInputValue = element.getAttribute("value");
		if(type.equals("includeChar")) {
			if (getInputValue.equals(sendStr_Int+sendChar)) {
				test.log(Status.PASS, "The field is containing valid value");
			} else {
				test.log(Status.FAIL, "The field is containing invalid value");
			}
		}else {
			if (getInputValue.equals(sendStr_Int)) {
				test.log(Status.PASS, "The field is containing valid value");
			} else {
				test.log(Status.FAIL, "The field is containing invalid value");
			}
		}
	}
	
	public static void verifyInput(WebElement element, String sendData,String testTitle) { 
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
	public static void validateSearch(WebElement element,List<WebElement> elementList,String data) {
		test = report.createTest("Verify that Search is working when type anything in it.");
		element.clear();
		time(100);
		element.sendKeys(data);
		time(200);
		if(elementList.size()>0) {
			for(WebElement list : elementList) {
				if(list.getText().contains(data) && list.isDisplayed()) {
					test.log(Status.PASS, "The Search is working.");
				}else {
					test.log(Status.FAIL, "The Search is not working.");
				}
			}
		}
		else {
			test.log(Status.PASS, "No element found against the typed word.");
		}
	}
	public static void text_Match(WebElement element,String data,String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getAttribute("value");
		if (getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing "+getInputValue);
		} else {
			test.log(Status.FAIL, "The field is not containing "+getInputValue);
		}
	}
	public static void text_NotMatch(WebElement element,String data,String testTitle) {
		test = report.createTest(testTitle);
		String getInputValue = element.getAttribute("value");
		if (!getInputValue.equals(data)) {
			test.log(Status.PASS, "The field is containing "+getInputValue);
		} else {
			test.log(Status.FAIL, "The field is not containing "+getInputValue);
		}
	}
	public static void list_Visible(WebElement element,int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		time(time);
		if (element2.size()>0) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}
	public static void list_NotVisible(WebElement element,int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		time(time);
		if (element2.size()==0 ) {
			test.log(Status.PASS, "The element is close");
		} else {
			if(element2.get(0).isDisplayed()) {
				test.log(Status.FAIL, "The element is not close");
			}else {
				test.log(Status.PASS, "The element is close");
			}
			
		}
	}
	public static void list_Match(List<WebElement> element,int time, List<WebElement> element2, String testTitle) {
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
	public static void size_Match(int size1,int size2,String testTitle) {
		test = report.createTest(testTitle);
		int beforeSize = size1;
		int afterSize = size2;
		if (beforeSize!=afterSize) {
			test.log(Status.PASS, "The element remove form the list");
		} else {
			test.log(Status.FAIL, "The element is not remove from the list");
		}
		
	}
	
	public static void verifyIncrementButton(WebElement element,WebElement element2) {
		test=report.createTest("Verify Increment Button increase the value in input field.");
		String getInputValue = element.getAttribute("value");
		int val1 = Integer.parseInt(getInputValue);
		element2.click();
		time(500);
		String getInputValue1 = element.getAttribute("value");
		int val2 = Integer.parseInt(getInputValue1);
		if(val2>val1) {
			test.log(Status.PASS, "Increment Button is increasing the value");
		}else {
			test.log(Status.FAIL, "Increment Button is not increasing the value");
		}
	}
	public static void verifyDecrementButton(WebElement element,WebElement element2) {
		test=report.createTest("Verify Increment Button increase the value in input field.");
		String getInputValue = element.getAttribute("value");
		int val1 = Integer.parseInt(getInputValue);
		element2.click();
		time(500);
		String getInputValue1 = element.getAttribute("value");
		int val2 = Integer.parseInt(getInputValue1);
		if(val2<val1) {
			test.log(Status.PASS, "Decrement Button is decreasing the value");
		}else {
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
	        for(WebElement radionbtn : element ) {
	            if(radionbtn.isDisplayed()) {
	                test.log(Status.PASS, radionbtn.getText()+" Radio Button is visible");
	            }else {
	                test.log(Status.FAIL, radionbtn.getText()+" Radio Button is not visible");
	            }
	        }
	    }
	  public static void verifyRadioButtonPrivatePublicClickable(List<WebElement> element) {
	        test = report.createTest("Verify that Radio Button is clickable ");
	        for(WebElement radionbtn : element ) {
	            if(radionbtn.isEnabled()) {
	                test.log(Status.PASS, radionbtn.getText()+" Radio Button is clickable");
	            }else {
	                test.log(Status.FAIL, radionbtn.getText()+" Radio Button is not clickable");
	            }
	        }
	    }
	  public static void verifyRadioButtonSelection(List<WebElement> element,List<WebElement> selectedelement) {
	        test = report.createTest("Verify that only one Visibility Radio Button can be selected at a time.");
	        for(WebElement radionbtn : element ) {
	            radionbtn.click();
	            if(selectedelement.size()==1) {
	                test.log(Status.PASS, radionbtn.getText()+" Radio Button is selected & Other Radio button is unselected");
	            }else if(selectedelement.size()>1) {
	                test.log(Status.FAIL, radionbtn.getText()+" & Other Radio Button selected at similar time.");
	            }else {
	                test.log(Status.FAIL, "No Radio Button is not selected");
	            }
	        }
	    }
	  
	    public static void clicked_Single(WebElement element,int time,WebElement element1, String testTitle) {
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
	    
	    public static void verifyfieldmandatory(WebElement element,int time, WebElement element2, String testTitle) {
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
			if(element2.isDisplayed()) {
				test.log(Status.PASS, "if the field is empty an exclamation mark appears on right side");
			}
			else {
				test.log(Status.FAIL, "if the field is not empty an exclamation mark doesn't appear on right side");
			}
			test = report.createTest("Verify that hovering on the exclamation mark should display 'This field is required' message");
			if(element2.getAttribute("data-errorqtip").contains("This field is required")) {
				test.log(Status.PASS, "hovering on the exclamation mark displays 'This field is required' message");
			}
			else
			{
				test.log(Status.FAIL, "hovering on the exclamation mark dosn't display 'This field is required' message");
			}
	    }
	    
	    public static void verifytooltip(WebElement element,String data) {
	    	 test = report.createTest("Verify that Question mark appears on the right side of the options");
	    	 if(element.isDisplayed()) {
	    		 test.log(Status.PASS, "Question Mark button is visible");
	    	 }
	    	 else {
	    		 test.log(Status.FAIL, "Question Mark button is not visible");
	    	 }
	    	 test = report.createTest("Verify that hovering on the Question mark should display some text");
	    	 if(element.getAttribute("data-qtip").contains(data)) {
	    		 test.log(Status.PASS, "hovering on the Question mark displays "+data);
	    	 }
	    	 else
	    	 {
				test.log(Status.FAIL, "hovering on the Question mark dosn't display "+data);
	    	 }
	    }

	    

}
