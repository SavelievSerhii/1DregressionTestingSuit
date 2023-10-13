package elements.PLP;

import elements.base.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProductListingPageElements extends BaseElements {
    public ProductListingPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************PRODUCT LISTING PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,' Custom Promotional Apparel ')]")
    public WebElement customPromotionalProductsPLPTitle;

    /*******************************FILTERS*******************************/

    @FindBy(xpath = "//div[@class='panel-heading']//div[1]//div[4]//button[1]")
    public WebElement fortyItemsPerPageButton;

    @FindBy(xpath = "//div[@class='panel-heading']//div[1]//div[4]//button[2]")
    public WebElement hundredItemsPerPageButton;

    @FindBy(xpath = "//div[@class='row']//section")
    public WebElement quantityOfElementsOnPLP;

    /*******************************FACETS*******************************/

    //the first facet in a row is used

    @FindBy(xpath = "//div[@id='filters']//div[11]//div[1]//label[1]")
    public WebElement freeRushProductionFacet;

    @FindBy(xpath = "//div[@id='filters']//div[13]//div[1]//label[1]")
    public WebElement genderFacet;

    @FindBy(xpath = "//div[@id='filters']//div[15]//div[1]//div[1]//label[1]")
    public WebElement materialFacet;

    @FindBy(xpath = "//div[@id='filters']//div[17]//div[1]//div[1]//label[1]")
    public WebElement itemColorFacet;

    @FindBy(xpath = "//div[@id='filters']/div[17]/div/div[1]")
    public WebElement brandFacet;

    @FindBy(xpath = "//nav[@id='filters-clampedwidth']/div[1]/div[28]")
    public WebElement ageFacet;

    //links in 'Categories' section on PLP
    @FindBy(xpath = "//div[@id='filters']//div[4]//a[1]")
    public WebElement tShirtCategoryLink;

    @FindBy(xpath = "//div[@id='filters']//div[4]//a[2]")
    public WebElement outwearCategoryLink;

    @FindBy(xpath = "//div[@id='filters']//div[4]//a[3]")
    public  WebElement hatsAndOtherHeadwearCategoryLink;

    @FindBy(xpath = "//div[@id='filters']//div[4]//a[4]")
    public  WebElement poloShirtsCategoryLink;

    @FindBy(xpath = "//div[@id='filters']//div[4]//a[5]")
    public WebElement sweatshirtsCategoryLink;


    //counter of items on a page after filtering
    @FindBy(xpath = "//div[@class='font26 tile-counter']")
    public WebElement quantityOfResultsAfterFiltering;

    /*******************************PRICE RANGE SLIDER******************************/

    @FindBy(xpath = "//div[@class='row']//nav[1]/div[1]/div[18]")
    public WebElement priceRangeFacetPLP;

    @FindBy(xpath = "//div[@id='Group7_l']/form[1]/div[1]/div[3]/span[1]")
    public WebElement leftPriceRangeSliderPLP;

    @FindBy(xpath = "//div[@id='Group6_l']/form[1]/div[1]/div[3]/span[1]")
    public WebElement leftPriceRangeSliderPLP2;

    @FindBy(xpath = "//div[@id='Group7_l']/form[1]/div[1]/div[3]/span[2]")
    public WebElement rightPriceRangeSliderPLP;

    @FindBy(xpath = "//div[@id='Group7_l']/form[1]/div[1]/div[3]/span[2]")
    public WebElement rightPriceRangeSliderPLP2;

    @FindBy(xpath = "//div[@id='Group7_l']/form[1]/div[1]/div[4]/button[1]")
    public WebElement priceRangePLPApplyButton;

    @FindBy(xpath = "//div[@id='Group6_l']/form[1]/div[1]/div[4]/button[1]")
    public WebElement priceRangePLPApplyButton2;

    @FindBy(id = "min-price")
    public WebElement minValuePriceRangeSliderFiledPLP;

    @FindBy(id = "max-price")
    public WebElement maxValuePriceRangeSliderFieldPLP;

    @FindBy(xpath = "//div[@class='row']//section//div[3]//div[2]//p//span[2]")
    public List<WebElement> pricesForEachUnitPLP;

    /*******************************WISHLIST******************************/

    @FindBy(xpath = "//div[@class='row']//section//div[3]//div[4]//div[2]//button[1]")
    public List<WebElement> saveToWishlistButtonsPLP;

    @FindBy(xpath = "//div[@class='row']//section[1]//div[1]//div[3]//div[4]/div[2]/button[1]")
    public  WebElement saveToWishlistButtonPLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[1]//span[contains(.,'Save to Wish List')]")
    public WebElement saveToWishlistModalWindowTitlePLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[1]//button[1]")
    public WebElement saveToWishlistModalWindowCrossButtonPLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[3]/button[1]")
    public WebElement saveToWishlistModalWindowCloseButtonPLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[2]/div[1]/form[1]/div[1]/input[@id='wishlist-name']")
    public WebElement saveToWishlistModalWindowFieldPLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/button[1]")
    public WebElement saveToWishlistModalWindowCreateButtonPLP;

    @FindBy(xpath = "//strong[contains(.,'Wishlist Updated')]")
    public WebElement saveToWishlistWishlistUpdatedMessage;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[2]/div[1]/div[contains(.,'This product is already in the wish list. Please select another wish list or create new.')]")
    public  WebElement saveToWishlistModalWindowErrorMessagePLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]/div[1]/div[2]/div[1]/form[1]/label[contains(.,'Please enter at least 3 characters for your wish list name')]")
    public WebElement saveToWishlistModalWindowLabelPLP;

    @FindBy(xpath = "//div[@id='wishlistModal']//div[1]//div[1]/div[2]/div[1]/div[4]/table[1]/tbody/tr[1]/td[1]/button[1]")
    public WebElement saveToWishlistModalWindowAdditionalSaveButtonPLP;

    /*******************************COMPARISONS******************************/

    @FindBy(xpath = "//div[@class='row']//section//div[3]//div[4]//div[2]//button[2]")
    public List<WebElement> addToComparisonsButtonsPLP;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[1]/div[2]/div[contains(.,'This product has been added to your comparison list')]")
    public WebElement addedToComparisonsModalWindowMessagePLP;

    @FindBy(xpath = "//div[@class='bootbox modal fade in']//div[1]/div[1]/div[3]/button[1]")
    public WebElement addedToComparisonsModalWindowViewComparisonsButtonPLP;

    @FindBy(xpath = "//div[@class='modal-dialog modal-sm']//div[1]/div[3]/button[2]")
    public WebElement addedToComparisonsModalWindowOkButtonPLP;

    @FindBy(xpath = "//div[@class='modal-dialog modal-sm']//div[1]/div[2]//div[contains(.,'The compare cart already has the maximum number of items allowed')]")
    public WebElement addToComparisonsModalWindowErrorMessagePLP;
}
