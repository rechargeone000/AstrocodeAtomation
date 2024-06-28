package CommonElements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import baseclass.BaseTestclass;

public class CommonHelp extends BaseTestclass {
	// public static WebDriver driver;
	public WebElement element;
	public static Wait<WebDriver> fwait;
	public static JavascriptExecutor jsExecutor;
	static SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	static Date date = new Date();
	static Date date1 = new Date();

	public static WebElement findAnyElement(By locator) {
		
		return driver.findElement(locator);

	}

	public static void selectInDropdownByValue(WebElement locator, String val) {

		Select dropDown = new Select(locator);
		List<WebElement> theseOptions = dropDown.getOptions();
		for (WebElement option : theseOptions) {
			if (option.getAttribute("href").equals(val)) {
				option.click();
			}
		}
	}

	public static void selectInDropdownByValueD(WebElement locator, String val) {

		Select se = new Select(locator);
		se.selectByVisibleText(val);

	}

	public static void selectdropdownbyindex(By locator, int index) {
		Select se = new Select(CommonHelp.driver.findElement(locator));
		se.selectByIndex(index);

	}

	// Function to Enter Text into Text box
	public static void enterValues(By locator, String values) {
		WebElement element = findAnyElement(locator);
		// String readMode= findAnyElement(locator).getAttribute("readonly");
		if (element.isEnabled()) {
			findAnyElement(locator).click();
			findAnyElement(locator).clear();
			findAnyElement(locator).sendKeys(values);
		} else {

		}

	}

	public static void SelectDropdown(By locator, String value) {
		Select oSelect = new Select(CommonElements.CommonHelp.driver.findElement(locator));
		oSelect.selectByVisibleText(value);
		// oSelect.selectByValue(value);
		// oSelect.selectByIndex(18);

	}

	public static void Input_js(By locator, String value1) {
		WebElement wb = driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("arguments[0].value=''",wb);

		// jse.executeScript("arguments[0].value='" + new String(value1) + "'", wb);
		// TypeInField(locator, value1);
		// jse.executeScript("document.getElementById('password').value='Sk@123';");
		// getElementById
		jse.executeScript("arguments[0].value='" + new String(value1) + "'", wb);
		wb.click();

	}

	// Function to enter text into text box after checking if it is Empty
	public static void enterValuesIntoEmptyTB(By locator, String values) {

		String TextBoxValue = findAnyElement(locator).getAttribute("value");
		if (TextBoxValue.isEmpty()) {
			findAnyElement(locator).click();
			findAnyElement(locator).sendKeys(values);
		}

	}

	// Function to Click Element
	public static void clickOnElement(By locator) {
		findAnyElement(locator).click();
	}

//		 Function to Click isSelected
//			public static boolean isSelected(By locator) {
//				return findAnyElement(locator).isSelected();
//			}

	// Function to Click on Element by JavaScript Executor
	public static void clickOnElement_JS(By locator) {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", findAnyElement(locator));
	}

	// Function to Scroll down till page end
	public static void scrollToPageHeight() {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// Function to Top of the Screen
	public static void scrollToPageTop() {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 0)");
	}

	// Function to Scroll till the element appears in view
	public static void scrollToElementView(By locator) {
		WebElement viewElement = CommonHelp.findAnyElement(locator);
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView()", viewElement);

	}

	public static void scrollToPageDown() {
		jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 1000)");
	}

	// public static void clickOnElement_JSwithID(By id){
	// jsExecutor=(JavascriptExecutor)driver;
	// jsExecutor.executeScript("document.getElementById(id).click()");
	// }

	// Function to check if Element is Displayed
	public static boolean checkElementDisplayed(By locator) {
		return findAnyElement(locator).isDisplayed();
	}

	// Function to Check if Element is Enabled
	public static boolean checkElementEnabled(By locator) {
		return findAnyElement(locator).isEnabled();
	}

	// Function to Select CheckBox
	public static void selectCheckBox(By locator) {
		if (findAnyElement(locator).isSelected()) {

			System.out.println("Targeted Check Box is already Checked.");
		} else {
			findAnyElement(locator).click();
			System.out.println("Targeted Check Box is Checked.");
		}
	}

//		public static boolean isCheckBoxSelected(By locator) {
//			
//			if (findAnyElement(locator).isSelected()) {
//				System.out.println("Targeted Check Box is Not Checked.");
//				findAnyElement(locator).click();
//				return false;
//			} else {
//				System.out.println("Targeted Check Box is already Checked.");
//				return true;
//			}
//		}
	//

	// Function to Deselect CheckBox
	public void deselectCheckBox(By locator) {
		if (findAnyElement(locator).isSelected()) {
			findAnyElement(locator).click();
		} else {
			System.out.println("Targeted Check Box is already Unchecked.");
		}
	}

	// Function to get Text from Element
	public String getTextfromElement(By locator) {
		return findAnyElement(locator).getText();
	}

	// Function to Navigate to New Page
	public void navigateToNewPage(String NewURL) {
		driver.navigate().to(NewURL);
	}

	// Function to Refresh the Page
	public void refreshPage() {
		driver.navigate().refresh();
	}

	// Function to check if Element is Present
	public void checkElementPresent(By locator) {
		if (findAnyElement(locator).getSize() != null) {
		} else {
			System.out.println("Element is not Present.");
		}
	}

	// Function to get the Text of the Web Element
	public static String getTextofElement(By locator) {
		return findAnyElement(locator).getText();
	}

	public static String GetAttribute(By locator) {
		WebElement TargetElement = driver.findElement(locator);

		String getValue = TargetElement.getAttribute("value");
		System.out.println("getvalue" + getValue);
		return getValue;

	}

	// Function to check if Element is Present with Boolean condition
	public static boolean isElementPresent(By locator) {
		try {
			findAnyElement(locator);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Function to Check if Text Present on the page
	public static void checkTextPresent(String Text) {
//			if (driver.getPageSource().contains(Text)) {
//				System.out.println("text 123");
//			} else {
//				System.out.println("Searched  Text is not presnet.");
//			}
//			
//			String S1, S2 = null;
//			S1 = CommonHelper.driver.findElement(By.id("nameInput")).getText();
//			if(S1 != null && !S1.isEmpty())
//			{
//				CommonHelper.enterValues(null, S2);
//				System.out.println("text S111");
//			}
//			else
//				{
//				System.out.println("text S1222");
//				}

	}

	// Function to Check if the element present with Fluent Wait
//		public static void checkElementPresentwithWait(By WaitingForElement_Xpath) {
//			fwait = new FluentWait<WebDriver>(driver).withTimeout(15, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS)
//					.ignoring(NoSuchElementException.class);
//			fwait.until(ExpectedConditions.presenceOfElementLocated((WaitingForElement_Xpath)));
//		}

	// Function to Check if Java Script Page has Loaded Complete
	public void waitforJSPageToLoad() {
		fwait.until(new Function<WebDriver, Boolean>() {
			// Boolean isPageLoaded= Boolean.FALSE;
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return.document.readyState").equals("complete");
			}
		});

	}

	public static void getElementFromListAndClick(By UL_locator, String ElementTagName, String TextAsData) {
		// CommonHelper.enterValues(TB_locator, values);
		WebElement elements = driver.findElement(UL_locator);
		List<WebElement> listElements = elements.findElements(By.tagName(ElementTagName));
		for (WebElement e : listElements) {
			String TextInElement = e.getText();
			if (TextInElement.equals(TextAsData)) {
				e.click();
				break;
			}
		}
	}

	// Function to Enter values on search text area and select from the List
	public static void enterSearchValueAndSelect(By TB_locator, By UL_locator, String ElementTagName,
			String TextAsData) {
		CommonHelp.enterValues(TB_locator, TextAsData);
		WebElement elements = driver.findElement(UL_locator);
		List<WebElement> listElements = elements.findElements(By.tagName(ElementTagName));
		for (WebElement e : listElements) {
			try {
				Thread.sleep(500);
				String TextInElement = e.getText();
				if (TextInElement.equals(TextAsData)) {
					e.click();
					break;
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	// Function To Remove ReadOnly property from field.
	public static void removeReadOnly(By locator) {
		WebElement removeAttribute = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')",
				removeAttribute);

	}

	// Function to get Todays Date
	public static String todayDate() {
		String TodayDate = dateFormat.format(date);
		return TodayDate;

	}

	public static void type(By xpath, String value) {
		driver.findElement(xpath).sendKeys(value);
	}

	public static void TypeInField(By xpath, String value) {
		String val = value;
		WebElement element = driver.findElement((xpath));
		element.clear();

		for (int i = 0; i < val.length(); i++) {
			char c = val.charAt(i);
			String s = new StringBuilder().append(c).toString();

			// new WebDriverWait(driver,
			// 1000).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(xpath));
			// driver.findElement(By.id("checkoutLink")).click();

			element.sendKeys(s);

			System.out.print(s);

		}
	}

	public static String tomorrowDats() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		date1 = cal.getTime();
		String TomorrowsDate = dateFormat.format(date1);
		return TomorrowsDate;
	}

	// Function to Select Soruce
	public static void setSelectedValue() {
		Object selectObj = ((JavascriptExecutor) driver)
				.executeScript("$('#ddlLeadSource').val($('#ddlLeadSource option:first').val());");
	}

	public static void selectSoruce(String Source) {
		String abc = "$('#ddlLeadSource').val($('#ddlLeadSource option:contains(" + Source + ")').val())";
		Object selectObj = ((JavascriptExecutor) driver).executeScript(abc);
	}

	// Function to Check the Checkbox if Not Selected
	public static void JS_CheckCBifNotSelected(By locator) {
		WebElement checkedBox = driver.findElement(locator);
		if (checkedBox.isSelected()) {

		} else {
			jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", findAnyElement(locator));
		}
	}

	// Function to Un-Check the check box if it is selected
	public static void JS_UncheckCBifSelected(By locator) {
		WebElement Checkbox = driver.findElement(locator);
		if (Checkbox.isSelected()) {
			jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", findAnyElement(locator));
		} else {

		}
	}

	public static void Select_Item_list(By locator, String Itemvalue) {

		WebElement countryUL = driver.findElement(locator);
		List<WebElement> countriesList = countryUL.findElements(By.tagName("li"));
		for (WebElement li : countriesList) {
			System.out.println(li.getText());
			if (li.getText().equals(Itemvalue)) {
				li.click();
			}
		}
	}

	public static void clearElement(By locator) {
		findAnyElement(locator).clear();
	}

	public static void SelectDateFromCalender(By locator) throws InterruptedException {
		String Month = "April";
		String Year = "2022";
		Thread.sleep(2000);
		try {
			List<WebElement> text = driver.findElements(By.xpath("//tbody//tr"));
			int tdata = text.size();
			System.out.println(tdata);
		} catch (Exception e) {

		}
		driver.close();
	}

	public static void uploadfile(By xpath, String value) {

		WebElement element = driver.findElement((xpath));

		// new WebDriverWait(driver,
		// 1000).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(xpath));
		// driver.findElement(By.id("checkoutLink")).click();

		element.sendKeys(value);

		// System.out.print(value);

	}

	public static void downpage(By locator) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(Keys.PAGE_DOWN);
	}

}
