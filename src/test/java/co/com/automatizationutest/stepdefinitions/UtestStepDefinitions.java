package co.com.automatizationutest.stepdefinitions;

import co.com.automatizationutest.model.UtestDates;
import co.com.automatizationutest.questions.Answering;
import co.com.automatizationutest.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Paola logged to utest\\.com$")
    public void thanPaolaLoggedToUtestCom() throws Exception {
        OnStage.theActorCalled("Paola").wasAbleTo(OpenUp.thePage());


    }


    @When("^she wants to login creating a new user$")
    public void sheWantsToLoginCreatingANewUser(List<UtestDates> dates) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisteringDates.thepage(dates), RegisteringUbication.thePage(dates),
                FullfitDevicesInformation.thePage(dates), FullfitFinalPage.thePage(dates)
        );

    }

    @Then("^we are going to fulfill all the text box with the required information and the complete register will appear$")
    public void weAreGoingToFulfillAllTheTextBoxWithTheRequiredInformationAndTheCompleteRegisterWillAppear(List<UtestDates> dates) throws Exception {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answering.toThe(dates)));
    }

}
