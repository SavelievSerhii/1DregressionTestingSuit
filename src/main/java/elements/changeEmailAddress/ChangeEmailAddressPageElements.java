package elements.changeEmailAddress;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeEmailAddressPageElements extends BaseElements {
    public ChangeEmailAddressPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************CHANGE EMAIL ADDRESS PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Change Your Email Address')]")
    public WebElement changeEmailAddressTitle;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountBreadCrumbsLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeBreadCrumbsLink;

    @FindBy(id = "newEmail")
    public WebElement emailFieldChangeEmailAddress;

    @FindBy(xpath = "//div[@class='container-fluid container-content']//div[7]//div[1]//form[1]//div[2]//input")
    public WebElement passwordFieldChangeEmailAddress;

    @FindBy(xpath = "//a[contains(.,'Cancel')]")
    public WebElement cancelButtonChangeEmailAddress;

    @FindBy(xpath = "//input[@value='Save Changes']")
    public WebElement saveChangesButtonChangeEmailAddress;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/div[contains(.,'ReCAPTCHA validation failed.')]")
    public WebElement reCAPTCHAModalWindowTitle;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[1]/button")
    public WebElement reCAPTCHAModalWindowCrossButton;

    @FindBy(xpath = "//div[@class='bootbox modal fade in bootbox-alert']/div[1]/div[1]/div[2]/button")
    public WebElement reCAPTCHAOkButton;
}
