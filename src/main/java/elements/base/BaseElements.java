package elements.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseElements {

    public BaseElements (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /*****************************BASE ELEMENTS THROWOUT THE SITE*****************************/

    @FindBy(xpath = "//h1[contains(.,'Custom Branded Promotional Products & Marketing Materials')]")
    public WebElement homePageMainTitle;

    @FindBy(xpath = "//span[@class='icon-header-account']")
    public WebElement accountIcon;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right cart-bar']/li[4]/a[1]/span[@class='icon-header-account']")
    public WebElement accountIcon2;

    @FindBy(xpath = "//ul[@class='dropdown-menu account-dropdown-list']/li[4]/a[contains(.,'My Account')]")
    public WebElement myAccountLink;

    @FindBy(xpath = "//span[@class='icon-header-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[1]/a[contains(.,'Cart')]")
    public WebElement shoppingCartIcon;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[2]/a[contains(.,'Quotes')]")
    public WebElement quoteCartIcon;

    @FindBy(xpath = "//a[contains(.,'Sign In')]")
    public WebElement signInLinkInAccountDropDown;

    @FindBy(xpath = "//a[@href='/products/secure/myaccount/signout/']")
    public WebElement logOutLink;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right cart-bar']/li[4]/ul[1]/li[6]/a[contains(.,' Comparisons ')]")
    public WebElement comparisonsLink;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right cart-bar']/li[4]/ul[1]/li[5]/a[contains(.,'Wishlist')]")
    public WebElement wishlistLink;

    @FindBy(xpath = "//span[@id='top-nav-name']")
    public WebElement userNameInAccountDropDown;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookiesMainBannerOkButton;


    /*******************************NAVIGATION*******************************/

    /*******************************PROMOTIONAL PRODUCTS & APPAREL******************************/

    @FindBy(xpath = "//li[2]//a[contains(.,' Promotional Products & Apparel ')]")
    public WebElement promotionalProductsNavigationBar;

    @FindBy(xpath = "//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Apparel')]")
    public WebElement apparelOptionOfPromotionalProducts;

    /*******************************PRINT MARKETING******************************/

    @FindBy(xpath = "//div[@class='navbar-container']/div[3]/nav[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    public WebElement printMarketingNavigationBar;

    @FindBy(xpath = "//main[@id='main-content']/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement businessCardsLink;

    @FindBy(xpath = "//main[@id='main-content']/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement customPostcardsLink;

    @FindBy(xpath = "//main[@id='main-content']/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]")
    public WebElement customCoastersLink;


    //My Account links
    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement changeEmailAddressLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement changePasswordLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    public WebElement shippingAddressesLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    public WebElement billingInformationLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement yourImagesLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    public WebElement yourWishListsLink;

    @FindBy(xpath = "//main[@id='main-content']/div/div[3]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    public WebElement yourProductReviewsLink;




}
