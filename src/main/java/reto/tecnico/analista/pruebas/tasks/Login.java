package reto.tecnico.analista.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.tecnico.analista.pruebas.userinterface.RetoLoginPage;
import reto.tecnico.analista.pruebas.userinterface.RetoRegisterPage;

public class Login implements Task {

    private String strUserLogin;
    private String strPassLogin;

    public Login(String strUserLogin, String strPassLogin) {
        this.strUserLogin = strUserLogin;
        this.strPassLogin = strPassLogin;
    }

    public static Login The(String strUserLogin, String strPassLogin){
        return Tasks.instrumented(Login.class,strUserLogin,strPassLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RetoLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUserLogin).into(RetoLoginPage.USERLOGIN_INPUT),
                Enter.theValue(strPassLogin).into(RetoLoginPage.PASSLOGIN_INPUT),
                Click.on(RetoLoginPage.INGRESO_BUTTON));
    }
}
