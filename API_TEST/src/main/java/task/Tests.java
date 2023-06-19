package task;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import utils.Responses;

public class Tests {

    public Tests(){}
   @Step
   public void  ApiRequestForUsers(){
       Responses.request();
       String phone=Responses.getRequestForUsers().jsonPath().getString("phone");
       String website=Responses.getRequestForUsers().jsonPath().getString("website");

       Assert.assertNotSame(phone,"");
       Assert.assertNotSame(website,"");
    }

    @Step
    public void UpdateUser(){
        Responses.put();
        int codeStatus = Responses.getUpdateUsers().getStatusCode();
        System.out.println(codeStatus);
        Assert.assertEquals(String.valueOf(codeStatus), "200");
    }

}
