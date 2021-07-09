package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void waitElementVisibility(By elementRef) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementRef));
    }

    public void click(By elementRef) {
        waitElementVisibility(elementRef);
        driver.findElement(elementRef).click();
    }

    public String readText(By elementRef) {
        waitElementVisibility(elementRef);
        return driver.findElement(elementRef).getText();
    }

    public void writeText(By elementRef, String text) {
        waitElementVisibility(elementRef);
        driver.findElement(elementRef).clear();
        driver.findElement(elementRef).sendKeys(text);
    }

    public void assertStringEquals(String elementText, String expectedText) {
        Assert.assertEquals(elementText, expectedText);
    }
}
