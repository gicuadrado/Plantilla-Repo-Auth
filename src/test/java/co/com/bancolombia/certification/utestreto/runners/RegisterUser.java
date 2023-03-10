package co.com.bancolombia.certification.utestreto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
// importamos runwith desde serenity
@RunWith(CucumberWithSerenity.class)
// apuntamos a los archivos
        @CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "co.com.bancolombia.certification.utestreto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterUser {
}
