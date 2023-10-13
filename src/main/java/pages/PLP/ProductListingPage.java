package pages.PLP;

import elements.PLP.ProductListingPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

import java.util.List;

public class ProductListingPage extends BasePage {

    ProductListingPageElements elements;

    public ProductListingPage(WebDriver driver, WebDriverWait wait, ProductListingPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void getToPLPApparel() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //wait for the 'Apparel' PLP to be loading
        waitElementIsVisible(elements.customPromotionalProductsPLPTitle);
    }

    public void getToPLPTShirts() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //click on 'T-Shirts' link
        waitElementIsVisible(elements.tShirtCategoryLink);
        clickOnElementIfReady(elements.tShirtCategoryLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPOutwear() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //click on 'Outwear' link
        waitElementIsVisible(elements.outwearCategoryLink);
        clickOnElementIfReady(elements.outwearCategoryLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPHatsAndOtherHeadwear() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //click on 'Hats and Other Headwear' link
        waitElementIsVisible(elements.hatsAndOtherHeadwearCategoryLink);
        clickOnElementIfReady(elements.hatsAndOtherHeadwearCategoryLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPPoloShirts() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //click on 'Polo Shirts' link
        waitElementIsVisible(elements.poloShirtsCategoryLink);
        clickOnElementIfReady(elements.poloShirtsCategoryLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPSweatshirts() {
        //click on 'Promotional Products & Apparel' navigation bar
        waitElementIsVisible(elements.promotionalProductsNavigationBar);
        clickOnElementIfReady(elements.promotionalProductsNavigationBar);

        //click on 'Apparel' link
        waitElementIsVisible(elements.apparelOptionOfPromotionalProducts);
        clickOnElementIfReady(elements.apparelOptionOfPromotionalProducts);
        waitForJSToBeLoaded();

        //click on 'Sweatshirts' link
        waitElementIsVisible(elements.sweatshirtsCategoryLink);
        clickOnElementIfReady(elements.sweatshirtsCategoryLink);
        waitForJSToBeLoaded();
    }


    public void getToPLPBusinessCards() {
        //click on 'Print Marketing' navigation bar
        waitElementIsVisible(elements.printMarketingNavigationBar);
        clickOnElementIfReady(elements.printMarketingNavigationBar);
        waitForJSToBeLoaded();

        //click on 'Business Cards' link
        waitElementIsVisible(elements.businessCardsLink);
        clickOnElementIfReady(elements.businessCardsLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPCustomPostcards() {
        //click on 'Print Marketing' navigation bar
        waitElementIsVisible(elements.printMarketingNavigationBar);
        clickOnElementIfReady(elements.printMarketingNavigationBar);
        waitForJSToBeLoaded();

        //click on 'Custom Postcards' link
        waitElementIsVisible(elements.customPostcardsLink);
        clickOnElementIfReady(elements.customPostcardsLink);
        waitForJSToBeLoaded();
    }

    public void getToPLPCustomCoasters() {
        //click on 'Print Marketing' navigation bar
        waitElementIsVisible(elements.printMarketingNavigationBar);
        clickOnElementIfReady(elements.printMarketingNavigationBar);
        waitForJSToBeLoaded();

        //click on 'Custom Coasters' link
        waitElementIsVisible(elements.customCoastersLink);
        clickOnElementIfReady(elements.customCoastersLink);
        waitForJSToBeLoaded();
    }

    public int checkItemsPerPageWorksProperly() {
        waitElementIsVisible(elements.hundredItemsPerPageButton);
        clickOnElementIfReady(elements.hundredItemsPerPageButton);

        List<WebElement> quantityOfElementsPerPage = driver.findElements(By.xpath("//div[@class='row']//section"));
        int size = quantityOfElementsPerPage.size();
        return size;
    }

    public int checkItemsPerPageWorksProperly2() {
        waitElementIsVisible(elements.fortyItemsPerPageButton);
        clickOnElementIfReady(elements.fortyItemsPerPageButton);

        List<WebElement> quantityOfElementsPerPage = driver.findElements(By.xpath("//div[@class='row']//section"));
        int size = quantityOfElementsPerPage.size();
        return size;
    }

    public String checkFacet(WebElement element) {
        String text = waitElementIsVisible(element).getText();
        String[] split = text.split(" ");
        String replace = split[split.length-1].replace("(", "").replace(")", "");

        waitElementIsVisible(element);
        jsScroll(element);
        clickOnElementIfReady(element);
        waitForJSToBeLoaded();

        return replace;
    }

//    public String quantityOfResultAfterFiltering(WebElement element) {
//        String text = waitElementIsVisible(element).getText();
//        return text;
//    }

    public String quantityOfResultAfterFiltering() {
        String text = waitElementIsVisible(elements.quantityOfResultsAfterFiltering).getText();
        return text;
    }

    public void checkPriceSliderWorksProperly() {
        //adjust price range with the help of slider
        jsScroll(elements.ageFacet);
        waitElementIsVisible(elements.priceRangeFacetPLP);
        clickOnElementIfReady(elements.priceRangeFacetPLP);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        clickOnElementIfReady(elements.priceRangeFacetPLP);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        jsScroll(elements.leftPriceRangeSliderPLP);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        clickOnElementIfReady(elements.leftPriceRangeSliderPLP);
        dragSlider(elements.leftPriceRangeSliderPLP, 50, 0);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        dragSlider(elements.rightPriceRangeSliderPLP, -50, 0);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //push 'Apply' button
        jsScroll(elements.priceRangePLPApplyButton);
        waitElementIsVisible(elements.priceRangePLPApplyButton);
        clickOnElementIfReady(elements.priceRangePLPApplyButton);
        waitForJSToBeLoaded();
        jsScroll(elements.quantityOfElementsOnPLP);
        String numberOfResults = waitElementIsVisible(elements.quantityOfResultsAfterFiltering).getText();
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //push 'Apply' button again
        jsScroll(elements.priceRangePLPApplyButton2);
        waitElementIsVisible(elements.priceRangePLPApplyButton2);
        clickOnElementIfReady(elements.priceRangePLPApplyButton2);
        waitForJSToBeLoaded();
        jsScroll(elements.quantityOfElementsOnPLP);
        String numberOfResults2 = waitElementIsVisible(elements.quantityOfResultsAfterFiltering).getText();

        //check that the search of result the same (stability and no issues)
        Assert.assertEquals(numberOfResults, numberOfResults2);
    }

    public void checkPriceRangeSliderFilterFunctionality() {
        //Get minimum and maximum values for comparison procedure
        jsScroll(elements.ageFacet);
        waitElementIsVisible(elements.priceRangeFacetPLP);
        clickOnElementIfReady(elements.priceRangeFacetPLP);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        clickOnElementIfReady(elements.priceRangeFacetPLP);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        jsScroll(elements.leftPriceRangeSliderPLP);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
        clickOnElementIfReady(elements.leftPriceRangeSliderPLP);
        dragSlider(elements.leftPriceRangeSliderPLP, 50, 0);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        dragSlider(elements.rightPriceRangeSliderPLP, -50, 0);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //push 'Apply' button
        jsScroll(elements.priceRangePLPApplyButton);
        waitElementIsVisible(elements.priceRangePLPApplyButton);
        clickOnElementIfReady(elements.priceRangePLPApplyButton);
        waitForJSToBeLoaded();
        jsScroll(elements.quantityOfElementsOnPLP);
        String numberOfResults = waitElementIsVisible(elements.quantityOfResultsAfterFiltering).getText();
        waitForJSToBeLoaded();

        //min
        waitElementIsVisible(elements.minValuePriceRangeSliderFiledPLP);
        String minValueString = clickOnElementIfReady(elements.minValuePriceRangeSliderFiledPLP).getAttribute("value");
        double minValueDouble = Double.parseDouble(minValueString);

        //max
        waitElementIsVisible(elements.maxValuePriceRangeSliderFieldPLP);
        String maxValueString = clickOnElementIfReady(elements.maxValuePriceRangeSliderFieldPLP).getAttribute("value");
        double maxValueDouble = Double.parseDouble(maxValueString);

        //check the price filter results are valid
        for (int i = 0; i < elements.pricesForEachUnitPLP.size(); i++) {
            String text = waitElementIsVisible(elements.pricesForEachUnitPLP.get(i)).getText();
            String[] arrayStrings = text.split(" ");
            String newString = arrayStrings[0].replace("/", "").replace("$", "");
            double newDouble = Double.parseDouble(newString);
            if (newDouble > minValueDouble && newDouble < maxValueDouble) {
                System.out.println("The price is in the range");
            } else System.out.println("The price is out of the range");
        }
    }

    public void checkAddProductToWishlistFunctionality() {
        for (int i = 5; i < elements.saveToWishlistButtonsPLP.size()-30; i++) {
            //push 'Save to Wishlist' button
            waitElementIsVisible(elements.saveToWishlistButtonsPLP.get(i));
            clickOnElementIfReady(elements.saveToWishlistButtonsPLP.get(i));
            waitForJSToBeLoaded();

            //wait for the modal window to open and click on cross
            waitElementIsVisible(elements.saveToWishlistModalWindowTitlePLP);
            clickOnElementIfReady(elements.saveToWishlistModalWindowCrossButtonPLP);

            //push 'Save to Wishlist' button
            waitElementIsVisible(elements.saveToWishlistButtonsPLP.get(i));
            clickOnElementIfReady(elements.saveToWishlistButtonsPLP.get(i));
            waitForJSToBeLoaded();

            //wait for the modal window to open and click on 'Close' button
            waitElementIsVisible(elements.saveToWishlistModalWindowTitlePLP);
            clickOnElementIfReady(elements.saveToWishlistModalWindowCloseButtonPLP);

            //push 'Save to Wishlist' button
            waitElementIsVisible(elements.saveToWishlistButtonsPLP.get(i));
            clickOnElementIfReady(elements.saveToWishlistButtonsPLP.get(i));
            waitForJSToBeLoaded();

            //fill in wishlist's name
            waitElementIsVisible(elements.saveToWishlistModalWindowFieldPLP);
            clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).clear();
            clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).sendKeys("My wishlist" + " " + i);

            //push 'Create' button
            waitElementIsVisible(elements.saveToWishlistModalWindowCreateButtonPLP);
            clickOnElementIfReady(elements.saveToWishlistModalWindowCreateButtonPLP);
            waitForJSToBeLoaded();

            //wait for the information message to appear
            waitElementIsVisible(elements.saveToWishlistWishlistUpdatedMessage);
            makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        }
    }

    public void addTheSameProductToWishlistCart() {
        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistButtonPLP);
        waitForJSToBeLoaded();

        //wait for the modal window to open and click on cross
        waitElementIsVisible(elements.saveToWishlistModalWindowTitlePLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCrossButtonPLP);

        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistButtonPLP);
        waitForJSToBeLoaded();

        //wait for the modal window to open and click on 'Close' button
        waitElementIsVisible(elements.saveToWishlistModalWindowTitlePLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCloseButtonPLP);

        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistButtonPLP);
        waitForJSToBeLoaded();

        //fill in less symbols than arranged and check respond
        waitElementIsVisible(elements.saveToWishlistModalWindowFieldPLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).clear();
        clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).sendKeys("QA");

        //push 'Create' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCreateButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCreateButtonPLP);
        waitForJSToBeLoaded();

        String backgroundColor = clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).getCssValue("background-color");
        waitElementIsVisible(elements.saveToWishlistModalWindowLabelPLP);

        Assert.assertEquals(backgroundColor, "rgba(255, 183, 183, 1)");


        //fill in wishlist's name
        waitElementIsVisible(elements.saveToWishlistModalWindowFieldPLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).clear();
        clickOnElementIfReady(elements.saveToWishlistModalWindowFieldPLP).sendKeys("My wishlist" + " " + "(extra)");

        //push 'Create' button
        waitElementIsVisible(elements.saveToWishlistModalWindowCreateButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCreateButtonPLP);
        waitForJSToBeLoaded();

        //wait for the information message to appear
        waitElementIsVisible(elements.saveToWishlistWishlistUpdatedMessage);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);


        //push 'Save to Wishlist' button
        waitElementIsVisible(elements.saveToWishlistButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistButtonPLP);
        waitForJSToBeLoaded();

        //save the same product to already existing wishlist
        waitElementIsVisible(elements.saveToWishlistModalWindowAdditionalSaveButtonPLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowAdditionalSaveButtonPLP);
        waitForJSToBeLoaded();

        //wait for an error message to appear
        waitElementIsVisible(elements.saveToWishlistModalWindowErrorMessagePLP);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);

        //wait for the modal window to open and click on 'Close' button
        waitElementIsVisible(elements.saveToWishlistModalWindowTitlePLP);
        clickOnElementIfReady(elements.saveToWishlistModalWindowCloseButtonPLP);
    }

    public void checkAddProductToComparisonsFunctionality() {
        int maxQuantityOfProductsInComparisons = 6;
        for (int i = 13; i < elements.addToComparisonsButtonsPLP.size() - 21; i++) {
            waitElementIsVisible(elements.addToComparisonsButtonsPLP.get(i));
            clickOnElementIfReady(elements.addToComparisonsButtonsPLP.get(i));

            waitElementIsVisible(elements.addedToComparisonsModalWindowMessagePLP);
            clickOnElementIfReady(elements.addedToComparisonsModalWindowOkButtonPLP);
            waitForJSToBeLoaded();
        }

        for (int i = 19; i < elements.addToComparisonsButtonsPLP.size() - 20; i++) {
            waitElementIsVisible(elements.addToComparisonsButtonsPLP.get(i));
            clickOnElementIfReady(elements.addToComparisonsButtonsPLP.get(i));

            waitElementIsVisible(elements.addToComparisonsModalWindowErrorMessagePLP);
            waitElementIsVisible(elements.addedToComparisonsModalWindowViewComparisonsButtonPLP);
            clickOnElementIfReady(elements.addedToComparisonsModalWindowViewComparisonsButtonPLP);
            waitForJSToBeLoaded();
            makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
            driver.navigate().back();
        }
    }
}
