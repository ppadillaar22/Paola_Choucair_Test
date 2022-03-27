package co.com.automatizationutest.task;

import co.com.automatizationutest.model.UtestDates;
import co.com.automatizationutest.userinterface.UbicationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static co.com.automatizationutest.userinterface.UbicationPage.*;
import java.util.List;

public class RegisteringUbication implements Task {

    private List<UtestDates> dates;

    public RegisteringUbication(List<UtestDates> dates) {

        this.dates = dates;
    }

    public static RegisteringUbication thePage(List<UtestDates> dates) {
        return Tasks.instrumented(RegisteringUbication.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dates.get(0).getStrCity()).into(CITY),
            Hit.the(Keys.ARROW_DOWN).into(CITY),
            Hit.the(Keys.ENTER).into(CITY),
            Enter.theValue(dates.get(0).getStrPostalCode()).into(POSTALCODE),
            Click.on(COUNTRYREGION),
            Enter.theValue(dates.get(0).getStrCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
            Click.on(DEVICES_BUTTON)
            );





    }
}
