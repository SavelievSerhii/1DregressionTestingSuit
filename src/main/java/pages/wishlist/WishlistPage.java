package pages.wishlist;

import elements.wishlist.WishlistPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;


public class WishlistPage extends BasePage {

    WishlistPageElements elements;

    public WishlistPage(WebDriver driver, WebDriverWait wait, WishlistPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void getToWishlist() {
        //click on 'Wishlist' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.wishlistLink);
        clickOnElementIfReady(elements.wishlistLink);
        waitForJSToBeLoaded();

        //check 'Wishlist' is loaded without any issues
        waitElementIsVisible(elements.wishlistPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkNavigationBreadcrumb() {
        //check 'Your Account' breadcrumb link
        waitElementIsVisible(elements.wishlistYourAccountBreadcrumbLink);
        clickOnElementIfReady(elements.wishlistYourAccountBreadcrumbLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.yourProfileTitle);

        //click on 'Comparisons' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.wishlistLink);
        clickOnElementIfReady(elements.wishlistLink);
        waitForJSToBeLoaded();

        //check 'Home' breadcrumb link
        waitElementIsVisible(elements.wishlistHomeBreadcrumbLink);
        clickOnElementIfReady(elements.wishlistHomeBreadcrumbLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.homePageMainTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkShareWishlistViaEmailFunctionality() {
        //choose the first wishlist in a row
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);
        waitForJSToBeLoaded();

        //click on email button
        clickOnElementIfReady(elements.wishlistShareViaEmailButton);
        waitForJSToBeLoaded();

        //click on cross button on modal window
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowTitle);
        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowCrossButton);
        waitForJSToBeLoaded();

        //negative testing (first scenario)
        //click on email button
        clickOnElementIfReady(elements.wishlistShareViaEmailButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailToField).clear();
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailFromField).clear();

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowSendEmailButton);

        String text = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowToEmailErrorLabel).getText();
        String text1 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowFromEmailErrorLabel).getText();

        Assert.assertEquals(text, "To email address is required");
        Assert.assertEquals(text1, "From email address is required");

        String cssValue = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailToField).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailFromField).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        //negative testing (second scenario)
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailToField).clear();
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailFromField).clear();

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowEmailToField).sendKeys("GFL");
        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowEmailFromField).sendKeys("GFL");

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowSendEmailButton);

        String text2 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowToEmailErrorLabel).getText();
        String text3 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowFromEmailErrorLabel).getText();

        Assert.assertEquals(text2, "One or more email addresses are invalid");
        Assert.assertEquals(text3, "Email address must be in the format of name@domain.com");


        String cssValue2 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailToField).getCssValue("background-color");
        String cssValue3 = waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailFromField).getCssValue("background-color");

        Assert.assertEquals(cssValue2, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue3, "rgba(255, 183, 183, 1)");

        //check reCAPTCHA
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailToField).clear();
        waitElementIsVisible(elements.wishlistShareViaEmailModalWindowEmailFromField).clear();

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowEmailToField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_EMAIL);
        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowEmailFromField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowSendEmailButton);

        waitElementIsVisible(elements.reCAPTCHATitle);
        clickOnElementIfReady(elements.reCAPTCHACrossButton);

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowSendEmailButton);

        waitElementIsVisible(elements.reCAPTCHATitle);
        clickOnElementIfReady(elements.reCAPTCHAOkButton);

        clickOnElementIfReady(elements.wishlistShareViaEmailModalWindowCrossButton);
    }

    public void checkMakeWishlistPublicFunctionality() {
        //click on first in a row wishlist
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);

        //click on 'Make this list public to share' button
        waitElementIsVisible(elements.wishlistShareViaEmailMakeThisListPublicToShareButton);
        clickOnElementIfReady(elements.wishlistShareViaEmailMakeThisListPublicToShareButton);
        waitForJSToBeLoaded();

        //click on cross button on edit wishlist modal window
        waitElementIsVisible(elements.editWishlistModalWindowTitle);
        clickOnElementIfReady(elements.editWishlistModalWindowCrossButton);

        //click on 'Make this list public to share' button
        clickOnElementIfReady(elements.wishlistShareViaEmailMakeThisListPublicToShareButton);
        waitForJSToBeLoaded();

        //click on cross button on edit wishlist modal window
        waitElementIsVisible(elements.editWishlistModalWindowTitle);
        clickOnElementIfReady(elements.editWishlistModalWindowCloseButton);

        //click on 'Make this list public to share' button
        clickOnElementIfReady(elements.wishlistShareViaEmailMakeThisListPublicToShareButton);
        waitForJSToBeLoaded();

        //change wishlist name
        waitElementIsVisible(elements.editWishlistModalWindowWishlistNameField).clear();
        clickOnElementIfReady(elements.editWishlistModalWindowWishlistNameField).sendKeys("GFL Wishlist");

        clickOnElementIfReady(elements.editWishlistModalWindowPublicRadioButton);
        clickOnElementIfReady(elements.editWishlistModalWindowSaveChangesButton);

        waitElementIsVisible(elements.listUpdatedInformationMessage);

        //check 'Share' button
        clickOnElementIfReady(elements.wishlistShareButton);

        waitElementIsVisible(elements.wishlistShareModalWindowTitle);
        clickOnElementIfReady(elements.wishlistShareModalWindowCrossButton);

        //check 'Copy Link' button
        clickOnElementIfReady(elements.wishlistCopyLinkButton);

        waitElementIsVisible(elements.wishlistCopyLinkModalWindowTitle);
        clickOnElementIfReady(elements.wishlistCopyLinkModalWindowCrossButton);

        clickOnElementIfReady(elements.wishlistCopyLinkButton);

        waitElementIsVisible(elements.wishlistCopyLinkModalWindowTitle);
        clickOnElementIfReady(elements.wishlistCopyLinkModalWindowCloseButton);

        clickOnElementIfReady(elements.wishlistCopyLinkButton);

        waitElementIsVisible(elements.wishlistCopyLinkModalWindowTitle);
        String value = clickOnElementIfReady(elements.wishlistCopyLinkModalWindowLinkField).getAttribute("value");

        driver.navigate().to(value);

        String text = waitElementIsVisible(elements.wishlistInNewWindowTitle).getText();

        Assert.assertEquals(text, "GFL Wishlist");

        driver.navigate().back();

        waitElementIsVisible(elements.wishlistPageTitle);
    }

    public void checkCompareProductFunctionality() {
        //click on first in a row wishlist
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);

        //click on 'Compare product' button
        clickOnElementIfReady(elements.compareProductButton);

        //click on 'Ok' button on modal window
        waitElementIsVisible(elements.compareProductModalWindowOkButton);
        clickOnElementIfReady(elements.compareProductModalWindowOkButton);

        //click on 'Compare product' button
        clickOnElementIfReady(elements.compareProductButton);

        //click on cross button on modal window
        waitElementIsVisible(elements.informationMessageOnCompareProductModalWindow);
        clickOnElementIfReady(elements.compareProductModalWindowCrossButton);

        //click on 'Compare product' button
        clickOnElementIfReady(elements.compareProductButton);

        //click on 'View Comparisons' button on modal window
        String productNameWishlist = waitElementIsVisible(elements.wishlistProductName).getText();
        waitElementIsVisible(elements.informationMessageOnCompareProductModalWindow);
        clickOnElementIfReady(elements.compareProductModalWindowViewComparisonsButton);

        //wait for 'Comparisons' page to open
        waitElementIsVisible(elements.comparisonsPageTitle);

        //compare product's names on both pages
        String productNameComparisons = waitElementIsVisible(elements.comparisonsProductName).getText();
        Assert.assertEquals(productNameWishlist, productNameComparisons);

    }

    public void deleteProductFromWishlist() {
        //click on first in a row wishlist
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);

        //click on 'Remove' button
        waitElementIsVisible(elements.removeProductButton);
        clickOnElementIfReady(elements.removeProductButton);

        //click on 'Wishlist' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.wishlistLink);
        clickOnElementIfReady(elements.wishlistLink);
        waitForJSToBeLoaded();

        //click on first in a row wishlist
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);

        //check wishlist's counter
        String wishlistCounter = waitElementIsVisible(elements.wishlistCounter).getText();
        Assert.assertEquals(wishlistCounter, "0");
    }

    public void deleteWishlist() {
        //click on first in a row wishlist
        waitElementIsVisible(elements.wishlistPageFirstInARowWishlist);
        clickOnElementIfReady(elements.wishlistPageFirstInARowWishlist);

        //click on 'Delete' button
        clickOnElementIfReady(elements.wishlistPageDeleteButton);

        //click on cross on modal window
        waitElementIsVisible(elements.deleteWishlistModalWindowTitle);
        clickOnElementIfReady(elements.deleteWishlistModalWindowCrossButton);

        //click on 'Delete' button
        clickOnElementIfReady(elements.wishlistPageDeleteButton);

        //click on 'No' button on modal window
        waitElementIsVisible(elements.deleteWishlistModalWindowTitle);
        clickOnElementIfReady(elements.deleteWishlistModalWindowNoButton);

        //click on 'Delete' button
        clickOnElementIfReady(elements.wishlistPageDeleteButton);

        //click on 'Yes' button on modal window
        waitElementIsVisible(elements.deleteWishlistModalWindowTitle);
        clickOnElementIfReady(elements.deleteWishlistModalWindowYesButton);

        //check 'List Deleted' information banner
        waitElementIsVisible(elements.deleteWishlistInformationMessage);
    }
}
