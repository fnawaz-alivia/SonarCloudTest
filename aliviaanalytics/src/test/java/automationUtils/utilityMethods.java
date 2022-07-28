package automationUtils;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.WebElement;
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
	public static void clicked_elementVisible(WebElement element,int time,WebElement element1, String testTitle) {
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
	public static void clicked_elementInput(WebElement element,int time,WebElement element1,String type, String testTitle) {
		test = report.createTest(testTitle);
		String elementText = element.getText();
		element.click();
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	
	public static void senKeys_Input(WebElement element,int time,String type, String testTitle) {
		String sendStr_Int = "NewColumn12";
		String sendChar = "'!@_ #$)/(+='";
		element.clear();
		element.sendKeys(sendStr_Int+sendChar);
		test = report.createTest(testTitle);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public static void list_Visible(WebElement element,int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (element2.size()>0) {
			test.log(Status.PASS, "The element is visible");
		} else {
			test.log(Status.FAIL, "The element is not visible");
		}
	}
	public static void list_NotVisible(WebElement element,int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		element.click();
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (element2.size()==0) {
			test.log(Status.PASS, "The element is close");
		} else {
			test.log(Status.FAIL, "The element is not close");
		}
	}
	public static void list_Match(List<WebElement> element,int time, List<WebElement> element2, String testTitle) {
		test = report.createTest(testTitle);
		String firstList = Columns(element);
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String secondList = Columns(element2);
		System.out.println(firstList+"\n"+secondList);
		if (firstList.contains(secondList)) {
			test.log(Status.PASS, "The element is match");
		} else {
			test.log(Status.FAIL, "The element is not match");
		}
	}


	public static void verifyFieldInputs(WebElement element) throws Exception {
		String sendData_Str = "NewColumn";
		String sendData_Int = "12";
		String sendData_Char = "'!@_ #$)/(+='";
		test = report.createTest(
				"Verify that Text Field inputs numeric, characters and alphabet in 'Create New Filter' Screen ");
		element.clear();
		element.sendKeys(sendData_Str + sendData_Int + sendData_Char);
		Thread.sleep(500);
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
	  public static void verifyRadioButtonSelection(List<WebElement> element,List<WebElement> selectedelement) throws Exception {
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
	    public static void clicked_List_Visible(WebElement element,int time, List<WebElement> element2, String testTitle,String t) {
	        test = report.createTest(testTitle);
	        element.click();
	        try {
	            Thread.sleep(time);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        if (element2.size()>0) {
	            test.log(Status.PASS, "The element is visible");
	        } else {
	            test.log(Status.FAIL, "The element is not visible");
	        }
	    }
	    public static void clicked_List_Unvisible(WebElement element,int time, List<WebElement> element2, String testTitle) {
	        test = report.createTest(testTitle);
	        element.click();
	        try {
	            Thread.sleep(time);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        if (element2.size()==0) {
	            test.log(Status.PASS, "The element is close");
	        } else {
	            test.log(Status.FAIL, "The element is not close");
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
	    
	    
	    
	    
}
