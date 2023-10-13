package tests.yourProductReviews;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class YourProductReviewsPageTests extends BaseTest {

    @Test
    public void test_01_getToYourProductReviewsPage() {
        loginPage.loginToSite();
        yourProductReviewsPage.verifyYourProductReviewsPageIsLoaded();
    }

    @Test
    public void test_02_checkNavigation() {
        loginPage.loginToSite();
        yourProductReviewsPage.verifyYourProductReviewsPageIsLoaded();
        yourProductReviewsPage.checkNavigation();
    }

    @Test
    public void test_03_writeAReviewNegative() {
        loginPage.loginToSite();
        yourProductReviewsPage.verifyYourProductReviewsPageIsLoaded();
        yourProductReviewsPage.writeAReviewNegative();
    }

    @Test
    public void test_04_writeAReview() {
        loginPage.loginToSite();
        yourProductReviewsPage.verifyYourProductReviewsPageIsLoaded();
        yourProductReviewsPage.writeAReview();
    }
}
