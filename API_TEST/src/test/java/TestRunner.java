import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import task.Tests;

@RunWith(SerenityRunner.class)

@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
    @Steps
    Tests test;

    @Test
    public void test(){
        test.ApiRequestForUsers();
        test.UpdateUser();
    }

}
