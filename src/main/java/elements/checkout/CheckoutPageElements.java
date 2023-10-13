package elements.checkout;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.IDN;

public class CheckoutPageElements extends BaseElements {
    public CheckoutPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************CHECKOUT PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Checkout')]")
    public WebElement checkoutPageTitle;

    @FindBy(id = "showToggleSavedAddrList")
    public WebElement chooseSavedShippingAddress;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']//div[2]/div[2]/button[1]")
    public WebElement shipToThisAddressButtonSecondInARow;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']//div[2]/div[2]/strong[1]")
    public WebElement savedShippingAddress;

    @FindBy(id = "newShippAddr")
    public WebElement addNewShippingAddressButton;

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

    @FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[3]/div[13]/div/div/label[contains(.,' Save this address ')]")
    public WebElement saveShippingAddressCheckBox;

    @FindBy(xpath = "//div[@id='shipping_address_display']//strong[1]")
    public WebElement displayedShippingAddress;

    @FindBy(xpath = "//a[contains(.,'« Back to Cart')]")
    public WebElement backToCartLink;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/div[1]/div[@id='bootboxBody']")
    public WebElement warningPopUpWindow;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/div[2]/button[1]")
    public WebElement warningPopUpWindowOkButton;

    @FindBy(id = "sel_buying_reason")
    public WebElement buyingReasonDropDownMenu;

    @FindBy(xpath = "//select[@id='sel_buying_reason']//option[@value='7']")
    public WebElement buyingReasonChoice;

    @FindBy(id = "txt_couponcode")
    public WebElement discountCodeInput;

    @FindBy(id = "btn_coupon")
    public WebElement applyDiscountButton;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[2]/div[3]/button[1]")
    public WebElement creditCardButton;

    @FindBy(id = "paypal_container")
    public WebElement paypalButton;

    @FindBy(id = "google-pay-container")
    public WebElement buyWithGooglePayButton;


    /*****************************CREDIT CARD MODAL WINDOW ELEMENTS*****************************/

    @FindBy(id = "form_payments_cc")
    public WebElement creditCardModalWindow;

    @FindBy(id = "cardholder_name")
    public WebElement creditCardHolderNameField;

    @FindBy(id = "credit-card-number")
    public WebElement creditCardNumberField;

    @FindBy(id = "braintree-hosted-field-number")
    public WebElement frameCreditCardNumberField;

    @FindBy(id = "expiration-month")
    public WebElement creditCardExpirationMonthField;

    @FindBy(id = "braintree-hosted-field-expirationMonth")
    public WebElement frameCreditCardExpirationMonthField;

    @FindBy(id = "expiration-year")
    public WebElement creditCardExpirationYearField;

    @FindBy(id = "braintree-hosted-field-expirationYear")
    public WebElement frameCreditCardExpirationYearField;

    @FindBy(id = "cvv")
    public WebElement creditCardCVVCodeField;

    @FindBy(id = "braintree-hosted-field-cvv")
    public WebElement frameCreditCardCVVCodeField;

    @FindBy(id = "postal-code")
    public WebElement zipCodeField;

    @FindBy(id = "braintree-hosted-field-postalCode")
    public WebElement frameZipCodeField;

    @FindBy(id = "button_cc")
    public WebElement creditCardSubmitOrderButton;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/form/div[1]/button[1]")
    public WebElement creditCardModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/form[1]/div[3]/button[2]")
    public WebElement creditCardModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='modal-dialog']/div[1]/form[1]/div[2]/div[1]/span[contains(.,'Whoops—looks like something in your payment information might be incorrect! Please double-check and re-enter your credit card information to try again.')]")
    public WebElement creditCardModalWindowWhoopsMessageContent;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[4]/div[1]/div[1]/div[1]/h1[1]")
    public WebElement orderNumberString;

    @FindBy(xpath = "//div[@class='row oc-goto-block']/div[3]/a[contains(.,'Continue Shopping')]")
    public WebElement continueShoppingButton;

}
