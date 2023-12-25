package stepDefinitions;

import io.cucumber.java.en.Given;
import project.pages.HomePage;
import project.pages.LoginPage;
import project.utilities.ConfigReader;
import project.utilities.Driver;

public class CommonStepDefs {


    HomePage homePage;
    LoginPage loginPage;

    @Given("go to the {string}")
    public void go_to_the(String url)  {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

//    @When("log in as a user")
//    public void login_as_a_user() {
//        ReusableMethods.waitFor(2);
//        homePage.clickLoginPage.click();
//        profilePage.insertUsername.sendKeys(ConfigReader.getProperty("username"));
//        profilePage.insertPassword.sendKeys(ConfigReader.getProperty("password"));
//        profilePage.clickToLogin.click();
//    }


}
