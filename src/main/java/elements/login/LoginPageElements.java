package elements.login;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements extends BaseElements {
//    public LoginPageElements(WebDriver driver) {
//        super(driver);
//    }
    public LoginPageElements (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************LOGIN PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//body[@class='center']/div/div[2]/a/img")
    public WebElement mainLogoLink;

    @FindBy(xpath = "//h1[contains(text(),'Sign In')]")
    public WebElement loginPageFormTitle;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@class='btn btn-primary btn-lg btn-block']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[contains(.,'Sign in')]")
    public WebElement signInLink;

    @FindBy(xpath = "//a[contains(.,'Continue shopping')]")
    public WebElement continueShoppingButton;


    /**************FACEBOOK AUXILIARY PAGE************/

    @FindBy(xpath = "//a[contains(.,' Sign in using Facebook')]")
    public WebElement signInUsingFacebookButton;

    @FindBy(xpath = "//button[contains(.,'Allow all cookies')]")
    public WebElement acceptCookiesButtonFacebook;

    @FindBy(id = "email")
    public WebElement emailFieldFacebook;

    @FindBy(id = "pass")
    public WebElement passwordFieldFacebook;

    @FindBy(name = "login")
    public WebElement loginButtonFacebook;

    /**************GOOGLE AUXILIARY PAGE************/

    @FindBy(id = "googleSignInBtn")
    public WebElement signInUsingGoogleButton;

    @FindBy(id = "identifierId")
    public WebElement emailFieldGoogle;


    /**************FORGOT PASSWORD************/
    @FindBy(xpath = "//a[contains(.,'Forgot password?')]")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//h1[contains(.,'Reset Password')]")
    public WebElement resetPasswordPageTitle;

    @FindBy(xpath = "//h1[contains(.,'Reset Password')]")
    public WebElement forgotPasswordPageTitle;


    /**************CREATE AN ACCOUNT************/

    @FindBy(xpath = "//a[contains(.,'Create an account')]")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//h1[contains(.,'  New Account Creation  ')]")
    public WebElement createAccountPageTitle;

    /**************SHOP BUSINESS CHECKS AND SUPPLIES************/
    @FindBy(xpath = "//a[contains(.,'Shop Business Checks and Supplies')]")
    public WebElement shopBusinessChecksAndSuppliesButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButtonShopAndChecksPage;

//    @FindBy(xpath = "//span[contains(.,'Account')]")
//    public WebElement accountIconShopAndChecksPage;

    @FindBy(xpath = "//h1[contains(.,'Deluxe Checks and Business Products: Trusted, Reliable, Secure')]")
    public WebElement checksMainHeader;


    /**************LIVE CHAT************/
    @FindBy(xpath = "//a[contains(.,'Live Chat')]")
    public WebElement liveChatLink;


    @FindBy(id = "chat-widget")
    public WebElement liveChatFrame;

    @FindBy(xpath = "//h1[contains(.,'Welcome to LiveChat')]")
    public WebElement liveChatPopUpWindowTitle;


    /**************WRONG CREDENTIALS TESTING************/
    @FindBy(xpath = "//span[contains(.,'Sorry, the email address and password you entered was not recognized.')]")
    public WebElement wrongCredentialsWarningMessage;

    /**************EMPTY CREDENTIALS TESTING************/

    @FindBy(id = "email-error")
    public WebElement emailAddressRequiredLabel;

    @FindBy(id = "password-error")
    public WebElement passwordRequiredLabel;

    //Guest
    @FindBy(xpath = "//h1[contains(.,'Guests')]")
    public WebElement guestsSignInTitle;
}
