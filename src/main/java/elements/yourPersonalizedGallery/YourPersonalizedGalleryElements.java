package elements.yourPersonalizedGallery;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourPersonalizedGalleryElements extends BaseElements {

    public YourPersonalizedGalleryElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************YOUR PERSONALIZED GALLERY PAGE ELEMENTS*****************************/

    //navigation

    @FindBy(xpath = "//div[@class='navbar-container']/div[3]/div[2]/ul/li[9]/a[contains(.,'Your Personalized Gallery')]")
    public WebElement yourPersonalizeGalleryLink;

    @FindBy(xpath = "//h1[contains(.,' Your Personalized Gallery ')]")
    public WebElement yourPersonalizedGalleryPageTitle;

    //breadcrumb
    @FindBy(xpath = "//main[@id='main-content']/div/ol/li[3]/a[1]")
    public WebElement yourPersonalizedGalleryBreadcrumb;

    @FindBy(xpath = "//main[@id='main-content']/div/ol/li[2]/a[1]")
    public WebElement promotionalProductsBreadcrumb;

    @FindBy(xpath = "//main[@id='main-content']/div/ol/li[1]/a[1]")
    public WebElement homeBreadcrumb;

    //update logo
    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[4]/div[1]/div[1]/div[1]/p[2]/a[contains(.,'add your logo')]")
    public WebElement addYourLogoButton;

    @FindBy(xpath = "//div[@id='upload-logo-modal']/div/div/div//h4[contains(.,'Add Logo')]")
    public WebElement addLogoModalWindowTitle;

    @FindBy(xpath = "//div[@id='upload-logo-modal']/div/div/div/button[1]")
    public WebElement addLogoModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='upload-logo-modal']/div/div/div[2]/button[@id='close']")
    public WebElement addLogoModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='upload-logo-modal']/div/div/div[2]/form")
    public WebElement addLogoModalWindowDropFileArea;

    //share via email
    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[3]/div[1]/div[1]/a[1]/i[1]")
    public WebElement envelopeButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/button")
    public WebElement shareViaEmailModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/span[contains(.,'Email')]")
    public WebElement shareViaEmailModalWindowTitle;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[3]/div//div[2]/div[2]/input[1]")
    public WebElement shareViaEmailModalWindowSendEmailButton;

    @FindBy(id = "emailTo")
    public WebElement shareViaEmailModalWindowToField;

    @FindBy(id = "emailTo-error")
    public WebElement shareViaEmailModalWindowToErrorLabel;

    @FindBy(id = "emailFrom")
    public WebElement shareViaEmailModalWindowFromField;

    @FindBy(id = "emailFrom-error")
    public WebElement shareViaEmailModalWindowFromErrorLabel;

    //reCAPTCHA
    @FindBy(xpath = "//div[@class='modal-dialog modal-sm']/div/div/div[@id='bootboxBody']")
    public WebElement proveYouAreNotARobotTitle;

    @FindBy(xpath = "//div[@class='modal-dialog modal-sm']/div/div/button[1]")
    public WebElement proveYouAreNotARobotCrossButton;

    @FindBy(xpath = "//div[@class='modal-dialog modal-sm']/div/div[2]/button[1]")
    public WebElement proveYouAreNotARobotOkButton;


}
