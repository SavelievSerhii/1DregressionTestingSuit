package elements.shippingAddresses;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressesPageElements extends BaseElements {
    public ShippingAddressesPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************SHIPPING ADDRESSES PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Manage Shipping Addresses')]")
    public WebElement manageShippingAddressesTitle;

    @FindBy(xpath = "//a[contains(.,'Edit')]")
    public WebElement editButtonShippingAddresses;

    @FindBy(xpath = "//a[contains(.,'Cancel')]")
    public WebElement cancelButtonManageShippingAddressPage;

    //Edit
    @FindBy(xpath = "//h1[contains(.,'Edit Shipping Address')]")
    public WebElement editShippingAddressTitle;

    @FindBy(xpath = "//div[@class='row']/div/form/div[5]/div/input")
    public WebElement companyFieldEditShippingAddress;

    @FindBy(xpath = "//div[@class='row']/div/form/div[13]/div/input[@value='Save Changes']")
    public WebElement saveChangesButtonEditShippingAddress;

    @FindBy(xpath = "//div[@class='row']/div/form/div[13]/div/a[contains(.,'Cancel')]")
    public WebElement cancelButtonEditShippingAddress;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div/div/div/h4[contains(.,'Success!')]")
    public WebElement editSuccessModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div/div/div[3]/button[1]")
    public WebElement backToYourAddressesButton;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountLinkEditShippingAddress;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeLinkEditShippingAddress;

    //Add new address routine
    @FindBy(xpath = "//a[contains(.,' New Address')]")
    public WebElement addNewAddressButton;

    @FindBy(xpath = "//div[@class='row addresses']/div[2]/div/a[contains(.,'Delete')]")
    public WebElement deleteSecondInTheRowProduct;


    //modal window (delete)
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/button[1]")
    public WebElement deleteModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[1]")
    public WebElement deleteModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[2]")
    public WebElement deleteModalWindowOkButton;

    @FindBy(xpath = "//div[@id='msg']/strong[contains(.,'Address Removed')]")
    public WebElement addressRemovedInformationMessage;

    @FindBy(xpath = "//h1[contains(.,'New Shipping Address')]")
    public WebElement newShippingAddressTitle;

    @FindBy(id = "addressLabel")
    public WebElement addressLabelField;

    @FindBy(id = "countryID")
    public WebElement countryIDDropDown;

    @FindBy(xpath = "//select[@id='countryID']/option[2]")
    public WebElement chooseUSAFromDropDownMenu;

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "companyName")
    public WebElement companyNameField;

    @FindBy(id = "address1")
    public WebElement addressField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "stateID")
    public WebElement stateIDField;

    @FindBy(xpath = "//select[@id='stateID']/option[44]")
    public WebElement chooseTexasFromDropDown;

    @FindBy(id = "zipCode")
    public WebElement zipCodeField;




}
