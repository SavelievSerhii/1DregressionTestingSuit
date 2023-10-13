package pages.changeEmailAddress;

import elements.changeEmailAddress.ChangeEmailAddressPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class ChangeEmailAddressPage extends BasePage {

    ChangeEmailAddressPageElements elements;
    public ChangeEmailAddressPage(WebDriver driver, WebDriverWait wait, ChangeEmailAddressPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void verifyChangeEmailAddressPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Change Email Address' link
        waitElementIsVisible(elements.changeEmailAddressLink);
        clickOnElementIfReady(elements.changeEmailAddressLink);

        //verify 'Change Email Address' page is loaded without nay issues
        waitElementIsVisible(elements.changeEmailAddressTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRespondNegative() {
        //clear email field
        waitElementIsVisible(elements.emailFieldChangeEmailAddress).clear();

        //click on 'SAVE CHANGES'
        waitElementIsVisible(elements.saveChangesButtonChangeEmailAddress);
        clickOnElementIfReady(elements.saveChangesButtonChangeEmailAddress);
        waitForJSToBeLoaded();

        //check password field changes its background color
        String cssValue1 = waitElementIsVisible(elements.emailFieldChangeEmailAddress).getCssValue("background-color");
        String cssValue = waitElementIsVisible(elements.passwordFieldChangeEmailAddress).getCssValue("background-color");
        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        //fill in password fields
        waitElementIsVisible(elements.emailFieldChangeEmailAddress).clear();
        clickOnElementIfReady(elements.emailFieldChangeEmailAddress).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordFieldChangeEmailAddress).clear();
        clickOnElementIfReady(elements.passwordFieldChangeEmailAddress).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        //click on 'SAVE CHANGES'
        waitElementIsVisible(elements.saveChangesButtonChangeEmailAddress);
        clickOnElementIfReady(elements.saveChangesButtonChangeEmailAddress);
        waitForJSToBeLoaded();

        //checks reCAPTCHA modal window
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAModalWindowCrossButton);

        //click on 'SAVE CHANGES'
        waitElementIsVisible(elements.saveChangesButtonChangeEmailAddress);
        clickOnElementIfReady(elements.saveChangesButtonChangeEmailAddress);
        waitForJSToBeLoaded();

        //check reCAPTCHA modal window 'Ok' button
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAOkButton);

        //click on 'Cancel' button
        waitElementIsVisible(elements.cancelButtonChangeEmailAddress);
        clickOnElementIfReady(elements.cancelButtonChangeEmailAddress);
        waitForJSToBeLoaded();

        //check that 'My Account' page is loaded
        waitElementIsVisible(elements.changeEmailAddressLink);
        clickOnElementIfReady(elements.changeEmailAddressLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.changeEmailAddressTitle);
        clickOnElementIfReady(elements.yourAccountBreadCrumbsLink);

        //check that 'My Account' page is loaded
        waitElementIsVisible(elements.changeEmailAddressLink);
    }

    public void checkNavigation() {
        //click on 'Cancel' button
        waitElementIsVisible(elements.cancelButtonChangeEmailAddress);
        clickOnElementIfReady(elements.cancelButtonChangeEmailAddress);
        waitForJSToBeLoaded();

        //check that 'My Account' page is loaded
        waitElementIsVisible(elements.changeEmailAddressLink);
        clickOnElementIfReady(elements.changeEmailAddressLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.changeEmailAddressTitle);
        clickOnElementIfReady(elements.yourAccountBreadCrumbsLink);

        //check that 'My Account' page is loaded
        waitElementIsVisible(elements.changeEmailAddressLink);
        clickOnElementIfReady(elements.changeEmailAddressLink);
        waitForJSToBeLoaded();

        //click on 'Home' link
        waitElementIsVisible(elements.homeBreadCrumbsLink);
        clickOnElementIfReady(elements.homeBreadCrumbsLink);
        waitForJSToBeLoaded();

        //check home page is loaded without any issues
        waitElementIsVisible(elements.homePageMainTitle);
    }
}
