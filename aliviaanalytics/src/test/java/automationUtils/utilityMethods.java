package automationUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Configuration;

public class utilityMethods extends Configuration  {
	
	
	public static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
				action.doubleClick(element).perform();
	}
	
	
	  public static void waitForVisibility(WebElement element) throws Error{
          new WebDriverWait(driver, 120)
               .until(ExpectedConditions.visibilityOf(element));
   }
	  
	  
	  public static void WaitforElementNotVisible(WebElement element) throws Error{
          new WebDriverWait(driver, 120)
               .until(ExpectedConditions.invisibilityOf(element));
   }
	  
	  

}
