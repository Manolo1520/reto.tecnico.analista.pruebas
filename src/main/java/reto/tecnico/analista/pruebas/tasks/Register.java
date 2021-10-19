package reto.tecnico.analista.pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import reto.tecnico.analista.pruebas.userinterface.RetoRegisterPage;

import static reto.tecnico.analista.pruebas.userinterface.RetoRegisterPage.CITY_INPUT;

public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMes;
    private String strDia;
    private String strAno;
    private String strLenguaje;
    private String strCity;
    private String strCodPostal;
    private String strMovilBrand;
    private String strMovilModel;
    private String strMovilOperating;
    private String strPassword;
    private String strConfirmPassword;

    public Register(String strFirstName, String strLastName, String strEmail, String strMes,
                    String strDia, String strAno, String strLenguaje, String strCity, String strCodPostal,
                    String strMovilBrand,String strMovilModel,String strMovilOperating,
                    String strPassword, String strConfirmPassword) {

        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMes = strMes;
        this.strDia = strDia;
        this.strAno = strAno;
        this.strLenguaje = strLenguaje;
        this.strCity = strCity;
        this.strCodPostal = strCodPostal;
        this.strMovilBrand = strMovilBrand;
        this.strMovilModel = strMovilModel;
        this.strMovilOperating = strMovilOperating;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }
    public static Register onThePage(String strFirstName, String strLastName, String strEmail,
                                     String strMes, String strDia, String strAno, String strLenguaje,
                                     String strCity, String strCodPostal, String strMovilBrand,
                                     String strMovilModel, String strMovilOperating,
                                     Object strPassword, Object strConfirmPassword){
        return Tasks.instrumented(Register.class,strFirstName,strLastName,strEmail,strMes,strDia,strAno,strLenguaje,
                strCity,strCodPostal,strMovilBrand,strMovilModel,strMovilOperating,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RetoRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(RetoRegisterPage.FNAME_INPUT),
                Enter.theValue(strLastName).into(RetoRegisterPage.LNAME_INPUT),
                Enter.theValue(strEmail).into(RetoRegisterPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(strMes).from(RetoRegisterPage.MES_INPUT),
                SelectFromOptions.byVisibleText(strDia).from(RetoRegisterPage.DIA_INPUT),
                SelectFromOptions.byVisibleText(strAno).from(RetoRegisterPage.ANO_INPUT),
                Enter.theValue(strLenguaje).into(RetoRegisterPage.LENGUAJE_INPUT),
                Click.on(RetoRegisterPage.LOCATION_BUTTON),
                Click.on(CITY_INPUT),
                Enter.theValue(strCity).into(CITY_INPUT),
                Hit.the(Keys.ARROW_DOWN).into(CITY_INPUT),
                Hit.the(Keys.ENTER).into(CITY_INPUT),
                Enter.theValue(strCodPostal).into(RetoRegisterPage.CODPOSTAL_INPUT),
                Click.on(RetoRegisterPage.DEVICES_BUTTON),
                Enter.keyValues(strMovilBrand).into(RetoRegisterPage.MBRAND_INPUT),
                Enter.keyValues(strMovilModel).into(RetoRegisterPage.MMODEL_INPUT),
                Enter.keyValues(strMovilOperating).into(RetoRegisterPage.MOPERATING_INPUT),
                Click.on(RetoRegisterPage.LASTSTEP_BUTTON),
                Enter.keyValues(strPassword).into(RetoRegisterPage.PASSWORD_INPUT),
                Enter.keyValues(strConfirmPassword).into(RetoRegisterPage.CONFIRMPASSWORD_CHECK),
                Click.on(RetoRegisterPage.TYT_CHECK),
                Click.on(RetoRegisterPage.PSP_CHECK),
                Click.on(RetoRegisterPage.COMPLETE_BUTTON));
    }
}
