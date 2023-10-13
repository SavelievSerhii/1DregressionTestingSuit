package pages.base;

import elements.base.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import utility.Constant;

import java.util.NoSuchElementException;
import java.util.Set;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public BaseElements elements;

    public BasePage(WebDriver driver, WebDriverWait wait, BaseElements elements) {
        this.driver = driver;
        this.wait = wait;
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void openPage(String url) {
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
    }

    /*****************************WAITS*****************************/

    public void waitForJSToBeLoaded() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    public WebElement waitElementIsVisible(WebElement element) {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void waitForJQueryToBeLoaded() {
        wait.until(webDriver -> (Long) ((JavascriptExecutor) driver)
                .executeScript("return jQuery.active") == 0);
    }

    /*****************************INTERACTIONS WITH ELEMENTS ON THE PAGE*****************************/
    public WebElement clickOnElementIfReady(WebElement element) {
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitElementIsVisible(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return element;
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public boolean isElementPresent(By element) {
        boolean bool = false;
        if (driver.findElements(element).size() != 0) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public WebElement jsScroll(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

    public  void jsScrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public WebElement jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        return element;
    }

    public void switchToNewWindow() {
        Set<String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[1]);
    }

    public void switchToDefaultWindow() {
        Set <String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[0]);
    }

    public void switchToFrame(WebElement element) {
        waitElementIsVisible(element);
        driver.switchTo().frame(element);
    }

    public WebElement waitForElementContainsText(WebElement element, String text) {
        waitForJSToBeLoaded();
        wait.until(ExpectedConditions.textToBePresentInElement(element, text.trim()));
        return element;
    }

    public void dragSlider(WebElement element, int xCoordinate, int yCoordinate) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element, xCoordinate, yCoordinate).perform();
    }

    /*****************************PAUSES*****************************/

    public void makePause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /*****************************LOAD PAGE*****************************/

    public void login(String login, String password) {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);

    }

    /*****************************WORKING WITH FILES OF THE PROJECT*****************************/


    public String sikuliPatternsOSSelector() {
        String OSVersion = System.getProperty("os.name");
        String sikuliPattern = null;
        if (OSVersion.equals(Constant.SikuliPatternsForWin10.WINDOWS_10_NAME)) {
            sikuliPattern = Constant.PathsForFilesOfProject.PROJECT_SIKULI_PATTERNS_WIN10;
        } else if (OSVersion.equals(Constant.SikuliPatternsForWin7.WINDOWS_7_NAME)) {
            sikuliPattern = Constant.PathsForFilesOfProject.PROJECT_SIKULI_PATTERNS_WIN7;
        }
        return sikuliPattern;
    }

    public void uploadFileWithHelpOfSikuli(String path) {
        Screen screen = new Screen();
        Pattern uploadInputField = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.UPLOAD_INPUT_FIELD);
        Pattern uploadButton = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.UPLOAD_OPEN_BUTTON);
        try {
            screen.wait(uploadInputField, 5);
            screen.type(uploadInputField, path);
            screen.click(uploadButton);
        } catch (FindFailed e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

//    public void downloadFileWishHelpOfSikuli(String path) {
//        Screen screen = new Screen();
//        Pattern downloadInputField = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.DOWNLOAD_INPUT_FIELD);
//        Pattern downloadSaveButton = new Pattern(sikuliPatternsOSSelector() + Constant.SikuliPatternsForWin10.DOWNLOAD_SAVE_BUTTON);
//        try {
//            screen.wait(downloadInputField, 5);
//            screen.type(downloadInputField, path);
//            screen.click(downloadSaveButton);
//
//        } catch (FindFailed e) {
//            throw new NoSuchElementException(e.getMessage());
//        }
//    }

}
