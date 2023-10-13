package pages.quoteCart;

import elements.quoteCart.QuoteCartPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class QuoteCartPage extends BasePage {

    QuoteCartPageElements elements;
    public QuoteCartPage(WebDriver driver, WebDriverWait wait, QuoteCartPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }



    /*****************************MAIN METHODS*****************************/

    public void getToQuoteCartFromPreQuotePage() {
        //make sure that we are on preQuote cart page
        waitElementIsVisible(elements.viewQuoteCartButton);

        //click on 'View Quote Cart' button
        clickOnElementIfReady(elements.viewQuoteCartButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.quoteCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNavigationQuotePrePage() {
        //make sure that we are on preQuote cart page
        waitElementIsVisible(elements.viewQuoteCartButton);

        //checks 'Continue Shopping' button
        clickOnElementIfReady(elements.continueShoppingButton);
        waitForJSToBeLoaded();
        //get back
        waitElementIsVisible(elements.homePageMainTitle);
        driver.navigate().back();

        //checks product name link
        waitElementIsVisible(elements.productNameLink);
        clickOnElementIfReady(elements.productNameLink);
        waitForJSToBeLoaded();
        //get back
        driver.navigate().back();

        //checks 'View Quote Cart' button
        waitElementIsVisible(elements.viewQuoteCartButton);
        clickOnElementIfReady(elements.viewQuoteCartButton);
        waitForJSToBeLoaded();
        //get back
        waitElementIsVisible(elements.quoteCartTitle);
        driver.navigate().back();

        //checks 'COMPLETE REQUEST' button
        waitElementIsVisible(elements.completeRequestButton);
        clickOnElementIfReady(elements.completeRequestButton);
        waitForJSToBeLoaded();
    }

    public void verifyRequestCheckoutIsLoaded() {
        waitElementIsVisible(elements.modalWindowOkButton);
        clickOnElementIfReady(elements.modalWindowOkButton);
        waitElementIsVisible(elements.requestQuoteCheckoutPageTitle);
    }

    public void requestQuote() {
        //click on 'Your Buying Reason' drop down menu
        waitElementIsVisible(elements.yourBuyingReasonDropDown);
        clickOnElementIfReady(elements.yourBuyingReasonDropDown);
        waitForJSToBeLoaded();

        //choose buying reason
        clickOnElementIfReady(elements.chooseBuyingReason);

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.submitQuoteRequestButton);
        clickOnElementIfReady(elements.submitQuoteRequestButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.VERY_LONG_SLEEP);

        //wait for the quote order to place
        waitElementIsVisible(elements.thankYouSign);
        makePause(Constant.TimeoutVariable.THE_LONGEST_SLEEP);
    }

    public void getToQuoteCart() {
        //find and click on shopping cart icon on home page
        hoverOverElement(elements.cartIcon);
        waitElementIsVisible(elements.quoteCartIcon);
        clickOnElementIfReady(elements.quoteCartIcon);
        waitForJSToBeLoaded();

        //check that quote cart is loaded without issues
        waitElementIsVisible(elements.quoteCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRemoveButton() {
        //click on 'Remove' button
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.removeProductFromQuoteCartTitle);
        clickOnElementIfReady(elements.removeProductFromQuoteCartCrossButton);

        //click on 'Remove' button
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on 'Cancel' button
        waitElementIsVisible(elements.removeProductFromQuoteCartTitle);
        clickOnElementIfReady(elements.removeProductFromQuoteCartCancelButton);

        //click on 'Remove' button
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.removeProductFromQuoteCartTitle);
        clickOnElementIfReady(elements.removeProductFromQuoteCartOkButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkModifyButton() {
        waitElementIsVisible(elements.modifyButton);
        clickOnElementIfReady(elements.modifyButton);
        waitForJSToBeLoaded();
    }

    public void clickOnCompleteRequestButton() {
        waitElementIsVisible(elements.completeRequestButton);
        clickOnElementIfReady(elements.completeRequestButton);
        waitForJSToBeLoaded();
    }

    public void chooseSavedShippingAddress() {
        //check validation address message appears
        String text = waitElementIsVisible(elements.validateNewShippingAddressInformationMessageTitle).getText();
        Assert.assertEquals(text, "We couldn't verify your address. Please make sure it's correct before you enter it.");
        clickOnElementIfReady(elements.validateNewShippingAddressInformationMessageOkButton);
        waitForJSToBeLoaded();

        //click on 'Choose a saved shipping address' button
        waitElementIsVisible(elements.chooseASavedShippingAddressButton);
        clickOnElementIfReady(elements.chooseASavedShippingAddressButton);
        waitForJSToBeLoaded();

        //copy a new shipping address
        String newShippingAddress = waitElementIsVisible(elements.newShippingAddress).getText();

        //click on 'Ship to this address' button (the second in a row)
        clickOnElementIfReady(elements.shipToThisAddressSecondInARowButton);
        waitForJSToBeLoaded();

//        //check that information message appears
//        waitElementIsVisible(elements.shippingAddressUpdatedInformationMessage);

        //check information message appears
        String informationMessageTitle = waitElementIsVisible(elements.validateNewShippingAddressInformationMessageTitle).getText();
        Assert.assertEquals(informationMessageTitle, "We couldn't verify your address. Please make sure it's correct before you enter it.");

        clickOnElementIfReady(elements.validateNewShippingAddressInformationMessageOkButton);
        waitForJSToBeLoaded();

        //copy the displayed shipping address
        String shippingAddressDisplayed = waitElementIsVisible(elements.shippingAddressDisplayed).getText();

        //compare two addresses to be the same
        Assert.assertEquals(newShippingAddress, shippingAddressDisplayed);
    }

    public void chooseNewShippingAddressPlaceOrder() {
        //check validation address message appears
        String text = waitElementIsVisible(elements.validateNewShippingAddressInformationMessageTitle).getText();
        Assert.assertEquals(text, "We couldn't verify your address. Please make sure it's correct before you enter it.");
        clickOnElementIfReady(elements.validateNewShippingAddressInformationMessageOkButton);
        waitForJSToBeLoaded();

        //click on 'Add a new shipping address' button
        waitElementIsVisible(elements.addANewShippingAddressButton);
        clickOnElementIfReady(elements.addANewShippingAddressButton);
        waitForJSToBeLoaded();

        //fill in all necessary fields
        waitElementIsVisible(elements.addNewShippingAddressFirstNameField).clear();
        clickOnElementIfReady(elements.addNewShippingAddressFirstNameField).sendKeys(Constant.NewShippingAddressData.FIRST_NAME);

        waitElementIsVisible(elements.addNewShippingAddressLastNameField).clear();
        clickOnElementIfReady(elements.addNewShippingAddressLastNameField).sendKeys(Constant.NewShippingAddressData.LAST_NAME);

        waitElementIsVisible(elements.addNewShippingAddressCompanyName).clear();
        clickOnElementIfReady(elements.addNewShippingAddressCompanyName).sendKeys(Constant.NewShippingAddressData.COMPANY_NAME);

        waitElementIsVisible(elements.addNewShippingAddressAddress).clear();
        clickOnElementIfReady(elements.addNewShippingAddressAddress).sendKeys(Constant.NewShippingAddressData.ADDRESS_1);

        waitElementIsVisible(elements.addNewShippingAddressCity).clear();
        clickOnElementIfReady(elements.addNewShippingAddressCity).sendKeys(Constant.NewShippingAddressData.CITY_NAME);

        waitElementIsVisible(elements.addNewShippingAddressState);
        clickOnElementIfReady(elements.addNewShippingAddressState);
        clickOnElementIfReady(elements.addNewShippingAddressSelectState);

        waitElementIsVisible(elements.addNewShippingAddressZipCode).clear();
        clickOnElementIfReady(elements.addNewShippingAddressZipCode).sendKeys(Constant.NewShippingAddressData.ZIP_CODE);

        waitElementIsVisible(elements.saveShippingAddressCheckBox);
        clickOnElementIfReady(elements.saveShippingAddressCheckBox);

        //check validation address message appears
        String text1 = waitElementIsVisible(elements.validateNewShippingAddressInformationMessageTitle).getText();
        Assert.assertEquals(text1, "We couldn't verify your address. Please make sure it's correct before you enter it.");
        clickOnElementIfReady(elements.validateNewShippingAddressInformationMessageOkButton);
        waitForJSToBeLoaded();


    }
}
