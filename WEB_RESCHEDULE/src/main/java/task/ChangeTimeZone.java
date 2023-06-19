package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static ui.ReschedulePage.TIMEZONEBUTTON;

public class ChangeTimeZone implements Task {

    private String timeZone;
    private String currentTimeZone= SelectARescheduleDate.getCurrentTimeZone();
    public ChangeTimeZone(String timeZone){
        this.timeZone=timeZone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TIMEZONEBUTTON)
        );



        if (timeZone==currentTimeZone){

        }else if(timeZone =="Eastern Time") {
            getDriver().findElement(By.xpath("//*[@class=\"ZUIDropdown__options-main-container options-down\"]/div/div/button[1]")).click();
        }else if (timeZone =="Central Time") {
            getDriver().findElement(By.xpath("//*[@class=\"ZUIDropdown__options-main-container options-down\"]/div/div/button[2]")).click();
        }else if (timeZone =="Mountain Time") {
            getDriver().findElement(By.xpath("//*[@class=\"ZUIDropdown__options-main-container options-down\"]/div/div/button[3]")).click();
        }else if (timeZone =="Pacific Time") {
            getDriver().findElement(By.xpath("//*[@class=\"ZUIDropdown__options-main-container options-down\"]/div/div/button[4]")).click();
        }




    }

    public static ChangeTimeZone once(String timeZone){
        return instrumented(ChangeTimeZone.class,timeZone);
    }
}
