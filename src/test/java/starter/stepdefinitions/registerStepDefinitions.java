package starter.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.register.DoRegister;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class registerStepDefinitions {

    String actor;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Register user (.*)")
    public void register_user(String actor) {
        this.actor = actor;
    }

    @When("Enter valid data")
    public void enter_valid_data() {
        theActorCalled(actor).attemptsTo(
                NavigateTo.utestHomePage(),
                DoRegister.withCredentials("Juan","Perez","user@mail.com","Spanish",
                        "Duitama, Boyaca Colombia","150462","Colombia",
                        "Xiaomi","Pocophone F1", "Android 10",
                        "D2@XlPJmIDFl"));
    }

    @Then("Browse the platform")
    public void browse_the_platform() {
    }

}
