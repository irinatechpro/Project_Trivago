package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.pages.HomePage;
import project.pages.HotelPage;
import project.pages.HousePage;
import project.utilities.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static project.utilities.ReusableMethods.waitFor;
public class US_06_StepDefs {
    HomePage homePage = new HomePage();
    HousePage housePage = new HousePage();

    @When("select Landmark, Check in, Check out from dropdown menu and click on Search button")
    public void select_landmark_check_in_check_out_from_dropdown_menu_and_click_on_search_button() {
        waitFor(1);
        homePage.clickSearchButton.click();
        waitFor(2);
        homePage.insertLocation.sendKeys("Manchester");
        waitFor(1);
        homePage.selectFromSuggestion.click();
        waitFor(1);
        homePage.checkInDropdown.click();
        waitFor(1);
        homePage.checkOutDropdown.click();
        waitFor(1);
        homePage.clickSearchButton.click();
    }
    @Then("click on Property type menu, select Entire House Apartment")
    public void clickOnPropertyTypeMenuSelectEntireHouseApartment() {
        ReusableMethods.waitFor(1);
        homePage.propertyTypeMenu.click();
        ReusableMethods.waitFor(1);
        homePage.EntireHouseApartment.click();
        ReusableMethods.waitFor(1);
        homePage.propertyTypeApply.click();
        ReusableMethods.waitFor(1);
        housePage.nativeManchesterSpan.click();
    }
    @Then("Check accurate pricing")
    public void check_accurate_pricing() {
        ReusableMethods.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        waitFor(10);
    }
    @When("select Guest rating,  Location from dropdown menu")
    public void selectGuestRatingLocationFromDropdownMenu() {
    }
    @Then("click on  View Map button")

    public void clickOnViewMapButton() {
        ReusableMethods.waitFor(5);
        housePage.infoButton.click();
    }
    @And("Check accurate amenities")
    public void checkAccurateAmenities() {
        //   JSUtils.clickElementByJS(housePage.reviewsButton);
    }
    @And("Check accurate room types")
    public void checkAccurateRoomTypes() {
    }
}



