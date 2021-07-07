package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class OpenNewAccountMethod extends BasePage {

    public OpenNewAccountMethod(WebDriver driver){
        super(driver);
    }

    By openAccountBy = By.xpath("//a[text()='Open New Account']");
    By typeBy = By.id("type");
    By openNewAccountButtonBy = By.xpath("//input[@type='submit'][@value='Open New Account']");
    By titleBy = By.xpath("//h1[@class='title'][text()='Account Opened!']");



    public OpenNewAccountMethod openUserAccount() throws InterruptedException {
        click(openAccountBy);
        Select type = new Select(driver.findElement(typeBy));
        type.selectByValue("1");
        Thread.sleep(2000);
        click(openNewAccountButtonBy);
        return this;
    }

    public OpenNewAccountMethod verifyOpenAccount(String expectedText) {
        String title = readText(titleBy);
        assertStringEquals(title, expectedText);
        return this;
    }
}
