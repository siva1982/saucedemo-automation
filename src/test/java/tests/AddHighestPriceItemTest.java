package tests;
import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.*;
/**
 * @author Siva Challa
 */

/**
 * Test class to add the highest priced item to the cart.
 */

public class AddHighestPriceItemTest extends BaseTest {

    @Test(description = "Add highest priced item to cart without using sort")
    @Story("Select highest price item")
    @Severity(SeverityLevel.CRITICAL)
    public void addHighestPriceItem(){

        LoginPage login = new LoginPage(driver);

        Allure.step("Open SauceDemo application");
        login.open();

        Allure.step("Login with valid credentials");
        login.login("standard_user","secret_sauce");

        Allure.step("Identify and add highest priced item to cart");
        new InventoryPage(driver).addHighestPricedItem();
    }
}