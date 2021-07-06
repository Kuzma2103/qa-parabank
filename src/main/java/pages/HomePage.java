package pages;

import methods.LoginMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginMethod loginMethod = new LoginMethod(driver);

    public HomePage login() {
        loginMethod.login(
                PropertyManager.getUserData().getUsername(),
                PropertyManager.getUserData().getPassword()
        );
        return this;
    }

    public HomePage verifyLogin() {
        loginMethod.validateLogin("Accounts Overview");
        return this;
    }
}
