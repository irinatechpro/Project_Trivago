package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.pages.HomePage;
import project.pages.HousePage;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static project.utilities.ReusableMethods.waitFor;
public class US_06_StepDefs {
    HousePage housePage = new HousePage();
    HomePage homePage = new HomePage();
    @When("go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @When("select Landmark, Check in, Check out, Guests and Rooms from dropdown menu and click on Search button")
    public void select_landmark_check_in_check_out_guests_and_rooms_from_dropdown_menu_and_click_on_search_button() {
       // waitFor(2);
        homePage.clickSearchButton.click();
      homePage.insertLocation.sendKeys("Manchester");
      homePage.subtitleOfLocation.click();
      homePage.checkInOut.click();
//        WebElement checkInInput = driver.findElement(By.id("checkin-input-id"));
//        WebElement checkOutInput = driver.findElement(By.id("checkout-input-id"));
    }
//    @Then("click on Property type menu, select Entire House \\/ Apartment")
//    public void click_on_property_type_menu_select_entire_house_apartment() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("verify Price menu is selectable")
//    public void verify_price_menu_is_selectable() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("verify Filters menu is selectable")
//    public void verify_filters_menu_is_selectable() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//

}
