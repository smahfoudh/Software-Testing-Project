package StepDefinitions;

import Pages.*;
import java.lang.String;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions extends AbsStepDefinitions{

//we test login feature here

    @Given("Username is filled with {String}")
    public void UsernameIsFilledWithString(String username){loginPage.fillField(LoginPage.USERNAME, username);}

    @And("Password is filled with {String}")
    public void PasswordIsFilledWithString(String password){loginPage.fillField(LoginPage.PASSWORD, password);}

    @When("Login button is clicked")
    public void LoginButtonIsClicked(){
        LoginPage.clickLoginButton();
        inventoryPage.loadProductPage();
    }

    @Then("Product page is opened")
    public void ProductPageIsOpened() {Assert.assertEquals(driver.getCurrentUrl(), ProductPage.PAGE_URL);}


}
