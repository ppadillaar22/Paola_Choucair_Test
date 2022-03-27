package co.com.automatizationutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {
    public static final Target PASSWORD =Target.the("User password")
            .located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION =Target.the("Confirmation user password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_NOTIFICATIONS =Target.the("Check for activating notifications")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS =Target.the("Check for accepting terms")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY =Target.the("Check for accepting privacy policies")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target LAST_BUTTON= Target.the("Complete button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
