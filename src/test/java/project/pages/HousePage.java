package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.Driver;

public class HousePage {
    public HousePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@data-testid='uc-accept-all-button']")
    public WebElement cockes;

    @FindBy(xpath = "//button[@class='SearchButtonWithLoader_button___1Bps']")
    public WebElement clickSearchButton;

}
