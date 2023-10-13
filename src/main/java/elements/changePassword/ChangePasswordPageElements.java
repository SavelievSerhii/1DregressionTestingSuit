package elements.changePassword;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPageElements extends BaseElements {
    public ChangePasswordPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************CHANGE PASSWORD PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Change Your Password')]")
    public WebElement changeYourPasswordTitle;

    @FindBy(id = "existingPassword")
    public WebElement currentPasswordFieldChangePasswordPage;

    @FindBy(id = "newPassword")
    public WebElement newPasswordFieldChangePasswordPage;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordFieldChangePasswordPage;

    @FindBy(xpath = "//a[contains(.,'Cancel')]")
    public WebElement cancelButtonChangePasswordPage;

    @FindBy(xpath = "//input[@value='Save Changes']")
    public WebElement saveChangesButtonChangePasswordPage;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountBreadCrumbLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homePageBreadCrumbLink;

    @FindBy(xpath = "//div/div[@id='rc-imageselect']/div[3]/div[2]/div/div[2]/button")
    public WebElement verifyButtonCAPTCHA;
}
