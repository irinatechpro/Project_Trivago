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


    @FindBy(xpath = "//input[@class='PriceInput_input__KBE9v']")
    public WebElement setMaxPriceRange;

    @FindBy(xpath = "//span[@class='truncate w-full']")
    public WebElement clickPriceFilterInput;

    @FindBy(xpath = "//button[@data-testid='filters-popover-apply-button']")
    public WebElement priceFilterApplyButton;






}
