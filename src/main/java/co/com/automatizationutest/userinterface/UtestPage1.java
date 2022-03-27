package co.com.automatizationutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage1 extends PageObject {

    public static final Target JOIN= Target.the("Button for joining and registering")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
