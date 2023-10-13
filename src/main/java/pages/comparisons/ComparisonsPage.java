package pages.comparisons;


import elements.comparisons.ComparisonsPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class ComparisonsPage extends BasePage {

    ComparisonsPageElements elements;
    public ComparisonsPage(WebDriver driver, WebDriverWait wait, ComparisonsPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void getToComparisonsPage() {
        //click on 'Comparisons' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.comparisonsLink);
        clickOnElementIfReady(elements.comparisonsLink);
        waitForJSToBeLoaded();

        //wait for 'Comparisons' page to be loaded
        waitElementIsVisible(elements.comparisonsPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNavigationBreadcrumb() {
        //click on 'Home' link in breadcrumb
        waitElementIsVisible(elements.homeBreadcrumbLink);
        clickOnElementIfReady(elements.homeBreadcrumbLink);
        waitForJSToBeLoaded();

        //check Home page is loaded
        waitElementIsVisible(elements.homePageMainTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNavigationProductNameLink() {
        //click on product's name link
        String text = waitElementIsVisible(elements.productNameLink).getText();
        clickOnElementIfReady(elements.productNameLink);
        waitForJSToBeLoaded();

        //check PDP of correspondent product is loaded
        String text1 = waitElementIsVisible(elements.productNamePDP).getText();
        Assert.assertEquals(text, text1);

        //click on 'Comparisons' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.comparisonsLink);
        clickOnElementIfReady(elements.comparisonsLink);
        waitForJSToBeLoaded();

        //wait for 'Comparisons' page to be loaded
        waitElementIsVisible(elements.comparisonsPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on product's image/link
        String text2 = waitElementIsVisible(elements.productNameLink).getText();
        clickOnElementIfReady(elements.productImageLink);
        waitForJSToBeLoaded();

        //check PDP of correspondent product is loaded
        String text3 = waitElementIsVisible(elements.productNamePDP).getText();
        Assert.assertEquals(text2, text3);
    }

    public void checkShareButtonFunctionality() {
        //click on share icon
        waitElementIsVisible(elements.shareLinkIcon);
        clickOnElementIfReady(elements.shareLinkIcon);
        waitForJSToBeLoaded();

        //click on cross  button on modal window
        waitElementIsVisible(elements.shareLinkModalWindowTitle);
        clickOnElementIfReady(elements.shareLinkModalWindowCrossButton);

        //click on share icon
        waitElementIsVisible(elements.shareLinkIcon);
        clickOnElementIfReady(elements.shareLinkIcon);
        waitForJSToBeLoaded();

        //click on 'Close' button on modal window
        waitElementIsVisible(elements.shareLinkModalWindowTitle);
        clickOnElementIfReady(elements.shareLinkModalWindowCloseButton);

        //click on share icon
        waitElementIsVisible(elements.shareLinkIcon);
        clickOnElementIfReady(elements.shareLinkIcon);
        waitForJSToBeLoaded();


//        //navigate using the link
//        waitElementIsVisible(elements.shareLinkModalWindowTitle);

        //click on cross  button on modal window
        waitElementIsVisible(elements.shareLinkModalWindowTitle);
        clickOnElementIfReady(elements.shareLinkModalWindowCrossButton);

    }

    public void checkEmailButtonFunctionality() {
        //click on envelope icon
        waitElementIsVisible(elements.envelopeIcon);
        clickOnElementIfReady(elements.envelopeIcon);
        waitForJSToBeLoaded();

        //click on cross button
        clickOnElementIfReady(elements.emailModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on envelope icon
        waitElementIsVisible(elements.envelopeIcon);
        clickOnElementIfReady(elements.envelopeIcon);
        waitForJSToBeLoaded();

        //check respond
        waitElementIsVisible(elements.emailModalWindowYourEmailField).clear();
        waitElementIsVisible(elements.emailModalWindowFriendEmailField).clear();

        clickOnElementIfReady(elements.emailModalWindowSendEmail);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        String cssValue = waitElementIsVisible(elements.emailModalWindowYourEmailField).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.emailModalWindowFriendEmailField).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        waitElementIsVisible(elements.emailModalWindowFriendEmailLabel);
        waitElementIsVisible(elements.emailModalWindowYourEmailLabel);

        //check CAPTCHA
        waitElementIsVisible(elements.emailModalWindowFriendEmailField).clear();
        clickOnElementIfReady(elements.emailModalWindowFriendEmailField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);

        waitElementIsVisible(elements.emailModalWindowYourEmailField).clear();
        clickOnElementIfReady(elements.emailModalWindowYourEmailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        clickOnElementIfReady(elements.emailModalWindowSendEmail);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        waitElementIsVisible(elements.recaptchaModalWindowTitle);
        clickOnElementIfReady(elements.recaptchaModalWindowCrossButton);

        clickOnElementIfReady(elements.emailModalWindowSendEmail);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        waitElementIsVisible(elements.recaptchaModalWindowTitle);
        clickOnElementIfReady(elements.recaptchaModalWindowOkButton);
        clickOnElementIfReady(elements.emailModalWindowCrossButton);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRemoveButton() {
        //click on 'Remove' link
        waitElementIsVisible(elements.removeLink);
        clickOnElementIfReady(elements.removeLink);

        //click on 'Comparisons' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.comparisonsLink);
        clickOnElementIfReady(elements.comparisonsLink);
        waitForJSToBeLoaded();

        //wait for sign to change
        String text = waitElementIsVisible(elements.canAdd6ItemsForCompare).getText();
        Assert.assertEquals(text, "You can add 6 item(s) for compare.");
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }
}
