package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;



public class TransferFundsMethod extends BasePage {

    public TransferFundsMethod(WebDriver driver) {
        super(driver);
    }

    By transferFundsBy = By.xpath("//a[text()='Transfer Funds']");
    By amountBy = By.id("amount");
    By transferButtonBy = By.xpath("//input[@type='submit'][@value='Transfer']");

    By messageBy = By.xpath("//h1[@class='title']");

    public TransferFundsMethod transferFunds() throws InterruptedException {
        click(transferFundsBy);
        Thread.sleep(2000);
        writeText(amountBy, "1000");
        click(transferButtonBy);
        Thread.sleep(2000);
        return this;
    }

    public TransferFundsMethod verifyTransferFunds(String expectedText) {
        String message = readText(messageBy);
        assertStringEquals(message, expectedText);
        return this;
    }
}
