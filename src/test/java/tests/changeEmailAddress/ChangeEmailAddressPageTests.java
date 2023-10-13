package tests.changeEmailAddress;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class ChangeEmailAddressPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToChangeEmailAddressPage() {
        loginPage.loginToSite();
        changeEmailAddressPage.verifyChangeEmailAddressPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkRespondNegative() {
        loginPage.loginToSite();
        changeEmailAddressPage.verifyChangeEmailAddressPageIsLoaded();
        changeEmailAddressPage.checkRespondNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkNavigation() {
        loginPage.loginToSite();
        changeEmailAddressPage.verifyChangeEmailAddressPageIsLoaded();
        changeEmailAddressPage.checkNavigation();
    }
}
