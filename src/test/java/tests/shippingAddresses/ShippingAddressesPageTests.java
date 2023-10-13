package tests.shippingAddresses;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import utility.Retry;

public class ShippingAddressesPageTests extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void test_01_getToShippingAddressesPage() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_02_editAddress() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.editAddress();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_03_checkEditShippingAddressesNavigation() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.checkEditShippingAddressesNavigation();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_04_checkAddNewAddressProcedure() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.checkAddNewAddressProcedure();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_05_deleteNewAddress() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.deleteNewAddress();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_06_checkNewAddressProcedureNegative() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.checkAddNewAddressProcedureNegative();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test_07_checkManageShippingAddressesNavigation() {
        loginPage.loginToSite();
        shippingAddressesPage.verifyShippingAddressesPageIsLoaded();
        shippingAddressesPage.manageShippingAddressNavigation();
    }

}
