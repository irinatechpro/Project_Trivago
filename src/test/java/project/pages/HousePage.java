package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.Driver;

    public class HousePage extends BasePage {
        public HousePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//span[@title='Native Manchester']")
        public WebElement nativeManchesterSpan;

        @FindBy(xpath = "//button[@id='tabs-199-tab-4' and @aria-selected='true']")
        public WebElement pricesButton;

        @FindBy(xpath = "//span.Icon_s__dDarH.rotate-90 svg")
        public WebElement iconSpan;

        @FindBy(xpath = "//button[@aria-controls='aria-controls']")
        public WebElement infoButton;

        @FindBy(xpath = "//button[@id='tabs-247-tab-3' and @aria-selected='false' and contains(text(),'Reviews')]")
        public WebElement reviewsButton;

        @FindBy(xpath = "//select[@id='sorting-selector']")
        public WebElement sortingSelector;
        @FindBy(css = "span.truncate.pl-2:contains('Map')")
        public WebElement mapSpan;
        // ------------------------------------------------------------------------------------
        @FindBy(xpath = "//input[@autocorrect='off']")
        public WebElement destination;
        @FindBy(xpath = "//input[@data-testid='search-form-destination']")
        public WebElement destinationButton;
        @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkin']")
        public WebElement checkInClick;
        @FindBy(xpath = "//button[@data-testid='search-form-calendar-checkout']")
        public WebElement checkOutClick;
        @FindBy(xpath = "//button[@name='property_type']")
        public WebElement propertyType;
        @FindBy(xpath = "//li[@data-testid='accommodation-type-filter-entire house / apartment']")
        public WebElement entireHouseCheckbox;
        @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
        public WebElement applyButton;
        @FindBy(xpath = "//button[@data-testid='item-name']")
        public WebElement firstHouseTitle;
        @FindBy(xpath = "//span[@data-testid='price-label']")
        public WebElement priceTravel;
        @FindBy(xpath = "(//button[@role='tab'])[1]")
        public WebElement overview;
        @FindBy(xpath = "//article[@data-testid='amenities-module']")
        public WebElement topAmenities;
    }