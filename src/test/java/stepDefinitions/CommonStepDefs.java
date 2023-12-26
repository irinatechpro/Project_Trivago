package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.pages.ProfilePage;
import project.utilities.ConfigReader;
import project.utilities.Driver;

public class CommonStepDefs {


    HomePage homePage;
    ProfilePage profilePage;

    @Given("go to the {string}")
    public void go_to_the(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("log in as a user")
    public void log_in_as_user() {
        homePage.clickLoginPage.click();
        profilePage.insertUsername.sendKeys(ConfigReader.getProperty("username"));
        profilePage.insertPassword.sendKeys(ConfigReader.getProperty("password"));
        profilePage.clickToLogin.click();
    }



}
