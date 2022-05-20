package au.com.carsguide.steps;

import au.com.carsguide.pages.CarsguidePage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().ClickOnbuysell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().ClickOnSerchCar();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String text) {
        Assert.assertEquals("",text,new CarsguidePage().VerifyNewUsedCarSearch());
    }
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String maketext) throws InterruptedException {
        Thread.sleep(2000);
        new CarsguidePage().selectAnyMake(maketext);
    }
    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String modelText) {
        new CarsguidePage().selectmodels(modelText);
    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String locationtext) {
        new CarsguidePage().selectLocations(locationtext);
    }
    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String pricetext) {
        new CarsguidePage().selectPrice(pricetext);
    }
    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new CarsguidePage().ClickOnFindMyCart();
    }
    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String text2) {
        Assert.assertTrue("",new CarsguidePage().VerifyMakesMessage().contains(text2));
    }
    @And("^I click Used link$")
    public void iClickUsedLink() {
        new HomePage().ClickOnUsed();
    }
}
