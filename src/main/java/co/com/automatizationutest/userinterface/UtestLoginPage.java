package co.com.automatizationutest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {

    public static final Target NAME=Target.the("where do we write user name")
            .located(By.id("firstName"));
    public static final Target LASTNAME=Target.the("where do we write user lastname")
            .located(By.id("lastName"));
    public static final Target EMAIL=Target.the("where do we write user email")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH = Target.the("where do we write month of birth")
            .located(By.id("birthMonth"));
    public static final Target DAY_BIRTH= Target.the("where do we write day of birth")
            .located(By.id("birthDay"));
    public static final Target YEAR_BIRTH=Target.the("where do we write user lastname")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Button that show the next steps")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
