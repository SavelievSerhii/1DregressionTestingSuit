package tests.billingInformation;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class BillingInformationPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToBillingInformationPage() {
        loginPage.loginToSite();
        billingInformationPage.verifyBillingInformationPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_editBillingInformation() {
        loginPage.loginToSite();
        billingInformationPage.verifyBillingInformationPageIsLoaded();
        billingInformationPage.editBillingInformation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkManageContactInformationNavigation() {
        loginPage.loginToSite();
        billingInformationPage.verifyBillingInformationPageIsLoaded();
        billingInformationPage.checkManageContactInformationNavigation();
    }
}
