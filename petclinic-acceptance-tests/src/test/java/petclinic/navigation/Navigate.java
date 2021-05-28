package petclinic.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toTheApplicationHomePage() {
        return Task.where("{0} navigates to the home page",
                Open.browserOn().the(PetClinicHomePage.class));
    }

    public static Performable toTheVeternarians() {
        return Task.where("{0} actor navigates to veterinarians and clicks on all vets",
                Click.on(MenuBar.VETERINARIANS),Click.on(MenuBar.ALL_VETS));
    }
}
