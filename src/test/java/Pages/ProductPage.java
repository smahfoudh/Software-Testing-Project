package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    //product or inventory page web elements here


    public static final String URL= "https://www.saucedemo.com/inventory.html"; //our page url

    private WebDriver driver; //our webdriver

    /**
     * our ProductPage constructor
     * @param driver  web driver that is used to load the page.
     */
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //loading our page webelements
    public void loadProductPage(){PageFactory.initElements(driver, this);}

    /**
     * The method that returns the field we wish to retrieve using the locator of said field.
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




}
