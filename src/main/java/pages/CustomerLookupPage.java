package pages;

import methods.ForgotLoginMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

import java.util.ArrayList;

public class CustomerLookupPage extends BasePage {

    public CustomerLookupPage(WebDriver driver) {
        super(driver);
    }

    public ForgotLoginMethod method;

    public CustomerLookupPage findUserInfo() {
        method = new ForgotLoginMethod(driver);
        method.forgotLoginForExistUser(
                PropertyManager.getInstance().getFirstName(),
                PropertyManager.getInstance().getLastName(),
                PropertyManager.getInstance().getAddress(),
                PropertyManager.getInstance().getCity(),
                PropertyManager.getInstance().getState(),
                PropertyManager.getInstance().getZipCode(),
                PropertyManager.getInstance().getSSN()
        );
        return this;
    }

    public CustomerLookupPage findNonExistUserInfo(ArrayList<String> userData) {
        method = new ForgotLoginMethod(driver);
        method.forgotLoginForNonExistUser(userData);
        return this;
    }


    // Verifications methods

    public CustomerLookupPage verifyCorrectUserInfo() {
        method = new ForgotLoginMethod(driver);
        method.verifyCorrectUserInfo("Your login information was located successfully. You are now logged in.");
        return this;
    }

    public CustomerLookupPage verifyWrongUserInfo() {
        method = new ForgotLoginMethod(driver);
        method.verifyNonExistUserInfo("The customer information provided could not be found.");
        return this;
    }
}
