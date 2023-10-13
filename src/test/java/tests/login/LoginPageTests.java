package tests.login;

import org.testng.Assert;
import org.testng.annotations.*;
import utility.Constant;
import tests.base.BaseTest;
import utility.Retry;

public class LoginPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToSignInPage() {
        loginPage.getToLoginPage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_logInToSite() {
        Assert.assertEquals(loginPage.loginToSite(), Constant.actualShippingAddressData.FIRST_NAME + " " + Constant.actualShippingAddressData.LAST_NAME);
////        Assert.assertEquals(loginPage.loginToSite(), "Kurt Bissonnette");
//        Assert.assertEquals(loginPage.loginToSite(), "Tester QA");
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_logOutOfSite() {
        loginPage.logOutOfSite();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkContinueShoppingButton() {
        loginPage.checkContinueShoppingButtonIsWorkable();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_signInUsingFacebook() {
        loginPage.getToLoginPage();
        loginPage.signInUsingFacebook();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_signInUsingGoogle() {
        loginPage.getToLoginPage();
        loginPage.checkSignInUsingGoogleButtonWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_forgotPasswordLinkWorksProperly() {
        loginPage.getToLoginPage();
        loginPage.forgotPasswordLinkWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_createAnAccountButtonWorksProperly() {
        loginPage.getToLoginPage();
        loginPage.createAnAccountButtonWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_shopBusinessChecksAndSuppliesButtonWorksProperly() {
        loginPage.getToLoginPage();
        loginPage.checkShopBusinessChecksAndSuppliesWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_liveChatLinkWorksProperly() {
        loginPage.getToLoginPage();
        loginPage.checkLiveChatLinkWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_checkWrongCredentialsRespond1() {
        loginPage.checkLoginUsingWrongCredentialsRespond1();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_checkWrongCredentialsRespond2() {
        loginPage.checkLoginUsingWrongCredentialsRespond2();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_checkWrongCredentialsRespond3() {
        loginPage.checkLoginUsingWrongCredentialsRespond3();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_14_checkEmptyCredentialsRespond1() {
        loginPage.getToLoginPage();
        loginPage.checkEmptyEmailFieldRespond();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_15_checkEmptyCredentialsRespond2() {
        loginPage.getToLoginPage();
        loginPage.checkEmptyPasswordFieldRespond();
    }

}
