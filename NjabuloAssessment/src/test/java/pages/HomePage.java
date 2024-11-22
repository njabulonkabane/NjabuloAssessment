package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.browserDriver;

import java.util.List;

public class HomePage extends browserDriver {

    static String registerLink = "ico-register";
    static String loginLink = "ico-login";
    static String customerInfo = "account";
    static String computers="computers";
    static String desktops="desktops";
    static String cartTotal="order-total";
    static String shoppingCart="cart";

    public static void navigateToRegister() throws InterruptedException{
        driver.findElement(By.id(registerLink)).click();
    }

    public static void navigateToLogin() throws InterruptedException {
        driver.findElement(By.id(loginLink)).click();
    }

    public static void navigateToCustomerInfo() throws InterruptedException{
        driver.findElement(By.id(customerInfo)).click();
    }

    public static void navigateToComputers() throws InterruptedException{
        driver.findElement(By.linkText(computers)).click();
        driver.findElement(By.linkText(desktops)).click();
    }

    public static void addAllToCart() throws InterruptedException{
        List<WebElement> addToCart = driver.findElements(By.cssSelector(".product-box-add-to-cart-button"));
        for(WebElement button : addToCart){
            button.click();
        }
    }
    public static void  ValidateCartTotal() throws InterruptedException{
        WebElement orderTotal=driver.findElement(By.className("product-subtotal"));
        double total=Double.parseDouble(orderTotal.getText());
        Assert.assertEquals(CalculateTotal(), total);
    }
    public static double CalculateTotal() throws InterruptedException{

        List<WebElement> prices = driver.findElements(By.className("product-subtotal"));
        return prices.stream().mapToDouble(price->Double.parseDouble((price.getText()))).sum();

    }
    public static void goToCart() throws InterruptedException{
        driver.findElement(By.id(cartTotal)).click();
    }

}