package stepsDefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import questiom.Confirmation;
import task.Confirm;
import ui.ReschedulePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HappyPath {

    @When("^ends the reschedule process$")
    public void endsTheRescheduleProcess() {
        theActorInTheSpotlight().attemptsTo(
                Confirm.reschedule()
        );
    }


    @Then("^the user should see the confirm message$")
    public void theUserShouldSeeTheConfirmMessage() {

        theActorInTheSpotlight().should(seeThat(Confirmation.wentCorrectly()));

    }

}
