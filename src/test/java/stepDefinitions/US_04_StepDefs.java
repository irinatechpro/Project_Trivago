package stepDefinitions;

import io.cucumber.java.en.*;
import project.pages.HomePage;
import project.pages.HotelPage;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;

public class US_04_StepDefs {


    HomePage homePage;
    HotelPage hotelPage;

    @When("Choose a place as destination and select all the necessary steps and click on Search")
    public void choose_a_place_as_destination_and_select_all_the_necessary_steps_and_click_on_search() {

        homePage = new HomePage();
        ReusableMethods.waitFor(2);
        homePage.insertLocation.sendKeys("Amsterdam");
        ReusableMethods.waitForClickablility(homePage.clickSearchButton, 2).click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);
    }

    @Then("Click on a hotel from the search results")
    public void click_on_a_hotel_from_the_search_results() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(hotelPage.randomHotel);
    }

    @Then("Check if the details include accurate pricing")
    public void check_if_the_details_include_accurate_pricing() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        hotelPage.showAllPrices.click();
    }

    @Then("Check if the details include accurate amenities")
    public void check_if_the_details_include_accurate_amenities() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(hotelPage.showAmenities);
    }

    @Then("Verify that buttons and links on the page are functional")
    public void verify_that_buttons_and_links_on_the_page_are_functional() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        assertTrue(hotelPage.popularChoice.isDisplayed());
    }

    /*
    -------------------------------------------------------------------------------------------
     */



    @When("Choose a place as destination and click on Search")
    public void choose_a_place_as_destination_and_click_on_search() {

    }

    @Then("Click on a hotel from the search results page")
    public void click_on_a_hotel_from_the_search_results_page() {

    }

    @Then("Click on View Deal button")
    public void click_on_view_deal_button() {

    }

    @Then("Click on See description")
    public void click_on_see_description() {

    }

    @Then("Click on See all services")
    public void click_on_see_all_services() {

    }

    @Then("Click on See the rates and Pricing conditions")
    public void click_on_see_the_rates_and_pricing_conditions() {

    }




}
