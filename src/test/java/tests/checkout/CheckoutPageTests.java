package tests.checkout;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class CheckoutPageTests extends BaseTest {


    @Test(retryAnalyzer = Retry.class)
    public void test_01_verifyCheckoutPageIsLoaded() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkNavigation() {
        loginPage.loginToSite();
        yourShoppingCartPage.getToShoppingCart();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutIsLoaded();
        checkoutPage.checkNavigation();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_chooseSavedShippingAddress() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.fillAllNecessaryFieldsCap();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutIsLoaded();
        checkoutPage.chooseSaveShippingAddress();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_chooseNewShippingAddressPlaceOrder() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.addArtworkToProduct();
        customizerPage.addClipartToProduct();
        customizerPage.addTextToProduct();
        customizerPage.fillAllNecessaryFieldsCap();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutIsLoaded();
        checkoutPage.chooseNewShippingAddress();
        checkoutPage.fillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05a_placeOrderBusinessCard() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.checkCreditCardProcedure();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_05b_placeOrderApparel() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.checkCreditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05c_placeOrderTShirt() {
        loginPage.loginToSite();
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05d_placeOrderOutwear() {
        loginPage.loginToSite();
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05e_placeOrderHatsAndOtherHeadwear() {
        loginPage.loginToSite();
        productListingPage.getToPLPHatsAndOtherHeadwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFieldsHats();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05f_placeOrderPoloShirt() {
        loginPage.loginToSite();
        productListingPage.getToPLPPoloShirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05g_placeOrderSweatshirt() {
        loginPage.loginToSite();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.creditCardProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkPayPalProcedure() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.checkPayPalButton();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_07_checkGooglePayProcedure() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutPageIsLoadedFillInAllNecessaryData();
        checkoutPage.checkGooglePayButton();
    }

}
