package pages.checkout;

import elements.checkout.CheckoutPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class CheckoutPage extends BasePage {

    CheckoutPageElements elements;
    public CheckoutPage(WebDriver driver, WebDriverWait wait, CheckoutPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void verifyCheckoutIsLoaded() {
        //click on 'Ok' button on the waring pop up window
        waitElementIsVisible(elements.warningPopUpWindow);
        jsClick(elements.warningPopUpWindowOkButton);
        waitForJSToBeLoaded();

        //verify 'Checkout' page is loaded without nay issues
        waitElementIsVisible(elements.checkoutPageTitle);
    }

    public void checkNavigation() {
        //click on 'Ok' button on the waring pop up window
        waitElementIsVisible(elements.warningPopUpWindow);
        jsClick(elements.warningPopUpWindowOkButton);
        waitForJSToBeLoaded();

        //verify 'Checkout' page is loaded without nay issues
        waitElementIsVisible(elements.checkoutPageTitle);

        //click on '<< Back To Cart' link
        waitElementIsVisible(elements.backToCartLink);
        clickOnElementIfReady(elements.backToCartLink);
        waitForJSToBeLoaded();
    }

    public void verifyCheckoutPageIsLoadedFillInAllNecessaryData() {
        //click on 'Ok' button on the warning pop up window
        waitElementIsVisible(elements.warningPopUpWindow);
        jsClick(elements.warningPopUpWindowOkButton);
        waitForJSToBeLoaded();

        //verify 'Checkout' page is loaded without nay issues
        waitElementIsVisible(elements.checkoutPageTitle);

        //select buying reason
        waitElementIsVisible(elements.buyingReasonDropDownMenu);
        clickOnElementIfReady(elements.buyingReasonDropDownMenu);
        clickOnElementIfReady(elements.buyingReasonChoice);

        //fill in discount code
        waitElementIsVisible(elements.discountCodeInput);
        clickOnElementIfReady(elements.discountCodeInput).clear();
        clickOnElementIfReady(elements.discountCodeInput).sendKeys("TESTORDER2017");

        //click on 'Apply Discount' button
        waitElementIsVisible(elements.applyDiscountButton);
        clickOnElementIfReady(elements.applyDiscountButton);
        waitForJSToBeLoaded();
    }

    public void checkPayPalButton() {
        //click on 'PayPal' button
        waitElementIsVisible(elements.paypalButton);
        clickOnElementIfReady(elements.paypalButton);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkGooglePayButton() {
        //click on 'Buy with G Pay' button
        waitElementIsVisible(elements.buyWithGooglePayButton);
        clickOnElementIfReady(elements.buyWithGooglePayButton);

    }

    public void creditCardProcedure() {
        //click on 'CREDIT CARD' button
        waitElementIsVisible(elements.creditCardButton);
        clickOnElementIfReady(elements.creditCardButton);
        waitForJSToBeLoaded();

        //'Credit Card' modal window is loaded without any issues
        waitElementIsVisible(elements.creditCardModalWindow);

        //fill in all necessary fields
        //fill in cardholder name
        waitElementIsVisible(elements.creditCardHolderNameField).clear();
        clickOnElementIfReady(elements.creditCardHolderNameField).sendKeys(Constant.CheckoutData.CARD_HOLDER);

        //fill in card number
        switchToFrame(elements.frameCreditCardNumberField);
        waitElementIsVisible(elements.creditCardNumberField).clear();
        clickOnElementIfReady(elements.creditCardNumberField).sendKeys(Constant.CheckoutData.CARD_NUMBER);
        driver.switchTo().defaultContent();

        //fill in expiration month
        switchToFrame(elements.frameCreditCardExpirationMonthField);
        waitElementIsVisible(elements.creditCardExpirationMonthField).clear();
        clickOnElementIfReady(elements.creditCardExpirationMonthField).sendKeys(Constant.CheckoutData.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        //fill in expiration year
        switchToFrame(elements.frameCreditCardExpirationYearField);
        waitElementIsVisible(elements.creditCardExpirationYearField).clear();
        clickOnElementIfReady(elements.creditCardExpirationYearField).sendKeys(Constant.CheckoutData.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        //fill in CVV code
        switchToFrame(elements.frameCreditCardCVVCodeField);
        waitElementIsVisible(elements.creditCardCVVCodeField).clear();
        clickOnElementIfReady(elements.creditCardCVVCodeField).sendKeys(Constant.CheckoutData.CVV_CODE);
        driver.switchTo().defaultContent();

        //fill in zip code
        switchToFrame(elements.frameZipCodeField);
        waitElementIsVisible(elements.zipCodeField).clear();
        clickOnElementIfReady(elements.zipCodeField).sendKeys(Constant.CheckoutData.ZIP_CODE);
        driver.switchTo().defaultContent();

        //click on 'SUBMIT ORDER' button
        waitElementIsVisible(elements.creditCardSubmitOrderButton);
        clickOnElementIfReady(elements.creditCardSubmitOrderButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.THE_LONGEST_SLEEP);
        waitForJSToBeLoaded();

        //get the order number
        waitElementIsVisible(elements.orderNumberString);
        String orderNumberString = waitElementIsVisible(elements.orderNumberString).getText().trim();
        String[] orderNumberArray = orderNumberString.split(" ");
        String orderNumber = orderNumberArray[3].replace("#", "");
        System.out.println(orderNumber + " " + "(Standard)" + " " + "(Apparel)");

        //click on 'Continue Shopping' button
        waitElementIsVisible(elements.continueShoppingButton);
        clickOnElementIfReady(elements.continueShoppingButton);
        waitForJSToBeLoaded();

        //find 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }

    public void checkCreditCardProcedure() {
        //click on 'CREDIT CARD' button
        waitElementIsVisible(elements.creditCardButton);
        clickOnElementIfReady(elements.creditCardButton);
        waitForJSToBeLoaded();

        //'Credit Card' modal window is loaded without any issues
        waitElementIsVisible(elements.creditCardModalWindow);

        //fill in all necessary fields
        //fill in cardholder name
        waitElementIsVisible(elements.creditCardHolderNameField).clear();
        clickOnElementIfReady(elements.creditCardHolderNameField).sendKeys(Constant.CheckoutData.CARD_HOLDER);

        //fill in card number
        switchToFrame(elements.frameCreditCardNumberField);
        waitElementIsVisible(elements.creditCardNumberField).clear();
        clickOnElementIfReady(elements.creditCardNumberField).sendKeys(Constant.CheckoutData.CARD_NUMBER);
        driver.switchTo().defaultContent();

        //fill in expiration month
        switchToFrame(elements.frameCreditCardExpirationMonthField);
        waitElementIsVisible(elements.creditCardExpirationMonthField).clear();
        clickOnElementIfReady(elements.creditCardExpirationMonthField).sendKeys(Constant.CheckoutData.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        //fill in expiration year
        switchToFrame(elements.frameCreditCardExpirationYearField);
        waitElementIsVisible(elements.creditCardExpirationYearField).clear();
        clickOnElementIfReady(elements.creditCardExpirationYearField).sendKeys(Constant.CheckoutData.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        //fill in CVV code
        switchToFrame(elements.frameCreditCardCVVCodeField);
        waitElementIsVisible(elements.creditCardCVVCodeField).clear();
        clickOnElementIfReady(elements.creditCardCVVCodeField).sendKeys(Constant.CheckoutData.CVV_CODE);
        driver.switchTo().defaultContent();

        //fill in zip code
        switchToFrame(elements.frameZipCodeField);
        waitElementIsVisible(elements.zipCodeField).clear();
        clickOnElementIfReady(elements.zipCodeField).sendKeys(Constant.CheckoutData.ZIP_CODE);
        driver.switchTo().defaultContent();

        //click on cross button
        waitElementIsVisible(elements.creditCardModalWindowCrossButton);
        clickOnElementIfReady(elements.creditCardModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'CREDIT CARD' button again
        waitElementIsVisible(elements.creditCardButton);
        clickOnElementIfReady(elements.creditCardButton);
        waitForJSToBeLoaded();

        //click on 'SUBMIT ORDER' button
        waitElementIsVisible(elements.creditCardSubmitOrderButton);
        clickOnElementIfReady(elements.creditCardSubmitOrderButton);
        waitForJSToBeLoaded();

        //check Whoops message
        waitElementIsVisible(elements.creditCardModalWindowWhoopsMessageContent);

        //fill in expiration month
        switchToFrame(elements.frameCreditCardExpirationMonthField);
        waitElementIsVisible(elements.creditCardExpirationMonthField).clear();
        clickOnElementIfReady(elements.creditCardExpirationMonthField).sendKeys(Constant.CheckoutData.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        //fill in expiration year
        switchToFrame(elements.frameCreditCardExpirationYearField);
        waitElementIsVisible(elements.creditCardExpirationYearField).clear();
        clickOnElementIfReady(elements.creditCardExpirationYearField).sendKeys(Constant.CheckoutData.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        //fill in CVV code
        switchToFrame(elements.frameCreditCardCVVCodeField);
        waitElementIsVisible(elements.creditCardCVVCodeField).clear();
        clickOnElementIfReady(elements.creditCardCVVCodeField).sendKeys(Constant.CheckoutData.CVV_CODE);
        driver.switchTo().defaultContent();

        //click on 'Cancel' button
        waitElementIsVisible(elements.creditCardModalWindowCancelButton);
        clickOnElementIfReady(elements.creditCardModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'CREDIT CARD' button again
        waitElementIsVisible(elements.creditCardButton);
        clickOnElementIfReady(elements.creditCardButton);
        waitForJSToBeLoaded();

        //fill in expiration month
        switchToFrame(elements.frameCreditCardExpirationMonthField);
        waitElementIsVisible(elements.creditCardExpirationMonthField).clear();
        clickOnElementIfReady(elements.creditCardExpirationMonthField).sendKeys(Constant.CheckoutData.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        //fill in expiration year
        switchToFrame(elements.frameCreditCardExpirationYearField);
        waitElementIsVisible(elements.creditCardExpirationYearField).clear();
        clickOnElementIfReady(elements.creditCardExpirationYearField).sendKeys(Constant.CheckoutData.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        //fill in CVV code
        switchToFrame(elements.frameCreditCardCVVCodeField);
        waitElementIsVisible(elements.creditCardCVVCodeField).clear();
        clickOnElementIfReady(elements.creditCardCVVCodeField).sendKeys(Constant.CheckoutData.CVV_CODE);
        driver.switchTo().defaultContent();

        //click on 'SUBMIT ORDER' button
        waitElementIsVisible(elements.creditCardSubmitOrderButton);
        clickOnElementIfReady(elements.creditCardSubmitOrderButton);
        waitForJSToBeLoaded();

        //get the order number
        String orderNumberString = waitElementIsVisible(elements.orderNumberString).getText().trim();
        String[] orderNumberArray = orderNumberString.split(" ");
        String orderNumber = orderNumberArray[3].replace("#", "");
        System.out.println(orderNumber + " " + "(Standard)" + " " + "(Apparel)");

        //click on 'Continue Shopping' button
        waitElementIsVisible(elements.continueShoppingButton);
        clickOnElementIfReady(elements.continueShoppingButton);
        waitForJSToBeLoaded();

        //find 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }

    public void chooseSaveShippingAddress() {
        //click on 'Choose saved shipping address' button
        waitElementIsVisible(elements.chooseSavedShippingAddress);
        clickOnElementIfReady(elements.chooseSavedShippingAddress);
        waitForJSToBeLoaded();

        //copy new address
        String text = waitElementIsVisible(elements.savedShippingAddress).getText();

        //click on 'Ship to this address' button (the second in a row)
        waitElementIsVisible(elements.shipToThisAddressButtonSecondInARow);
        clickOnElementIfReady(elements.shipToThisAddressButtonSecondInARow);
        waitForJSToBeLoaded();

        //click on 'Ok' button on the warning pop up window
        waitElementIsVisible(elements.warningPopUpWindow);
        jsClick(elements.warningPopUpWindowOkButton);
        waitForJSToBeLoaded();

        //verify 'Checkout' page is loaded without nay issues
        waitElementIsVisible(elements.checkoutPageTitle);

        //compare the addresses
        String text1 = waitElementIsVisible(elements.displayedShippingAddress).getText();
        Assert.assertEquals(text, text1);
    }

    public void chooseNewShippingAddress() {
        //click on 'Add a new shipping address' button
        waitElementIsVisible(elements.addNewShippingAddressButton);
        clickOnElementIfReady(elements.addNewShippingAddressButton);
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

        //click on 'Ok' button on the waring pop up window
        waitElementIsVisible(elements.warningPopUpWindow);
        jsClick(elements.warningPopUpWindowOkButton);
        waitForJSToBeLoaded();

        //verify 'Checkout' page is loaded without nay issues
        waitElementIsVisible(elements.checkoutPageTitle);
    }

    public void fillInAllNecessaryData() {
        //select buying reason
        waitElementIsVisible(elements.buyingReasonDropDownMenu);
        clickOnElementIfReady(elements.buyingReasonDropDownMenu);
        clickOnElementIfReady(elements.buyingReasonChoice);

        //fill in discount code
        waitElementIsVisible(elements.discountCodeInput);
        clickOnElementIfReady(elements.discountCodeInput).clear();
        clickOnElementIfReady(elements.discountCodeInput).sendKeys("TESTORDER2017");

        //click on 'Apply Discount' button
        waitElementIsVisible(elements.applyDiscountButton);
        clickOnElementIfReady(elements.applyDiscountButton);
        waitForJSToBeLoaded();
    }
}
