package elements.quoteCart;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteCartPageElements extends BaseElements {
    public QuoteCartPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************QUOTE CART PAGE ELEMENTS*****************************/

    //pre page
    @FindBy(xpath = "//div[@class='panel panel-primary']//div[2]/div[1]/div[3]//div[1]//a[contains(.,'View Quote Cart')]")
    public WebElement viewQuoteCartButton;

    @FindBy(xpath = "//div[@class='panel panel-primary']//div[2]/div[1]/div[3]//div[1]//a[contains(.,'Continue Shopping')]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//div[@class='panel panel-primary']//div[2]/div[1]/div[3]//div[1]//a[contains(.,'Complete Request')]")
    public WebElement completeRequestButton;

    @FindBy(xpath = "//div[@class='panel panel-primary']//div[2]//div[1]//div[2]//h2//a")
    public WebElement productNameLink;


    //quote cart
    @FindBy(xpath = "//h1[contains(.,'Quote Cart')]")
    public WebElement quoteCartTitle;

    @FindBy(xpath = "//h1[contains(.,'Request a Quote')]")
    public WebElement requestQuoteCheckoutPageTitle;

    @FindBy(id = "sel_buying_reason")
    public WebElement yourBuyingReasonDropDown;

    @FindBy(xpath = "//div[@class='pad4 form-inline']/select/option[2]")
    public WebElement chooseBuyingReason;

    @FindBy(xpath = "//button[contains(.,'Submit Quote Request')]")
    public WebElement submitQuoteRequestButton;

    @FindBy(xpath = "//h1[contains(.,'Thank You!')]")
    public WebElement thankYouSign;

    @FindBy(xpath = "//div[@class='panel-body']/div[1]/div[1]/div[1]/div[2]/button")
    public WebElement removeButton;

    @FindBy(xpath = "//div[@class='panel-body']/div[1]/div[1]/div[1]/div[2]/a")
    public WebElement modifyButton;


    //modal window
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/div[contains(.,'Are you sure you would like to remove this item?')]")
    public WebElement removeProductFromQuoteCartTitle;
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/button")
    public WebElement removeProductFromQuoteCartCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[1]")
    public WebElement removeProductFromQuoteCartCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[2]")
    public WebElement removeProductFromQuoteCartOkButton;


    //checkout
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button")
    public WebElement modalWindowOkButton;

    //saved shipping address
    @FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[2]/div[3]/div[1]/button[1]")
    public WebElement chooseASavedShippingAddressButton;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']/div[2]/div[2]/a[1]")
    public WebElement shipToThisAddressSecondInARowButton;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']/div[2]/div[2]/strong[1]")
    public WebElement newShippingAddress;

    @FindBy(xpath = "//div[@id='address_msg']")
    public WebElement shippingAddressUpdatedInformationMessage;

    @FindBy(xpath = "//div[@id='shipping_address_display']/strong[1]")
    public WebElement shippingAddressDisplayed;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[1]")
    public WebElement validateNewShippingAddressInformationMessageTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button")
    public WebElement validateNewShippingAddressInformationMessageOkButton;


    //add a new shipping address
    @FindBy(xpath = "//div[@id='shipping_address']/div[3]/div[3]/button[1]")
    public WebElement addANewShippingAddressButton;

    @FindBy(id = "txt_shipping_firstname")
    public WebElement addNewShippingAddressFirstNameField;

    @FindBy(id = "txt_shipping_lastname")
    public WebElement addNewShippingAddressLastNameField;

    @FindBy(id = "txt_shipping_company")
    public WebElement addNewShippingAddressCompanyName;

    @FindBy(id = "txt_shipping_address1")
    public WebElement addNewShippingAddressAddress;

    @FindBy(id = "txt_shipping_city")
    public WebElement addNewShippingAddressCity;

    @FindBy(id = "sel_shipping_state")
    public WebElement addNewShippingAddressSelectState;

    @FindBy(xpath = "//select[@id='sel_shipping_state']/option[@value='48']")
    public WebElement addNewShippingAddressState;

    @FindBy(id = "txt_shipping_zip")
    public WebElement addNewShippingAddressZipCode;

    @FindBy(xpath = "//div[@id='edit_shipping_address']/div[14]/div[1]/div[1]/label[contains(.,' Save this address ')]")
    public WebElement saveShippingAddressCheckBox;
}
