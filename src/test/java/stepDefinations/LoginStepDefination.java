package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginStepDefination {
	
	@Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("User is on netbanking landing page");
    }

    @When("^User login in to application with \"([^\"]*)\" username and password \"([^\"]*)\"$")
    public void user_login_in_to_application_with_something_username_and_password_something(String userName, String password) throws Throwable {
        System.out.println("User login in to application with "+userName+" and password " +password);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
        System.out.println("Home page is displayed");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println("Cards are displayed "+strArg1);
    }
	

}
