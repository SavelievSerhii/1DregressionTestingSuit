package elements.yourImages;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class YourImagesPageElements extends BaseElements {
    public YourImagesPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    /*****************************YOUR IMAGES PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountLinkBreadcrumb;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeLinkBreadcrumb;

    @FindBy(xpath = "//h1[contains(.,'Your Images and Proofs')]")
    public WebElement yourImagesPageTitle;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[1]/a[contains(.,'Your Images')]")
    public WebElement yourImagesTab;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[2]/a[contains(.,'Your Proofs')]")
    public WebElement yourProofsTab;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[1]/div[1]/div[1]/label/select[1]")
    public WebElement paginationDropDown;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[1]/div[1]/div[1]/label/select[1]/option[3]")
    public WebElement option50PaginationDropDown;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[1]/div[2]/div[1]/label/input")
    public WebElement searchField;

    @FindBy(xpath = "//div[@id='customer_images_table_info']")
    public WebElement customerImagesInformation;

    @FindBy(xpath = "//div[@id='customer_images_table_paginate']/ul[1]/li[1]/a[1]")
    public WebElement previousLink;

    @FindBy(xpath = "//div[@id='customer_images_table_paginate']/ul[1]/li[6]/a[1]")
    public WebElement nextLink;

    @FindBy(xpath = "//div[@id='customer_images_table_paginate']/ul/li[3]/a[contains(.,'2')]")
    public WebElement chooseSecondPageLink;

    @FindBy(xpath = "//div[@id='customer_images_table_paginate']/ul/li[4]/a[contains(.,'3')]")
    public WebElement chooseThirdPageLink;

    //Table first in the row
    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[1]/a/img")
    public WebElement imageThumbnailInTable;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]")
    public WebElement imageNameInTable;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[3]/span")
    public WebElement imageTitle;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[4]/span")
    public WebElement imageDescription;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr/td[2]")
    public List<WebElement> imageNamesInTable;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[7]/button[1]")
    public WebElement editButtonInTable;

    @FindBy(xpath = "//div[@id='customer_images_table_wrapper']/div[2]/div[1]/table[1]/tbody/tr[1]/td[7]/button[2]")
    public WebElement deleteButtonInTable;

    //Edit modal window
    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[1]/div[contains(.,'Edit Image')]")
    public WebElement editImageModalWindowTitle;

    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[1]/button")
    public WebElement editImageModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    public WebElement editImageModalWindowTitleField;

    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]")
    public WebElement editImageModalWindowDescriptionField;

    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[3]/button[1]")
    public WebElement editImageModalWindowCloseButton;

    @FindBy(xpath = "//div[@class='modal fade in']/div[1]/div[1]/div[3]/button[2]")
    public WebElement editImageModalWindowSaveChangesButton;


    //Delete modal window
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/button[1]")
    public WebElement deleteImageModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[1]/div[contains(.,'Are you sure ?')]")
    public WebElement deleteImageModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[1]")
    public WebElement deleteImageModalWindowCancelButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-confirm']/div[1]/div[1]/div[2]/button[2]")
    public WebElement deleteImageModalWindowOkButton;

    @FindBy(xpath = "//div[@id='msg']/strong[contains(.,'Image Deleted')]")
    public WebElement imageDeletedInformationMessage;

    //Proofs Tab
    @FindBy(xpath = "//table[@id='customer_proofs_table']/tbody/tr[1]/td[1]/a/img")
    public WebElement imageThumbnailProofsTab;

    @FindBy(xpath = "//table[@id='customer_proofs_table']/tbody/tr[1]/td[2]/a[1]")
    public WebElement orderNumberProofsTab;

    @FindBy(xpath = "//table[@id='customer_proofs_table']/tbody/tr[1]/td[4]/a[1]")
    public WebElement productNameProofsTab;

    @FindBy(xpath = "//table[@id='customer_proofs_table']/tbody/tr[1]/td[6]/a[1]")
    public WebElement downloadIconProofsTab;

    //Order Details via 'Your Proofs' tab
    @FindBy(xpath = "//main[@id='main-content']/div[1]/button[1]")
    public WebElement orderDetailsEmailButton;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/a[1]")
    public WebElement orderDetailsPrintButton;

    @FindBy(xpath = "//span[contains(.,'  Order Confirmation  ')]")
    public WebElement orderConfirmationTitle;

    //Email modal window
    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/span[contains(.,'Email')]")
    public WebElement emailModalWindowTitle;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/button[1]")
    public WebElement emailModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement emailModalWindowFriendsEmailField;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement emailModalWindowYourEmailField;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div[1]/div[3]/textarea[1]")
    public WebElement emailModalWindowTextArea;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[3]/div[1]/div[2]/div[2]/input[@value='Send Email']")
    public WebElement emailModalWindowSendEmailButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[contains(.,'To email address is required')]")
    public WebElement emailModalWindowToEmailAddressRequired;

    @FindBy(xpath = "//div[@id='emailModal']/form/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[contains(.,'From email address is required')]")
    public WebElement emailModalWindowFromEmailAddressRequired;

    //CAPTCHA modal window
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[@id='bootboxBody']")
    public WebElement reCAPTCHATitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button[1]")
    public WebElement reCAPTCHAOkButton;

    //Edit icon
    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[1]/div[contains(.,'Edit Image')]")
    public WebElement editImageNameModalWindowTitle;

    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[1]/button[1]")
    public WebElement editImageNameModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[2]/form/div[1]/input[@id='customer_image_title']")
    public WebElement editImageNameModalWindowTitleField;

    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[2]/form/div[2]/input[@id='customer_image_desc']")
    public WebElement editImageNameModalWindowDescriptionField;

    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[3]/button[1]")
    public WebElement editImageNameModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='edit_customer_image_modal']/div[1]/div[1]/div[3]/button[2]")
    public WebElement editImageNameModalWindowSaveChangesButton;



}
