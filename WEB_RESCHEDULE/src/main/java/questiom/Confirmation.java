package questiom;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Confirmation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String confirmMessage=getDriver().findElement(By.xpath("//*[@class=\"styles_modalDashboard__message_success__ZNYEM\"]")).getText();
        if(confirmMessage.contains("Successfully RescheduleD!")){
            return true;
        }else{
            return false;
        }
    }
    public static Confirmation wentCorrectly(){
        return new Confirmation();
    }


}
