package pages;
import java.util.Random;
import org.openqa.selenium.By;
import utility.browserDriver;

import static Helpers.randomGenerator.generateRandomString;

public class RegistrationPage extends browserDriver {

    static String genderMale = "gender-male";
    static String genderFemale = "gender-female";
    static String firstName = "FirstName";
    static String lastName = "LastName";
    static String email = "Email";
    static String password = "Password";
    static String confirmPassword = "ConfirmPassword";
    static String RegisterButton = "register-button";
    static String continueButton = "register-continue-button";


    public static void chooseGender() {
        Random rand = new Random();
        int randomChoice = rand.nextInt(2);

        if (randomChoice == 0) {
            driver.findElement(By.id(genderMale)).click();
        } else {
            driver.findElement(By.id(genderFemale)).click();
        }
    }

    public static void userRegistration() throws InterruptedException {
        String tempPassword = "password#01";
        chooseGender();
        driver.findElement(By.id(firstName)).sendKeys(generateRandomString("FName"));
        driver.findElement(By.id(lastName)).sendKeys(generateRandomString("LName"));
        driver.findElement(By.id(email)).sendKeys(generateRandomString("@njabulo.com"));
        driver.findElement(By.id(password)).sendKeys(tempPassword);
        driver.findElement(By.id(confirmPassword)).sendKeys(tempPassword);

        driver.findElement(By.className(RegisterButton)).click();
        driver.findElement(By.className(continueButton)).click();
    }

    public static void verifyRegistration() throws InterruptedException {
        driver.findElement(By.className(continueButton)).click();
    }


}
