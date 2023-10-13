package tests.quoteCart;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class QuoteCartTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_addProductToQuoteCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPPoloShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.getToQuoteCartFromPreQuotePage();
        quoteCartPage.checkRemoveButton();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkNavigationQuotePrePage() {
        loginPage.loginToSite();
        productListingPage.getToPLPPoloShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.checkNavigationQuotePrePage();
        quoteCartPage.verifyRequestCheckoutIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkModifyButton() {
        loginPage.loginToSite();
        quoteCartPage.getToQuoteCart();
        quoteCartPage.checkModifyButton();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.getToQuoteCartFromPreQuotePage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_placeQuoteOrderTShirt() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.clickOnCompleteRequestButton();
        quoteCartPage.verifyRequestCheckoutIsLoaded();
        quoteCartPage.requestQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_placeQuoteOrderSweatshirt() {
        loginPage.loginToSite();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.clickOnCompleteRequestButton();
        quoteCartPage.verifyRequestCheckoutIsLoaded();
        quoteCartPage.requestQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_chooseSavedShippingAddress() {
        loginPage.loginToSite();
        productListingPage.getToPLPHatsAndOtherHeadwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsCap();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.clickOnCompleteRequestButton();
        quoteCartPage.chooseSavedShippingAddress();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_chooseNewShippingAddressPlaceQuoteOrder() {
        loginPage.loginToSite();
        productListingPage.getToPLPHatsAndOtherHeadwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsCap();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addClipartToProductUsingSearchField();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.clickOnCompleteRequestButton();
        quoteCartPage.chooseNewShippingAddressPlaceOrder();
        quoteCartPage.requestQuote();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_addTwoProductsToQuoteCartAsGuest() {
        //get to home page
        loginPage.getToHomePageNotLogIn();

        //add 1st product to quote cart
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.getToQuoteCartFromPreQuotePage();

        //add 2nd product to quote cart
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.getToQuoteCartFromPreQuotePage();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkPlaceQuoteOrderAsGuestProcedure() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPPoloShirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToQuoteCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.addArtworkToProductGuest();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.clickOnAddToQuotesButton();
        quoteCartPage.clickOnCompleteRequestButton();
        loginPage.checkSignInPageIsLoaded();
    }
}
