package pages;
import org.openqa.selenium.*;
import java.util.*;
/**
 * @author Siva Challa
 */

/**
 * Page Object representing the Inventory Page.
 */

public class InventoryPage {
    WebDriver driver;
    public InventoryPage(WebDriver driver){ this.driver = driver; }
    public void addHighestPricedItem(){
        List<WebElement> items = driver.findElements(By.className("inventory_item"));
        double max = 0; WebElement selected = null;
        for(WebElement i : items){
            double price = Double.parseDouble(
                i.findElement(By.className("inventory_item_price")).getText().replace("$","")
            );
            if(price > max){ max = price; selected = i; }
        }
        if(selected != null) selected.findElement(By.tagName("button")).click();
    }
}