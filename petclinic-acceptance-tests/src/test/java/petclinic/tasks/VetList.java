package petclinic.tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VetList {
    public static final Target NAMES = Target.the("Names")
            .located(By.xpath("//tbody/tr/td[1]"));
    public static final Target SPECIALITIES_FOR_VETS = Target.the("specialities")
            .locatedBy("//tr/td[contains(.,'{0}')]/../td[2]/div");
}
