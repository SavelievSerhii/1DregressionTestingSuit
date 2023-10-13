package pages.shippingAddresses;

import elements.base.BaseElements;
import elements.shippingAddresses.ShippingAddressesPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class ShippingAddressesPage extends BasePage {

    ShippingAddressesPageElements elements;
    public ShippingAddressesPage(WebDriver driver, WebDriverWait wait, ShippingAddressesPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/
    public void verifyShippingAddressesPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Shipping Addresses' link
        waitElementIsVisible(elements.shippingAddressesLink);
        clickOnElementIfReady(elements.shippingAddressesLink);
        waitForJSToBeLoaded();

        //check 'Shipping Addresses' page is loaded without any issues
        waitElementIsVisible(elements.manageShippingAddressesTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void editAddress() {
        //click on 'Edit' button
        waitElementIsVisible(elements.editButtonShippingAddresses);
        clickOnElementIfReady(elements.editButtonShippingAddresses);
        waitForJSToBeLoaded();

        //wait 'Edit Shipping Address' window is opened
        waitElementIsVisible(elements.editShippingAddressTitle);

        //fill in other company's name
        waitElementIsVisible(elements.companyFieldEditShippingAddress).clear();
        clickOnElementIfReady(elements.companyFieldEditShippingAddress).sendKeys("General Electric");

        //click on 'SAVE CHANGES' button
        clickOnElementIfReady(elements.saveChangesButtonEditShippingAddress);
        waitForJSToBeLoaded();

        //click on 'Back to Your Addresses' button
        waitElementIsVisible(elements.editSuccessModalWindowTitle);
        clickOnElementIfReady(elements.backToYourAddressesButton);
        waitForJSToBeLoaded();

        //check 'Shipping Addresses' page is loaded without any issues
        waitElementIsVisible(elements.manageShippingAddressesTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkEditShippingAddressesNavigation() {
        //click on 'Edit' button
        waitElementIsVisible(elements.editButtonShippingAddresses);
        clickOnElementIfReady(elements.editButtonShippingAddresses);
        waitForJSToBeLoaded();

        //wait 'Edit Shipping Address' window is opened
        waitElementIsVisible(elements.editShippingAddressTitle);

        //click on 'Cancel' button on 'Edit Shipping Address' page
        waitElementIsVisible(elements.cancelButtonEditShippingAddress);
        clickOnElementIfReady(elements.cancelButtonEditShippingAddress);
        waitForJSToBeLoaded();

        //wait 'Manage Shipping Address' window is opened
        waitElementIsVisible(elements.manageShippingAddressesTitle);

        //click on 'Edit' button
        waitElementIsVisible(elements.editButtonShippingAddresses);
        clickOnElementIfReady(elements.editButtonShippingAddresses);
        waitForJSToBeLoaded();

        //wait 'Edit Shipping Address' window is opened
        waitElementIsVisible(elements.editShippingAddressTitle);

        //click 'Your Account' bread crumb
        clickOnElementIfReady(elements.yourAccountLinkEditShippingAddress);
        waitForJSToBeLoaded();

        //click on 'Shipping' Addresses' link on 'Your Profile' page
        waitElementIsVisible(elements.shippingAddressesLink);
        clickOnElementIfReady(elements.shippingAddressesLink);
        waitForJSToBeLoaded();

        //click on 'Edit' button
        waitElementIsVisible(elements.editButtonShippingAddresses);
        clickOnElementIfReady(elements.editButtonShippingAddresses);
        waitForJSToBeLoaded();

        //wait 'Edit Shipping Address' window is opened
        waitElementIsVisible(elements.editShippingAddressTitle);

        //check 'Home' link
        clickOnElementIfReady(elements.homeLinkEditShippingAddress);
        waitForJSToBeLoaded();

        //check 'Home' page is loaded
        waitElementIsVisible(elements.homePageMainTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkAddNewAddressProcedure() {
        //click on '+NEW ADDRESS' button
        clickOnElementIfReady(elements.addNewAddressButton);
        waitForJSToBeLoaded();

        //check 'New Shipping Address' page is opened
        waitElementIsVisible(elements.newShippingAddressTitle);

        //fill all fields
        //address label field
        clickOnElementIfReady(elements.addressLabelField).sendKeys(Constant.NewShippingAddressData.ADDRESS_LABEL);

        //choose USA from drop down menu
        clickOnElementIfReady(elements.countryIDDropDown);
        clickOnElementIfReady(elements.chooseUSAFromDropDownMenu);

        //first name
        clickOnElementIfReady(elements.firstNameField).sendKeys(Constant.NewShippingAddressData.FIRST_NAME);

        //last name
        clickOnElementIfReady(elements.lastNameField).sendKeys(Constant.NewShippingAddressData.LAST_NAME);

        //company name
        clickOnElementIfReady(elements.companyNameField).sendKeys(Constant.NewShippingAddressData.COMPANY_NAME);

        //address
        clickOnElementIfReady(elements.addressField).sendKeys(Constant.NewShippingAddressData.ADDRESS_1);

        //city
        clickOnElementIfReady(elements.cityField).sendKeys(Constant.NewShippingAddressData.CITY_NAME);

        //state
        clickOnElementIfReady(elements.stateIDField);
        clickOnElementIfReady(elements.chooseTexasFromDropDown);

        //zip
        clickOnElementIfReady(elements.zipCodeField).sendKeys(Constant.NewShippingAddressData.ZIP_CODE);

        //click on 'SAVE CHANGES'
        clickOnElementIfReady(elements.saveChangesButtonEditShippingAddress);
        waitForJSToBeLoaded();

        //click on 'Back to Your Addresses' button
        clickOnElementIfReady(elements.backToYourAddressesButton);

        //check 'Manage Shipping Address' page is loaded
        waitElementIsVisible(elements.manageShippingAddressesTitle);
    }

    public void deleteNewAddress() {
        //click on 'Delete' button (second in the row)
        waitElementIsVisible(elements.deleteSecondInTheRowProduct);
        clickOnElementIfReady(elements.deleteSecondInTheRowProduct);
        waitForJSToBeLoaded();

        //click on cross button of modal window
        clickOnElementIfReady(elements.deleteModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'Delete' button (second in the row)
        waitElementIsVisible(elements.deleteSecondInTheRowProduct);
        clickOnElementIfReady(elements.deleteSecondInTheRowProduct);
        waitForJSToBeLoaded();

        //click on 'Cancel' button on modal window
        clickOnElementIfReady(elements.deleteModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'Delete' button (second in the row)
        waitElementIsVisible(elements.deleteSecondInTheRowProduct);
        clickOnElementIfReady(elements.deleteSecondInTheRowProduct);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        clickOnElementIfReady(elements.deleteModalWindowOkButton);
        waitForJSToBeLoaded();

        //check that 'Address Removed' was deleted successfully
        waitElementIsVisible(elements.addressRemovedInformationMessage);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkAddNewAddressProcedureNegative() {
        //click on '+NEW ADDRESS' button
        clickOnElementIfReady(elements.addNewAddressButton);
        waitForJSToBeLoaded();

        //check 'New Shipping Address' page is opened
        waitElementIsVisible(elements.newShippingAddressTitle);

        //click on 'SAVE CHANGES'
        clickOnElementIfReady(elements.saveChangesButtonEditShippingAddress);
        waitForJSToBeLoaded();

        //check that background color of correspondent fields is changed
        String cssValue = waitElementIsVisible(elements.countryIDDropDown).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.firstNameField).getCssValue("background-color");
        String cssValue2 = waitElementIsVisible(elements.lastNameField).getCssValue("background-color");
        String cssValue3 = waitElementIsVisible(elements.addressField).getCssValue("background-color");
        String cssValue4 = waitElementIsVisible(elements.cityField).getCssValue("background-color");
        String cssValue5 = waitElementIsVisible(elements.zipCodeField).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue2, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue3, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue4, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue5, "rgba(255, 183, 183, 1)");
    }

    public void manageShippingAddressNavigation() {
        //click on 'Cancel' button on 'Manage Shipping Address' page
        waitElementIsVisible(elements.cancelButtonManageShippingAddressPage);
        clickOnElementIfReady(elements.cancelButtonManageShippingAddressPage);
        waitForJSToBeLoaded();

        //check 'Your Profile' page is loaded and click on 'Shipping Addresses' link
        waitElementIsVisible(elements.shippingAddressesLink);
        clickOnElementIfReady(elements.shippingAddressesLink);
        waitForJSToBeLoaded();

        //click on 'Your Account' link in breadcrumb
        clickOnElementIfReady(elements.yourAccountLinkEditShippingAddress);
        waitForJSToBeLoaded();

        //check 'Your Profile' page is loaded and click on 'Shipping Addresses' link
        waitElementIsVisible(elements.shippingAddressesLink);
        clickOnElementIfReady(elements.shippingAddressesLink);
        waitForJSToBeLoaded();

        //click on 'Home' link in breadcrumb
        clickOnElementIfReady(elements.homeLinkEditShippingAddress);
        waitForJSToBeLoaded();

        //verify Home page is loaded
        waitElementIsVisible(elements.homePageMainTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }
}
