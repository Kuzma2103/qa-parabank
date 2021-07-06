package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class LogoutTest extends BaseTestWithLogin {
    public HomePage homePage;

    @Test
    public void logout() {
        homePage = new HomePage(driver);

        homePage.logout();

        try {
            homePage.verifyLogout();
            System.out.print("User is logged out.");
        } catch (Exception e) {
            Assert.fail("User is not logged out.");
        }
    }
}
