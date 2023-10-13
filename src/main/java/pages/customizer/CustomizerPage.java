package pages.customizer;

import elements.customizer.CustomizerPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class CustomizerPage extends BasePage {

    CustomizerPageElements elements;
    public CustomizerPage(WebDriver driver, WebDriverWait wait, CustomizerPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }



    /*****************************MAIN METHODS*****************************/

    public void verifyCustomizerPageIsLoaded() {
        //check that 'free virtual proof' link is available and click on it
        waitElementIsVisible(elements.freeVirtualProofLink);
        clickOnElementIfReady(elements.freeVirtualProofLink);
        waitForJSToBeLoaded();

        //verify that 'free virtual proof' link works properly
        waitElementIsVisible(elements.helpModalWindowTitle);
        clickOnElementIfReady(elements.helpModalWindowCrossButton);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    /*****************************T-SHIRTS CATEGORY*****************************/

    public void fillAllNecessaryFieldsTShirts() {
        //copy minimum quantity from quantity field
        waitElementIsVisible(elements.quantityField);
        String minQuantity = clickOnElementIfReady(elements.quantityField).getAttribute("value").trim();

        //fill copied value to sizes field
        waitElementIsVisible(elements.sizesQuantityField);
        clickOnElementIfReady(elements.sizesQuantityField).sendKeys(minQuantity);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //choose item color
        waitElementIsVisible(elements.itemColor);
        clickOnElementIfReady(elements.itemColor);

        //choose imprint location
        waitElementIsVisible(elements.imprintLocation);
        clickOnElementIfReady(elements.imprintLocation);

        //choose imprint color
        waitElementIsVisible(elements.imprintColor);
        clickOnElementIfReady(elements.imprintColor);
    }

    public void fillAllNecessaryFieldsCap() {
        //choose item color
        waitElementIsVisible(elements.itemColor);
        clickOnElementIfReady(elements.itemColor);

        //choose imprint location
        waitElementIsVisible(elements.imprintLocation);
        clickOnElementIfReady(elements.imprintLocation);

        //choose imprint color
        waitElementIsVisible(elements.imprintColor);
        clickOnElementIfReady(elements.imprintColor);
    }


    public void addArtworkToProduct() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //click on from upload area
        waitElementIsVisible(elements.formUpload);
        clickOnElementIfReady(elements.formUpload);
        waitForJSToBeLoaded();

        //upload image to the product
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);

        waitElementIsVisible(elements.uploadFileButton);
        clickOnElementIfReady(elements.uploadFileButton);
        waitForJSToBeLoaded();

        //click on 'DONE' button
        waitElementIsVisible(elements.doneButton);
        clickOnElementIfReady(elements.doneButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addArtworkToProductNegative() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //click on from upload area
        waitElementIsVisible(elements.formUpload);
        clickOnElementIfReady(elements.formUpload);
        waitForJSToBeLoaded();

        //upload image to the product
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.EXCEED_LIMIT_IAMGE_PATH);

        //find the artwork file size error label
        waitElementIsVisible(elements.artworkFileSizeErrorLabel);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addArtworkToProductGuest() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //click on 'Continue as Guest' button
        waitElementIsVisible(elements.continueAsGuestButton);
        clickOnElementIfReady(elements.continueAsGuestButton);
        waitForJSToBeLoaded();

        //click on from upload area
        waitElementIsVisible(elements.formUploadGuest);
        clickOnElementIfReady(elements.formUploadGuest);
        waitForJSToBeLoaded();

        //upload image to the product
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);

        waitElementIsVisible(elements.uploadFileGuestButton);
        clickOnElementIfReady(elements.uploadFileGuestButton);
        waitForJSToBeLoaded();

        //click on 'DONE' button
        waitElementIsVisible(elements.doneGuestButton);
        clickOnElementIfReady(elements.doneGuestButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void addClipartToProduct() {
        //click on 'Add Clipart' button
        waitElementIsVisible(elements.addClipartButton);
        clickOnElementIfReady(elements.addClipartButton);
        waitForJSToBeLoaded();

        //click on 'Animals' link
        waitElementIsVisible(elements.animalsLink);
        clickOnElementIfReady(elements.animalsLink);
        waitForJSToBeLoaded();

        //click on the first logo in the row
        waitElementIsVisible(elements.animalLogo);
        clickOnElementIfReady(elements.animalLogo);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addClipartToProductUsingSearchField() {
        //click on 'Add Clipart' button
        waitElementIsVisible(elements.addClipartButton);
        clickOnElementIfReady(elements.addClipartButton);
        waitForJSToBeLoaded();

        //click and fill search field
        waitElementIsVisible(elements.clipartSearchField);
        clickOnElementIfReady(elements.clipartSearchField).sendKeys("tiger");
        clickOnElementIfReady(elements.searchButton);
        waitForJSToBeLoaded();

        //click on the first logo in the row
        waitElementIsVisible(elements.searchResultFirstInRow);
        clickOnElementIfReady(elements.searchResultFirstInRow);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addTextToProduct() {
        //click on 'Add Text' button
        waitElementIsVisible(elements.addTextButton);
        clickOnElementIfReady(elements.addTextButton);
        waitForJSToBeLoaded();

        //fill in some text for testing procedure
        waitElementIsVisible(elements.textFillArea);
        clickOnElementIfReady(elements.textFillArea).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNeedHelpSection() {
        //find and click on email icon in 'Need Help?' section
        waitElementIsVisible(elements.needHelpSectionTitle);
        clickOnElementIfReady(elements.needHelpSectionEmailIcon);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.needHelpContactRequestModalWindowTitle);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowCrossButton);

        //find and click on email icon in 'Need Help?' section
        waitElementIsVisible(elements.needHelpSectionTitle);
        clickOnElementIfReady(elements.needHelpSectionEmailIcon);
        waitForJSToBeLoaded();

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        waitForJSToBeLoaded();

        //check that background's color is appropriate
        String cssValueNameField = clickOnElementIfReady(elements.needHelpContactRequestModalWindowNameField).getCssValue("background-color");
        String cssValueEmailField = clickOnElementIfReady(elements.needHelpContactRequestModalWindowEmailField).getCssValue("background-color");

        Assert.assertEquals(cssValueNameField, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValueEmailField, "rgba(255, 183, 183, 1)");

        clickOnElementIfReady(elements.needHelpContactRequestModalWindowNameField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_NAME);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowEmailField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowPhoneNumberField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_PHONE);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowCompanyNameField).sendKeys(Constant.NewShippingAddressData.COMPANY_NAME);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowCommentsField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        waitForJSToBeLoaded();

        //click on cross button
        clickOnElementIfReady(elements.proveNotARobotCrossButton);

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowSubmitRequestButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        clickOnElementIfReady(elements.proveNotARobotOkButton);

        //check 'Privacy/Security' link
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowPrivacySecurityLink);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.acceptAllCookiesButtonShopAndChecksPage);
        clickOnElementIfReady(elements.acceptAllCookiesButtonShopAndChecksPage);
        waitElementIsVisible(elements.securityPrivacySignInLink);
        driver.close();

        switchToDefaultWindow();

        //click on cross button
        waitElementIsVisible(elements.needHelpContactRequestModalWindowTitle);
        clickOnElementIfReady(elements.needHelpContactRequestModalWindowCrossButton);

        //click on call icon
        waitElementIsVisible(elements.needHelpSectionCallIcon);
        clickOnElementIfReady(elements.needHelpSectionCallIcon);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //close 'Call Us' modal window
        clickOnElementIfReady(elements.callUsModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on chat icon
        waitElementIsVisible(elements.needHelpSectionChatIcon);
        clickOnElementIfReady(elements.needHelpSectionChatIcon);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);

        //switch to live chat auxiliary window and find its title
        switchToFrame(elements.liveChatFrame);
        waitElementIsVisible(elements.liveChatAuxiliaryWindowTitle);

        //minimize liva chat window
        waitElementIsVisible(elements.minimizeLiveChatAuxiliaryWindowButton);
        clickOnElementIfReady(elements.minimizeLiveChatAuxiliaryWindowButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void clickOnAddToCartButton() {
        waitElementIsVisible(elements.addToCartButton);
        jsClick(elements.addToCartButton);
//        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
    }

    public void clickOnAddToQuotesButton() {
        //find and click on 'ADD TO QUOTES' button
        jsScrollDown();
        waitElementIsVisible(elements.addToQuotesButton);
        clickOnElementIfReady(elements.addToQuotesButton);
        waitForJSToBeLoaded();
    }

    public void checkNavigation() {
        //click on product's name link
        waitElementIsVisible(elements.nameOfProductCustomizer);
        clickOnElementIfReady(elements.nameOfProductCustomizer);
        waitForJSToBeLoaded();

        //click cross button on 'Leave Customizer?' modal window
        waitElementIsVisible(elements.leaveCustomizerModalWindowTitle);
        clickOnElementIfReady(elements.leaveCustomizerModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on product's name link
        waitElementIsVisible(elements.nameOfProductCustomizer);
        clickOnElementIfReady(elements.nameOfProductCustomizer);
        waitForJSToBeLoaded();

        //click on 'Cancel and continue customizing' button
        waitElementIsVisible(elements.leaveCustomizerModalWindowTitle);
        clickOnElementIfReady(elements.leaveCustomizerModalWindowCancelButton);

        //click on product's name link
        waitElementIsVisible(elements.nameOfProductCustomizer);
        clickOnElementIfReady(elements.nameOfProductCustomizer);
        waitForJSToBeLoaded();

        //click on 'YES' button
        waitElementIsVisible(elements.leaveCustomizerModalWindowTitle);
        clickOnElementIfReady(elements.leaveCustomizerModalWindowYesButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void fillAllNecessaryFieldsTShirtsNegative() {
        //SIZES
        //click on 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        jsScroll(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.sizesModalWindowCrossButton);
        clickOnElementIfReady(elements.sizesModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.sizesModalWindowOkButton);
        clickOnElementIfReady(elements.sizesModalWindowOkButton);
        waitForJSToBeLoaded();

        //copy minimum quantity from quantity field
        waitElementIsVisible(elements.quantityField);
        String minQuantity = clickOnElementIfReady(elements.quantityField).getAttribute("value").trim();

        //fill copied value to sizes field
        waitElementIsVisible(elements.sizesQuantityField);
        clickOnElementIfReady(elements.sizesQuantityField).sendKeys(minQuantity);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.missingInfoModalWindowCrossButton);
        clickOnElementIfReady(elements.missingInfoModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.missingInfoModalWindowOkButton);
        clickOnElementIfReady(elements.missingInfoModalWindowOkButton);
        waitForJSToBeLoaded();

        //choose item color
        waitElementIsVisible(elements.itemColor);
        clickOnElementIfReady(elements.itemColor);

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.missingInfoModalWindowCrossButton);
        clickOnElementIfReady(elements.missingInfoModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.missingInfoModalWindowOkButton);
        clickOnElementIfReady(elements.missingInfoModalWindowOkButton);
        waitForJSToBeLoaded();

        //choose imprint color
        waitElementIsVisible(elements.imprintColor);
        clickOnElementIfReady(elements.imprintColor);

        //click on 'ADD TO CART' button again
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }


    public void signInViaCustomizer() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //sign in via customizer
        waitElementIsVisible(elements.emailFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaCustomizer).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaCustomizer).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        clickOnElementIfReady(elements.signInViaCustomizerButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.doneButton);
        clickOnElementIfReady(elements.doneButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.nameOfProductCustomizer);
        clickOnElementIfReady(elements.nameOfProductCustomizer);
        waitForJSToBeLoaded();

        clickOnElementIfReady(elements.leaveCustomizerModalWindowYesButton);
        waitForJSToBeLoaded();
    }

    public void signInViaCustomizerNegative() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        clickOnElementIfReady(elements.signInViaCustomizerButton);
        waitForJSToBeLoaded();

        String cssValue = waitElementIsVisible(elements.emailFieldSignInViaCustomizer).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.passwordFieldSignInViaCustomizer).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        //check proper respond while trying to use invalid credentials
        //1st (correct email, incorrect password)
        waitElementIsVisible(elements.emailFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaCustomizer).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaCustomizer).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        //click on 'SIGN IN' button
        clickOnElementIfReady(elements.signInViaCustomizerButton);
        waitForJSToBeLoaded();

        //check warning message appears
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);

        //2nd (incorrect email, correct password)
        waitElementIsVisible(elements.emailFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaCustomizer).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaCustomizer).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        //click on 'SIGN IN' button
        clickOnElementIfReady(elements.signInViaCustomizerButton);
        waitForJSToBeLoaded();

        //check warning message appears
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);

        //3rd (incorrect email, incorrect password)
        waitElementIsVisible(elements.emailFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaCustomizer).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordFieldSignInViaCustomizer).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaCustomizer).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        //click on 'SIGN IN' button
        clickOnElementIfReady(elements.signInViaCustomizerButton);
        waitForJSToBeLoaded();

        //check warning message appears
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);
    }

    public void checkSignInViaCustomizerButtonsAreWorkable() {
        //click 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //check 'Sign in using Facebook' button
        waitElementIsVisible(elements.signInUsingFacebookViaCustomizerVButton);
        clickOnElementIfReady(elements.signInUsingFacebookViaCustomizerVButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.acceptCookiesButtonFacebook);

        driver.close();

        switchToDefaultWindow();

        //check 'Sign in using 'Google' button
        waitElementIsVisible(elements.signInUsingGoogleViaCustomizerButton);
        clickOnElementIfReady(elements.signInUsingGoogleViaCustomizerButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.emailFieldGoogle);

        driver.close();

        switchToDefaultWindow();
    }
}
