package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import project.pages.HomePage;
import project.pages.LoginPage;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.ReusableMethods;

public class CommonStepDefs {


    HomePage homePage;
    LoginPage loginPage;

    @Given("go to the {string}")
    public void go_to_the(String url)  {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("login as a user")
    public void login_as_a_user() {
        ReusableMethods.waitFor(2);
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        homePage.clickLoginPage.click();
        ReusableMethods.waitFor(2);
        loginPage.insertUsername.sendKeys(ConfigReader.getProperty("username"));
        loginPage.clickLoginNextButton.click();
        ReusableMethods.waitFor(2);
        loginPage.insertPassword.sendKeys(ConfigReader.getProperty("password"));
        loginPage.clickToLogin.click();
    }




}
