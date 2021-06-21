package petclinic.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheApplicationHomePage() {
        return Task.where("{0) opens the application home page}",
                Open.browserOn().the(PetClinicHomePage.class));

    }
}
