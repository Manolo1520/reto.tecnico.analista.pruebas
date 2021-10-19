package reto.tecnico.analista.pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import reto.tecnico.analista.pruebas.userinterface.RetoRegisterPage;

public class Answer implements Question<Boolean> {
    private  String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String email= Text.of(RetoRegisterPage.EMAIL_TITLE).viewedBy(actor).asString();
        if (question.equals(email)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
