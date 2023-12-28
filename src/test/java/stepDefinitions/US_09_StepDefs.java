package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import project.pages.HomePage;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_09_StepDefs {

    HomePage homePage = new HomePage();

    @When("user enters destination {string}")
    public void user_enters_destination(String destination) {
        homePage.insertLocation.sendKeys(destination, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }
    @When("user enters checkIn {string}")
    public void user_enters_check_in(String checkIn) {
        //homePage.checkInDropdown.sendKeys(checkIn, Keys.ENTER);
        //JSUtils.setValueByJS(homePage.checkInDropdown, checkIn);
        //JSUtils.clickElementByJS(homePage.nextWeekendButton);
        //JSUtils.clickElementByJS(homePage.searchFormCalendarCheckIn);
        //JSUtils.clickElementByJS(homePage.nextWeekendButton);
        homePage.searchFormCalendarCheckIn.click();
        ReusableMethods.waitFor(1);
        homePage.nextWeekendButton.click();
        ReusableMethods.waitFor(1);
    }
    @When("user enter checkOut {string}")
    public void user_enter_check_out(String checkOut) {
        //homePage.checkOutDropdown.sendKeys(checkOut, Keys.ENTER);
        //JSUtils.setValueByJS(homePage.checkOutDropdown, checkOut);
    }
    @When("user click on search button")
    public void user_click_on_search_button() {
        //homePage.clickSearchButton.click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);
        ReusableMethods.waitFor(1);
    }
    @Then("validate error message")
    public void validate_error_message() {
        Assert.assertTrue(homePage.noResultsSuggestion.isDisplayed());
        ReusableMethods.waitFor(1);
        // 2nd way
        //assertTrue(homePage.noResultsSuggestion.getText().contains("No results for"));
    }
    @Then("close application")
    public void close_application() {
        Driver.closeDriver();
    }
}
