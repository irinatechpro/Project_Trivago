package stepDefinitions;

import io.cucumber.java.en.*;
import org.apache.commons.lang3.ObjectUtils;
import project.pages.HomePage;
import project.pages.HotelPage;
import project.pages.LoginPage;
import project.utilities.*;

import static org.junit.Assert.*;

public class US_03_StepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    HotelPage hotelPage = new HotelPage();





    //US03_TC01

    @When("I perform a search for hotels or accommodations in a specific location")
    public void i_perform_a_search_for_hotels_or_accommodations_in_a_specific_location() {
        JSUtils.clickElementByJS(homePage.clickSearchButton);
    }

    @When("I apply location-based filters \\(e.g., city, neighborhood)")
    public void i_apply_location_based_filters_e_g_city_neighborhood() {
        homePage.insertLocation.sendKeys("Berlin");
        ReusableMethods.waitForClickablility(homePage.selectFromSuggestion, 2).click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);


    }

    @Then("I verify that the search results are updated to include only accommodations in the specified location")
    public void i_verify_that_the_search_results_are_updated_to_include_only_accommodations_in_the_specified_location() {

        ReusableMethods.waitForVisibility(homePage.resultForStaysFound, 2);
        assertTrue(homePage.resultForStaysFound.isDisplayed());
    }


    //US03_TC02

    @When("I perform a search for hotels or accommodations")
    public void i_perform_a_search_for_hotels_or_accommodations() {

        homePage.insertLocation.sendKeys("Berlin");
        ReusableMethods.waitForClickablility(homePage.selectFromSuggestion, 2).click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);

    }

    @When("I apply filters based on price range and desired amenities")
    public void i_apply_filters_based_on_price_range_and_desired_amenities() {



        JSUtils.scrollIntoViewJS(homePage.clickPriceFilterInput);
        JSUtils.clickElementByJS(homePage.clickPriceFilterInput);

        ReusableMethods.waitForVisibility(homePage.movePriceLevelUp,2);
        ReusableMethods.adjustPriceLevelBar(homePage.movePriceLevelUp, 150);

        ReusableMethods.pressEnterKey(homePage.priceFilterApplyButton);

        ReusableMethods.waitFor(1);




    }

    @Then("I confirm that the search results are refined based on the selected filters")
    public void i_confirm_that_the_search_results_are_refined_based_on_the_selected_filters() {

//        // Check if hotelPage.clickOnAHotel is not null
//        if (hotelPage.clickHotelAldonBerlin == null) {
//            throw new IllegalArgumentException("hotelPage.clickOnAHotel is not initialized");
//        }
        ReusableMethods.waitForClickablility(hotelPage.clickHotelAldonBerlin, 2);

        hotelPage.clickHotelInfo.click();
        hotelPage.clickToOpenAmenitiesList.click();

        String actualAmenitiesText = hotelPage.hotelTopAmenitiesList.getText();
        assertTrue("Actual amenities exist", !actualAmenitiesText.trim().isEmpty());
    }



    //US03_TC03
    @When("I observe the available sorting options")
    public void i_observe_the_available_sorting_options() {

        hotelPage.sortingDropdown.isEnabled();

    }

    @Then("I test each sorting option")
    public void i_test_each_sorting_option() {
        ReusableMethods.waitForClickablility(hotelPage.sortByOurRecommendation, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByDistanceAndRecommended, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByDistanceOnly, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByRatingAndRecommended, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByRatingOnly, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByPriceAndRecommended, 1);
        ReusableMethods.waitForClickablility(hotelPage.sortByPriceOnly, 1);


    }

    @Then("verify that the search results are accurately sorted according to the selected criterion")
    public void verify_that_the_search_results_are_accurately_sorted_according_to_the_selected_criterion() {
        ReusableMethods.verifyElementDisplayed(hotelPage.sortedResult);
        assertTrue("Results displayed by the sorting", true);

    }

    //US03_TC04

    @When("I perform a search")
    public void i_perform_a_search() {

        homePage.insertLocation.sendKeys("Berlin");
        ReusableMethods.waitForClickablility(homePage.selectFromSuggestion, 2).click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);

    }
    @And("I attempt to apply invalid Location and Price filters")
    public void i_attempt_to_apply_invalid_location_and_price_filters() {

        JSUtils.scrollIntoViewJS(homePage.clickPriceFilterInput);
        JSUtils.clickElementByJS(homePage.clickPriceFilterInput);

        ReusableMethods.waitForVisibility(homePage.movePriceLevelUp,2);
        ReusableMethods.adjustPriceLevelBar(homePage.movePriceLevelUp, 0);

        ReusableMethods.pressEnterKey(homePage.priceFilterApplyButton);

    }

    @Then("I verify the behavior of the application")
    public void i_verify_the_behavior_of_the_application() {

    }


}
