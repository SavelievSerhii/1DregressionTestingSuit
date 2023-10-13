package tests.PDP;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class ProductDescriptionPageTests extends BaseTest {

    //reminder: don't forget to delete all items from 'Comparisons', 'Wishlist' before running the tests.
    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToPDP() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_getToPDP() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelCustomizer();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03a_checkNeedMoreLink() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkNeedMoreLink();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03b_checkNeedMoreLinkNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkNeedMoreLinkNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkZoomInOutWindow() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.zoomInOutProductImage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_checkClickToZoomLink() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.clickImageToZoomLinkCheck();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkPrintLink() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.printLinkCheck();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_checkQuickEstimateButton() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.quickEstimateCheck();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_checkQuickEstimateButton2() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkDifferentZipCodesPositiveUS();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkQuickEstimateButton3() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkDifferentZipCodesNegativeUS();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_checkQuoteAndDesignerButtons() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkQuoteDesignerButtonsAreWorkable();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_checkQuantityField() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkQuantityFieldFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_checkItemColor() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkItemColorFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_checkAskQuestionFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkAskQuestionFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_14_checkAskQuestionFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkAskQuestionFunctionality2();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_15_checkAddToWishlistFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkAddToWishlistFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_16_checkAddToComparisonsFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.checkAddToComparisonsFunctionality();
    }

}
