package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ProductPage {
    //product or inventory page web elements here


    public static final String URL= "https://www.saucedemo.com/inventory.html"; //our page url

    private WebDriver driver; //our web driver

    /**
     * our ProductPage constructor
     * @param driver  web driver that is used to load the page.
     */
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //loading our page web elements
    public void loadProductPage(){PageFactory.initElements(driver, this);}

    /**
     * The method that returns the field we wish to retrieve using the locator.
     * @param locator the By locator for the field to retrieve.
     * @return the field we wish to retrieve using the locator.
     */
    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    /**
     * The method used to fill out text fields.
     * @param locator the By locator for the field to be filled.
     * @param value the string value being filled in the field found by the locator.
     */
    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value);
    }

    //-----------------------------------


    //The web element for the cart button.
    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCart;

    //The web element for the checkout button.
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkoutButton;

    //side menu button web element.
    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement menuButton;

    //reset app state button web element.
    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    private WebElement resetAppStateButton;

    //The web element for firstname when filling checkout form
    public static final By FIRSTNAME = By.id("first-name");

    //The web element for lastname when filling checkout form
    public static final By LASTNAME = By.id("last-name");

    //The web element for zipcode when filling checkout form
    public static final By ZIPCODE = By.id("postal-code");

     //The web element for  adding sauce labs backpack to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addBackpackButton;

    //The web element for adding Sauce Labs Bike Light to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addBikeLightButton;

    //The web element for adding Sauce Labs Bolt T-Shirt to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addBoltTshirtButton;

    //The web element for adding Sauce Labs Fleece Jacket to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement addFleeceJacketButton;

    //The web element for adding Sauce Labs Onesie to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement addOnesieButton;

    //The web element for adding Test.allTheThings() T-Shirt (Red) to cart button.
    @FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement addRedTshirtButton;

    //The web element for continue button.
    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continueButton;

    //total value web element
    @FindBy(xpath = "//div[@class=\"summary_total_label\"]")
    private WebElement totalLabel;

    //error msg for wrong information on checkout page
    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    private WebElement errorMsgCheckout;

    //web element of all items button from side menu
    @FindBy(xpath = "//*[@id='inventory_sidebar_link']")
    private WebElement allItemsButton;

    //web element of about button
    @FindBy(xpath = "//*[@id='about_sidebar_link']")
    private WebElement aboutButton;

    //web element of logout button
    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logoutButton;

    //web element for cart badge
    @FindBy(xpath = "//*[class=\"shopping_cart_badge\"]")
    private WebElement cartBadge;


    //web element of reset button



    //------------------------------
    //clicking on items, web elements:

    //opening shopping cart
    public void clickOnCart(){
        shoppingCart.click();
    }

    //adding Backpack to cart button.
    public void clickAddBackpackButton(){
        addBackpackButton.click();
    }

    //adding Bike Light to cart button.
    public void clickAddBikeLightButton(){
        addBikeLightButton.click();
    }

    //adding Bolt Tshirt to cart button.
    public void clickAddBoltTshirtButton(){
        addBoltTshirtButton.click();
    }

    //adding Fleece Jacket to cart button.
    public void clickAddFleeceButton(){
        addFleeceJacketButton.click();
    }

    //adding the Onesie to cart button.
    public void clickAddOnesieButton(){
        addOnesieButton.click();
    }

    //adding Test.allTheThings() T-Shirt (Red) to cart button.
    public void clickAddAllThingsShirtButton(){
        addRedTshirtButton.click();
    }

    //clicking checkout button
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    //clicking continue button
    public void clickContinueButton(){
        continueButton.click();
    }


    //testing
    //public String getTotalFixed(String test){
      //  String testing = totalLabel.getText().toString();

   // String test=totalLabel.getText().replace("Total:","");
    //}
    //getting the text from the total web element
    public String getTotal(){return totalLabel.getText().replace("Total:","");
    }


    //clicking on the menu button web element.
    public void clickMenuButton(){menuButton.click();}

    //clicking on reset app state web element.
    public void clickReset(){
        resetAppStateButton.click();
    }

    // getting the Error Message from the checkout page info error
    public String getCheckoutErrorMsg(){
        return errorMsgCheckout.getAttribute("innerText");
    }

    //clicking the all items option from the side menu
    public void clickAllItemsOption(){
        allItemsButton.click();
    }

    //clicking the all items option from the side menu
    public void clickAboutOption(){ aboutButton.click();}

    //clicking on the logout button from the side menu
    public void clickLogoutOption(){ logoutButton.click();}

    //method to check whether the cart has an item icon or not, then returns true or false
    public boolean findIcon(){ //inspected the element to get the path
        List<WebElement> checkElements = driver.findElements(By.cssSelector("div.page_wrapper div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) a.shopping_cart_link > span.shopping_cart_badge"));
            if(checkElements.isEmpty()){
                return false;
            }else{
                return true;
            }
    }

}
