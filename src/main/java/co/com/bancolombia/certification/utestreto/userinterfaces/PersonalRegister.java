package co.com.bancolombia.certification.utestreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalRegister {
    public static final Target FIRSTNAME = Target.the("first-name").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("last-name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("e-mail").located(By.id("email"));
    public static final Target BIRTHMONTH = Target.the("birthmonth").located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target.the("birthDay").located(By.id("birthDay"));
    public static final Target BIRTHYEAR = Target.the("birthYear").located(By.id("birthYear"));
}
