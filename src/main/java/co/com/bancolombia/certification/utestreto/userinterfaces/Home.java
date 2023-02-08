package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target REGISTER = Target.the("register").locatedBy("(//a[contains(@class,'sign-up')])[1]");
}
