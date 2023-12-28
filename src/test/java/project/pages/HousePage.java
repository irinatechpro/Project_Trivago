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

        @FindBy(xpath = "//button[@class='bg-white text-s font-bold px-3 leading-none h-8 border rounded-xs border-grey-700 hover:text-white hover:bg-grey-700']")
        public WebElement infoButton;


        @FindBy(xpath = "//button[@id='tabs-247-tab-3' and @aria-selected='false' and contains(text(),'Reviews')]")
        public WebElement reviewsButton;

        @FindBy(xpath = "//select[@id='sorting-selector']")
        public WebElement sortingSelector;
        @FindBy(css = "span.truncate.pl-2:contains('Map')")
        public WebElement mapSpan;

    }

