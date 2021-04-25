package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSteps {
    @Given("^Nijat goes to the terminal$")
    public void nijat_goes_to_the_terminal () {
        System.out.println("Nijat opened up terminal window...");
    }
    @When("^Nijat says HELLO MY STUDENTS$")
    public void Nijat_says_HELLO_MY_STUDENTS(){
        System.out.println("nijat is trying to say hello my students ");

    }
    @Then("we should see that in terminal few times")
    public void we_should_see_that_in_terminal_few_times(){
        System.out.println("hello! students");
    }

}
