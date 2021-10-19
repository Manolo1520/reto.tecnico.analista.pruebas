package reto.tecnico.analista.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.tecnico.analista.pruebas.userinterface.RetoTecnicoPage;

public class OpenUp implements Task {
    private RetoTecnicoPage retoTecnicoPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(retoTecnicoPage));
    }
}
