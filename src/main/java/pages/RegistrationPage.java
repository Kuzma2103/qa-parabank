package pages;

import methods.RegistrationMethod;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

import java.util.ArrayList;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationMethod registrationMethod;

    public RegistrationPage registration(ArrayList<String> registerData) {
        registrationMethod = new RegistrationMethod(driver);
        registrationMethod.registerUser(registerData);
        return this;
    }

    public RegistrationPage validateRegistration()  {
        registrationMethod = new RegistrationMethod(driver);
        registrationMethod.validateRegister("Log Out");
        return this;
    }
}
