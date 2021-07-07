package pages;

import methods.OpenNewAccountMethod;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountMethod method;

    public AccountPage openAccount() throws InterruptedException {
        method = new OpenNewAccountMethod(driver);
        method.openUserAccount();
        return this;
    }

    public AccountPage openAccountVerification() {
        method = new OpenNewAccountMethod(driver);
        method.verifyOpenAccount("Account Opened!");
        return this;
    }
}
