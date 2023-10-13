package tests.base;

import elements.PDP.ProductDescriptionPageElements;
import elements.W2PConfigurator.W2PConfiguratorPageElements;
import elements.billingInformation.BillingInformationPageElements;
import elements.changeEmailAddress.ChangeEmailAddressPageElements;
import elements.changePassword.ChangePasswordPageElements;
import elements.checkout.CheckoutPageElements;
import elements.comparisons.ComparisonsPageElements;
import elements.customizer.CustomizerPageElements;
import elements.designer.DesignerPageElements;
import elements.login.LoginPageElements;
import elements.PLP.ProductListingPageElements;
import elements.quoteCart.QuoteCartPageElements;
import elements.sampleCart.SampleCartPageElements;
import elements.shippingAddresses.ShippingAddressesPageElements;
import elements.shoppingCart.YourShoppingCartPageElements;
import elements.wishlist.WishlistPageElements;
import elements.yourImages.YourImagesPageElements;
import elements.yourPersonalizedGallery.YourPersonalizedGalleryElements;
import elements.yourProductsReviews.YourProductsReviewsPageElements;
import elements.yourWishlists.YourWishlistPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import pages.PDP.ProductDescriptionPage;
import pages.W2PConfigurator.W2PConfiguratorPage;
import pages.billingInformation.BillingInformationPage;
import pages.changeEmailAddress.ChangeEmailAddressPage;
import pages.changePassword.ChangePasswordPage;
import pages.checkout.CheckoutPage;
import pages.comparisons.ComparisonsPage;
import pages.customizer.CustomizerPage;
import pages.designer.DesignerPage;
import pages.login.LoginPage;
import pages.PLP.ProductListingPage;
import pages.quoteCart.QuoteCartPage;
import pages.sampleCart.SampleCartPage;
import pages.shippingAddresses.ShippingAddressesPage;
import pages.shoppingCart.YourShoppingCartPage;
import pages.wishlist.WishlistPage;
import pages.yourImages.YourImagesPage;
import pages.yourPersonalizedGallery.YourPersonalizedGalleryPage;
import pages.yourProductReviews.YourProductReviewsPage;
import pages.yourWishlist.YourWishlistPage;
import utility.DriverInstances;
import utility.Settings;
import utility.WebDriverWaitHelper;

public class BaseTest {
    protected WebDriver driver = DriverInstances.createDriver();
    WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);


    //LoginPage
    public LoginPageElements loginPageElements = new LoginPageElements(driver);
    public LoginPage loginPage = new LoginPage(driver, wait, loginPageElements);

    //PLP
    public ProductListingPageElements productListingPageElements = new ProductListingPageElements(driver);
    public ProductListingPage productListingPage = new ProductListingPage(driver, wait, productListingPageElements);

    //PDP
    public ProductDescriptionPageElements productDescriptionPageElements = new ProductDescriptionPageElements(driver);
    public ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage(driver, wait, productDescriptionPageElements);

    //Designer page
    public DesignerPageElements designerPageElements = new DesignerPageElements(driver);
    public DesignerPage designerPage = new DesignerPage(driver, wait, designerPageElements);

    //Customizer page
    public CustomizerPageElements customizerPageElements = new CustomizerPageElements(driver);
    public CustomizerPage customizerPage = new CustomizerPage(driver, wait, customizerPageElements);

    //W2PConfigurator page
    public W2PConfiguratorPageElements w2PConfiguratorPageElements = new W2PConfiguratorPageElements(driver);
    public W2PConfiguratorPage w2PConfiguratorPage = new W2PConfiguratorPage(driver, wait, w2PConfiguratorPageElements);

    //Your Shopping Cart page
    public YourShoppingCartPageElements yourShoppingCartPageElements = new YourShoppingCartPageElements(driver);
    public YourShoppingCartPage yourShoppingCartPage = new YourShoppingCartPage(driver, wait, yourShoppingCartPageElements);

    //Checkout page
    public CheckoutPageElements checkoutPageElements = new CheckoutPageElements(driver);
    public CheckoutPage checkoutPage = new CheckoutPage(driver,wait,checkoutPageElements);

    //Quote Cart page
    public QuoteCartPageElements quoteCartElements = new QuoteCartPageElements(driver);
    public QuoteCartPage quoteCartPage = new QuoteCartPage(driver, wait, quoteCartElements);

    //Sample Cart page
    public SampleCartPageElements sampleCartElements = new SampleCartPageElements(driver);
    public SampleCartPage sampleCartPage = new SampleCartPage(driver, wait, sampleCartElements);

    //Change Email Address Page
    public ChangeEmailAddressPageElements changeEmailAddressElements = new ChangeEmailAddressPageElements(driver);
    public ChangeEmailAddressPage changeEmailAddressPage = new ChangeEmailAddressPage(driver, wait, changeEmailAddressElements);

    //Change Password Page
    public ChangePasswordPageElements changePasswordElements = new ChangePasswordPageElements(driver);
    public ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver,wait, changePasswordElements);

    //Shipping Addresses Page
    public ShippingAddressesPageElements shippingAddressesPageElements = new ShippingAddressesPageElements(driver);
    public ShippingAddressesPage shippingAddressesPage = new ShippingAddressesPage(driver, wait, shippingAddressesPageElements);

    //Billing Information Page
    public BillingInformationPageElements billingInformationElements = new BillingInformationPageElements(driver);
    public BillingInformationPage billingInformationPage = new BillingInformationPage(driver, wait, billingInformationElements);

    //Your Images Page
    public YourImagesPageElements yourImagesPageElements = new YourImagesPageElements(driver);
    public YourImagesPage yourImagesPage = new YourImagesPage(driver, wait, yourImagesPageElements);

    //Your Wish Lists Page
    public YourWishlistPageElements yourWishlistPageElements = new YourWishlistPageElements(driver);
    public YourWishlistPage yourWishlistPage = new YourWishlistPage(driver, wait, yourWishlistPageElements);

    //Your Product Reviews Page
    public YourProductsReviewsPageElements yourProductsReviewsPageElements = new YourProductsReviewsPageElements(driver);
    public YourProductReviewsPage yourProductReviewsPage = new YourProductReviewsPage(driver, wait, yourProductsReviewsPageElements);

    //Comparisons Page
    public ComparisonsPageElements comparisonsPageElements = new ComparisonsPageElements(driver);
    public ComparisonsPage comparisonsPage = new ComparisonsPage(driver, wait, comparisonsPageElements);

    //Wishlist Page
    public WishlistPageElements wishlistPageElements = new WishlistPageElements(driver);
    public WishlistPage wishlistPage = new WishlistPage(driver, wait, wishlistPageElements);

    //Your Personalized Gallery Page
    public YourPersonalizedGalleryElements yourPersonalizedGalleryElements = new YourPersonalizedGalleryElements(driver);
    public YourPersonalizedGalleryPage yourPersonalizedGalleryPage = new YourPersonalizedGalleryPage(driver, wait, yourPersonalizedGalleryElements);




    @AfterMethod
    public void clearCookiesAndLocalStorage() {
        if (Settings.CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser() {
        if (Settings.HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
