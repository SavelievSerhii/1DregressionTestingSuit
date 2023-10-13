package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverWaitHelper {
    /**
     * @param iWait       - implicit wait
     * @param eWait       - explicit wait
     * @param pollingTime - the interval taken between checking expected conditions. Default - FIVE_HUNDRED_MILLIS.
     */

    //works with selenium 4.x.x

//    public static WebDriverWait generateWaits(WebDriver driver, int iWait, int eWait, int pollingTime) {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(iWait));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(eWait));
//        wait.pollingEvery(Duration.ofSeconds(pollingTime));
//        wait.ignoring(NoSuchElementException.class);
//        wait.ignoring(Exception.class);
//        wait.ignoring(WebDriverException.class);
//        wait.ignoring(ElementClickInterceptedException.class);
//        wait.ignoring(StaleElementReferenceException.class);
//        return wait;
//    }

    //works with selenium 3.x.x

    public static WebDriverWait generateWaits(WebDriver driver, int iWait, int eWait, int pollingTime) {
        driver.manage().timeouts().implicitlyWait(iWait, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, eWait);
        wait.pollingEvery(pollingTime, TimeUnit.SECONDS);
        wait.ignoring(NoSuchElementException.class);
//        wait.ignoring(Exception.class);
//        wait.ignoring(WebDriverException.class);
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(ElementClickInterceptedException.class);
//        wait.ignoring(StaleElementReferenceException.class);
        return wait;
    }
}
