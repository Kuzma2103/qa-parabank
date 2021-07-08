package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.TransferFundsPage;

public class TransferFundsTest extends BaseTestWithLogin {

    public TransferFundsPage transferFundsPage;

    @Test
    public void transferFundsTest() throws InterruptedException {
        transferFundsPage = new TransferFundsPage(driver);
        transferFundsPage.userTransferFunds();

        try {
            transferFundsPage.verifyUserTransferFunds();
            System.out.print("Transfer is complete.");
        } catch (Exception e) {
            Assert.fail("Transfer is not complete.");
        }
    }
}
