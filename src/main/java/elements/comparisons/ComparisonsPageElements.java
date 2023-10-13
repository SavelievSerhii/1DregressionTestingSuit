package elements.comparisons;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class ComparisonsPageElements extends BaseElements {
    public ComparisonsPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************COMPARISONS PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Comparisons')]")
    public WebElement comparisonsPageTitle;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeBreadcrumbLink;

    @FindBy(xpath = "//table[@class='table table-hover table-nonfluid']/tbody/tr[4]/td/a[1]")
    public WebElement productNameLink;

    @FindBy(xpath = "//table[@class='table table-hover table-nonfluid']/tbody/tr[2]/td/a/img")
    public WebElement productImageLink;

    @FindBy(xpath = "//button[@title='Share this list using a link']")
    public WebElement shareLinkIcon;

    //share link modal window
    @FindBy(xpath = "//div[@id='linkModal']/div[1]/div[1]/div[1]/h4[contains(.,'Share Link')]")
    public WebElement shareLinkModalWindowTitle;

    @FindBy(xpath = "//div[@id='linkModal']/div[1]/div[1]/div[1]/button[1]")
    public WebElement shareLinkModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='linkModal']/div[1]/div[1]/div[3]/button[1]")
    public WebElement shareLinkModalWindowCloseButton;

    @FindBy(xpath = "//div[@id='linkModal']/div[1]/div[1]/div[2]/input[1]")
    public WebElement shareLinkModalWindowLinkField;

    @FindBy(xpath = "//div[@id='share-button-container']/button[1]")
    public WebElement envelopeIcon;

    //modal window
    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/span[contains(.,'Email')]")
    public WebElement emailModalWindowTitle;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[1]/button[1]")
    public WebElement emailModalWindowCrossButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div/div/div[1]/input[@id='emailTo']")
    public WebElement emailModalWindowFriendEmailField;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div[1]/div[1]/div[1]/label[@id='emailTo-error']")
    public WebElement emailModalWindowFriendEmailLabel;

    //CAPTCHA modal window
    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[contains(.,'Please prove that you are not a robot.')]")
    public WebElement recaptchaModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/button[1]")
    public WebElement recaptchaModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button[1]")
    public WebElement recaptchaModalWindowOkButton;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div/div[2]/div[1]/input[@id='emailFrom']")
    public WebElement emailModalWindowYourEmailField;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[2]/div[1]/div[2]/div[1]/label[@id='emailFrom-error']")
    public WebElement emailModalWindowYourEmailLabel;

    @FindBy(xpath = "//div[@id='emailModal']/form/div/div/div[3]/div[1]/div[2]/div[2]/input[@value='Send Email']")
    public WebElement emailModalWindowSendEmail;

    //Remove
    @FindBy(xpath = "//div[@id='message-compare-item-count']")
    public WebElement canAdd6ItemsForCompare;

    @FindBy(xpath = "//div[@class='table-responsive comparison-table']/table/tbody/tr[1]/td/a[contains(.,'Remove')]")
    public WebElement removeLink;

    //PDP
    @FindBy(xpath = "//h1[@class='pageName marg0']")
    public WebElement productNamePDP;
}
