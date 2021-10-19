package reto.tecnico.analista.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reto.tecnico.feature",
        tags = "@stories",
        glue = "reto.tecnico.analista.pruebas.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags{

}