package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.RequestLoanPage;

public class RequestLoanTest extends BaseTestWithLogin {

    public RequestLoanPage requestLoanPage;

    @Test
    public void requestLoanTest() throws InterruptedException {
        requestLoanPage = new RequestLoanPage(driver);
        requestLoanPage.requestLoan();

        try {
            requestLoanPage.verifyRequestLoan();
            System.out.print("Loan request is in process.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
