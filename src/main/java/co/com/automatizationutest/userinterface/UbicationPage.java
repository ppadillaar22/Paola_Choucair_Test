package co.com.automatizationutest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UbicationPage {
    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target POSTALCODE = Target.the("Postal code")
            .located(By.id("zip"));
    public static final Target COUNTRYREGION = Target.the("Region of the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Country of location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target DEVICES_BUTTON =Target.the("Button for going to devices configuration")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
