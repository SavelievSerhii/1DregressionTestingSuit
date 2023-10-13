package pages.sampleCart;

import elements.sampleCart.SampleCartPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class SampleCartPage extends BasePage {

    SampleCartPageElements elements;
    public SampleCartPage(WebDriver driver, WebDriverWait wait, SampleCartPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void getToSampleCart() {
            //find and click on sample cart icon on home page
            hoverOverElement(elements.cartIcon);
            waitElementIsVisible(elements.sampleCartIcon);
            clickOnElementIfReady(elements.sampleCartIcon);
            waitForJSToBeLoaded();

            //check that sample cart is loaded without issues
            waitElementIsVisible(elements.sampleCartTitle);
            makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkSampleConfiguratorIsLoaded() {
        waitElementIsVisible(elements.sampleCartConfiguratorTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkMissingInformationSampleConfiguratorNegative() {
        //click on 'ADD TO SAMPLES CART' button
        jsScrollDown();
        clickOnElementIfReady(elements.addToSamplesCartButton);
        waitForJSToBeLoaded();

        //click on cross button of modal window
        waitElementIsVisible(elements.missingInformationModalWindowCrossButton);
        clickOnElementIfReady(elements.missingInformationModalWindowCrossButton);
        waitForJSToBeLoaded();

        //check background color is appropriate
        String cssValue = waitElementIsVisible(elements.orderDueDateField).getCssValue("background-color");
        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");

        //click on 'Order Due Date' input field
        waitElementIsVisible(elements.orderDueDateField);
        clickOnElementIfReady(elements.orderDueDateField);
        waitForJSToBeLoaded();


        //choose date
        while (!elements.datePickerSwitch.getText().contains("September 2023")) {
            waitElementIsVisible(elements.nextMonthButton);
            clickOnElementIfReady(elements.nextMonthButton);
        }

        int counter = elements.daysToPick.size();
        for (int i = 0; i < counter - 1; i++) {
            String text = elements.daysToPick.get(i).getText();
            if (text.equalsIgnoreCase("20")) {
                elements.daysToPick.get(i).click();
            }
        }

        //click on 'ADD TO SAMPLES CART' button
        jsScrollDown();
        clickOnElementIfReady(elements.addToSamplesCartButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button of modal window
        waitElementIsVisible(elements.missingInformationModalWindowOkButton);
        clickOnElementIfReady(elements.missingInformationModalWindowOkButton);
        waitForJSToBeLoaded();

        //check 'I agree to Deluxe's free sample policy
        waitElementIsVisible(elements.agreeToDeluxeFreeSamplePolicy);
        clickOnElementIfReady(elements.agreeToDeluxeFreeSamplePolicy);

        //click on 'ADD TO SAMPLES CART' button
        jsScrollDown();
        clickOnElementIfReady(elements.addToSamplesCartButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.sampleCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRemoveButton() {
        //click on 'Remove' button
        waitElementIsVisible(elements.sampleCartRemoveButton);
        clickOnElementIfReady(elements.sampleCartRemoveButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.removeModalWindowCrossButton);
        clickOnElementIfReady(elements.removeModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'Remove' button
        waitElementIsVisible(elements.sampleCartRemoveButton);
        clickOnElementIfReady(elements.sampleCartRemoveButton);
        waitForJSToBeLoaded();

        //click on 'Cancel' button
        waitElementIsVisible(elements.removeModalWindowCancelButton);
        clickOnElementIfReady(elements.removeModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'Remove' button
        waitElementIsVisible(elements.sampleCartRemoveButton);
        clickOnElementIfReady(elements.sampleCartRemoveButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.removeModalWindowOkButton);
        clickOnElementIfReady(elements.removeModalWindowOkButton);
        waitForJSToBeLoaded();

        //refresh the page
        hoverOverElement(elements.cartIcon);
        clickOnElementIfReady(elements.sampleCartIcon);

        //find and click on sample cart icon on home page
        hoverOverElement(elements.cartIcon);
        String text = waitElementIsVisible(elements.sampleCartCounter).getText();
        String replace = text.replace("(", "").replace(")", "");
        Assert.assertEquals(replace, "0");
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNavigation() {
        waitElementIsVisible(elements.productNameLink);
        clickOnElementIfReady(elements.productNameLink);
        waitForJSToBeLoaded();
    }

    public void fillAllNecessaryFields() {
        //click on 'Order Due Date' input field
        waitElementIsVisible(elements.orderDueDateField);
        clickOnElementIfReady(elements.orderDueDateField);
        waitForJSToBeLoaded();

        //choose date
        while (!elements.datePickerSwitch.getText().contains("September 2023")) {
            waitElementIsVisible(elements.nextMonthButton);
            clickOnElementIfReady(elements.nextMonthButton);
        }

        int counter = elements.daysToPick.size();
        for (int i = 0; i < counter - 1; i++) {
            String text = elements.daysToPick.get(i).getText();
            if (text.equalsIgnoreCase("20")) {
                elements.daysToPick.get(i).click();
            }
        }

        //check 'I agree to Deluxe's free sample policy
        waitElementIsVisible(elements.agreeToDeluxeFreeSamplePolicy);
        clickOnElementIfReady(elements.agreeToDeluxeFreeSamplePolicy);

        //click on 'ADD TO SAMPLES CART' button
        jsScrollDown();
        clickOnElementIfReady(elements.addToSamplesCartButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.sampleCartTitle);
    }

    public void checkReCAPTCHA() {
        //click on 'REQUEST SAMPLES' button
        waitElementIsVisible(elements.requestSamplesButton);
        clickOnElementIfReady(elements.requestSamplesButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //click on 'SUBMIT SAMPLE REQUEST' button
        waitElementIsVisible(elements.submitSampleRequest);
        clickOnElementIfReady(elements.submitSampleRequest);
        waitForJSToBeLoaded();

        //click on cross button on modal window
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'SUBMIT SAMPLE REQUEST' button
        waitElementIsVisible(elements.submitSampleRequest);
        clickOnElementIfReady(elements.submitSampleRequest);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAModalWindowOkButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //checks the modal window is closed
        waitElementIsVisible(elements.submitSampleRequest);
    }

    public void checkReCAPTCHA2() {
        //click on 'SUBMIT SAMPLE REQUEST' button
        waitElementIsVisible(elements.submitSampleRequest);
        clickOnElementIfReady(elements.submitSampleRequest);
        waitForJSToBeLoaded();

        //click on cross button on modal window
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'SUBMIT SAMPLE REQUEST' button
        waitElementIsVisible(elements.submitSampleRequest);
        clickOnElementIfReady(elements.submitSampleRequest);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.reCAPTCHAModalWindowTitle);
        clickOnElementIfReady(elements.reCAPTCHAModalWindowOkButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //checks the modal window is closed
        waitElementIsVisible(elements.submitSampleRequest);
    }


    public void clickOnRequestSamplesButton() {
        waitElementIsVisible(elements.requestSamplesButton);
        clickOnElementIfReady(elements.requestSamplesButton);
        waitForJSToBeLoaded();
    }

    public void chooseSavedShippingAddress() {
        //click on 'Choose a saved shipping address' button
        waitElementIsVisible(elements.chooseASavedShippingAddressButton);
        clickOnElementIfReady(elements.chooseASavedShippingAddressButton);
        waitForJSToBeLoaded();

        //copy a new shipping address
        String newShippingAddress = waitElementIsVisible(elements.newShippingAddress).getText();

        //click on 'Ship to this address' button (the second in a row)
        waitElementIsVisible(elements.shipToThisAddressSecondInARowButton);
        clickOnElementIfReady(elements.shipToThisAddressSecondInARowButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //check 'Shipping Address Updated' appears
        waitElementIsVisible(elements.shippingAddressUpdatedMessage);

        //copy a displayed shipping address
        String displayedShippingAddress = waitElementIsVisible(elements.displayedShippingAddress).getText();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //compare the addresses
        Assert.assertEquals(newShippingAddress, displayedShippingAddress);
    }

    public void chooseNewShippingAddress() {
        waitElementIsVisible(elements.addANewShippingAddressButton);
        clickOnElementIfReady(elements.addANewShippingAddressButton);

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
    }
}
