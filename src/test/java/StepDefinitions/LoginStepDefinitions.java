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

    @Given("homepage is open")
    public void theHomepageIsOpen() {
        loginPage.loadPage();
    }

    @Given("Username is filled with {string}")
    public void UsernameIsFilledWithString(String username){loginPage.fillField(LoginPage.USERNAME, username);}

    @And("Password is filled with {string}")
    public void PasswordIsFilledWithString(String password){loginPage.fillField(LoginPage.PASSWORD, password);}

    @When("Login button is clicked")
    public void LoginButtonIsClicked(){
        loginPage.clickLoginButton();
        productPage.loadProductPage();
    }

    @Then("Product page is opened")
    public void ProductPageIsOpened() {Assert.assertEquals(driver.getCurrentUrl(), ProductPage.URL);}



}
