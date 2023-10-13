package tests.sampleCart;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class SampleCartTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToSampleCart() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkMissingInformationSampleConfiguratorNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.checkMissingInformationSampleConfiguratorNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkNavigation() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
        sampleCartPage.checkNavigation();
        productDescriptionPage.clickImageToZoomLinkCheck();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkRemoveButton() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
        sampleCartPage.checkRemoveButton();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_checkSampleLimitReached() {
        //log in procedure
        loginPage.loginToSite();

        //adds 1st product to Sample Cart
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();

        //adds 2nd product to Sample Cart
        productListingPage.getToPLPHatsAndOtherHeadwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();

        //adds 3rd product to Sample Cart
        productListingPage.getToPLPPoloShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();

        //adds 4th product to Sample Cart and checks proper respond
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkSampleLimitReached();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkReCAPTCHA() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
        sampleCartPage.checkReCAPTCHA();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_addTwoProductsToSampleCartAsGuest() {
        //get to home page
        loginPage.getToHomePageNotLogIn();

        //adds 1st product to Sample Cart
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();

        //adds 2nd product to Sample Cart
        productListingPage.getToPLPHatsAndOtherHeadwear();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_checkPlaceSampleOrderAsGuestProcedure() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToSampleConfiguratorPage();
        sampleCartPage.checkSampleConfiguratorIsLoaded();
        sampleCartPage.fillAllNecessaryFields();
        sampleCartPage.clickOnRequestSamplesButton();
        loginPage.checkSignInPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_chooseSavedShippingAddress() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
        sampleCartPage.clickOnRequestSamplesButton();
        sampleCartPage.chooseSavedShippingAddress();
        sampleCartPage.checkReCAPTCHA2();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_chooseANewShippingAddress() {
        loginPage.loginToSite();
        sampleCartPage.getToSampleCart();
        sampleCartPage.clickOnRequestSamplesButton();
        sampleCartPage.chooseNewShippingAddress();
        sampleCartPage.checkReCAPTCHA2();
    }
}
