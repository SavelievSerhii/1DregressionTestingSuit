package elements.W2PConfigurator;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W2PConfiguratorPageElements extends BaseElements {
    public W2PConfiguratorPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************W2P CONFIGURATOR PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//div[@class='container media-nopadding media-header-mr']/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    public WebElement nameOfProductW2PConfigurator;

    /*****************************NAVIGATION*****************************/
    @FindBy(xpath = "//div[@class='container media-nopadding media-header-mr']/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    public WebElement backToShoppingLink;

    @FindBy(xpath = "//div[@id='backButtonPressed']/div[1]/div[1]/div[2]/h3[contains(.,'You will lose your design if you exit the Design Lab')]")
    public WebElement backToShoppingModalWindowContent;

    @FindBy(xpath = "//div[@id='backButtonPressed']/div[1]/div[1]/div[1]/div[1]")
    public WebElement backToShoppingModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='backButtonPressed']/div[1]/div[1]/div[3]/a[1]/strong[1]")
    public WebElement backToShoppingModalWindowExitAndScratchMyDesignButton;

    @FindBy(xpath = "//div[@id='backButtonPressed']/div[1]/div[1]/div[3]/a[2]/strong[1]")
    public WebElement backToShoppingModalWindowStayAndContinueWorkingButton;



    /*****************************ADD IMAGE/CLIPART/TEXT*****************************/

    @FindBy(xpath = "//div[@class='AddTextImage']/div[1]/div[1]/button[1]")
    public WebElement addImageButton;

    @FindBy(xpath = "//div[@id='dtFileUploadAlert']/div/span[contains(.,' Size matters! Your file size exceeds the maximum limit of 50MB.')]")
    public WebElement fileSizeExceedErrorLabel;

    @FindBy(xpath = "//div[@id='dtFileUploadAlert']/div/span/strong[contains(.,'Error!')]")
    public WebElement fileFormatErrorLabel;

    @FindBy(xpath = "//div[@id='dtFileUploadSelector']//div[contains(.,'BROWSE FOR A FILE')]")
    public WebElement browseForAFileButton;

    @FindBy(xpath = "//div[@id='mypopupModal']/div[1]/div[1]/div[3]/div[4]/div[1]/button[2]")
    public WebElement chooseImageButton;

    @FindBy(xpath = "//div[@id='mypopupModal']/div[1]/div[1]/div[3]/div[4]/div[1]/button[3]")
    public WebElement chooseImageButton2;

    @FindBy(xpath = "//div[@class='row no-margin ']//div[2]//button[1]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='inline-text-menu']/div[10]/div[2]/button[1]")
    public WebElement continueButton2;

    @FindBy(xpath = "//div[@id='left_my_clipart']//div[contains(.,'Clip Art')]")
    public WebElement clipArtButton;

    @FindBy(xpath = "//a[contains(.,' Animals ')]")
    public WebElement animalsLink;

    @FindBy(xpath = "//div[@id='my_clipart']/div[1]/div[2]/div[1]/a/div[1]/img[1]")
    public WebElement animalLogo;

    @FindBy(xpath = "//button[contains(.,' Add Text ')]")
    public WebElement addTextButton;

    @FindBy(xpath = "//div[@class='col-xs-6 col-sm-6 col-md-6 col-lg-7 no_padding']/div[1]/div[2]")
    public WebElement curveTextSectionMiddleButton;

    @FindBy(xpath = "//span[contains(.,'NEXT: OPTIONS ')]")
    public WebElement nextOptionsButton;

    @FindBy(xpath = "//div[@class='options_panel']/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")
    public WebElement thirdRadioButtonOptionsPage;

    //used for custom coasters
    @FindBy(xpath = "//div[@class='options_panel']/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement secondRadioButtonOptionPage;

    @FindBy(xpath = "//div[@class='options_panel']/div[2]/div[1]/div[1]/button[1]")
    public WebElement insideCoreColorButton;

    @FindBy(xpath = "//div[@class='btn-group bootstrap-select to_select form-control open']/div[1]/ul/li[2]/a/span[1]")
    public WebElement chooseInsideCoreColorDropDownMenu;

    @FindBy(xpath = "//div[@class='btn-group bootstrap-select to_select form-control open']/div[1]/ul[1]/li[4]/a[1]/span[1]")
    public WebElement chooseThirdValueQuantityDropDownCustomCoasters;

    @FindBy(xpath = "//div[@class='vr-line next_button']/div[5]/span[contains(.,'NEXT: REVIEW ')]")
    public WebElement nextReviewButton;

    @FindBy(xpath = "//div[@class='review_panel']/div[1]/div[1]/button[1]/span[1]")
    public WebElement quantityDropDownMenu;

    @FindBy(xpath = "//div[@class='dropdown-menu open']/ul[1]/li[4]/a[1]/span[1]")
    public WebElement thirdValueInDropDownQuantityMenu;

    @FindBy(xpath = "//div[@class='form-group']/div[1]/div[2]/div[1]/input[@class='imprint-radio-input js-3prod-input']")
    public WebElement threeDayRushRadioButton;

    @FindBy(xpath = "//div[@class='review_box']/div[1]/div[1]/label[1]/span[1]")
    public WebElement reviewMyDesignCheckBox;

    @FindBy(xpath = "//div[@id='ft_addtocart']/span[contains(.,'ADD TO CART')]")
    public WebElement addToCartButton;



}
