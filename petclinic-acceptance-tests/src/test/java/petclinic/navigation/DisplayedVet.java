package petclinic.navigation;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import petclinic.tasks.VetList;

import java.util.List;

public class DisplayedVet {
    public static Question<List<String>> names() {
        return Text.of(VetList.NAMES).asAList();
    }

    public static Question<List<String>> specialitiesFor(String name) {
        return Text.of(VetList.SPECIALITIES_FOR_VETS.of(name)).asAList();
    }
}
