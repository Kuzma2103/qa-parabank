package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;

public class FailLoginTest extends BaseTest {

    public HomePage homePage;

    @Test
    public void failLoginTest() {
        homePage = new HomePage(driver);

        homePage.failLogin();

        try {
            homePage.verifyFailLogin();
            System.out.println("The user has fail to log in.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
