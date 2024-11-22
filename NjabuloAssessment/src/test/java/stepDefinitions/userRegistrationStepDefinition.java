package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Helpers.Navigation.*;
import static pages.HomePage.*;
import static pages.RegistrationPage.*;

public class userRegistrationStepDefinition {

    @Given("user navigates to {}")
    public static void GivenUserNavigatesTo(String url) {
        NavigateTo(url);
    }
    @And("I go to the registration page")
    public static void IGoToTheRegistrationPage() throws InterruptedException {
        navigateToRegister();
    }
    @When("enter registration information and submit")
    public static void EnterRegistrationInformationAndSubmit(String url) throws InterruptedException{
        userRegistration();
    }
    @Then("I should be redirected to the dashboard page")
    public static void IShouldBeRedirectedTo(String url) throws InterruptedException {
        verifyRegistration();
        navigateToCustomerInfo();
    }
}