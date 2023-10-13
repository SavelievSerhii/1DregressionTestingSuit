package elements.yourProductsReviews;

import elements.base.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourProductsReviewsPageElements extends BaseElements {
    public YourProductsReviewsPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*****************************YOUR PRODUCT REVIEWS PAGE ELEMENTS*****************************/

    @FindBy(xpath = "//h1[contains(.,'Review Your Purchases')]")
    public WebElement reviewYourPurchasesTitle;

    //Navigation
    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    public WebElement yourAccountBreadcrumbLink;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homePageBreadcrumbLink;

    @FindBy(xpath = "//a[contains(.,'Continue Shopping')]")
    public WebElement continueShoppingLink;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[3]/div[2]/div[1]/a[1]")
    public WebElement productNameFirstInTheRow;

    @FindBy(xpath = "//h1[@class='pageName marg0']")
    public WebElement productNameOnPDP;

    @FindBy(xpath = "//main[@id='main-content']/div[1]/div[3]/div[3]/a[1]")
    public WebElement writeAReviewButtonFirstInTheRow;

    //write a review page elements
    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='h3 gotham bold']")
    public WebElement productNameOnWriteAReviewPage;

    @FindBy(xpath = "//div[@class='col-sm-9 col-md-7']/form/div[1]/div[2]/div[1]/select[@id='review_overallRating']")
    public WebElement writeAReviewSelectStarsDropDown;

    @FindBy(xpath = "//div[@class='col-sm-9 col-md-7']/form/div[1]/div[2]/div[1]/select[@id='review_overallRating']/option[2]")
    public WebElement writeAReviewChoose5Stars;

    @FindBy(id = "review_comments")
    public WebElement writeAReviewTextArea;

    @FindBy(id = "review_firstName")
    public WebElement writeAReviewClientName;

    @FindBy(id = "review_city")
    public WebElement writeAReviewCityName;

    @FindBy(id = "review_state")
    public WebElement writeAReviewStateName;

    @FindBy(xpath = "//div[@class='panel panel-default']/div[2]/div[contains(.,'Drop image here or click to upload')]")
    public WebElement writeAReviewDropImageArea;

    @FindBy(id = "product_review_send")
    public WebElement writeAReviewSubmitReviewButton;

    @FindBy(xpath = "//h2[contains(.,'Thank you for your review!')]")
    public WebElement thankYouForYourReviewBanner;

    public By writeAReviewButton = By.cssSelector(".btn-primary");


}
