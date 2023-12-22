package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.utilities.Driver;

public class Hooks {
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot;
        if (scenario.isFailed()){
            screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
            scenario.attach(scenario.getUri().toString(), "text/plain", "Scenario URI");

            String stepText = scenario.getStatus().toString();
            scenario.attach(stepText, "text/plain", "Failed Step");
        }
        Driver.closeDriver();
    }
}
