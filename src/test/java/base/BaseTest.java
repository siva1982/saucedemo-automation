package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverFactory;

/**
 * @author Siva Challa
 */

/**
 * Base test class to manage WebDriver setup and teardown.
 */

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createDriver();
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}