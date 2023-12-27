package stepDefinitions;

import io.cucumber.java.en.*;
import project.pages.HomePage;
import project.pages.HotelPage;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;

public class US_05_StepDefs {

    HomePage homePage;
    HotelPage hotelPage;


    @When("Go on home page")
    public void goOnHomePage() {
        homePage = new HomePage();
        ReusableMethods.waitFor(2);
        homePage.insertLocation.sendKeys("Amsterdam");
        ReusableMethods.waitForClickablility(homePage.clickSearchButton, 2).click();
        JSUtils.clickElementByJS(homePage.clickSearchButton);
    }

    @When("Go to the requested hotel")
    public void go_to_the_requested_hotel() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(hotelPage.randomHotel);
    }

    @Then("Click on Overview")
    public void click_on_overview() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForClickablility(hotelPage.overview, 2).click();
        JSUtils.clickElementByJS(hotelPage.overview);
    }

    @Then("Click Info")
    public void click_info() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        hotelPage.info.click();
    }

    @Then("Click on Photos")
    public void click_on_photos() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        hotelPage.photos.click();
    }

    @Then("Click on Review")
    public void click_on_review() {
        hotelPage = new HotelPage();
        ReusableMethods.waitFor(2);
        hotelPage.reviews.click();
    }

    @Then("Click on prices")
    public void click_on_prices() {

    }

    @Then("Verify that buttons on the page are clickable")
    public void verify_that_buttons_on_the_page_are_clickable() {

    }


}
