package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Location {
    public static final Target NEXTLOCATION = Target.the("Buton next LOCATION").locatedBy("(//a[@aria-label=\"Next step - define your location\"])");
    public static final Target CHOOSECITY = Target.the("Input choose city").located(By.id("city"));
    public static final Target CHOOSEPOSTAL = Target.the("Input choose code postal").located(By.id("zip"));

    public static final Target NEXXTDEVICES = Target.the("Buton next devices").locatedBy("(//a[@aria-label=\"Next step - select your devices\"])");
}
