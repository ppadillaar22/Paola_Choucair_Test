package co.com.automatizationutest.task;

import co.com.automatizationutest.model.UtestDates;
import co.com.automatizationutest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

import java.util.List;

public class RegisteringDates implements Task {
    private List<UtestDates> dates;

    public RegisteringDates(List<UtestDates> dates) {
        this.dates = dates;
    }

    public static RegisteringDates thepage(List<UtestDates> dates) {
        return Tasks.instrumented(RegisteringDates.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dates.get(0).getStrName()).into(UtestLoginPage.NAME),
                Enter.theValue(dates.get(0).getStrlastname()).into(UtestLoginPage.LASTNAME),
                Enter.theValue(dates.get(0).getStrEmail()).into(UtestLoginPage.EMAIL),
                SelectFromOptions.byVisibleText(dates.get(0).getStrMonthBirth()).from(UtestLoginPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText(dates.get(0).getStrDayBirth()).from(UtestLoginPage.DAY_BIRTH),
                SelectFromOptions.byVisibleText(dates.get(0).getStrYearBirth()).from(UtestLoginPage.YEAR_BIRTH),
                Click.on(UtestLoginPage.NEXT_BUTTON)
                );



    }
}
