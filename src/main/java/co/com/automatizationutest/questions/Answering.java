package co.com.automatizationutest.questions;

import co.com.automatizationutest.model.UtestDates;
import co.com.automatizationutest.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import java.util.List;

public class Answering implements Question<Boolean> {
    private List<UtestDates> dates;

    public Answering(List<UtestDates> dates) {
        this.dates = dates;
    }

    public static Answering toThe(List<UtestDates> dates) {
        return new Answering(dates);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Final_Button = Text.of(FinalPage.LAST_BUTTON).viewedBy(actor).asString();

        return dates.get(0).getStrFinalText().equals(Final_Button);
    }
}
