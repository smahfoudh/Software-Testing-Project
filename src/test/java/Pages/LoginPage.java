package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //here we have all web elements of our login page

    private WebDriver driver;
    private static final String URL="https://www.saucedemo.com/";

    public static final By USERNAME = By.id("user-name"); //username webelement
    public static final By PASSWORD = By.id("password"); //password webelement

    @FindBy(id = "login-button") //login button webelement
    private WebElement loginButton;

    @FindBy(xpath = "//h3") //error msg webelement
    private WebElement loginErrorMsg;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    } //our constructor with web driver

    public void loadPage() { //open webpage with driver,load elements
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    /**
     * Method returning the field we are retrieving using the locator.
     * @param locator By locator for the field.
     * @return the field we are retrieving, uses locator.
     */
    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void fillField(By locator, String value) {
        getField(locator).sendKeys(value); //fills text fields, locator to be filled and string to be filled in
    }

    public void clickLoginButton(){
        loginButton.click();
    }






}
