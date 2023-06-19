package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static ui.ReschedulePage.*;

public class Confirm implements Task {

    public Confirm(){    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RESCHEDULEBUTTON),
                Click.on(CONFIRMBUTTON)
        );
    }

    public static Confirm reschedule(){
        return instrumented(Confirm.class,"");
    }
}
