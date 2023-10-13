package elements.designer;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DesignerPageElements extends BaseElements {
    public DesignerPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************DESIGNER PAGE ELEMENTS*****************************/

    /*****************************LEFT SECTION****************************/

    @FindBy(id = "volume_pricing_btn")
    public WebElement volumePricingButton;

    //'Add Artwork' button
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-pull-0 col-lg-3 col-lg-pull-6']//div[1]/div[1]//div[1]//button[contains(.,' Add Artwork ')]")
    public WebElement addArtworkButton;

    @FindBy(id = "formUpload")
    public WebElement formUploadDropZone;

    //'Add Clipart' button
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-pull-0 col-lg-3 col-lg-pull-6']//div[1]/div[1]//div[2]//button[contains(.,' Add Clipart ')]")
    public WebElement addClipartButton;

    @FindBy(xpath = "//div[@id='modal-clipart']//a[contains(.,'Animals')]")
    public WebElement animalsLink;

    @FindBy(xpath = "//img[@src='/products/ihfiles/ClipArt/t/1.png']")
    public WebElement animalLogo;

    @FindBy(id = "artwork-file-size-error")
    public WebElement artworkFileSizeErrorLabel;

    @FindBy(id = "artwork-file-extension-error")
    public WebElement artworkFileExtensionErrorLabel;

    //Add clipart using search field

    @FindBy(xpath = "//div[@id='modal-clipart']/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public WebElement searchClipartField;

    @FindBy(xpath = "//div[@id='modal-clipart']/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/button[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='modal-clipart']/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/a[1]/div[1]/img[1]")
    public WebElement firstImageInARowSearch;

    //artwork is on product sketch
    @FindBy(xpath = "//*[@id=\"ihd-canvas-wrapper\"]//canvas[2]")
    public WebElement artworkOnProduct;

    //'Add Text' button
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-pull-0 col-lg-3 col-lg-pull-6']//div[1]/div[1]//div[3]//button[contains(.,' Add Text ')]")
    public WebElement addTextButton;

    @FindBy(id = "ihd-textarea_1")
    public WebElement modifyingTextArea;

    @FindBy(xpath = "//a[@title = 'Switch between curved and normal Text']")
    public WebElement curveTextButton;

    //choose item color
    @FindBy(xpath = "//button[@data-id='select_color_2']")
    public WebElement itemColorButton;

    @FindBy(xpath = "//div[@class='dropdown bootstrap-select show-tick ihd-items-wrapper bs3 open']/div[1]/div[1]/ul[1]/li[2]/a[1]/span[2]/div[1]/img[1]")
    public WebElement itemColorSecondInRow;

    /*****************************RIGHT SECTION*****************************/
    //fields on right panel
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-push-0 col-lg-3']//div[1]//ul[1]//li[1]//div[1]//div[1]//div[1]//div[2]//div[1]//table[1]//thead//tr//th[3]")
    public WebElement chooseSecondQuantityInRow;

    @FindBy(id = "quantity")
    public WebElement quantityField;

    @FindBy(xpath = "//ul[@class='list-group']/li[2]/div[2]/div[1]/div[1]/input[2]")
    public WebElement sizesField;

    @FindBy(id = "comments_13")
    public WebElement imprintColorField;

    @FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
    public WebElement addToCartButton;

    /*****************************NEGATIVE SCENARIOS*****************************/
    //negative scenarios
    @FindBy(xpath = "//div[@id='error_dialog']//div[1]//div[1]//div[1]//button[1]//span[1]")
    public WebElement missingInfoCrossButton;

    @FindBy(xpath = "//div[@id='error_dialog']//div[1]//div[2]//ol[1]//li[contains(.,'Please enter Imprint color comments')]")
    public WebElement missingInfoMessage;

    @FindBy(xpath = "//div[@id='error_dialog']//div[1]//div[3]//button[1]")
    public WebElement missingInfoOkButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']//div[1]//div[1]//div[1]//button[1]")
    public WebElement orderQuantityAndSizeRequestedMessageCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']//div[1]//div[1]//div[2]//button[1]")
    public WebElement orderQuantityAndSizeRequestedMessageOkButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']//div[1]//div[1]//div[1]//div[contains(.,'Order quantity and sizes requested do not match. Please revise.')]")
    public WebElement orderQuantityAndSizeRequestedMessageContent;

    @FindBy(xpath = "//div[@id='error_dialog']//div[1]//div[1]/div[2]/ol[1]/li[contains(.,'Please enter only digits.')]")
    public WebElement missingInfoOnlyDigitsMessage;

    @FindBy(xpath = "//div[@id='error_dialog']//div[1]//div[1]//div[1]//div[contains(.,'Missing Info')]")
    public WebElement missingInfoMessage2;



    /*****************************NEED HELP? SECTION*****************************/

    //'Need Help?' section
    @FindBy(xpath = "//div[@class='text-center bmarg10']//div[contains(.,'Need Help?')]")
    public WebElement needHelpSectionTitle;

    @FindBy(xpath = "//div[@class='text-center bmarg10']//button[1]")
    public WebElement needHelpSectionEmailIcon;

    @FindBy(xpath = "//div[@class='text-center bmarg10']//button[2]")
    public WebElement needHelpSectionChatIcon;

    @FindBy(xpath = "//div[@class='text-center bmarg10']//button[3]")
    public WebElement needHelpSectionCallIcon;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[1]//span[contains(.,'Contact Request')]")
    public WebElement needHelpContactRequestModalWindowTitle;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[1]//button[1]")
    public WebElement needHelpContactRequestModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[3]//div[1]/div[2]/button[contains(.,'Submit Request')]")
    public WebElement needHelpContactRequestModalWindowSubmitRequestButton;

    //security and privacy
    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[3]//div[1]/div[2]/a[1]")
    public WebElement needHelpContactRequestModalWindowPrivacySecurityLink;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookiesButtonShopAndChecksPage;

    @FindBy(xpath = "//div[@class='primary-nav__icon-section__signin-icon nav-icon']//a[contains(.,'Sign In')]")
    public WebElement securityPrivacySignInLink;

    //fields
    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement needHelpContactRequestModalWindowNameField;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[2]/div[2]/div[1]/input[1]")
    public WebElement needHelpContactRequestModalWindowEmailField;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[2]/div[3]/div[1]/input[1]")
    public WebElement needHelpContactRequestModalWindowPhoneNumberField;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[2]/div[4]/div[1]/input[1]")
    public WebElement needHelpContactRequestModalWindowCompanyNameField;

    @FindBy(xpath = "//div[@id='form_request_container']//div[1]//form[1]//div[1]/div[2]/div[5]/div[1]/textarea[1]")
    public WebElement needHelpContactRequestModalWindowCommentsField;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']//div[1]//div[1]/div[1]/button[1]")
    public WebElement proveNotARobotCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']//div[1]//div[1]/div[2]//button[1]")
    public WebElement proveNotARobotOkButton;

    //live  chat
    @FindBy(id = "chat-widget")
    public WebElement liveChatFrame;
    @FindBy(xpath = "//div[@class='lc-1w0ct3p e1ohfhv0']//h1[contains(.,'Welcome to LiveChat')]")
    public WebElement liveChatAuxiliaryWindowTitle;

    @FindBy(xpath = "//button[@aria-label='Minimize window']")
    public WebElement minimizeLiveChatAuxiliaryWindowButton;

    //call icon
    @FindBy(xpath = "//div[@id='callDialog']//div[1]/div[1]/div[1]/button[1]")
    public WebElement callUsModalWindowCrossButton;


    /*****************************NAVIGATION*****************************/

    //product's name link
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-push-0 col-lg-3']//div[1]//div[1]//h1//a[1]")
    public WebElement nameOfProductLink;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]//div[1]//div[1]//div[contains(.,'Leave the designer?  Your changes will not be saved.')]")
    public WebElement leaveDesignerModalWindowMessage;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]//div[1]//div[1]//button[1]")
    public WebElement leaveDesignerModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]//div[1]//div[2]//button[1]")
    public WebElement leaveDesignerModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]//div[1]//div[2]//button[2]")
    public WebElement leaveDesignerModalWindowOkButton;

    //'Back to Product' link
    @FindBy(xpath = "//div[@class='row']//div[2]//a[contains(.,'« Back to product')]")
    public WebElement backToProductLink;

    @FindBy(xpath = "//div[@class='row']//div[2]//a[contains(.,'Let us do it for you')]")
    public WebElement letUsDoItForYouLink;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[1]//h4[contains(.,'Leave Designer?')]")
    public WebElement letUsDoItForYouModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[1]//button[1]")
    public WebElement letUsDoItForYouLinkModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[3]//button[2]")
    public WebElement letUsDonItForYouModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[3]//button[1]")
    public WebElement letUsDoItForYouModalWindowYesButton;

    @FindBy(xpath = "//h1[@class='title-header']//a[1]")
    public WebElement nameOfProductLinkCustomizer;


    /*****************************DOWNLOAD & PRINT*****************************/

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-push-0 col-lg-3']/div[1]/div[2]/div[2]/div[1]/button[contains(.,' Download ')]")
    public WebElement downloadButton;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-push-0 col-lg-3']/div[1]/div[2]/div[2]/div[2]/button[contains(.,' Print ')]")
    public WebElement printButton;

    @FindBy(xpath = "//div[@id='modal-download']/div[1]/div[1]/div[1]/div[contains(.,'Download Image')]")
    public WebElement downloadImageModalWindowTitle;
    @FindBy(xpath = "//div[@id='modal-download']/div[1]/div[1]/div[1]/button[1]")
    public WebElement downloadImageModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='modal-download']/div[1]/div[1]/div[2]/button[contains(.,'Download')]")
    public WebElement downloadImageModalWindowDownloadButton;

    //sign in via Designer
    @FindBy(xpath = "//div[@id='customer_sign_in']/div[1]/input[1]")
    public WebElement signInViaDesignerButton;

    @FindBy(xpath = "//div[@id='signInForm']/div[4]/form/input[2]")
    public WebElement signInViaDesignerButton2;

    @FindBy(id = "email_designer_sign_in")
    public WebElement emailFieldSignInViaDesigner;

    @FindBy(id = "password_designer_sign_in")
    public WebElement passwordFieldSignInViaDesigner;

    @FindBy(xpath = "//div[@class='form-group col-xs-12 col-sm-5 col-md-4 center-block float-none']/button[1]")
    public WebElement signInUsingFacebookViaDesignerButton;

    @FindBy(xpath = "//div[@class='form-group col-xs-12 col-sm-5 col-md-4 center-block float-none']/button[2]")
    public WebElement signInUsingGoogleViaDesignerButton;

    @FindBy(xpath = "//a[contains(.,'Forgot password?')]")
    public WebElement forgotPasswordViaDesignerLink;

    @FindBy(xpath = "//div[@id='modal-uploadartwork']/div/div/div/button")
    public WebElement addArtworkWindowCrossButton;

    @FindBy(xpath = "//div[@id='customer_sign_in']/div[2]/div[4]/form/div[contains(.,'Email or password is incorrect.')]")
    public WebElement emailOrPasswordIsIncorrectLabel;

    @FindBy(xpath = "//button[contains(.,'Allow all cookies')]")
    public WebElement acceptCookiesButtonFacebook;

    @FindBy(id = "identifierId")
    public WebElement emailFieldGoogle;

    @FindBy(xpath = "//h1[contains(.,'Reset Password')]")
    public WebElement forgotPasswordPageTitle;
}
