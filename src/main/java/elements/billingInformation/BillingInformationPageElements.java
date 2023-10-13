package elements.billingInformation;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingInformationPageElements extends BaseElements {
    public BillingInformationPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    /*****************************BILLING INFORMATION PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Manage Contact Information')]")
    public WebElement manageContactInformationTitle;

    @FindBy(id = "company")
    public WebElement companyNameFieldManageContactInformationPage;

    @FindBy(xpath = "//input[@value='Save Changes']")
    public WebElement saveChangesButtonManageContactInformationPage;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[1]/h4[contains(.,'Success!')]")
    public WebElement successInformationMessageModalWindow;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']/div[1]/div[1]/div[3]/button[1]")
    public WebElement backToMyAccountButtonModalWindow;

    //Navigation
    @FindBy(xpath = "//a[contains(.,'Cancel')]")
    public WebElement cancelButtonManageContactInformationPage;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountBreadcrumbLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeBreadcrumbLink;
}
