package pages.yourImages;

import elements.yourImages.YourImagesPageElements;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utility.Constant;

public class YourImagesPage extends BasePage {

    YourImagesPageElements elements;
    public YourImagesPage(WebDriver driver, WebDriverWait wait, YourImagesPageElements elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }


    /*****************************MAIN METHODS*****************************/

    public void verifyYourImagesPageIsLoaded() {
        //click on 'My Account' link
        hoverOverElement(elements.accountIcon);
        waitElementIsVisible(elements.myAccountLink);
        clickOnElementIfReady(elements.myAccountLink);
        waitForJSToBeLoaded();

        //click on 'Your Images' link
        waitElementIsVisible(elements.yourImagesLink);
        clickOnElementIfReady(elements.yourImagesLink);
        waitForJSToBeLoaded();

        //check 'Your Images' page is loaded
        waitElementIsVisible(elements.yourImagesPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkPaginationFunctionality() {
        //choose 50 lines per page option
        waitElementIsVisible(elements.paginationDropDown);
        clickOnElementIfReady(elements.paginationDropDown);
        clickOnElementIfReady(elements.option50PaginationDropDown);
        waitForJSToBeLoaded();

        //check pagination works properly
        jsScrollDown();
        String text = waitElementIsVisible(elements.customerImagesInformation).getText();
        Assert.assertEquals(text, "Showing 1 to 50 of 177 entries");

        //check page's links work properly
        jsScrollDown();
        clickOnElementIfReady(elements.chooseSecondPageLink);
        String text1 = waitElementIsVisible(elements.customerImagesInformation).getText();
        Assert.assertEquals(text1, "Showing 51 to 100 of 177 entries");


        clickOnElementIfReady(elements.chooseThirdPageLink);
        jsScrollDown();
        String text2 = waitElementIsVisible(elements.customerImagesInformation).getText();
        Assert.assertEquals(text2, "Showing 101 to 150 of 177 entries");

        clickOnElementIfReady(elements.previousLink);
        jsScrollDown();
        String text3 = waitElementIsVisible(elements.customerImagesInformation).getText();
        Assert.assertEquals(text3, "Showing 51 to 100 of 177 entries");

        clickOnElementIfReady(elements.nextLink);
        jsScrollDown();
        String text4 = waitElementIsVisible(elements.customerImagesInformation).getText();
        Assert.assertEquals(text4, "Showing 101 to 150 of 177 entries");

    }

    public void checkSearch() {
        //choose 50 lines per page option
        waitElementIsVisible(elements.paginationDropDown);
        clickOnElementIfReady(elements.paginationDropDown);
        clickOnElementIfReady(elements.option50PaginationDropDown);
        waitForJSToBeLoaded();

        //fill in search field with 'Designer' sign and check all the results fit the search
        waitElementIsVisible(elements.searchField).clear();
        clickOnElementIfReady(elements.searchField).sendKeys("Designer");
        waitForJSToBeLoaded();

        for (int i = 0; i < elements.imageNamesInTable.size(); i++) {
            String text = waitElementIsVisible(elements.imageNamesInTable.get(i)).getText();
            Assert.assertEquals(text, "Designer");
            System.out.println("Search works properly" + " " + i);
        }
    }

    public void checkImageInformation() {
        //check image displaying
        clickOnElementIfReady(elements.imageThumbnailInTable);
        switchToNewWindow();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        driver.close();
        switchToDefaultWindow();

        //click on edit icon in table
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //wait for modal window to open and click on cross button
        waitElementIsVisible(elements.editImageModalWindowTitle);
        clickOnElementIfReady(elements.editImageModalWindowCrossButton);

        //click on edit icon in table
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //wait for modal window to open and click on 'Close' button
        waitElementIsVisible(elements.editImageModalWindowTitle);
        clickOnElementIfReady(elements.editImageModalWindowCloseButton);

        //edit image's information
        //click on edit icon in table
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //edit information
        waitElementIsVisible(elements.editImageModalWindowTitleField).clear();
        clickOnElementIfReady(elements.editImageModalWindowTitleField).sendKeys("GFL logo");

        waitElementIsVisible(elements.editImageModalWindowDescriptionField).clear();
        clickOnElementIfReady(elements.editImageModalWindowDescriptionField).sendKeys("Geeks For Less");

        //click on 'SAVE CHANGES' button
        waitElementIsVisible(elements.editImageModalWindowSaveChangesButton);
        clickOnElementIfReady(elements.editImageModalWindowSaveChangesButton);
        waitForJSToBeLoaded();

        //'Your Images' page is loaded
        waitElementIsVisible(elements.yourImagesPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);

        //delete modified image
        waitElementIsVisible(elements.deleteButtonInTable);
        clickOnElementIfReady(elements.deleteButtonInTable);
        waitForJSToBeLoaded();

        //wait for modal window to appear and click on cross button
        waitElementIsVisible(elements.deleteImageModalWindowTitle);
        clickOnElementIfReady(elements.deleteImageModalWindowCrossButton);

        //delete modified image
        waitElementIsVisible(elements.deleteButtonInTable);
        clickOnElementIfReady(elements.deleteButtonInTable);
        waitForJSToBeLoaded();

        //wait for modal window and click on 'Cancel' button
        waitElementIsVisible(elements.deleteImageModalWindowTitle);
        clickOnElementIfReady(elements.deleteImageModalWindowCancelButton);
        waitForJSToBeLoaded();

        //delete modified image
        waitElementIsVisible(elements.deleteButtonInTable);
        clickOnElementIfReady(elements.deleteButtonInTable);
        waitForJSToBeLoaded();

        //wait for modal window and click on 'Ok' button
        waitElementIsVisible(elements.deleteImageModalWindowTitle);
        clickOnElementIfReady(elements.deleteImageModalWindowOkButton);
        waitForJSToBeLoaded();

        //'Your Images' page is loaded
        waitElementIsVisible(elements.imageDeletedInformationMessage);
        waitElementIsVisible(elements.yourImagesPageTitle);
        makePause(Constant.TimeoutVariable.SHORT_SLEEP);
    }


    public void checkYourProofsTabFunctionality() {
        //choose 'Your Proofs' tab
        waitElementIsVisible(elements.yourProofsTab);
        clickOnElementIfReady(elements.yourProofsTab);
        waitForJSToBeLoaded();

        //click on image's thumbnail
        clickOnElementIfReady(elements.imageThumbnailProofsTab);
        switchToNewWindow();
        makePause(Constant.TimeoutVariable.NORMAL_SLEEP);
        driver.close();
        switchToDefaultWindow();

        //Order Details page
        //click on order number link
        clickOnElementIfReady(elements.orderNumberProofsTab);
        waitForJSToBeLoaded();

        //check proper respond when fields are not filled
        //click on 'Email' button
        clickOnElementIfReady(elements.orderDetailsEmailButton);
        waitForJSToBeLoaded();

        //wait for the modal window to appear and click on 'SEND 'EMAIL' button
        waitElementIsVisible(elements.emailModalWindowTitle);

        waitElementIsVisible(elements.emailModalWindowFriendsEmailField).clear();
        waitElementIsVisible(elements.emailModalWindowYourEmailField).clear();

        clickOnElementIfReady(elements.emailModalWindowSendEmailButton);

        waitElementIsVisible(elements.emailModalWindowToEmailAddressRequired);
        waitElementIsVisible(elements.emailModalWindowFromEmailAddressRequired);

        String cssValue = waitElementIsVisible(elements.emailModalWindowFriendsEmailField).getCssValue("background-color");
        String cssValue1 = waitElementIsVisible(elements.emailModalWindowYourEmailField).getCssValue("background-color");

        Assert.assertEquals(cssValue, "rgba(255, 183, 183, 1)");
        Assert.assertEquals(cssValue1, "rgba(255, 183, 183, 1)");

        //fill in all necessary fields
        waitElementIsVisible(elements.emailModalWindowFriendsEmailField).clear();
        clickOnElementIfReady(elements.emailModalWindowFriendsEmailField).sendKeys("test@test.com");
        waitElementIsVisible(elements.emailModalWindowYourEmailField).clear();
        clickOnElementIfReady(elements.emailModalWindowYourEmailField).sendKeys(Constant.Credentials.LOGIN_US_PREPROD);
        clickOnElementIfReady(elements.emailModalWindowTextArea).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SEND 'EMAIL' button
        waitElementIsVisible(elements.emailModalWindowTitle);
        clickOnElementIfReady(elements.emailModalWindowSendEmailButton);
        waitForJSToBeLoaded();

        //wait for CAPTCHA message to appear
        waitElementIsVisible(elements.reCAPTCHATitle);
        clickOnElementIfReady(elements.reCAPTCHAOkButton);

        //close modal window
        waitElementIsVisible(elements.emailModalWindowCrossButton);
        clickOnElementIfReady(elements.emailModalWindowCrossButton);

        //check 'Print' button
        clickOnElementIfReady(elements.orderDetailsPrintButton);
        waitForJSToBeLoaded();
        switchToNewWindow();
        waitElementIsVisible(elements.orderConfirmationTitle);
        driver.close();
        switchToDefaultWindow();

        //get back to 'Your Proofs' tab
        driver.navigate().back();

        //choose 'Your Proofs' tab
        waitElementIsVisible(elements.yourProofsTab);
        clickOnElementIfReady(elements.yourProofsTab);
        waitForJSToBeLoaded();

        //click on product's name                                               //TODO: add validation of product's name
        clickOnElementIfReady(elements.productNameProofsTab);
        waitForJSToBeLoaded();

        driver.navigate().back();

        //choose 'Your Proofs' tab
        waitElementIsVisible(elements.yourProofsTab);
        clickOnElementIfReady(elements.yourProofsTab);
        waitForJSToBeLoaded();

        //check download page is opened
        clickOnElementIfReady(elements.downloadIconProofsTab);
        waitForJSToBeLoaded();

        driver.navigate().back();
    }


    public void checkEditImageInformation() {
        //click on edit icon
        waitElementIsVisible(elements.editButtonInTable);
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //click on cross button of modal window
        waitElementIsVisible(elements.editImageNameModalWindowTitle);
        clickOnElementIfReady(elements.editImageNameModalWindowCrossButton);

        //click on edit icon
        waitElementIsVisible(elements.editButtonInTable);
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //click on 'Close' button
        clickOnElementIfReady(elements.editImageNameModalWindowCloseButton);
        waitForJSToBeLoaded();

        //click on edit icon
        waitElementIsVisible(elements.editButtonInTable);
        clickOnElementIfReady(elements.editButtonInTable);
        waitForJSToBeLoaded();

        //fill all fields
        waitElementIsVisible(elements.editImageNameModalWindowTitleField).clear();
        clickOnElementIfReady(elements.editImageNameModalWindowTitleField).sendKeys("GFL");
        waitElementIsVisible(elements.editImageNameModalWindowDescriptionField).clear();
        clickOnElementIfReady(elements.editImageNameModalWindowDescriptionField).sendKeys(Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

        //click on 'SAVE CHANGES' button
        clickOnElementIfReady(elements.editImageNameModalWindowSaveChangesButton);
        waitForJSToBeLoaded();

        //check information
        String text = waitElementIsVisible(elements.imageTitle).getText();
        String text1 = waitElementIsVisible(elements.imageDescription).getText();

        Assert.assertEquals(text, "GFL");
        Assert.assertEquals(text1, Constant.NeedMoreData.LARGE_QUANTITY_COMMENTS);

    }

    public void checkNavigation() {
        //click on 'Your Account
        waitElementIsVisible(elements.yourAccountLinkBreadcrumb);
        clickOnElementIfReady(elements.yourAccountLinkBreadcrumb);
        waitForJSToBeLoaded();

        //click on 'Your Images' link
        waitElementIsVisible(elements.yourImagesLink);
        clickOnElementIfReady(elements.yourImagesLink);
        waitForJSToBeLoaded();

        //click on 'Home' link
        waitElementIsVisible(elements.homeLinkBreadcrumb);
        clickOnElementIfReady(elements.homeLinkBreadcrumb);

        //wait for the home page to load
        waitElementIsVisible(elements.homePageMainTitle);

    }
}
