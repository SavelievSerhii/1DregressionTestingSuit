package pages.yourWishlist;

import elements.base.BaseElements;
import elements.yourWishlists.YourWishlistPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import utility.Constant;

public class YourWishlistPage extends BasePage {

    YourWishlistPageElements elements;

    public YourWishlistPage(WebDriver driver, WebDriverWait wait, YourWishlistPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void verifyYourWishlistsPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Your Wish Lists
        waitElementIsVisible(elements.yourWishListsLink);
        clickOnElementIfReady(elements.yourWishListsLink);
        waitForJSToBeLoaded();

        //check 'Your Wish Lists' page is loaded
        waitElementIsVisible(elements.yourWishlistsTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

    }

    public void checkNavigation() {
        //click on 'Your Account' breadcrumb link
        waitElementIsVisible(elements.yourAccountBreadcrumbLink);
        clickOnElementIfReady(elements.yourAccountBreadcrumbLink);
        waitForJSToBeLoaded();

        //click on 'Your Wish Lists
        waitElementIsVisible(elements.yourWishListsLink);
        clickOnElementIfReady(elements.yourWishListsLink);
        waitForJSToBeLoaded();

        //click on 'Home' breadcrumb link
        clickOnElementIfReady(elements.homePageBreadcrumbLink);
        waitForJSToBeLoaded();

        //wait Home page to be loaded
        waitElementIsVisible(elements.homePageMainTitle);
    }
}
