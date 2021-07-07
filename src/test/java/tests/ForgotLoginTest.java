package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CustomerLookupPage;

import java.util.ArrayList;

public class ForgotLoginTest extends BaseTest {

    public CustomerLookupPage customer;
    ArrayList<String> userData = new ArrayList<>();

    @Test
    public void forgotLoginForExistUser() {
        customer = new CustomerLookupPage(driver);
        customer.findUserInfo();

        try {
            customer.verifyCorrectUserInfo();
            System.out.print("The correct user info is presented.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }

    @Test
    public void forgotLoginForNonExistUser() {
        customer = new CustomerLookupPage(driver);
        customer.findNonExistUserInfo(userData);

        try {
            customer.verifyWrongUserInfo();
            System.out.print("The customer info could not be found.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
