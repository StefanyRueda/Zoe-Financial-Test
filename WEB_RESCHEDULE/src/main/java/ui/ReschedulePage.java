package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://portal-test.zoefin.com/reschedule/66965aa0-9c17-11ed-b52a-53af9ee871d5")

public class ReschedulePage extends PageObject {

    public static Target TIMEZONEBUTTON=Target.the("Time zone options").located(By.xpath("//*[@class=\"ZUIDropdown__main-selector_current-option active-option\"]"));
    public static Target RESCHEDULEBUTTON=Target.the("Reschedule BUtton").located(By.xpath("//*[@class=\"ButtonContainer--1024f4p fpjyUm ZUIButton ZUIButton--primary ZUIButton--medium\"]"));

    public static Target CONFIRMBUTTON=Target.the("Reschedule BUtton").located(By.xpath("//*[@class=\"ButtonContainer--1024f4p fpjyUm ZUIButton ZUIButton--primary ZUIButton--medium styles_confirmationSchedule__cta_confirm__93j1C\"]"));
    public static Target CONFIRMMESSAGE=Target.the("Reschedule Success Message").located(By.xpath("//*[@class=\"styles_modalDashboard__message_success__ZNYEM\"]"));



}
