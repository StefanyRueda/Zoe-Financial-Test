package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class SelectARescheduleDate implements Task {


    public static String hour="";
    public static String currentTimeZone="";
public SelectARescheduleDate(){}


    @Override
    public <T extends Actor> void performAs(T actor) {

        for(int x=1;x<=35;x++){
            String state= getDriver().findElement(By.xpath("//*[@class='styles-module_datesContainer__days__exKhC']/div["+x+"]")).getAttribute("class");
            System.out.println(state);
            if(!state.contains("modDisabled")){
                String firstAvailable= "//*[@class='styles-module_datesContainer__days__exKhC']/div["+x+"]";
                getDriver().findElement(By.xpath(firstAvailable)).click();
                break;
            }
        }

        int availableMeets=getDriver().findElement(By.xpath("//*[@class='styles-module_timesContainer__times__vaq7V']")).findElements(By.tagName("div")).size();
        int meet= (int) (Math.random() * availableMeets +1);
        String firstAvailable= "//*[@class='styles-module_timesContainer__times__vaq7V']/div["+meet+"]";
        hour= getDriver().findElement(By.xpath(firstAvailable)).getText();
        String timeZone="//*[@class=\"ZUIDropdown__main-selector_current-option active-option\"]";
        currentTimeZone= getDriver().findElement(By.xpath("//*[@class=\"ZUIDropdown__main-selector_current-option active-option\"]")).getText();
        System.out.println(hour+" "+timeZone);
        getDriver().findElement(By.xpath(firstAvailable)).click();


    actor.attemptsTo(



    );


    }

    public static String getHour() {
        return hour;
    }

    public static String getCurrentTimeZone() {
        return currentTimeZone;
    }

    public static SelectARescheduleDate avaliable(){
    return instrumented(SelectARescheduleDate.class,"");
    }
}
