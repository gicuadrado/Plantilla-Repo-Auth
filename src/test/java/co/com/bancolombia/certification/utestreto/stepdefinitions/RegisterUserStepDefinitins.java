package co.com.bancolombia.certification.utestreto.stepdefinitions;

import co.com.bancolombia.certification.utestreto.task.RegisterUserReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitins {
    // creamos directorios para la ejecucion del navegador
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Gilber");
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
            theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }

    @When("^user create an account filling all field$")
    public void userCreateAnAccountFillingAllField() {
// definimos las tareas cuando el usuario hace algo
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());

    }

    @Then("^User sees its username$")
    public void userSeesItsUsername() {

    }

}
