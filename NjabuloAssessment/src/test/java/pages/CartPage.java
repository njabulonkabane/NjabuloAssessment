
package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.browserDriver;

import java.util.List;

public class CartPage extends browserDriver {

    static String checkOutButton="checkout";
    static String acceptTS="termsofservice";


    public static double CalculateTotal() throws InterruptedException{

        List<WebElement> prices = driver.findElements(By.className("product-subtotal"));
        return prices.stream().mapToDouble(price->Double.parseDouble((price.getText()))).sum();

    }
    public static void  ValidateCartTotal() throws InterruptedException{
        WebElement orderTotal=driver.findElement(By.className("product-subtotal"));
        double total=Double.parseDouble(orderTotal.getText());
        Assert.assertEquals(CalculateTotal(), total);
    }

    public static  void CheckOutCart() throws InterruptedException{
        driver.findElement(By.id(acceptTS)).click();
        driver.findElement(By.id(checkOutButton)).click();
    }
}