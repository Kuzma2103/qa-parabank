package pages;

import methods.LoginMethod;
import methods.LogoutMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginMethod loginMethod;
    public LogoutMethod logoutMethod;

    public HomePage login() {
        loginMethod = new LoginMethod(driver);
        loginMethod.login(
                PropertyManager.getUserData().getUsername(),
                PropertyManager.getUserData().getPassword()
        );
        return this;
    }

    public HomePage logout() {
        logoutMethod = new LogoutMethod(driver);
        logoutMethod.logout();
        return this;
    }

    public HomePage verifyLogin() {
        loginMethod = new LoginMethod(driver);
        loginMethod.validateLogin("Accounts Overview");
        return this;
    }

    public HomePage verifyLogout() {
        logoutMethod = new LogoutMethod(driver);
        logoutMethod.verifyLogout("Forgot login info?");
        return this;
    }
}
