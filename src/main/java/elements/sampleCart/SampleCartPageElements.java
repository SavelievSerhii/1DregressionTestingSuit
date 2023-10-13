package elements.sampleCart;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SampleCartPageElements extends BaseElements {

    public SampleCartPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************SAMPLE CART PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[3]/a")
    public WebElement sampleCartIcon;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li[3]/a[1]/span[1]")
    public WebElement sampleCartCounter;

    @FindBy(xpath = "//h1[contains(.,'Samples Cart')]")
    public WebElement sampleCartTitle;

    @FindBy(xpath = "//h2[contains(.,'Sample Information')]")
    public WebElement sampleCartConfiguratorTitle;

    @FindBy(xpath = "//div[@class='text-center']/input[1]")
    public WebElement addToSamplesCartButton;

    //modal window
    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[1]/h4[contains(.,'Missing Info')]")
    public WebElement missingInformationModalWindowTitle;

    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[1]/button")
    public WebElement missingInformationModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='error_dialog']/div[1]/div[1]/div[3]/button")
    public WebElement missingInformationModalWindowOkButton;

    //sample configurator
    @FindBy(xpath = "//div[@class='input-group']//input[@id='order-due-date']")
    public WebElement orderDueDateField;

    @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")
    public WebElement datePickerSwitch;

    @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr[2]/th[3]")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//label[@for='terms']")
    public WebElement agreeToDeluxeFreeSamplePolicy;

    @FindBy(xpath = "//td[@class='day']")
    public List<WebElement> daysToPick;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[6]/div[2]/div[1]/div[1]/button[1]")
    public WebElement sampleCartRemoveButton;

    //modal window 'Remove'
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/div[contains(.,'Are you sure you would like to remove this item?')]")
    public WebElement removeModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/button")
    public WebElement removeModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[1]")
    public WebElement removeModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[2]")
    public WebElement removeModalWindowOkButton;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[6]/div/div/a")
    public WebElement productNameLink;

    @FindBy(xpath = "//a[contains(.,'Request Samples')]")
    public WebElement requestSamplesButton;

    @FindBy(xpath = "//button[contains(.,'Submit Sample Request')]")
    public WebElement submitSampleRequest;

    //reCAPTCHA modal window

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div[1]/div[contains(.,'reCAPTCHA Failed.')]")
    public WebElement reCAPTCHAModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div[1]/button")
    public WebElement reCAPTCHAModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div/div/div[2]/button")
    public WebElement reCAPTCHAModalWindowOkButton;

    //choose saved shipping address
    @FindBy(xpath = "//div[@id='shipping_address']/div[3]/div[1]/button[1]")
    public WebElement chooseASavedShippingAddressButton;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']/div[2]/div[2]/button[1]")
    public WebElement shipToThisAddressSecondInARowButton;

    @FindBy(xpath = "//div[@id='shipping_address']/div[1]/strong[1]")
    public WebElement displayedShippingAddress;

    @FindBy(xpath = "//div[@id='saved_shipping_addresses']/div[2]/div[2]/strong[1]")
    public WebElement newShippingAddress;

    @FindBy(xpath = "//div[@id='msg']/strong[contains(.,'Shipping Address Updated')]")
    public WebElement shippingAddressUpdatedMessage;

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

    @FindBy(xpath = "//div[@id='edit_shipping_address']/div[13]/div/div/label[contains(.,' Save this address ')]")
    public WebElement saveShippingAddressCheckBox;

    @FindBy(xpath = "//button[contains(.,'Submit Sample Request')]")
    public WebElement submitSampleRequestButton;
}
