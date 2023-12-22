package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//button[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//button[@data-testid='header-login']")
    public WebElement clickLoginButton;

    @FindBy(xpath = "//button[@data-testid='header-profile-menu']")
    public WebElement clickProfileMenuButton;

    @FindBy(xpath = "//li[@class='h-12 flex '][1]")
    public WebElement clickAccountSettings;


    @FindBy(xpath = "//button[@data-testid='header-logout']")
    public WebElement clickLogout;



}
