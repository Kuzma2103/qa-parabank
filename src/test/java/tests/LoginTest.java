package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {
    public HomePage homePage;

    @Test
    public void login() {
        homePage = new HomePage(driver);
        homePage.login();

        try {
            homePage.verifyLogin();
            System.out.print("User is logged in.");
        } catch (Exception e) {
            Assert.fail("User is not logged in.");
        }

    }
}
