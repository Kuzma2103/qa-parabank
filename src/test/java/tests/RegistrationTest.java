package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.RegistrationPage;
import utilities.PropertyManager;

import java.util.ArrayList;

public class RegistrationTest extends BaseTest {

    public RegistrationPage registrationPage;
    ArrayList<String> registerData = new ArrayList<>();

    @Test
    public void registrationTest() {
        registrationPage = new RegistrationPage(driver);

        registrationPage.registration(registerData);

        try {
            registrationPage.validateRegistration();
            System.out.print("User is registered.");

            // Write properties to the configuration.properties file
            PropertyManager.setProperty("firstName", registerData.get(0));
            PropertyManager.setProperty("lastName", registerData.get(1));
            PropertyManager.setProperty("address", registerData.get(2));
            PropertyManager.setProperty("city", registerData.get(3));
            PropertyManager.setProperty("state", registerData.get(4));
            PropertyManager.setProperty("zipCode", registerData.get(5));
            PropertyManager.setProperty("ssn", registerData.get(7));
            PropertyManager.setProperty("userName", registerData.get(8));
            PropertyManager.setProperty("password", registerData.get(9));
        } catch (Exception e) {
            Assert.fail("Something went wrong.");
        }
    }
}
