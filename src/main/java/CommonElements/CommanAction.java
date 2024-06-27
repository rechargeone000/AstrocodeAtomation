package CommonElements;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseTestclass;

public class CommanAction  extends CommonHelp {
	static Actions act = new Actions(driver);
	

	// Function to Double click on Element
	public void doubleClick(By locator) {
		if (findAnyElement(locator).isEnabled()) {
			act.doubleClick(findAnyElement(locator));
		}
	}
	
	
	

	// Function to click on Radio Button
	public static void clickOnRadioButton(By locator) {
		if (findAnyElement(locator).isSelected()) {

		} else {
			findAnyElement(locator).click();
		}
	}

	// Function to Move a Mouse to an Element
	public static void moveToElementAndClick(By locator) {
		act.moveToElement(findAnyElement(locator)).click().perform();
		
		
	}
	
	
	
	

	// Function to Drag and Drop an Element
	public static void dragAndDropElement(By source, By target) {
		if (findAnyElement(source).isEnabled()) {
			act.dragAndDrop(findAnyElement(source), findAnyElement(target)).build().perform();
		} else {
			System.out.println("Target/Soruce Element is not Enabled/Present.");
		}
	}

	// Function to Send Keys of KeyBoard
	public static void sendEnterKeys() {
		act.sendKeys(Keys.ENTER).build();
	}

	// Function to Key Down of KeyBoard And Enter
	public static void sendKeyDownAndClick(WebElement locator) {
		try {
			Thread.sleep(2000);

			//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.ARROW_DOWN).moveToElement(locator).click().build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sendKeyDown(){
		try {
			Thread.sleep(2000);

			act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void fileupload(StringSelection sel) throws Exception
//	{
//		//StringSelection sel = new StringSelection("C:\\Users\\USER\\Desktop\\m1\\8.jpg");
//		 
//		   // Copy to clipboard
//		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
//		 System.out.println("selection" +sel);
//		 
//		 Robot robot = new Robot();
//		 Thread.sleep(2000);
//		      
//		  // Press Enter
//		 robot.keyPress(KeyEvent.VK_ENTER);
//		 
//		// Release Enter
//		 robot.keyRelease(KeyEvent.VK_ENTER);
//		 
//		  // Press CTRL+V
//		 robot.keyPress(KeyEvent.VK_CONTROL);
//		 robot.keyPress(KeyEvent.VK_V);
//		 
//		// Release CTRL+V
//		 robot.keyRelease(KeyEvent.VK_CONTROL);
//		 robot.keyRelease(KeyEvent.VK_V);
//		 Thread.sleep(1000);
//		        
//		         //Press Enter 
//		 robot.keyPress(KeyEvent.VK_ENTER);
//		 robot.keyRelease(KeyEvent.VK_ENTER);
//		 
//	}
	

	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
        	
        	StringSelection stringSelection = new StringSelection(fileLocation);
 		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
	
	
	
	public static void SelectDateJS(By locator, String Date)
	{
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('value','"+Date+"');", locator);
	}
	
}
