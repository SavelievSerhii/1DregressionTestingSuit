package tests.yourWishlists;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class YourWishlistsPageTests extends BaseTest {

    @Test
    public void test_01_getToYourWishlistsPage() {
        loginPage.loginToSite();
        yourWishlistPage.verifyYourWishlistsPageIsLoaded();
    }

    @Test
    public void test_02_checkNavigation() {
        loginPage.loginToSite();
        yourWishlistPage.verifyYourWishlistsPageIsLoaded();
        yourWishlistPage.checkNavigation();
    }
}
