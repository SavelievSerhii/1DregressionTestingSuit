package pages.billingInformation;

import elements.billingInformation.BillingInformationPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import utility.Constant;

public class BillingInformationPage extends BasePage {

    BillingInformationPageElements elements;
    public BillingInformationPage(WebDriver driver, WebDriverWait wait, BillingInformationPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/
    public void verifyBillingInformationPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Billing Information' link
        waitElementIsVisible(elements.billingInformationLink);
        clickOnElementIfReady(elements.billingInformationLink);
        waitForJSToBeLoaded();

        //verify 'Manage Contact Information' page is loaded
        waitElementIsVisible(elements.manageContactInformationTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void editBillingInformation() {
        //edit name of the company
        waitElementIsVisible(elements.companyNameFieldManageContactInformationPage).clear();
        clickOnElementIfReady(elements.companyNameFieldManageContactInformationPage).sendKeys("gfl");

        //click on 'SAVE CHANGES' button
        clickOnElementIfReady(elements.saveChangesButtonManageContactInformationPage);
        waitForJSToBeLoaded();

        //wait for modal window
        waitElementIsVisible(elements.successInformationMessageModalWindow);

        //click on 'Back to My Account' button
        clickOnElementIfReady(elements.backToMyAccountButtonModalWindow);
        waitForJSToBeLoaded();

        //wait for 'Billing Information' link to appear
        waitElementIsVisible(elements.billingInformationLink);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkManageContactInformationNavigation() {
        //click on 'Cancel' button
        waitElementIsVisible(elements.cancelButtonManageContactInformationPage);
        clickOnElementIfReady(elements.cancelButtonManageContactInformationPage);
        waitForJSToBeLoaded();

        //click on 'Billing Information' link
        waitElementIsVisible(elements.billingInformationLink);
        clickOnElementIfReady(elements.billingInformationLink);
        waitForJSToBeLoaded();

        //click on 'Your Account' breadcrumb link
        clickOnElementIfReady(elements.yourAccountBreadcrumbLink);
        waitForJSToBeLoaded();

        //click on 'Billing Information' link
        waitElementIsVisible(elements.billingInformationLink);
        clickOnElementIfReady(elements.billingInformationLink);
        waitForJSToBeLoaded();

        //click on 'Home' breadcrumb link
        clickOnElementIfReady(elements.homeBreadcrumbLink);
        waitForJSToBeLoaded();

        //verify 'Home' page is loaded
        waitElementIsVisible(elements.homePageMainTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }
}
