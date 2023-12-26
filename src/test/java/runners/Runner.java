package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "html:testOutput/reports/cucumber_UI_Regression.html",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = ".//src//test//resources//features//ui",
       // features = "src/test/resources/features/ui",
     //  glue = {"stepdefinitions"},
     //   glue = {"stepdefinitions","hooks"}, //path of the step definitions
     //   glue = {".//src//test//java//stepDefinitions"},
        glue = {"stepDefinitions"},
        dryRun = false,
        tags="@US_06_TC01"
)
public class Runner {
}
