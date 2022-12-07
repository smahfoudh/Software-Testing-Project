package StepDefinitions;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;


/**  step defintions and webdriver setup will be here **/

public abstract class AbsStepDefinitions {

    private static final int WAIT_TIME = 50; //waiting for the loading of elements
    static WebDriver driver;
    protected static LoginPage loginPage;
    protected static InventoryPage inventoryPage;

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true); //we won't see the browser
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

    }

}
