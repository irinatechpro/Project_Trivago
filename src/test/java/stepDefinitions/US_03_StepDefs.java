package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import project.pages.HomePage;
import project.utilities.FakerUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_03_StepDefs {

    HomePage homePage;



    @When("I perform a search for hotels or accommodations in a specific location")
    public void i_perform_a_search_for_hotels_or_accommodations_in_a_specific_location() {

        homePage.clickSearchButton.click();
    }

    @When("I apply location-based filters \\(e.g., city, neighborhood)")
    public void i_apply_location_based_filters_e_g_city_neighborhood() {
        homePage.insertLocation.sendKeys("Berlin");

    }

    @Then("I verify that the search results are updated to include only accommodations in the specified location")
    public void i_verify_that_the_search_results_are_updated_to_include_only_accommodations_in_the_specified_location() {

        assertEquals("Berlin", homePage.insertLocation.getText());
        assertTrue("Expected at least 1 relevant result found",
                Integer.parseInt(homePage.numOfStaysFound.getText().trim()) > 0);
    }

    @When("I perform a search for hotels or accommodations")
    public void i_perform_a_search_for_hotels_or_accommodations() {

    }

    @When("I apply filters based on price range and desired amenities")
    public void i_apply_filters_based_on_price_range_and_desired_amenities() {

    }

    @Then("I confirm that the search results are refined based on the selected price range and amenities")
    public void i_confirm_that_the_search_results_are_refined_based_on_the_selected_price_range_and_amenities() {

    }

    @Then("the applied filters are correctly displayed and active")
    public void the_applied_filters_are_correctly_displayed_and_active() {

    }

    @When("I observe the available sorting options")
    public void i_observe_the_available_sorting_options() {

    }

    @Then("I test each sorting option")
    public void i_test_each_sorting_option() {

    }

    @Then("verify that the search results are accurately sorted according to the selected criterion")
    public void verify_that_the_search_results_are_accurately_sorted_according_to_the_selected_criterion() {

    }

    @When("I attempt to apply invalid Location and Price filters")
    public void i_attempt_to_apply_invalid_location_and_price_filters() {

    }

    @Then("I verify the behavior of the application")
    public void i_verify_the_behavior_of_the_application() {

    }


}
