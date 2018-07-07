package skeleton.defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import skeleton.models.Belly;

public class BellyStepDefs {
    Belly belly = new Belly();

    @Given("^I have (\\d+) cukes in my '(.*?)' belly$")
//    @Given("I have {int} cukes in my {string} belly")
    public void I_have_cukes_in_my_belly(int cukes, String size) throws Throwable {
        belly.eat(cukes, size);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int hour) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        belly.digest(hour);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        belly.growl();
    }
}
