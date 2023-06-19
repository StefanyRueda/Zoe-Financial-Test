package stepsDefinitions;


import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.AccessToReschedulePage;
import task.ChangeTimeZone;
import task.SelectARescheduleDate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TimeZoneChange {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Stefany");
    }

    @Given("the user accesses to the reschedule interface from the link")
    public void theUserAccessesToTheRescheduleInterfaceFromTheLink() {
        theActorInTheSpotlight().wasAbleTo(
                AccessToReschedulePage.fromLink()
        );
    }
    @When("the user select an avalible date and an avalible time option")
    public void theUserSelectAnAvalibleDateAndAnAvalibleTimeOption() {
        theActorInTheSpotlight().attemptsTo(
                SelectARescheduleDate.avaliable()
        );
    }
    @When("change the (.*)")
    public void changeTheCentralTime(String newTimeZone) {
        theActorInTheSpotlight().attemptsTo(
                ChangeTimeZone.once(newTimeZone)
        );

    }
    @Then("the user should see selected the time that selected previously homologated to the new time zone")
    public void theUserShouldSeeSelectedTheTimeThatSelectedPreviouslyHomologatedToTheNewTimeZone() {

    }



}
