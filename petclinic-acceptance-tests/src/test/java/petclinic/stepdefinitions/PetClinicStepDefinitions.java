package petclinic.stepdefinitions;

import com.google.common.base.Splitter;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.yecht.Data;
import petclinic.Vet;
import petclinic.navigation.DisplayedVet;
import petclinic.navigation.Navigate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PetClinicStepDefinitions {

    @Given("{actor} is a Pet Clinic owner")
    public void IsAPetClinicOwner(Actor actor) {
        actor.attemptsTo(Navigate.toTheApplicationHomePage());
    }

    @When("{actor} views the vets in his clinic")
    public void heViewsTheVetsInHisClinic(Actor actor) {
       actor.attemptsTo(Navigate.toTheVeternarians());
    }

    @Then("{actor} should see the name of each vet in the clinic")
    public void heShouldSeeTheNameOfEachVetInTheClinic(Actor actor) {
        List<String> DisplayedListOfVets = actor.asksFor(DisplayedVet.names());
        System.out.println(DisplayedListOfVets);
        assertThat(DisplayedListOfVets).isNotEmpty();
    }

    @DataTableType
    public Vet vetEntry(Map<String,String> entry){
        return new Vet(
                entry.get("Name"),specialitiesIn(entry.get("Specialities"))
        );
    }

    private List<String> specialitiesIn(String specialitiesList) {
        if (specialitiesList == null){
            return new ArrayList<>();
        }
        return Splitter.on(",").trimResults().splitToList(specialitiesList);
    }

    @Then("{actor} should see each of the following vet speciality")
    public void heShouldSeeEachOfTheFollowingVetSpeciality( Actor actor,List<Vet> vetSpecialities) {

        SoftAssertions softly = new SoftAssertions();
        vetSpecialities.forEach(
                vet -> {
                 List<String> displayedSpecialities = DisplayedVet.specialitiesFor(vet.getName())
                         .answeredBy(actor);
                 assertThat(displayedSpecialities).containsExactlyElementsOf(vet.getSpecialities());
                }

        );
        softly.assertAll();

    }
}
