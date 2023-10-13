package pages.login;

import org.testng.Assert;
import utility.Constant;
import elements.login.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    private final LoginPageElements elements;


    public LoginPage(WebDriver driver, WebDriverWait wait, LoginPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void getToLoginPage() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);
    }

    //temporally changed the url
    public String loginToSite() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        hoverOverElement(elements.accountIcon);
        String userName = waitElementIsVisible(elements.userNameInAccountDropDown).getText();
        return userName;
    }

    public void checkUserSignedInSuccessfully() {
        hoverOverElement(elements.accountIcon);
        String userName = waitElementIsVisible(elements.userNameInAccountDropDown).getText();
        Assert.assertEquals(userName, Constant.actualShippingAddressData.FIRST_NAME + " " + Constant.actualShippingAddressData.LAST_NAME);
    }

    public void logOutOfSite() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.logOutLink);
        clickOnElementIfReady(elements.logOutLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.signInLink);
        clickOnElementIfReady(elements.signInLink);

        waitElementIsVisible(elements.loginPageFormTitle);
    }

    public void checkContinueShoppingButtonIsWorkable() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.logOutLink);
        clickOnElementIfReady(elements.logOutLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.continueShoppingButton);
        clickOnElementIfReady(elements.continueShoppingButton);
        waitElementIsVisible(elements.accountIcon);
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.signInLinkInAccountDropDown);
        clickOnElementIfReady(elements.signInLinkInAccountDropDown);
        waitElementIsVisible(elements.loginPageFormTitle);
    }

    public void signInUsingFacebook() {
        waitElementIsVisible(elements.signInUsingFacebookButton);
        clickOnElementIfReady(elements.signInUsingFacebookButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.acceptCookiesButtonFacebook);
        clickOnElementIfReady(elements.acceptCookiesButtonFacebook);
        waitForJSToBeLoaded();

        driver.close();
        switchToDefaultWindow();

//        waitElementIsVisible(elements.emailFieldFacebook).clear();
//        waitElementIsVisible(elements.emailFieldFacebook).sendKeys(Constant.Credentials.FACEBOOK_LOGIN);
//        waitElementIsVisible(elements.passwordFieldFacebook).clear();
//        waitElementIsVisible(elements.passwordFieldFacebook).sendKeys(Constant.Credentials.FACEBOOK_PASSWORD);
//
//        waitElementIsVisible(elements.loginButtonFacebook);
//        clickOnElementIfReady(elements.loginButtonFacebook);
//        waitForJSToBeLoaded();
//
//        switchToDefaultWindow();
//
//        waitElementIsVisible(elements.accountIcon);
//        hoverOverElement(elements.accountIcon);
//        String userName = waitElementIsVisible(elements.userNameInAccountDropDown).getText();
//
//        Assert.assertEquals(userName, Constant.TextsOnElements.USER_NAME);
    }

    public void checkSignInUsingGoogleButtonWorksProperly() {
        waitElementIsVisible(elements.signInUsingGoogleButton);
        clickOnElementIfReady(elements.signInUsingGoogleButton);

        switchToNewWindow();

        waitElementIsVisible(elements.emailFieldGoogle);
        driver.close();

        switchToDefaultWindow();
    }

    public void forgotPasswordLinkWorksProperly() {
        waitElementIsVisible(elements.forgotPasswordLink);
        clickOnElementIfReady(elements.forgotPasswordLink);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.forgotPasswordPageTitle);
    }

    public void createAnAccountButtonWorksProperly() {
        waitElementIsVisible(elements.createAnAccountButton);
        clickOnElementIfReady(elements.createAnAccountButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.createAccountPageTitle);
    }

    public void checkShopBusinessChecksAndSuppliesWorksProperly() {
        waitElementIsVisible(elements.shopBusinessChecksAndSuppliesButton);
        clickOnElementIfReady(elements.shopBusinessChecksAndSuppliesButton);
        waitForJSToBeLoaded();

        switchToNewWindow();

        waitElementIsVisible(elements.acceptAllCookiesButtonShopAndChecksPage);
        clickOnElementIfReady(elements.acceptAllCookiesButtonShopAndChecksPage);

        waitElementIsVisible(elements.checksMainHeader);

        driver.close();
        switchToDefaultWindow();
    }

    public void checkLiveChatLinkWorksProperly() {
        waitElementIsVisible(elements.liveChatLink);

        for (int i = 0; i < 11; i++) {
            clickOnElementIfReady(elements.liveChatLink);
        }
        waitForJSToBeLoaded();

        switchToFrame(elements.liveChatFrame);

        waitElementIsVisible(elements.liveChatPopUpWindowTitle);
    }

    public void checkLoginUsingWrongCredentialsRespond1() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.wrongCredentialsWarningMessage);
    }

    public void checkLoginUsingWrongCredentialsRespond2() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.NON_VALID_PASSWORD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.wrongCredentialsWarningMessage);
    }

    public void checkLoginUsingWrongCredentialsRespond3() {
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        waitElementIsVisible(elements.emailField).clear();
        waitElementIsVisible(elements.emailField).sendKeys(Constant.Credentials.NON_VALID_LOGIN);

        waitElementIsVisible(elements.passwordField).clear();
        waitElementIsVisible(elements.passwordField).sendKeys(Constant.Credentials.PASSWORD_US_PREPROD);

        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        waitElementIsVisible(elements.wrongCredentialsWarningMessage);
    }

    public void checkEmptyEmailFieldRespond() {
        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        String cssAttribute = waitElementIsVisible(elements.emailField).getCssValue("background-color");
        waitElementIsVisible(elements.emailAddressRequiredLabel);

        Assert.assertEquals(cssAttribute, "rgba(255, 183, 183, 1)");

    }

    public void checkEmptyPasswordFieldRespond() {
        waitElementIsVisible(elements.signInButton);
        clickOnElementIfReady(elements.signInButton);
        waitForJSToBeLoaded();

        String cssAttribute = waitElementIsVisible(elements.passwordField).getCssValue("background-color");
        waitElementIsVisible(elements.passwordRequiredLabel);

        Assert.assertEquals(cssAttribute, "rgba(255, 183, 183, 1)");
    }

    public void getToHomePageNotLogIn() {
        //goes to 1D 'Sign In' page
        openPage(Constant.UrlsToInteract.SIGN_IN_URL_1D_US_PREPROD);
        waitElementIsVisible(elements.loginPageFormTitle);

        //click 'Ok' on 'Accept Cookies' banner
        waitElementIsVisible(elements.acceptCookiesMainBannerOkButton);
        clickOnElementIfReady(elements.acceptCookiesMainBannerOkButton);

        //click on main logo
        waitElementIsVisible(elements.mainLogoLink);
        clickOnElementIfReady(elements.mainLogoLink);
        waitForJSToBeLoaded();

        //checks home page is loaded
        waitElementIsVisible(elements.homePageMainTitle);
    }

    public void checkGuestsSignInPageIsLoaded() {
        waitElementIsVisible(elements.guestsSignInTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkSignInPageIsLoaded() {
        waitElementIsVisible(elements.loginPageFormTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }
}
