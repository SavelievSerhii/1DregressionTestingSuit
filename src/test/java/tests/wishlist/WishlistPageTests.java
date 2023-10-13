package tests.wishlist;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class WishlistPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToWishlist() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addProductToWishlist() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.addProductToWishlist();
        wishlistPage.getToWishlist();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkNavigationBreadcrumb() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
        wishlistPage.checkNavigationBreadcrumb();
    }

    //the test is not actual because AddThis services have been deprecated since 05/31/23
//    @Test(retryAnalyzer = Retry.class)
//    public void test_04_checkShareWishlistViaEmailFunctionality() {
//        loginPage.loginToSite();
//        wishlistPage.getToWishlist();
//        wishlistPage.checkShareWishlistViaEmailFunctionality();
//    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_checkMakeWishlistPublicFunctionality() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
        wishlistPage.checkMakeWishlistPublicFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkCompareProductFunctionality() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
        wishlistPage.checkCompareProductFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_deleteProductFromWishlist() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
        wishlistPage.deleteProductFromWishlist();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_deleteWishlist() {
        loginPage.loginToSite();
        wishlistPage.getToWishlist();
        wishlistPage.deleteWishlist();
    }
}
