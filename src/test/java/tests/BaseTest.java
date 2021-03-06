package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public ChromeOptions options;

    @Before
    public void setup() {
        options = new ChromeOptions();

        // Disable the browser notifications and pop ups
        options.addArguments("--disable-notifications");

        // Load the webdriver
        System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getUrl());
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
