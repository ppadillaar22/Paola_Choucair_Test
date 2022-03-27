package co.com.automatizationutest.task;

import co.com.automatizationutest.model.UtestDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.automatizationutest.userinterface.DevicesPage.*;
import java.util.List;

public class FullfitDevicesInformation implements Task {
    private List<UtestDates> dates;

    public FullfitDevicesInformation(List<UtestDates> dates) {
        this.dates = dates;
    }

    public static FullfitDevicesInformation thePage(List<UtestDates> dates) {
        return Tasks.instrumented(FullfitDevicesInformation.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COMPUTER_LIST),
                Enter.theValue(dates.get(0).getStrComputerSO()).into(COMPUTER_SO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(VERSIONSO_LIST),
                Enter.theValue(dates.get(0).getStrVersion()).into(VERSIONSO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(COMPUTER_LANGUAJE_LIST),
                Enter.theValue(dates.get(0).getStrLanguajeComputer()).into(COMPUTER_LANGUAJE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MOBILE_LIST),
                Enter.theValue(dates.get(0).getStrMobile()).into(MOBILE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MODEL_LIST),
                Enter.theValue(dates.get(0).getStrModel()).into(MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MOBILESYSTEM_LIST),
                Enter.theValue(dates.get(0).getStrSystem()).into(MOBILESYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LAST_BUTTON)
        );

    }
}
