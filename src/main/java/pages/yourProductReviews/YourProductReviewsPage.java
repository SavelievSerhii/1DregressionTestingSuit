package pages.yourProductReviews;

import elements.base.BaseElements;
import elements.yourProductsReviews.YourProductsReviewsPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class YourProductReviewsPage extends BasePage {

    YourProductsReviewsPageElements elements;
    public YourProductReviewsPage(WebDriver driver, WebDriverWait wait, YourProductsReviewsPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void verifyYourProductReviewsPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Your Products Reviews' page
        waitElementIsVisible(elements.yourProductReviewsLink);
        clickOnElementIfReady(elements.yourProductReviewsLink);
        waitForJSToBeLoaded();

        //wait for 'Review Your Purchases' page is loaded
        waitElementIsVisible(elements.reviewYourPurchasesTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkNavigation() {
        //click on product's name link
        String text = waitElementIsVisible(elements.productNameFirstInTheRow).getText();
        clickOnElementIfReady(elements.productNameFirstInTheRow);
        waitForJSToBeLoaded();

        //check product name on PDP and get back
        String text1 = waitElementIsVisible(elements.productNameOnPDP).getText();
        Assert.assertEquals(text, text1);

        driver.navigate().back();
        waitForJSToBeLoaded();

        //click on 'Your Account' breadcrumb link
        clickOnElementIfReady(elements.yourAccountBreadcrumbLink);
        waitForJSToBeLoaded();

        //click on 'Your Products Reviews' page
        waitElementIsVisible(elements.yourProductReviewsLink);
        clickOnElementIfReady(elements.yourProductReviewsLink);
        waitForJSToBeLoaded();

        //click on 'Home' breadcrumb link
        clickOnElementIfReady(elements.homePageBreadcrumbLink);
        waitForJSToBeLoaded();

        //wait for home page to be loaded
        waitElementIsVisible(elements.homePageMainTitle);

        //get to 'Review Your Purchases' page again
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Your Products Reviews' page
        waitElementIsVisible(elements.yourProductReviewsLink);
        clickOnElementIfReady(elements.yourProductReviewsLink);
        waitForJSToBeLoaded();

        //wait for 'Review Your Purchases' page is loaded
        waitElementIsVisible(elements.reviewYourPurchasesTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on 'CONTINUE SHOPPING' button
        clickOnElementIfReady(elements.continueShoppingLink);
        waitForJSToBeLoaded();

        //wait for home page to be loaded
        waitElementIsVisible(elements.homePageMainTitle);
    }

    public void writeAReviewNegative() {
        //click on 'WRITE A REVIEW' button
        String text = waitElementIsVisible(elements.productNameFirstInTheRow).getText();
        clickOnElementIfReady(elements.writeAReviewButtonFirstInTheRow);
        waitForJSToBeLoaded();

        //check 'Write a Product Review' page of appropriate item is opened
        String text1 = waitElementIsVisible(elements.productNameOnWriteAReviewPage).getText();
        Assert.assertEquals(text, text1);

        //click on 'SUBMIT REVIEW' button
        waitElementIsVisible(elements.writeAReviewSubmitReviewButton);
        clickOnElementIfReady(elements.writeAReviewSubmitReviewButton);
        waitForJSToBeLoaded();

        //check fields turned their colour
        String cssValue = waitElementIsVisible(elements.writeAReviewSelectStarsDropDown).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.writeAReviewTextArea).getCssValue("background-color");
        String cssValue2 = waitElementIsVisible(elements.writeAReviewClientName).getCssValue("background-color");
        String cssValue3 = waitElementIsVisible(elements.writeAReviewCityName).getCssValue("background-color");
        String cssValue4 = waitElementIsVisible(elements.writeAReviewStateName).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue2, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue3, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue4, "rgba(255, 183, 183, 1)");
    }


    public void writeAReview() {
        //deal with the 'WRITE A REVIEW' button
        if (!isElementPresent(elements.writeAReviewButton)) {
            clickOnElementIfReady(elements.continueShoppingLink);
            waitElementIsVisible(elements.homePageMainTitle);
        } else clickOnElementIfReady(elements.writeAReviewButtonFirstInTheRow);

        //fill all necessary information
        clickOnElementIfReady(elements.writeAReviewSelectStarsDropDown);
        waitElementIsVisible(elements.writeAReviewChoose5Stars);
        clickOnElementIfReady(elements.writeAReviewChoose5Stars);

        waitElementIsVisible(elements.writeAReviewTextArea).clear();
        clickOnElementIfReady(elements.writeAReviewTextArea).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        waitElementIsVisible(elements.writeAReviewClientName).clear();
        clickOnElementIfReady(elements.writeAReviewClientName).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_NAME);

        waitElementIsVisible(elements.writeAReviewCityName).clear();
        clickOnElementIfReady(elements.writeAReviewCityName).sendKeys(Constant.actualShippingAddressData.CITY_NAME);

        waitElementIsVisible(elements.writeAReviewStateName).clear();
        clickOnElementIfReady(elements.writeAReviewStateName).sendKeys(Constant.actualShippingAddressData.STATE_PROVINCE_NAME);

        //click on drop image area
        waitElementIsVisible(elements.writeAReviewDropImageArea);
        clickOnElementIfReady(elements.writeAReviewDropImageArea);

        //upload file using Sikuli patterns (Sikuli dependency)
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);

        //click on 'SUBMIT REVIEW' button
        waitElementIsVisible(elements.writeAReviewSubmitReviewButton);
        clickOnElementIfReady(elements.writeAReviewSubmitReviewButton);
        waitForJSToBeLoaded();

        //check that the review is loaded successfully
        waitElementIsVisible(elements.thankYouForYourReviewBanner);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


}
