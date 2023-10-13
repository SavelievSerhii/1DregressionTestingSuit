package tests.changePassword;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class ChangePasswordPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToChangePasswordPage() {
        loginPage.loginToSite();
        changePasswordPage.verifyChangePasswordPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkRespondNegative() {
        loginPage.loginToSite();
        changePasswordPage.verifyChangePasswordPageIsLoaded();
        changePasswordPage.checkRespondNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_changePassword() {
        loginPage.loginToSite();
        changePasswordPage.verifyChangePasswordPageIsLoaded();
        changePasswordPage.changePassword();
    }
}
