package tests.PLP;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.base.BaseTest;
import utility.Retry;


public class ProductListingPageTests extends BaseTest {

    //reminder: don't forget to delete all items from 'Comparisons', 'Wishlist' before running the tests.

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToPLP() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_itemsPerPage() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkItemsPerPageWorksProperly(), 100);
        Assert.assertEquals(productListingPage.checkItemsPerPageWorksProperly2(), 40);
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkFreeRushProductionFacet() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.freeRushProductionFacet), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkGenderFacet() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.genderFacet), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_checkMaterialFacet() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.materialFacet), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkItemsColorsFacet() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.itemColorFacet), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_checkBrandFacet() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.brandFacet), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_checkCategoryLinks() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.tShirtCategoryLink), productListingPage.quantityOfResultAfterFiltering());
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.outwearCategoryLink), productListingPage.quantityOfResultAfterFiltering());
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.hatsAndOtherHeadwearCategoryLink), productListingPage.quantityOfResultAfterFiltering());
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.poloShirtsCategoryLink), productListingPage.quantityOfResultAfterFiltering());
        productListingPage.getToPLPApparel();
        Assert.assertEquals(productListingPage.checkFacet(productListingPageElements.sweatshirtsCategoryLink), productListingPage.quantityOfResultAfterFiltering());
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkPriceSliderFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productListingPage.checkPriceSliderWorksProperly();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_checkPriceRangeSliderFilterFunctionality() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productListingPage.checkPriceRangeSliderFilterFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_addProductToWishlist() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productListingPage.checkAddProductToWishlistFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_addTheSameProductToWishlist() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productListingPage.addTheSameProductToWishlistCart();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_addProductToComparisons() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productListingPage.checkAddProductToComparisonsFunctionality();
    }
}
