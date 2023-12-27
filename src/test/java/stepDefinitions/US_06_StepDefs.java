package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import project.pages.HomePage;
import project.pages.HousePage;
import project.utilities.ConfigReader;
import project.utilities.Driver;
import project.utilities.JSUtils;
import project.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static project.utilities.ReusableMethods.waitFor;
public class US_06_StepDefs {
    HomePage homePage = new HomePage();
    HousePage housePage = new HousePage();
    @When("go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
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
        homePage.propertyTypeMenu.click();
        homePage.EntireHouseApartment.click();
        homePage.propertyTypeApply.click();
    }
    @Then("verify Price menu is selectable")
    public void verifyPriceMenuIsSelectable() {
       housePage.nativeManchesterSpan.click();
    }
    // Locate the Check-In dropdown element and select a date
    // WebElement checkInDropdown = driver.findElement(By.id("checkin-dropdown-id"));
    // Assuming the dropdown allows you to select a date, you can use Selenium's Select class
    // to interact with dropdowns. Import the Select class and use it as follows:
//        Select select = new Select(homePage.checkInDropdown);
//         select.selectByVisibleText("10");

    // Replace the above code with your logic to select a date from the dropdown.
    // homePage.selectFromSuggestion.click();
    // JSUtils.clickElementByJS(homePage.clickSearchButton);

    //  Select your check-in date
    // new Select(homePage.subtitleOfLocation).selectByVisibleText("City · England, United Kingdom");
    // homePage.checkInOut.click();
//        WebElement checkInInput = driver.findElement(By.id("checkin-input-id"));
//        WebElement checkOutInput = driver.findElement(By.id("checkout-input-id"));
    // }

}
//    @Then("verify Filters menu is selectable")
//    public void verify_filters_menu_is_selectable() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();


