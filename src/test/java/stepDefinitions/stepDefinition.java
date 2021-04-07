package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Navigated to login url");
    }

    /*@When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("Logged in successfully");
    }*/

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Logged in successfully");
        System.out.println("userName is: "+strArg1);
        System.out.println("password is: "+strArg2);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        System.out.println("Validated homepage");
    }

    /*@And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("Validated cards");
    }*/

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println("Cards displayed: "+strArg1);
    }

}
