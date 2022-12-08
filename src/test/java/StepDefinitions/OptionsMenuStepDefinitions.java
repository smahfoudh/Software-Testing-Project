package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

//testing the side options menu feature file
public class OptionsMenuStepDefinitions extends AbsStepDefinitions{

    @And("Options menu is clicked")
    public void optionsMenuClicked(){productPage.clickMenuButton();}

    @When("All items option is clicked")
    public void allItemsClicked(){productPage.clickAllItemsOption();}


    @When("About option is clicked")
    public void AboutOptionClicked(){productPage.clickAboutOption();}

    @Then("About page is displayed")
    public void AboutPageDisplayed(){Assert.assertEquals(driver.getCurrentUrl(), "https://saucelabs.com/");}

    @When("Logout option is clicked")
    public void LogoutOptionClicked(){productPage.clickLogoutOption();}

    @Then("Login page is displayed")
    public void LoginPageDisplayed(){Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");}

    @And("Cart has an icon")
    public void cartHasIcon(){Assert.assertTrue(productPage.findIcon());}

    @When("Reset app state is clicked")
    public void resetAppStateClicked(){productPage.clickReset();}

    @Then("Cart has no icon")
    public void cartHasNoIcon(){Assert.assertFalse(productPage.findIcon());}

}
