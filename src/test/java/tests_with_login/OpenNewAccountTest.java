package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;

public class OpenNewAccountTest extends BaseTestWithLogin {

    public AccountPage accountPage;

    @Test
    public void openAccount() {
        accountPage = new AccountPage(driver);
        accountPage.openAccount();
        try {
            accountPage.openAccountVerification();
            System.out.print("The new account is open.");
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
