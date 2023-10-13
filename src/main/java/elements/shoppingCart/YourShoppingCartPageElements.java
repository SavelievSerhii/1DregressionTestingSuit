package elements.shoppingCart;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourShoppingCartPageElements extends BaseElements {
    public YourShoppingCartPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************YOUR SHOPPING CART PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Your Shopping Cart')]")
    public WebElement shoppingCartTitle;

    @FindBy(xpath = "//div[@id='salesCart']/div[3]/div[1]/div[1]/a[1]")
    public WebElement nameOfProductShoppingCart;



    /*****************************DISCOUNT CODE*****************************/
   @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/label[contains(.,'Discount Code')]")
   public WebElement discountCodeLabel;

   @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[1]/input[1]")
    public WebElement discountCodeInputField;

   @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[1]/span[1]/button[contains(.,'Apply')]")
    public WebElement discountCodeApplyButton;

   @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[1]/span[2]/button[contains(.,'Remove')]")
   public WebElement discountCodeRemoveButton;

   //respond
    @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[2]/span[contains(.,'Discount code will be applied at checkout')]")
    public WebElement discountCodeAppliedLabel;

    @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[4]/strong[contains(.,'The Priority Service Code or Discount Code has expired.')]")
    public WebElement discountCodeExpiredLabel;

    @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[4]/strong[contains(.,'The Priority Service Code or Discount Code does not match any promotion.')]")
    public WebElement discountCodeDoesNotMatchLable;

    @FindBy(xpath = "//div[@id='cart_hasitems']/div[2]/div[1]/div[4]/button[1]")
    public WebElement discountCodeLabelCrossButton;

    @FindBy(xpath = "//div[@class='col-sm-4 text-right']/a[1]")
    public WebElement checkoutButton;


    //buttons
    @FindBy(xpath = "//div[@id='savedCart']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement moveToCartButton;

    @FindBy(xpath = "//div[@class='navbar-container']/div[3]/nav/div/div[2]/ul/li[5]/span[1]")
    public WebElement shoppingCartCounter;

    @FindBy(xpath = "//div[@id='salesCart']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")
    public WebElement removeButton;

    @FindBy(xpath = "//div[@id='savedCart']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
    public WebElement removeFromSaveForLaterButton;

    @FindBy(xpath = "//div[@id='salesCart']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement saveForLaterButton;

    @FindBy(xpath = "//div[@id='salesCart']/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/a[contains(.,' Modify')]")
    public WebElement modifyButton;


    //modal window
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div/div/div[1]/div[contains(.,'Are you sure you would like to remove this item?')]")
    public WebElement removeModalWindowContent;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div/div/div[1]/button[1]")
    public WebElement removeModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div/div/div[2]/button[1]")
    public WebElement removeModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div/div/div[2]/button[2]")
    public WebElement removeModalWindowOkButton;

    //check links for sign in and creation of account in a shopping cart while a usr is not authorized
    @FindBy(xpath = "//a[contains(.,'Create one »')]")
    public WebElement createOneLinkShoppingCartAsGuest;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[5]/a[1]")
    public WebElement signInLinkShoppingCartAsGuest;

    /**************CREATE AN ACCOUNT************/

    @FindBy(xpath = "//h1[contains(.,'  New Account Creation  ')]")
    public WebElement createAccountPageTitle;

    @FindBy(xpath = "//div[@class='form-group form_prev']/div/button[1]")
    public WebElement nextButtonCreateAccountPage;

    @FindBy(xpath = "//span[contains(.,' Please approve that you are not a robot at Step# 1 ')]")
    public WebElement pleaseImproveYouAreNotARobotSign;
}
