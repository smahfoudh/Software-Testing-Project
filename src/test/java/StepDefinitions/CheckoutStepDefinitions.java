package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;


//class for checkout.feature file
public class CheckoutStepDefinitions extends AbsStepDefinitions {


    @Then("checkout overview page is displayed")
    public void checkoutOverviewDisplayed(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
    }

    @Then("{string} is displayed")
    public void errorMsgDisplayed(String message){
        Assert.assertEquals(message, productPage.getCheckoutErrorMsg());
    }
}
