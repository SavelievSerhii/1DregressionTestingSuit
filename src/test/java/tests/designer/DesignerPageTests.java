package tests.designer;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class DesignerPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToDesignerPage() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_addArtworkToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_addArtworkToProductNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProductNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_addClipartToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_addTextToProduct() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addTextToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public  void test_06_chooseDifferentItemColor() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.chooseDifferentItemColor();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_fillAllNecessaryFields() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_08_addCustomizedProductToCart() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addClipartToProductUsingSearchField();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_09_fillAllNecessaryFieldsNegative() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.fillAllNecessaryFieldsNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_10_checkNeedHelpSection() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.checkNeedHelpSection();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_11_checkNavigation() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.checkProductLinkNavigation();
        productDescriptionPage.getToDesignerPage();
        designerPage.checkBackToProductLink();
        productDescriptionPage.getToDesignerPage();
        designerPage.checkLetUsDoItForYouLink();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_12a_checkDownloadButton() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.checkDownloadButtonsFunctionality();
    }
    @Test(retryAnalyzer = Retry.class)
    public void test_12b_checkPrintButton() {
        loginPage.loginToSite();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.checkPrintButtonFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_13_checkAddArtworkDesignerAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPApparel();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_14_addTwoProductsToCartAsGuest() {
        //get to home page
        loginPage.getToHomePageNotLogIn();

        //add 1st product to shopping cart
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();

        //add 2nd product to shopping cart
        productListingPage.getToPLPTShirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_15_checkPlaceOrderAsGuestProcedure() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.clickOnCheckoutButton();
        loginPage.checkGuestsSignInPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_16_checkSignInCreateAccountLinksShoppingCartAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPOutwear();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.addArtworkToProduct();
        designerPage.addClipartToProduct();
        designerPage.addTextToProduct();
        designerPage.fillAllNecessaryFields();
        designerPage.clickOnAddToCartButton();
        yourShoppingCartPage.verifyShoppingCartIsLoaded();
        yourShoppingCartPage.checkSignInCreateAccountLinks();
        loginPage.checkSignInPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_17_checkSignInProcedureViaDesigner() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.signInViaDesigner();
        loginPage.checkUserSignedInSuccessfully();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_18_checksSignInProcedureViaDesignerNegative() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.signInViaDesignerNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_19_checksSignInViaDesignerButtonsAreWorkableAsGuest() {
        loginPage.getToHomePageNotLogIn();
        productListingPage.getToPLPSweatshirts();
        productDescriptionPage.getToPDPApparelDesigner();
        productDescriptionPage.getToDesignerPage();
        designerPage.verifyDesignerPageIsLoaded();
        designerPage.checkSignInViaDesignerButtonsAreWorkable();
    }
}
