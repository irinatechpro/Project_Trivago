package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//button[@data-testid='header-login']")
    public WebElement clickLoginPage;

    @FindBy(xpath = "//button[@data-testid='header-profile-menu']")
    public WebElement clickProfileMenuButton;

    @FindBy(xpath = "//li[@class='h-12 flex '][1]")
    public WebElement clickAccountSettings;


    @FindBy(xpath = "//button[@data-testid='header-logout']")
    public WebElement clickLogout;


    @FindBy(xpath = "//span[@data-testid='suggestion-subtitle'][1]")
    public WebElement selectFromSuggestion;

    @FindBy(xpath = "//input[@value='Berlin']")
    public WebElement textInLocationBox;

    @FindBy(xpath = "//input[@id='input-auto-complete']")
    public WebElement insertLocation;

    @FindBy(xpath = "//div[@aria-hidden='true']")
    public WebElement resultForStaysFound;

    @FindBy(xpath = "//div[@data-testid='slider-handle-max']")
    public WebElement movePriceLevelUp;

    @FindBy(xpath = "//span[@class='truncate w-full']")
    public WebElement clickPriceFilterInput;

    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement priceFilterApplyButton;

    @FindBy(xpath = "//span[@data-testid='search-form-calendar-checkin-value']")
    public WebElement checkInOut;

    @FindBy(xpath = "//button[@data-testid='valid-calendar-day-2024-01-15']")
    public WebElement checkInDropdown;
    @FindBy(xpath = "//button[@data-testid='valid-calendar-day-2024-01-25']")
    public WebElement checkOutDropdown;
    @FindBy(xpath = "//button[@name='property_type']")
    public WebElement propertyTypeMenu;

    @FindBy(xpath = "//label[contains(@for, 'checkbox-') and @data-testid='checkbox-label' and contains(text(), 'Entire House / Apartment')]")
    public WebElement EntireHouseApartment;

    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement propertyTypeApply;

    @FindBy(xpath = "//p[@data-testid = 'no-results-suggestion']")
    public WebElement noResultsSuggestion;

    @FindBy(xpath = "//p[@data-testid = 'search-form-calendar-checkin']")
    public WebElement searchFormCalendarCheckIn;

    @FindBy(xpath = "//p[@data-testid = 'nextWeekend-index-label']")
    public WebElement nextWeekendButton;

}
