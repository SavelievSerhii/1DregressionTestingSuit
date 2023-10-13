package pages.changePassword;

import elements.changePassword.ChangePasswordPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class ChangePasswordPage extends BasePage {

    ChangePasswordPageElements elements;
    public ChangePasswordPage(WebDriver driver, WebDriverWait wait, ChangePasswordPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void verifyChangePasswordPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Change Password' link
        waitElementIsVisible(elements.changePasswordLink);
        clickOnElementIfReady(elements.changePasswordLink);
        waitForJSToBeLoaded();

        //check the title of the page
        waitElementIsVisible(elements.changeYourPasswordTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRespondNegative() {
        //click on 'SAVE CHANGES' button
        waitElementIsVisible(elements.saveChangesButtonChangePasswordPage);
        clickOnElementIfReady(elements.saveChangesButtonChangePasswordPage);
        waitForJSToBeLoaded();

        //check password fields change their background color
        String cssValue = waitElementIsVisible(elements.currentPasswordFieldChangePasswordPage).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.newPasswordFieldChangePasswordPage).getCssValue("background-color");
        String cssValue2 = waitElementIsVisible(elements.confirmPasswordFieldChangePasswordPage).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue2, "rgba(255, 183, 183, 1)");
    }


    public void changePassword() {
        //fill all necessary fields
        waitElementIsVisible(elements.currentPasswordFieldChangePasswordPage).clear();
        clickOnElementIfReady(elements.currentPasswordFieldChangePasswordPage).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.newPasswordFieldChangePasswordPage).clear();
        clickOnElementIfReady(elements.newPasswordFieldChangePasswordPage).sendKeys(Constant.Credentials.NEW_PASSWORD);

        waitElementIsVisible(elements.confirmPasswordFieldChangePasswordPage).clear();
        clickOnElementIfReady(elements.confirmPasswordFieldChangePasswordPage).sendKeys(Constant.Credentials.NEW_PASSWORD);

        //click on 'SAVE CHANGES' button
        waitElementIsVisible(elements.saveChangesButtonChangePasswordPage);
        clickOnElementIfReady(elements.saveChangesButtonChangePasswordPage);
        waitForJSToBeLoaded();
    }
}
