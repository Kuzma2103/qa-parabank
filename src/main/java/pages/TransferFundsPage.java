package pages;

import methods.TransferFundsMethod;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage extends BasePage {

    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsMethod method;

    public TransferFundsPage userTransferFunds() throws InterruptedException {
        method = new TransferFundsMethod(driver);
        method.transferFunds();
        return this;
    }

    public TransferFundsPage verifyUserTransferFunds() {
        method = new TransferFundsMethod(driver);
        method.verifyTransferFunds("Transfer Complete!");
        return this;
    }
}
