import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@CarritoCompras"},
        features = {"src/main/resources/Features"})
public class RunnerLogin {

}