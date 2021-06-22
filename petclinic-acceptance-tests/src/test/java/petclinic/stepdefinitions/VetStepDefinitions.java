package petclinic.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import petclinic.navigation.Navigate;

public class VetStepDefinitions {

    @Given("{actor} is a pet clinic owner")
    public void peterIsAPetClinicOwner(Actor actor) {
        actor.attemptsTo(Navigate.toTheApplicationHomePage());
    }

    @When("{actor} views the vets in his clinic")
    public void heViewsTheVetsInHisClinic(Actor actor) {
    }

    @Then("{actor} should see the name of each vet in the clinic")
    public void heShouldSeeTheNameOfEachVetInTheClinic(Actor actor) {
    }
}
