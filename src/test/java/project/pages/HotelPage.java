package project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage {


    @FindBy(xpath = "//span[@title='Hotel Adlon Kempinski Berlin']")
    public WebElement clickHotelAldonBerlin;


    @FindBy(xpath = "//button[@class='group w-full h-full inset-0 absolute cursor-pointer']")
    public WebElement clickHotelInfo;


    @FindBy(xpath = "//div[@class='table w-full']")
    public WebElement hotelTopAmenitiesList;


    @FindBy(xpath = "//button[@data-testid='toggle-all-amenities']")
    public WebElement clickToOpenAmenitiesList;

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

    @FindBy(xpath = "//button[@aria-selected='true']")
    public WebElement reviews;

    @FindBy(xpath = "//select[@id='sorting-selector']")
    public WebElement sortingDropdown;

    @FindBy(xpath = "//option[@value='0']")
    public WebElement sortByOurRecommendation;

    @FindBy(xpath = "//option[@value='6']")
    public WebElement sortByRatingAndRecommended;

    @FindBy(xpath = "//option[@value='4']")
    public WebElement sortByPriceAndRecommended;

    @FindBy(xpath = "//option[@value='5']")
    public WebElement sortByDistanceAndRecommended;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement sortByPriceOnly;

    @FindBy(xpath = "//option[@value='3']")
    public WebElement sortByRatingOnly;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement sortByDistanceOnly;

    @FindBy(xpath = "//span[@class='text-s whitespace-nowrap'][1]")
    public WebElement sortedResult;






}
