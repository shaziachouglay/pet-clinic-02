package petclinic.navigation;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuBar {
    public static final Target VETERINARIANS = Target.the("Veterinarians")
            .located(By.xpath("//li/a[contains(.,'Veterinarians')]"));
    public static final Target ALL_VETS = Target.the("All")
            .located(By.cssSelector("body > app-root > div.container-fluid > nav > div > ul > li.dropdown.open > ul > li:nth-child(1) > a"));
}
