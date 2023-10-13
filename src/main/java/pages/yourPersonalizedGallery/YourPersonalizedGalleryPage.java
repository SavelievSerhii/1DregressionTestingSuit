package pages.yourPersonalizedGallery;

import elements.yourPersonalizedGallery.YourPersonalizedGalleryElements;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class YourPersonalizedGalleryPage extends BasePage {

    YourPersonalizedGalleryElements elements;
    public YourPersonalizedGalleryPage(WebDriver driver, WebDriverWait wait, YourPersonalizedGalleryElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void getToYourPersonalizedGallery() {
        //navigate to 'Your Personalized Gallery' page
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);
        waitForJSToBeLoaded();

        //click on 'Your Personalized Gallery' link in the navigation bar
        waitElementIsVisible(elements.yourPersonalizeGalleryLink);
        clickOnElementIfReady(elements.yourPersonalizeGalleryLink);
        waitForJSToBeLoaded();

        //validate that the page is loaded
        waitElementIsVisible(elements.yourPersonalizedGalleryPageTitle);


    }

    public void checkBreadcrumbNavigation() {
        //check breadcrumb's names
        String yourPersonalizedGalleryString = waitElementIsVisible(elements.yourPersonalizedGalleryBreadcrumb).getText();
        String promotionalProductsString = waitElementIsVisible(elements.promotionalProductsBreadcrumb).getText();
        String homeString = waitElementIsVisible(elements.homeBreadcrumb).getText();

        Assert.assertEquals(yourPersonalizedGalleryString, "Your Personalized Gallery");
        Assert.assertEquals(promotionalProductsString, "Promotional Products");
        Assert.assertEquals(homeString, "Home");

        //check 'Promotional Products' link
        waitElementIsVisible(elements.promotionalProductsBreadcrumb);
        clickOnElementIfReady(elements.promotionalProductsBreadcrumb);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.yourPersonalizeGalleryLink);

        //check 'Home' link
        waitElementIsVisible(elements.homeBreadcrumb);
        clickOnElementIfReady(elements.homeBreadcrumb);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.homePageMainTitle);
    }

    public void updateLogo() {
        //click on 'TRY ANOTHER LOGO' button
        waitElementIsVisible(elements.addYourLogoButton);
        clickOnElementIfReady(elements.addYourLogoButton);
        waitForJSToBeLoaded();

        //check cross button of the modal window
        waitElementIsVisible(elements.addLogoModalWindowTitle);
        clickOnElementIfReady(elements.addLogoModalWindowCrossButton);

        //click on 'ADD YOUR LOGO' button
        waitElementIsVisible(elements.addYourLogoButton);
        clickOnElementIfReady(elements.addYourLogoButton);
        waitForJSToBeLoaded();

        //check 'Close' button on the modal window
        waitElementIsVisible(elements.addLogoModalWindowTitle);
        clickOnElementIfReady(elements.addLogoModalWindowCloseButton);

        //click on 'ADD YOUR LOGO' button
        waitElementIsVisible(elements.addYourLogoButton);
        clickOnElementIfReady(elements.addYourLogoButton);
        waitForJSToBeLoaded();

        //click on 'Drop file here or click to upload'
        waitElementIsVisible(elements.addLogoModalWindowTitle);
        clickOnElementIfReady(elements.addLogoModalWindowDropFileArea);
        waitForJSToBeLoaded();

        //upload file using Sikuli patterns (Sikuli dependency)
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.LONG_SLEEP);
    }

    public void checkShareViaEmailFunctionality() {
        //click on 'envelope' link
        waitElementIsVisible(elements.envelopeButton);
        clickOnElementIfReady(elements.envelopeButton);
        waitForJSToBeLoaded();

        //check cross button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowCrossButton);

        //click on 'envelope' link
        waitElementIsVisible(elements.envelopeButton);
        clickOnElementIfReady(elements.envelopeButton);
        waitForJSToBeLoaded();

        //click on 'SEND EMAIL' button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowSendEmailButton);
        waitForJSToBeLoaded();

        //check proper respond
        waitElementIsVisible(elements.shareViaEmailModalWindowToField).clear();
        waitElementIsVisible(elements.shareViaEmailModalWindowFromField).clear();

        //click on 'SEND EMAIL' button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowSendEmailButton);
        waitForJSToBeLoaded();

        String emailToFieldErrorBackground = waitElementIsVisible(elements.shareViaEmailModalWindowToField).getCssValue("background-color");
        String emailFromFieldErrorBackground = waitElementIsVisible(elements.shareViaEmailModalWindowFromField).getCssValue("background-color");

        Assert.assertEquals(emailToFieldErrorBackground, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(emailFromFieldErrorBackground, "rgba(255, 183, 183, 1)");

        String emailToErrorLabelText = waitElementIsVisible(elements.shareViaEmailModalWindowToErrorLabel).getText();
        String emailFromErrorLabel = waitElementIsVisible(elements.shareViaEmailModalWindowFromErrorLabel).getText();

        Assert.assertEquals(emailToErrorLabelText, "To email address is required");
        Assert.assertEquals(emailFromErrorLabel, "From email address is required");

        //reCAPTCHA check
        waitElementIsVisible(elements.shareViaEmailModalWindowToField).clear();
        clickOnElementIfReady(elements.shareViaEmailModalWindowToField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.shareViaEmailModalWindowFromField).clear();
        clickOnElementIfReady(elements.shareViaEmailModalWindowFromField).sendKeys("test@test.com");

        //click on 'SEND EMAIL' button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowSendEmailButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.proveYouAreNotARobotTitle);
        clickOnElementIfReady(elements.proveYouAreNotARobotCrossButton);

        //click on 'SEND EMAIL' button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowSendEmailButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.proveYouAreNotARobotTitle);
        clickOnElementIfReady(elements.proveYouAreNotARobotOkButton);
        waitForJSToBeLoaded();

        //check cross button on modal window
        waitElementIsVisible(elements.shareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.shareViaEmailModalWindowCrossButton);

        //validate that the page is loaded
        waitElementIsVisible(elements.yourPersonalizedGalleryPageTitle);
    }
}
