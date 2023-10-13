package elements.PDP;

import elements.base.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPageElements extends BaseElements {
    public ProductDescriptionPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************PRODUCT DESCRIPTION PAGE ELEMENTS*****************************/


    public By designerButtonLocator = By.cssSelector(".js-add-to-designer");
    @FindBy(css = ".js-add-to-designer")
    public WebElement designerButton;

    public By customizerButtonLocator = By.cssSelector(".js-add-to-customizer");

    @FindBy(css = ".js-add-to-customizer")
    public WebElement customizerButton;

    @FindBy(xpath = "//div[@class='row flexDisplay']//div[2]//span[1]//span[1]//a[1]")
    public WebElement setupFeeIcon;

    @FindBy(xpath = "//a[contains(.,' Need More? ')]")
    public WebElement needMoreLink;

    @FindBy(xpath = "//div[@class='col-md-5 col-xs-12 col-sm-6']//div[1]//h1")
    public WebElement productNamePDP;

    @FindBy(xpath = "//button[@title='Return to the top of the page']")
    public WebElement returnToTheTopOfPDPButton;

    @FindBy(xpath = "//a[contains(.,'View FAQs')]")
    public WebElement viewFAQPDPLink;



    /*******************************NEED MORE POP UP WINDOW*******************************/

    @FindBy(xpath = "//h4[contains(.,'Large Quantity Quote Request')]")
    public WebElement needMorePopWindowTitle;

    @FindBy(id = "LargeQuantityRequestCustomerName")
    public WebElement largeQuantityNameFiled;

    @FindBy(id = "LargeQuantityRequestCustomerEmail")
    public  WebElement largeQuantityEmailField;

    @FindBy(id = "LargeQuantityRequestCustomerPhone")
    public WebElement largeQuantityPhoneNumberField;

    @FindBy(xpath = "//input[@class='input-number form-control required error']")
    public WebElement largeQuantityQuantityField;

    @FindBy(xpath = "//form[@id='formSourcing']//div[1]//div[1]//div[2]//div[5]//div[1]//div[1]//div[1]")
    public WebElement inputNumberMoreButton;

    @FindBy(id = "LargeQuantityRequestCustomerComments")
    public WebElement largeQuantityCommentsField;

    @FindBy(xpath = "//form[@id='formSourcing']//div[1]//div[1]/div[3]/button[1]")
    public WebElement largeQuantityCloseButton;

    @FindBy(xpath = "//form[@id='formSourcing']//div[1]//div[1]/div[3]/input[1]")
    public WebElement largeQuantitySubmitRequestButton;

    @FindBy(id = "bootboxBody")
    public WebElement modalWindowTitle;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/div[2]/button[1]")
    public WebElement modalWindowTitleOkButton;


    /*******************************ZOOM IN/OUT*******************************/

    @FindBy(id = "product_image")
    public WebElement productImage;

    @FindBy(id = "_zi_icon")
    public WebElement zoomInButton;

    @FindBy(id = "_zo_icon")
    public WebElement zoomOutButton;

    @FindBy(xpath = "//span[@class='fa fa-times font22']")
    public WebElement closeZoomWindowButton;

    @FindBy(id = "zoom_btn")
    public WebElement clickImageToZoomLink;

    /*******************************PRINT*******************************/

    @FindBy(id = "print_btn")
    public WebElement printLink;

    @FindBy(xpath = "//h1[@class='product']")
    public WebElement productNameOnPrintPage;

    /*******************************QUICK ESTIMATE*******************************/

    @FindBy(xpath = "//button[contains(.,' Quick Estimate ')]")
    public WebElement quickEstimateButton;

    @FindBy(xpath = "//div[@id='quick_quote_modal']//div[1]//div[1]//div[1]//button[@aria-label='Close']")
    public WebElement quickEstimateModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='quick_quote_modal']")
    public WebElement quickEstimateModalWindow;

    @FindBy(xpath = "//input[@id='zipCode']")
    public WebElement zipCodeFieldQuickEstimate;

    @FindBy(id = "sel_shipping_country")
    public WebElement shippingDropDownMenuQuickEstimate;

    @FindBy(xpath = "//select[@id='sel_shipping_country']/option[1]")
    public WebElement shippingDropDownMenuQuickEstimateAmerica;

    @FindBy(xpath = "//select[@id='sel_shipping_country']/option[2]")
    public WebElement shippingDropDownMenuQuickEstimateCanada;

    @FindBy(xpath = "//select[@id='sel_shipping_country']/option[3]")
    public WebElement shippingDropDownMenuQuickEstimatePuertoRico;

    @FindBy(xpath = "//div[@class='table-responsive']/table[1]/tbody/tr/th[3]")
    public WebElement quantitySecondInRowQuickEstimate;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/div[2]/div[3]/div[1]//button[1]")
    public WebElement updateButtonQuantityQuickEstimate;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/div[2]/div[6]//button[1]")
    public WebElement updateButtonZipCodeQuickEstimate;


    //navigation testing
    @FindBy(xpath = "//div[@class='modal fade in']//div[1]/div[1]/div[3]//div[1]/button")
    public WebElement requestQuoteQuickEstimateButton;

    @FindBy(xpath = "//div[@class='modal fade in']//div[1]/div[1]/div[3]//div[2]/button")
    public WebElement designsAndBuyQuickEstimateButton;

    @FindBy(xpath = "//h1[@class='title-header']//a")
    public WebElement productNameCustomizer;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[1]/div[3]//button[1]")
    public WebElement modalWindowProductNameYesButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[1]/div[3]//button[2]")
    public WebElement modalWindowProductNameCancelAndContinueCustomizingButton;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-12 col-md-4 col-md-push-0 col-lg-3']//div[1]/div[1]/h1/a[1]")
    public WebElement productNameDesigner;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]/div[1]/div[1]/div[contains(.,'Leave the designer?  Your changes will not be saved.')]")
    public WebElement modalWindowProductNameDesigner;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]/div[1]/div[1]/button")
    public WebElement modalWindowProductNameDesignerCross;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]/div[1]/div[2]/button[1]")
    public WebElement modalWindowProductNameDesignerCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']//div[1]/div[1]/div[2]/button[2]")
    public WebElement modalWindowProductNameDesignerOkButton;



    //negative tests
    @FindBy(id = "bootboxBody")
    public WebElement modalWindowEnterValidZipCode;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button")
    public WebElement modalWindowEnterValidZipCodeOkButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/button")
    public WebElement modalWindowEnterValidZipCodeCloseButton;

    /*******************************QUANTITY*******************************/
    @FindBy(xpath = "//div[@class='row flexDisplay']//div[1]//div[1]/div[2]/input[2]")
    public WebElement quantityPDPField;

    @FindBy(xpath = "//div[@class='row flexDisplay']//div[1]//div[1]//div[2]/div[1]")
    public WebElement inputNumberMoreButtonPDP;

    @FindBy(xpath = "//div[@class='row flexDisplay']//div[1]//div[1]//div[2]/div[2]")
    public WebElement inputNumberLessPDP;

    @FindBy(xpath = "//div[@class='panel qty-panel']//div[1]//table/tbody/tr[1]/td[2]")
    public WebElement quantitySecondInRowPDP;

    /*******************************ITEM COLOR*******************************/

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']/div[1]")
    public WebElement selectColorFieldPDP;
    
    @FindBy(xpath = "//div[@class='dropdown-menu open']//div[1]//ul[1]//li[5]")
    public WebElement fourthColorOption;

    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    public WebElement selectedColorName;

    @FindBy(id = "img_option_name")
    public WebElement colorNamePDP;


    /*******************************FAQ menu*******************************/

    @FindBy(xpath = "//div[@class='gray-wrapper']//div[1]//ul[1]//li[4]/a[text()='FAQs']")
    public WebElement fAQsLink;

    @FindBy(id = "prodBtn")
    public WebElement askQuestionButton;

    @FindBy(id = "questionModalLabel")
    public WebElement askAQuestionModalWindow;

    @FindBy(xpath = "//div[@id='questionModal']//div[1]//form//div[1]/div[1]/div[1]/button[1]")
    public WebElement askAQuestionModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='questionModal']//div[1]//form//div[1]//div[1]/div[3]/button[1]")
    public WebElement askAQuestionModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='questionModal']//div[1]//form//div[1]//div[1]/div[3]/input[1]")
    public WebElement askAQuestionModalWindowSubmitQuestionButton;

    @FindBy(id = "questionEmail")
    public WebElement askAQuestionModalWindowEmailField;

    @FindBy(id = "questionComments")
    public WebElement askAQuestionModalWindowQuestionsField;

    @FindBy(id = "questionEmail-error")
    public WebElement askAQuestionModalWindowEmailLabel;

    @FindBy(id = "questionComments-error")
    public WebElement askAQuestionModalWindowCommentsLabel;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button[1]")
    public WebElement askAQuestionModalWindowCAPTCHAIsNotCheckedOkButton;

    @FindBy(id = "questionStr")
    public WebElement whatIsYourQuestionFieldPDP;

    /*******************************Ask A Question*******************************/

    @FindBy(xpath = "//div[@class='description-container']//div[1]/div[1]/ul[1]/li[5]/a/span")
    public WebElement askAQuestionLink;

    @FindBy(id = "questionModal")
    public WebElement askAQuestionModalWindow2;

    /*******************************SAVE TO WISHLIST*******************************/

    @FindBy(xpath = "//div[@class='row wish_compare_btns']//div[1]/a")
    public WebElement saveToWishlistButton;

    //modal window
    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]//div[1]//span[contains(.,'Save to Wish List')]")
    public WebElement saveToWishlistModalWindowTitle;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]//div[1]//div[1]/button[1]")
    public WebElement saveToWishlistModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[3]/button[1]")
    public WebElement saveToWishlistModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/button[1]")
    public WebElement saveToWishlistModalWindowCreateButton;

    @FindBy(id = "msg-body")
    public WebElement saveToWishListWishlistUpdatedInformationMessage;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[2]/div[1]/div[4]/table[1]/tbody/tr/td/button[1]")
    public WebElement saveToWishlistModalWindowSaveButton;

    @FindBy(xpath = "//div[@id='wishlistModal']/div[1]//div[1]/div[2]/div[1]/div[contains(.,'This product is already in the wish list. Please select another wish list or create new.')]")
    public WebElement saveToWishlistModalWindowErrorMessage;

    /*******************************COMPARE PRODUCT******************************/

    @FindBy(xpath = "//div[@class='row wish_compare_btns']//div[2]/button[1]")
    public WebElement compareProductButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]/div[1]/h4[contains(.,'Success')]")
    public WebElement compareProductModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]//div[1]/div[1]/h4[contains(.,'Error')]")
    public WebElement compareProductModalWindowErrorMessageTitLe;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[3]/button[2]")
    public WebElement compareProductModalWindowOkButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[3]/button[1]")
    public WebElement compareProductModalWindowViewComparisonsButton;

    @FindBy(xpath = "//div[@class='col-lg-10']/div[2]/section[1]/div[1]/div[3]/div[2]/p[1]/span[2]")
    public WebElement priceForEachPLP;

    /*******************************QUOTE******************************/
    @FindBy(xpath = "//div[@class='row w2pprod']//div[2]//button[1]")
    public WebElement requestQuoteButton;

    @FindBy(xpath = "//div[@class='row w2pprod']/div[3]/button[contains(.,' Request Sample ')]")
    public WebElement requestSampleButton;

    //Sample Limit Reached
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div/h4[contains(.,'Sample Limit Reached')]")
    public WebElement sampleLimitReachedTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div[1]/button")
    public WebElement sampleLimitReachedCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div[3]/button")
    public WebElement sampleLimitReachedOkButton;

}
