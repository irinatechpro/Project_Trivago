package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project.utilities.Driver;

public class HousePage {

    public HousePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Native Manchester']")
    public WebElement nativeManchesterSpan;

    @FindBy(xpath = "//button[@id='tabs-199-tab-4' and @aria-selected='true']")
    public WebElement pricesButton;
   // @FindBy(xpath = "//span[contains(@class, 'Icon_s__dDarH') and contains(@class, 'rotate-90')]/svg]")
   @FindBy(xpath = "//span.Icon_s__dDarH.rotate-90 svg")
    public WebElement iconSpan;
   // <span class="leading-none inline-flex Icon_s__dDarH rotate-90 transform transform align-middle mr-1" aria-hidden="true"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" class="pointer-events-none max-h-full max-w-full"><g fill="none" stroke="currentColor" stroke-linecap="round" stroke-miterlimit="10" stroke-width="2"><path vector-effect="non-scaling-stroke" d="M10 17l5-5M10 7l5 5"></path></g></svg></span>
}
