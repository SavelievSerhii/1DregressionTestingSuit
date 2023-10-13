package tests.comparisons;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class ComparisonsPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToComparisonsPage() {
        loginPage.loginToSite();
        comparisonsPage.getToComparisonsPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkAddProductToComparisonsNavigationBreadcrumb() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.addProductToComparisons();
        comparisonsPage.checkNavigationBreadcrumb();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkNavigationProductNameLink() {
        loginPage.loginToSite();
        comparisonsPage.getToComparisonsPage();
        comparisonsPage.checkNavigationProductNameLink();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkShareButtonFunctionality() {
        loginPage.loginToSite();
        comparisonsPage.getToComparisonsPage();
        comparisonsPage.checkShareButtonFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_checkEmailButtonFunctionality() {
        loginPage.loginToSite();
        comparisonsPage.getToComparisonsPage();
        comparisonsPage.checkEmailButtonFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkRemoveLink() {
        loginPage.loginToSite();
        comparisonsPage.getToComparisonsPage();
        comparisonsPage.checkRemoveButton();
    }
}
