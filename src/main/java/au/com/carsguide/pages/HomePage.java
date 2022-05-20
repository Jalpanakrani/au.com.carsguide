package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyandsell;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement serchcar;

    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement used;

    public void ClickOnbuysell(){
        mouseHoverToElement(buyandsell);
        log.info("mousehover on buy and sell "+ buyandsell.toString()+ "<br>");
    }

    public void ClickOnSerchCar(){
        clickOnElement(serchcar);
        log.info("Clicking on serch car"+ serchcar.toString()+ "<br>");
    }

    public void ClickOnUsed(){
        clickOnElement(used);
        log.info("Clicking on used"+ used.toString()+ "<br>");
    }

}