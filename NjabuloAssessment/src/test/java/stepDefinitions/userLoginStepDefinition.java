package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Helpers.Navigation.NavigateTo;
import static pages.HomePage.*;
import static pages.LoginPage.userLogin;

public class userLoginStepDefinition {

    @Given("user navigates to {}")
    public static void GivenUserNavigatesTo(String url) {
        NavigateTo(url);
    }
    @When("I go to the login page")
    public static void IGoToTheLoginPage() throws InterruptedException {
        navigateToLogin();
    }

    @And("login with valid {} {}")
    public static void LoginWithValidEmailPassword(String email,String password) throws InterruptedException {
        userLogin(email,password);
    }

    @Then("the user should be able logged in")
    public static void TheUserShouldBeAbleLoggedIn() throws InterruptedException {
        navigateToCustomerInfo();
    }
}
