package reto.tecnico.analista.pruebas.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.sourceforge.htmlunit.corejs.javascript.ArrowFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RetoRegisterPage extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FNAME_INPUT = Target.the("button that shows us the form to login").located(By.id("firstName"));
    public static final Target LNAME_INPUT = Target.the("button that shows us the form to login").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("button that shows us the form to login").located(By.id("email"));
    public static final Target MES_INPUT = Target.the("button that shows us the form to login").located(By.id("birthMonth"));
    public static final Target DIA_INPUT = Target.the("button that shows us the form to login").located(By.id("birthDay"));
    public static final Target ANO_INPUT = Target.the("button that shows us the form to login").located(By.id("birthYear"));
    public static final Target LENGUAJE_INPUT = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target LOCATION_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY_INPUT = Target.the("button that shows us the form to login").located(By.id("city"));
    public static final Target CODPOSTAL_INPUT = Target.the("button that shows us the form to login").located(By.id("zip"));
    public static final Target DEVICES_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target MBRAND_INPUT = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MMODEL_INPUT = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOPERATING_INPUT = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LASTSTEP_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target PASSWORD_INPUT = Target.the("button that shows us the form to login").located(By.id("password"));
    public static final Target CONFIRMPASSWORD_CHECK = Target.the("button that shows us the form to login").located(By.id("confirmPassword"));
    public static final Target TYT_CHECK = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PSP_CHECK = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_BUTTON = Target.the("button that shows us the form to login").located(By.id("laddaBtn"));
    public static final Target EMAIL_TITLE = Target.the("button that shows us the form to login").located(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/section/div[1]/span"));

}
