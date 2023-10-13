package elements.wishlist;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPageElements extends BaseElements {

    public WishlistPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************WISHLIST PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Wishlist')]")
    public WebElement wishlistPageTitle;

    @FindBy(xpath = "//main[@id='main-content']/div[1]//div[5]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement wishlistPageFirstInARowWishlist;

    //breadcrumb links
    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement wishlistYourAccountBreadcrumbLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement wishlistHomeBreadcrumbLink;

    @FindBy(xpath = "//h3[contains(.,'Your Profile')]")
    public WebElement yourProfileTitle;

    //check share wishlist via email
    @FindBy(xpath = "//button[@class='btn btn-default btn-circle openEmailModal']")
    public WebElement wishlistShareViaEmailButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/span[contains(.,'Email')]")
    public WebElement wishlistShareViaEmailModalWindowTitle;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/button[1]")
    public WebElement wishlistShareViaEmailModalWindowCrossButton;

    //negative
    @FindBy(id = "emailTo")
    public WebElement wishlistShareViaEmailModalWindowEmailToField;

    @FindBy(id = "emailFrom")
    public WebElement wishlistShareViaEmailModalWindowEmailFromField;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[3]/div/div[2]/div[2]/input[@value='Send Email']")
    public WebElement wishlistShareViaEmailModalWindowSendEmailButton;

    @FindBy(id = "emailTo-error")
    public WebElement wishlistShareViaEmailModalWindowToEmailErrorLabel;

    @FindBy(id = "emailFrom-error")
    public WebElement wishlistShareViaEmailModalWindowFromEmailErrorLabel;

    //reCAPTCHA
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[@id='bootboxBody']")
    public WebElement reCAPTCHATitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/button")
    public WebElement reCAPTCHACrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button[1]")
    public WebElement reCAPTCHAOkButton;

    //make wishlist public
    @FindBy(xpath = "//button[@class='btn btn-danger btn-danger-ada btnEditWishList']")
    public WebElement wishlistShareViaEmailMakeThisListPublicToShareButton;

    @FindBy(xpath = "//div[@id='editModal']/form/div/div/div/div[@class='modal-title']")
    public WebElement editWishlistModalWindowTitle;

    @FindBy(xpath = "//div[@id='editModal']/form/div/div/div/button[1]")
    public WebElement editWishlistModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='editModal']/form/div/div/div[3]/button[1]")
    public WebElement editWishlistModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='editModal']/form/div/div/div[3]/input[@value='Save changes']")
    public WebElement editWishlistModalWindowSaveChangesButton;

    @FindBy(xpath = "//main[@id='main-content']/div/div[contains(.,'  List Updated')]")
    public WebElement listUpdatedInformationMessage;

    @FindBy(id = "cartname")
    public WebElement editWishlistModalWindowWishlistNameField;

    @FindBy(id = "public")
    public WebElement editWishlistModalWindowPublicRadioButton;


    //check share button
    @FindBy(id = "share_btn")
    public WebElement wishlistShareButton;

    @FindBy(xpath = "//div[@id='modal_share']/div/div/div/div[contains(.,'Share')]")
    public WebElement wishlistShareModalWindowTitle;

    @FindBy(xpath = "//div[@id='modal_share']/div/div/div/button[1]")
    public WebElement wishlistShareModalWindowCrossButton;

    //check 'Copy Link'
    @FindBy(xpath = "//button[@class='btn btn-default btn-circle']")
    public WebElement wishlistCopyLinkButton;

    @FindBy(xpath = "//div[@id='linkModal']/div/div/div/div[contains(.,'Public Link to Your Wish List')]")
    public WebElement wishlistCopyLinkModalWindowTitle;

    @FindBy(xpath = "//div[@id='linkModal']/div/div/div/button[1]")
    public WebElement wishlistCopyLinkModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='linkModal']/div/div/div[3]/button[1]")
    public WebElement wishlistCopyLinkModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='linkModal']/div/div/div[2]/input[1]")
    public WebElement wishlistCopyLinkModalWindowLinkField;

    @FindBy(xpath = "//main[@id='main-content']/div/div[5]/div/div[@class='font22 bold']")
    public WebElement wishlistInNewWindowTitle;


    //compare product
    @FindBy(xpath = "//button[contains(.,'Compare product')]")
    public WebElement compareProductButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[1]/button[1]")
    public WebElement compareProductModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[3]/button[2]")
    public WebElement compareProductModalWindowOkButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[2]/div[contains(.,'The product already exists in the compare cart')]")
    public WebElement informationMessageOnCompareProductModalWindow;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[3]/button[1]")
    public WebElement compareProductModalWindowViewComparisonsButton;

    @FindBy(xpath = "//h1[contains(.,'Comparisons')]")
    public WebElement comparisonsPageTitle;

    @FindBy(xpath = "//div[@id='wrapper']/main/div/div[5]/div[2]/div[4]/div[2]/a/div[1]")
    public WebElement wishlistProductName;

    @FindBy(xpath = "//main[@id='main-content']/div/div[6]/table/tbody/tr[4]/td/a[1]")
    public WebElement comparisonsProductName;

    //Remove product from wishlist
    @FindBy(xpath = "//button[contains(.,'Remove')]")
    public WebElement removeProductButton;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[5]/div[2]/ul/li/span")
    public WebElement wishlistCounter;

    //Delete Wishlist
    @FindBy(xpath = "//button[contains(.,'Delete')]")
    public WebElement wishlistPageDeleteButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div/div/div/h4[contains(.,'Confirm Delete')]")
    public WebElement deleteWishlistModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div/div/div[1]/button[1]")
    public WebElement deleteWishlistModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div/div/div[3]/button[1]")
    public WebElement deleteWishlistModalWindowNoButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div/div/div[3]/button[2]")
    public WebElement deleteWishlistModalWindowYesButton;

    @FindBy(xpath = "//main[@id='main-content']/div/div[contains(.,'  List Deleted')]")
    public WebElement deleteWishlistInformationMessage;
}
