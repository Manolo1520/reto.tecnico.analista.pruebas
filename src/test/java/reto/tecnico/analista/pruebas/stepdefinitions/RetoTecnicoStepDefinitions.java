package reto.tecnico.analista.pruebas.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.tecnico.analista.pruebas.model.RetoTecnicoData;
import reto.tecnico.analista.pruebas.questions.Answer;
import reto.tecnico.analista.pruebas.tasks.Login;
import reto.tecnico.analista.pruebas.tasks.OpenUp;
import reto.tecnico.analista.pruebas.tasks.Register;
import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Manuel needs to learn how to register on Utest portal with our help$")
    public void thatManuelNeedsToLearnHowToRegisterOnUtestPortalWithOurHelp(){

    }

    @When("^he enter the data required by the register form$")
    public void heEnterTheDataRequiredByTheRegisterForm(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorCalled("Manuel").wasAbleTo(OpenUp.thePage(), Register.onThePage(retoTecnicoData.get(0).strFirstName(),
                retoTecnicoData.get(0).strLastName(),
                retoTecnicoData.get(0).strEmail(),
                retoTecnicoData.get(0).strMes(),
                retoTecnicoData.get(0).strDia(),
                retoTecnicoData.get(0).strAno(),
                retoTecnicoData.get(0).strLenguaje(),
                retoTecnicoData.get(0).strCity(),
                retoTecnicoData.get(0).strCodPostal(),
                retoTecnicoData.get(0).strMovilBrand(),
                retoTecnicoData.get(0).strMovilModel(),
                retoTecnicoData.get(0).strMovilOperating(),
                retoTecnicoData.get(0).strPassword(),
                retoTecnicoData.get(0).strConfirmPassword()));
    }

    @Then("^he will be registered as a client and will be able to enter the portal$")
    public void heWillBeRegisteredAsAClientAndWillBeAbleToEnterThePortal(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorCalled("Manuel").wasAbleTo(OpenUp.thePage(),Login.The(retoTecnicoData.get(0).strUserLogin(),
                retoTecnicoData.get(0).strPassLogin()));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoTecnicoData.get(0).getStrEmail())));

    }
}
