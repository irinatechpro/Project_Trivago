package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(xpath = "//input[@data-testid='email-input']")
    public WebElement insertUsername;

    @FindBy(xpath = "//input[@data-testid='password-strength-input']")
    public WebElement insertPassword;

    @FindBy(xpath = "//button[@data-testid='login-submit']")
    public WebElement clickToLogin;

}
