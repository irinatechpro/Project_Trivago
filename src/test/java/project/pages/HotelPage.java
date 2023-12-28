package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage  extends BasePage{

    @FindBy(xpath = "(//button[@data-testid='item-name'])[1]")
    public WebElement randomHotel;

    @FindBy(xpath = "(//span[@class='inline-flex leading-none transform stroke-current flex-shrink-0 ml-3'])[2]")
    public WebElement showAllPrices;

    @FindBy(xpath = "(//button[@type='button'])[26]")
    public WebElement infoAmenities;

    @FindBy(xpath = "(//button[@class='bg-white text-s font-bold px-3 leading-none h-8 border rounded-xs border-grey-700 hover:text-white hover:bg-grey-700'])[3]")
    public WebElement showAmenities;


    @FindBy(xpath = "(//span[@data-testid='popular-badge'])[1]")
    public WebElement popularChoice;

    @FindBy(xpath = "(//span[@class='leading-normal truncate -mr-3 text-l'])[7]")
    public WebElement viewDeal;
    @FindBy(xpath = "(//span[@class='e4adce92df'])[8]")
    public WebElement seeAvailability;
     @FindBy(xpath = "//button[@id='tabs-515-tab-0']")
    public WebElement overview;

    @FindBy(xpath = "//button[@id='tabs-515-tab-1']")
    public WebElement info;

   @FindBy(xpath = "//button[@id='tabs-515-tab-2']")
    public WebElement photos;

   @FindBy(xpath = "//button[@aria-selected='true']") //*[@id="tabs-187-tab-3"]
    public WebElement reviews;



}
