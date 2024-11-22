package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Helpers.Navigation.*;
import static pages.CartPage.*;
import static pages.CheckoutPage.*;
import static pages.HomePage.*;
import static pages.LoginPage.*;

public class shopDesktopsStepDefinition {

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

    @Then("I click on computer tab and go to desktops option")
    public void iClickOnComputerTabAndGoToDesktopsOption() throws InterruptedException {
        navigateToComputers();
    }

    @Then("I remove one item and valid the price")
    public void iRemoveOneItemAndValidThePrice() {

    }

    @When("I add all the desktops and validate the price")
    public void iAddAllTheDesktopsAndValidateThePrice() throws InterruptedException {
        addAllToCart();
        goToCart();
    }

    @And("I checkout and valid checkout")
    public void iCheckoutAndValidCheckout() throws InterruptedException {
        CheckOutCart();
    }

    @Then("fill all the information for checkout {}")
    public void fillAllTheInformationForCheckout(String countyCode)throws InterruptedException  {
        FillBillingInformation(countyCode);
    }

    @And("I navigate to my account")
    public void iNavigateToMyAccount() throws InterruptedException {
        OpenOrderDetails();
    }

    @Then("Verify that the order is created successful")
    public void verifyThatTheOrderIsCreatedSuccessful() {
    }
}
