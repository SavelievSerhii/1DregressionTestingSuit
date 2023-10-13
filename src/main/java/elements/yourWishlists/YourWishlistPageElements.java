package elements.yourWishlists;

import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YourWishlistPageElements extends BaseElements {
    public YourWishlistPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    /*****************************YOUR WISH LISTS PAGE ELEMENTS*****************************/
    @FindBy(xpath = "//h1[contains(.,'Wishlist')]")
    public WebElement yourWishlistsTitle;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountBreadcrumbLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homePageBreadcrumbLink;
}
