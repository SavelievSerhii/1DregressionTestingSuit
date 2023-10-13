package tests.shoppingCart;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class YourShoppingCartPageTests extends BaseTest {


    @Test(retryAnalyzer = Retry.class)
    public void test_01_addCustomizedProductToCartDesigner() {
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
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_checkSaveForLaterButton() {
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
        yourShoppingCartPage.checkSaveForLaterButton();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkRemoveButtons() {
        loginPage.loginToSite();
        yourShoppingCartPage.getToShoppingCart();
        yourShoppingCartPage.checkRemoveButtons();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_addCustomizedProductToCartCustomizer() {
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
    public void test_05_checkModifyButton() {
        loginPage.loginToSite();
        yourShoppingCartPage.getToShoppingCart();
        yourShoppingCartPage.checkModifyButton();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_addCustomizedProductToCartW2PConfigurator() {
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

    @Test
    public void test_07_checkDiscountCodes() {
        loginPage.loginToSite();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelCustomizer();
        productDescriptionPage.getToCustomizerPage();
        customizerPage.fillAllNecessaryFieldsTShirts();
        customizerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.checkDiscountCodes();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_checkNavigation() {
        loginPage.loginToSite();
        yourShoppingCartPage.getToShoppingCart();
        yourShoppingCartPage.checkNavigation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_checkoutButtonIsWorkable() {
        loginPage.loginToSite();
        yourShoppingCartPage.getToShoppingCart();
        yourShoppingCartPage.clickOnCheckoutButton();
        checkoutPage.verifyCheckoutIsLoaded();
    }
}
