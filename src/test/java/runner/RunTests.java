package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/reports/cucumberTestes.json", "html:target/reports/"},
        features = "src/test/resources/features",
        glue = {"steps"},
       tags = {"@cadastro-usuario-sucesso"}
)
public class RunTests extends RunnerBases {
@AfterClass
    public static void stop(){

    getDriver().quit();
}
}
