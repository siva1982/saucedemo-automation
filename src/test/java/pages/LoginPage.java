package pages;
import org.openqa.selenium.*;
/**
 * @author Siva Challa
 */

/**
 * Page Object representing the Login Page.
 */
public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){ this.driver = driver; }
    public void open(){ driver.get("https://www.saucedemo.com/"); }
    public void login(String user, String pwd){
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login-button")).click();
    }
}