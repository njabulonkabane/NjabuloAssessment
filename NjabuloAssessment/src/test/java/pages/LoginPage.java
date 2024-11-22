package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class LoginPage extends browserDriver {

    static String email = "Email";
    static String password = "Password";
    static String loginButton = "login-button";

    public static void userLogin(String userEmail, String userPassword) throws InterruptedException {
        driver.findElement(By.id(email)).sendKeys(userEmail);
        driver.findElement(By.id(password)).sendKeys(userPassword);
        driver.findElement(By.id(loginButton)).click();
    }
}