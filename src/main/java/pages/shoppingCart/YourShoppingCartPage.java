package pages.shoppingCart;

import elements.shoppingCart.YourShoppingCartPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import utility.Constant;

public class YourShoppingCartPage extends BasePage {

    YourShoppingCartPageElements elements;
    public YourShoppingCartPage(WebDriver driver, WebDriverWait wait, YourShoppingCartPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void verifyShoppingCartIsLoaded() {
        //check the title of the page
        waitElementIsVisible(elements.shoppingCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void getToShoppingCart() {
        //find and click on shopping cart icon on home page
        hoverOverElement(elements.cartIcon);
        waitElementIsVisible(elements.shoppingCartIcon);
        clickOnElementIfReady(elements.shoppingCartIcon);
        waitForJSToBeLoaded();

        //make sure that shopping cart is loaded properly
        waitElementIsVisible(elements.shoppingCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkDiscountCodes() {
        //VALID DISCOUNT
        //apply valid discount code
        jsScrollDown();
        waitElementIsVisible(elements.discountCodeLabel);
        clickOnElementIfReady(elements.discountCodeInputField).clear();
        clickOnElementIfReady(elements.discountCodeInputField).sendKeys(Constant.Discounts.VALID_DISCOUNT);

        //click on 'Apply' button
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //click on 'Remove' button
        clickOnElementIfReady(elements.discountCodeRemoveButton);
        waitForJSToBeLoaded();

        //apply valid discount code
        waitElementIsVisible(elements.discountCodeLabel);
        clickOnElementIfReady(elements.discountCodeInputField).clear();
        clickOnElementIfReady(elements.discountCodeInputField).sendKeys(Constant.Discounts.VALID_DISCOUNT);

        //click on 'Apply' button
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //find 'Discount code will be applied at checkout' label
        waitElementIsVisible(elements.discountCodeAppliedLabel);
        waitElementIsVisible(elements.discountCodeAppliedLabel);

        //click on 'Remove' button
        clickOnElementIfReady(elements.discountCodeRemoveButton);
        waitForJSToBeLoaded();

        //INVALID DISCOUNT
        //apply invalid discount code
        waitElementIsVisible(elements.discountCodeLabel);
        clickOnElementIfReady(elements.discountCodeInputField).clear();
        clickOnElementIfReady(elements.discountCodeInputField).sendKeys(Constant.Discounts.INVALID_DISCOUNT);

        //click on 'Apply' button
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //check the sign matches the requirement
        jsScrollDown();
        waitElementIsVisible(elements.discountCodeDoesNotMatchLable);

        //check cross button on the label
        clickOnElementIfReady(elements.discountCodeLabelCrossButton);

        //click on 'Apply' button again
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //check the sign matches the requirement
        jsScroll(elements.discountCodeDoesNotMatchLable);
        waitElementIsVisible(elements.discountCodeDoesNotMatchLable);

        //EXPIRED DISCOUNT
        //apply expired discount code
        waitElementIsVisible(elements.discountCodeLabel);
        clickOnElementIfReady(elements.discountCodeInputField).clear();
        clickOnElementIfReady(elements.discountCodeInputField).sendKeys(Constant.Discounts.EXPIRED_DISCOUNT);

        //click on 'Apply' button
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //check the sign matches the requirement
        jsScroll(elements.discountCodeExpiredLabel);
        waitElementIsVisible(elements.discountCodeExpiredLabel);

        //check cross button on the label
        clickOnElementIfReady(elements.discountCodeLabelCrossButton);

        //click on 'Apply' button again
        clickOnElementIfReady(elements.discountCodeApplyButton);
        waitForJSToBeLoaded();

        //check the sign matches the requirement
        jsScroll(elements.discountCodeExpiredLabel);
        waitElementIsVisible(elements.discountCodeExpiredLabel);
    }

    public void checkNavigation() {
        //click on link (name of product)
        waitElementIsVisible(elements.nameOfProductShoppingCart);
        clickOnElementIfReady(elements.nameOfProductShoppingCart);
        waitForJSToBeLoaded();

        //find and click on shopping cart icon on home page
        hoverOverElement(elements.cartIcon);
        waitElementIsVisible(elements.shoppingCartIcon);
        clickOnElementIfReady(elements.shoppingCartIcon);
        waitForJSToBeLoaded();

        //check the title of the page
        waitElementIsVisible(elements.shoppingCartTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkSaveForLaterButton() {
        hoverOverElement(elements.cartIcon);
        String counterString1 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        int parseInt = Integer.parseInt(counterString1);

        if (parseInt == 1) System.out.println("There is a product in the shopping cart.");
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        waitElementIsVisible(elements.saveForLaterButton);
        clickOnElementIfReady(elements.saveForLaterButton);
        waitForJSToBeLoaded();

        hoverOverElement(elements.cartIcon);
        String counterString2 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        int parseInt2 = Integer.parseInt(counterString2);

        if (parseInt2 == 0) System.out.println("The shopping cart is empty.");
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        waitElementIsVisible(elements.moveToCartButton);
        clickOnElementIfReady(elements.moveToCartButton);
        waitForJSToBeLoaded();

        hoverOverElement(elements.cartIcon);
        String counterString3 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        int parseInt3 = Integer.parseInt(counterString3);

        if (parseInt3 == 1) System.out.println("The shopping cart is not empty. Counter works properly");
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkRemoveButtons() {
        //check counter
        hoverOverElement(elements.cartIcon);
        String text1 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        System.out.println("There are " + text1 + " item(s)" + " in the shopping cart");

        //click on 'Save For Later' button
        waitElementIsVisible(elements.saveForLaterButton);
        clickOnElementIfReady(elements.saveForLaterButton);
        waitForJSToBeLoaded();

        //1st
        //click on 'Remove' in 'Save for Later' cart
        waitElementIsVisible(elements.removeFromSaveForLaterButton);
        clickOnElementIfReady(elements.removeFromSaveForLaterButton);
        waitForJSToBeLoaded();

        //click on cross button on modal window
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'Remove' in 'Save for Later' cart
        waitElementIsVisible(elements.removeFromSaveForLaterButton);
        clickOnElementIfReady(elements.removeFromSaveForLaterButton);
        waitForJSToBeLoaded();

        //click on 'Cancel' button
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'Remove' in 'Save for Later' cart
        waitElementIsVisible(elements.removeFromSaveForLaterButton);
        clickOnElementIfReady(elements.removeFromSaveForLaterButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button on modal window
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowOkButton);
        waitForJSToBeLoaded();

        //check counter
        hoverOverElement(elements.cartIcon);
        String text2 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        System.out.println("There are " + text2 + " item(s)" + " in the shopping cart");

        //refresh shopping cart
        clickOnElementIfReady(elements.cartIcon);
        waitForJSToBeLoaded();

        //2nd
        //click on 'Remove' button in Shopping Cart
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on cross button on modal window
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowCrossButton);
        waitForJSToBeLoaded();

        //click on 'Remove' button in Shopping Cart
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on 'Cancel' button
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowCancelButton);
        waitForJSToBeLoaded();

        //click on 'Remove' button in Shopping Cart
        waitElementIsVisible(elements.removeButton);
        clickOnElementIfReady(elements.removeButton);
        waitForJSToBeLoaded();

        //click on 'Ok' button on modal window
        waitElementIsVisible(elements.removeModalWindowContent);
        clickOnElementIfReady(elements.removeModalWindowOkButton);
        waitForJSToBeLoaded();

        //check counter
        hoverOverElement(elements.cartIcon);
        String text3 = waitElementIsVisible(elements.shoppingCartCounter).getText();
        System.out.println("There are " + text3 + " item(s)" + " in the shopping cart");

        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }

    public void checkModifyButton() {
        //click on 'Modify' button
        waitElementIsVisible(elements.modifyButton);
        clickOnElementIfReady(elements.modifyButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void clickOnCheckoutButton() {
        waitElementIsVisible(elements.checkoutButton);
        clickOnElementIfReady(elements.checkoutButton);
        waitForJSToBeLoaded();
    }


    public void checkSignInCreateAccountLinks() {
        //check create account link
        //click on 'Create one' link
        waitElementIsVisible(elements.createOneLinkShoppingCartAsGuest);
        clickOnElementIfReady(elements.createOneLinkShoppingCartAsGuest);
        waitForJSToBeLoaded();
        waitElementIsVisible(elements.createAccountPageTitle);

        //check proper respond
        waitElementIsVisible(elements.nextButtonCreateAccountPage);
        clickOnElementIfReady(elements.nextButtonCreateAccountPage);
        waitForJSToBeLoaded();

        //check sign 'Please improve you are not a robot' appears
        waitElementIsVisible(elements.pleaseImproveYouAreNotARobotSign);

        //get back to a shopping cart
        driver.navigate().back();

        //click on 'Sign In' link
        waitElementIsVisible(elements.signInLinkShoppingCartAsGuest);
        clickOnElementIfReady(elements.signInLinkShoppingCartAsGuest);
        waitForJSToBeLoaded();
    }
}
