package stepDefinitions;

import io.cucumber.java.DataTableType;

public class CucumberConfigs {

    @DataTableType(replaceWithEmptyString = "[blank]")
    public String stringType(String cell) {
        return cell;
    }
}
