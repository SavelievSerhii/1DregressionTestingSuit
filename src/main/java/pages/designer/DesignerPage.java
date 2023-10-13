package pages.designer;

import elements.base.BaseElements;
import elements.designer.DesignerPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class DesignerPage extends BasePage {

    DesignerPageElements elements;


    public DesignerPage(WebDriver driver, WebDriverWait wait, DesignerPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void verifyDesignerPageIsLoaded() {
        waitElementIsVisible(elements.volumePricingButton);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }


    public void addArtworkToProduct() {
        //find and click on 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //click on form upload
        clickOnElementIfReady(elements.formUploadDropZone);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //upload file using Sikuli patterns (Sikuli dependency)
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);

        //check that artwork is on product
        waitElementIsVisible(elements.artworkOnProduct);
        clickOnElementIfReady(elements.artworkOnProduct);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addArtworkToProductNegative() {
        //find and click on 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //click on form upload
        clickOnElementIfReady(elements.formUploadDropZone);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //upload file using Sikuli patterns (Sikuli dependency)
        //checks proper respond when size limit is exceeded
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.EXCEED_LIMIT_IAMGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);

        //check respond
        waitElementIsVisible(elements.artworkFileSizeErrorLabel);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

//        //click on form upload
//        clickOnElementIfReady(elements.formUploadDropZone);
//        waitForJSToBeLoaded();
//        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
//
//        //upload file of wrong extension
//        //check proper respond
//        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.WRONG_FORMAT_IMAGE_PATH);
//        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
//        waitForJSToBeLoaded();
//        makePause(Constant.TimeoutVariable.LONG_SLEEP);
//
//        //check respond
//        waitElementIsVisible(elements.artworkFileExtensionErrorLabel);
//        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addClipartToProduct() {
        //find and click on 'Add Clipart' button
        waitElementIsVisible(elements.addClipartButton);
        clickOnElementIfReady(elements.addClipartButton);
        waitForJSToBeLoaded();

        //find and click on 'Animals' link
        waitElementIsVisible(elements.animalsLink);
        clickOnElementIfReady(elements.animalsLink);
        waitForJSToBeLoaded();

        //find and click on animal logo
        waitElementIsVisible(elements.animalLogo);
        clickOnElementIfReady(elements.animalLogo);
        waitForJSToBeLoaded();

        //check that artwork is on product
        waitElementIsVisible(elements.artworkOnProduct);
        clickOnElementIfReady(elements.artworkOnProduct);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void addClipartToProductUsingSearchField() {
        //find and click on 'Add Clipart' button
        waitElementIsVisible(elements.addClipartButton);
        clickOnElementIfReady(elements.addClipartButton);
        waitForJSToBeLoaded();

        //
        waitElementIsVisible(elements.searchClipartField).clear();
        clickOnElementIfReady(elements.searchClipartField).sendKeys("bird");
        clickOnElementIfReady(elements.searchButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.firstImageInARowSearch);
        clickOnElementIfReady(elements.firstImageInARowSearch);
        waitForJSToBeLoaded();
    }

    public void addTextToProduct() {
        //find and click on 'Add Text' button
        waitElementIsVisible(elements.addTextButton);
        clickOnElementIfReady(elements.addTextButton);
        waitForJSToBeLoaded();

        //find and interfere with text area
        waitElementIsVisible(elements.modifyingTextArea);
        clickOnElementIfReady(elements.modifyingTextArea).clear();
        clickOnElementIfReady(elements.modifyingTextArea).sendKeys(Constant.CheckoutData.CARD_HOLDER);

        //make the text curve
        waitElementIsVisible(elements.curveTextButton);
        clickOnElementIfReady(elements.curveTextButton);
        waitForJSToBeLoaded();

        //check that artwork is on product
        waitElementIsVisible(elements.artworkOnProduct);
        clickOnElementIfReady(elements.artworkOnProduct);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void chooseDifferentItemColor() {
        //find and click on item colors drop down list
        waitElementIsVisible(elements.itemColorButton);
        clickOnElementIfReady(elements.itemColorButton);
        waitForJSToBeLoaded();

        //click on the second color in drop down menu
        waitElementIsVisible(elements.itemColorSecondInRow);
        clickOnElementIfReady(elements.itemColorSecondInRow);
        waitForJSToBeLoaded();
    }

    public void fillAllNecessaryFields() {
//        waitElementIsVisible(elements.volumePricingButton);
//        clickOnElementIfReady(elements.volumePricingButton);
//        waitForJSToBeLoaded();
//
//        waitElementIsVisible(elements.chooseSecondQuantityInRow);
//        clickOnElementIfReady(elements.chooseSecondQuantityInRow);
//        waitForJSToBeLoaded();

        //get and copy minimum quantity of items
        String quantity = waitElementIsVisible(elements.quantityField).getAttribute("value").trim();

        //fill in minimum quantity to size field
        waitElementIsVisible(elements.sizesField);
        clickOnElementIfReady(elements.sizesField).clear();
        clickOnElementIfReady(elements.sizesField).sendKeys(quantity);

        //fill in imprint color
        waitElementIsVisible(elements.imprintColorField);
        clickOnElementIfReady(elements.imprintColorField).sendKeys("Pinkish");
    }

    public void fillAllNecessaryFieldsHats() {
        //fill in imprint color
        waitElementIsVisible(elements.imprintColorField);
        clickOnElementIfReady(elements.imprintColorField).sendKeys("Pinkish");
    }

    public void fillAllNecessaryFieldsNegative() {
        //click 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //wait and find info message
        waitElementIsVisible(elements.missingInfoMessage);
        clickOnElementIfReady(elements.missingInfoCrossButton);

        //click 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click 'Ok' button
        waitElementIsVisible(elements.missingInfoMessage);
        clickOnElementIfReady(elements.missingInfoOkButton);

        //check that background color changed properly (when wasn't filled in)
        waitElementIsVisible(elements.imprintColorField);
        String cssValueBackgroundColor = clickOnElementIfReady(elements.imprintColorField).getCssValue("background-color");

        //compare the background color with reference value
        Assert.assertEquals(cssValueBackgroundColor, "rgba(255, 183, 183, 1)");

        //fill in imprint color
        waitElementIsVisible(elements.imprintColorField);
        clickOnElementIfReady(elements.imprintColorField).sendKeys("Pinkish");

        //click 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //check the error message
        waitElementIsVisible(elements.orderQuantityAndSizeRequestedMessageContent);
        clickOnElementIfReady(elements.orderQuantityAndSizeRequestedMessageCrossButton);

        //click 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //check the error message
        waitElementIsVisible(elements.orderQuantityAndSizeRequestedMessageContent);
        clickOnElementIfReady(elements.orderQuantityAndSizeRequestedMessageOkButton);

        //check respond to inappropriate symbols
        clickOnElementIfReady(elements.sizesField).clear();
        waitElementIsVisible(elements.sizesField).sendKeys("s");
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.missingInfoMessage2);
        waitElementIsVisible(elements.missingInfoOnlyDigitsMessage);
        clickOnElementIfReady(elements.missingInfoCrossButton);
        waitForJSToBeLoaded();

        //check that background color changed properly (when wasn't filled in)
        String cssValueBackgroundColorSizeField = clickOnElementIfReady(elements.sizesField).getCssValue("background-color");

        //compare the background color with reference value
        Assert.assertEquals(cssValueBackgroundColorSizeField, "rgba(255, 183, 183, 1)");

        //check respond to inappropriate symbols
        clickOnElementIfReady(elements.sizesField).clear();
        waitElementIsVisible(elements.sizesField).sendKeys("#");
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.missingInfoMessage2);
        waitElementIsVisible(elements.missingInfoOnlyDigitsMessage);
        clickOnElementIfReady(elements.missingInfoOkButton);
        waitForJSToBeLoaded();

        //check that background color changed properly (when wasn't filled in)
        String cssValueBackgroundColorSizeField2 = clickOnElementIfReady(elements.sizesField).getCssValue("background-color");

        //compare the background color with reference value
        Assert.assertEquals(cssValueBackgroundColorSizeField2, "rgba(255, 183, 183, 1)");

        //get and copy minimum quantity of items
        String quantity = waitElementIsVisible(elements.quantityField).getAttribute("value").trim();

        //fill in minimum quantity to size field
        waitElementIsVisible(elements.sizesField);
        clickOnElementIfReady(elements.sizesField).clear();
        clickOnElementIfReady(elements.sizesField).sendKeys(quantity);
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

    public void checkProductLinkNavigation() {
        //click on name of product link
        waitElementIsVisible(elements.nameOfProductLink);
        clickOnElementIfReady(elements.nameOfProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on cross button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on name of product link
        waitElementIsVisible(elements.nameOfProductLink);
        clickOnElementIfReady(elements.nameOfProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on 'Cancel' button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on name of product link
        waitElementIsVisible(elements.nameOfProductLink);
        clickOnElementIfReady(elements.nameOfProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on 'Ok' button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowOkButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkBackToProductLink() {
        //click on 'Back to Product' link
        waitElementIsVisible(elements.backToProductLink);
        clickOnElementIfReady(elements.backToProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on cross button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'Back to Product' link
        waitElementIsVisible(elements.backToProductLink);
        clickOnElementIfReady(elements.backToProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on 'Cancel' button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'Back to Product' link
        waitElementIsVisible(elements.backToProductLink);
        clickOnElementIfReady(elements.backToProductLink);
        waitForJSToBeLoaded();

        //check modal window and click on 'Ok' button
        waitElementIsVisible(elements.leaveDesignerModalWindowMessage);
        clickOnElementIfReady(elements.leaveDesignerModalWindowOkButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkLetUsDoItForYouLink() {
        //click on 'Let us do it for you' link
        waitElementIsVisible(elements.letUsDoItForYouLink);
        clickOnElementIfReady(elements.letUsDoItForYouLink);
        waitForJSToBeLoaded();

        //click on cross button on 'Let us do it for you' modal window
        waitElementIsVisible(elements.letUsDoItForYouModalWindowTitle);
        clickOnElementIfReady(elements.letUsDoItForYouLinkModalWindowCrossButton);

        //click on 'Let us do it for you' link
        waitElementIsVisible(elements.letUsDoItForYouLink);
        clickOnElementIfReady(elements.letUsDoItForYouLink);
        waitForJSToBeLoaded();

        //click on 'Cancel' button on 'Let us do it for you' modal window
        waitElementIsVisible(elements.letUsDoItForYouModalWindowTitle);
        clickOnElementIfReady(elements.letUsDonItForYouModalWindowCancelButton);

        //click on 'Let us do it for you' link
        waitElementIsVisible(elements.letUsDoItForYouLink);
        clickOnElementIfReady(elements.letUsDoItForYouLink);
        waitForJSToBeLoaded();

        //click on 'YES' button on 'Let us do it for you' modal window
        waitElementIsVisible(elements.letUsDoItForYouModalWindowTitle);
        clickOnElementIfReady(elements.letUsDoItForYouModalWindowYesButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.nameOfProductLinkCustomizer);
        clickOnElementIfReady(elements.nameOfProductLinkCustomizer);
        waitForJSToBeLoaded();

        //click on 'YES' button on 'Let us do it for you' modal window
        clickOnElementIfReady(elements.letUsDoItForYouModalWindowYesButton);
        waitForJSToBeLoaded();
    }

    public void checkDownloadButtonsFunctionality() {
        //click on 'DOWNLOAD' button
        waitElementIsVisible(elements.downloadButton);
        clickOnElementIfReady(elements.downloadButton);
        waitForJSToBeLoaded();

        //click on cross button of 'Download Image' modal window
        waitElementIsVisible(elements.downloadImageModalWindowTitle);
        clickOnElementIfReady(elements.downloadImageModalWindowCrossButton);

        //click on 'DOWNLOAD' button
        waitElementIsVisible(elements.downloadButton);
        clickOnElementIfReady(elements.downloadButton);
        waitForJSToBeLoaded();

        //click on 'DOWNLOAD' button of 'Download Image' modal window
        waitElementIsVisible(elements.downloadImageModalWindowTitle);
        clickOnElementIfReady(elements.downloadImageModalWindowDownloadButton);
        waitForJSToBeLoaded();

        //download a file
//        downloadFileWishHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_DOWNLOAD_PATH);

        //click on cross button of 'Download Image' modal window
        waitElementIsVisible(elements.downloadImageModalWindowTitle);
        clickOnElementIfReady(elements.downloadImageModalWindowCrossButton);
    }

    public void checkPrintButtonFunctionality() {
        //click on 'Print' button
        jsScrollDown();
        waitElementIsVisible(elements.printButton);
        clickOnElementIfReady(elements.printButton);

        switchToNewWindow();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        driver.close();

        switchToDefaultWindow();
    }

    public void clickOnAddToCartButton() {
        //click 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);
    }

    public void signInViaDesigner() {
        //find and click on 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //sign in via designer
        waitElementIsVisible(elements.signInViaDesignerButton);
        clickOnElementIfReady(elements.signInViaDesignerButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.emailFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaDesigner).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaDesigner).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.signInViaDesignerButton2);
        clickOnElementIfReady(elements.signInViaDesignerButton2);
        waitForJSToBeLoaded();

        //click on cross button of add an artwork window
        waitElementIsVisible(elements.addArtworkWindowCrossButton);
        clickOnElementIfReady(elements.addArtworkWindowCrossButton);
        waitForJSToBeLoaded();

        //click on '<<Back to product' link
        waitElementIsVisible(elements.backToProductLink);
        clickOnElementIfReady(elements.backToProductLink);
        waitForJSToBeLoaded();

        //click on 'Ok' button on modal window
        waitElementIsVisible(elements.leaveDesignerModalWindowOkButton);
        clickOnElementIfReady(elements.leaveDesignerModalWindowOkButton);
        waitForJSToBeLoaded();
    }

    public void signInViaDesignerNegative() {
        //find and click on 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //sign in via designer
        waitElementIsVisible(elements.signInViaDesignerButton);
        clickOnElementIfReady(elements.signInViaDesignerButton);
        waitForJSToBeLoaded();

        //click on 'SIGN IN' button
        waitElementIsVisible(elements.signInViaDesignerButton2);
        clickOnElementIfReady(elements.signInViaDesignerButton2);
        waitForJSToBeLoaded();

        //check background changes for the email and password fields
        String cssValue = waitElementIsVisible(elements.emailFieldSignInViaDesigner).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.passwordFieldSignInViaDesigner).getCssValue("background-color");
        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        //check proper respond while trying to use invalid credentials
        //1st (correct email, incorrect password)
        waitElementIsVisible(elements.emailFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaDesigner).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaDesigner).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        //click on 'SIGN IN' button
        waitElementIsVisible(elements.signInViaDesignerButton2);
        clickOnElementIfReady(elements.signInViaDesignerButton2);
        waitForJSToBeLoaded();

        //check warning message
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);

        //2nd (incorrect email, correct password)
        waitElementIsVisible(elements.emailFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaDesigner).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaDesigner).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        //click on 'SIGN IN' button
        waitElementIsVisible(elements.signInViaDesignerButton2);
        clickOnElementIfReady(elements.signInViaDesignerButton2);
        waitForJSToBeLoaded();

        //check warning message
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);

        //3rd (incorrect email, incorrect password)
        waitElementIsVisible(elements.emailFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.emailFieldSignInViaDesigner).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordFieldSignInViaDesigner).clear();
        clickOnElementIfReady(elements.passwordFieldSignInViaDesigner).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        //click on 'SIGN IN' button
        waitElementIsVisible(elements.signInViaDesignerButton2);
        clickOnElementIfReady(elements.signInViaDesignerButton2);
        waitForJSToBeLoaded();

        //check warning message
        waitElementIsVisible(elements.emailOrPasswordIsIncorrectLabel);
    }

    public void checkSignInViaDesignerButtonsAreWorkable() {
        //find and click on 'Add Artwork' button
        waitElementIsVisible(elements.addArtworkButton);
        clickOnElementIfReady(elements.addArtworkButton);
        waitForJSToBeLoaded();

        //sign in via designer
        waitElementIsVisible(elements.signInViaDesignerButton);
        clickOnElementIfReady(elements.signInViaDesignerButton);
        waitForJSToBeLoaded();

        //check 'Sign in using Facebook'
        waitElementIsVisible(elements.signInUsingFacebookViaDesignerButton);
        clickOnElementIfReady(elements.signInUsingFacebookViaDesignerButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.acceptCookiesButtonFacebook);

        driver.close();

        switchToDefaultWindow();

        //check 'Sign in using Google'
        waitElementIsVisible(elements.signInUsingGoogleViaDesignerButton);
        clickOnElementIfReady(elements.signInUsingGoogleViaDesignerButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.emailFieldGoogle);

        driver.close();

        switchToDefaultWindow();

        //check 'Forgot Password?' link
        waitElementIsVisible(elements.forgotPasswordViaDesignerLink);
        clickOnElementIfReady(elements.forgotPasswordViaDesignerLink);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.forgotPasswordPageTitle);

        driver.close();

        switchToDefaultWindow();
    }
}
