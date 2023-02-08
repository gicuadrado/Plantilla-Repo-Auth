package co.com.bancolombia.certification.utestreto.task;


import co.com.bancolombia.certification.utestreto.userinterfaces.Home;
import co.com.bancolombia.certification.utestreto.userinterfaces.Location;
import co.com.bancolombia.certification.utestreto.userinterfaces.PersonalRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

// indicamos que implemente tareas
// creamos el metodo dando clic en la clase
public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(Home.REGISTER),
               SendKeys.of("gilber").into(PersonalRegister.FIRSTNAME),
               SendKeys.of("cuadrado").into(PersonalRegister.LASTNAME),
               SendKeys.of("cuadradogilber@gmail.com").into(PersonalRegister.EMAIL),
               SendKeys.of("January").into(PersonalRegister.BIRTHMONTH),
               SendKeys.of("2005").into(PersonalRegister.BIRTHYEAR),
               SendKeys.of("6").into(PersonalRegister.BIRTHDAY),

               // Agregamos la etiqueta para el boton Siguiente

               Click.on(Location.NEXTLOCATION),
               SendKeys.of("Neiva").into(Location.CHOOSECITY),
               SendKeys.of("111111").into(Location.CHOOSEPOSTAL),

               Click.on(Location.NEXXTDEVICES)
       );
    }
 // implementamos un metodo para poderlo llamar despues
    public static RegisterUserReto makeinformation() {
        return instrumented(RegisterUserReto.class);
    }
}
