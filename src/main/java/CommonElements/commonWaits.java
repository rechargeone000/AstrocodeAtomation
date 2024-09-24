package CommonElements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseTestclass;

public class commonWaits extends CommonHelp {

public static WebDriverWait driverwait ;


//	public Wait wait;
	//Function of Implicit Wait
	public static void implicitWait(){
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	//Function of Explicit Wait 
	public static void explicitWaittoClick(By locator){
		driverwait= new WebDriverWait(driver, Duration.ofSeconds(2000));
		driverwait.until(ExpectedConditions.elementToBeClickable(findAnyElement(locator)));
		
	}
	
	//IMPORTANT Function of Explicit Wait 
		public static void explicitWaittoElementVisible(By locator){
			driverwait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		}
	
	public static void waitTillElementVisible(By locator){
		driverwait= new WebDriverWait(driver, Duration.ofSeconds(10000));
		driverwait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	//Function of Explicitly Wait untill Element is not visible
//	public static void 
	
	//Function of Explicit Wait for Element to be Present 
		public static WebElement explicitWaitforElementPresent(By locator, Duration timeOut){
			WebElement visibleElement= findAnyElement(locator);
			driverwait= new WebDriverWait(driver, timeOut);
			driverwait.until(ExpectedConditions.visibilityOfElementLocated((By) visibleElement));
			return  visibleElement;
		}
	
	//Function of Fluent wait
//		public static void fluentWait(final By locator){
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//				public WebElement apply(WebDriver driver){
//					return driver.findElement(locator);
//				}
//			});
//			     
//	}
		
		//Function to Wait Untill Page load. 
//		public void waitForLoad(WebDriver driver) {
//		        ExpectedConditions<Boolean> pageLoadCondition = new ExpectedConditions<Boolean>() {
//		public boolean waitToPageLoad(WebDriver driver){
//			return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
//			
//					}
//		        }
//		        
//		}
	
	//Function to Wait Untill page to load
//	public Boolean waitPageToLoad(WebDriver driver){
//		
//		return String
//                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
//                .equals("complete");
//		
//		}
//	
//	//IMPORTANT Function to Wait for page to load
//	public static void waitForPageToLoad(){
//	
//		 Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
//		    wait.until(new Function<WebDriver, Boolean>() {
//		        public Boolean apply(WebDriver driver) {
//		            System.out.println("Current Window State       : "
//		                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
//		            return String
//		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
//		                .equals("complete");
//		        }
//		    });
//		}
//	
//	
//	//Function to wait for the page to load
//	public static void waitForPageLoad(WebDriver driver) {
//        ExpectedCondition<Boolean> pageLoadCondition = new
//                ExpectedCondition<Boolean>() {
//                    public Boolean apply(WebDriver driver) {
//                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
//                    }
//                };
//        		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2000));
//        wait.until(pageLoadCondition);
//    }
}
	

