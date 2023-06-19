package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import ui.ReschedulePage;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccessToReschedulePage implements Task {

    private ReschedulePage page;
public AccessToReschedulePage(){}


    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.wasAbleTo(
            Open.browserOn(page)
    );
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


    }

    public static AccessToReschedulePage fromLink(){
    return instrumented(AccessToReschedulePage.class,"");
    }
}
