package tests.W2PConfigurator;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class W2PConfiguratorPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToW2PConfiguratorPage() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.verifyW2PConfiguratorPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addImageToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_addImageToProductNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProductNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_addClipartToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addClipartToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_addTextToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addTextToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkCustomizerProcedureBusinessCard() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_addCustomizedProductToCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_addCustomizedProductToCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPCustomCoasters();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextForCustomCoasters();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_addCustomizedProductToCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPCustomPostcards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_checkNavigation() {
        loginPage.loginToSite();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.verifyW2PConfiguratorPageIsLoaded();
        w2PConfiguratorPage.checkNavigation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_addArtworkW2PConfiguratorAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPCustomPostcards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12_addTwoProductsToCartAsGuest() {
        //get to home page
        loginPage.getToHomePageNotLogIn();

        //add the first product to a shopping cart using W2P Configurator
        productListingPage.getToPLPCustomCoasters();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextForCustomCoasters();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();

        //add the second product to a shopping cart using W2P Configurator
        productListingPage.getToPLPCustomCoasters();
        productListingPage.getToPLPBusinessCards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_checkPlaceQuoteOrderAsGuestProcedure() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPCustomPostcards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        loginPage.checkGuestsSignInPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_14_checkSignInCreateAccountLinksShoppingCartAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPCustomPostcards();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        w2PConfiguratorPage.addImageToProduct();
        w2PConfiguratorPage.addClipartToProduct();
        w2PConfiguratorPage.addTextToProduct();
        w2PConfiguratorPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.checkSignInCreateAccountLinks();
        loginPage.checkSignInPageIsLoaded();
    }
}
