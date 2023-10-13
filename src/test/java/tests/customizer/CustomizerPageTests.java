package tests.customizer;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class CustomizerPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToCustomizerPge() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_fillAllNecessaryFields() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_fillAllNecessaryFieldsNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirtsNegative();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_addArtworkToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addArtworkToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_addArtworkToProductNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addArtworkToProductNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_addClipartToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_addTextToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addTextToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_customizedProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkNeedHelpSection() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.checkNeedHelpSection();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_addCustomizedProductToCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_checkNavigation() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.checkNavigation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_checkAddArtworkCustomizerAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.addArtworkToProductGuest();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_addTwoProductsToCartAsGuest() {
        //get to home page
        loginPage.getToHomePageNotLogIn();

        //add 1st product to shopping cart
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();

        //add 2nd product to shopping cart
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_14_checkPlaceOrderAsGuestProcedure() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        loginPage.checkGuestsSignInPageIsLoaded();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_15_checkSignInCreateAccountLinksShoppingCartAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.checkSignInCreateAccountLinks();
        loginPage.checkSignInPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_16_checkSignInProcedureViaCustomizer() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.addArtworkToProductGuest();
        customizerPage.signInViaCustomizer();
        loginPage.checkUserSignedInSuccessfully();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_17_checkSignInProcedureViaCustomizerNegative() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.addArtworkToProductGuest();
        customizerPage.signInViaCustomizerNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_18_checksSignInViaCustomizerButtonsAreWorkableAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.verifyCustomizerPageIsLoaded();
        customizerPage.checkSignInViaCustomizerButtonsAreWorkable();
    }
}
