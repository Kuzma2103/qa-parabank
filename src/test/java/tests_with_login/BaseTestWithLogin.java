package tests_with_login;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTestWithLogin {

    public WebDriver driver;
    public ChromeOptions options;
    public HomePage homePage;

    @Before
    public void setup() throws InterruptedException {
        options = new ChromeOptions();

        // Disable browser notifications
        options.addArguments("--disable-notifications");

        // Load driver
        System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getUrl());

        homePage = new HomePage(driver);
        homePage.login();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
