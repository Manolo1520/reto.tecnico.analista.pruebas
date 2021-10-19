package reto.tecnico.analista.pruebas.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
    public static final Target USERLOGIN_INPUT = Target.the("button that shows us the form to login").located(By.id("username"));
    public static final Target PASSLOGIN_INPUT = Target.the("button that shows us the form to login").located(By.id("password"));
    public static final Target INGRESO_BUTTON = Target.the("button that shows us the form to login").located(By.id("kc-login"));
}
