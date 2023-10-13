package tests.yourPersonalizedGallery;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class YourPersonalizedGalleryPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToYourPersonalizedGalleryPage() {
        loginPage.loginToSite();
        yourPersonalizedGalleryPage.getToYourPersonalizedGallery();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkBreadcrumbNavigation() {
        loginPage.loginToSite();
        yourPersonalizedGalleryPage.getToYourPersonalizedGallery();
        yourPersonalizedGalleryPage.checkBreadcrumbNavigation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_updateLogo() {
        loginPage.loginToSite();
        yourPersonalizedGalleryPage.getToYourPersonalizedGallery();
        yourPersonalizedGalleryPage.updateLogo();
    }

    @Test
    public void test_04_checkShareViaEmailFunctionality() {
        loginPage.loginToSite();
        yourPersonalizedGalleryPage.getToYourPersonalizedGallery();
        yourPersonalizedGalleryPage.checkShareViaEmailFunctionality();
    }
}
