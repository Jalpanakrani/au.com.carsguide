package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CarsguidePage extends Utility {
    private static final Logger log = LogManager.getLogger(CarsguidePage.class.getName());

    public CarsguidePage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newuserdcartext;
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anymake;
    @FindBy(xpath = "//select[@id='models']")
    WebElement models;
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locations;
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findmycar;
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement makemessage;


    public String VerifyNewUsedCarSearch() {
        Reporter.log("getting  text from New & Used Car Search " + newuserdcartext.toString() + "<br>");
        return getTextFromElement(newuserdcartext);
    }

    public void selectAnyMake(String anymaketext) {
        selectByVisibleTextFromDropDown(anymake,anymaketext);
        log.info("Selecting anymake"+anymaketext +" from dropdown "+anymake.toString() + "<br>");
    }
    public void selectmodels (String modelstext) {
        selectByVisibleTextFromDropDown(models,modelstext);
        log.info("Selecting models "+ modelstext+" from dropdown "+models.toString() + "<br>");
    }
    public void selectLocations (String locationstext ) {
        selectByVisibleTextFromDropDown(locations,locationstext);
        log.info("Selecting "+locationstext+" from dropdown "+locations.toString() + "<br>");
    }
    public void selectPrice (String  pricetext) {
        selectByVisibleTextFromDropDown(price,pricetext);
        log.info("Selecting Price "+pricetext +" from dropdown "+price.toString() + "<br>");
    }
    public void ClickOnFindMyCart(){
        clickOnElement(findmycar);
        log.info("Clicking on find my car"+ findmycar.toString()+ "<br>");
    }
    public String VerifyMakesMessage() {
        log.info("getting  text from makes "+makemessage.toString()+"<br>");
        return getTextFromElement(makemessage);
    }


}