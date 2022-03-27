package co.com.automatizationutest.task;

import co.com.automatizationutest.model.UtestDates;
import co.com.automatizationutest.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.automatizationutest.userinterface.FinalPage.*;
import java.util.List;

public class FullfitFinalPage implements Task {
    private List<UtestDates> dates;

    public FullfitFinalPage(List<UtestDates> dates) {
        this.dates = dates;
    }

    public static FullfitFinalPage thePage(List<UtestDates> dates) {
        return Tasks.instrumented(FullfitFinalPage.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dates.get(0).getStrPassword()).into(PASSWORD),
             Enter.theValue(dates.get(0).getStrPassword()).into(PASSWORD_CONFIRMATION),
                Click.on(CHECKBOX_NOTIFICATIONS),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECK_PRIVACY),
                Click.on(LAST_BUTTON)

        );

    }
}
