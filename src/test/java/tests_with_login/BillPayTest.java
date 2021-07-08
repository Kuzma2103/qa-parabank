package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.BillPayPage;

import java.util.ArrayList;

public class BillPayTest extends BaseTestWithLogin {

    public BillPayPage billPayPage;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void billPay() {
        billPayPage = new BillPayPage(driver);
        billPayPage.payBill(userData);

        try {
            billPayPage.verifyPayBill();
            System.out.print("Bill Payment Complete.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
