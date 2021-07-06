package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class HomePageStepDefination {

    @Given("^User is on Home page$")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("User is on Home page");
    }

    @When("^Verify All Links$")
    public void verify_all_links() throws Throwable {
        System.out.println("Verify All Links");
    }

    @Then("^All Links Working$")
    public void all_links_woring() throws Throwable {
        System.out.println("All Links Working");
    }
}