package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.pages.HomePage;
import project.pages.HousePage;
import project.utilities.*;
import java.io.IOException;

public class US_06_StepDefs {
    HomePage homePage=new HomePage();
    HousePage housePage= new HousePage();
@Then("select Landmark, Check in, Check out from dropdown menu and click on Search button")
public void select_Landmark_Check_in_Check_out_from_dropdown_menu_and__click_on_Search_button(){
    WaitUtils.waitFor(1);
    homePage.insertLocation.sendKeys("Manchester");
    ReusableMethods.waitForClickablility(homePage.selectFromSuggestion, 2).click();
    WaitUtils.waitFor(1);
    homePage.checkInDropdown.click();
    WaitUtils.waitFor(1);
    homePage.checkOutDropdown.click();
    WaitUtils.waitFor(1);
    JSUtils.clickElementByJS(homePage.clickSearchButton);
}
@Then("click on Property type menu, select Entire House Apartment")
public void click_On_Property_Type_Menu_Select_Entire_House_Apartment(){
        homePage.propertyTypeMenu.click();
        ReusableMethods.waitFor(5);
        homePage.EntireHouseApartment.click();
        ReusableMethods.waitFor(1);
        homePage.propertyTypeApply.click();
        ReusableMethods.waitFor(1);
    }
@Then("Check accurate pricing")
public void Check_accurate_pricing(){
        Assert.assertTrue(housePage.priceTravel.isDisplayed());
        ReusableMethods.waitFor(2);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         WaitUtils.waitFor(1);
    }
    @When("user clicks the house name")
    public void user_clicks_the_house_name(){
        housePage.firstHouseTitle.click();
        ReusableMethods.waitFor(2);
        WaitUtils.waitFor(1);
    }
    @Then("user clicks the overview button")
    public void user_clicks_the_overview_button(){
        housePage.overview.click();
        ReusableMethods.waitFor(2);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        WaitUtils.waitFor(1);
        ActionUtils.scrollDownActions();
    }
    @Then("check accurate amenities")
    public void check_accurate_amenities(){
        WaitUtils.waitForVisibility(housePage.topAmenities,2);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(housePage.topAmenities.isDisplayed());
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
            ReusableMethods.waitFor(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @And("verify Sort by dropdown menu is functional")
    public void verify_Sort_by_dropdown_menu_is_functional() {
       housePage.sortingSelector.click();
     ReusableMethods.waitFor(5);
        try {
            MediaUtils.takeScreenshotOfTheEntirePage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        WaitUtils.waitFor(1);
        ActionUtils.scrollDownActions();
}


}







