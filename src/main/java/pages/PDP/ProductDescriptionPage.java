package pages.PDP;

import elements.PDP.ProductDescriptionPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

import java.util.List;

public class ProductDescriptionPage extends BasePage {

    ProductDescriptionPageElements elements;


    public ProductDescriptionPage(WebDriver driver, WebDriverWait wait, ProductDescriptionPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void getToPDPApparelDesigner() {
        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));

        for (int i = 0; i < productsOnPLP.size(); i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            makePause(Constant.TimeoutVariable.SHORT_SLEEP);
            waitForJSToBeLoaded();

            if (!isElementPresent(elements.designerButtonLocator)) {
                driver.navigate().back();
            } else  break;
        }
        waitForJSToBeLoaded();
    }

    public void getToPDPApparelCustomizer() {
        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));

        for (int i = 0; i < productsOnPLP.size(); i++) {
            try
            {
                waitElementIsVisible(productsOnPLP.get(i));
            }
            catch (StaleElementReferenceException e)
            {
                productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));
                waitElementIsVisible(productsOnPLP.get(i));
            }
            clickOnElementIfReady(productsOnPLP.get(i));
            makePause(Constant.TimeoutVariable.SHORT_SLEEP);
            waitForJSToBeLoaded();

            if (!isElementPresent(elements.customizerButtonLocator)) {
                driver.navigate().back();
            } else  break;
        }
        waitForJSToBeLoaded();
    }

    public void checkNeedMoreLink() {
        //check 'Setup Fee' icon
        hoverOverElement(elements.setupFeeIcon);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on 'Need More?' link
        waitElementIsVisible(elements.needMoreLink);
        clickOnElementIfReady(elements.needMoreLink);
        waitForJSToBeLoaded();

        //pop up window appears
        waitElementIsVisible(elements.needMorePopWindowTitle);

        //check close button works properly
        waitElementIsVisible(elements.largeQuantityCloseButton);
        clickOnElementIfReady(elements.largeQuantityCloseButton);
        waitForJSToBeLoaded();

        //click on 'Need More?' link again
        waitElementIsVisible(elements.needMoreLink);
        clickOnElementIfReady(elements.needMoreLink);
        waitForJSToBeLoaded();

        //fill in all necessary data in 'Need More?' pop up window
        waitElementIsVisible(elements.largeQuantityNameFiled);
        clickOnElementIfReady(elements.largeQuantityNameFiled).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_NAME);

        waitElementIsVisible(elements.largeQuantityEmailField);
        clickOnElementIfReady(elements.largeQuantityEmailField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);

        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.largeQuantityPhoneNumberField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_PHONE);

        waitElementIsVisible(elements.inputNumberMoreButton);
        for (int i = 0; i < 10; i++) {
            clickOnElementIfReady(elements.inputNumberMoreButton);
        }

        waitElementIsVisible(elements.largeQuantityCommentsField);
        clickOnElementIfReady(elements.largeQuantityCommentsField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.largeQuantitySubmitRequestButton);
        clickOnElementIfReady(elements.largeQuantitySubmitRequestButton);

        //check that modal window appears and click on 'Ok' button
        waitElementIsVisible(elements.modalWindowTitle);
        waitElementIsVisible(elements.modalWindowTitleOkButton);
        clickOnElementIfReady(elements.modalWindowTitleOkButton);
    }

    public void checkNeedMoreLinkNegative() {
        //check 'Setup Fee' icon
        hoverOverElement(elements.setupFeeIcon);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on 'Need More?' link
        waitElementIsVisible(elements.needMoreLink);
        clickOnElementIfReady(elements.needMoreLink);
        waitForJSToBeLoaded();

        //pop up window appears
        waitElementIsVisible(elements.needMorePopWindowTitle);

        //click on 'SUBMIT REQUEST' button
        waitElementIsVisible(elements.largeQuantitySubmitRequestButton);
        clickOnElementIfReady(elements.largeQuantitySubmitRequestButton);

        //get css values of background-color property while the fields are empty and the button 'SUBMIT REQUEST' in triggered
        String cssValueNameField = waitElementIsVisible(elements.largeQuantityNameFiled).getCssValue("background-color");
        String cssValueEmailField = waitElementIsVisible(elements.largeQuantityEmailField).getCssValue("background-color");
        String cssValuePhoneNumberField = waitElementIsVisible(elements.largeQuantityPhoneNumberField).getCssValue("background-color");
        String cssValueQuantityField = waitElementIsVisible(elements.largeQuantityQuantityField).getCssValue("background-color");

        //compare backgrounds' colors with appropriate value
        Assert.assertEquals(cssValueNameField, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValueEmailField, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValuePhoneNumberField, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValueQuantityField, "rgba(255, 183, 183, 1)");

        clickOnElementIfReady(elements.largeQuantityCloseButton);
    }

    public void zoomInOutProductImage() {
        waitElementIsVisible(elements.productImage);
        clickOnElementIfReady(elements.productImage);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.zoomInButton);
        for (int i = 0; i < 2; i++) {
            clickOnElementIfReady(elements.zoomInButton);
        }

        waitElementIsVisible(elements.zoomOutButton);
        for (int i = 0; i < 2; i++) {
            clickOnElementIfReady(elements.zoomOutButton);
        }

        waitForJSToBeLoaded();

        waitElementIsVisible(elements.closeZoomWindowButton);
        clickOnElementIfReady(elements.closeZoomWindowButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.designerButton);
    }

    public void clickImageToZoomLinkCheck() {
        waitElementIsVisible(elements.clickImageToZoomLink);
        clickOnElementIfReady(elements.clickImageToZoomLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.zoomInButton);
        for (int i = 0; i < 2; i++) {
            clickOnElementIfReady(elements.zoomInButton);
        }

        waitElementIsVisible(elements.zoomOutButton);
        for (int i = 0; i < 2; i++) {
            clickOnElementIfReady(elements.zoomOutButton);
        }

        waitForJSToBeLoaded();

        waitElementIsVisible(elements.closeZoomWindowButton);
        clickOnElementIfReady(elements.closeZoomWindowButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.designerButton);
    }

    public void printLinkCheck() {
        waitElementIsVisible(elements.printLink);
        clickOnElementIfReady(elements.printLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.productNameOnPrintPage);

        driver.navigate().back();

        waitElementIsVisible(elements.designerButton);
    }

    public void quickEstimateCheck() {
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.quickEstimateModalWindow);

        waitElementIsVisible(elements.quantitySecondInRowQuickEstimate);
        clickOnElementIfReady(elements.quantitySecondInRowQuickEstimate);
        clickOnElementIfReady(elements.updateButtonQuantityQuickEstimate);

        waitElementIsVisible(elements.quickEstimateModalWindow);

        waitElementIsVisible(elements.zipCodeFieldQuickEstimate);
        clickOnElementIfReady(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.CheckoutData.ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.quickEstimateModalWindow);
    }

    public void checkDifferentZipCodesPositiveUS() {
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateCanada);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateCanada);

        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.CANADIAN_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        waitElementIsVisible(elements.quickEstimateModalWindow);

        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimatePuertoRico);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimatePuertoRico);

        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.PUERTO_RICO_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        waitElementIsVisible(elements.quickEstimateModalWindow);

        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateAmerica);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateAmerica);

        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.CheckoutData.ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        waitElementIsVisible(elements.quickEstimateModalWindow);
    }

    public void checkDifferentZipCodesPositiveCA() {
        //click on 'Quick Estimate' button
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        //Choose 'Canada' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateCanada);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateCanada);

        //fill in canadian zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.CANADIAN_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //close 'Quick Estimate' modal window
        waitElementIsVisible(elements.quickEstimateModalWindowCrossButton);
        waitElementIsVisible(elements.quickEstimateModalWindowCrossButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkDifferentZipCodesNegativeUS() {
        //push 'Quick Estimate' button
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        //USA
        //choose 'United States of America' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateAmerica);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateAmerica);

        //fill in canadian zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.CANADIAN_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeOkButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeOkButton);

        //choose 'America' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateAmerica);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateAmerica);

        //fill in puerto rico zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.PUERTO_RICO_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeCloseButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeCloseButton);

        //Canada
        //choose 'Canada' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateCanada);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateCanada);

        //fill in USA zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.CheckoutData.ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeOkButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeOkButton);

        //choose 'Canada' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimateCanada);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimateCanada);

        //fill in Puerto Rico zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.PUERTO_RICO_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeOkButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeOkButton);

        //Puerto Rico
        //choose 'United States of America' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimatePuertoRico);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimatePuertoRico);

        //fill in USA zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.CheckoutData.ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeOkButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeOkButton);

        //choose 'United States of America' in drop down menu
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimate);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimate);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.shippingDropDownMenuQuickEstimatePuertoRico);
        clickOnElementIfReady(elements.shippingDropDownMenuQuickEstimatePuertoRico);

        //fill in canadian zip code and push update button
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).clear();
        waitElementIsVisible(elements.zipCodeFieldQuickEstimate).sendKeys(Constant.ZipCodes.CANADIAN_ZIP_CODE);
        clickOnElementIfReady(elements.updateButtonZipCodeQuickEstimate);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //observe results and close modal window
        waitElementIsVisible(elements.modalWindowEnterValidZipCode);
        waitElementIsVisible(elements.modalWindowEnterValidZipCodeOkButton);
        clickOnElementIfReady(elements.modalWindowEnterValidZipCodeOkButton);

        //close 'Quick Estimate' modal window
        waitElementIsVisible(elements.quickEstimateModalWindowCrossButton);
        waitElementIsVisible(elements.quickEstimateModalWindowCrossButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkQuoteDesignerButtonsAreWorkable() {
        //find and save product's name
        String productsNamePDP = waitElementIsVisible(elements.productNamePDP).getText();

        //push 'Quick Estimate' button
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        //click on 'Request Quote' button
        waitElementIsVisible(elements.requestQuoteQuickEstimateButton);
        clickOnElementIfReady(elements.requestQuoteQuickEstimateButton);

        //get to Customizer's page and get the name of the product
        String productNameCustomizer = waitElementIsVisible(elements.productNameCustomizer).getText();

        //compare names
        Assert.assertEquals(productsNamePDP, productNameCustomizer);

        //check navigation from customizer's page
        clickOnElementIfReady(elements.productNameCustomizer);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.modalWindowProductNameCancelAndContinueCustomizingButton);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.productNameCustomizer);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.modalWindowProductNameYesButton);
        waitForJSToBeLoaded();

        //push 'Quick Estimate' button
        waitElementIsVisible(elements.quickEstimateButton);
        clickOnElementIfReady(elements.quickEstimateButton);
        waitForJSToBeLoaded();

        //click on 'Design & Buy' button
        waitElementIsVisible(elements.designsAndBuyQuickEstimateButton);
        clickOnElementIfReady(elements.designsAndBuyQuickEstimateButton);
        waitForJSToBeLoaded();

        //get to Designer's page and get the name of the product
        String productNameDesigner = waitElementIsVisible(elements.productNameDesigner).getText();

        Assert.assertEquals(productsNamePDP, productNameDesigner);

        //check navigation from designer's page
        waitElementIsVisible(elements.productNameDesigner);
        clickOnElementIfReady(elements.productNameDesigner);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.modalWindowProductNameDesigner);
        clickOnElementIfReady(elements.modalWindowProductNameDesignerCross);
        clickOnElementIfReady(elements.productNameDesigner);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.modalWindowProductNameDesigner);
        clickOnElementIfReady(elements.modalWindowProductNameDesignerCancelButton);
        clickOnElementIfReady(elements.productNameDesigner);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.modalWindowProductNameDesigner);
        clickOnElementIfReady(elements.modalWindowProductNameDesignerOkButton);
    }

    public void checkQuantityFieldFunctionality() {
        //click less quantity
        waitElementIsVisible(elements.inputNumberLessPDP);
        clickOnElementIfReady(elements.inputNumberLessPDP);

        //get background color css value
        String cssValue = waitElementIsVisible(elements.quantityPDPField).getCssValue("background-color");

        //compare background color with an appropriate one
        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");

        //click more quantity
        waitElementIsVisible(elements.inputNumberMoreButtonPDP);
        clickOnElementIfReady(elements.inputNumberMoreButtonPDP);

        //compare background color with an appropriate one
        String cssValue2 = waitElementIsVisible(elements.quantityPDPField).getCssValue("background-color");

        Assert.assertEquals(cssValue2, "rgba(255, 255, 255, 1)");

        //click more quantity
        waitElementIsVisible(elements.inputNumberMoreButtonPDP);
        clickOnElementIfReady(elements.inputNumberMoreButtonPDP);

        //compare background color with an appropriate one
        String cssValue3 = waitElementIsVisible(elements.quantityPDPField).getCssValue("background-color");

        Assert.assertEquals(cssValue3, "rgba(255, 255, 255, 1)");

//        String quantity = waitElementIsVisible(elements.quantitySecondInRowPDP).getText().replace("+", "");
//
//        clickOnElementIfReady(elements.quantitySecondInRowPDP);
//
//        String quantity2 = clickOnElementIfReady(elements.quantityPDPField).getText();
//
//        Assert.assertEquals(quantity, quantity2);

    }

    public void checkItemColorFunctionality() {
        //click select color field
        waitElementIsVisible(elements.selectColorFieldPDP);
        clickOnElementIfReady(elements.selectColorFieldPDP);
        waitForJSToBeLoaded();

        //select the fourth color option
        waitElementIsVisible(elements.fourthColorOption);
        clickOnElementIfReady(elements.fourthColorOption);

        //get the selected color name from drop down list
        String colorInDropDownMenu = waitElementIsVisible(elements.selectedColorName).getText();

        //get the color name on PDP
        String colorOnPDP = waitElementIsVisible(elements.colorNamePDP).getText();

        //compare color names
        Assert.assertEquals(colorInDropDownMenu, colorOnPDP);
    }

    public void checkAskQuestionFunctionality() {
        //click on FAQs link
        waitElementIsVisible(elements.fAQsLink);
        clickOnElementIfReady(elements.fAQsLink);

        //find and click on 'ASK QUESTION' button
        waitElementIsVisible(elements.askQuestionButton);
        clickOnElementIfReady(elements.askQuestionButton);

        //wait for modal window to open
        waitElementIsVisible(elements.askAQuestionModalWindow);

        //check cross and 'Close' buttons on modal window work properly
        clickOnElementIfReady(elements.askAQuestionModalWindowCrossButton);

        waitElementIsVisible(elements.askQuestionButton);
        clickOnElementIfReady(elements.askQuestionButton);

        clickOnElementIfReady(elements.askAQuestionModalWindowCloseButton);

        //check negative scenario
        waitElementIsVisible(elements.askQuestionButton);
        clickOnElementIfReady(elements.askQuestionButton);

        clickOnElementIfReady(elements.askAQuestionModalWindowSubmitQuestionButton);
        waitForJSToBeLoaded();

        //get background colors and labels of 'Email' and 'Question' fields
        String emailFieldBackgroundColor = clickOnElementIfReady(elements.askAQuestionModalWindowEmailField).getCssValue("background-color");
        String commentsFieldBackgroundColor = clickOnElementIfReady(elements.askAQuestionModalWindowQuestionsField).getCssValue("background-color");
        String emailFieldLabel = waitElementIsVisible(elements.askAQuestionModalWindowEmailLabel).getText();
        String commentsFieldLabel = waitElementIsVisible(elements.askAQuestionModalWindowCommentsLabel).getText();

        //implement comparison
        Assert.assertEquals(emailFieldBackgroundColor, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(commentsFieldBackgroundColor, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(emailFieldLabel, "Email address is required");
        Assert.assertEquals(commentsFieldLabel, "Question is required");

        //check CAPTCHA on 'Ask a question' window works properly
        clickOnElementIfReady(elements.askAQuestionModalWindowEmailField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);
        clickOnElementIfReady(elements.askAQuestionModalWindowQuestionsField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SUBMIT QUESTION' button and wait
        clickOnElementIfReady(elements.askAQuestionModalWindowSubmitQuestionButton);
        waitForJSToBeLoaded();

        //check that CAPTCHA's modal window appears and click 'Ok' button
        clickOnElementIfReady(elements.askAQuestionModalWindowCAPTCHAIsNotCheckedOkButton);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.askAQuestionModalWindowCloseButton);

        //check that the test is transmitted to the 'Comments' field
        waitElementIsVisible(elements.whatIsYourQuestionFieldPDP);
        clickOnElementIfReady(elements.whatIsYourQuestionFieldPDP).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);
        clickOnElementIfReady(elements.askQuestionButton);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.askAQuestionModalWindowCloseButton);

        //go up
        waitElementIsVisible(elements.returnToTheTopOfPDPButton);
        clickOnElementIfReady(elements.returnToTheTopOfPDPButton);

        //check navigation around PDP
        waitElementIsVisible(elements.viewFAQPDPLink);
        clickOnElementIfReady(elements.viewFAQPDPLink);
        waitElementIsVisible(elements.whatIsYourQuestionFieldPDP);

        //go up
        waitElementIsVisible(elements.returnToTheTopOfPDPButton);
        clickOnElementIfReady(elements.returnToTheTopOfPDPButton);
    }

    public void checkAskQuestionFunctionality2() {
        //check the link to ask a question
        waitElementIsVisible(elements.askAQuestionLink);
        clickOnElementIfReady(elements.askAQuestionLink);
        waitForJSToBeLoaded();

        //wait for modal window to open
        waitElementIsVisible(elements.askAQuestionModalWindow2);

        //check cross and 'Close' buttons on modal window work properly
        clickOnElementIfReady(elements.askAQuestionModalWindowCrossButton);

        waitElementIsVisible(elements.askAQuestionLink);
        clickOnElementIfReady(elements.askAQuestionLink);

        clickOnElementIfReady(elements.askAQuestionModalWindowCloseButton);

        //negative scenario
        //check the second link to ask a question
        waitElementIsVisible(elements.askAQuestionLink);
        clickOnElementIfReady(elements.askAQuestionLink);
        waitForJSToBeLoaded();

        clickOnElementIfReady(elements.askAQuestionModalWindowEmailField).clear();
        clickOnElementIfReady(elements.askAQuestionModalWindowQuestionsField).clear();
        clickOnElementIfReady(elements.askAQuestionModalWindowSubmitQuestionButton);
        waitForJSToBeLoaded();

        //get background colors and labels of 'Email' and 'Question' fields
        String emailFieldBackgroundColor2 = clickOnElementIfReady(elements.askAQuestionModalWindowEmailField).getCssValue("background-color");
        String commentsFieldBackgroundColor2 = clickOnElementIfReady(elements.askAQuestionModalWindowQuestionsField).getCssValue("background-color");
        String emailFieldLabel2 = waitElementIsVisible(elements.askAQuestionModalWindowEmailLabel).getText();
        String commentsFieldLabel2 = waitElementIsVisible(elements.askAQuestionModalWindowCommentsLabel).getText();

        //implement comparison
        Assert.assertEquals(emailFieldBackgroundColor2, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(commentsFieldBackgroundColor2, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(emailFieldLabel2, "Email address is required");
        Assert.assertEquals(commentsFieldLabel2, "Question is required");

        //check CAPTCHA on 'Ask a question' window works properly
        clickOnElementIfReady(elements.askAQuestionModalWindowEmailField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);
        clickOnElementIfReady(elements.askAQuestionModalWindowQuestionsField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SUBMIT QUESTION' button and wait
        clickOnElementIfReady(elements.askAQuestionModalWindowSubmitQuestionButton);
        waitForJSToBeLoaded();

        //check that CAPTCHA's modal window appears and click 'Ok' button
        clickOnElementIfReady(elements.askAQuestionModalWindowCAPTCHAIsNotCheckedOkButton);
        waitForJSToBeLoaded();
        clickOnElementIfReady(elements.askAQuestionModalWindowCloseButton);
    }

    public void checkAddToWishlistFunctionality() {
        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButton);
        clickOnElementIfReady(elements.saveToWishlistButton);
        waitForJSToBeLoaded();

        //check cross button
        waitElementIsVisible(elements.saveToWishlistModalWindowTitle);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCrossButton);

        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButton);
        clickOnElementIfReady(elements.saveToWishlistButton);
        waitForJSToBeLoaded();

        //check 'Close' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCloseButton);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCloseButton);

        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButton);
        clickOnElementIfReady(elements.saveToWishlistButton);
        waitForJSToBeLoaded();

        //push 'Create' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCreateButton);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCreateButton);
        waitForJSToBeLoaded();

        //wait and find 'Wishlist Updated' information message
        waitElementIsVisible(elements.saveToWishListWishlistUpdatedInformationMessage);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButton);
        clickOnElementIfReady(elements.saveToWishlistButton);
        waitForJSToBeLoaded();

        //push 'Save' button on modal window (add the same item to 'Wishlist')
        waitElementIsVisible(elements.saveToWishlistModalWindowSaveButton);
        clickOnElementIfReady(elements.saveToWishlistModalWindowSaveButton);
        waitForJSToBeLoaded();

        //check error message appears
        waitElementIsVisible(elements.saveToWishlistModalWindowErrorMessage);

        //check 'Close' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCloseButton);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCloseButton);
    }

    public void checkAddToComparisonsFunctionality() {
        //add an item to comparisons
        waitElementIsVisible(elements.compareProductButton);
        clickOnElementIfReady(elements.compareProductButton);
        waitForJSToBeLoaded();

        //check that modal window appears
        waitElementIsVisible(elements.compareProductModalWindowTitle);

        //push 'Ok' button
        clickOnElementIfReady(elements.compareProductModalWindowOkButton);
        waitForJSToBeLoaded();

        //add the same product to 'Comparisons' (negative scenario)
        waitElementIsVisible(elements.compareProductButton);
        clickOnElementIfReady(elements.compareProductButton);
        waitForJSToBeLoaded();

        //check error message appears
        waitElementIsVisible(elements.compareProductModalWindowErrorMessageTitLe);

        //push 'Ok' button
        clickOnElementIfReady(elements.compareProductModalWindowOkButton);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void getToDesignerPage() {
        waitElementIsVisible(elements.designerButton);
        clickOnElementIfReady(elements.designerButton);
        waitForJSToBeLoaded();
    }

    public void getToCustomizerPage() {
        waitElementIsVisible(elements.customizerButton);
        clickOnElementIfReady(elements.customizerButton);
        waitForJSToBeLoaded();
    }

    public void getToQuoteCustomizerPage() {
        waitElementIsVisible(elements.requestQuoteButton);
        clickOnElementIfReady(elements.requestQuoteButton);
        waitForJSToBeLoaded();
    }

    public void getToSampleConfiguratorPage() {
        waitElementIsVisible(elements.requestSampleButton);
        clickOnElementIfReady(elements.requestSampleButton);
        waitForJSToBeLoaded();
    }

    public void checkSampleLimitReached() {
        //click on 'Request Sample' button
        waitElementIsVisible(elements.requestSampleButton);
        clickOnElementIfReady(elements.requestSampleButton);
        waitForJSToBeLoaded();

        //click on cross on modal window
        waitElementIsVisible(elements.sampleLimitReachedTitle);
        clickOnElementIfReady(elements.sampleLimitReachedCrossButton);
        waitForJSToBeLoaded();

        //click on 'Request Sample' button
        waitElementIsVisible(elements.requestSampleButton);
        clickOnElementIfReady(elements.requestSampleButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button
        waitElementIsVisible(elements.sampleLimitReachedTitle);
        clickOnElementIfReady(elements.sampleLimitReachedOkButton);
        waitForJSToBeLoaded();

        //checks the modal window is closed
        waitElementIsVisible(elements.requestSampleButton);
    }

    public void addProductToWishlist() {
        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButton);
        clickOnElementIfReady(elements.saveToWishlistButton);
        waitForJSToBeLoaded();

        //push 'Create' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCreateButton);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCreateButton);
        waitForJSToBeLoaded();

        //wait and find 'Wishlist Updated' information message
        waitElementIsVisible(elements.saveToWishListWishlistUpdatedInformationMessage);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }


    public void addProductToComparisons() {
        //add an item to comparisons
        waitElementIsVisible(elements.compareProductButton);
        clickOnElementIfReady(elements.compareProductButton);
        waitForJSToBeLoaded();

        //check that modal window appears
        waitElementIsVisible(elements.compareProductModalWindowTitle);

        //push 'Ok' button
        clickOnElementIfReady(elements.compareProductModalWindowViewComparisonsButton);
        waitForJSToBeLoaded();
    }


//    public void getToPDPApparelDesigner() {
//        List<WebElement> productsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));
//
//        for (int i = 0; i < productsOnPLP.size(); i++) {
//            waitElementIsVisible(productsOnPLP.get(i));
//            clickOnElementIfReady(productsOnPLP.get(i));
//            makePause(Constant.TimeoutVariable.SHORT_SLEEP);
//            waitForJSToBeLoaded();
//
//            if (!isElementPresent(elements.designerButtonLocator)) {
//                driver.navigate().back();
//            } else  break;
//        }
//        waitForJSToBeLoaded();
//    }

//    public void getToPDPApparelCustomizer() {
//        List<WebElement> elementsOnPLP = driver.findElements(By.xpath("//div[@class='col-lg-10']//div[3]//h2"));
//
//        for (int i = 0; i < elementsOnPLP.size(); i++) {
//            waitElementIsVisible(elementsOnPLP.get(i));
//            clickOnElementIfReady(elementsOnPLP.get(i));
//            makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
//            waitForJSToBeLoaded();
//
//            if (!isElementPresent(elements.customizerButtonLocator)) {
//                driver.navigate().back();
//            } else break;
//        }
//        waitForJSToBeLoaded();
//    }

}
