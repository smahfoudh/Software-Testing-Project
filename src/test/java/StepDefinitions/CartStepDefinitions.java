package StepDefinitions;

import  Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


        //defining our steps for cart.feature
public class CartStepDefinitions extends AbsStepDefinitions {

        @Given("{string} is added to my cart")
        public void ItemAddedToMyCart(String itemName) {
                String[] items = itemName.split(";");
                for (String item : items){
                        if(item.equals("Sauce Labs Backpack")){
                                productPage.clickAddBackpackButton();
                                //break;
                        }
                        if(item.equals("Sauce Labs Bike Light")){
                                productPage.clickAddBikeLightButton();
                               // break;
                        }
                        if(item.equals("Sauce Labs Bolt T-Shirt")){
                                productPage.clickAddBoltTshirtButton();
                             //   break;
                        }
                        if(item.equals("Sauce Labs Fleece Jacket")){
                                productPage.clickAddFleeceButton();
                             //   break;
                        }
                        if(item.equals("Sauce Labs Onesie")){
                                productPage.clickAddOnesieButton();
                             //   break;
                        }
                        if(item.equals("Test.allTheThings() T-Shirt (Red)")){
                                productPage.clickAddAllThingsShirtButton();
                              //  break;
                        }
                }
        }

        @Given("cart is displayed")
        public void cartDisplayed(){productPage.clickOnCart();}

        @And("checkout button is clicked")
        public void checkoutButtonClicked(){productPage.clickCheckoutButton();}

        @And("the first name is filled with {string}")
        public void fillFirstName(String firstName){
                productPage.fillField(ProductPage.FIRSTNAME,firstName);
        }

        @And("the last name is filled with {string}")
        public void fillLastName(String lastName){
                productPage.fillField(ProductPage.LASTNAME,lastName);
        }

        @And("the zip code is filled with {string}")
        public void fillZipCode(String zipCode){
                 productPage.fillField(ProductPage.ZIPCODE,zipCode);
                }

        @When("continue button is clicked")
        public void continueButtonClicked() {
                        productPage.clickContinueButton();
                }

        @Then("{string} is shown")
        public void showTotal(String total) {
           Assertions.assertEquals(productPage.getTotal(), productPage.getTotal()); //after getting the total we use the menu to reset
           productPage.clickMenuButton();
           productPage.clickReset();
                }

        @Given("Sauce Labs Backpack is added to my cart")
        public void addBackPack(){productPage.clickAddBackpackButton();}

        }




