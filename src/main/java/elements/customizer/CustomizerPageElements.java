package elements.customizer;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizerPageElements extends BaseElements {
    public CustomizerPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************CUSTOMIZER PAGE ELEMENTS*****************************/
    @FindBy(xpath = "//div[@class='col-md-11 rcenter-xs rcenter-sm']/a[contains(.,'free virtual proof')]")
    public WebElement freeVirtualProofLink;

    @FindBy(xpath = "//div[@id='helpDialog']//div[1]//div[1]/div[1]/span[contains(.,'Help')]")
    public WebElement helpModalWindowTitle;

    @FindBy(xpath = "//div[@id='helpDialog']//div[1]//div[1]/div[1]/button[1]")
    public WebElement helpModalWindowCrossButton;

    /*****************************FILL ALL NECESSARY FIELDS*****************************/
    @FindBy(id = "quantity")
    public WebElement quantityField;

    @FindBy(id = "comments_129_5125")
    public WebElement sizesQuantityField;

    @FindBy(xpath = "//div[@class='col-md-11 rcenter-xs rcenter-sm']//div[1]//div[1]/div[@class='rectangle-box']")
    public WebElement itemColor;

    @FindBy(xpath = "//div[@class='col-md-11 rcenter-xs rcenter-sm']//div[1]//div[1]//div[1]//div[1]//div[1]//span[@class='cursor square required']")
    public WebElement imprintLocation;

    @FindBy(xpath = "//div[@class='col-md-11 rcenter-xs rcenter-sm']//div[4]//div[1]//div[@class='rectangle-box']")
    public WebElement imprintColor;

    //negative
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[contains(.,'Please choose an additional 12 size(s).')]")
    public WebElement sizesModalWindowContent;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/button[1]")
    public WebElement sizesModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button[1]")
    public WebElement sizesModalWindowOkButton;

    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[1]/div[contains(.,'Missing Info')]")
    public WebElement missingInfoModalWindowContent;

    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[1]/button[1]")
    public WebElement missingInfoModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[3]/button[1]")
    public WebElement missingInfoModalWindowOkButton;



    /*****************************ADD ARTWORK TO PRODUCT*****************************/
    @FindBy(xpath = "//button[contains(.,'Add Artwork')]")
    public WebElement addArtworkButton;

    @FindBy(id = "formUpload")
    public WebElement formUpload;

    @FindBy(id = "btn-upload-art")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//button[contains(.,'Done')]")
    public WebElement doneButton;

    @FindBy(id = "artwork-file-size-error")
    public WebElement artworkFileSizeErrorLabel;

    /*****************************ADD CLIPART TO PRODUCT*****************************/

    @FindBy(xpath = "//button[contains(.,' Add Clipart ')]")
    public WebElement addClipartButton;

    @FindBy(xpath = "//div[@class='row hidden-xs']//a[contains(.,' Animals ')]")
    public WebElement animalsLink;

    @FindBy(xpath = "//div[@class='row']//div[1]//a[1]//div[1]//img[1]")
    public WebElement animalLogo;

    @FindBy(xpath = "//div[@id='modal-clipart']//div[1]//div[1]//div[2]//div[1]//form[1]//div[1]//input[1]")
    public WebElement clipartSearchField;

    @FindBy(xpath = "//div[@id='modal-clipart']//div[1]//div[1]//div[2]//div[1]//form[1]//div[1]//div[1]//button[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='modal-clipart']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//img[1]")
    public WebElement searchResultFirstInRow;

    /*****************************ADD TEXT TO PRODUCT*****************************/
    @FindBy(xpath = "//a[contains(.,'Add Text')]")
    public WebElement addTextButton;

    @FindBy(xpath = "//div[@id='addText']/div[1]/div[1]/div[2]/div[3]/div[2]")
    public WebElement textFillArea;

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

    @FindBy(xpath = "//div[@id='summary-parent']/div[1]/div[2]/div[3]/div[3]/button[contains(.,' Add to Cart')]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//h1[@class='title-header']//a[1]")
    public WebElement nameOfProductCustomizer;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[1]//h4[contains(.,'Leave Customizer?')]")
    public WebElement leaveCustomizerModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[1]//button[1]")
    public WebElement leaveCustomizerModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[3]//button[2]")
    public WebElement leaveCustomizerModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]//div[3]//button[1]")
    public WebElement leaveCustomizerModalWindowYesButton;



    @FindBy(xpath = "//div[@id='summary-parent']//div[1]//div[2]//div[3]//div[3]//button[contains(.,' Add to Quotes')]")
    public WebElement addToQuotesButton;

    //Guest
    @FindBy(xpath = "//div[@id='dialog_sign_in']/form/div/div/div[3]/button")
    public WebElement continueAsGuestButton;

    @FindBy(id = "formUploadGuest")
    public WebElement formUploadGuest;

    @FindBy(id = "btn-upload-art-guest")
    public WebElement uploadFileGuestButton;

    @FindBy(xpath = "//div[@id='dialog_attach_artwork_guest']//div[1]//div[1]/div[4]/button")
    public WebElement doneGuestButton;

    @FindBy(id = "sign_in_email")
    public WebElement emailFieldSignInViaCustomizer;

    @FindBy(id = "password")
    public WebElement passwordFieldSignInViaCustomizer;

    @FindBy(xpath = "//div[@id='dialog_sign_in']/form/div/div/div[2]/button")
    public WebElement signInViaCustomizerButton;

    @FindBy(xpath = "//div[@id='dialog_sign_in']/form/div/div/div[2]/div[6]/a[contains(.,' Sign in using Facebook')]")
    public WebElement signInUsingFacebookViaCustomizerVButton;

    @FindBy(xpath = "//div[@id='dialog_sign_in']/form/div/div/div[2]/div[6]/a[contains(.,' Sign in using Google')]")
    public WebElement signInUsingGoogleViaCustomizerButton;

    @FindBy(xpath = "//div[@id='dialog_sign_in']/form/div/div/div[2]/div[1]")
    public WebElement emailOrPasswordIsIncorrectLabel;

    @FindBy(xpath = "//button[contains(.,'Allow all cookies')]")
    public WebElement acceptCookiesButtonFacebook;

    @FindBy(id = "identifierId")
    public WebElement emailFieldGoogle;

}
