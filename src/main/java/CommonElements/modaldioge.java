package CommonElements;

import org.openqa.selenium.WebDriver;

public class modaldioge {


    public static void waitForWindow(WebDriver driver)
            throws InterruptedException {
        //wait until number of window handles become 2 or until 6 seconds are completed.
        int timecount = 1;
        do {
            driver.getWindowHandles();
            Thread.sleep(200);
            timecount++;
            if (timecount > 30) {
                break;
            }
        } while (driver.getWindowHandles().size() != 2);

    }

    public static void switchToModalDialog(WebDriver driver, String parent) { 
            //Switch to Modal dialog
        if (driver.getWindowHandles().size() == 2) {
            for (String window : driver.getWindowHandles()) {
                if (!window.equals(parent)) {
                    driver.switchTo().window(window);
                    System.out.println("Modal dialog found");
                    break;
                }
            }
        }
    }
}
