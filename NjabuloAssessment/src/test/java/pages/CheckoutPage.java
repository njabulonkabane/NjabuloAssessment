package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.browserDriver;

import java.util.List;

import static Helpers.randomGenerator.generateRandomNumber;
import static Helpers.randomGenerator.generateRandomString;

public class CheckoutPage extends browserDriver {

    static String cartTotal = "order-total";
    static String checkOutButton = "checkout";
    static String acceptTS = "termsofservice";
    static String countrySelector = "BillingNewAddress_CountryId";
    static String citySelector = "BillingNewAddress_City";
    static String address1 = "BillingNewAddress.Address1";
    static String zipCode = "BillingNewAddress_ZipPostalCode";
    static String phoneNumber = "BillingNewAddress_PhoneNumber";
    static String continueButton = "button-1 new-address-next-step-button";
    static String confirmOrder = "button-1 confirm-order-next-step-button";
    static String viewOrderDetails = "orderdetails";




    public static void ChooseCountry(String countryCode) {
        WebElement dropdown = driver.findElement(By.id(countrySelector));
        Select select = new Select(dropdown);

        select.selectByValue(countryCode);
    }

    public static void FillBillingInformation(String countryCode) throws InterruptedException {
        ChooseCountry(countryCode);
        driver.findElement(By.id(citySelector)).sendKeys(generateRandomString("city"));
        driver.findElement(By.name(address1)).sendKeys(generateRandomString("address1"));
        driver.findElement(By.id(zipCode)).sendKeys(generateRandomString("ZipCode"));
        driver.findElement(By.id(phoneNumber)).sendKeys(generateRandomNumber(8));

        driver.findElement(By.className(continueButton)).click();
        Thread.sleep(500);
        driver.findElement(By.className(continueButton)).click();
        Thread.sleep(500);
        driver.findElement(By.className(continueButton)).click();
        Thread.sleep(500);
        driver.findElement(By.className(continueButton)).click();
        Thread.sleep(500);

        driver.findElement(By.className(confirmOrder)).click();
    }

    public static void OpenOrderDetails() throws InterruptedException {

        driver.findElement(By.partialLinkText(viewOrderDetails)).click();
    }
}
