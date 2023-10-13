package pages.W2PConfigurator;

import elements.W2PConfigurator.W2PConfiguratorPageElements;
import elements.base.BaseElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import utility.Constant;

public class W2PConfiguratorPage extends BasePage {

    W2PConfiguratorPageElements elements;
    public W2PConfiguratorPage(WebDriver driver, WebDriverWait wait, W2PConfiguratorPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /*****************************MAIN METHODS*****************************/

    public void verifyW2PConfiguratorPageIsLoaded() {
        //click on 'ADD IMAGE' button
        waitElementIsVisible(elements.addImageButton);
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
    }

    public void addImageToProduct() {
        //click on 'ADD IMAGE' button
        waitElementIsVisible(elements.addImageButton);
        clickOnElementIfReady(elements.addImageButton);
        waitForJSToBeLoaded();

        //click on 'BROWSE FOR A FILE' button
        waitElementIsVisible(elements.browseForAFileButton);
        clickOnElementIfReady(elements.browseForAFileButton);
        waitForJSToBeLoaded();

        //upload an image
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.IMAGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on 'CHOOSE IMAGE' button
        waitElementIsVisible(elements.chooseImageButton);
        clickOnElementIfReady(elements.chooseImageButton);
        waitForJSToBeLoaded();

        //find 'CONTINUE' button
        waitElementIsVisible(elements.continueButton);
        clickOnElementIfReady(elements.continueButton);
    }

    public void addImageToProductNegative() {
        //click on 'ADD IMAGE' button
        waitElementIsVisible(elements.addImageButton);
        clickOnElementIfReady(elements.addImageButton);
        waitForJSToBeLoaded();

        //click on 'BROWSE FOR A FILE' button
        waitElementIsVisible(elements.browseForAFileButton);
        clickOnElementIfReady(elements.browseForAFileButton);
        waitForJSToBeLoaded();

        //upload an image
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.EXCEED_LIMIT_IAMGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //check file size exceed error label
        waitElementIsVisible(elements.fileSizeExceedErrorLabel);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //click on 'BROWSE FOR A FILE' button
        waitElementIsVisible(elements.browseForAFileButton);
        clickOnElementIfReady(elements.browseForAFileButton);
        waitForJSToBeLoaded();

        //upload an image
        uploadFileWithHelpOfSikuli(Constant.PathsForFilesOfProject.PROJECT_UPLOAD_TEST_PATH + Constant.WRONG_FORMAT_IMAGE_PATH);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //check file wrong format label appears
        waitElementIsVisible(elements.fileFormatErrorLabel);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void addClipartToProduct() {
        //click on 'ADD IMAGE' button
        waitElementIsVisible(elements.addImageButton);
        clickOnElementIfReady(elements.addImageButton);
        waitForJSToBeLoaded();

        //click on 'Clip Art' button
        waitElementIsVisible(elements.clipArtButton);
        clickOnElementIfReady(elements.clipArtButton);
        waitForJSToBeLoaded();

        //click on 'Animals' link
        waitElementIsVisible(elements.animalsLink);
        clickOnElementIfReady(elements.animalsLink);
        waitForJSToBeLoaded();

        //click on animals' logo which first in the row
        waitElementIsVisible(elements.animalLogo);
        clickOnElementIfReady(elements.animalLogo);
        waitForJSToBeLoaded();

        //click on 'CHOOSE IMAGE' button
        waitElementIsVisible(elements.chooseImageButton2);
        clickOnElementIfReady(elements.chooseImageButton2);
        waitForJSToBeLoaded();

        //find 'CONTINUE' button
        waitElementIsVisible(elements.continueButton);
        clickOnElementIfReady(elements.continueButton);
        waitForJSToBeLoaded();
    }

    public void addTextToProduct() {
        //click on 'ADD TEXT' button
        waitElementIsVisible(elements.addTextButton);
        clickOnElementIfReady(elements.addTextButton);
        waitForJSToBeLoaded();

        //click on middle button in 'Curve Text' section
        waitElementIsVisible(elements.curveTextSectionMiddleButton);
        clickOnElementIfReady(elements.curveTextSectionMiddleButton);
        waitForJSToBeLoaded();

        //find 'CONTINUE' button
        waitElementIsVisible(elements.continueButton2);
        clickOnElementIfReady(elements.continueButton2);
        waitForJSToBeLoaded();

        //click on 'NEXT: OPTIONS' button
        waitElementIsVisible(elements.nextOptionsButton);
        clickOnElementIfReady(elements.nextOptionsButton);
        waitForJSToBeLoaded();

        //click on the third radio button
        waitElementIsVisible(elements.thirdRadioButtonOptionsPage);
        clickOnElementIfReady(elements.thirdRadioButtonOptionsPage);
        waitForJSToBeLoaded();

        //click on 'NEXT:REVIEW' button
        waitElementIsVisible(elements.nextReviewButton);
        clickOnElementIfReady(elements.nextReviewButton);
        waitForJSToBeLoaded();

        //click on 'Quantity' drop down
        waitElementIsVisible(elements.quantityDropDownMenu);
        clickOnElementIfReady(elements.quantityDropDownMenu);
        waitForJSToBeLoaded();

        //click on the third value
        waitElementIsVisible(elements.thirdValueInDropDownQuantityMenu);
        clickOnElementIfReady(elements.thirdValueInDropDownQuantityMenu);
        waitForJSToBeLoaded();

        //click on '3 Day Rush' radio button
        waitElementIsVisible(elements.threeDayRushRadioButton);
        clickOnElementIfReady(elements.threeDayRushRadioButton);
        waitForJSToBeLoaded();

        //click on 'I have reviewed my design, and it is approved for print'
        waitElementIsVisible(elements.reviewMyDesignCheckBox);
        clickOnElementIfReady(elements.reviewMyDesignCheckBox);
        waitForJSToBeLoaded();
    }

    public void addTextForCustomCoasters() {
        //click on 'ADD TEXT' button
        waitElementIsVisible(elements.addTextButton);
        clickOnElementIfReady(elements.addTextButton);
        waitForJSToBeLoaded();

        //click on middle button in 'Curve Text' section
        waitElementIsVisible(elements.curveTextSectionMiddleButton);
        clickOnElementIfReady(elements.curveTextSectionMiddleButton);
        waitForJSToBeLoaded();

        //find 'CONTINUE' button
        waitElementIsVisible(elements.continueButton2);
        clickOnElementIfReady(elements.continueButton2);
        waitForJSToBeLoaded();

        //click on 'NEXT: OPTIONS' button
        waitElementIsVisible(elements.nextOptionsButton);
        clickOnElementIfReady(elements.nextOptionsButton);
        waitForJSToBeLoaded();

        //choose 'Inside Core Color'
        waitElementIsVisible(elements.insideCoreColorButton);
        clickOnElementIfReady(elements.insideCoreColorButton);
        waitForJSToBeLoaded();

        //choose black color
        waitElementIsVisible(elements.chooseInsideCoreColorDropDownMenu);
        clickOnElementIfReady(elements.chooseInsideCoreColorDropDownMenu);
        waitForJSToBeLoaded();

        //click on the second radio button
        waitElementIsVisible(elements.secondRadioButtonOptionPage);
        clickOnElementIfReady(elements.secondRadioButtonOptionPage);
        waitForJSToBeLoaded();

        //click on 'NEXT:REVIEW' button
        waitElementIsVisible(elements.nextReviewButton);
        clickOnElementIfReady(elements.nextReviewButton);
        waitForJSToBeLoaded();

        //click on 'Quantity' drop down
        waitElementIsVisible(elements.quantityDropDownMenu);
        clickOnElementIfReady(elements.quantityDropDownMenu);
        waitForJSToBeLoaded();

        //click on the third value
        waitElementIsVisible(elements.chooseThirdValueQuantityDropDownCustomCoasters);
        clickOnElementIfReady(elements.chooseThirdValueQuantityDropDownCustomCoasters);
        waitForJSToBeLoaded();

        //click on 'I have reviewed my design, and it is approved for print'
        waitElementIsVisible(elements.reviewMyDesignCheckBox);
        clickOnElementIfReady(elements.reviewMyDesignCheckBox);
        waitForJSToBeLoaded();
    }

    public void clickOnAddToCartButton() {
        //click on 'ADD TO CART' button
        waitElementIsVisible(elements.addToCartButton);
        clickOnElementIfReady(elements.addToCartButton);
        waitForJSToBeLoaded();
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }

    public void checkNavigation() {
        //find and click on 'Back to Shopping' link
        waitElementIsVisible(elements.backToShoppingLink);
        clickOnElementIfReady(elements.backToShoppingLink);
        waitForJSToBeLoaded();

        //click on cross button
        waitElementIsVisible(elements.backToShoppingModalWindowContent);
        clickOnElementIfReady(elements.backToShoppingModalWindowCrossButton);
        waitForJSToBeLoaded();

        //find and click on 'Back to Shopping' link
        waitElementIsVisible(elements.backToShoppingLink);
        clickOnElementIfReady(elements.backToShoppingLink);
        waitForJSToBeLoaded();

        //click on 'STAY AND CONTINUE WORKING' button
        waitElementIsVisible(elements.backToShoppingModalWindowContent);
        clickOnElementIfReady(elements.backToShoppingModalWindowStayAndContinueWorkingButton);
        waitForJSToBeLoaded();

        //find and click on 'Back to Shopping' link
        waitElementIsVisible(elements.backToShoppingLink);
        clickOnElementIfReady(elements.backToShoppingLink);
        waitForJSToBeLoaded();

        //click on 'EXIT AND SCRATCH MY DESIGN' button
        waitElementIsVisible(elements.backToShoppingModalWindowContent);
        clickOnElementIfReady(elements.backToShoppingModalWindowExitAndScratchMyDesignButton);
        waitForJSToBeLoaded();

        //make sure home page is loaded without issues
        waitElementIsVisible(elements.accountIcon);
        hoverOverElement(elements.accountIcon);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


}
