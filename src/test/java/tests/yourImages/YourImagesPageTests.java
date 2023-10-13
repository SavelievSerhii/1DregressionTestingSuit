package tests.yourImages;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class YourImagesPageTests extends BaseTest {

    @Test (retryAnalyzer = Retry.class)
    public void test_01_getToYourImagesPage() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_02_checkPaginationFunctionality() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkPaginationFunctionality();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_03_checkSearch() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkSearch();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_04_checkImageInformation() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkImageInformation();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_05_checkYourProofsTabFunctionality() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkYourProofsTabFunctionality();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_06_checkEditImageInformation() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkEditImageInformation();
    }

    @Test (retryAnalyzer = Retry.class)
    public void test_07_checkNavigation() {
        loginPage.loginToSite();
        yourImagesPage.verifyYourImagesPageIsLoaded();
        yourImagesPage.checkNavigation();
    }
}
